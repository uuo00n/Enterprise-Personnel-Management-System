<p align="center">
	<img alt="logo" src="/demoimages/logo.png">
</p>
<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">Sin人员管理系统</h1>
<h4 align="center">基于RuoYi v3.8.7</h4>
<h4 align="center">Sin人员管理系统是一款基于若依框架并融合二次创作的综合性平台</h4>

[![Static Badge](https://img.shields.io/badge/Prod%20by%20uuo00n-8A2BE2?style=flat)](https://github.com/uuo00n)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/uuo00n/Enterprise-Personnel-Management-System/blob/master/LICENSE)
[![使用IntelliJ IDEA开发维护](https://img.shields.io/badge/IntelliJ%20IDEA-提供支持-blue.svg)](https://www.jetbrains.com)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-blue.svg)]()
[![JDK-8+](https://img.shields.io/badge/JDK-8-green.svg)]()
[![mysql-5.7](https://img.shields.io/badge/MySql-5.7-green.svg)]()
[![redis-3.0.504](https://img.shields.io/badge/redis-3.0.504-green.svg)]()
## 平台简介

Sin人员管理系统是一款基于若依框架并融合二次创作的综合性平台，集成了多种人力资源管理功能，旨在帮助企业和组织有效管理员工信息、优化人力资源流程、提升工作效率。该系统通过自动化和数字化手段，简化了从员工入职到离职的整个流程，减少了管理成本，并提供了准确、实时的数据支持决策。

## 技术架构

* 前端采用Vue、Element UI。
* 后端采用Spring Boot、Spring Security、Redis & Jwt。
* 权限认证使用Jwt，支持多终端认证系统。
* 支持加载动态权限菜单，多方式轻松权限控制。
* 集成了Redis缓存，支持集群部署。

## 内置功能

1. 用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2. 部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3. 项目管理：配置项目信息，支持项目状态、项目信息、项目负责人等。
4. 岗位管理：配置系统用户所属担任职务。
5. 菜单管理：配置系统菜单，操作权限，按钮权限标识等。
6. 角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
7. 字典管理：对系统中经常使用的一些较为固定的数据进行维护。
8. 参数管理：对系统动态配置常用参数。
9. 通知公告：系统通知公告信息发布维护。
10. 操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
11. 登录日志：系统登录日志记录查询包含登录异常。
12. 在线用户：当前系统中活跃用户状态监控。
13. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
14. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
15. 系统接口：根据业务代码自动生成相关的api接口文档。
16. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
17. 缓存监控：对系统的缓存信息查询，命令统计等。
18. 在线构建器：拖动表单元素生成相应的HTML代码。
19. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 表设计

* 代码生成业务表
* 代码生成业务表字段
* Blob类型的触发器表
* 日历信息表
* Cron类型的触发器表
* 已触发的触发器表
* 任务详细信息表
* 存储的悲观锁信息表
* 暂停的触发器表
* 调度器状态表
* 简单触发器的信息表
* 同步机制的行锁表
* 触发器详细信息表
* 参数配置表
* 部门表
* 字典数据表
* 字典类型表
* 定时任务调度表
* 定时任务调度日志表
* 系统访问记录
* 菜单权限表
* 通知公告表
* 操作日志记录
* 岗位信息表
* 角色信息表
* 角色和部门关联表
* 角色和菜单关联表
* 用户信息表
* 用户与岗位关联表
* 用户和角色关联表
* 项目信息表
  <h3 align="center">表结构图</h3>
  <img src="/demoimages/sin-sql.png">

## 演示图

<table>
  <tr>
    <td><img src="/demoimages/login.png"></td>
    <td><img src="/demoimages/index.png"></td>
  </tr>
  <tr>
    <td><img src="/demoimages/prj.png"></td>
    <td><img src="/demoimages/user.png"></td>
  </tr>
</table>