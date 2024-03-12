package com.db.loancalculatordb.Calculator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import com.db.loancalculatordb.Activity.MainActivity;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Global {
    public static int AdClickCnt = 1;
    public static int DEFAULT_DECIMAL_POINT = 0;
    public static int DEFAULT_NUMBER_FORMAT = 1;
    public static final float gst_on_fee = 18.0f;
    public static final double DOUBLE_EPSILON = Double.longBitsToDouble(1);
    public static String IMAGE_PATH = Environment.getExternalStorageDirectory() + "/EMI Calculator";
    public static int LoanDetailAdCnt = 1;
    public static int PrePaymentAdCnt = 4;
    public static String base_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoyw3S5vfRHh2/EEf0WnRAVZVP9CngBN3kq0GAOLBxEBwWUKgOhHFrXIm903oARWHaWKsdPtyDjy7Dg1UyyEgTFRRrDxLcIKaSkI7VtWfPb3b0QQXkDPMxWhIHcNh3zX2V8/Nxj9B61I/UIVyis9bJqtYHciEfP61t1T1FtqIvpJoqR/m1U1t8KswS+IBvqwfnl1cs9WHKY2a8NkCfdiXu5fmLaoIi8N9MS0RBh9PIZ5uh0EmnpN0nOQ1ir/oaAFe0mZi24xHh7CcuFc2YcxwVREZBLYV4J9f7UT1uftPhC8deNL0v1O4qbyutqorDj7/xlA6NrEtjfBYCNiSSbFLkQIDAQAB";
    public static int rateCnt = 3;

    public static Date addDays(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        calendar.add(5, i);
        return calendar.getTime();
    }

    public static String doubleToString(double d) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(getLocale());
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        decimalFormat.setMaximumFractionDigits(MainActivity.decimalPlace);
        return decimalFormat.format(d);
    }

    public static int dpToPx(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int getGregorianCal(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTime(new Date());
        return ((gregorianCalendar2.get(1) - gregorianCalendar.get(1)) * 12) + (gregorianCalendar2.get(2) - gregorianCalendar.get(2));
    }

    public static Locale getLocale() {
        int i = MainActivity.numberFormat;
        if (i == 0) {
            return Locale.getDefault();
        }
        if (i == 1) {
            return new Locale("hi");
        }
        if (i == 2) {
            return Locale.CANADA_FRENCH;
        }
        if (i == 3) {
            return new Locale("rm");
        }
        if (i == 4) {
            return Locale.ITALY;
        }
        if (i != 5) {
            return null;
        }
        return Locale.US;
    }

    public static Bitmap getMainViewBitmap(View view) {
        try {
            view.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-1);
            view.draw(canvas);
            view.setDrawingCacheEnabled(false);
            return createBitmap;
        } finally {
            view.destroyDrawingCache();
        }
    }

    public static String getValue(double d) {
        return String.format("%.2f", Double.valueOf(d));
    }

    public static boolean isNetworkAvailable(Context context) {
        @SuppressLint({"WrongConstant", "MissingPermission"}) NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isZeroDouble(String str) {
        return TextUtils.isEmpty(str) || stringToDouble(str).doubleValue() <= 0.0d;
    }

    public static boolean isZeroInt(String str) {
        return TextUtils.isEmpty(str) || Integer.parseInt(str) <= 0;
    }

    public static void setDecimalAmount(Context context, String str, EditText editText) {
        if (!str.contains(".") || str.substring(str.indexOf(".") + 1).length() <= 2) {
            return;
        }
        editText.setText(str.substring(0, str.length() - 1));
        editText.setSelection(editText.getText().length());
    }

    public static Double stringToDouble(String str) {
        double d;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(getLocale());
        decimalFormat.setDecimalSeparatorAlwaysShown(false);
        decimalFormat.setMaximumFractionDigits(MainActivity.decimalPlace);
        try {
            d = Double.parseDouble(decimalFormat.parse(str) + "");
        } catch (ParseException e) {
            e.printStackTrace();
            d = 0.0d;
        }
        return Double.valueOf(d);
    }
}
