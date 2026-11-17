package com.facebook.aura.globaleffects.api;

import X.AnonymousClass011;
import X.BFM;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class AppGlobalEffectKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AppGlobalEffects(final boolean r9, X.BFM r10, final int r11) {
        /*
            r0 = 1669427504(0x63817130, float:4.775572E21)
            r10.AgG(r0)
            r0 = r11 & 6
            r3 = 4
            r8 = 2
            if (r0 != 0) goto L82
            int r2 = X.AnonymousClass004.A0n(r10, r9)
            r2 = r2 | r11
        L11:
            r0 = r2 & 3
            r1 = 1
            r4 = 0
            boolean r0 = X.AnonymousClass002.A1P(r0, r8)
            boolean r0 = X.AnonymousClass001.A1b(r0, r10, r2)
            if (r0 == 0) goto Lc1
            r0 = r2 & 14
            if (r0 == r3) goto L24
            r1 = 0
        L24:
            java.lang.Object r3 = r10.AaT()
            if (r1 != 0) goto L2e
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L8c
        L2e:
            r7 = 1
            int[] r6 = new int[]{r4, r7}
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r8)
            r3 = 0
        L39:
            r0 = r6[r3]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L7b
            if (r0 != r7) goto L84
            com.facebook.aura.partners.voice.impl.VoiceAppGlobalEffectProvider r0 = com.facebook.aura.partners.voice.impl.VoiceAppGlobalEffectProvider.INSTANCE
            com.facebook.aura.globaleffects.api.AppGlobalEffect r1 = r0.effect()
        L49:
            X.HxE r0 = new X.HxE
            r0.<init>(r2, r1)
            r5.add(r0)
            int r3 = r3 + 1
            if (r3 < r8) goto L39
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r5.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.HxE r0 = (X.HxE) r0
            B r0 = r0.second
            X.C7384Etj.A0U(r0)
            com.facebook.aura.globaleffects.api.AppGlobalEffect r0 = (com.facebook.aura.globaleffects.api.AppGlobalEffect) r0
            boolean r0 = r0.getRunsUnderBlockingOverlay()
            if (r0 != r9) goto L5d
            r3.add(r1)
            goto L5d
        L7b:
            com.facebook.aura.confidentialvm.view.ConfidentialVmAppGlobalEffectProvider r0 = com.facebook.aura.confidentialvm.view.ConfidentialVmAppGlobalEffectProvider.INSTANCE
            com.facebook.aura.globaleffects.api.AppGlobalEffect r1 = r0.effect()
            goto L49
        L82:
            r2 = r11
            goto L11
        L84:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass005.A0c(r0)
            throw r0
        L89:
            r10.Ai0(r3)
        L8c:
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L92:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r1 = r3.next()
            X.HxE r1 = (X.HxE) r1
            A r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            B r2 = r1.second
            X.C7384Etj.A0U(r2)
            com.facebook.aura.globaleffects.api.AppGlobalEffect r2 = (com.facebook.aura.globaleffects.api.AppGlobalEffect) r2
            r1 = 213075428(0xcb345e4, float:2.762138E-31)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.Ag8(r1, r0)
            r2.Effect(r10, r4)
            r0 = r10
            X.BBI r0 = (X.BBI) r0
            X.BBI.A0R(r0, r4)
            goto L92
        Lc1:
            r10.Afo()
        Lc4:
            X.BBb r1 = r10.AAc()
            if (r1 == 0) goto Ld1
            com.facebook.aura.globaleffects.api.AppGlobalEffectKt$$ExternalSyntheticLambda0 r0 = new com.facebook.aura.globaleffects.api.AppGlobalEffectKt$$ExternalSyntheticLambda0
            r0.<init>()
            r1.A06 = r0
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.globaleffects.api.AppGlobalEffectKt.AppGlobalEffects(boolean, X.BFM, int):void");
    }

    public static final Unit AppGlobalEffects$lambda$2(boolean z, int i, BFM bfm, int i2) {
        AppGlobalEffects(z, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
