package testOpencv;

import org.opencv.core.Core; 
import org.opencv.core.Mat;  
import org.opencv.imgcodecs.Imgcodecs;
 
public class Main {
   public static void main(String args[]) { 
      //Loading the OpenCV core library  
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME ); 
     
      //Instantiating the Imagecodecs class 
      Imgcodecs imageCodecs = new Imgcodecs(); 
     
      //Reading the Image from the file  
      String file =".\\src\\testOpencv\\lena.tif"; 
      Mat matrix = imageCodecs.imread(file); 
     
      System.out.println("Image Loaded");     
      System.out.println("channels : " + matrix.channels());
      System.out.println("rows : " + matrix.rows());
      System.out.println("cols : " + matrix.cols());
      
   } 
}