<script setup>
<<<<<<< HEAD
//  import { RouterLink, RouterView } from 'vue-router'
import DashboardView from "./views/DashboardView.vue";
import FeaturedEvents from "./components/FeaturedEvents.vue";
import DetailsForm from "./components/DetailsForm.vue";
import CardsComponent from "./components/CardsComponent.vue";
import Buttons from "./components/Buttons.vue";
=======
import { RouterLink, RouterView } from 'vue-router'

import DashboardView from './views/DashboardView.vue';
>>>>>>> 623a0c4a634c704de4dac0e68d409086bf56c6cd
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

<<<<<<< HEAD
</template>
=======
<RouterView/>
<!-- <DashboardView/> -->
>>>>>>> 623a0c4a634c704de4dac0e68d409086bf56c6cd

<style lang="scss" scoped>
main {
  width: 100%;

  .wrapper {
    width: 50%;
  }
}
</style>
