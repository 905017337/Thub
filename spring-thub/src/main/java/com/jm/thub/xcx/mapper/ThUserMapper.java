package com.jm.thub.xcx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jm.thub.xcx.entity.WxUserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
* <p>
*  Mapper 接口
* </p>
*
* @author caozhenhao
* @since 2023-05-28
*/
@Mapper
@Repository
public interface ThUserMapper extends BaseMapper<WxUserInfo> {

}
