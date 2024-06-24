<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>Sin人员管理系统</h2>
        <p>
          Sin人员管理系统是一款基于若依框架并融合二次创作的综合性软件，集成了多种人力资源管理功能，旨在帮助企业和组织有效管理员工信息、优化人力资源流程、提升工作效率。该系统通过自动化和数字化手段，简化了从员工入职到离职的整个流程，减少了管理成本，并提供了准确、实时的数据支持决策。
        </p>
        <p>
          <b>Sin人员管理系统版本:</b> <span>v1.0</span><br>
          <b>若依版本:</b> <span>v{{ version }}</span>
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
            <h2>开发团队</h2>
          </el-col>
        </el-row>
        <el-row>
          <el-col :span="6">
            <h4>数据库设计</h4>
            <ul>
              <li>黄俊博</li>
              <li>李世博</li>
              <li>陈凯乐</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>前端开发</h4>
            <ul>
              <li>黄俊博</li>
              <li>滕东峻</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>后端开发</h4>
            <ul>
              <li>黄俊博</li>
              <li>李世博</li>
              <li>郎健伟</li>
            </ul>
          </el-col>
          <el-col :span="6">
            <h4>软件测试</h4>
            <ul>
              <li>李世博</li>
              <li>季峰</li>
              <li>战庆贤</li>
              <li>王磊</li>
              <li>巨杰</li>
            </ul>
          </el-col>
        </el-row>
      </el-col>
    </el-row>

    <el-row :gutter="20">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>技术选型</span>
          </div>
          <div class="body">
            <i class="el-icon-s-platform"></i>前端技术
            <p>
              <a href="https://nodejs.org/" target="_blank"><img style="margin: 10px"
                                                                 src="https://profilinator.rishav.dev/skills-assets/nodejs-original-wordmark.svg"
                                                                 alt="Node.js" height="50"
              /></a>
              <a href="https://vuejs.org/" target="_blank"><img style="margin: 10px"
                                                                src="https://profilinator.rishav.dev/skills-assets/vuejs-original-wordmark.svg"
                                                                alt="Vue.js" height="50"
              /></a>
              <a href="https://element.eleme.cn/" target="_blank"><img style="margin: 10px"
                                                                       src="data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+Cjxzdmcgd2lkdGg9IjMwcHgiIGhlaWdodD0iMzBweCIgdmlld0JveD0iMCAwIDM4IDQ4IiB2ZXJzaW9uPSIxLjEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgeG1sbnM6eGxpbms9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkveGxpbmsiPgogICAgPCEtLSBHZW5lcmF0b3I6IFNrZXRjaCA0MCAoMzM3NjIpIC0gaHR0cDovL3d3dy5ib2hlbWlhbmNvZGluZy5jb20vc2tldGNoIC0tPgogICAgPHRpdGxlPlNoYXBlIENvcHk8L3RpdGxlPgogICAgPGRlc2M+Q3JlYXRlZCB3aXRoIFNrZXRjaC48L2Rlc2M+CiAgICA8ZGVmcz48L2RlZnM+CiAgICA8ZyBpZD0idjIuMi4wIiBzdHJva2U9Im5vbmUiIHN0cm9rZS13aWR0aD0iMSIgZmlsbD0ibm9uZSIgZmlsbC1ydWxlPSJldmVub2RkIj4KICAgICAgICA8ZyBpZD0i6aaW6aG1Lem7mOiupOaViOaenC1jb3B5LTIiIHRyYW5zZm9ybT0idHJhbnNsYXRlKC03MC4wMDAwMDAsIC0xOS4wMDAwMDApIiBmaWxsPSIjNDA5RUZGIj4KICAgICAgICAgICAgPHBhdGggZD0iTTIxMi4xMzU0NDEsNDUuMTU3ODA3NyBaIE0xMDMuNDE2NTAyLDQ2LjIxNzU1MTEgQzEwMy40MDcwMDgsNDcuNzk0NTY4MiAxMDIuNTg3ODQxLDQ4LjE0NjM0NzQgMTAyLjU4Nzg0MSw0OC4xNDYzNDc0IEMxMDIuNTg3ODQxLDQ4LjE0NjM0NzQgODguNDUyMDQ3OCw1Ni4zMTQ1MDg3IDg3LjUzMjk5NTYsNTYuODI2Mjc1MSBDODYuNjIyMzM2LDU3LjIxNzE1NjEgODYuMDEzNjcwMyw1Ni44MjYyNzUxIDg2LjAxMzY3MDMsNTYuODI2Mjc1MSBDODYuMDEzNjcwMyw1Ni44MjYyNzUxIDcxLjIyMjU3MDYsNDguMjQ3OTU3MiA3MC42ODI2OTYyLDQ3Ljg3MDg0NDQgQzcwLjE0MjY4NDMsNDcuNDkzNzMxNiA3MC4xMzAxNjQzLDQ2LjkwNjM3NzQgNzAuMTMwMTY0Myw0Ni45MDYzNzc0IEM3MC4xMzAxNjQzLDQ2LjkwNjM3NzQgNzAuMTQ1MDIzMiwyOS45MTk5MTc0IDcwLjEzMDE2NDMsMjkuMTMzMzM2NCBDNzAuMTE1MzA1MywyOC4zNDY2MTc3IDcxLjA5Njk1NzYsMjcuNzU1NTQ2MSA3MS4wOTY5NTc2LDI3Ljc1NTU0NjEgTDg1Ljg3NTUzNzMsMTkuMjEzNDM4NyBDODYuNzg1MzcxNCwxOC43MzMyMDE2IDg3LjY3MTEyODYsMTkuMjEzNDM4NyA4Ny42NzExMjg2LDE5LjIxMzQzODcgQzg3LjY3MTEyODYsMTkuMjEzNDM4NyAxMDAuNzI2NjIzLDI2LjgwMjA5MzcgMTAyLjE3MzQ0MiwyNy42MTc3MjU3IEMxMDMuNTkxNTA3LDI4LjI5MTk1NzcgMTAzLjQxNjUwMiwyOS42ODQzNDI0IDEwMy40MTY1MDIsMjkuNjg0MzQyNCBDMTAzLjQxNjUwMiwyOS42ODQzNDI0IDEwMy40MjUzMDcsNDQuNzUxOTE5MiAxMDMuNDE2NTAyLDQ2LjIxNzU1MTEgTDEwMy40MTY1MDIsNDYuMjE3NTUxMSBaIE05Ny41MTYwMTA1LDI5LjE2OTEzMzkgQzk0LjQ5MDAxNzMsMjcuNDI3NDQ4MyA4Ny4zNjE1ODQyLDIzLjI5NzEwNjMgODcuMzYxNTg0MiwyMy4yOTcxMDYzIEM4Ny4zNjE1ODQyLDIzLjI5NzEwNjMgODYuNjY2MTAzOSwyMi45MjEyMzI2IDg1Ljk1MTc3NDcsMjMuMjk3MTA2MyBMNzQuMzQ4NzQwNiwyOS45ODIxNSBDNzQuMzQ4NzQwNiwyOS45ODIxNSA3My41NzgwMDI1LDMwLjQ0NDkwMTQgNzMuNTg5Njk3LDMxLjA2MDQ4MDUgQzczLjYwMTM5MTUsMzEuNjc2MDU5NyA3My41ODk2OTcsNDQuOTY5ODcwOCA3My41ODk2OTcsNDQuOTY5ODcwOCBDNzMuNTg5Njk3LDQ0Ljk2OTg3MDggNzMuNTk5NDY1NCw0NS40Mjk1OTMyIDc0LjAyMzQ5NTEsNDUuNzI0NjQ3MiBDNzQuNDQ3Mzg3Myw0Ni4wMTk3MDExIDg2LjA2MDE4OTgsNTIuNzMzMjQ1MSA4Ni4wNjAxODk4LDUyLjczMzI0NTEgQzg2LjA2MDE4OTgsNTIuNzMzMjQ1MSA4Ni41MzgxNTIsNTMuMDM5MTc1OSA4Ny4yNTMwMzE1LDUyLjczMzI0NTEgQzg3Ljk3NDY1MjYsNTIuMzMyNzI2MiA5OS4wNzMwMzM1LDQ1Ljk0MDI1ODIgOTkuMDczMDMzNSw0NS45NDAyNTgyIEM5OS4wNzMwMzM1LDQ1Ljk0MDI1ODIgOTkuNzE2MjMyNSw0NS42NjQ4OTI5IDk5LjcyMzY2MTksNDQuNDMwNzA1NiBDOTkuNzI1NzI1Nyw0NC4wNzQ3OTU5IDk5LjcyNjU1MTIsNDIuNjkzMjg4MSA5OS43MjY2ODg3LDQwLjk1NzUyMjkgTDg2LjY2MDA1MDIsNDguODc1MjM5NCBMODYuNjYwMDUwMiw0NS44NDYyMjEgQzg2LjY2MDA1MDIsNDQuNjAyMTIwNSA4Ny42MjMxMjg5LDQzLjc4MDk4MTEgODcuNjIzMTI4OSw0My43ODA5ODExIEw5OS4xODA3NjA3LDM2LjgxNjU3OTMgQzk5LjYxNjg5NzgsMzYuMzYxMTI1MSA5OS43MDY4NzY4LDM1LjYzMTU0NDcgOTkuNzI1NDUwNSwzNS4zNTU2Mjg3IEM5OS43MjUwMzc4LDM0LjA5MDQ2MjcgOTkuNzI0NDg3NCwzMi45ODUyODQxIDk5LjcyNDA3NDcsMzIuMjg1MTY3OCBMODYuNjYwMDUwMiw0MC4yMDEyMzIxIEw4Ni42NjAwNTAyLDM3LjAzNDUzMSBDODYuNjYwMDUwMiwzNS43OTA0MzA1IDg3LjQ4NTU0NjIsMzUuMjQ0NjU2NCA4Ny40ODU1NDYyLDM1LjI0NDY1NjQgTDk3LjUxNjAxMDUsMjkuMTY5MTMzOSBaIiBpZD0iU2hhcGUtQ29weSI+PC9wYXRoPgogICAgICAgIDwvZz4KICAgIDwvZz4KPC9zdmc+"
                                                                       alt="elementUI.js" height="50"
              /></a>
              <a href="https://axios-http.com/" target="_blank"><img style="margin: 10px"
                                                                     src="https://avatars.githubusercontent.com/u/32372333?s=200&v=4"
                                                                     alt="axios" height="50"
              ></a>
              <a href="https://sass-lang.com/" target="_blank"><img style="margin: 10px"
                                                                    src="https://sass-lang.com/assets/img/logos/logo.svg"
                                                                    alt="sass" height="50"
              ></a>
            </p>
            <i class="el-icon-s-tools"></i>后端技术
            <p>
              <a
                href="https://spring.io/"
                target="_blank"
              ><img style="margin: 10px" src="https://profilinator.rishav.dev/skills-assets/springio-icon.svg"
                    alt="Spring"
                    height="50"
              /></a>
              <a href="https://mybatis.org/" target="_blank"><img style="margin: 10px"
                                                                  src="https://avatars.githubusercontent.com/u/1483254?s=200&v=4"
                                                                  alt="mybatis" height="50"
              /></a>
              <a href="https://jwt.io/" target="_blank"><img style="margin: 10px"
                                                             src="https://jwt.io/img/icon.svg"
                                                             alt="JWT" height="50"
              ></a>

              <a href="https://github.com/alibaba/fastjson2" target="_blank"><img style="margin: 10px"
                                                                                  src="https://avatars.githubusercontent.com/u/1961952?s=200&v=4"
                                                                                  alt="Fastjson" height="50"
              ></a>
            </p>
            <i class="el-icon-s-tools"></i>开发工具
            <p>
              <a href="https://gitee.com/" target="_blank"><img style="margin: 10px"
                                                                src="https://www.svgrepo.com/show/330508/gitee.svg"
                                                                alt="IDEA" height="50"
              ></a>
              <a href="https://www.jetbrains.com/zh-cn/idea/" target="_blank"><img style="margin: 10px"
                                                                                   src="https://www.svgrepo.com/show/452236/jb-intellij-idea.svg"
                                                                                   alt="IDEA" height="50"
              ></a>
              <a href="https://www.jetbrains.com/zh-cn/webstorm/" target="_blank"><img style="margin: 10px"
                                                                                       src="https://www.svgrepo.com/show/354555/webstorm.svg"
                                                                                       alt="WebStorm" height="50"
              ></a>
              <a href="https://code.visualstudio.com/" target="_blank"><img style="margin: 10px"
                                                                            src="https://www.svgrepo.com/show/374171/vscode.svg"
                                                                            alt="WebStorm" height="50"
              ></a>
              <a href="https://www.sublimetext.com/" target="_blank"><img style="margin: 10px"
                                                                          src="https://www.svgrepo.com/show/349520/sublimetext.svg"
                                                                          alt="WebStorm" height="50"
              ></a>
              <a href="https://www.navicat.com/en/" target="_blank"><img style="margin: 10px"
                                                                         src="https://static-00.iconduck.com/assets.00/navicat-icon-512x506-yu2kce7d.png"
                                                                         alt="WebStorm" height="50"
              ></a>
              <a href="https://www.postman.com/" target="_blank"><img style="margin: 10px"
                                                                      src="https://www.svgrepo.com/show/354202/postman-icon.svg"
                                                                      alt="WebStorm" height="50"
              ></a>
            </p>
          </div>
        </el-card>
      </el-col>


    </el-row>
    <el-divider/>
  </div>
</template>

<script>

export default {
  name: 'Index',
  data() {
    return {
      // 版本号
      version: '3.8.7'
    }
  },
  created() {
    this.getList()
    this.openLoading()
  },
  methods: {
    goTarget(href) {
      window.open(href, '_blank')
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

