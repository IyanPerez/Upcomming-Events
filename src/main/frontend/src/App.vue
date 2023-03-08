<script setup>
// import { RouterLink, RouterView } from 'vue-router'
import DashboardView from "./views/DashboardView.vue";
import FeaturedEvents from "./components/FeaturedEvents.vue";
</script>

<template>
  <main>
    <section class="wrapper">
      <FeaturedEvents />
    </section>
  </main>
  <!-- <RouterView/> -->
  <DashboardView />
</template>

<style lang="scss" scoped>
main {
  width: 100%;

  .wrapper {
    width: 50%;
  }
}
</style>
