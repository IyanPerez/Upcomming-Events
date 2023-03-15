<script setup>
import { useRouter } from 'vue-router';
import { useLoginStore } from '../../stores/loginStore';

const loginstore = useLoginStore();

const logOut = async ()=>{

    loginstore.logOut()
}
</script>
<template>
    <header>
        <nav class="nav-bar">
            
                <p>Create Event</p>
                <p>Home</p>
                <p @click="logOut()">Logout</p>
        
        </nav>
        <h1>Buy Amazing Tickets at wholesale prices</h1>
        
    </header>
</template>
<style lang="scss" scoped>

header{
    width: 100%;
    height: 15%;
    display: flex;
    flex-direction: column;
    background-image: url("../../assets/img/banner-img.png");
   background-size: 100%;

    .nav-bar{
        color: white;
        display: flex;
        flex-direction: row;
        justify-content: space-evenly;
    }
}
    
</style>