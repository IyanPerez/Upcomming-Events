import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import { useLoginStore } from '../stores/loginStore'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: "/session",
      name: "sessionLayout",
      component: () => import("../layouts/SessionLayout.vue"),
      meta: { requiresAuth: true },
      children: [
        {
          path: "user",
          name: "user",
          component: () => import("../layouts/UserLayout.vue"),
          children: [
            {
              path: "dashboard",
              name: "dashboard",
              component: () => import("../views/DashboardUser.vue")
            },
            {
              path: "details",
              name: "details",
              component: () => import("../views/UserDetails.vue")
            }
          ],
        },
        {
          path: "admin",
          name: "admin",
          component: () => import("../layouts/AdminLayout.vue"),
          children: [
            {
              path: "dashboard",
              name: "dashboard",
              component: () => import("../views/DashboardAdmin.vue")
            },
            {
              path: "details",
              name: "details",
              component: () => import("../views/UserDetails.vue")
            }
          ],
        }
      ],
    },
  ],
});
router.beforeEach((to, from) => {
  const store = useLoginStore();

  if(to.meta.requiresAuth && !store.isAuthenticate) return {name: 'home'}
  if(to.name == 'sessionLayout' && store.roleLogin == 'ROLE_USER') router.push({name:'dashboard'})
})
export default router
