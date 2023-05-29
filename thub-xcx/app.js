// app.js
App({
  onLaunch() {
    var that = this;
    // 获取屏幕高度
    wx.getSystemInfo({
      success: function (res) {
        that.globalData.windowHeight = res.windowHeight
      }
    })
    // 展示本地存储能力
    const logs = wx.getStorageSync('logs') || []
    logs.unshift(Date.now())
    wx.setStorageSync('logs', logs)

    // 登录
    wx.login({
      success: res => {
        // 发送 res.code 到后台换取 openId, sessionKey, unionId
        //发起网络请求
        console.log(res.code)
        // wx.request({
        //   url: 'http://localhost:80801/',
        //   data: {
        //     code: res.code
        //   }
        // })
      }
    })
  },
  globalData: {
    userInfo: null,
    windowHeight: null
  }
})
