<script setup>
//  import { RouterLink, RouterView } from 'vue-router'
import DashboardView from "./views/DashboardView.vue";
import FeaturedEvents from "./components/FeaturedEvents.vue";
import DetailsForm from "./components/DetailsForm.vue";
import CardsComponent from "./components/CardsComponent.vue";
import Buttons from "./components/Buttons.vue";
</script>

<template>
  <!-- <main>
    <section class="wrapper"> -->
      <!-- <FeaturedEvents /> -->
    <!-- </section>
  </main> -->
   <!-- <RouterView/>   -->
  <!-- <DashboardView /> -->
  
  <CardsComponent/>
  <!-- <DetailsForm/> -->
</template>

<style lang="scss" scoped>
main {
  width: 100%;

  .wrapper {
    width: 50%;
  }
}
</style>
