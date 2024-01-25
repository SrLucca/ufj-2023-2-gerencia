import { User } from "./user";

export class CommonUser implements User {
    login() {
        console.log('User logged in');
    }

    admAction() {
        throw new Error('Common user cannot perform this action');
    }
}