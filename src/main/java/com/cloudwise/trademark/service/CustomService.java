package com.cloudwise.trademark.service;

import com.cloudwise.trademark.entity.Custom;

import java.util.List;

/**
 * (Custom)表服务接口
 *
 * @author makejava
 * @since 2020-12-22 14:54:14
 */
public interface CustomService {

    /**
     * 通过ID查询单条数据
     *
     * @param customId 主键
     * @return 实例对象
     */
    Custom queryById(Integer customId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Custom> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param custom 实例对象
     * @return 实例对象
     */
    Custom insert(Custom custom);

    /**
     * 修改数据
     *
     * @param custom 实例对象
     * @return 实例对象
     */
    Custom update(Custom custom);

    /**
     * 通过主键删除数据
     *
     * @param customId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer customId);

    /**
     * @create by: ydq
     * @description: 方法作用：查询数据总条数
     * @create time: 2020/12/22 15:18
     * @param:  custom条件查询传入的属性
     * @return getCount 查询条数
     */
    long getCount (Custom custom);

    /**
     * @create by: ydq
     * @description: 方法作用：查询加分页
     * @create time: 2020/12/22 15:26
     * @param: custom条件查询传入的属性
     * @param: offset起始条数
     * @param: limit每页显示条数
     * @return List<Custom>条件查询结果集
     */
    List<Custom> queryAllByConditionAndLimit (Custom custom,int offset, int limit);

}