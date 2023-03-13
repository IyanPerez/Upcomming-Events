<script setup>
import Buttons from "./Buttons.vue";
import DetailsForm from "./DetailsForm.vue";
import { ref } from "vue";

const card = defineProps({
  title: {
    type: String,
    required: true,
    default: " ",
  },
  date: {
    type: String,
    required: true,
    default: " ",
  },
  capacity: {
    type: Number,
    required: true,
    default: " ",
  },
  description: {
    type: String,
    required: true,
    default: " ",
  },
});

//methods para almacenar los datos de las props

const title = ref("");
const date = ref("");
const capacity = ref("");
const description = ref("");

function sentForm() {
  const eventsSaved = {
    title: title.value,
    date: date.value,
    capacity: capacity.value,
    description: description.value,
  };
  console.log(eventsSaved);
}
</script>

<template>
  <div>
    <h1 class="mx-4 mt-4">Create Event</h1>
    <div class="d-flex justify-between ml-4">
      <div class="card__event">
        <div class="card__content">
          <div class="card__image">
            <div class="card__icon">
              <v-btn variant="outlined" size="large" icon color="warning"
                ><v-icon>mdi-pencil</v-icon></v-btn
              >
            </div>
            <img src="../assets/img/card-img.png" alt="card-background" />
          </div>

          <div class="card__description">
            <h3>{{ title }}</h3>
            <p>{{ description }}</p>
            <p class="card__date">{{ date }}</p>
            <img
              src="../assets/img/vector-people-cap.png"
              alt="people-vector"
            />
            <p class="card__capacity">{{ capacity }}</p>
          </div>
        </div>
        <div class="card__buttons mt-4">
          <Buttons />
        </div>
      </div>
      <div class="card__details mx-4">
        <DetailsForm />
      </div>
    </div>
  </div>
</template>

<style scoped lang="scss">
h1 {
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
}

.card__buttons {
  position: absolute;
  flex-direction: row;
  left: 179px;
}
</style>
