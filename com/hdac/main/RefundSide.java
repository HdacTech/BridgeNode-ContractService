package com.hdac.main;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hdac.contract.HdacContract;
import com.hdac.contract.HdacMainGrab;
import com.hdac.contract.HdacMainHandle;
import com.hdac.contract.HdacMainRefund;
import com.hdac.contract.HdacSideGrab;
import com.hdac.contract.HdacSideHandle;
import com.hdac.contract.HdacSideRefund;

public class RefundSide 
{
	public static SqlSessionFactory getSqlSessionFactory()
	   {
	      SqlSessionFactory sqlSessionFactory = null;

	      try
	      {
	         String resource = "com/hdac/config/mybatis-config.xml";
	         Reader reader = Resources.getResourceAsReader(resource);
	         sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	         reader.close();
	      }
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }

	      return sqlSessionFactory;
	   }

	   public static void main(String[] argv) throws Exception
	   {
		  System.out.println("***** contract : RefundSide run start *****"); 
	      HdacContract sideRefund = new HdacSideRefund();
	      sideRefund.setSqlSessionFactory(getSqlSessionFactory());
	      sideRefund.run();
	      System.out.println("***** contract : RefundSide run finish *****");
	   }
}
