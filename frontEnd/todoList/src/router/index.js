import Vue from 'vue'
import VueRouter from 'vue-router'

// 引入组件
import login from '../components/login.vue'
// 要告诉 vue 使用 vueRouter
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    component: login
  }
]

var router = new VueRouter({
  routes
})
export default router
