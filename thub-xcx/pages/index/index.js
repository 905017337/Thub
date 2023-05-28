// index.js
// 获取应用实例
const app = getApp()
const imageCdn = 'https://tdesign.gtimg.com/miniprogram/images';
const swiperList = [
  `${imageCdn}/swiper1.png`,
  `${imageCdn}/swiper2.png`,
  `${imageCdn}/swiper1.png`,
  `${imageCdn}/swiper2.png`,
  `${imageCdn}/swiper1.png`,
];
Page({
  data: {
    //空
    eyptyImage: '/images/answer.png',
    // 轮播图
    current: 0,
    autoplay: false,
    duration: 500,
    interval: 5000,
    swiperList,
    // 通知
    visible: true,
    navigatorProps: {
      url: '/pages/xxx/xxx',
    },
    // 宫格
    img1: 'https://tdesign.gtimg.com/miniprogram/images/example1.png',
    img2: 'https://tdesign.gtimg.com/miniprogram/images/example2.png',
    img3: 'https://tdesign.gtimg.com/miniprogram/images/example3.png',
   
    // 我的题库
    windowHeight: app.globalData.windowHeight,
     // tabbar
    value: 'index',
    list: [
      { value: 'index', icon: 'home', ariaLabel: '首页' },
      { value: 'hub', icon: 'app', ariaLabel: '试题' },
      { value: 'test', icon: 'chat', ariaLabel: '测试' },
      { value: 'me', icon: 'user', ariaLabel: '我的' },
    ]
  },
  onLoad() {

  },

  onTap(e) {
    const { index } = e.detail;
    console.log(index);
  },
  swiperOnChange(e) {
    const { current, source } = e.detail;
    console.log(current, source);
  },
  onImageLoad(e) {
    console.log(e.detail.index);
  },

  click(e) {
    const { trigger } = e.detail;
    console.log(`click on the ${trigger} area`);
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
