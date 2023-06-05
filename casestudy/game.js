
    const grid = document.querySelector('.grid')
    const endGame = document.querySelector('.endgame')
    const tryAgain = document.querySelector('.tryAgain')

    const boardWidth = 1050
    const boardHeight = 655

    const userDiameter = 29.5
    const userStart = [400, 150]
    let currentPosition = userStart

    const bulletStart = [Math.random() * 400, Math.random() * 500]
    let bulletCurrentPosition = bulletStart

    let timerId

    const bulletDiameter = 10

    let seconds = 0;
    let el = document.getElementById('counter');

    function incrementSeconds() {
        seconds += 1;
        el.innerText = "Score : " + seconds
    }

    var cancel = setInterval(incrementSeconds, 1000);


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
                currentPosition[0] -= 15
                drawUser()
            }
            break;

        case 'ArrowRight' :
            if (currentPosition[0] < boardWidth - userDiameter) {
                currentPosition[0] += 15
                drawUser()
            }
            break;

        case 'ArrowDown' :
            if (currentPosition[1] > 0) {
                currentPosition[1] -= 15
                drawUser()
            }
            break;

        case 'ArrowUp' :
            if (currentPosition[1] < boardHeight - userDiameter) {
                currentPosition[1] += 15
                drawUser()
            }
            break;
    }
}

document.addEventListener("keydown", moveUser)


//add bullet
    let direction = [-2,2];
class Bullet {
    bullet;
    bulletCurrentPositionX;
    bulletCurrentPositionY;

    xDirection = direction[Math.round(Math.random())];
    yDirection = direction[Math.round(Math.random())];


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
        const bulletStart = [Math.random() * [boardWidth-bulletDiameter], Math.random() * [boardHeight-bulletDiameter]]
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
let x,y;

timerId = setInterval(start, 10)

function checkForCollisions(bullet) {
    if (
        bullet.bulletCurrentPositionX >= (boardWidth - bulletDiameter) ||
        bullet.bulletCurrentPositionY >= (boardHeight - bulletDiameter) ||
        bullet.bulletCurrentPositionX <= 0 ||
        bullet.bulletCurrentPositionY <= 0
    ) {
         // this.x = bullet.bulletCurrentPositionX
         // this.y = bullet.bulletCurrentPositionY
        bullet.changeDirection()
        addNewBullet(bullet.bulletCurrentPositionX,bullet.bulletCurrentPositionY)
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
    clearInterval(cancel)
    endGame.innerHTML = "<span style='font-size: 50px; font-family: sans-serif;'> Game Over! </span>"
    tryAgain.innerHTML = "<span style='font-size: 50px; font-family: sans-serif;'> Try Again </span>"
    document.removeEventListener('keydown', moveUser)
}

// function startGame() {
//     let startDiv = document.getElementById("grid");
//     let score = document.getElementById("score");
//     let endgame = document.getElementById("endGame");
//     startDiv.style.display = "none";
//     score.style.display = "block";
//     endgame.style.display = "none";
//     test();
// }

