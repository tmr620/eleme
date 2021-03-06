package com.Rayson.view.Impl;

import com.Rayson.dao.AdminDao;
import com.Rayson.dao.Impl.AdminDaoImpl;
import com.Rayson.domain.Admin;
import com.Rayson.view.AdminView;

import java.util.Scanner;

public class AdminViewImpl implements AdminView {

    @Override
    public Admin login() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名");
        String adminName = input.next();
        System.out.println("请输入密码");
        String password = input.next();
        AdminDao adminDao = new AdminDaoImpl();
        Admin admin = new Admin();
        admin = adminDao.getAdminByNameByPassword(adminName,password);
        return admin;
    }
}
