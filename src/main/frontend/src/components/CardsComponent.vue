<script setup>
import { defineComponent } from "vue";
import { onMounted } from "vue";
import axios from "axios";
import Buttons from "./Buttons.vue";

const card = defineProps({
  title: {
    type: String,
    required: true,
    default: "Title",
  },
  date: {
    type: String,
    required: true,
    default: "20-12-2021",
  },
  capacity: {
    type: Number,
    required: true,
    default: 12000,
  },
  description: {
    type: String,
    required: true,
    default: "It was popularised in the 1960s with the release of Letraset shee",
  },
});
</script>

<template>
  <h1>Create Event</h1>
  <main class="card">
    <div class="card__content">
      <div class="card__image">
        <div class="card__icon">
          <v-btn variant="outlined" size="large" icon color="warning"
            ><v-icon>mdi-pencil</v-icon></v-btn
          >
        </div>
        <img src="../assets/img/card-img.png" alt="" />
      </div>

      <div class="card__description">
        <h3>{{ title }}</h3>
        <p>{{ description }}</p>
        <p class="card__date">{{ date }}</p>
        <img src="../assets/img/vector-people-cap.png" alt="people-vector" />
        <p class="card__capacity">{{ capacity }}</p>
      </div>
    </div>
  </main>
  <div class="card__buttons">
    <Buttons />
  </div>
</template>

<style scoped lang="scss">
h1 {
  position: relative;
  left: 50px;
  top:35px;
  color: black;
  font-size: 30px;
}
.card {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 35%;
  margin:45px;

  .card__content {
    background-color: #e2e2e2;
    display: flex;
    border-radius: 12px;
    justify-content: center;
    flex-direction: column;
    align-items: center;
    .card__image {
      .card__icon{
        position: relative;
        z-index: 1;
        left: 7px;
        color:black
      }
      img {
        position:relative;
        width: 100%;
        bottom: 65px;
      }

    }
    .card__description {
      h3 {
        position: relative;
        bottom: 65px;
        font-size: larger;
        color: blue;
        font-weight: 800;
      }

      p{
        position: absolute;
        bottom: 35px;
      }
      .card__date{
        position: relative;
        bottom: 2px;
        color:blue;
      }
      img{
        position: absolute;
        left: 16px;
        bottom:20px;

      }
      .card__capacity{
        position: absolute;
        bottom:-2px;
        left:18px;
      }
    }
  }
}
.card__buttons {
  position: absolute;
  flex-direction: row;
  left: 75px;
  gap:45px;
}
</style>
