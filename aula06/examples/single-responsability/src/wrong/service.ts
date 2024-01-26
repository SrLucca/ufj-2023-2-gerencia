import { CreateUserServiceOutputDto } from "./dtos/services/creaate-user.service.dto";
import { UserDto } from "./dtos/user.dto";
import { User } from "./user";

export class Service {
    public static build(): Service {
        return new Service();
    }

    public async createUser(): Promise<CreateUserServiceOutputDto> {
        const user = User.build("John Doe", "johndoe@gmail.com");

        return {
            id: user.id,
            name: user.name,
            email: user.email,
        };
    }

    public async getUser(): Promise<UserDto> {
        const user = User.build("John Doe", "johndoe@gmail.com");

        return {
            id: user.id,
            name: user.name,
            email: user.email,
        };
    }
}
