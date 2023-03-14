<script setup>
import { ref, onBeforeMount } from "vue";

const featureEvents = defineProps({
  title: {
    type: String,
    default: "evento prueba",
  },

  img: {
    type: String,
    default: "../../src/assets/img/Login-background.png",
  },
});
</script>
<template>
  <div class="card">
    <h1 class="card__title">{{ title }}</h1>
    <div class="card__img">
      <img :src="img" alt="title-img" />
    </div>
  </div>
</template>
<style lang="scss" scope>
.card {
  width: 100%;
  position: relative;

  .card__title {
    position: relative;
    left: 20px;
    top: 55px;
    z-index: 10;
    font-size: large;
    color: white;
  }
  .card__img {
    width: 100%;
    img {
      object-fit: cover;
      width: 100%;
      height: 15vh;
      border-radius: 1rem;
    }
  }
}
</style>
