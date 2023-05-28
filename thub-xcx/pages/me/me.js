// pages/me/me.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    // images
    imageSrc: 'https://tdesign.gtimg.com/miniprogram/images/image1.jpeg',
     // tabbar
     value: 'me',
     list: [
      { value: 'index', icon: 'home', ariaLabel: '首页' },
      { value: 'hub', icon: 'app', ariaLabel: '试题' },
      { value: 'test', icon: 'chat', ariaLabel: '测试' },
      { value: 'me', icon: 'user', ariaLabel: '我的' },
    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },
  TabbarOnChange(e) {
    this.setData({
      value: e.detail.value,
    });
    wx.reLaunch({
      url: '/pages/'+e.detail.value+"/"+e.detail.value,
    })
  },
  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})