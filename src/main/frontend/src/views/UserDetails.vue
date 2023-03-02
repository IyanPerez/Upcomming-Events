<script setup>
import CardsComponent from '../components/CardsComponent.vue';
import { computed } from 'vue';
import { useLoginStore } from '../stores/loginStore';

const useloginstore = useLoginStore();

const showInfo = computed(()=>{
    return (useloginstore.statusLogin == 202) ? 'show' : 'hidden';
})

</script>

<template>

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