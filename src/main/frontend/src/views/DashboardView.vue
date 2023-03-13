<script setup>
/* import CardsComponentTest from '../components/CardsComponentTest.vue'; */
import CardsComponent from '../components/CardsComponent.vue';
import axios from 'axios';
import api from '../api/interceptors/api';
import { eventStore } from '../stores/eventStoreTest';
import { onBeforeMount } from 'vue';
import eventPayload from '../api/apis/payloads/eventPayload'

const eventstore = eventStore();

onBeforeMount(() => {

  eventstore.getAll();

})

const props = defineProps({
  event: {
    type: eventPayload,
  }
})
</script>

<template>
  <main>

<<<<<<< HEAD
        <!-- <CardsComponentTest /> -->
     
    </main>
    
=======
    <CardsComponent :title="'carta'" :capacity="10" :description="'holaaaa'" />
    <!-- <CardsComponentTest /> -->
>>>>>>> 623a0c4a634c704de4dac0e68d409086bf56c6cd


  </main>
</template>

<style lang="scss" scoped></style>