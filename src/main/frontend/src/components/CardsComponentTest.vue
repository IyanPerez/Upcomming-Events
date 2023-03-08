<script >
  import { defineComponent, ref } from 'vue';
      import { onMounted } from 'vue';
    import axios from 'axios';

    export default {
        setup() {                                 

            let characters = [];

            const fetchData = async () => {
                const response = await axios.get('https://rickandmortyapi.com/api/character/');
                characters = response.data.results;
                console.log(characters);
            };

            onMounted (fetchData); 
            
            return {
                characters,
            };

        }
    }

</script>

<template>
     <div id="primeroDiv">
        <div v-if="characters.lenght" id="segundoDiv">
            <div v-for="character in characters" :key="character.id" class="card">
                <div style="display: inline-block; padding: 16px; margin: 16px;">
                    <img :src="character.image" alt="Character Image" class="characterImg">
                    <h3 class="characterName">{{ character.name }}</h3>
                    <p>Status:{{ character.status }}</p>
                    <p>Original: {{ character.origin.name }}</p>
                    <h1>{{response.data.results}}</h1>
                </div>
            </div>
        </div>
    </div>
</template>