import { User } from "./user";

export class Admin implements User {
    login() {
        console.log('Admin logged in');
    }

    admAction() {
        console.log('Admin action');
    }
}