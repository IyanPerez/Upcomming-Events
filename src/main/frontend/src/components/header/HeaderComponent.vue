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
        <nav>
            <ul>
                <li>Create Event</li>
                <li>Home</li>
                <li @click="logOut()">Logout</li>
            </ul>
        </nav>
        <h1>Buy Amazing Tickets at wholesale prices</h1>
    </header>
</template>
<style lang="scss" scoped>
    
</style>