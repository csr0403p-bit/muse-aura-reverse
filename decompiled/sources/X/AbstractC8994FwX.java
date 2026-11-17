package X;

import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;

/* renamed from: X.FwX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8994FwX extends Enum<AbstractC8994FwX> {
    public final String aggregationTypeString;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "duration";
            case 1:
                return "avg";
            case 2:
                return "min";
            case 3:
                return "max";
            case 4:
                return "total";
            default:
                return AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT;
        }
    }
}
