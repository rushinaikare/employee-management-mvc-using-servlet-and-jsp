/**
 * 
 */

/**
 * 
 */

function validate(){
	var age = document.createEmp.age.value;
	var postalcode = document.createEmp.postalcode.value;


   if(isNaN(age)){

	 document.getElementById("ageid").innerHTML = "Please enter Numeric value"; 
                    return false;
    
    }

   if(isNaN(postalcode)){

	 document.getElementById("postalid").innerHTML = "Please enter Numeric value"; 
                    return false;
    
   }

}

function validateUpdateEmp(){
		var age  =document.updateEmp.age.value;
	    var postalcode = document.updateEmp.postalcode.value;
         if(isNaN(age)){

	    document.getElementById("ageid").innerHTML = "Please enter Numeric value"; 
                    return false;
                
    }

   if(isNaN(postalcode)){

	 document.getElementById("postalid").innerHTML = "Please enter Numeric value"; 
                    return false;
    
   }
}

function msg(){
	alert("hello");
}

   
