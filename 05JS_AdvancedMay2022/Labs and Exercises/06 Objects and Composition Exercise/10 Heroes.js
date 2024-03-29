function solve() {
    function fighter(fName) {

        return {
            name: fName,
            health: 100,
            stamina: 100,
            fight() {
                this.stamina -= 1;
                console.log(`${this.name} slashes at the foe!`);
            }
        }

    }
    function mage(mName) {

        return {
            name: mName,
            health: 100,
            mana: 100,
            cast(spell) {
                this.mana -= 1;
                console.log(`${this.name} cast ${spell}`);
            }
        }

    }
    return { fighter: fighter, mage: mage }
}
let create = solve();
const scorcher = create.mage("Scorcher");
scorcher.cast("fireball")
scorcher.cast("thunder")
scorcher.cast("light")

const scorcher2 = create.fighter("Scorcher 2");
scorcher2.fight()

console.log(scorcher2.stamina);
console.log(scorcher.mana);
