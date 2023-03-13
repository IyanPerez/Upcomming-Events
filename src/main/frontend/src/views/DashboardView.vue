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

    <CardsComponent :title="'carta'" :capacity="10" :description="'holaaaa'" />
    <!-- <CardsComponentTest /> -->


  </main>
</template>

<style lang="scss" scoped></style>