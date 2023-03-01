<script setup>

</script>
<template>
    <div class="form-container">
        <div class="list-title">
            <h3>Title</h3>
         </div>
         <div class="title-content">
            <p >{{ message }}</p>
<input v-model="message" placeholder="Enter a title" />
         </div>
<div class="list-date-title">
    <h3>Date</h3>
</div>
<input class="form-date" type="date" v-model="theDate" />
<div class="list-maxParticipants-title">
    <h3>Max participants</h3>
</div>
<input class="form-maxParticipants" type="number" v-model.number="Number" placeholder="max participants" />
<div class="desciption-title">
    <h3>Description</h3>
</div>

<p style="white-space: pre-line;">{{ message }}</p>
<textarea v-model="message" placeholder="Add your description"></textarea>

  </div>

</template>
<style lang="scss" scoped >


.form-container{
    margin: 0 auto;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
}
h3{
    color: #242565
}
input {
    background-color: #D1D1D1;
    border-radius: 10px;
    width: 80vw;
}
textarea {
    background-color: #D1D1D1
    border-radius: 10px;
    width: 80vw;

}
</style>