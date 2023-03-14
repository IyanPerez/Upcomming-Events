import axios from "axios";

export default class eventService{

    baseUrl

    constructor(){
        this.baseUrl = 'http://localhost:8080/api';
    }

    async getAllEVents(){    
            axios.defaults.withCredentials = 'include'; 
        const response = axios.get(this.baseUrl + '/events',{
            headers: {
                'Cookie': `${document.cookie}`,
            },
            
        });


        const getBody = (await response);

        /* console.log(getBody.data); */

        return getBody;
    }
    async createEvent (event){
        const resp = axios.post(this.baseUrl + '/events',event,{
          auth:{
            username: 'user',
            password:'password'
          }
        });

        const getEvent = (await resp);
         return getEvent;
    }

    async editEvent (event){
        const resp = axios.put(this.baseUrl + '/events/1',event,{
            auth:{
                username:'user',
                password:'password'
            }
        });
        const ediEvent = (await resp);
        return ediEvent;
    }
}