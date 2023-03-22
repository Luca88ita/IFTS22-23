const dice = [
	'../assets/dado/uno.png',
	'../assets/dado/due.png',
	'../assets/dado/tre.png',
	'../assets/dado/quattro.png',
	'../assets/dado/cinque.png',
	'../assets/dado/sei.png',
];

let maxVictories = 3;
let maxLaps = 3;
let boardDimension = 11;
let lastPossibleId;
const unluckyNumber = 5;
const luckyNumber = 7;
let playerPosition = [];
let clickControl = true;
let animationOver = true;
let diceRolls = [];
let lapsMade = [];
let victories = [0, 0];
let penalties = [];
let playerIndex = 0;

const resetBoard = () => {
	lastPossibleId =
		Math.pow(boardDimension, 2) - Math.pow(boardDimension - 2, 2) - 1;
	diceRolls = [0, 0];
	lapsMade = [0, 0];
	playerPosition = [0, 0];
	penalties = [1, 1];
	const board = document.getElementById('board');
	while (board.firstChild) {
		board.removeChild(board.firstChild);
	}
	idReverseCounter = lastPossibleId;
	createBoard();
	document.getElementById('unluckyNr').textContent = unluckyNumber;
	document.getElementById('luckyNr1').textContent = luckyNumber;
	document.getElementById('luckyNr2').textContent = luckyNumber;
	document.getElementById('maxLaps').textContent = maxLaps;
	document.getElementById('maxVics').textContent = maxVictories;
	document.getElementById(playerPosition[1]).style.backgroundColor = 'red';
	document.getElementById(playerPosition[0]).style.backgroundColor = 'blue';
	document.getElementById('rollsP1').textContent = diceRolls[0];
	document.getElementById('rollsP2').textContent = diceRolls[1];
	document.getElementById('lapsP1').textContent = lapsMade[0];
	document.getElementById('lapsP2').textContent = lapsMade[1];
};

const movePlayer = (diceResult) => {
	animationOver = false;
	let control = 0;
	let intervalID = setInterval(moveThePlayer, 200);
	function moveThePlayer() {
		if (control != diceResult) {
			const previousplayerPosition = document.getElementById(
				playerPosition[playerIndex]
			);
			previousplayerPosition.style.backgroundColor = 'white';
			diceResult >= 0
				? playerPosition[playerIndex]++
				: playerPosition[playerIndex]--;
			if (playerPosition[playerIndex] > lastPossibleId) {
				playerPosition[playerIndex] -= lastPossibleId + 1;
				lapsMade[playerIndex]++;
			}
			if (playerPosition[playerIndex] < 0) {
				playerPosition[playerIndex] += lastPossibleId + 1;
				lapsMade[playerIndex]--;
			}
			document.getElementById('lapsP1').textContent = lapsMade[0];
			document.getElementById('lapsP2').textContent = lapsMade[1];
			const playerBoxPosition = document.getElementById(
				playerPosition[playerIndex]
			);
			document.getElementById(playerPosition[1]).style.backgroundColor = 'red';
			document.getElementById(playerPosition[0]).style.backgroundColor = 'blue';
		} else {
			checkposition();
			clearInterval(intervalID);
			animationOver = true;
			resetTheGame.disabled = false;
		}
		diceResult >= 0 ? control++ : control--;
	}
};

const checkposition = () => {
	if ((playerPosition[playerIndex] + 1) % unluckyNumber == 0) {
		penalties[playerIndex] = -2;
	}
	if ((playerPosition[playerIndex] + 1) % luckyNumber == 0) {
		penalties[playerIndex] = 2;
	}
	if (lapsMade[playerIndex] == maxLaps) {
		document.getElementById('win').textContent =
			'P' + (playerIndex + 1) + ' ha vinto il round';
		victories[playerIndex]++;
		if (victories[0] == maxVictories || victories[1] == maxVictories) {
			document.getElementById('win').textContent =
				'Il giocatore ' + (playerIndex + 1) + ' ha vinto la partita!';
			resetTheGameOnClick();
		}
		document.getElementById('victoriesP1').textContent = victories[0];
		document.getElementById('victoriesP2').textContent = victories[1];
		resetBoard();
	}
	playerIndex == 0 ? (playerIndex = 1) : (playerIndex = 0);
};

const createBoard = () => {
	const boardDiv = document.getElementById('board');
	let idCounter = 0;
	document.getElementById('section1').style.width =
		3.625 * boardDimension + 'rem';
	document.getElementById('section1').style.height =
		3.625 * boardDimension + 'rem';

	for (let i = 0; i < boardDimension; i++) {
		const row = document.createElement('div');
		row.className = 'row';
		boardDiv.appendChild(row);
		if (i == 0) {
			for (let j = 0; j < boardDimension; j++) {
				const square = document.createElement('div');
				square.id = idCounter;
				square.textContent = idCounter + 1;
				square.className = 'squares';
				if (parseInt(square.textContent) % unluckyNumber == 0) {
					square.style.borderColor = 'red';
				}
				if (parseInt(square.textContent) % luckyNumber == 0) {
					square.style.borderColor = 'gold';
				}
				row.appendChild(square);
				idCounter++;
			}
		} else {
			if (i == boardDimension - 1) {
				for (let j = 0; j < boardDimension; j++) {
					const square = document.createElement('div');
					square.id = idReverseCounter;
					square.textContent = idReverseCounter + 1;
					square.className = 'squares';
					if (parseInt(square.textContent) % unluckyNumber == 0) {
						square.style.borderColor = 'red';
					}
					if (parseInt(square.textContent) % luckyNumber == 0) {
						square.style.borderColor = 'gold';
					}
					row.appendChild(square);
					idReverseCounter--;
				}
			} else {
				for (let j = 0; j < 2; j++) {
					const square = document.createElement('div');
					square.className = 'squares';
					if (j == 0) {
						square.id = idReverseCounter;
						square.textContent = idReverseCounter + 1;
						idReverseCounter--;
					} else {
						square.id = idCounter;
						square.textContent = idCounter + 1;
						idCounter++;
					}
					if (parseInt(square.textContent) % unluckyNumber == 0) {
						square.style.borderColor = 'red';
					}
					if (parseInt(square.textContent) % luckyNumber == 0) {
						square.style.borderColor = 'gold';
					}
					row.appendChild(square);
				}
			}
		}
	}
};

