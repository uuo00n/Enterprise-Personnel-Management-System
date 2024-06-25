package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysProjectMapper;
import com.ruoyi.system.domain.SysProject;
import com.ruoyi.system.service.ISysProjectService;

/**
 * 项目管理Service业务层处理
 * 
 * @author uuo00n
 * @date 2024-06-25
 */
@Service
public class SysProjectServiceImpl implements ISysProjectService 
{
    @Autowired
    private SysProjectMapper sysProjectMapper;

    /**
     * 查询项目管理
     * 
     * @param projectId 项目管理主键
     * @return 项目管理
     */
    @Override
    public SysProject selectSysProjectByProjectId(Long projectId)
    {
        return sysProjectMapper.selectSysProjectByProjectId(projectId);
    }

    /**
     * 查询项目管理列表
     * 
     * @param sysProject 项目管理
     * @return 项目管理
     */
    @Override
    public List<SysProject> selectSysProjectList(SysProject sysProject)
    {
        return sysProjectMapper.selectSysProjectList(sysProject);
    }

    /**
     * 新增项目管理
     * 
     * @param sysProject 项目管理
     * @return 结果
     */
    @Override
    public int insertSysProject(SysProject sysProject)
    {
        sysProject.setCreateTime(DateUtils.getNowDate());
        return sysProjectMapper.insertSysProject(sysProject);
    }

    /**
     * 修改项目管理
     * 
     * @param sysProject 项目管理
     * @return 结果
     */
    @Override
    public int updateSysProject(SysProject sysProject)
    {
        sysProject.setUpdateTime(DateUtils.getNowDate());
        return sysProjectMapper.updateSysProject(sysProject);
    }

    /**
     * 批量删除项目管理
     * 
     * @param projectIds 需要删除的项目管理主键
     * @return 结果
     */
    @Override
    public int deleteSysProjectByProjectIds(Long[] projectIds)
    {
        return sysProjectMapper.deleteSysProjectByProjectIds(projectIds);
    }

    /**
     * 删除项目管理信息
     * 
     * @param projectId 项目管理主键
     * @return 结果
     */
    @Override
    public int deleteSysProjectByProjectId(Long projectId)
    {
        return sysProjectMapper.deleteSysProjectByProjectId(projectId);
    }
}
