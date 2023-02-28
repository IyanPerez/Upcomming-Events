<script setup>
const props = defineProps({
  title:{
  type: String,
  default: 'login'
}})


</script>

<template>

    <div class="login-container">
      <img
        class="login-container__img"
        src="../../assets/img/box.png"
        alt="icon-person"
      />
      <div class="login-container__title">
        <h1>{{ props.title }}</h1>
      </div>
      <div class="login-container__inputs">
        <v-text-field
          label="User Name"
          :rules="UserNameRules"
          required
        ></v-text-field>
        <v-text-field
          label="Password"
          :rules="PasswordRules"
          required
        ></v-text-field>
        <v-snackbar v-model="snackbar">
          {{ textSnackbar }}

          <template v-slot:action="{ attrs }">
            <v-btn color="blue" text v-bind="attrs" @click="snackbar = false">
                Close
            </v-btn>
          </template>
        </v-snackbar>
      </div>
      <div class="login-container__button">
        <v-btn color="yellow" width="28em" @click="login">Login to the account</v-btn>
      </div>
    </div>

</template>

<style scoped lang="scss">

img{
    width: 100%;
    display: flex;
}
.login-container {
  width: 40%;
  height: auto;
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: white;
  overflow: hidden;

  &__img {
    width: 10em;
    margin-bottom: 2em;
  }
  &__title {
    margin-bottom: 2em;
  }
  &__inputs {
    width: 25em;
    margin-bottom: 5em;
    border-radius: 5em;
    color:black;
 
   
    }
  &__button{
    width: 25em;
    margin-bottom: 2.5em;
       
    }
  }

</style>