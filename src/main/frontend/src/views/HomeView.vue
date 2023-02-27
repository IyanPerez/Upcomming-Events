<script setup>
import LoginComponent from '@/components/login/LoginComponent.vue';
</script>

<template>
    <main>
    <LoginComponent/>
    </main>
</template>

<style lang="scss" scoped>
    main{
        background-image: url('../assets/img/login-background.png');
        width: 100%;
        height: 100vh;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
    }
</style>