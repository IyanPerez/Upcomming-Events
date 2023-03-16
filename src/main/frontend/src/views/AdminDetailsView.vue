<script setup>
import CardsComponent from '../components/CardsComponent.vue';
import DetailsForm from '../components/DetailsForm.vue';
import { useLoginStore } from '../stores/loginStore';
import { useRoute } from 'vue-router';
import { eventsStore } from '../stores/eventsStore';
import { onBeforeMount } from 'vue';

const eventsstore = eventsStore();


const useloginstore = useLoginStore();
const route = useRoute()
const idEvent = parseInt(route.params.id)

onBeforeMount(async ()=>{
    eventsstore.getOneEvent(idEvent)
})


const eventTemporal ={
    title: 'hola',
    date_hour: '10-10-2020',
    number_participants: 20,
    description: 'esto es un descripcion'
}

</script>

<template>
<div class="container">
    <CardsComponent class="card"
    :event="eventsstore.oneEvent"
    />
    <DetailsForm class="details"
    :view="'edit'"
    :id="idEvent"
    />
</div>
</template>



<style lang="scss" scoped>
.container{
    flex-direction: column;
    display: flex;
    align-items: center;
}
.card{
    width: 80%;
}
.details{
    width: 95%;
}
@media (min-width: 1024px) {
    .container{
        flex-direction: row;
        justify-content: center;
        margin-block: 4%;
    }
    .card{
    width: 30%;
    }
    .details{
        width: 50%;
    }
}


</style>