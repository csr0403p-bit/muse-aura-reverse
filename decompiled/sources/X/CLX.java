package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class CLX implements CAN {
    @Override // X.CAN
    public final CLb classify(String str, Intent intent, ClassLoader classLoader, boolean z) {
        String str2;
        if (intent == null || (intent.getFlags() & 1048576) == 0) {
            if (intent != null) {
                if (BV5.A1Q(intent, "android.intent.action.MAIN") && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER")) {
                    str2 = "appIconTap";
                } else if (BV5.A1Q(intent, "android.intent.action.SEND") || BV5.A1Q(intent, "android.intent.action.SEND_MULTIPLE") || BV5.A1Q(intent, "com.facebook.reels.SHARE_TO_REEL")) {
                    str2 = "contentShared";
                }
            }
            if (!z || intent == null || intent.getExtras() == null) {
                return null;
            }
            Bundle bundle = new Bundle(intent.getExtras());
            bundle.setClassLoader(classLoader);
            try {
                if (bundle.getBoolean("is_from_widget", false)) {
                    return new CLb("widget", AGH.A0E());
                }
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                String string = bundle.getString("notification_source");
                String string2 = bundle.getString("event_type");
                if (string2 != null) {
                    linkedHashMapA0j.put("notifEventType", string2);
                }
                long j = bundle.getLong("target_tab_id", -1L);
                if (j != -1) {
                    BV4.A1F("notifTargetTabId", linkedHashMapA0j, j);
                }
                if (string == null) {
                    return null;
                }
                linkedHashMapA0j.put("notifSource", string);
                return new CLb("notification", linkedHashMapA0j);
            } catch (Exception e) {
                CFK.A08("ActivityStartReasonClassifier", "Bundle has duplicate key and will explode later", e);
                return null;
            }
        }
        str2 = "appSwitcher";
        return new CLb(str2, AGH.A0E());
    }
}
