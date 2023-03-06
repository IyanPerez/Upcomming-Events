<script setup>
import { ref,onBeforeMount } from "vue";

const featureEvents = defineProps({
  title: {
    type: String,
  },

  img: {
    type: String,
  },
});

// let feventsDetails = ref ({});
// let feventsTitle = ref();
// let feventsImg = ref ();

// onBeforeMount(async() => {
//       const resp = await fetch (featureEvents.title)
//       const data = await resp.json()
//       feventsTitle.value = feventsDetails


    
// }),
</script>
<template>
  <div class="card">
    <h1 class="card__title">{{ title }}</h1>
    <picture class="card__img">
      <img :src="img" salt="title-img" />

      hola 
    </picture>
  </div>
</template>
<style lang="scss" scope></style>
