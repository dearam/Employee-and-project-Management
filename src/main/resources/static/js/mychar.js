
var chardataStr=decodeHtml(chardata);
var charjsonarray=JSON.parse(chardataStr);
var arrayLength=charjsonarray.length;

var numaricdata=[];
var labledata=[];
for(var i=0;i<arrayLength;i++){
	
	numaricdata[i]=charjsonarray[i].alue;
	labledata[i]=charjsonarray[i].label;
}


new Chart(document.getElementById("mypiechart"), {
	
  type: 'polarArea',
  data : {
    labels: labledata,
    datasets: [{
      label: 'My First dataset', 
      backgroundColor: [
      'rgb(255, 99, 132)',
      'rgb(75, 192, 192)',
      'rgb(255, 205, 86)'],
      borderColor: '#000000',
      data: numaricdata
    }]
  },
  options:{
	  title:{
		  display:true,
		  text: 'Project Statuses'
	  }
  }
});

//'[{"label":"COMPLETED","alue":1},{"label":"INPROGRESS","alue":2},{"label":"NOTSTARTED","alue":1}]'
function decodeHtml(html){
	var txt=document.createElement("textarea");
	txt.innerHTML=html;
	return txt.value;
	
}
