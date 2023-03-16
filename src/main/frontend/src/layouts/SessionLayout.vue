<script setup>
import { RouterView } from 'vue-router'
import HeaderComponent from '../components/header/HeaderComponent.vue';
import FooterComponent from '../components/footer/FooterComponent.vue';
</script>
<template>
    <HeaderComponent/>
    <RouterView/>
    <FooterComponent/>
</template>
<style lang="scss" scoped>
    
</style>