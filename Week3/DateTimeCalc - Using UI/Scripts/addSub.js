            


function addition() {
     var dateStart=document.getElementById('date1').value;
     var dateEnd=document.getElementById('date2').value;
     console.log("start date " + dateStart);
     var date1=new Date(dateStart);
     var date2=new Date(dateEnd);
     
     var year1 = date1.getFullYear();
     var month1 = date1.getMonth()+1;
     var day1 = date1.getDate();

     var year2 = date2.getFullYear();
     var month2 = date2.getMonth()+1;
     var day2 = date2.getDate();

     //assuming every month has 30 days
     var days = day1+day2;
     var months = month1+month2;
     var years = year1 + year2;
     
     if(days>30){
      days =  days - 30;
      months+=1;
}
      if(months>12){
            months-=12;
            years+=1;
      }
     
     document.getElementById('showYears').innerHTML=years;
     document.getElementById('showMonths').innerHTML=months;
     document.getElementById('showDays').innerHTML=days;
}

function subtract(){
     var dateStart=document.getElementById('date1').value;
     var dateEnd=document.getElementById('date2').value;
     var dateStarting=new Date(dateStart);
     var dateEnding=new Date(dateEnd);
     var diff=Math.abs(dateStarting-dateEnding);
     var years=Math.floor(diff/(365.25*24*60*60*1000));
     var remaining=Math.floor(diff%(365.25*24*60*60*1000));
     var months=Math.floor(remaining/((365.25/12)*24*60*60*1000));
     var remaining=Math.floor(remaining%((365.25/12)*24*60*60*1000));
     var days=Math.floor(remaining/(24*60*60*1000));

          document.getElementById('showYears').innerHTML=years;
     document.getElementById('showMonths').innerHTML=months;
     document.getElementById('showDays').innerHTML=days;
}




