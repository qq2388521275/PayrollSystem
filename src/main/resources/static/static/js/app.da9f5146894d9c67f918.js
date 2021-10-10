webpackJsonp([1],{BOKK:function(t,e){},NHnr:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s=a("7+uW"),i={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{attrs:{id:"main"}},[e("router-view")],1)},staticRenderFns:[]},l=a("VU/8")(null,i,!1,null,null,null).exports,r=a("/ocq"),o=a("mvHQ"),d=a.n(o),n={name:"App",data:function(){return{helloMsg:"",addMsg:"",deleteMsg:"",updateOldMsg:"",updateNewMsg:""}},methods:{helloQueryBtnClick:function(){var t=this;fetch("/hello",{method:"get"}).then(function(t){return t.json()}).then(function(e){return t.helloMsg=d()(e.content)})},helloAddBtnClick:function(){""===this.addMsg?alert("无法插入空值"):fetch("/hello/add?msg="+this.addMsg,{method:"get"}).then(this.helloQueryBtnClick)},helloDeleteBtnClick:function(){fetch("/hello/delete?msg="+this.deleteMsg,{method:"get"}).then(this.helloQueryBtnClick)},helloUpdateBtnClick:function(){fetch("/hello/update?oldMsg="+this.updateOldMsg+"&newMsg="+this.updateNewMsg,{method:"get"}).then(this.helloQueryBtnClick)}}},c={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{attrs:{id:"main"}},[a("div",{attrs:{id:"helloQuery"}},[a("h1",[t._v("  工资管理系统")]),t._v(" "),a("button",{attrs:{id:"helloQueryBtn"},on:{click:t.helloQueryBtnClick}},[t._v("查询")]),t._v(" "),a("a",[t._v(t._s(t.helloMsg))])]),t._v(" "),a("div",{attrs:{id:"helloAdd"}},[a("input",{directives:[{name:"model",rawName:"v-model",value:t.addMsg,expression:"addMsg"}],attrs:{placeholder:"待插入文本",type:"text"},domProps:{value:t.addMsg},on:{input:function(e){e.target.composing||(t.addMsg=e.target.value)}}}),t._v(" "),a("button",{attrs:{id:"helloAddBtn"},on:{click:t.helloAddBtnClick}},[t._v("添加")])]),t._v(" "),a("div",{attrs:{id:"helloDelete"}},[a("input",{directives:[{name:"model",rawName:"v-model",value:t.deleteMsg,expression:"deleteMsg"}],attrs:{placeholder:"待删除文本",type:"text"},domProps:{value:t.deleteMsg},on:{input:function(e){e.target.composing||(t.deleteMsg=e.target.value)}}}),t._v(" "),a("button",{attrs:{id:"helloDeleteBtn"},on:{click:t.helloDeleteBtnClick}},[t._v("删除")])]),t._v(" "),a("div",{attrs:{id:"helloUpdate"}},[a("input",{directives:[{name:"model",rawName:"v-model",value:t.updateOldMsg,expression:"updateOldMsg"}],attrs:{placeholder:"修改前",type:"text"},domProps:{value:t.updateOldMsg},on:{input:function(e){e.target.composing||(t.updateOldMsg=e.target.value)}}}),t._v(" "),a("input",{directives:[{name:"model",rawName:"v-model",value:t.updateNewMsg,expression:"updateNewMsg"}],attrs:{placeholder:"修改后",type:"text"},domProps:{value:t.updateNewMsg},on:{input:function(e){e.target.composing||(t.updateNewMsg=e.target.value)}}}),t._v(" "),a("button",{attrs:{id:"helloUpdateBtn"},on:{click:t.helloUpdateBtnClick}},[t._v("修改")])])])},staticRenderFns:[]};var m=a("VU/8")(n,c,!1,function(t){a("sAKk")},"data-v-61c70c10",null).exports,u={name:"App",data:function(){return{userName:"",password:""}},methods:{loginBtnClick:function(){var t=this;fetch("/login?uid="+this.userName+"&ans="+this.password,{method:"get"}).then(function(t){return t.json()}).then(function(e){return t.checkLogin(e)})},checkLogin:function(t){"200"===d()(t.status)?(this.$cookies.set("userName",this.userName),this.$router.push("/Sheet")):alert(d()(t.content))}}},h={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"login-root"},[a("div",{staticClass:"box-root flex-flex flex-direction--column",staticStyle:{"min-height":"100vh","flex-grow":"1"}},[t._m(0),t._v(" "),a("div",{staticClass:"box-root padding-top--24 flex-flex flex-direction--column",staticStyle:{"flex-grow":"1","z-index":"9"}},[t._m(1),t._v(" "),a("div",{staticClass:"formbg-outer"},[a("div",{staticClass:"formbg"},[a("div",{staticClass:"formbg-inner padding-horizontal--48"},[a("div",{attrs:{id:"stripe-login"}},[a("div",{staticClass:"field padding-bottom--24"},[a("label",[t._v("用户名")]),t._v(" "),a("input",{directives:[{name:"model",rawName:"v-model",value:t.userName,expression:"userName"}],staticClass:"nameInput",attrs:{type:"text"},domProps:{value:t.userName},on:{input:function(e){e.target.composing||(t.userName=e.target.value)}}})]),t._v(" "),a("div",{staticClass:"field padding-bottom--24"},[t._m(2),t._v(" "),a("input",{directives:[{name:"model",rawName:"v-model",value:t.password,expression:"password"}],staticClass:"passwordInput",attrs:{type:"password"},domProps:{value:t.password},on:{input:function(e){e.target.composing||(t.password=e.target.value)}}})]),t._v(" "),t._m(3),t._v(" "),a("div",{staticClass:"field padding-bottom--24"},[a("button",{attrs:{id:"loginBtn"},on:{click:t.loginBtnClick}},[t._v("登录")])])])])]),t._v(" "),t._m(4)])])])])},staticRenderFns:[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"loginbackground box-background--white padding-top--64"},[a("div",{staticClass:"loginbackground-gridContainer"},[a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"top / start / 8 / end"}},[a("div",{staticClass:"box-root",staticStyle:{"background-image":"linear-gradient(white 0%, rgb(247, 250, 252) 33%)","flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"4 / 2 / auto / 5"}},[a("div",{staticClass:"box-root box-divider--light-all-2 animationLeftRight tans3s",staticStyle:{"flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"6 / start / auto / 2"}},[a("div",{staticClass:"box-root box-background--blue800",staticStyle:{"flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"7 / start / auto / 4"}},[a("div",{staticClass:"box-root box-background--blue animationLeftRight",staticStyle:{"flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"8 / 4 / auto / 6"}},[a("div",{staticClass:"box-root box-background--gray100 animationLeftRight tans3s",staticStyle:{"flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"2 / 15 / auto / end"}},[a("div",{staticClass:"box-root box-background--cyan200 animationRightLeft tans4s",staticStyle:{"flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"3 / 14 / auto / end"}},[a("div",{staticClass:"box-root box-background--blue animationRightLeft",staticStyle:{"flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"4 / 17 / auto / 20"}},[a("div",{staticClass:"box-root box-background--gray100 animationRightLeft tans4s",staticStyle:{"flex-grow":"1"}})]),t._v(" "),a("div",{staticClass:"box-root flex-flex",staticStyle:{"grid-area":"5 / 14 / auto / 17"}},[a("div",{staticClass:"box-root box-divider--light-all-2 animationRightLeft tans3s",staticStyle:{"flex-grow":"1"}})])])])},function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"box-root padding-top--48 padding-bottom--24 flex-flex flex-justifyContent--center"},[e("h1",[e("a",{attrs:{href:"http://blog.stackfindover.com/",rel:"dofollow"}},[this._v("工资管理系统")])])])},function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"grid--50-50"},[e("label",[this._v("密码")]),this._v(" "),e("div",{staticClass:"reset-pass"},[e("a",{attrs:{href:"#"}},[this._v("Forgot your password?")])])])},function(){var t=this.$createElement,e=this._self._c||t;return e("div",{staticClass:"field field-checkbox padding-bottom--24 flex-flex align-center"},[e("label",[e("input",{attrs:{type:"checkbox",name:"checkbox"}}),this._v(" 一周免登录\n                ")])])},function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"footer-link padding-top--24"},[a("span",[t._v("Don't have an account? "),a("a",{attrs:{href:"#"}},[t._v("Sign up")])]),t._v(" "),a("div",{staticClass:"listing padding-top--24 padding-bottom--24 flex-flex center-center"},[a("span",[a("a",{attrs:{href:"#"}},[t._v("© PayRollSystem")])]),t._v(" "),a("span",[a("a",{attrs:{href:"#"}},[t._v("qq2388521275")])]),t._v(" "),a("span",[a("a",{attrs:{href:"#"}},[t._v("Privacy & terms")])])])])}]};var p=a("VU/8")(u,h,!1,function(t){a("WI4c")},"data-v-2fb82a23",null).exports,v={name:"app",data:function(){return{cards:{Mon:{start:"",end:"",aid:null,commit:0},Tue:{start:"",end:"",aid:null,commit:0},Wed:{start:"",end:"",aid:null,commit:0},Thu:{start:"",end:"",aid:null,commit:0},Fri:{start:"",end:"",aid:null,commit:0}},sheetVO:[],loading:!1}},created:function(){this.querySheet(this.$cookies.get("userName"))},methods:{querySheet:function(t){var e=this;this.loading=!0,fetch("/apis/Sheet/query?eid="+t,{method:"get"}).then(function(t){return t.json()}).then(function(t){return e.parseQuery(t.content)}).then(function(){return e.loading=!1}).catch(function(t){e.loading=!1,e.$message.error("读取考勤卡失败")})},parseQuery:function(t){var e=this;t.forEach(function(t,a){if(null!=t)switch(a){case 0:e.cards.Mon.start=t.workstart,e.cards.Mon.end=t.workend,e.cards.Mon.aid=t.aid,e.cards.Mon.commit=t.commit;break;case 1:e.cards.Tue.start=t.workstart,e.cards.Tue.end=t.workend,e.cards.Tue.aid=t.aid,e.cards.Tue.commit=t.commit;break;case 2:e.cards.Wed.start=t.workstart,e.cards.Wed.end=t.workend,e.cards.Wed.aid=t.aid,e.cards.Wed.commit=t.commit;break;case 3:e.cards.Thu.start=t.workstart,e.cards.Thu.end=t.workend,e.cards.Thu.aid=t.aid,e.cards.Thu.commit=t.commit;break;case 4:e.cards.Fri.start=t.workstart,e.cards.Fri.end=t.workend,e.cards.Fri.aid=t.aid,e.cards.Fri.commit=t.commit}}),this.checkCommitted()},checkCommitted:function(){var t=(new Date).getDay();0===t&&(t=7),(1===this.cards.Mon.commit||t<1)&&(document.getElementById("MonSubmit").disabled=!0),(1===this.cards.Tue.commit||t<2)&&(document.getElementById("TueSubmit").disabled=!0),(1===this.cards.Wed.commit||t<3)&&(document.getElementById("WedSubmit").disabled=!0),(1===this.cards.Thu.commit||t<4)&&(document.getElementById("ThuSubmit").disabled=!0),(1===this.cards.Fri.commit||t<5)&&(document.getElementById("FriSubmit").disabled=!0)},confirmSubmit:function(t){!0===window.confirm("确认提交吗，提交后将不可修改")&&this.submitOneCard(t)},submitOneCard:function(t){var e=this;switch(t){case 1:null==this.cards.Mon.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Mon.start+"&workend="+this.cards.Mon.end+"&weekday=1&commit=1",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Mon.aid+"&workstart="+this.cards.Mon.start+"&workend="+this.cards.Mon.end+"&commit=1",{method:"get"});break;case 2:null==this.cards.Tue.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Tue.start+"&workend="+this.cards.Tue.end+"&weekday=2&commit=1",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Tue.aid+"&workstart="+this.cards.Tue.start+"&workend="+this.cards.Tue.end+"&commit=1",{method:"get"});break;case 3:null==this.cards.Wed.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Wed.start+"&workend="+this.cards.Wed.end+"&weekday=3&commit=1",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Wed.aid+"&workstart="+this.cards.Wed.start+"&workend="+this.cards.Wed.end+"&commit=1",{method:"get"});break;case 4:null==this.cards.Thu.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Thu.start+"&workend="+this.cards.Thu.end+"&weekday=4&commit=1",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Thu.aid+"&workstart="+this.cards.Thu.start+"&workend="+this.cards.Thu.end+"&commit=1",{method:"get"});break;case 5:null==this.cards.Fri.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Fri.start+"&workend="+this.cards.Fri.end+"&weekday=5&commit=1",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Fri.aid+"&workstart="+this.cards.Fri.start+"&workend="+this.cards.Fri.end+"&commit=1",{method:"get"})}setTimeout(function(){e.querySheet(e.$cookies.get("userName"))},300)},saveAllCards:function(){var t=this;this.loading=!0,""!==this.cards.Mon.start&&""!==this.cards.Mon.commit&&1!==this.cards.Mon.commit&&(null==this.cards.Mon.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Mon.start+"&workend="+this.cards.Mon.end+"&weekday=1&commit=0",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Mon.aid+"&workstart="+this.cards.Mon.start+"&workend="+this.cards.Mon.end+"&commit=0",{method:"get"})),""!==this.cards.Tue.start&&""!==this.cards.Tue.commit&&1!==this.cards.Tue.commit&&(null==this.cards.Tue.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Tue.start+"&workend="+this.cards.Tue.end+"&weekday=2&commit=0",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Tue.aid+"&workstart="+this.cards.Tue.start+"&workend="+this.cards.Tue.end+"&commit=0",{method:"get"})),""!==this.cards.Wed.start&&""!==this.cards.Wed.commit&&1!==this.cards.Wed.commit&&(null==this.cards.Wed.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Wed.start+"&workend="+this.cards.Wed.end+"&weekday=3&commit=0",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Wed.aid+"&workstart="+this.cards.Wed.start+"&workend="+this.cards.Wed.end+"&commit=0",{method:"get"})),""!==this.cards.Thu.start&&""!==this.cards.Thu.commit&&1!==this.cards.Thu.commit&&(null==this.cards.Thu.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Thu.start+"&workend="+this.cards.Thu.end+"&weekday=4&commit=0",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Thu.aid+"&workstart="+this.cards.Thu.start+"&workend="+this.cards.Thu.end+"&commit=0",{method:"get"})),""!==this.cards.Fri.start&&""!==this.cards.Fri.commit&&1!==this.cards.Fri.commit&&(null==this.cards.Fri.aid?fetch("/apis/Sheet/add?eid="+this.$cookies.get("userName")+"&workstart="+this.cards.Fri.start+"&workend="+this.cards.Fri.end+"&weekday=5&commit=0",{method:"get"}):fetch("/apis/Sheet/update?aid="+this.cards.Fri.aid+"&workstart="+this.cards.Fri.start+"&workend="+this.cards.Fri.end+"&commit=0",{method:"get"})),setTimeout(function(){t.querySheet(t.$cookies.get("userName"),t.$message({message:"保存成功",type:"success"}))},400)}}},f={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticStyle:{"text-align":"center"},attrs:{id:"sheetMain"}},[a("div",{attrs:{id:"title"}},[a("h1",[t._v(t._s(this.$cookies.get("userName"))+"考勤卡")])]),t._v(" "),a("div",{directives:[{name:"loading",rawName:"v-loading",value:t.loading,expression:"loading"}],attrs:{id:"timeCards","element-loading-text":"拼命加载中"}},[a("table",{staticStyle:{width:"100%","text-align":"center","font-size":"30px"}},[t._m(0),t._v(" "),a("tbody",[a("tr",[a("td",[t._v("周一")]),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"上班时间","default-value":"10:00",disabled:t.cards.Mon.commit,"picker-options":{start:"07:00",step:"00:30",end:"21:30",maxTime:t.cards.Mon.end}},model:{value:t.cards.Mon.start,callback:function(e){t.$set(t.cards.Mon,"start",e)},expression:"cards.Mon.start"}})],1),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"下班时间","default-value":"20:00",disabled:t.cards.Mon.commit,"picker-options":{start:"07:30",step:"00:30",end:"22:00",minTime:t.cards.Mon.start}},model:{value:t.cards.Mon.end,callback:function(e){t.$set(t.cards.Mon,"end",e)},expression:"cards.Mon.end"}})],1),t._v(" "),a("td",[a("button",{attrs:{id:"MonSubmit"},on:{click:function(e){return t.confirmSubmit(1)}}},[t._v("提交")])])]),t._v(" "),a("tr",[a("td",[t._v("周二")]),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"上班时间","default-value":"10:00",disabled:t.cards.Tue.commit,"picker-options":{start:"07:00",step:"00:30",end:"21:30",maxTime:t.cards.Tue.end}},model:{value:t.cards.Tue.start,callback:function(e){t.$set(t.cards.Tue,"start",e)},expression:"cards.Tue.start"}})],1),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"下班时间","default-value":"20:00",disabled:t.cards.Tue.commit,"picker-options":{start:"07:30",step:"00:30",end:"22:00",minTime:t.cards.Tue.start}},model:{value:t.cards.Tue.end,callback:function(e){t.$set(t.cards.Tue,"end",e)},expression:"cards.Tue.end"}})],1),t._v(" "),a("td",[a("button",{attrs:{id:"TueSubmit"},on:{click:function(e){return t.confirmSubmit(2)}}},[t._v("提交")])])]),t._v(" "),a("tr",[a("td",[t._v("周三")]),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"上班时间","default-value":"10:00",disabled:t.cards.Wed.commit,"picker-options":{start:"07:00",step:"00:30",end:"21:30",maxTime:t.cards.Wed.end}},model:{value:t.cards.Wed.start,callback:function(e){t.$set(t.cards.Wed,"start",e)},expression:"cards.Wed.start"}})],1),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"下班时间","default-value":"20:00",disabled:t.cards.Wed.commit,"picker-options":{start:"07:30",step:"00:30",end:"22:00",minTime:t.cards.Wed.start}},model:{value:t.cards.Wed.end,callback:function(e){t.$set(t.cards.Wed,"end",e)},expression:"cards.Wed.end"}})],1),t._v(" "),a("td",[a("button",{attrs:{id:"WedSubmit"},on:{click:function(e){return t.confirmSubmit(3)}}},[t._v("提交")])])]),t._v(" "),a("tr",[a("td",[t._v("周四")]),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"上班时间","default-value":"10:00",disabled:t.cards.Thu.commit,"picker-options":{start:"07:00",step:"00:30",end:"21:30",maxTime:t.cards.Thu.end}},model:{value:t.cards.Thu.start,callback:function(e){t.$set(t.cards.Thu,"start",e)},expression:"cards.Thu.start"}})],1),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"下班时间","default-value":"20:00",disabled:t.cards.Thu.commit,"picker-options":{start:"07:30",step:"00:30",end:"22:00",minTime:t.cards.Thu.start}},model:{value:t.cards.Thu.end,callback:function(e){t.$set(t.cards.Thu,"end",e)},expression:"cards.Thu.end"}})],1),t._v(" "),a("td",[a("button",{attrs:{id:"ThuSubmit"},on:{click:function(e){return t.confirmSubmit(4)}}},[t._v("提交")])])]),t._v(" "),a("tr",[a("td",[t._v("周五")]),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"上班时间","default-value":"10:00",disabled:t.cards.Fri.commit,"picker-options":{start:"07:00",step:"00:30",end:"21:30",maxTime:t.cards.Fri.end}},model:{value:t.cards.Fri.start,callback:function(e){t.$set(t.cards.Fri,"start",e)},expression:"cards.Fri.start"}})],1),t._v(" "),a("td",[a("el-time-select",{attrs:{placeholder:"下班时间","default-value":"20:00",disabled:t.cards.Fri.commit,"picker-options":{start:"07:30",step:"00:30",end:"22:00",minTime:t.cards.Fri.start}},model:{value:t.cards.Fri.end,callback:function(e){t.$set(t.cards.Fri,"end",e)},expression:"cards.Fri.end"}})],1),t._v(" "),a("td",[a("button",{attrs:{id:"FriSubmit"},on:{click:function(e){return t.confirmSubmit(5)}}},[t._v("提交")])])])])]),t._v(" "),a("div",{attrs:{id:"saveCards"}},[a("button",{attrs:{id:"saveCardsBtn"},on:{click:t.saveAllCards}},[t._v("保存")])])])])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("thead",[e("tr",[e("th"),this._v(" "),e("th",[this._v("上班时间")]),this._v(" "),e("th",[this._v("下班时间")]),this._v(" "),e("th",[this._v("操作")])])])}]};var b=a("VU/8")(v,f,!1,function(t){a("Sfyq")},"data-v-454247d6",null).exports,g={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("el-container",{staticClass:"main"},[a("el-aside",[a("el-menu",{staticClass:"el-menu-vertical",attrs:{"background-color":"#545c64","text-color":"#fff","active-text-color":"#ffd04b",router:"false"}},[a("el-menu-item",{attrs:{index:"1",route:"/Sheet"}},[a("i",{staticClass:"el-icon-finished"}),t._v(" "),a("span",{attrs:{slot:"title"},slot:"title"},[t._v("考勤卡")])]),t._v(" "),a("el-submenu",{attrs:{index:"2"}},[a("template",{slot:"title"},[a("i",{staticClass:"el-icon-user-solid"}),t._v(" "),a("span",[t._v("用户管理")])]),t._v(" "),a("el-menu-item-group",[a("el-menu-item",{attrs:{index:"/employee/add"}},[a("i",{staticClass:"el-icon-circle-plus-outline"}),t._v("添加员工")]),t._v(" "),a("el-menu-item",{attrs:{index:"/employee/query"}},[a("i",{staticClass:"el-icon-search"}),t._v("查询员工信息")])],1)],2),t._v(" "),a("el-menu-item",{attrs:{index:"3",disabled:""}},[a("i",{staticClass:"el-icon-document"}),t._v(" "),a("span",{attrs:{slot:"title"},slot:"title"},[t._v("导航三")])]),t._v(" "),a("el-menu-item",{attrs:{index:"4",disabled:""}},[a("i",{staticClass:"el-icon-setting"}),t._v(" "),a("span",{attrs:{slot:"title"},slot:"title"},[t._v("导航四")])])],1)],1),t._v(" "),a("el-main",[a("router-view")],1)],1)},staticRenderFns:[]};var x=a("VU/8")({name:"Main",methods:{}},g,!1,function(t){a("BOKK")},"data-v-7ddc2067",null).exports,_={name:"Add",data:function(){var t=this;return{form:{paytype:"带薪",salaryway:"自取",ename:null,esex:"男",eposition:null,department:null,phonenumber:null,email:null,tex_remission:0,timelimit:0,vacation_day:0,eid:null,password:null,password1:null,hoursalary:20},rules:{password1:[{validator:function(e,a,s){""===a?s(new Error("请再次输入密码")):a!==t.form.password?s(new Error("两次输入密码不一致!")):s()},trigger:"blur"}]},loading:!1}},methods:{onSubmit:function(t){var e=this;this.$refs[t].validate(function(t){if(!t)return console.log("error submit!!"),!1;e.loading=!0;var a=new URLSearchParams;a.append("jsonString",d()(e.form)),fetch("/apis/employee/insert",{method:"post",headers:{"Content-Type":"application/x-www-form-urlencoded;charset=utf-8;"},body:a}).then(function(t){return t.json()}).then(function(t){return e.afterSubmit(t)})})},afterSubmit:function(t){this.loading=!1,"200"===d()(t.status)?this.$message.success("添加成功"):(console.error(t.content),this.$message.error(t.content))}}},y={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("el-form",{directives:[{name:"loading",rawName:"v-loading",value:t.loading,expression:"loading"}],ref:"form",staticStyle:{width:"80%"},attrs:{model:t.form,"label-width":"80px","label-position":"left","status-icon":"",rules:t.rules,"element-loading-text":"处理中"}},[a("el-form-item",{attrs:{label:"员工类型"}},[a("el-radio-group",{model:{value:t.form.paytype,callback:function(e){t.$set(t.form,"paytype",e)},expression:"form.paytype"}},[a("el-radio",{attrs:{label:"小时工"}},[t._v("小时工")]),t._v(" "),a("el-radio",{attrs:{label:"带薪"}},[t._v("带薪")]),t._v(" "),a("el-radio",{attrs:{label:"销售员"}},[t._v("销售员")])],1)],1),t._v(" "),a("el-form-item",{attrs:{label:"小时薪资"}},[a("el-input",{staticStyle:{width:"5%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:t.form.hoursalary,callback:function(e){t.$set(t.form,"hoursalary",e)},expression:"form.hoursalary"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"付款方式"}},[a("el-radio-group",{model:{value:t.form.salaryway,callback:function(e){t.$set(t.form,"salaryway",e)},expression:"form.salaryway"}},[a("el-radio",{attrs:{label:"自取"}},[t._v("自取")]),t._v(" "),a("el-radio",{attrs:{label:"邮寄支票"}},[t._v("邮寄支票")]),t._v(" "),a("el-radio",{attrs:{label:"转账"}},[t._v("转账")])],1)],1),t._v(" "),a("el-form-item",{attrs:{label:"员工姓名"}},[a("el-input",{staticStyle:{width:"10%"},attrs:{type:"text",maxlength:"15"},model:{value:t.form.ename,callback:function(e){t.$set(t.form,"ename",e)},expression:"form.ename"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"员工性别"}},[a("el-radio-group",{model:{value:t.form.esex,callback:function(e){t.$set(t.form,"esex",e)},expression:"form.esex"}},[a("el-radio",{attrs:{label:"男"}},[t._v("男")]),t._v(" "),a("el-radio",{attrs:{label:"女"}},[t._v("女")])],1)],1),t._v(" "),a("el-form-item",{attrs:{label:"职务"}},[a("el-input",{staticStyle:{width:"20%"},attrs:{type:"text",maxlength:"20"},model:{value:t.form.eposition,callback:function(e){t.$set(t.form,"eposition",e)},expression:"form.eposition"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"部门"}},[a("el-input",{staticStyle:{width:"20%"},attrs:{type:"text",maxlength:"20"},model:{value:t.form.department,callback:function(e){t.$set(t.form,"department",e)},expression:"form.department"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"电话",prop:"phonenumber",rules:[{type:"number",message:"请输入正确格式"}]}},[a("el-input",{staticStyle:{width:"20%"},attrs:{"auto-complete":"off",maxlength:"20",size:"small"},model:{value:t.form.phonenumber,callback:function(e){t.$set(t.form,"phonenumber",t._n(e))},expression:"form.phonenumber"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"电子邮件"}},[a("el-input",{staticStyle:{width:"20%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:t.form.email,callback:function(e){t.$set(t.form,"email",e)},expression:"form.email"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"税收减免"}},[a("el-input",{staticStyle:{width:"5%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:t.form.tex_remission,callback:function(e){t.$set(t.form,"tex_remission",e)},expression:"form.tex_remission"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"工时限制"}},[a("el-input",{staticStyle:{width:"5%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:t.form.timelimit,callback:function(e){t.$set(t.form,"timelimit",e)},expression:"form.timelimit"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"年假"}},[a("el-input",{staticStyle:{width:"5%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:t.form.vacation_day,callback:function(e){t.$set(t.form,"vacation_day",e)},expression:"form.vacation_day"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"登录名",prop:"eid",rules:[{required:!0,mes2222sage:"请输入登录名",trigger:"blur"}]}},[a("el-input",{staticStyle:{width:"20%"},attrs:{maxlength:"20",size:"small"},model:{value:t.form.eid,callback:function(e){t.$set(t.form,"eid",e)},expression:"form.eid"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"密码",prop:"password",rules:[{required:!0,message:"请输入密码",trigger:"blur"}]}},[a("el-input",{staticStyle:{width:"20%"},attrs:{type:"password",maxlength:"20",size:"small","show-password":""},model:{value:t.form.password,callback:function(e){t.$set(t.form,"password",e)},expression:"form.password"}})],1),t._v(" "),a("el-form-item",{attrs:{label:"确认密码",prop:"password1"}},[a("el-input",{staticStyle:{width:"20%"},attrs:{type:"password",maxlength:"20",size:"small","show-password":""},model:{value:t.form.password1,callback:function(e){t.$set(t.form,"password1",e)},expression:"form.password1"}})],1),t._v(" "),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:function(e){return t.onSubmit("form")}}},[t._v("添加员工")]),t._v(" "),a("el-button",[t._v("撤销")])],1)],1)},staticRenderFns:[]};var w=a("VU/8")(_,y,!1,function(t){a("sAva")},"data-v-df48504e",null).exports,k={name:"Query",data:function(){return{tableData:[{}],loading:!1,dialogFormVisible:!1,dialogIndex:0}},created:function(){this.queryEmployee()},methods:{queryEmployee:function(){var t=this;this.loading=!0,setTimeout(function(){fetch("/apis/employee/queryAll",{method:"get"}).then(function(t){return t.json()}).then(function(e){return t.tableData=e.content}).then(function(){return t.loading=!1}).catch(function(e){t.loading=!1,t.$message.error("读取员工失败")})},500)},deleteEmployee:function(t){var e=this;this.loading=!0,fetch("/apis/employee/delete?eid="+this.tableData[t].eid,{method:"get"}).then(function(){e.$message.success("删除成功")}).then(function(){e.queryEmployee()})},updateEmployee:function(){var t=this;this.dialogFormVisible=!1,this.loading=!0;var e=new URLSearchParams;e.append("jsonString",d()(this.tableData[this.dialogIndex])),fetch("/apis/employee/update",{method:"POST",headers:{"Content-Type":"application/x-www-form-urlencoded;charset=utf-8;"},body:e}).then(function(){t.$message.success("修改成功")}).then(function(){t.queryEmployee()})}}},S={render:function(){var t=this,e=this,a=e.$createElement,s=e._self._c||a;return s("el-container",[s("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticStyle:{width:"100%"},attrs:{data:e.tableData,border:"",stripe:"","element-loading-text":"加载中"}},[s("el-table-column",{attrs:{prop:"eid",label:"用户名",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{prop:"ename",label:"姓名",width:"90"}}),e._v(" "),s("el-table-column",{attrs:{prop:"password",label:"密码",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{prop:"esex",label:"性别",width:"60"}}),e._v(" "),s("el-table-column",{attrs:{prop:"paytype",label:"员工类型",width:"80"}}),e._v(" "),s("el-table-column",{attrs:{prop:"salaryway",label:"支付方式",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{prop:"hoursalary",label:"小时工资",width:"80"}}),e._v(" "),s("el-table-column",{attrs:{prop:"eposition",label:"职位",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{prop:"department",label:"部门",width:"100"}}),e._v(" "),s("el-table-column",{attrs:{prop:"phonenumber",label:"电话",width:"150"}}),e._v(" "),s("el-table-column",{attrs:{prop:"email",label:"邮件",width:"200"}}),e._v(" "),s("el-table-column",{attrs:{prop:"tex_remission",label:"税收减免",width:"80"}}),e._v(" "),s("el-table-column",{attrs:{prop:"timelimit",label:"工时限制",width:"80"}}),e._v(" "),s("el-table-column",{attrs:{prop:"vacation_day",label:"年假",width:"80"}}),e._v(" "),s("el-table-column",{attrs:{fixed:"right",label:"操作",width:"100"},scopedSlots:e._u([{key:"default",fn:function(t){return[s("el-button",{attrs:{type:"text",size:"small"},on:{click:function(a){e.dialogIndex=t.$index,e.dialogFormVisible=!0}}},[e._v("编辑")]),e._v(" "),s("el-button",{attrs:{type:"text",size:"small"},on:{click:function(a){return e.deleteEmployee(t.$index)}}},[e._v("删除")])]}}])})],1),e._v(" "),s("el-dialog",{attrs:{title:"编辑员工",visible:e.dialogFormVisible},on:{"update:visible":function(t){e.dialogFormVisible=t}}},[s("el-form",{attrs:{model:e.tableData[e.dialogIndex]}},[s("el-form-item",{attrs:{label:"员工类型"}},[s("el-radio-group",{model:{value:e.tableData[e.dialogIndex].paytype,callback:function(t){e.$set(e.tableData[e.dialogIndex],"paytype",t)},expression:"tableData[dialogIndex].paytype"}},[s("el-radio",{attrs:{label:"小时工"}},[e._v("小时工")]),e._v(" "),s("el-radio",{attrs:{label:"带薪"}},[e._v("带薪")]),e._v(" "),s("el-radio",{attrs:{label:"销售员"}},[e._v("销售员")])],1)],1),e._v(" "),s("el-form-item",{attrs:{label:"小时薪资"}},[s("el-input",{staticStyle:{width:"10%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:e.tableData[e.dialogIndex].hoursalary,callback:function(t){e.$set(e.tableData[e.dialogIndex],"hoursalary",t)},expression:"tableData[dialogIndex].hoursalary"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"付款方式"}},[s("el-radio-group",{model:{value:e.tableData[e.dialogIndex].salaryway,callback:function(t){e.$set(e.tableData[e.dialogIndex],"salaryway",t)},expression:"tableData[dialogIndex].salaryway"}},[s("el-radio",{attrs:{label:"自取"}},[e._v("自取")]),e._v(" "),s("el-radio",{attrs:{label:"邮寄支票"}},[e._v("邮寄支票")]),e._v(" "),s("el-radio",{attrs:{label:"转账"}},[e._v("转账")])],1)],1),e._v(" "),s("el-form-item",{attrs:{label:"员工姓名"}},[s("el-input",{staticStyle:{width:"10%"},attrs:{type:"text",maxlength:"15"},model:{value:e.tableData[e.dialogIndex].ename,callback:function(t){e.$set(e.tableData[e.dialogIndex],"ename",t)},expression:"tableData[dialogIndex].ename"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"员工性别"}},[s("el-radio-group",{model:{value:e.tableData[e.dialogIndex].esex,callback:function(t){e.$set(e.tableData[e.dialogIndex],"esex",t)},expression:"tableData[dialogIndex].esex"}},[s("el-radio",{attrs:{label:"男"}},[e._v("男")]),e._v(" "),s("el-radio",{attrs:{label:"女"}},[e._v("女")])],1)],1),e._v(" "),s("el-form-item",{attrs:{label:"职务"}},[s("el-input",{staticStyle:{width:"20%"},attrs:{type:"text",maxlength:"20"},model:{value:e.tableData[e.dialogIndex].eposition,callback:function(t){e.$set(e.tableData[e.dialogIndex],"eposition",t)},expression:"tableData[dialogIndex].eposition"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"部门"}},[s("el-input",{staticStyle:{width:"20%"},attrs:{type:"text",maxlength:"20"},model:{value:e.tableData[e.dialogIndex].department,callback:function(t){e.$set(e.tableData[e.dialogIndex],"department",t)},expression:"tableData[dialogIndex].department"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"电话",rules:[{type:"number",message:"请输入正确格式"}]}},[s("el-input",{staticStyle:{width:"20%"},attrs:{"auto-complete":"off",maxlength:"20",size:"small"},model:{value:e.tableData[e.dialogIndex].phonenumber,callback:function(t){e.$set(e.tableData[e.dialogIndex],"phonenumber",t)},expression:"tableData[dialogIndex].phonenumber"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"电子邮件"}},[s("el-input",{staticStyle:{width:"20%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:e.tableData[e.dialogIndex].email,callback:function(t){e.$set(e.tableData[e.dialogIndex],"email",t)},expression:"tableData[dialogIndex].email"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"税收减免"}},[s("el-input",{staticStyle:{width:"6%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:e.tableData[e.dialogIndex].tex_remission,callback:function(t){e.$set(e.tableData[e.dialogIndex],"tex_remission",t)},expression:"tableData[dialogIndex].tex_remission"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"工时限制"}},[s("el-input",{staticStyle:{width:"6%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:e.tableData[e.dialogIndex].timelimit,callback:function(t){e.$set(e.tableData[e.dialogIndex],"timelimit",t)},expression:"tableData[dialogIndex].timelimit"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"年假"}},[s("el-input",{staticStyle:{width:"6%"},attrs:{type:"text",maxlength:"20",size:"small"},model:{value:e.tableData[e.dialogIndex].vacation_day,callback:function(t){e.$set(e.tableData[e.dialogIndex],"vacation_day",t)},expression:"tableData[dialogIndex].vacation_day"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"登录名"}},[s("el-input",{staticStyle:{width:"20%"},attrs:{maxlength:"20",size:"small",disabled:""},model:{value:e.tableData[e.dialogIndex].eid,callback:function(t){e.$set(e.tableData[e.dialogIndex],"eid",t)},expression:"tableData[dialogIndex].eid"}})],1),e._v(" "),s("el-form-item",{attrs:{label:"密码",prop:"password",rules:[{required:!0,message:"请输入密码",trigger:"blur"}]}},[s("el-input",{staticStyle:{width:"20%"},attrs:{type:"password",maxlength:"20",size:"small","show-password":""},model:{value:e.tableData[e.dialogIndex].password,callback:function(t){e.$set(e.tableData[e.dialogIndex],"password",t)},expression:"tableData[dialogIndex].password"}})],1)],1),e._v(" "),s("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[s("el-button",{on:{click:function(){t.dialogFormVisible=!1,t.queryEmployee}}},[e._v("取 消")]),e._v(" "),s("el-button",{attrs:{type:"primary"},on:{click:e.updateEmployee}},[e._v("确 定")])],1)],1)],1)},staticRenderFns:[]},T=a("VU/8")(k,S,!1,null,null,null).exports;s.default.use(r.a);var $=new r.a({routes:[{path:"/",component:p},{path:"/HelloWorld",component:m},{path:"/Main",component:x,children:[{path:"/Sheet",component:b},{path:"/employee/add",component:w},{path:"/employee/query",component:T}]}]}),C=a("ppUw"),M=a.n(C),D=a("7t+N"),I=a.n(D),F=a("zL8q"),N=a.n(F);a("tvR6");s.default.use(M.a),s.default.use(I.a),s.default.use(N.a),s.default.config.productionTip=!1,new s.default({el:"#app",router:$,components:{App:l},template:"<App/>"})},Sfyq:function(t,e){},WI4c:function(t,e){},sAKk:function(t,e){},sAva:function(t,e){},tvR6:function(t,e){}},["NHnr"]);