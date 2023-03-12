import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'


import axios from 'axios'
import VueAxios from 'vue-axios'


import 'vuetify/styles'
import { createVuetify } from 'vuetify'
import * as components from 'vuetify/components'
import * as directives from 'vuetify/directives'

const vuetify = createVuetify({
  components,
  directives,
})

const pinia = createPinia()

pinia.use((context)=>{

  const storeId = context.store.$id

  const serializer = {
    serialize: JSON.stringify,
    deserializa: JSON.parse
  }

  const fromStorage = serializer.deserializa(window.sessionStorage.getItem(storeId))

  if(fromStorage){
    context.store.$patch(fromStorage)
  }

  context.store.$subscribe((mutation, state)=>{
    window.sessionStorage.setItem(storeId, serializer.serialize(state))
  })
})

const app = createApp(App)

app.use(pinia)
app.use(router)
     
app.use(VueAxios, axios)
app.use(vuetify)

app.mount('#app')
