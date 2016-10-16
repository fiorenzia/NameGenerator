package pac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class NameOutPutReader {
	public String nameOutPut() {
		String str = "";
		Random ran = new Random();
		int law;
		int i;

		try {
			File file = new File( /* パスを指定 -> */ "");
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedReader name = new BufferedReader(new FileReader(file));
			str = br.readLine();
			//全行数を取得
			for(i = 1; str != null; i++){
				str = br.readLine();
			}
			law = ran.nextInt(i);
			if(law==0){
				law++;
			}
			for(int j = 0; j < law; j++){
				str = name.readLine();
			}
			if(str != null) {
				System.out.println(str);
			}

			br.close();

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		return str;
	}
}
