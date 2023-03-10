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
  <div
    class="d-flex justify-space-around align-center flex-column flex-sm-row fill-height"
  >
    
  <v-btn variant="flat" color="success" v-on:click="Send()">SUBMIT</v-btn>
  <v-btn variant="flat" color="error" v-on:click="Delete()">DELETE</v-btn>
    <v-btn variant="flat" color="info" v-on:click="Send()">ADD TO SLIDER</v-btn>
  </div>

  
</template>

<style lang="scss" scoped></style>
