package com.jm.thub.xcx.mapper;

import com.jm.thub.xcx.entity.ThWxUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
* <p>
* 微信小程序-用户表 Mapper 接口
* </p>
*
* @author caozhenhao
* @since 2023-05-29
*/
@Mapper
@Repository
public interface ThWxUserMapper extends BaseMapper<ThWxUser> {

}
