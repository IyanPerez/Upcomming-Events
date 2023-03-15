import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api'
});

api.interceptors.response.use(
  response => {
          /* const sessionId = response.data.JSESSIONID
 */


          /* sessionStorage.setItem('JSESSIONID', sessionId);
          document.cookie = `JSESSIONID=${sessionId}` */

    return response;
  },
  error => {
    return Promise.reject(error);
  }
);

export default api;