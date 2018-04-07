package es.unileon.prg.date;

import sun.security.util.DisabledAlgorithmConstraints;

public class Date {
	
	int _year;
	int _month;
	int _day;

	public Date(int year, int month, int day){
		_year=year;
		_month=month;
		_day=day;
				
		}
	public int getYear(int year){
		return _year;
	}
	public int getMonth(int month){
		return _month;
	}
	public int getDay(int day){
		return _day;
	}
	
	//SAMEYEAR
	public boolean isSameYear(int year){
		boolean igual=false;
		if(_year==year){
			igual=true;
		}
		return igual;
	}
	//SAMEMONTH
	public boolean isSameMonth(int month){
		boolean igual=false;
		if(_month==month){
			igual=true;
		}
		return igual;
	}
	//SAMEDAY
	public boolean isSameDay(int day){
		boolean igual=false;
		if(_day==day){
			igual=true;
		}
		return igual;
	}
	//SAMEDATE
	public boolean isSame(int year,int month, int day){
		boolean igual=false;
		if((_day==day) && (_month==month) && (_year==year)){
			igual=true;
		}
		return igual;
	}
	//------------WITHOUT IF-----------------
	public boolean isSameisSameDayWithOutIf(int day){
		return (_day==day);
	}
	public boolean isSameMonthWithOutIf(int month){
		return (_month==month);
	}
	public boolean isSameYearWithOutIf(int year){
		return(_year==year);
	}
	public boolean isSameWithOutIf(int day, int month, int year){
		return ((_day==day) && (_month==month) && (_year==year));
	}
	//Imprimir el mes
	public String getMonthName(int month){
		String NombreMes="";
		//StringBuffer mes=new StringBuffer();
		switch(month){
		case 1:
			NombreMes="Enero";
			//mes.append("Enero");
			break;
		case 2:
			NombreMes="Febrero";
			//mes.append("Febrero");
			break;
		case 3:
			NombreMes="Marzo";
			//mes.append("Marzo");
			break;
		case 4:
			NombreMes="Abril";
			//mes.append("Abril");
			break;
		case 5:
			NombreMes="Mayo";
			//mes.append("Mayo");
			break;
		case 6:
			NombreMes="Junio";
			//mes.append("Junio");
			break;
		case 7:
			NombreMes="Julio";
			//mes.append("Julio");
			break;
		case 8:
			NombreMes="Agosto";
			//mes.append("Agosto");
			break;
		case 9:
			NombreMes="Septiembre";
			//mes.append("Septiembre");
			break;
		case 10:
			NombreMes="Octubre";
			//mes.append("Octubre");
			break;
		case 11:
			NombreMes="Noviembre";
			//mes.append("Noviembre");
			break;
		case 12:
			NombreMes="Diciembre";
			//mes.append("Diciembre");
			break;
		}
		return NombreMes;
		//return mes;
	}
	//Comprobar dia correcto
	public String checkMonthDay(int month){
		int day=0;
		switch(month){
		
		case 2: 
			day=28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day=30;
			break;
			default: day=31;
		
		}
		String Check="CORRECTO";
		if(day<_day){
			Check="INCORRECTO";
		}
		return Check;
	}
	//Season
	public String Season(int month, int day){
		String estacion="";
		switch(month){
		case 1:
			estacion="Invierno";
			break;
		case 2:
			estacion="Invierno";
		case 3:
			if(_day<=20){
				estacion="Invierno";
				}else{
					estacion="Primavera";
			}
			break;
		case 4:
			estacion="Primavera";
			break;
		case 5:
			estacion="Primavera";
		case 6:
			if(_day<=20){
				estacion="Primavera";
			}else{
				estacion="Verano";
			}
			break;
		case 7:
			estacion="Verano";
			break;
		case 8:
			estacion="Verano";
			break;
		case 9:
			if(_day<=23){
				estacion="Verano";
			}else{
				estacion="Otoño";
			}
			break;
		case 10:
			estacion="Otoño";
			break;
		case 11:
			estacion="Otoño";
			break;
		case 12:
			if(_day<=21){
				estacion="Otoño";
			}else{
				estacion="Invierno";
			}
			break;
		}
		return estacion;
	}
	//MOTHS_UNTIL_YEAR_ENDS
	public int monthsUntilYearEnd(int month){
		int contador=0;
		for (int i = month; i <=12; i++) {
			contador++;
		}
		return contador;
	}
	//Imprimir DATE
	public String ImprimirDate(int day, int month, int year){
		//StringBuffer imprime=new StringBuffer();
		//imprime.append(day+"/"+month+"/"+year);
		String imprimo=day+"/"+month+"/"+year;
		return imprimo;
		//return imprime;
	}
	//DAYS_TILL_MONTH_END
	public int DaysUntilMonthEnd(int day, int month){
		int numeroDia=0;
		int contador=0;

		switch(month){
		case 2: 
			numeroDia=28;
			contador=numeroDia-day;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numeroDia=30;
			contador=numeroDia-day;
			break;
			default:
				numeroDia=31;
				contador=numeroDia-day;
				break;
		}
		return contador;
	}
	//IMPRIMO MESES CON EL MISMO NUMERO DE DIAS
	public String imprimoMesesConDia(int day){
		String imprime="";
		//StringBuilder imprimo= new StringBuilder();
		if(day==28){
			imprime="Febrero";
			//imprimo.append("Febrero");
		}
		else if(day==30){
			imprime="Abril,Junio,Septiembre y Noviembre";
			//imprimo.append("Abril,Junio,Septiembre y Noviembre");
		}
		else if(day==31){
			imprime="Enero,Marzo,Mayo,Julio,Agosto,Octubre y Diciembre";
			//imprimo.append("Enero,Marzo,Mayo,Julio,Agosto,Octubre y Diciembre");
		}
		return imprime;
		//return imprimo;
	}

//FIRST DAY

