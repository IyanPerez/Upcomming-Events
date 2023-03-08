import axios from "axios";

export default class eventService{

    baseUrl

    constructor(){
        this.baseUrl = 'http://localhost:8080/api';
    }

    async getAllEVents(){
        const response = axios.get(this.baseUrl + '/events', {auth:{
            username: 'user',
            password: 'password'
        }});


        const getBody = (await response);

        console.log(getBody.data);

        return getBody;
    }
}