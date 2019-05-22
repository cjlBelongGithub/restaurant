package com.restaurant.mapper;

import com.restaurant.entity.Post;
import com.restaurant.entity.PostExample;
import com.restaurant.entity.PostKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    long countByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int deleteByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int deleteByPrimaryKey(PostKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int insertSelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    List<Post> selectByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    Post selectByPrimaryKey(PostKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Fri Apr 19 14:16:09 CST 2019
     */
    int updateByPrimaryKey(Post record);
}