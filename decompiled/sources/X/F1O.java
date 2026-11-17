package X;

import android.app.NotificationManager;
import android.content.Context;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.pushlite.model.PushInfraMetaData;
import java.util.Map;

/* loaded from: classes5.dex */
public final class F1O {
    public final C8ee<?> A00;

    public static final void A00(Context context, F1O f1o, PushInfraMetaData pushInfraMetaData, String str, String str2, Map map) {
        String str3 = pushInfraMetaData.A0D;
        if (str3 == null || HatchPriceImpressionEventDataKt.NO_DISCOUNT.equals(str3)) {
            return;
        }
        Eu1 eu1AcquireEvent = f1o.A00.acquireEvent("messaging_notification_event");
        if (eu1AcquireEvent.isSampled()) {
            boolean zA1X = AnonymousClass002.A1X(pushInfraMetaData.A07);
            boolean z = pushInfraMetaData.A06 != null;
            map.put("isHPKEEncrypted", String.valueOf(zA1X));
            map.put("isZSTDCompressed", String.valueOf(z));
            map.put("push_lite_logger", "1");
            Long l = pushInfraMetaData.A04;
            if (l != null) {
                eu1AcquireEvent.A3f("push_usecase_id", l);
            }
            String str4 = pushInfraMetaData.A0G;
            if (str4 != null) {
                eu1AcquireEvent.A3y("pi_nid", str4);
            }
            String str5 = pushInfraMetaData.A0F;
            if (str5 != null) {
                eu1AcquireEvent.A3y("notif_id", str5);
            }
            String str6 = pushInfraMetaData.A0E;
            if (str6 != null) {
                eu1AcquireEvent.A3y("notif_type", str6);
            }
            Long l2 = pushInfraMetaData.A05;
            if (l2 != null) {
                eu1AcquireEvent.A3f(NodeCommandFallbackWorker.KEY_USER_ID, l2);
            }
            if (context != null) {
                try {
                    Object systemService = context.getSystemService("notification");
                    C7384Etj.A0Z(systemService, C60N.A00(26));
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    if (notificationManager != null) {
                        Boolean boolValueOf = Boolean.valueOf(notificationManager.areNotificationsEnabled());
                        C7552F2z c7552F2z = new C7552F2z();
                        AbstractC8150FWo.A02(c7552F2z, "notification_enabled", boolValueOf);
                        eu1AcquireEvent.A3z(c7552F2z, "typed_os_settings");
                    }
                } catch (NoClassDefFoundError e) {
                    BzX.A01("NotificationSettingWrapper", e, "Failed to initialize notification managers");
                }
            }
            C08119su c08119su = C9sU.A03;
            C07779iq c07779iq = C07779iq.A01;
            String strA02 = c08119su.A02(map, new C9tS(c07779iq, c07779iq));
            eu1AcquireEvent.A3y("notif_event", str);
            eu1AcquireEvent.A3y("channel", str2);
            eu1AcquireEvent.A3y("notif_event_log_flag", str3);
            eu1AcquireEvent.A3y("extra_info", strA02);
            eu1AcquireEvent.APu();
        }
    }

    public F1O(C8ee<?> c8ee) {
        this.A00 = c8ee;
    }
}
