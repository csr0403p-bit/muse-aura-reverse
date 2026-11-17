package com.facebook.aura.maps;

/* loaded from: classes3.dex */
public abstract class HatchMapsNativeFallbackKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberUsesNativeMapsFallback(X.BFM r4, int r5) {
        /*
            java.lang.Object r0 = r4.AaT()
            java.lang.Object r3 = X.C78N.A00
            if (r0 != r3) goto L22
            X.1BN<com.facebook.aura.maps.HatchMapsNativeModuleState> r0 = com.facebook.aura.maps.HatchMapsNativeModule.state
            java.lang.Object r1 = r0.getValue()
            com.facebook.aura.maps.HatchMapsNativeModuleState r0 = com.facebook.aura.maps.HatchMapsNativeModuleState.READY
            if (r1 == r0) goto L1d
            com.facebook.aura.appmodules.AuraAppModules r1 = com.facebook.aura.appmodules.AuraAppModules.INSTANCE
            java.lang.String r0 = "maps_native"
            boolean r1 = r1.isInstalled(r0)
            r0 = 1
            if (r1 == 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            java.lang.Boolean r0 = X.AnonymousClass001.A0j(r4, r0)
        L22:
            boolean r2 = X.AnonymousClass001.A1X(r0)
            if (r2 == 0) goto L42
            r0 = -594582700(0xffffffffdc8f6354, float:-3.22881073E17)
            r4.AgE(r0)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r4.AaT()
            if (r0 != r3) goto L3b
            com.facebook.aura.maps.HatchMapsNativeFallbackKt$rememberUsesNativeMapsFallback$1$1 r0 = com.facebook.aura.maps.HatchMapsNativeFallbackKt$rememberUsesNativeMapsFallback$1$1.INSTANCE
            r4.Ai0(r0)
        L3b:
            X.AnonymousClass001.A17(r4, r0, r1)
        L3e:
            X.AnonymousClass002.A19(r4)
            return r2
        L42:
            r0 = -594492366(0xffffffffdc90c432, float:-3.25984925E17)
            r4.AgE(r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchMapsNativeFallbackKt.rememberUsesNativeMapsFallback(X.BFM, int):boolean");
    }
}
