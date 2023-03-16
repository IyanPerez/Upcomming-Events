<script setup>
import { defineProps } from "vue";

import addButton from '../components/AddButton.vue'
const props = defineProps({
  event: {
    type: Object
  }
})
const emits = defineEmits(['addEvent'])

const emitAddEvent = () => {
  emits('addEvent', props.event.id)
}


</script>
<template>
  <v-card 
    class="card mx-auto "
  >
    <v-img
      class="align-end text-white"
      height="200"
      src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"
      cover
    >
      <v-card-title class="title"> <h3>{{ event.title }} </h3></v-card-title>
    </v-img>

    <v-card-subtitle class="subtitle pt-4 d-flex justify-space-between">
      <p class="card__date">{{ event.date_hour }}</p>    
      <p class="card__capacity">&#128100 Max.{{ event.number_participants }}</p>
    </v-card-subtitle>

    <v-card-text class="text">
      <h3>{{ event.title }} </h3>
      <p>{{ event.description }} </p>
      
    </v-card-text>

    <v-card-actions>
     

      <v-btn color="orange">
        <addButton @click="emitAddEvent()" />
      </v-btn>
    </v-card-actions>
  </v-card>
</template>


<style scoped lang="scss">

   @media (max-width: 1024px){
    .title{
        font-size: 11px;
      }
    .subtitle{
      font-size: 9px;
    }
    .text{
      font-size: 8px;
    }
  }

</style>
