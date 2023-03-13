import { defineStore } from 'pinia'
import Repository from '../api/Repository.js';

export const eventStore = defineStore('event',{

    state: () => ({
        events: []
    }),

    actions:{
        async getAll(){
            const api = new Repository('events');

            const eventService = api.chooseApi();

            const eventsDB = await eventService.getAllEVents();

            this.events = eventsDB.data

            
            return eventsDB.data;
        },
        async addUserToEvent(idUser, idEvent){
            const api = new Repository('users');

            const eventService = api.chooseApi();

            const eventsDB = await eventService.addUserToEvent(idUser, idEvent);

            console.log(eventsDB.status);

        }
    }
})