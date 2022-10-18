
public class Operations {

    public boolean anioBisiesto(int anio){
        return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
    }

    public int diasPorMes(int mes, int anio){
        int dias = 0;
        switch(mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                if (anioBisiesto(anio)){
                    dias = 29;
                }else {
                    dias = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
        }
        return dias;
    }
}