function diceRoll() {
	if (clickControl == true && animationOver == true) {
		resetTheGame.disabled = true;
		addLap.disabled = true;
		removeLap.disabled = true;
		addVics.disabled = true;
		removeVics.disabled = true;
		increaseSize.disabled = true;
		decreaseSize.disabled = true;
		document.getElementById('win').textContent = '';
		diceRolls[playerIndex]++;
		document.getElementById('rollsP1').textContent = diceRolls[0];
		document.getElementById('rollsP2').textContent = diceRolls[1];
		clickControl = false;
		let ctrl = 0;
		let faccia = 0;
		let intervalID = setInterval(myCallback, 10);
		function myCallback() {
			if (ctrl <= 20) {
				faccia = parseInt(Math.random() * 6);
				diceButton.style.backgroundImage = 'url(' + dice[faccia] + ')';
			} else {
				clearInterval(intervalID);
				movePlayer(penalties[playerIndex] * (faccia + 1));
				penalties[playerIndex] = 1;
				clickControl = true;
			}
			ctrl++;
		}
	}
}

const removeLapOnClick = () => {
	if (maxLaps > 1) {
		maxLaps--;
		displayedLaps.style.color = 'blue';
	}
	if (maxLaps === 1) {
		displayedLaps.style.color = 'red';
	}
	displayedLaps.textContent = maxLaps;
	resetBoard();
};

const addLapOnClick = () => {
	if (maxLaps < 5) {
		maxLaps++;
		displayedLaps.style.color = 'blue';
	}
	if (maxLaps === 5) {
		displayedLaps.style.color = 'red';
	}
	displayedLaps.textContent = maxLaps;
	resetBoard();
};

const removeVicsOnClick = () => {
	if (maxVictories > 1) {
		maxVictories--;
		displayedVics.style.color = 'blue';
	}
	if (maxVictories === 1) {
		displayedVics.style.color = 'red';
	}
	displayedVics.textContent = maxVictories;
	resetBoard();
};

const addVicsOnClick = () => {
	if (maxVictories < 5) {
		maxVictories++;
		displayedVics.style.color = 'blue';
	}
	if (maxVictories === 5) {
		displayedVics.style.color = 'red';
	}
	displayedVics.textContent = maxVictories;
	resetBoard();
};

const increaseSizeOnClick = () => {
	if (boardDimension < 20) {
		boardDimension++;
		boardSizeInput.style.color = 'blue';
	}
	if (boardDimension === 20) {
		boardSizeInput.style.color = 'red';
	}
	boardSizeInput.textContent = boardDimension;
	resetBoard();
};

const decreaseSizeOnClick = () => {
	if (boardDimension > 5) {
		boardDimension--;
		boardSizeInput.style.color = 'blue';
	}
	if (boardDimension === 5) {
		boardSizeInput.style.color = 'red';
	}
	boardSizeInput.textContent = boardDimension;
	resetBoard();
};
const resetTheGameOnClick = () => {
	victories = [0, 0];
	addLap.disabled = false;
	removeLap.disabled = false;
	addVics.disabled = false;
	removeVics.disabled = false;
	increaseSize.disabled = false;
	decreaseSize.disabled = false;
	resetBoard();
};

const diceButton = document.getElementById('diceButton');
diceButton.style.backgroundImage = 'url(' + dice[0] + ')';
diceButton.style.backgroundSize = '100%';
diceButton.addEventListener('click', diceRoll);
const displayedLaps = document.getElementById('lapsInput');
const displayedVics = document.getElementById('vicsInput');
const boardSizeInput = document.getElementById('boardSizeInput');
resetBoard();
document.getElementById('victoriesP1').textContent = victories[0];
document.getElementById('victoriesP2').textContent = victories[1];

boardSizeInput.textContent = boardDimension;
displayedLaps.textContent = maxLaps;
displayedVics.textContent = maxVictories;
const addLap = document.getElementById('addLap');
addLap.addEventListener('click', addLapOnClick);
const removeLap = document.getElementById('removeLap');
removeLap.addEventListener('click', removeLapOnClick);
const addVics = document.getElementById('addVics');
addVics.addEventListener('click', addVicsOnClick);
const removeVics = document.getElementById('removeVics');
removeVics.addEventListener('click', removeVicsOnClick);
const increaseSize = document.getElementById('increaseSize');
increaseSize.addEventListener('click', increaseSizeOnClick);
const decreaseSize = document.getElementById('decreaseSize');
decreaseSize.addEventListener('click', decreaseSizeOnClick);
const resetTheGame = document.getElementById('resetTheGame');
resetTheGame.addEventListener('click', resetTheGameOnClick);
