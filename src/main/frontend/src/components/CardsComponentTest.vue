<script setup>
 import addButton from '../components/AddButton.vue'
 const props = defineProps({
    event:{
        type: Object
    }
 })
 const emits = defineEmits(['addEvent'])

 const emitAddEvent = () => {
  emits('addEvent', props.event.id)
 }
</script>

<template>
    <div class="card">
      <div class="card-image">
        
      </div>
      <div class="card-content">
        <h3>{{event.title}}</h3>
        <p>{{ event.description }}</p>
        <p>{{event.date_hour}}</p>
        <p>{{event.number_participants}}</p>
      </div>
      <div class="btn-zone">
        <addButton
        @click="emitAddEvent()"
        />
      </div>
    </div>
  </template>
  
  
  <style scoped lang="scss">
  .card {
    width: 100%;
    height: 100%;
    display: flex;
    flex-direction: column;
    background-color: white;
    border-radius: 10px;
    overflow: hidden;
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
    display: flex;
    flex-direction: column;
    align-items: center;
    
  }
  </style>