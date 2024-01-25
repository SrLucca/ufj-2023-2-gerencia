export type GeometricFigureProps = {
    name: "square" | "triangle";
    side1: number;
    side2: number;
};

export class GeometricFigure {
    public constructor(private props: GeometricFigureProps) {}

    public get name() {
        return this.props.name;
    }

    public get side1() {
        return this.props.side1;
    }

    public get side2() {
        return this.props.side2;
    }

    public calculateArea() {
        if (this.name === "square") {
            return this.side1 * this.side1;
        }

        if (this.name === "triangle") {
            return (this.side1 * this.side2) / 2;
        }

        throw new Error("Invalid figure name");
    }

    print() {
        console.log(`Name: ${this.name}`);
        console.log(`Side 1: ${this.side1}`);
        console.log(`Side 2: ${this.side2}`);
    }
}
