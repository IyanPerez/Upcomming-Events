import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api'
});

api.interceptors.response.use(
  response => {
    const cookies = response.data.details.split(',')
      for (const cookie of cookies) {
        if (cookie.startsWith(' SessionId')) {
          const sessionId = cookie.split('=')[1].split(']')[0];

          // do something with sessionId, such as store it in a cookie or pass it to the Vuex store
          sessionStorage.setItem('JSESSIONID', sessionId);
          document.cookie = `JSESSIONID=${sessionId}`
          
        }
    }
    return response;
  },
  error => {
    return Promise.reject(error);
  }
);

export default api;