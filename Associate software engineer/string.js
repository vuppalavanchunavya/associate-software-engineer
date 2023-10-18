var string="I like programming";
var reversalstrings=reverseWord(string,"");
console.log(reversalstrings);
var output=reverseWord(reversalstrings,"");
function reverseWord(string,seperator) {
  return string.split(seperator).reverse().join(seperator);
  
}