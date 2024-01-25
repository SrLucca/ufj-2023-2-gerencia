import { UserDto } from "./dtos/user.dto";
import { Service } from "./service";

export class Controller {
    public createUserRoute(): Promise<UserDto> {
        return Service.build().createUser();
    }

    public getUserRoute(): Promise<UserDto> {
        return Service.build().getUser();
    }
}
