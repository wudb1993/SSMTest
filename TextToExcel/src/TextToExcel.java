import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TextToExcel implements KeyListener,ActionListener{


	JTextField jtOne = new JTextField();
	public static void main(String[] args) {
		
		TextToExcel tte = new TextToExcel();
		tte.tuXing();
		
	}
	
	public void tuXing(){

		//创建窗体
		JFrame frm = new JFrame();
		frm.setTitle("text转换Excel");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpOne = new JPanel();
		//设置为边界布局
		jpOne.setLayout(new FlowLayout());
		JLabel jlOne = new JLabel("选择文件");
		jtOne.setText("选择文件");
        jlOne.add(jtOne);

        jpOne.add(jlOne);
        jpOne.add(jtOne);
		JButton jbOne = new JButton("选择文件");
		jbOne.addActionListener(this);
		jpOne.add(jbOne);
		frm.add(jpOne);
		
	    frm.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFileChooser dlg = new JFileChooser();
		int result = dlg.showOpenDialog(null);  // 打开"打开文件"对话框
		// int result = dlg.showSaveDialog(this);  // 打"开保存文件"对话框
		if (result == JFileChooser.APPROVE_OPTION) {
			File fileSrc = dlg.getSelectedFile(); 
			jtOne.setText(fileSrc.getAbsolutePath());
			InputStreamReader read;
			try {
				read = new InputStreamReader(
				            new FileInputStream(fileSrc));
				BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = "";
                //第一步创建workbook  
		        HSSFWorkbook wb = new HSSFWorkbook();  
		          
		        //第二步创建sheet  
		        HSSFSheet sheet = wb.createSheet("身份证错误信息");  
		          
		        //第三步创建行row:添加表头0行  
		        HSSFRow row = sheet.createRow(0);  
		        HSSFCellStyle  style = wb.createCellStyle();      
		        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中  
		          
		        int i=0;
                try {
					while(!(lineTxt =(lineTxt+bufferedReader.readLine())).equals("null")||!(lineTxt =(lineTxt+bufferedReader.readLine())).equals("nullnull") ){
						if(lineTxt.indexOf("qs")<=0){
							continue;
						}else if(lineTxt.indexOf("qs")==(lineTxt.length()-1)){
							if(lineTxt.split("sq").length){}
						}else{
							if(lineTxt.indexOf("sq")>=0){
								String s1[] = lineTxt.split("qs");
								for(int w=0;w<s1.length;w++){
									String ss[]=s1[w].split("sq");
									System.out.println(ss.length);
									for(int q=0;q<ss.length;q++){
										System.out.println(ss[q]);
									}
										int j=0;
										while(j<ss.length){
											//第四步创建单元格  
									        HSSFCell cell = row.createCell((short)i );         //第一个单元格  
									        cell.setCellValue(ss[j]);                  //设定值  
									        cell.setCellStyle(style); 
									        i++;//内容居中  
									        j++;
										}
										lineTxt = "";
									}
							}
						}
						
					}

			        try {  
			            FileOutputStream fout = new FileOutputStream("D:\\errorCondition.xls");  
			            wb.write(fout);  
			            fout.close();  
			        } catch (IOException e1) {  
			            e1.printStackTrace();  
			        }  
			          
			        System.out.println("Excel文件生成成功...");  
			    
					
	                read.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
	                    
 		
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
