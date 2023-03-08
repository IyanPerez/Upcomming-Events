<script setup>
  import { defineComponent } from 'vue';
      import { onMounted } from 'vue';
    import axios from 'axios';
    
   defineComponent({
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
  });
  </script>
  

<template>
    <div class="card">
      <div class="card-image">
     <img src="../assets/img/Detail View.png" alt="">
      </div>
      <div class="card-content">
        <h3>{{ title }}</h3>
        <p>{{ description }}</p>
        <p>{{ capacity }}</p>
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

  