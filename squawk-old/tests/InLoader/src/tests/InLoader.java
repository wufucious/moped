package tests;

import com.sun.squawk.VM;

public class InLoader {  

    public void printString() {
    	VM.println("Hello World from ClassLoaderInput (only bytes)!\r\n");   
    	VM.println("Is it really working dynamically?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????\r\n");
    	VM.println("Oh, yes, it is\r\n");
    	VM.println("Jakob is here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\r\n");
    	VM.println("Eilert is back!\r\n");
    	VM.println("new try...");
    	VM.println("Now it should work!!\r\n");
    }

    public static void main(String[] args) {
    	VM.println("InLoader.main()\r\n");
    	InLoader cli = new InLoader();
    	cli.printString();
    	VM.println("CLI-main done\r\n");
    }
}
