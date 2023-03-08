import { defineStore } from "pinia";

//generar un store que guarde los eventos destacados
export const eventsStore = defineStore("featuresEvents", {

  id: 'featuresEvents',
  state: () => ({
    fevents: [],
    events: [],
  }),

  actions: {
    savefEvents(title, imagen) {
      events.push(this.fevents);
    },
  },
});