	public int SinceFirstDay(int day, int month){
		//int primerDia=0; duda de si es 1
		int numerosDias=0;
		int contador=0;
		int resto=day;
		for(int i=month;i<=12;i++){
		switch(i){
		case 1:
			numerosDias=31;
			contador=numerosDias+contador;
		case 2:
			numerosDias=28;
			contador=numerosDias+contador;
			break;
		case 3:
			numerosDias=31;
			contador=numerosDias+contador;
			break;
		case 4:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 5:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 6:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 7:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 8:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 9:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 10:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 11:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 12:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		}
		}
		contador=contador-resto;
		return contador;
	}
	//OTRA OPCION METODO ANTERIOR
	/*public int sinceFirstDay(int day, int month){
	 * int numeroDias=0;
	 * int contador=0;
	 * for(int i=month-1;i<=12;i++{
	 * switch(i){
		case 1:
			numerosDias=31;
			contador=numerosDias+contador;
		case 2:
			numerosDias=28;
			contador=numerosDias+contador;
			break;
		case 3:
			numerosDias=31;
			contador=numerosDias+contador;
			break;
		case 4:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 5:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 6:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 7:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 8:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 9:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 10:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		case 11:
			numerosDias=30;
			contador=contador+numerosDias;
			break;
		case 12:
			numerosDias=31;
			contador=contador+numerosDias;
			break;
		}
		}
		contador=contador+day;
		return contador;
	 * }
	 * */
	 
	//METODO PARA ACERTAR NUMERO ALEATORIO WHILE
	public int igualarFechaRandomWhile(int day, int month){
		int contador=0;
		boolean correcto;
		
		
		while(correcto=false){
			//Para numeros aleatorios puedes: numAleatorio= Math.random(0
			month=(int) Math.ceil(Math.random() * 13); //aleatorios de 1 a 12
				if(month==4 || month==6 || month==9 || month==11){
						 day=(int) Math.ceil(Math.random() * 31);//aleatorios de 1 a 30
					}
					else if( month==2){
						 day=(int) Math.ceil(Math.random() * 29);//aleatorios de 1 a 28
					}
					else{
						 day=(int) Math.ceil(Math.random() * 32);//aleatorios de 1 a 31
					}
					contador++;
					if(_month==month && _day==day){
						correcto=true;
					}
				}
		return contador;
	}
	//METODO PARA ACERTAR NUMERO ALEATORIO DO WHILE
	public int igualarFechaRandomDoWhile(int month, int day){
		int contador=0;
		boolean correcto;
		
		//do while va a entrar una vez al menos
		do{
			month=(int) Math.ceil(Math.random() * 13); //aleatorios de 1 a 12
			if(month==4 || month==6 || month==9 || month==11){
					 day=(int) Math.ceil(Math.random() * 31);//aleatorios de 1 a 30
				}
				else if( month==2){
					 day=(int) Math.ceil(Math.random() * 29);//aleatorios de 1 a 28
				}
				else{
					 day=(int) Math.ceil(Math.random() * 32);//aleatorios de 1 a 31
				}
				contador++;
			if( _month==month && _day==day){
				correcto=true;
			}
			
		}while(correcto=false);
		return contador;
	}
	
	//METODO DE DIA DE LA SEMANA ALEATORIO

	public String diaSemanaAleatorio(int day, int month){
		//LLamo al metodo para que me calcule el numero de dias que han pasado desde el primer dia
		int numeroDias=SinceFirstDay(day, month);
		
		int contador=0;	//Me va a servir para saber que dia de la semana es
		String cadena="";
		int mes=1; //mes lo inicializo a 1 porque es el primer mes(Enero)
		//Hago el modulo de 7 porque la semana tiene 7 dias
		while(numeroDias>7){
			numeroDias=numeroDias%7;
		}
		for(int i=1;i<=numeroDias;i++){
			contador++;
		}
		switch(contador){
		case 1:
			cadena="Lunes";
			break;
		case 2:
			cadena="Martes";
			break;
		case 3:
			cadena="Miercoles";
			break;
		case 4:
			cadena="Jueves";
			break;
		case 5: 
			cadena="Viernes";
			break;
		case 6:
			cadena="Sabado";
			break;
		case 7:
			cadena="Domingo";
			break;
			
		}
		return cadena;
	}
}
