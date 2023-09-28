package com.example.demo4.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo4.vo.DeptVo;

@Mapper
public interface DeptDao {

    List<DeptVo> selectList();
}
