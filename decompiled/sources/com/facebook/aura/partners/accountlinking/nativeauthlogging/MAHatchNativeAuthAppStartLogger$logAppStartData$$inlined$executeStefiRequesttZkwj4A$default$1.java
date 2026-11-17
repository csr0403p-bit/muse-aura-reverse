package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$logAppStartData$$inlined$executeStefiRequest-tZkwj4A$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class MAHatchNativeAuthAppStartLogger$logAppStartData$$inlined$executeStefiRequesttZkwj4A$default$1 extends AbstractC7559F3s implements Function0<C9hr<NativeAuthAppStartDataRequestJson>> {
    public static final MAHatchNativeAuthAppStartLogger$logAppStartData$$inlined$executeStefiRequesttZkwj4A$default$1 INSTANCE = new MAHatchNativeAuthAppStartLogger$logAppStartData$$inlined$executeStefiRequesttZkwj4A$default$1();

    public MAHatchNativeAuthAppStartLogger$logAppStartData$$inlined$executeStefiRequesttZkwj4A$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<NativeAuthAppStartDataRequestJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = NativeAuthAppStartDataRequestJson.$childSerializers;
        return NativeAuthAppStartDataRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<NativeAuthAppStartDataRequestJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = NativeAuthAppStartDataRequestJson.$childSerializers;
        return NativeAuthAppStartDataRequestJson$$serializer.INSTANCE;
    }
}
