package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysProject;

/**
 * 项目管理Service接口
 * 
 * @author uuo00n
 * @date 2024-06-25
 */
public interface ISysProjectService 
{
    /**
     * 查询项目管理
     * 
     * @param projectId 项目管理主键
     * @return 项目管理
     */
    public SysProject selectSysProjectByProjectId(Long projectId);

    /**
     * 查询项目管理列表
     * 
     * @param sysProject 项目管理
     * @return 项目管理集合
     */
    public List<SysProject> selectSysProjectList(SysProject sysProject);

    /**
     * 新增项目管理
     * 
     * @param sysProject 项目管理
     * @return 结果
     */
    public int insertSysProject(SysProject sysProject);

    /**
     * 修改项目管理
     * 
     * @param sysProject 项目管理
     * @return 结果
     */
    public int updateSysProject(SysProject sysProject);

    /**
     * 批量删除项目管理
     * 
     * @param projectIds 需要删除的项目管理主键集合
     * @return 结果
     */
    public int deleteSysProjectByProjectIds(Long[] projectIds);

    /**
     * 删除项目管理信息
     * 
     * @param projectId 项目管理主键
     * @return 结果
     */
    public int deleteSysProjectByProjectId(Long projectId);
}
