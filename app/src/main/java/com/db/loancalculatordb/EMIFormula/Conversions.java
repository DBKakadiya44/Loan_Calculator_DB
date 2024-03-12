package com.db.loancalculatordb.EMIFormula;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public class Conversions {
    public static double round(double d, int i) {
        if (i >= 0) {
            return new BigDecimal(d).setScale(i, RoundingMode.HALF_UP).doubleValue();
        }
        throw new IllegalArgumentException();
    }
}
