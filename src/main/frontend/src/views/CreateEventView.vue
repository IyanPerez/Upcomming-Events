<script setup>
import CardsComponent from '../components/CardsComponent.vue';
import DetailsForm from '../components/DetailsForm.vue';
import { useLoginStore } from '../stores/loginStore';
import { onBeforeMount } from 'vue';

const loginstore = useLoginStore();

</script>

<template>
    <h1 class="mx-6 my-2">Create Event</h1>
    

    <div class="main">
        <DetailsForm/>
    </div>


</template>

<style scoped lang="scss">

.main{
    display: flex;
    flex-wrap: wrap;
    height: 61vh;
    justify-content: center;
}

</style>