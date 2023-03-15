<script setup>
import { RouterView } from 'vue-router'
import EditEvent from './views/EditEvent.vue';
</script>

<template>
   <RouterView/>  
   <!-- <EditEvent/> -->
</template>

<style lang="scss" scoped>
main {
  width: 100%;
  .wrapper {
    width: 50%;
  }
}
</style>
