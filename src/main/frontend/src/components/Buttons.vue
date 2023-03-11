<script setup>
import { loadRouteLocation } from "vue-router";

function Send() {
  console.log("estoy enviando los datos");
}

function Delete() {
  console.log("estoy eliminando los datos");
}
</script>

<template>
  <div class="d-flex justify-center align-center flex-column flex-sm-row fill-height">
    
  <v-btn variant="flat" color="success" class="mr-2" v-on:click="Send()">SUBMIT</v-btn>
  <v-btn variant="flat" color="error"  class="mr-2" v-on:click="Delete()">DELETE</v-btn>
    <v-btn variant="flat" color="info" class="mr-2" v-on:click="Send()">ADD TO SLIDER</v-btn>
  </div>

  
</template>

<style lang="scss" scoped></style>
