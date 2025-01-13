public enum Currency {
  HKD ("Hong Kong Dollar", 1),
  CNY ("Chinese Yuan Renminbi", 2),
  USD ("US Dollar", 3),
  ;

  private final String desc;
  private final int value;

  private Currency(String desc, int value){
    this.desc = desc;
    this.value = value;
  }

  public String getDesc (){
return this.desc;
  }
  

  public static String getDescription (Currency currency){
    if (currency == Currency.HKD){
      return Currency.HKD.getDesc();
    } else if (currency == Currency.CNY){
      return Currency.CNY.getDesc();
    } else if (currency == Currency.USD){
      return Currency.USD.getDesc();
    }
    return null;
  }
public static void main (String[] args){
  System.out.println(Currency.getDescription(CNY));
}

}
