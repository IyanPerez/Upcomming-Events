import { createApp } from 'vue'
import App from './App.vue'
import router from './router'


// Composables
import '../src/assets/scss/_main.scss'

// Plugins
import { registerPlugins } from '@/plugins'

const app = createApp(App)
app.use(router)
registerPlugins(app)

app.mount('#app')
