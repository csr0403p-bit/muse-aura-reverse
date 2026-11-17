package com.facebook.aura.login.nativeflow;

import X.AnonymousClass003;
import X.C7438Evz;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginViewModel$oneTap$1 extends C7438Evz implements Function0<Boolean> {
    public NativeLoginViewModel$oneTap$1(Object obj) {
        super(0, obj, NativeLoginRememberedAccounts.class, "isEnabled", "isEnabled()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass003.A1Y(((NativeLoginRememberedAccounts) this.receiver).isRememberDeviceEnabled));
    }
}
