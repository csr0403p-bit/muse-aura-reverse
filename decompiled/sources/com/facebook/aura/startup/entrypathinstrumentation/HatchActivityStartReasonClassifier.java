package com.facebook.aura.startup.entrypathinstrumentation;

import X.AIW;
import X.BV5;
import X.C06H;
import X.C0924AIa;
import X.C7384Etj;
import X.CAN;
import X.CLX;
import X.CLb;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes5.dex */
public final class HatchActivityStartReasonClassifier implements CAN {
    public static final Companion Companion = new Companion();
    public static final String DEEPLINK_HANDLER_ACTIVITY_NAME = "com.facebook.aura.main.AuraDeeplinkHandlerActivity";
    public final CLX baseClassifier = new CLX();

    @Override // X.CAN
    public CLb classify(String str, Intent intent, ClassLoader classLoader, boolean z) {
        String path;
        String host;
        C7384Etj.A0Y(str, 0);
        if (!str.equals("com.facebook.aura.main.AuraDeeplinkHandlerActivity") || intent == null || !BV5.A1Q(intent, "android.intent.action.VIEW") || intent.getData() == null) {
            return this.baseClassifier.classify(str, intent, classLoader, z);
        }
        C0924AIa c0924AIa = new C0924AIa();
        Uri data = intent.getData();
        if (data != null && (host = data.getHost()) != null) {
            c0924AIa.put("deepLinkHost", host);
        }
        Uri data2 = intent.getData();
        if (data2 != null && (path = data2.getPath()) != null) {
            c0924AIa.put("deepLinkPath", path);
        }
        return new CLb("deepLink", AIW.A0K(c0924AIa));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
