<script setup>
import { eventStore } from '../stores/eventStoreTest';
import { onBeforeMount } from 'vue';
import CardsComponentTest from '../components/CardsComponentTest.vue';
import FeaturedEvents from '../components/FeaturedEvents.vue'

const eventstore = eventStore();

onBeforeMount(async() => {

   await eventstore.getAll();

})

const addUserToEvent=(id)=>{
  eventstore.addUserToEvent(1,id)
}
</script>

<template>
  <main>

    <section class="highlighted-events">
      <h1>Highlighted-events</h1>
      <div class="wrapper-highlighted-events">
        <div class="container-highlighted-card">
          <FeaturedEvents/>
        </div>
      </div>
    </section>

    <section class="all-events">
      <div class="container-cards" v-for="event of eventstore.events">
        <CardsComponentTest 
        :event="event" 
        @add-event="addUserToEvent(event.id)"/>
      </div> 

    </section>
  </main>
</template>

<style lang="scss" scoped>
main{
  width: 100%;
  height: auto;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-evenly;
  .highlighted-events{
    width: 90%;
    height: auto;
    display: flex;
    flex-direction: column;
    align-items: center;
    .wrapper-highlighted-events{
      width: 100%;
      display: flex;
      flex-direction: column;
      align-items: center;
      .container-highlighted-card{
        width: 100%;
      }
    }
  }
  .all-events{
    width: 90%;
    height: auto;
    .container-cards{
      margin-top: 2vh;
    }
  }
}
@media (min-width: 1024px){
  main{
    height: 100vh;
    flex-direction: row;
    align-items: center;
    justify-content: space-around;
    .highlighted-events{
    width: 45%;
    height: 90vh;
    }
      .all-events{
        width: 50%;
        height: 90vh;
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
        justify-content: space-around;
        align-items: center;
    .container-cards{
      width: 45%;
      height: 45%;
    }
    }
  }
}
</style>