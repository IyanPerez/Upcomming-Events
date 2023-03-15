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

.card{
  width: 480px;
  background-color: rgb(217, 217, 217);
  border-radius: 3vw;
  overflow: hidden;

  &__image{
    height: 280px;
    width: 480px;
    display: flex;
    flex-direction: column;
    background-image: url("../assets/img/card-img.png");
    background-size: contain;

    #edit__icon{
      margin: 4%;
    }
  }
  &__description{
    display: flex;
    gap: 5%;
    padding: 3%;
    
    #icons{
      display: flex;
      flex-direction: column;
      justify-content: space-around;
      #capacity{
        display: flex;
        flex-direction: column;
        align-items: center;
        width: 100%;
      }
    }

    #description{
      display: flex;
      flex-direction: column;
      gap: 1vh;
      width: 100%;
    }
  }
}
















/* h1 {
  position: relative;
  margin-left: 10px;
  top: 36px;
  color: rgb(31, 42, 130);
  font-size: 30px;
}
.card__event {
  background-color: #e2e2e2;
  border-radius: 12px;
  position: relative;
  top: 55px;
  .card__image {
    .card__icon {
      position: relative;
      z-index: 1;
      left: 7px;
    }
    img {
      position: relative;
      width: 100%;
      bottom: 65px;
    }
  }
  .card__description {
    h3 {
      position: absolute;
      right: 95px;
      bottom: 65px;
      font-size: larger;
      color: blue;

      font-weight: 800;
    }

    p {
      position: absolute;
      bottom: 12px;
      left: 120px;
      margin-top: 2px;
    }
    .card__date {
      position: relative;
      bottom: 70px;
      color: blue;
      left: 5px;
      font-weight: 800;
    }
    img {
      position: absolute;
      left: 16px;
      bottom: 20px;
    }
    .card__capacity {
      position: absolute;
      bottom: -2px;
      left: 18px;
    }
  }
} */



</style>
