const tanque = document.getElementById("btn_tanque")
const avion = document.getElementById("btn_avion")
const barco = document.getElementById("btn_barco")
/* Operation buttons */
const reiniciar = document.getElementById("reiniciar")
const acelerar = document.getElementById("acelerar")
const despegar = document.getElementById("despegar")
const arriba = document.getElementById("arriba")
const disparar = document.getElementById("disparar")
const detener = document.getElementById("detener")
const aterrizar = document.getElementById("aterrizar")
const abajo = document.getElementById("abajo")
const det_disparo = document.getElementById("det_disparo")
/* Input velocidad */
const int_vel = document.getElementById("vel")
/* canvas */
const dibujo = document.querySelector("#dibujo");

let swTanque = false;
let swAvion = false;
let swBarco = false;

const velMaxAvion = 300;
const velMaxBarco = 100;
const velMaxTanque = 80;

let velAvion;
let velBarco;
let velTanque;


class Index {

    events() {
        tanque.addEventListener('click', this.swTanque)
        avion.addEventListener('click', this.swAvion)
        barco.addEventListener('click', this.swBarco)

        int_vel.addEventListener('keyup', this.onlyNumbers)
        acelerar.addEventListener('click', new Vehicle().acelerar)
        reiniciar.addEventListener('click', new Vehicle().reiniciar)
        detener.addEventListener('click', new Vehicle().detener)
        disparar.addEventListener('click', new Vehicle().disparo)
    }

    onlyNumbers(e) {
        var key = window.event ? e.which : e.keyCode
        if (key < 48 || key > 57) {
            e.preventDefault()
        }
        velAvion = e.target.value
        velTanque = e.target.value
        velBarco = e.target.value
    }

    swTanque() {
        swTanque = true
        swAvion = false
        swBarco = false

        const imgTanq = [
            {
                src: "assets/tanque.png",
                id: "tanque"
            },
            {
                src: "assets/ciudad.png",
                id: "ciudad"
            },
            {
                src: "assets/fondo1.png",
                id: "nubes"
            }
        ]

        const objTanque = new Tanque(imgTanq)
        objTanque.paint()
    }

    swAvion() {
        swTanque = false
        swAvion = true
        swBarco = false

        const imgsAirplane = [
            {
                src: "assets/airplane.png",
                id: "airplane"
            },
            {
                src: "assets/cloud.png",
                id: "cloud1"
            },
            {
                src: "assets/cloud.png",
                id: "cloud2"
            },
            {
                src: "assets/cloud.png",
                id: "cloud3"
            }
        ]

        const objAvion = new Avion(imgsAirplane);
        objAvion.paint();
    }

    swBarco() {
        swTanque = false
        swAvion = false
        swBarco = true

        const imgsBarco = [
            {
                src: "assets/barco.png",
                id: "barco"
            },
            {
                src: "assets/mar.png",
                id: "mar"
            },
            {
                src: "assets/fondo1.png",
                id: "nubes"
            }
        ]

        const objBarco = new Barco(imgsBarco)
        objBarco.paint();
    }

}

class Vehicle {

    constructor(imgs) {
        this.imgs = imgs
    }

    paint() {

        this.imgs.map(img => {
            const elementImg = document.createElement('img')
            elementImg.src = img.src
            elementImg.id = img.id
            dibujo.appendChild(elementImg)
            elementImg.style.animationDuration = 10000 - 10 + 'ms';
        })

        if (swTanque) {
            dibujo.style.background = "#a3d6db"
        }

        if (swAvion) {
            dibujo.style.background = "#77b3d4"
        }

        if (swBarco) {
            dibujo.style.background = "#77b3d4"
        }

    }

    disparo() {
        const imgs = document.querySelectorAll('img')
        if (imgs.length === 0) {
            alert("Selecciona un vehiculo")
        } else {
            imgs.forEach(img => {
                if (img.id === "airplane" || img.id === "tanque" || img.id === "barco") {
                    const vehiclePosX = img.getClientRects()[0].x
                    const vehiclePosY = img.getClientRects()[0].y
                    const disparo = document.createElement('div')
                    disparo
                    dibujo.appendChild()
                }
            })
        }
    }

    detener() {
        const imgs = document.querySelectorAll('img')
        if (imgs.length === 0) {
            alert("Selecciona un vehiculo")
        } else {
            imgs.forEach(img => {
                if (img.id === "airplane") {
                    alert("El avion no se puede detener en el aire")
                } else {
                    if (img.id == "nubes" || img.id == "barco") {
                        img.style.animation = 'none'
                        img.style.transform = 'translateX(0%)'
                    }
                }
            })
        }
    }

    reiniciar() {
        const imgs = document.querySelectorAll('img')
        if (imgs.length === 0) {
            alert("Selecciona un vehiculo")
        } else {
            imgs.forEach(img => {
                img.style.animationDuration = 10 * 3 + 's'
            })
        }
    }

    acelerar() {
        const imgs = document.querySelectorAll('img')
        int_vel.value = ""
        if (imgs.length === 0) {
            alert("Selecciona un vehiculo")
        } else {
            if (velAvion === "" || velBarco === "" || velTanque === "") {
                alert("Digita la velocidad")
            } else {
                if (swTanque) {
                    if (velTanque > velMaxTanque) {
                        alert("El valor que digito es mayor a la velocidad maxima")
                        velTanque = 10;
                    } else {
                        imgs.forEach(img => {
                            if (velTanque < 10) {
                                alert("Ya esta en la velocidad minima de vuelo")
                            } else if (velTanque <= 25) {
                                img.style.animationDuration = 10000 - velTanque + 'ms'
                            } else if (velTanque <= 50) {
                                img.style.animationDuration = velTanque / 10 + 's'
                            } else if (velTanque > 50) {
                                img.style.animationDuration = 1000 - velTanque + 'ms'
                            }
                        })
                    }
                }

                if (swAvion) {
                    if (velAvion > velMaxAvion) {
                        alert("El valor que digito es mayor a la velocidad maxima")
                        velAvion = 10;
                    } else {
                        imgs.forEach(img => {
                            if (velAvion < 10) {
                                alert("Ya esta en la velocidad minima de vuelo")
                            } else if (velAvion <= 25) {
                                img.style.animationDuration = 10000 - velAvion + 'ms'
                            } else if (velAvion <= 50) {
                                img.style.animationDuration = velAvion / 10 + 's'
                            } else if (velAvion > 50) {
                                img.style.animationDuration = 1000 - velAvion + 'ms'
                            }
                        })
                    }
                }

                if (swBarco) {
                    if (velBarco > velMaxBarco) {
                        alert("El valor que digito es mayor a la velocidad maxima")
                        velBarco = 10;
                    } else {
                        imgs.forEach(img => {
                            if (velBarco < 10) {
                                alert("Ya esta en la velocidad minima de vuelo")
                            } else if (velBarco <= 25) {
                                img.style.animationDuration = 10000 - velBarco + 'ms'
                            } else if (velBarco <= 50) {
                                img.style.animationDuration = velBarco / 10 + 's'
                            } else if (velBarco > 50) {
                                img.style.animationDuration = 1000 - velBarco + 'ms'
                            }
                        })
                    }
                }
            }
        }
    }

}

class Avion extends Vehicle {

    constructor(imgs) {
        super(imgs)
    }

}

class Tanque extends Vehicle {
    constructor(imgs) {
        super(imgs)
    }
}

class Barco extends Vehicle {
    constructor(imgs) {
        super(imgs)
    }
}

function load() {
    const obj = new Index()
    obj.events()
}

window.onload = load();