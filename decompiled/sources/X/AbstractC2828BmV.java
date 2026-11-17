package X;

import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* renamed from: X.BmV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2828BmV extends Enum<AbstractC2828BmV> {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return CvmMigrationStatusJson.STAGE_STARTED;
            case 2:
                return "PAUSED";
            case 3:
                return "STOPPING";
            case 4:
                return "PENDING_START";
            case 5:
                return "PENDING_START_PAUSED";
            case 6:
                return "PENDING_RELEASE";
            case 7:
                return "ERROR";
            case 8:
                return "RELEASED";
            default:
                return "CONFIGURED";
        }
    }
}
