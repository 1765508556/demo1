package selenium_demo1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class demo8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  //   FileHandler.copy(new File("F:\\1"),new File("F:\\2"));//���Ƽ�¼�ļ����µ������ļ�;
		//FileHandler.copy(new File("F:\\1"),new File("F:\\2"),".txt");//���Ƽ�¼�ļ����µ�.txt���ļ�
	//	FileHandler.copy(new File("F:\\1\\1.txt"), new File("F:\\2\\2.txt"));//����ĳ���ļ�
		//FileHandler.createDir(new File("F:\\3\\1.txt"));  //����Ŀ¼
//		FileHandler.delete(new File("F:\\3"))              //ɾ��Ŀ¼
	//	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("F:\\2\\a1.txt"));   //�����ļ�
		//oos.writeObject("aaaa");      //��һ��д�뷽ʽ����������룻
	// 	FileOutputStream out=new FileOutputStream("F:\\2\\a1.txt");    //�����ļ�
//		String str="cccc";
//		byte[] b=str.getBytes();                                 
//		for(int i=0;i<str.length();i++)                                    //�ڶ���д�뷽ʽ�������������
//		{
//			out.write(b[i]);
//		}
//		String file = FileHandler.readAsString(new File("F:\\1\\1.txt"));   //��ȡ�ļ�
//		System.out.println(file);

	}

}