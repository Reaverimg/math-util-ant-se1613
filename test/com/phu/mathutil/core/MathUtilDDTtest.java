package com.phu.mathutil.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.phu.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.phu.mathutil.core.MathUtil.getFactorial;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTtest {

    //cb bo data, la mang 2 chieu, 2 cot ung voi ex va n
    //mang object so thi dung wraper class- class goi cac primitive
    //Integer -> int, long -> long
    @Parameterized.Parameters
    public static Object[][] initData() {
        
        //int a[] = {5, 10, 15, 20, 25}; // liet ke cac phan tu mang cach nhau dau phay
        //int b[] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
//        int c[][] = {{1, 0},
//        {1, 1},
//        {2, 2},
//        {6, 3},
//        {24, 4},
//        {120, 5},
//        {720, 6}};
        return new Integer[][]{{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}};
    }

    //ta se map anh xa cac cot  cua moi dong, vd dong dau tien
    //co 2 cot la 1 0 -> ta se anh xa 1 vao bien expected, 0 vao bien n
    //tuong tu cho cac dong con lai
    @Parameterized.Parameter(value = 0)
    public long expected;

    @Parameterized.Parameter(value = 1)
    public int n; //map vao cot 1 cua mang

    @Test //kiem thu cac test case voi cac data dduocj trích ra từ mảng
    public void testFactorialGivenrightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }

}

//phan tich cach ta viet code cho phan test ham getF() hom truoc
//Assert.assertEquals(2, MathUtil.getFactorial(2)); lenh dung de test
//ham method lenh nay lap di lap lai cho cac data ta dua vao
//de ta kiem tra cac tinh huong xai ham 
//Lat ta se thay data 1 0 thanhf cac data tuong ung khac
//VD ex 1 n 0 -> co on k
// 1 2
// 2 2
// 6 3
//24 4
//120 5
//720 6
// sau do tu tu nhoi mom feed data nay vao cau lenh test ham o tren
// coi nhu chi can 1 cau lenh goi  test ham data cu the tuan tu day vao
//Cai cau lenh test giup rut gon so cau lenh test giup de dang kiem tra tinh thieu du cua cac test case
// ky thuat nay dgl la ddt
// CON GOI  1TEN KHAC LA KIEM THU THEO KIEU THAM SO HOA PARAMETTERIZED
// CHOI VOI DDT TA CAN 1 BO TEST DATA TACH RIENG
//CAC THAM S UNG VOI BO DATA
//GOI HAM KIEM THU XAI CAC THAM SO
//toan bo code trong cá snay dc viet ra dung de test code chinh o ben src packages
//code dc viet ra dung de di test cdoe khac
//thi code nay dgl test script
//1 test script se chua nhieu code de test ham chinh
//1 test script se chua nhieu test case
//test case : cac tinh huong xai ham
//1 test script co the xai đt de de bao tri code test
//viet code chinh co the xai tdd
