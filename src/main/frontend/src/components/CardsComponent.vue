<script setup>
import { defineProps } from "vue";

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
          <div class="card__image">
            <v-btn id="edit__icon" variant="outlined" size="large" icon color="white">
              <v-icon>mdi-pencil</v-icon>
            </v-btn>
          </div>

          <div class="card__description">
            <div id="icons">
              <p class="card__date">{{event.date_hour}}</p>
              <div id="capacity">
                <img
                  src="../assets/img/vector-people-cap.png"
                  alt="people-vector"
                  />
                <p class="card__capacity">{{event.number_participants}}</p>

              </div>
            </div>
            <div id="description">
              <h3>{{event.title}} </h3>

              <p>{{ event.description }} </p>

            </div>
            <addButton @click="emitAddEvent()"/>
          </div>
        </div>
</template>

<style scoped lang="scss">
.card {
  width: 480px;
  background-color: rgb(217, 217, 217);
  border-radius: 3vw;
  overflow: hidden;

  &__image {
    height: 280px;
    width: 480px;
    display: flex;
    flex-direction: column;
    background-image: url("../assets/img/card-img.png");
    background-size: contain;

    #edit__icon {
      margin: 4%;
    }
  }
  &__description {
    display: flex;
    gap: 5%;
    padding: 3%;

    #icons {
      display: flex;
      flex-direction: column;
      justify-content: space-around;
      #capacity {
        display: flex;
        flex-direction: column;
        align-items: center;
        width: 100%;
      }
    }

    #description {
      display: flex;
      flex-direction: column;
      gap: 1vh;
      width: 100%;
    }
  }
}

</style>
