//Questão 15, letra E
FileOutputStream fos = null;
try {
    fos = new FileOutputStream ("teste.txt");
    fos.write ("Hello!");
} catch (IOException ex) {
    ex.printStackTrace(); 
} finally {
    // Devemos fechar o arquivo de qualquer jeito 
    // (a menos, obviamente, que nem tenhamos conseguido abri-lo).
    if (fos != null) try { fos.close(); } catch (IOException ex) { }
}
