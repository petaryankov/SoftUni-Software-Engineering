function solve(arr, str) {
    if (str === 'asc') {
        arr.sort((a, b) => (a - b));
    } else {
        arr.sort((a, b) => (b - a))
    }
    return arr;
}
solve([14, 7, 17, 6, 8], 'desc');