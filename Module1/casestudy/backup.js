const grid = document.querySelector('.grid')
const endGame = document.querySelector('.endgame')

const boardWidth = 1200
const boardHeight = 800

const userDiameter = 29.5
const userStart = [400,150]
let currentPosition = userStart

const bulletStart = [Math.random() * 400,Math.random() * 500]
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
    switch(e.key) {
        case 'ArrowLeft' :
            if (currentPosition[0] > 0) {
                currentPosition[0] -= 10
                drawUser()
            }
            break;

        case 'ArrowRight' :
            if (currentPosition[0] < boardWidth-userDiameter) {
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
            if (currentPosition[1] < boardHeight-userDiameter) {
                currentPosition[1] += 10
                drawUser()
            }
            break;
    }
}

document.addEventListener("keydown",moveUser )

//------------------------------------------------------------

//add bullet
const bullet = document.createElement('div')
bullet.classList.add('bullet')
grid.appendChild(bullet)


function drawBullet() {
    bullet.style.left = bulletCurrentPosition[0] + 'px'
    bullet.style.bottom = bulletCurrentPosition[1] + 'px'

}


function addNewBullet() {
    const bullet1 = document.createElement('div')
    bullet1.classList.add('bullet1')
    grid.appendChild(bullet1)

    function drawBullet1() {
        bullet1.style.left = bulletCurrentPosition[0] + 'px'

        bullet1.style.bottom = bulletCurrentPosition[1] + 'px'

    }

    drawBullet1()
}

//move bullet
function moveBullet() {
    bulletCurrentPosition[0] += xDirection
    bulletCurrentPosition[1] += yDirection
    drawBullet()
    checkForCollisions()
}

timerId = setInterval(moveBullet,10)

function checkForCollisions() {
    if(
        bulletCurrentPosition[0] >= (boardWidth - bulletDiameter) ||
        bulletCurrentPosition[1] >= (boardHeight - bulletDiameter) ||
        bulletCurrentPosition[0] <= 0 ||
        bulletCurrentPosition[1] <= 0
        ) {
        addNewBullet()
        changeDirection()

    }

    // check game over
    if(

        !((bulletCurrentPosition[0] + bulletDiameter) < currentPosition[0]) &&
        !(bulletCurrentPosition[0] > (currentPosition[0] + bulletDiameter)) &&
        !((bulletCurrentPosition[1] + bulletDiameter) < currentPosition[1]) &&
        !(bulletCurrentPosition[1] > (currentPosition[1] + bulletDiameter))

        ) {
        gameOver()
    }
}

function changeDirection() {
    if (xDirection === 2 && yDirection === 2) {
        yDirection = -2
        return
    }
    if (xDirection === 2 && yDirection === -2) {
        xDirection = -2
        return
    }
    if (xDirection === -2 && yDirection === -2) {
        yDirection = 2
        return
    }
    if (xDirection === -2 && yDirection === 2) {
        xDirection = 2
        return
    }
}

function gameOver() {
    clearInterval(timerId)
    endGame.innerHTML = "Game Over!"
    document.removeEventListener('keydown', moveUser)
}

















// const grid = document.querySelector('.grid')
// const endGame = document.querySelector('.endgame')
//
// const boardWidth = 1200
// const boardHeight = 800
//
// const userDiameter = 29.5
// const userStart = [400,150]
// let currentPosition = userStart
//
// const bulletStart = [Math.random() * 400,Math.random() * 500]
// let bulletCurrentPosition = bulletStart
//
// let timerId
//
// const bulletDiameter = 10
//
// let xDirection = 2
// let yDirection = 2
//
//
//
// //add user
// const user = document.createElement('div')
// user.classList.add('user')
// user.style.left = currentPosition[0] + 'px'
// user.style.bottom = currentPosition[1] + 'px'
// grid.appendChild(user)
//
// function drawUser() {
//     user.style.left = currentPosition[0] + 'px'
//     user.style.bottom = currentPosition[1] + 'px'
// }
//
// function moveUser(e) {
//     switch(e.key) {
//         case 'ArrowLeft' :
//             if (currentPosition[0] > 0) {
//                 currentPosition[0] -= 10
//                 drawUser()
//             }
//             break;
//
//         case 'ArrowRight' :
//             if (currentPosition[0] < boardWidth-userDiameter) {
//                 currentPosition[0] += 10
//                 drawUser()
//             }
//             break;
//
//         case 'ArrowDown' :
//             if (currentPosition[1] > 0) {
//                 currentPosition[1] -= 10
//                 drawUser()
//             }
//             break;
//
//         case 'ArrowUp' :
//             if (currentPosition[1] < boardHeight-userDiameter) {
//                 currentPosition[1] += 10
//                 drawUser()
//             }
//             break;
//     }
// }
//
// document.addEventListener("keydown",moveUser )
//
// //------------------------------------------------------------
//
// //add bullet
// const bullet = document.createElement('div')
// bullet.classList.add('bullet')
// grid.appendChild(bullet)
//
// function drawBullet() {
//     bullet.style.left = bulletCurrentPosition[0] + 'px'
//     bullet.style.bottom = bulletCurrentPosition[1] + 'px'
//
// }
//
// //move bullet
// function moveBullet() {
//     bulletCurrentPosition[0] += xDirection
//     bulletCurrentPosition[1] += yDirection
//     drawBullet()
//     checkForCollisions()
// }
//
// timerId = setInterval(moveBullet,10)
//
// function checkForCollisions() {
//     if(
//         bulletCurrentPosition[0] >= (boardWidth - bulletDiameter) ||
//         bulletCurrentPosition[1] >= (boardHeight - bulletDiameter) ||
//         bulletCurrentPosition[0] <= 0 ||
//         bulletCurrentPosition[1] <= 0
//     ) {
//
//         changeDirection()
//
//     }
//
//     // check game over
//     if(
//
//         !((bulletCurrentPosition[0] + bulletDiameter) < currentPosition[0]) &&
//         !(bulletCurrentPosition[0] > (currentPosition[0] + bulletDiameter)) &&
//         !((bulletCurrentPosition[1] + bulletDiameter) < currentPosition[1]) &&
//         !(bulletCurrentPosition[1] > (currentPosition[1] + bulletDiameter))
//
//     ) {
//         gameOver()
//     }
// }
//
// function changeDirection() {
//     if (xDirection === 2 && yDirection === 2) {
//         yDirection = -2
//         return
//     }
//     if (xDirection === 2 && yDirection === -2) {
//         xDirection = -2
//         return
//     }
//     if (xDirection === -2 && yDirection === -2) {
//         yDirection = 2
//         return
//     }
//     if (xDirection === -2 && yDirection === 2) {
//         xDirection = 2
//         return
//     }
// }
//
// function gameOver() {
//     clearInterval(timerId)
//     endGame.innerHTML = "Game Over!"
//     document.removeEventListener('keydown', moveUser)
// }