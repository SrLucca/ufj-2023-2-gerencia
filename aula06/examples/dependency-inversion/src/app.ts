import { Square } from "./wrong/geometric-figures/square";
import { printGeometricFigure } from "./wrong/utils/utils";

function main(){
    const square = new Square(10);
    printGeometricFigure(square);
}

main();