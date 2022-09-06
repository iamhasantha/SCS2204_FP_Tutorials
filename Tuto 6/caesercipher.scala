object caeserCipher{

    val alphabet = 'A' to 'Z' // define alphabet 

    def encryption():Any={
        val scrtMsg = scala.io.StdIn.readLine("Secret Message: ") // read secret message
        val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size // characters to shift


        val encryptedMsg = scrtMsg.map((c:Char) => {

            val ch = alphabet.indexOf(c.toUpper)

            if(ch == -1) {
                c // return character if it's not in the alphabet
            }
            else {
                // return the relevant character after shifting
                alphabet((ch + shift) % alphabet.size) 
            }
        });

        println(encryptedMsg); // print encrypted message
    }
    
    def decryption():Any={
        val scrtMsg = scala.io.StdIn.readLine("Encrypted Message: ")
        val back = (alphabet.size - scala.io.StdIn.readLine("Backward By: ").toInt) % alphabet.size

        val decryptedMsg = scrtMsg.map((c:Char) => {

            val ch = alphabet.indexOf(c.toUpper)

            if(ch == -1) {
                c
            }
            else {
                // return the relevant character after backwarding
                alphabet((ch + back) % alphabet.size)
            }
        });
        println(decryptedMsg); //print the decrypted message
    }

    // select encryption or decryption
    def cipher(choice:Int):Any={
        choice match {
            case 1 => encryption()
            case 2 => decryption()
            case _ => println("Invalid input")
        }
    }

    def main(args: Array[String]) = {
            println("Cesar's cipher algorithm")
            println("1. Encrypt message")
            println("2. Decrypt message")
            val choice = scala.io.StdIn.readLine("1 or 2 : ").toInt

            cipher(choice)
    }
}
