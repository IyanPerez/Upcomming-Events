import { defineStore } from "pinia";
import Repository from "../api/Repository.js";

export const eventUserStore = defineStore("event", {
  state: () => ({
    events: [], 
    heighlightedEvents: []
  }),

  actions: {
    async getAll() {
      const api = new Repository("events");

      const eventService = api.chooseApi();

      const eventsDB = await eventService.getAllEVents();

      this.events = eventsDB.data;

      return eventsDB.data;
    },
    async addUserToEvent(idUser, idEvent) {
      const api = new Repository("users");

      const eventService = api.chooseApi();

      const eventsDB = await eventService.addUserToEvent(idUser, idEvent);

      console.log(eventsDB.status);
    },
    addToHeighlightedEvents(id){
        if (this.existHeighlightedEvents(id)) {

        const findEvent = this.heighlightedEvents.find(event => event.id == id)    

        const index = this.heighlightedEvents.indexOf(findEvent)
        this.heighlightedEvents.splice(index, 1)
        console.log(this.heighlightedEvents);
        return 
        
        }

        for (const event of this.events) {
            if (event.id == id) {
              this.heighlightedEvents.push(event); 
            }
        }
        console.log(this.heighlightedEvents);
    },
    existHeighlightedEvents(id){
        for (const event of this.heighlightedEvents) {
            if (event.id == id) {
                return true
            }
            
        }
        return false
    }
  },
});
