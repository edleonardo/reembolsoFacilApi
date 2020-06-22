package datasource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

    @Id
    private int Id;
    @Column(name = "full_name")
    private String FullName;
    private String Cpf;
    private int Agency;
    private int FlagLevel;
    private String Account;
    private int Departament;
    private int Bank;
    private int Approver;

    public User(int id, String fullName, String cpf, int agency, int flagLevel,
            String account, int department, int bank, int approver) {

        this.Id = id;
        this.FullName = fullName;
        this.Cpf = cpf;
        this.Agency = agency;
        this.FlagLevel = flagLevel;
        this.Account = account;
        this.Departament = department;
        this.Bank = bank;
        this.Approver = approver;
    }

    @SuppressWarnings("unused")
    private User() {
    }

    public void SetId(int id) {
        this.Id = id;
    }

    public int GetId() {
        return this.Id;
    }

    public void GetFullName(String fullName) {
        this.FullName = fullName;
    }

    public String SetFullName() {
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
}
