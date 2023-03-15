<script setup>
import CardsComponent from '../components/CardsComponent.vue';
import DetailsForm from '../components/DetailsForm.vue';
import { eventStore } from '../stores/eventStoreTest';
import { onBeforeMount } from 'vue';

const eventstore = eventStore();

onBeforeMount(async() => {

   await eventstore.getAll();

})

const addUserToEvent=(id)=>{
  eventstore.addUserToEvent(1,id)
}

</script>

<template>
    <h1 class="mx-6 my-2">Create Event</h1>
    

    <div class="main">
        <CardsComponent
        :event="eventstore.events[0]" 
        @add-event="addUserToEvent(event.id)"/>
        <DetailsForm/>
    </div>


</template>

<style scoped lang="scss">

.main{
    display: flex;
    flex-wrap: wrap;
}

</style>