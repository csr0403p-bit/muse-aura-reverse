package com.facebook.aura.mobileconfig.session;

/* loaded from: classes5.dex */
public final class AuraMobileConfigSession$create$builder$1 {
    public final /* synthetic */ AuraMobileConfigSession this$0;

    public AuraMobileConfigSession$create$builder$1(AuraMobileConfigSession auraMobileConfigSession) {
        this.this$0 = auraMobileConfigSession;
    }

    public final String getUserId() {
        return this.this$0.userIdProvider.invoke();
    }
}
