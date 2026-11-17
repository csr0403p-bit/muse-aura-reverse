package com.facebook.aura.notifications.push;

import X.AnonymousClass001;
import X.C3963Ci8;
import X.C3964Ci9;
import X.C3966CiB;
import X.C60N;
import X.F18;
import X.InterfaceC3965CiA;
import android.content.Context;
import com.facebook.aura.notifications.push.AuraPushHandler;
import com.facebook.aura.notifications.push.AuraPushManager;
import com.facebook.aura.notifications.push.VmLockedPushHandler;

/* loaded from: classes5.dex */
public final class AuraPushManager$Companion$createDispatcher$1<T> implements F18 {
    public final /* synthetic */ Context $context;

    public AuraPushManager$Companion$createDispatcher$1(Context context) {
        this.$context = context;
    }

    @Override // X.F18
    /* renamed from: get */
    public final C3966CiB AMN() {
        C3963Ci8 c3963Ci8 = new C3963Ci8();
        AuraPushManager.Companion companion = AuraPushManager.Companion;
        AuraPushManager$Companion$createPigeonDriver$1 auraPushManager$Companion$createPigeonDriver$1 = new AuraPushManager$Companion$createPigeonDriver$1();
        final Context context = this.$context;
        F18 f18 = new F18() { // from class: com.facebook.aura.notifications.push.AuraPushManager$Companion$createDispatcher$1.1
            @Override // X.F18
            /* renamed from: get */
            public final InterfaceC3965CiA AMN() {
                VmLockedPushHandler.Companion companion2 = VmLockedPushHandler.Companion;
                return new VmLockedPushHandler(AnonymousClass001.A0I(context));
            }
        };
        String strA00 = C60N.A00(87);
        C3964Ci9 c3964Ci9 = new C3964Ci9(f18);
        synchronized (c3963Ci8) {
            c3963Ci8.A00.put(strA00, c3964Ci9);
        }
        final Context context2 = this.$context;
        return new C3966CiB(auraPushManager$Companion$createPigeonDriver$1, new C3963Ci8(c3963Ci8), new F18() { // from class: com.facebook.aura.notifications.push.AuraPushManager$Companion$createDispatcher$1.2
            @Override // X.F18
            /* renamed from: get */
            public final InterfaceC3965CiA AMN() {
                AuraPushHandler.Companion companion2 = AuraPushHandler.Companion;
                return new AuraPushHandler(context2.getApplicationContext());
            }
        });
    }
}
