<script setup>
import { RouterView } from 'vue-router'
import HeaderComponent from './components/header/HeaderComponent.vue';

</script>

<template>
   <!-- <RouterView/>   -->
   <HeaderComponent/>
</template>

<style lang="scss" scoped>
main {
  width: 100%;
  .wrapper {
    width: 50%;
  }
}
</style>
