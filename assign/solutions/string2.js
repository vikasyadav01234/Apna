function stringChallenge(str) {
    // Step 1: Implement Run-length encoding
    let result = '';
    let count = 1;
    
    for (let i = 0; i < str.length; i++) {
        // If current character matches next character, increment count
        if (str[i] === str[i + 1]) {
            count++;
        } else {
            // Add count and character to result when sequence ends
            result += count + str[i];
            count = 1;
        }
    }
    
    // Step 2: Add the challenge token
    const challengeToken = 'q8engt34';
    let finalOutput = result + challengeToken;
    
    // Step 3: Replace every fourth character with underscore
    finalOutput = finalOutput.split('')
        .map((char, i) => ((i + 1) % 4 === 0) ? '_' : char)
        .join('');
        
    return finalOutput;
}

console.log(stringChallenge("aabbcde"));