package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* loaded from: classes6.dex */
public abstract class FKB extends Enum<FKB> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CENTER";
            case 2:
                return "END";
            case 3:
                return HatchPersistedMessageJson.UNSEND_STATUS_NONE;
            default:
                return "START";
        }
    }
}
