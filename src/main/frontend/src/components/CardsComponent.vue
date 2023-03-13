<script setup>
import { defineComponent } from "vue";
import { onMounted } from "vue";
import { eventStore } from "../stores/eventStoreTest";
import { onBeforeMount } from "vue";
import eventPayload from "../api/apis/payloads/eventPayload";
import DetailsForm from "./DetailsForm.vue";
import { ref } from "vue";

const props = defineProps({
  title: {
    type: String,
    required: true,
  },
  date: {
    type: String,
    required: true,
  },
  capacity: {
    type: Number,
    required: true,
  },
  description: {
    type: String,
    required: true,
  },
});
</script>

<template>
        <div class="card">
          <div class="card__image">
            <v-btn id="edit__icon" variant="outlined" size="large" icon color="warning">
              <v-icon>mdi-pencil</v-icon>
            </v-btn>
            <img src="../assets/img/card-img.png" alt="card-background"/>
          </div>

          <div class="card__description">
            <div id="icons">
              <p class="card__date">{{ date }}12/12/1212</p>
                <div id="capacity">
                  <img
                    src="../assets/img/vector-people-cap.png"
                    alt="people-vector"
                    />
                  <p class="card__capacity">{{ capacity }}666</p>
                </div>
            </div>
            <div id="description">
              <h3>{{ title }} Lorem ipsum dolor sit. </h3>
              <p>{{ description }} Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit molestias harum officia facilis ducimus nobis sint veniam doloribus odit. Alias voluptas est eius? Dolore a ipsum exercitationem sunt illum architecto, deleniti quis repellat officiis nobis vel veniam nisi repudiandae omnis sed optio dolorum ratione quidem officia ex, nihil velit quia? </p>
            </div>

          </div>
        </div>
</template>

<style scoped lang="scss">

.card{
  width: 40%;
  background-color: aqua;

  &__image{
    display: flex;
    flex-direction: column;

    #edit__icon{
      margin-bottom: -15vh;
      z-index: 2;
    }
  }
  &__description{
    display: flex;

    #icons{
      display: flex;
      flex-direction: column;
    }
    #description{
      
      display: flex;
      flex-direction: column;

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
