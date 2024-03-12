package com.db.loancalculatordb.EMIFormula;

public class GST_Formulas {
    public Double getGST_Add_Total(String str, String str2) {
        Double.valueOf(0.0d);
        return Double.valueOf(Double.valueOf(Double.parseDouble(str)).doubleValue() + getAddGSTAmount(str, str2).doubleValue());
    }

    public Double getAddGSTAmount(String str, String str2) {
        return Double.valueOf((Double.parseDouble(str) / 100.0d) * Double.parseDouble(str2));
    }

    public Double getGST_Actual_Amount(String str, String str2) {
        Double.valueOf(0.0d);
        return Double.valueOf((Double.valueOf(Double.parseDouble(str)).doubleValue() * 100.0d) / (Double.valueOf(Double.parseDouble(str2)).doubleValue() + 100.0d));
    }

    public Double getSubtractGSTAmount(String str, String str2) {
        return Double.valueOf(Double.parseDouble(str) - getGST_Actual_Amount(str, str2).doubleValue());
    }
}
