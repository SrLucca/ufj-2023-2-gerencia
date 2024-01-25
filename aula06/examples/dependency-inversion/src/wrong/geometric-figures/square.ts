import { GeometricFigure } from "./geometric-figure";

export class Square implements GeometricFigure {
    constructor(private side: number) {}

    public getSide(): number {
        return this.side;
    }

    public area(): number {
        return this.side * this.side;
    }
}
