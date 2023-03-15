<script setup>
import{ref}from"vue";

const title = ref("");
const date = ref("");
const capacity = ref("");
const description = ref("");



function send(){
  const events = {
   title:title.value,
   date:date.value,
   capacity:capacity.value,
   description:description.value,
  };
  console.log(events);
};

</script>

<template>
  <div class="form-container">
    <div class="list-title">
      <h3>Title</h3>
    </div>
    <div class="title-content">
      <p>{{ message }}</p>
      <input v-model="title" placeholder="Enter a title" />
    </div>
    <div class="list-date-title">
      <h3>Date</h3>
    </div>
    <input class="form-date" type="date" v-model="date" />
    <div class="list-maxParticipants-title">
      <h3>Max participants</h3>
    </div>
    <input class="form-maxParticipants" type="number"
      v-model="capacity"
      placeholder="max participants"
    />
    <div class="description-title">
      <h3>Description</h3>
    </div>

    <p style="white-space: pre-line">{{ message }}</p>
    <textarea v-model="description"></textarea>
  </div>

   <div class="card__buttons mt-4">
          <v-btn variant="flat" color="success" class="mr-2" v-on:click="send()">SUBMIT</v-btn>
        </div>
</template>

<style lang="scss" scoped>
.form-container {
  margin: 0 auto;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;

  h3 {
    position: relative;
    color: #21227f;
  }

  input {
    background-color: #ece5e5;
    border-radius: 10px;
    width: 100%;
    max-width: 450px;
    padding: 10px;
    border-radius: 5px;
  }

  @media screen and (max-width: 480px) {
    input {
      width: 100%;
      max-width: none;
    }
  }
  textarea {
    background-color: #ece5e5;
    border-radius: 10px;
    resize: both;
    max-width: 600px;
    width: 500px;
    min-height: 100px;
    height: 200px;
    line-height: 20px;

    
  }
}
</style>
