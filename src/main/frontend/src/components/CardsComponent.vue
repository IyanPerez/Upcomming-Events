<script setup>
  import { defineComponent } from 'vue';
      import { onMounted } from 'vue';
    import axios from 'axios';

    // export default {
    //     setup() {

    //         const characters = [];

    //         const fetchData = async () => {
    //             const response = await axios.get('https://rickandmortyapi.com/api/character/');
    //             characters.push(...response.data.results);
    //             console.log(response.data.results);
    //         };

    //         onMounted (fetchData); 
            
    //         return {
    //             characters,
    //         };

    //     }
    // }
    

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
    //   <div id="primeroDiv">ç
    //     <div v-if="characters.lenght" id="segundoDiv">
    //         <div v-for="character in characters" :key="character.id" class="card">
    //             <div style="display: inline-block; padding: 16px; margin: 16px;">
    //                 <img :src="character.image" alt="Character Image" class="characterImg">
    //                 <h3 class="characterName">{{ character.name }}</h3>
    //                 <p>Status:{{ character.status }}</p>
    //                 <p>Original: {{ character.origin.name }}</p>
    //             </div>
    //         </div>
    //     </div>
    // </div>
  .card-content {

    h3 {
      margin-top: 0;
    }
    
  }
  </style>

  