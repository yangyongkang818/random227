package com.yyk.common.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	/*
	 * �����������
	 * */
	
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max){
	//TODO ʵ�ִ���
		Random r = new Random();
		int i = r.nextInt(max);
		
		
		return i;
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
	//TODO ʵ�ִ���           //��������  ������ŷ��ص������
		int[] x=new int[subs];
		
		 //���������ظ�������
		 HashSet<Integer> set = new HashSet<Integer>();
		 
		 while(set.size()!=subs) {
		   int i = random(min,max);
		   set.add(i);
		 }
		 //����set ��ֵ��������
		  int k=0;
		 for (Integer value : set) {
			x[k]=value;
			k++;
		}
		return x;
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
	//TODO ʵ�ִ���
		Random random=new Random();
		
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		char charAt = str.charAt(random.nextInt(str.length()));
		
		
		
		return charAt;
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
	//TODO ʵ�ִ���
		String str="";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();			
		}
		return str;
	}

}
