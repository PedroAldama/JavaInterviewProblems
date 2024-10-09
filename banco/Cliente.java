public class Cliente{
    private String name;
    private String code;
    private String password;
    private Double money;

    public Cliente(){
        this.money = 0.0;
    }

    public Cliente(String name, String code, String password){
        this.name = name;
        this.code = code;
        this.password = password;
        this.money = 0.0;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }

    public String getPassword(){
        return this.password;
    }

    public Double getMoney(){
        return this.money;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setMoney(Double money){
        this.money = money;
    }
}