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

            this.events = eventsDB

            return eventsDB;
        }
    }
})