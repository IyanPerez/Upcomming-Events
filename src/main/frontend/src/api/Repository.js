import apiUsers from "./apis/apiUsers";

export default class Repository{

    api

    constructor(api){
        this.api = api
    }

    chooseApi(){
        if(this.api=='users') return new apiUsers();
    }

}