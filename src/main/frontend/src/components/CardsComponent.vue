<script setup>
  import { defineComponent } from 'vue';
  import { onMounted } from 'vue';
  import axios from 'axios';
  import { eventStore } from '../stores/eventStoreTest';
  import { onBeforeMount } from 'vue';
  import eventPayload from '../api/apis/payloads/eventPayload'

  const eventstore = eventStore();

  onBeforeMount(()=>{

    eventstore.getAll();

  })
    
const props = defineProps({
  event:{
    type: eventPayload,
  }
})
/*  defineComponent({
    props: {
      title: {
          type: String,
          required: true
        },
      date: {
            type: Date,
            required: true
        },
      capacity: {
        type: Number,
        required: true
      },
      description: {
        type: String,
        required: true
      }
    }
  })*/
  </script>
  

<template>
    <div class="card">
      <div class="card-image">
     
      </div>
      <div class="card-content">
        <!-- <h3>{{ event.id }}</h3>
        <p>{{ event.description }}</p>
        <p>{{ event.title }}</p> -->
      </div>
    </div>
  </template>
  
  
  <style scoped lang="scss">
  .card {
    display: flex;
    flex-direction: column;
    background-color: white;
    border-radius: 10px;
    overflow: hidden;
    margin: 16px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }
  
  .card-image {
    height: 25em;
    img {
      height: 100%;
      width: 100%;
      object-fit: cover;
    }
  }
  .card-content {

    h3 {
      margin-top: 0;
    }
    
  }
  </style>

  