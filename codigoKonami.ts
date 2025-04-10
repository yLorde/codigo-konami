document.addEventListener('keydown', (() => {
    const konamiSequence = [
        'ArrowUp',
        'ArrowUp',
        'ArrowDown',
        'ArrowDown',
        'ArrowLeft',
        'ArrowRight',
        'ArrowLeft',
        'ArrowRight',
        'b',
        'a',
    ];
    let currentPosition = 0;

    return (e) => {
        if (e.key === konamiSequence[currentPosition]) {
            currentPosition++;
            if (currentPosition === konamiSequence.length) {
                //inicio da ação
                alert('KONAMI!');
                //final da ação
                currentPosition = 0;
            }
        } else {
            currentPosition = 0;
        }
    };
})());

