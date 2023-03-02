import { defineStore } from 'pinia'

export const useLoginStore = defineStore('login', {

    state: () => ({
        login: {} 
    }),

    actions: {
        saveLogin(username, password){
            this.login={username:username, password:password}
            console.log(this.login);
        },
    },
});