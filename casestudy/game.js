const grid = document.querySelector('.grid')
const endGame = document.querySelector('.endgame')

const boardWidth = 1200
const boardHeight = 800

const userDiameter = 29.5
const userStart = [400, 150]
let currentPosition = userStart

const bulletStart = [Math.random() * 400, Math.random() * 500]
let bulletCurrentPosition = bulletStart

let timerId

const bulletDiameter = 10

let xDirection = 2
let yDirection = 2


//add user
const user = document.createElement('div')
user.classList.add('user')
user.style.left = currentPosition[0] + 'px'
user.style.bottom = currentPosition[1] + 'px'
grid.appendChild(user)

function drawUser() {
    user.style.left = currentPosition[0] + 'px'
    user.style.bottom = currentPosition[1] + 'px'
}

function moveUser(e) {
    switch (e.key) {
        case 'ArrowLeft' :
            if (currentPosition[0] > 0) {
                currentPosition[0] -= 10
                drawUser()
            }
            break;

        case 'ArrowRight' :
            if (currentPosition[0] < boardWidth - userDiameter) {
                currentPosition[0] += 10
                drawUser()
            }
            break;

        case 'ArrowDown' :
            if (currentPosition[1] > 0) {
                currentPosition[1] -= 10
                drawUser()
            }
            break;

        case 'ArrowUp' :
            if (currentPosition[1] < boardHeight - userDiameter) {
                currentPosition[1] += 10
                drawUser()
            }
            break;
    }
}

document.addEventListener("keydown", moveUser)

//------------------------------------------------------------

//add bullet


class Bullet {
    bullet;
    bulletCurrentPositionX;
    bulletCurrentPositionY;
    xDirection = 2;
    yDirection = 2;


    constructor(bullet, bulletCurrentPositionX, bulletCurrentPositionY) {
        this.bullet = bullet;
        this.bulletCurrentPositionX = bulletCurrentPositionX;
        this.bulletCurrentPositionY = bulletCurrentPositionY;
    }

    drawBullet() {
        this.bullet.style.left = this.bulletCurrentPositionX + 'px'
        this.bullet.style.bottom = this.bulletCurrentPositionY + 'px'
    }

    moveBullet() {
        this.bulletCurrentPositionX += this.xDirection;
        this.bulletCurrentPositionY += this.yDirection
    }

    changeDirection() {
        if (this.xDirection === 2 && this.yDirection === 2) {
            this.yDirection = -2
            return
        }
        if (this.xDirection === 2 && this.yDirection === -2) {
            this.xDirection = -2
            return
        }
        if (this.xDirection === -2 && this.yDirection === -2) {
            this.yDirection = 2
            return
        }
        if (this.xDirection === -2 && this.yDirection === 2) {
            this.xDirection = 2
            return
        }
    }

}

const bullet = document.createElement('div')
bullet.classList.add('bullet')
grid.appendChild(bullet)

let bulletObj = new Bullet(bullet, bulletCurrentPosition[0], bulletCurrentPosition[1]);
let bullets = [bulletObj]


function addNewBullet() {
    if (bullets.length < 30) {
        const bullet = document.createElement('div')
        bullet.classList.add('bullet')
        grid.appendChild(bullet)
        const bulletStart = [Math.random() * (boardWidth - bulletDiameter), Math.random() * (boardHeight - bulletDiameter)]
        let bulletObj = new Bullet(bullet, bulletStart[0], bulletStart[1], bullets);
        bullets.push(bulletObj);
    }
}

function start() {
    let size = bullets.length;
    for (let i = 0; i < size; i++) {
        bullets[i].moveBullet();
        bullets[i].drawBullet();
        checkForCollisions(bullets[i])
    }
}


timerId = setInterval(start, 10)

function checkForCollisions(bullet) {
    if (
        bullet.bulletCurrentPositionX >= (boardWidth - bulletDiameter) ||
        bullet.bulletCurrentPositionY >= (boardHeight - bulletDiameter) ||
        bullet.bulletCurrentPositionX <= 0 ||
        bullet.bulletCurrentPositionY <= 0
    ) {

        bullet.changeDirection()
        addNewBullet()
    }

    // check game over
    if (
        !((bullet.bulletCurrentPositionX  + bulletDiameter) < currentPosition[0]) &&
        !(bullet.bulletCurrentPositionX > (currentPosition[0] + bulletDiameter)) &&
        !((bullet.bulletCurrentPositionY  + bulletDiameter) < currentPosition[1]) &&
        !(bullet.bulletCurrentPositionY  > (currentPosition[1] + bulletDiameter))

    ) {
        gameOver()
    }
}

function gameOver() {
    clearInterval(timerId)
    endGame.innerHTML = "Game Over!"
    document.removeEventListener('keydown', moveUser)
}


