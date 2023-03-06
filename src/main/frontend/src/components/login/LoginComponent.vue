<script setup>
import { ref, computed } from 'vue';
import {useLoginStore} from '../../stores/loginStore'
import { useRouter } from 'vue-router';

const router = useRouter()
const useloginstore=useLoginStore()
const props = defineProps({
  title:{
  type: String,
  default: 'login'
}})
const username = ref("")
const password = ref("")


const submit = async () => {
  let errorParagraphUser = document.getElementById('login-container__inputs__UserMsg');
  username.value.length > 3 ? useloginstore.saveLogin(username.value, password.value) : console.log("No guarda datos");

  

    // alert("Username must be more than 8 characters")
  username.value.length < 4 ? errorParagraphUser.innerHTML = "User name must be more than 8 characters" : "" ;

  let test = await useloginstore.loginSession(username.value, password.value);
  
  if(test[0]==202)router.push({name:'userDetails'});
  console.log(test);/* 
  console.log(useloginstore.roleLogin); */

  

};



</script>

<template>

    <div class="login-container">
      <img
        class="login-container__img"
        src="../../assets/img/people.png"
        alt="icon-person"
      />
      <div class="login-container__title">
        <h1>{{ props.title }}</h1>
      </div>
      <div class="login-container__inputs">
        <v-text-field
          label="'User Name'"
          v-model="username"
          required
          hide-details="auto"
        ></v-text-field>
          <p id="login-container__inputs__UserMsg"></p>
        <v-text-field
          label="'Password'"
          v-model="password"
          required
        ></v-text-field>
      
      </div>
      <div class="login-container__button">
        <v-btn color="yellow" width="28em" @click="submit()">Login to the account</v-btn>
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
    width: 5em;
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
#login-container__inputs__UserMsg{
    margin-bottom: 100px;
      color: red;
    }
    

</style>