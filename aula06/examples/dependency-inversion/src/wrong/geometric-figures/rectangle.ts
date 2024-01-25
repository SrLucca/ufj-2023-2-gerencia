import { GeometricFigure } from "./geometric-figure";

export class Rectangle implements GeometricFigure {
    constructor(private width: number, private height: number) {}

    public getWidth(): number {
        return this.width;
    }

    public getHeight(): number {
        return this.height;
    }

    public area(): number {
        return this.width * this.height;
    }
}
