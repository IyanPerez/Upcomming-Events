import { defineStore } from "pinia";
import Repository from "../api/Repository";

//generar un store que guarde los eventos destacados
export const eventsStore = defineStore("featuresEvents", {
  state: () => ({
    fevents: [],
    events: [],
  }),

  actions: {
    async savefEvents(event) {
      const api = new Repository("events");

      const eventService = api.chooseApi();

      const response = await eventService.createEvent(event);

      console.log(response.status);
    },

    async editEvents(event) {
      const api = new Repository("events");

      const eventService = api.chooseApi();

      const response = await eventService.editEvent(event);

      console.log(response.status);
    },

    
  },
});
