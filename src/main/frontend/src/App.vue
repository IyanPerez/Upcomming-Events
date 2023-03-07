<script setup>
import { RouterLink, RouterView } from 'vue-router'
import FeaturedEvents from './components/FeaturedEvents.vue';
</script>

<template>
    <main>

        <section class="wrapper">
    
            <FeaturedEvents/>
        </section>

    </main>
<!-- <RouterView/> -->
</template>
<style lang="scss" scoped>
main{
    width: 100%;
    z


    .wrapper{
        width: 50%;
    }
}
</style>