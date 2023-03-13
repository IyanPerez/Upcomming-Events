<script setup>
import CardsComponent from '../components/CardsComponent.vue';
import DetailsForm from '../components/DetailsForm.vue';


</script>

<template>
    <h1 class="mx-4 mt-4">Create Event</h1>
    

    <div class="main">
        <CardsComponent/>
        <DetailsForm/>
    </div>


</template>

<style scoped lang="scss">

.main{
    display: flex;
    flex-wrap: wrap;
}

</style>