package com.example.demo4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo4.model.DeptDao;
import com.example.demo4.vo.DeptVo;

@Controller
public class DeptController {

    @Autowired
    DeptDao deptDao;

    public DeptController(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @RequestMapping("/dept/list.do")
    @ResponseBody
    public List<DeptVo> selectList() {

        List<DeptVo> list = deptDao.selectList();

        return list;
    }
}
