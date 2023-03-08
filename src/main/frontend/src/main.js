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

const app = createApp(App)

app.use(createPinia())
app.use(router)
     
app.use(VueAxios, axios)
app.use(vuetify)

app.mount('#app')
