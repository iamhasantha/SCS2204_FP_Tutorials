object caeserCipher{
    
    val alphabet = 'A' to 'Z'

    def encryption():Any={
        val scrtMsg = scala.io.StdIn.readLine("Secret Message: ")
        val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

        val encryptedMsg = scrtMsg.map((c:Char) => {

            val ch = alphabet.indexOf(c.toUpper)

            if(ch == -1) {
                c
            }
            else {
                alphabet((ch + shift) % alphabet.size)
            }
        });

        println(encryptedMsg);
    }
    
    def decryption():Any={
        val scrtMsg = scala.io.StdIn.readLine("Encrypted Message: ")
        val shift = (scala.io.StdIn.readLine("Backward By: ").toInt + alphabet.size) % alphabet.size

        val decryptedMsg = scrtMsg.map((c:Char) => {

            val ch = alphabet.indexOf(c.toUpper)

            if(ch == -1) {
                c
            }
            else {
                alphabet((ch - shift) % alphabet.size)
            }
        });
        println(decryptedMsg);
    }

    def main(args: Array[String]) = {
    
        println("Cesar's cipher algorithm")
        println("1. Encrypt message")
        println("2. Decrypt message")
        val choice = scala.io.StdIn.readLine("1 or 2 : ").toInt
        

        if(choice == 1) encryption()
        else if(choice == 2) decryption()
        else println("Invalid input")
    }


}
