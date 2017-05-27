package br.com.beans;

public class expressionBean {

    private String nameParam;

    public String getNameParam() {
        return nameParam;
    }

    public void setNameParam(String nameParam) {
        this.nameParam = nameParam;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    private Object object;

    private String alias;

    private String nameClass;

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public expressionBean(String pNameParam, Object pObject, String pnameClass, String pAlias) {
        nameParam = pNameParam;
        object = pObject;
        nameClass = pnameClass;
        alias = pAlias;
    }
}
