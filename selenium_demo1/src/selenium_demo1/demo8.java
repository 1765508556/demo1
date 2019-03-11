package selenium_demo1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class demo8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  //   FileHandler.copy(new File("F:\\1"),new File("F:\\2"));//复制记录文件夹下的所有文件;
		//FileHandler.copy(new File("F:\\1"),new File("F:\\2"),".txt");//复制记录文件夹下的.txt的文件
	//	FileHandler.copy(new File("F:\\1\\1.txt"), new File("F:\\2\\2.txt"));//复制某个文件
		//FileHandler.createDir(new File("F:\\3\\1.txt"));  //创建目录
//		FileHandler.delete(new File("F:\\3"))              //删除目录
	//	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("F:\\2\\a1.txt"));   //创建文件
		//oos.writeObject("aaaa");      //第一种写入方式，会出现乱码；
	// 	FileOutputStream out=new FileOutputStream("F:\\2\\a1.txt");    //创建文件
//		String str="cccc";
//		byte[] b=str.getBytes();                                 
//		for(int i=0;i<str.length();i++)                                    //第二种写入方式，不会出现乱码
//		{
//			out.write(b[i]);
//		}
//		String file = FileHandler.readAsString(new File("F:\\1\\1.txt"));   //读取文件
//		System.out.println(file);

	}

}