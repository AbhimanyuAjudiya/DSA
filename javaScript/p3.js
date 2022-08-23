function forLoop(){
    for(var a=0; a<10;a++){
        console.log("Hello World");
    }
}
function whileLoop(){
    var a=0;
    while(a<10){
        console.log("Hello World");
        a++;
    }
}
function doWhileLoop(){
    var a=0;
    do{
        console.log("Hello World");
        a++;
    }while(a<10);
}
forLoop();
whileLoop();
doWhileLoop();