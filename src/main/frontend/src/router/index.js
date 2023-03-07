import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import { useLoginStore } from '../stores/loginStore'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/details',
      name: 'userDetails',
      component: () => import("../views/UserDetails.vue"),
      meta: {requiresAuth: true}
    }
  ]
})
router.beforeEach((to, from) => {
  const store = useLoginStore();

  if(to.meta.requiresAuth && store.roleLogin == '') return {name: 'home'}
})
export default router
