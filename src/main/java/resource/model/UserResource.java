package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResource {

    @JsonProperty
    private int Id;
    @JsonProperty("full_name")
    private String FullName;
    @JsonProperty("CPF")
    private String Cpf;
    @JsonProperty
    private int Agency;
    @JsonProperty
    private int FlagLevel;
    @JsonProperty
    private String Account;
    @JsonProperty
    private int Departament;
    @JsonProperty
    private int Bank;
    @JsonProperty("approver")
    private int Approver;
    @JsonProperty
    private String Login;
    @JsonProperty
    private String Senha;

    public UserResource(int id, String fullName, String cpf, int agency, int flagLevel,
            String account, int department, int bank, int approver, String login, String senha) {

        this.Id = id;
        this.FullName = fullName;
        this.Cpf = cpf;
        this.Agency = agency;
        this.FlagLevel = flagLevel;
        this.Account = account;
        this.Departament = department;
        this.Bank = bank;
        this.Approver = approver;
        this.Login = login;
        this.Senha = senha;
    }
    public UserResource() {}
    public void SetId(int id) {
        this.Id = id;
    }

    public int GetId() {
        return this.Id;
    }

    public void SetFullName(String fullName) {
        this.FullName = fullName;
    }
  
    public String GetFullName() {
        return this.FullName;
    }

    public void GetCpf(String cpf) {
        this.Cpf = cpf;
    }

    public String SetCpf() {
        return this.Cpf;
    }

    public void SetAgency(int agency) {
        this.Agency = agency;
    }

    public int GetAgency() {
        return this.Agency;
    }

    public void SetFlagLevel(int flagLevel) {
        this.FlagLevel = flagLevel;
    }

    public int GetFlagLevel() {
        return this.FlagLevel;
    }

    public void SetAccount(String account) {
        this.Account = account;
    }

    public String GetAccount() {
        return this.Account;
    }

    public void SetDepartament(int departament) {
        this.Departament = departament;
    }

    public int GetDepartament() {
        return this.Departament;
    }

    public void SetBank(int bank) {
        this.Bank = bank;
    }

    public int GetBank() {
        return this.Bank;
    }

    public void SetApprover(int approver) {
        this.Approver = approver;
    }

    public int GetApprover() {
        return this.Approver;
    }
    
    public void SetLogin(String login) {
        this.Login= login;
    }

    public String GetLogin() {
        return this.Login;
    }
    
    public void SetSenha(String senha) {
        this.Senha = senha;
    }

    public String GetSenha() {
        return this.Senha;
    }
}
