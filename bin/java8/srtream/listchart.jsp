<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript">
      google.charts.load("current", {packages:["corechart"]});
      google.charts.setOnLoadCallback(fillSalesTable);

      function drawChart(dataarray) {

        var data = google.visualization.arrayToDataTable(dataarray);

       /*  var options = {
          title: 'Pay iteam values',

          pieSliceText: 'label',
          slices: {  4: {offset: 0.2},
                    12: {offset: 0.3},
                    14: {offset: 0.4},
                    15: {offset: 0.5},
          },
          bars: 'horizontal'
        }; */
        
        var options = {
                chart: {
                  title: 'Company Performance',
                  subtitle: 'Sales, Expenses, and Profit: 2014-2017',
                },
                bars: 'horizontal' // Required for Material Bar Charts.
              };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(data, options);
      }
      


      function fillSalesTable(){
    	  var dataarray=[];
    	  var temparray=['talks','lang'];
    	  var salesdata = ${SalesList};
    	  dataarray.push(temparray);
    	  var obj= salesdata;
    	  var table=document.getElementById("piechart");
    	  var tableRef=table.getElementsByTagName('tbody')[0];
    	  
    	  $(obj.SalesList).each(function(index,value){
    		  var row = tableRef.insertRow(tableRef.rows.length);
    		  var cell1=row.insertCell(0);
    		  var cell2=row.insertCell(1);
    		  cell1.innerHTML=value.talks;
    		  cell2.innerHTML=value.lang;    		  
    		 dataarray.push([value.talks,parseInt(value.lang)]);

    	  });
    	  drawChart(dataarray); 
      }
    </script>
  </head>
  <body>
     <table id="piechart" style="width: 1000px; height:100px;">
     <tbody></tbody>
     </table> 
  </body>
</html>