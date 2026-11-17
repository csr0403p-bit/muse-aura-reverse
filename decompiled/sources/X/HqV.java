package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.library.model.HatchLibraryViewModelKt;

/* loaded from: classes6.dex */
public abstract class HqV extends Enum<HqV> {
    public static String A00(Integer num) {
        if (num == null) {
            return HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        switch (num.intValue()) {
            case 1:
                return "END_ARRAY";
            case 2:
                return "START_OBJECT";
            case 3:
                return "END_OBJECT";
            case 4:
                return HatchLibraryViewModelKt.LEGACY_SORT_NAME;
            case 5:
                return "STRING";
            case 6:
                return "EXPRESSION";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "START_ARRAY";
        }
    }
}
