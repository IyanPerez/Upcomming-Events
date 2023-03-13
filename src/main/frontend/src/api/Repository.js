import apiUsers from "./apis/apiUsers";
import eventService from "./apis/eventService";
export default class Repository{

    api

    constructor(api){
        this.api = api
    }

    chooseApi(){
        if(this.api=='users') return new apiUsers();
        
        if(this.api=='events') return new eventService();
    }

}