package cn.itcast.ssm.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * <p>Title: CustomDateConverter</p>
 * <p>Description:鏃ユ湡杞崲鍣� </p>
 * <p>Company: www.itcast.com</p> 
 * @author	浼犳櫤.鐕曢潚
 * @date	2015-4-13涓嬪崍5:49:14
 * @version 1.0
 */
public class CustomDateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String source) {
		
		//瀹炵幇 灏嗘棩鏈熶覆杞垚鏃ユ湡绫诲瀷(鏍紡鏄痽yyy-MM-dd HH:mm:ss)
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			//杞垚鐩存帴杩斿洖
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//濡傛灉鍙傛暟缁戝畾澶辫触杩斿洖null
		return null;
	}

}
