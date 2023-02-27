import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: "/dashboard",
      name: "dashboard",
      component: () => import("../views/DashboardView.vue"),
      children: [
        {
          path: "create",
          name: "create",
          component: () => import("../views/CreateView.vue"),
        },
        {
          path: "details",
          name: "details",
          component: () => import("../views/DetailsView.vue"),
        },
        {
          path: "myevent",
          name: "myevent",
          component: () => import("../views/MyEventView.vue"),
    
        },
       ]

    },
   
  ],
});

export default router;
