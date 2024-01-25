import { Square } from "../geometric-figures/square";

export function printGeometricFigure(square: Square) {
    console.log(`Square with side ${square.getSide()} area: ${square.area()}`);
}
