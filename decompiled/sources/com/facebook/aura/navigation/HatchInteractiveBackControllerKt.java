package com.facebook.aura.navigation;

/* loaded from: classes.dex */
public abstract class HatchInteractiveBackControllerKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.navigation.HatchInteractiveBackController rememberHatchInteractiveBackController(com.facebook.aura.navigation.AuraNavKey r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, X.BFM r12, int r13) {
        /*
            X.AnonymousClass003.A0u(r10, r11)
            X.28u r0 = X.C1EP.A00(r12)
            if (r0 == 0) goto L73
            X.B9b r7 = r0.getNavigationEventDispatcher()
        Ld:
            com.facebook.aura.navigation.AuraNavigator r9 = X.AnonymousClass003.A0b(r12)
            java.lang.Object r6 = r12.AaT()
            java.lang.Object r3 = X.C78N.A00
            if (r6 != r3) goto L21
            X.2mE r6 = new X.2mE
            r6.<init>()
            r12.Ai0(r6)
        L21:
            X.2mE r6 = (X.C2mE) r6
            androidx.compose.runtime.MutableState r8 = X.C1er.A00(r12, r11)
            boolean r4 = X.AnonymousClass005.A1R(r12, r7, r6, r9)
            r0 = r13 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L38
            boolean r0 = r12.A65(r10)
            if (r0 != 0) goto L3d
        L38:
            r1 = r13 & 6
            r0 = 0
            if (r1 != r2) goto L3e
        L3d:
            r0 = 1
        L3e:
            r4 = r4 | r0
            java.lang.Object r5 = r12.AaT()
            if (r4 != 0) goto L47
            if (r5 != r3) goto L4f
        L47:
            com.facebook.aura.navigation.DefaultHatchInteractiveBackController r5 = new com.facebook.aura.navigation.DefaultHatchInteractiveBackController
            r5.<init>(r6, r7, r8, r9, r10)
            r12.Ai0(r5)
        L4f:
            com.facebook.aura.navigation.DefaultHatchInteractiveBackController r5 = (com.facebook.aura.navigation.DefaultHatchInteractiveBackController) r5
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r6, r5, r9}
            boolean r0 = r12.A65(r5)
            boolean r1 = X.AnonymousClass005.A1V(r12, r9, r7, r6, r0)
            java.lang.Object r0 = r12.AaT()
            if (r1 != 0) goto L65
            if (r0 != r3) goto L6d
        L65:
            com.facebook.aura.navigation.HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1 r0 = new com.facebook.aura.navigation.HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1
            r0.<init>(r9, r7, r6, r5)
            r12.Ai0(r0)
        L6d:
            X.G0U r0 = (X.G0U) r0
            X.C78e.A07(r12, r0, r2)
            return r5
        L73:
            r7 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.HatchInteractiveBackControllerKt.rememberHatchInteractiveBackController(com.facebook.aura.navigation.AuraNavKey, kotlin.jvm.functions.Function0, X.BFM, int):com.facebook.aura.navigation.HatchInteractiveBackController");
    }
}
