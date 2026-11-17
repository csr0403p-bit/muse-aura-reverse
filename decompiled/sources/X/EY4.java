package X;

import com.facebook.aura.library.model.HatchLibraryViewModelKt;

/* loaded from: classes5.dex */
public abstract class EY4 extends Enum<EY4> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "END_ARRAY";
            case 2:
                return "BEGIN_OBJECT";
            case 3:
                return "END_OBJECT";
            case 4:
                return HatchLibraryViewModelKt.LEGACY_SORT_NAME;
            case 5:
                return "STRING";
            case 6:
                return "NUMBER";
            case 7:
                return "BOOLEAN";
            case 8:
                return "NULL";
            case 9:
                return "END_DOCUMENT";
            default:
                return "BEGIN_ARRAY";
        }
    }
}
