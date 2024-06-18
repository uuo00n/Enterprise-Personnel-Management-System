<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>Sin人员管理系统</h2>
        <p>
          Sin人员管理系统是一款基于若依框架并融合二次创作的综合性软件，集成了多种人力资源管理功能，旨在帮助企业和组织有效管理员工信息、优化人力资源流程、提升工作效率。该系统通过自动化和数字化手段，简化了从员工入职到离职的整个流程，减少了管理成本，并提供了准确、实时的数据支持决策。
        </p>
        <p>
          <b>当前版本:</b> <span>v{{ version }}</span>
        </p>
        <p>
          <el-button
            type="primary"
            size="mini"
            icon="el-icon-takeaway-box"
            plain
            @click="goTarget('https://gitee.com/huang-junbo/Enterprise-Personnel-Management-System')"
          >访问源码仓库
          </el-button
          >
          <el-button
            size="mini"
            icon="el-icon-link"
            plain
            @click="goTarget('http://120.46.212.36/')"
          >访问作者博客
          </el-button
          >
        </p>
      </el-col>

      <el-col :sm="24" :lg="12" style="padding-left: 50px">
        <el-row>
          <el-col :span="12">
            <h2>技术选型</h2>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <h4>后端技术</h4>
            <ul>
              <li>SpringBoot</li>
              <li>Spring Security</li>
              <li>JWT</li>
              <li>MyBatis</li>
              <li>Druid</li>
              <li>Fastjson</li>
              <li>...</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>前端技术</h4>
            <ul>
              <li>Vue</li>
              <li>Vuex</li>
              <li>Element-ui</li>
              <li>Axios</li>
              <li>Sass</li>
              <li>Quill</li>
              <li>...</li>
            </ul>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
    <el-divider/>
    <el-row :gutter="20">
      <el-col :span="24" class="card-box">
        <el-card>
          <div slot="header">
            <span><i class="el-icon-monitor"></i> 服务器信息</span>
          </div>
          <div class="el-table el-table--enable-row-hover el-table--medium">
            <table cellspacing="0" style="width: 100%;">
              <tbody>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">服务器名称</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.sys">{{ server.sys.computerName }}</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell">操作系统</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.sys">{{ server.sys.osName }}</div>
                </td>
              </tr>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">服务器IP</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.sys">{{ server.sys.computerIp }}</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell">系统架构</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.sys">{{ server.sys.osArch }}</div>
                </td>
              </tr>
              </tbody>
            </table>
          </div>
        </el-card>
      </el-col>
      <el-col :span="12" class="card-box">
        <el-card>
          <div slot="header"><span><i class="el-icon-cpu"></i> CPU</span></div>
          <div class="el-table el-table--enable-row-hover el-table--medium">
            <table cellspacing="0" style="width: 100%;">
              <thead>
              <tr>
                <th class="el-table__cell is-leaf">
                  <div class="cell">属性</div>
                </th>
                <th class="el-table__cell is-leaf">
                  <div class="cell">值</div>
                </th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">核心数</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.cpu">{{ server.cpu.cpuNum }}</div>
                </td>
              </tr>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">用户使用率</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.cpu">{{ server.cpu.used }}%</div>
                </td>
              </tr>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">系统使用率</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.cpu">{{ server.cpu.sys }}%</div>
                </td>
              </tr>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">当前空闲率</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.cpu">{{ server.cpu.free }}%</div>
                </td>
              </tr>
              </tbody>
            </table>
          </div>
        </el-card>
      </el-col>

      <el-col :span="12" class="card-box">
        <el-card>
          <div slot="header"><span><i class="el-icon-tickets"></i> 内存</span></div>
          <div class="el-table el-table--enable-row-hover el-table--medium">
            <table cellspacing="0" style="width: 100%;">
              <thead>
              <tr>
                <th class="el-table__cell is-leaf">
                  <div class="cell">属性</div>
                </th>
                <th class="el-table__cell is-leaf">
                  <div class="cell">内存</div>
                </th>
                <th class="el-table__cell is-leaf">
                  <div class="cell">JVM</div>
                </th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">总内存</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.mem">{{ server.mem.total }}G</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.jvm">{{ server.jvm.total }}M</div>
                </td>
              </tr>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">已用内存</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.mem">{{ server.mem.used }}G</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.jvm">{{ server.jvm.used }}M</div>
                </td>
              </tr>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">剩余内存</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.mem">{{ server.mem.free }}G</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.jvm">{{ server.jvm.free }}M</div>
                </td>
              </tr>
              <tr>
                <td class="el-table__cell is-leaf">
                  <div class="cell">使用率</div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.mem" :class="{'text-danger': server.mem.usage > 80}">
                    {{ server.mem.usage }}%
                  </div>
                </td>
                <td class="el-table__cell is-leaf">
                  <div class="cell" v-if="server.jvm" :class="{'text-danger': server.jvm.usage > 80}">
                    {{ server.jvm.usage }}%
                  </div>
                </td>
              </tr>
              </tbody>
            </table>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import { getServer } from '@/api/monitor/server'

export default {
  name: 'Index',
  data() {
    return {
      // 版本号
      version: '3.8.7',
      server: []
    }
  },
  created() {
    this.getList()
    this.openLoading()
  },
  methods: {
    goTarget(href) {
      window.open(href, '_blank')
    },
    /** 查询服务器信息 */
    getList() {
      getServer().then(response => {
        this.server = response.data
        this.$modal.closeLoading()
      })
    },
    // 打开加载层
    openLoading() {
      this.$modal.loading('正在加载服务监控数据，请稍候！')
    }
  }
}
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }

  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

