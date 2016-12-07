//Injectamos el twitterService dentro del controlador
app.controller('TwitterController', function($scope, twitterService) {

    $scope.tweets=[]; //array de tweets

    twitterService.initialize();

    //Usando la autorizacion OAuth resulta obtener los 20 tweets
    $scope.refreshTimeline = function(maxId) {
        twitterService.getLatestTweets(maxId).then(function(data) {
            $scope.tweets = $scope.tweets.concat(data);
        },function(){
            $scope.rateLimitError = true;
        });
    }

    //Click a button lanza el popup de autorizacion
    $scope.connectButton = function() {
        twitterService.connectTwitter().then(function() {
            if (twitterService.isReady()) {
                //Autorizacion correcta trae los tweets
                $('#connectButton').fadeOut(function(){
                    $('#getTimelineButton, #signOut').fadeIn();
                    $scope.refreshTimeline();
                    $scope.connectedTwitter = true;
                });
            } else {

			         }
        });
    }

    //Salir de la apliación
    $scope.signOut = function() {
        twitterService.clearCache();
        $scope.tweets.length = 0;
        $('#getTimelineButton, #signOut').fadeOut(function(){
            $('#connectButton').fadeIn();
            $scope.$apply(function(){$scope.connectedTwitter=false})
        });
        $scope.rateLimitError = false;    
    }

    //Si el usuario regresa, oculta el logeo y muestra los tweets
    if (twitterService.isReady()) {
        $('#connectButton').hide();
        $('#getTimelineButton, #signOut').show();
     	$scope.connectedTwitter = true;
        $scope.refreshTimeline();
    }

});
