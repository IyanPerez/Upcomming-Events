import axios from "axios";
import api from "../interceptors/api";

export default class apiUsers{

    baseUrl;

    constructor(){
        this.baseUrl = 'http://localhost:8080/api'
    }

    async acces(username, password){
        const auth = window.btoa(`${username}:${password}`).toString();

    const response = await axios.get(`${this.baseUrl}/login`, {
      headers: {
        Authorization: `Basic ${auth}`
      },
      withCredentials: true
    });

        const getBody = response;

        console.log(response.data);
        
        return getBody
    }

    async register(){

        const json ={
            "username": "user12",
            "password": "password",
            "roles":[
                {
                    "id_role": 1,
                    "role": "ROLE_USER"
                }
            ]
        }
        const response = axios.post(this.baseUrl + '/register', json)

        const getBody = (await response)

        return getBody
    }

    async addUserToEvent(username, idEvent){
        axios.defaults.withCredentials = 'include'; 
        const response = axios.put(this.baseUrl + `/users/${username}/events/${idEvent}/add`,{});

        const getResponse = await response;

        return getResponse;
    }
    
    async  deleteUserToEvent(username, idEvent){
        axios.defaults.withCredentials = 'include'; 
        const response = axios.put(this.baseUrl + `/users/${username}/events/${idEvent}/remove`,{});

        const getResponse = await response;

        return getResponse;
    }

    async logOut(){
        axios.defaults.withCredentials = 'include'; 
        const response = axios.get(this.baseUrl + `/logout`);

        const getResponse = await response;

        console.log(getResponse.status);
    }
    
    encoder(username, password){
        let encode = window.btoa(`${username}:${password}`).toString()

        return encode;
    }
}