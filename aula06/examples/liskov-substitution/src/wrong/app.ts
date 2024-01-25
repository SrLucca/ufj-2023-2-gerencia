import { Admin } from "./admin.user";
import { User } from "./user";

function admService(user: User) {
    user.login();
    user.admAction();
}

function main() {
    const user = new Admin();

    admService(user);
}

main();