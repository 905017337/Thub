// pages/hub/hub.js
const image = 'https://tdesign.gtimg.com/miniprogram/images/example2.png';
const items = new Array(12).fill({ label: '标题文字', image }, 0, 12);

Page({
  
  /**
   * 页面的初始数据
   */
  data: {
    // 选择器
    offsetTopList: [],
    sideBarIndex: 0,
    scrollTop: 0,
    categories: [
      {
        label: '建筑工程',
        title: '建筑工程',
        badgeProps: {},
        items,
      },
      {
        label: '会计财税',
        title: '会计财税',
        badgeProps: {
          dot: true,
        },
        items: items.slice(0, 10),
      },
      {
        label: '职业资格',
        title: '职业资格',
        badgeProps: {},
        items: items.slice(0, 6),
      },
      {
        label: '技能鉴定',
        title: '技能鉴定',
        badgeProps: {
          // count: 8,
        },
        items: items.slice(0, 8),
      },
      {
        label: '安全生产',
        title: '安全生产',
        badgeProps: {},
        // disabled: true,
        items: [],
      },
    ],
     // tabbar
     value: 'hub',
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

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },
  onSideBarChange(e) {
    const { value } = e.detail;
    this.setData({ sideBarIndex: value });
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

  },
  TabbarOnChange(e) {
    this.setData({
      value: e.detail.value,
    });
    wx.reLaunch({
      url: '/pages/'+e.detail.value+"/"+e.detail.value,
    })
  },
})