import axios from "axios";
import api from "../interceptors/api";

export default class apiUsers{

    baseUrl;

    constructor(){
        this.baseUrl = 'http://localhost:8080/api'
    }

    async acces(username, password){
        /* const response = axios.get(this.baseUrl + "/login", {
          auth: {
            username: username,
            password: password,
          }
        });   */  
        const response= await api.get('/login', {
            auth: {
              username: username,
              password: password,
            }
          });

        const getBody = response;
        
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

    encoder(username, password){
        let encode = window.btoa(`${username}:${password}`)

        return ;
    }
}