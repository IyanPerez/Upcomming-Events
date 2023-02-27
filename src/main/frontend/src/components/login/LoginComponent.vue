<script setup></script>

<template>

    <div class="login-container">
      <img
        class="login-container__img"
        src="../../assets/img/box.png"
        alt="icon-person"
      />
      <div class="login-container__title">
        <h1>Login to account</h1>
      </div>
      <div class="login-container__inputs">
        <v-text-field
          label="User Name"
        ></v-text-field>
        <v-text-field
          label="Password"
        ></v-text-field>
      </div>
      <div class="login-container__button">
        <v-btn color="yellow" width="28em">Login to the account</v-btn>
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
