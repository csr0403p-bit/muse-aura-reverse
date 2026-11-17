package X;

import android.view.autofill.AutofillValue;

/* loaded from: classes4.dex */
public final class AlV {
    public static final AlV A00 = new AlV();

    public static final AutofillValue A00(String str) {
        if (str.length() >= 5000) {
            str = (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? BQG.A17(str, 4999) : BQG.A17(str, 5000);
        }
        return AutofillValue.forText(str);
    }
}
