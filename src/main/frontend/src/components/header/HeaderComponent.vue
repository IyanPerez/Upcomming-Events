<script setup>
import { useRouter } from "vue-router";
import { useLoginStore } from "../../stores/loginStore";

const loginstore = useLoginStore();
const router = useRouter();


const redi = () => {
  router.push({ name: "sessionLayout" });
};

const createEvents = () => {
  router.push({ name: "createEvents" });
}


const logOut = async ()=>{
    loginstore.logOut();
    loginstore.cleanLoginSession();
    router.push({name:'home'});
}
</script>
<template>
  <header>
    <nav class="nav-bar">
      <p @click="createEvent()" v-if="loginstore.roleLogin=='ROLE_ADMIN'"  >Create Event</p>
      <p @click="redi()" >Home</p>
      <p @click="logOut()">Logout</p>
    </nav>
    <h1>Buy Amazing <span> Tickets </span> at wholesale prices.</h1>
  </header>
</template>
<style lang="scss" scoped>
header {
  width: 100%;
  height: 20%;
  display: flex;
  flex-direction: column;
  background-image: url("../../assets/img/banner-img.png");
  background-size: 100%;

  .nav-bar {
    color: white;
    display: flex;
    flex-direction: row;
    justify-content: center;
    gap: 1vh;
    margin-right: 1vh;
    margin-top: 0.5vh;
    font-size: 1vh;
  }
  h1 {
    font-size: 1.3vh;
    width: 100%;
    margin-left: 2vh;
    color: white;
  }

  span {
    color: rgb(248, 205, 13);
  }
}

@media (min-width: 1024px){
 
    header{
        height: 20vh;
        display: flex;
        flex-direction: column;
        justify-content: space-around;

    
    .nav-bar{
    display: flex;
    justify-content: end;
    margin-right: 6vw;
    margin-top: 2vh;
    gap: 3vw;
    font-size: 3vh;
 }
 h1{
    font-size: 4vw; 
    width: 90%;
    text-align: center;
    margin-bottom: 3vh;

    }
  }
}
</style>
