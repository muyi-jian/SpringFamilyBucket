package com.yj.spring6.jdbc;

import com.yj.spring6.jdbc.bean.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @author YangJian
 * @date 2023/12/5 16:52
 * @description
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JDBCTemplateTest {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    //测试增删改功能
    public void testInsert(){
        //添加功能
        String sql = "insert into t_emp values(null,?,?,?)";
        int result = jdbcTemplate.update(sql, "张三", 23, "男");

    }
    @Test
    //测试增删改功能
    public void testUpdate(){

        //修改功能
        String sql = "update t_emp set name=? where id=?";
        int result = jdbcTemplate.update(sql, "张三001", 1);

        //删除功能
        //String sql = "delete from t_emp where id=?";
        //int result = jdbcTemplate.update(sql, 1);
    }
    @Test
    //测试增删改功能
    public void testDelete(){

        //删除功能
        String sql = "delete from t_emp where id=?";
        int result = jdbcTemplate.update(sql, 1);
    }
    @Test
    //测试查询返回对象
    public void testSelectObject(){

       String sql = "SELECT * FROM t_emp where id=?";
       //第一种写法
       /*Emp empResult = jdbcTemplate.queryForObject(sql, (rs, rowNum)->{
            Emp emp = new Emp();
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setSex(rs.getString("sex"));
            emp.setAge(rs.getInt("age"));
            return emp;
       },2);
        System.out.println("empResult==="+empResult.toString());*/
        // 第二种写法
        Emp empResult = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Emp>(Emp.class), 2);
        System.out.println("empResult==="+empResult.toString());
    }

    @Test
    //查询多条数据为一个list集合
    public void testSelectList(){
        String sql = "select * from t_emp";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println("empList======"+empList);
    }

    @Test
    //查询单行单列的值
    public void selectCount(){
        String sql = "select count(id) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("count======"+count);
    }


}
