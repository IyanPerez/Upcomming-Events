<script setup>
import { ref,onBeforeMount } from "vue";

const featureEvents = defineProps({
  title: {
    type: String,
    default: 'evento prueba'

  },

  img: {
    type: String,
    default: '../../src/assets/img/Login-background.png'
  },
});


</script>
<template>
  <div class="card">
    <h1 class="card__title">{{ title }}</h1>
    <picture class="card__img">
      <img :src="img" alt="title-img" />

      hola 
    </picture>
  </div>
</template>
<style lang="scss" scope></style>
