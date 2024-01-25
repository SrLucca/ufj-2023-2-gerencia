export type UserProps = {
    id: string;
    name: string;
    email: string;
};

export class User {
    constructor(private props: UserProps) {}

    get id() {
        return this.props.id;
    }

    get name() {
        return this.props.name;
    }

    get email() {
        return this.props.email;
    }

    static build(name: string, email: string) {
        return new User({
            id: crypto.randomUUID(),
            name,
            email,
        });
    }
}
