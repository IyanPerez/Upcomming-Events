<script setup>
import LoginComponent from '@/components/login/LoginComponent.vue';
</script>

<template>
    <main>
    <LoginComponent
    :title="'Login Account'"
    />
    </main>
</template>

<style lang="scss" scoped>
    main{
        background-image: url("../assets/img/Login-background.png");
        width: 100%;
        background-position: 100%;
        background-size: center/100%;
        height: 100vh;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
    }
</style>