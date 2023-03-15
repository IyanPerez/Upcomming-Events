<script setup>
import DetailsForm from '../components/DetailsForm.vue';
import { eventsStore } from '../stores/eventsStore';




const edit = eventsStore();
function Edit(){
 
 const eventsEdit = {
   title:"hola",
   date_hour:"12-12-1212",
   number_participants:12345,
   description:"holasdasdalsdhakshdkhaskdhkasdhakshdlahldlahsdlabcieibbajnwunakjvmcdkjg",
  };
  edit.editEvents(eventsEdit)
  console.log(eventsEdit);
  
};

</script>
<template>
    <div>
        
        <DetailsForm/>
        <div class="card__buttons mt-4">
          <v-btn variant="flat" color="red" class="mr-2" v-on:click="Edit()">SUBMIT</v-btn
          >
        </div>
    </div>
</template>
<style lang="scss" scoped>
</style>