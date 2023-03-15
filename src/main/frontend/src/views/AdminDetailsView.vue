<script setup>
import CardsComponent from '../components/CardsComponent.vue';
import DetailsForm from '../components/DetailsForm.vue';
import { computed } from 'vue';
import { useLoginStore } from '../stores/loginStore';
import axios from 'axios';

const useloginstore = useLoginStore();

</script>

<template>
 <DetailsForm 
 :view="'edit'"
 />
</template>



<style lang="scss" scoped>

</style>