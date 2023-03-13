import axios from "axios";

export default class eventService{

    baseUrl

    constructor(){
        this.baseUrl = 'http://localhost:8080/api';
    }

    async getAllEVents(){    
            /* axios.defaults.withCredentials = true;  */
        const response = axios.get(this.baseUrl + '/events',{
            headers: {
                'Authorization': `${document.cookie}`,
            },
            /* auth:{
                username: 'user',
                password: 'password'
            } */
        });


        const getBody = (await response);

        console.log(getBody.data);

        return getBody;
    }
}