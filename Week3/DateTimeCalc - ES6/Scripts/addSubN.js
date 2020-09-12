var x;
$(function(){
  
  $(".dropdown-menu li a").click(function(){
    console.log("hello");
    $(".btn:first-child").text($(this).text());
    $(".btn:first-child").val($(this).text());
    x = ($(this).text());
  });

});

const addition = () => {
	var date = document.getElementById('date').value;
	var n = document.getElementById('n').value;
	//var selected = getElementById('selected').value;	
	console.log("date = " + date +",n = " +n +", selected = " + x );
	var date1=new Date(date);
	var year1 = date1.getFullYear();
    var month1 = date1.getMonth()+1;
    var day1 = date1.getDate();
    var days = n;

    if(x=="Month")
    	days =  30*n;
    else if(x=="Weeks")
    	days = 7*n;


    year1 = year1+ Math.floor(days/365);
    days = days%365;
    month1 = month1 + Math.floor(days/30);
    days = days%30;
    day1 = day1 + days;

    if(day1>30){
      day1 =  day1 - 30;
      month1+=1;
}
      if(month1>12){
            month1-=12;
            year1+=1;
      }
     
     document.getElementById('showYears').innerHTML=year1;
     document.getElementById('showMonths').innerHTML=month1;
     document.getElementById('showDays').innerHTML=day1;
}

const subtract = () =>{
	var date = document.getElementById('date').value;
	var n = document.getElementById('n').value;
	//var selected = getElementById('selected').value;	
	var days = n;

    if(x=="Month")
    	days =  30*n;
    else if(x=="Weeks")
    	days = 7*n;

	var date1=new Date(date);
	var d = date1.setDate(date1.getDate() - days);
	var dd=new Date(d);

	var year1 = dd.getFullYear();
    var month1 = dd.getMonth()+1;
    var day1 = dd.getDate();

    
	document.getElementById('showYears').innerHTML=year1;
     document.getElementById('showMonths').innerHTML=month1;
     document.getElementById('showDays').innerHTML=day1;
}
