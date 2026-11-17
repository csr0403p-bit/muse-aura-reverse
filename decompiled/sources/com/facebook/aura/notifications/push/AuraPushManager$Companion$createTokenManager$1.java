package com.facebook.aura.notifications.push;

import X.AnonymousClass001;
import X.C6724EXi;
import X.C7384Etj;
import X.CTJ;
import X.DQZ;
import X.F18;
import X.F1M;
import android.content.Context;
import com.facebook.aura.notifications.push.AuraPushManager;
import com.facebook.pushlite.PushTokenManager;

/* loaded from: classes5.dex */
public final class AuraPushManager$Companion$createTokenManager$1<T> implements F18 {
    public final /* synthetic */ Context $context;

    public AuraPushManager$Companion$createTokenManager$1(Context context) {
        this.$context = context;
    }

    @Override // X.F18
    /* renamed from: get */
    public final PushTokenManager AMN() {
        Context context = this.$context;
        C7384Etj.A0Y(context, 0);
        DQZ dqz = new DQZ(8);
        Context contextA0I = AnonymousClass001.A0I(context);
        dqz.put("FCM", new CTJ(this.$context));
        dqz.put("FBNS", new F1M(this.$context, new F18() { // from class: com.facebook.aura.notifications.push.AuraPushManager$Companion$createTokenManager$1.1
            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return "944424684749591";
            }

            @Override // X.F18
            /* renamed from: get */
            public final String AMN() {
                return "944424684749591";
            }
        }));
        AuraPushManager.Companion companion = AuraPushManager.Companion;
        return new PushTokenManager(contextA0I, dqz, new AuraPushManager$Companion$createRefresherConfig$1(this.$context), C6724EXi.A00(17));
    }
}
