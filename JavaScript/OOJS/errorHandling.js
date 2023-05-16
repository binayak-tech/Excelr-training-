// using try - catch block

        // try{
        //     console.log("Starting of try block");

        //     let avg = 15 / 0;
        //     console.log(c);

        //     // console.log(avg);
        // }
        // catch(e){
        //     console.log("error = " + e)
        //     console.log("error name = " + e.name)
        //     console.log("error message = " + e.message);
        // }


// using try-catch-finally blocks

        // try{
        //     console.log("Starting of try block");

        //     let avg = 15 / 0;
        //     console.log(c);

        //     // console.log(avg);
        // }
        // catch(e){
        //     console.log("error = " + e)
        //     console.log("error name = " + e.name)
        //     console.log("error message = " + e.message);
        // }
        // finally{
        //     console.log("finally block code is executed whether exceptions occur or not")
        // }


// using through keyword 

        // function add(x, y) {
        //     if (typeof x !== 'number') {
        //     throw 'The first argument must be a number';
        //     }
        //     if (typeof y !== 'number') {
        //     throw 'The second argument must be a number';
        //     }
        
        //     return x + y;
        // }
        
        // try {
        //     const result = add('a', 10);
        //     console.log(result);
        // } catch (e) {
        //     console.log(e);
        // }
  



        // throwing instance of Error class
        // function add(x, y) {
        //     if (typeof x !== 'number') {
        //     throw new Error('The first argument must be a number');
        //     }
        //     if (typeof y !== 'number') {
        //     throw new Error('The second argument must be a number');
        //     }
        
        //     return x + y;
        // }
        
        // try {
        //     const result = add('10', 'k');
        //     console.log(result);
        //   } catch (e) {
        //     console.log(e.name, ':', e.message);
        //   }



        // Throwing an user-defined error

          class NumberError extends Error {
            constructor(value) {
              super(`"${value}" is not a valid number`);
              this.name = 'InvalidNumber';
            }
          }
          
        function add(x, y) {
            if (typeof x !== 'number') {
            throw new NumberError(x);
            }
            if (typeof y !== 'number') {
            throw new NumberError(y);
            }
        
            return x + y;
        }

        try {
            const result = add('a', 10);
            console.log(result);
          } catch (e) {
            console.log(e.name, ':', e.message);
          }

  