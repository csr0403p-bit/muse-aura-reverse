package X;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: X.FXd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8161FXd {
    public static final WeakHashMap<String, NumberFormat> A00 = new WeakHashMap<>();

    public static final String A00(int i) {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(1);
        sbA0w.append('.');
        sbA0w.append(40);
        sbA0w.append('.');
        sbA0w.append(false);
        sbA0w.append('.');
        String strA0v = AnonymousClass001.A0v(Locale.getDefault().toLanguageTag(), sbA0w);
        WeakHashMap<String, NumberFormat> weakHashMap = A00;
        NumberFormat integerInstance = weakHashMap.get(strA0v);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(1);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(strA0v, integerInstance);
        }
        return integerInstance.format(Integer.valueOf(i));
    }
}
