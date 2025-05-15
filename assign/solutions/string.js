function StringChallenge(sen) {
    // Remove punctuation and split into words
    const words = sen.replace(/[^a-zA-Z0-9 ]/g, '').split(' ');
    
    // Find the longest word
    let longestWord = '';
    for (const word of words) {
      if (word.length > longestWord.length) {
        longestWord = word;
      }
    }
    console.log(longestWord);
    
    // Get challenge token
    const challengeToken = 'q8engt34';
    
    // Combine the longest word with challenge token
    let finalOutput = longestWord + challengeToken;
    
    // Replace every fourth character with underscore
    finalOutput = finalOutput.split('')
      .map((char, i) => ((i + 1) % 4 === 0) ? '_' : char)
      .join('');
      
    return finalOutput;
}
console.log(readline());