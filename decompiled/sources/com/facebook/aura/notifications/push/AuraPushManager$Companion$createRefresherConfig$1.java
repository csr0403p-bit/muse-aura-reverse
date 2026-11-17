package com.facebook.aura.notifications.push;

import X.AbstractC0885AGm;
import X.AbstractC3938ChQ;
import X.C3937ChP;
import X.C60O;
import X.C8ee;
import X.F38;
import X.InterfaceC3940ChV;
import X.InterfaceC3941ChW;
import X.InterfaceC3957Chw;
import android.content.Context;
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class AuraPushManager$Companion$createRefresherConfig$1 {
    public final /* synthetic */ Context $context;
    public final InterfaceC3940ChV encryptionConfig;
    public final boolean isAsyncRegister;

    public AuraPushManager$Companion$createRefresherConfig$1(Context context) {
        this.$context = context;
    }

    public InterfaceC3940ChV getEncryptionConfig() {
        return null;
    }

    public /* bridge */ C8ee<?> getLoggerContext() {
        return null;
    }

    public /* bridge */ F38 getPushUniverse() {
        return null;
    }

    public AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1 getTokenRefreshListener() {
        return new AuraPushManager$Companion$createRefresherConfig$1$tokenRefreshListener$1();
    }

    public /* bridge */ InterfaceC3941ChW getTokenRegistrationSuccessListener() {
        return null;
    }

    public boolean isAsyncRegister() {
        return this.isAsyncRegister;
    }

    public AbstractC3938ChQ<?> jobSchedulerCompat() {
        Context context = this.$context;
        if (context != null) {
            return new C3937ChP(context.getApplicationContext());
        }
        throw C60O.A0i(ReplyAttributionSerializer.TYPE_CONTEXT);
    }

    public ArrayList<InterfaceC3957Chw> senders() {
        return AbstractC0885AGm.A0x(new AuraPushTokenSender(this.$context));
    }

    public boolean shouldTurnOffJobSchedulerForPreMarshmallow() {
        return false;
    }
}
