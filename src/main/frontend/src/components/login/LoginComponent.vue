<script setup>

</script>

<template>

<main>   

    <div class="login-container">
        <img class="login-container__img" src="../../assets/img/box.png" alt="icon-person">
            <div class="login-container__title">
                <h1>Login to account</h1>
    </div>
            <div class="login-container__inputs">
                <v-text-field label="User Name"></v-text-field>
                <v-text-field label="Password"></v-text-field>
                </div>
                    <div class="login-container__btn">
                        <v-btn>Login to the account</v-btn>
                    </div> 
    </div>

</main>
</template>

<style scoped lang="scss">

main{
    margin: 8em;
}
.login-container{
 width: 100%;
 height: 100%;
 display: flex;
 flex-direction: column;

&__img{
    width: 10em;
    
}

}


</style>