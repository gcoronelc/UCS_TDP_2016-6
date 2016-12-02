Connection cn = null;
try {
  // Paso 1: Inicio de Tx
  cn = AccesoDB.getConnection();
  cn.setAutoCommit(false);
  // Paso 2: 
  
  
  
  // Paso n: Confirmar Tx
  cn.commit();
} catch (Exception e) {
  // Cancela transacción
  try{
	cn.rollback();
  }catch(Exception e1){
  }
  // Propaga el error
  throw new RuntimeException(e.getMessage());
} finally{
  try {
	cn.close();
  } catch (Exception e) {
  }
}