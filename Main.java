public class Main {

  public static void main(String[] args) {
    System.out.println("--------------------");
    System.out.println("NAMA  : JOSE FISTO");
    System.out.println("NIM   : 312010119");
    System.out.println("KELAS : TI.20.A.1");
    System.out.println("--------------------");
    System.out.println("PlayfairCipher");
    System.out.println("--------------------");
    
    
    String s0 = "JUNK FOOD AND HEALTH PROBLEMS";

    System.out.println("Input: " + s0 + "\n");

    PlayfairCipher p = new PlayfairCipher();
    String key = p.generateKey("TEKNIK INFORMATIKA");
    System.out.println("Key: " + key + "\n");

    String pencrypt = p.encryptMsg(s0, key);
    System.out.println("Encrypted: " + pencrypt + "\n");

    String pdecrypt = p.decryptMsg(pencrypt, key);
    System.out.println("Decrypted: " + pdecrypt + "\n");

  }
}
