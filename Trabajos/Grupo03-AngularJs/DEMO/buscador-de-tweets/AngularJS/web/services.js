angular.module('twitterApp.services', [])

.factory('twitterService', function($q) {

    var authorizationResult = false;

    return {
        initialize: function() {
            OAuth.initialize('19gVB-kbrzsJWQs5o7Ha2LIeX4I', {cache:true});
            authorizationResult = OAuth.create('twitter');
        },
        isReady: function() {
            return (authorizationResult);
        },
        connectTwitter: function() {
            var deferred = $q.defer();
            OAuth.popup('twitter', {cache:true}, function(error, result) {
                if (!error) {
                    authorizationResult = result;
                    deferred.resolve();
                } else {
                    //Si hay error
                    console.log(error, 'error');
                }
            });
            return deferred.promise;
        },
        clearCache: function() {
            OAuth.clearCache('twitter');
            authorizationResult = false;
        },
        getLatestTweets: function (maxId) {
            var deferred = $q.defer();
      			var url='/1.1/statuses/home_timeline.json';
      			if(maxId){
      				url+='?max_id='+maxId;
      			}
            var promise = authorizationResult.get(url).done(function(data) { 
				deferred.resolve(data);
            }).fail(function(err) {
                deferred.reject(err);
            });
            return deferred.promise;
        }
    }

});
