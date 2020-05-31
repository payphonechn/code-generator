package cn.bynow.asuka.core.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/31 17:55
 */
@Mapper
public interface TestMapper {
    int queryTotal();
}
