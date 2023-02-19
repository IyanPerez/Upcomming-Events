<script setup></script>

<template>

 <main>
     
    <img src="../../assets/img/Login background.png" alt="background-image-Events">
    
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

</main>

</template>

<style scoped lang="scss">

main{
  margin: 1em ;
//   background-image: url(../../assets/img/Login\ background.png);
//   background-position: 100%;
//   background-size: center/100%;

}


img{
    width: 100%;
    display: flex;
}
.login-container {
  width: 100%;
  height: 50%;
  display: flex;
  flex-direction: column;
  align-items: center;
  

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
 
    &__button{
    width: 25em;
       
      }
    }
  }

</style>
