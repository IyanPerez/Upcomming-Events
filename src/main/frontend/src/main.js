import { createApp } from 'vue'
import App from './App.vue'
import router from './router'


// Composables


// Plugins
import { registerPlugins } from '@/plugins'

const app = createApp(App)
app.use(router)
registerPlugins(app)

app.mount('#app')
