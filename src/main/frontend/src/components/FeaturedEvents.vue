<script setup>
import { ref, onBeforeMount } from "vue";

const props = defineProps({
  event: {
    type: Object,
    
  }
});


</script>
<template>
  <div class="card">
    <h1 class="card__title">{{ event.title }}</h1>
    <div class="card__img">
      <img :src= "'../../src/assets/img/Login-background.png'" alt="title-img" />
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
