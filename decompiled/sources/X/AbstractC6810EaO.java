package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.EaO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6810EaO extends Enum<AbstractC6810EaO> {
    public static String A00(Integer num) {
        if (num == null) {
            return HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        switch (num.intValue()) {
            case 1:
                return "END_LIST";
            case 2:
                return "STRING";
            case 3:
                return "NUMBER";
            case 4:
                return "BOOLEAN";
            case 5:
                return "NULL";
            case 6:
                return "END_DOCUMENT";
            default:
                return "BEGIN_LIST";
        }
    }
}
