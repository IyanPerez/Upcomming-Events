import axios from 'axios';
import { defineStore } from 'pinia'

export const useLoginStore = defineStore('login', {

    state: () => ({
        login: {},
        statusLogin: 0,
        roleLogin: ''
    }),

    actions: {
        saveLogin(username, password){
            this.login={username:username, password:password}
            
        },
        async loginSession(username, password){
            const response = axios.get("http://localhost:8080/api/login", {
                auth:{
                    username: username,
                    password: password
                }
            });

            

            this.statusLogin = (await response).status;
            this.roleLogin = (await response).data.role;

            const responseSession = [];

            responseSession.push((await response).status);
            responseSession.push((await response).data.role);

            return responseSession;
        }
    },
});