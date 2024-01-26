import { GeometricFigure } from "./geometric-figure";

export class Triangle implements GeometricFigure {
    public constructor(private base: number, private height: number) {}

    public calculateArea() {
        return (this.base * this.height) / 2;
    }
}