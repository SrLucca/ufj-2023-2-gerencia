import { GeometricFigure } from "./geometric-figure";

export class Square implements GeometricFigure {
    public constructor(private side: number) {}

    public calculateArea() {
        return this.side * this.side;
    }
}