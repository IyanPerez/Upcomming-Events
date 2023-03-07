<script setup>
import CardsComponent from '../components/CardsComponent.vue';
import DetailsForm from '../components/DetailsForm.vue';
import { computed } from 'vue';
import { useLoginStore } from '../stores/loginStore';
import axios from 'axios';

const useloginstore = useLoginStore();

const showInfo = computed(()=>{
    return (useloginstore.statusLogin == 202) ? 'show' : 'hidden';
})

axios.get('http://localhost:8080/api/events',{auth:{username:useloginstore.login.username, password:useloginstore.login.password}})

</script>

<template>
<CardsComponent /> <DetailsForm />

<h1 :class="showInfo">hola usuario logged</h1>
<CardsComponent />
        
    
</template>


<style lang="scss" scoped>

.show{
    visibility: visible;
}
.hidden{
    visibility: hidden;
}
</style>