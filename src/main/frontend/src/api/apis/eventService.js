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
}