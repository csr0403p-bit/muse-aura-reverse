package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.AyH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2092AyH extends Enum<AbstractC2092AyH> {
    public static String A00(Integer num) {
        if (num == null) {
            return HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        switch (num.intValue()) {
            case 1:
                return "NOT_CROSSED";
            case 2:
                return "COLLAPSED";
            default:
                return "CROSSED";
        }
    }
}
