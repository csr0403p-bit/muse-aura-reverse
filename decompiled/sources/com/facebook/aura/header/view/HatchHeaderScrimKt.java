package com.facebook.aura.header.view;

import X.AnonymousClass002;
import com.facebook.aura.header.view.ScrimConfig;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchHeaderScrimKt {
    public static final float HeavyScrimHoldPower = 2.0f;
    public static final float StandardScrimHoldPower = 1.0f;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrimConfig.ScrollAware.Variant.values().length];
            try {
                AnonymousClass002.A13(ScrimConfig.ScrollAware.Variant.STANDARD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ScrimConfig.ScrollAware.Variant.HEAVY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* renamed from: HatchHeaderScrim-DzVHIIc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m995HatchHeaderScrimDzVHIIc(com.facebook.aura.header.view.ScrimConfig r17, float r18, X.BRg r19, float r20, X.BFM r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchHeaderScrimKt.m995HatchHeaderScrimDzVHIIc(com.facebook.aura.header.view.ScrimConfig, float, X.BRg, float, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: rememberSolidScrim-ek8zF_U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.header.view.ScrimConfig m996rememberSolidScrimek8zF_U(long r3, X.BFM r5, int r6) {
        /*
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r5.A64(r3)
            if (r0 != 0) goto L12
        Ld:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r1 = r5.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L34
        L1d:
            r0 = 0
            X.HxE r1 = X.AnonymousClass007.A0g(r0, r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.HxE r0 = X.AnonymousClass007.A0g(r0, r3)
            X.HxE[] r0 = new X.HxE[]{r1, r0}
            com.facebook.aura.header.view.ScrimConfig$CustomStops r1 = new com.facebook.aura.header.view.ScrimConfig$CustomStops
            r1.<init>(r0)
            r5.Ai0(r1)
        L34:
            com.facebook.aura.header.view.ScrimConfig$CustomStops r1 = (com.facebook.aura.header.view.ScrimConfig.CustomStops) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchHeaderScrimKt.m996rememberSolidScrimek8zF_U(long, X.BFM, int):com.facebook.aura.header.view.ScrimConfig");
    }

    public static final ScrimConfig resolveInner(ScrimConfig.ScrollAware scrollAware) {
        ScrimConfig standard;
        int iOrdinal = scrollAware.variant.ordinal();
        if (iOrdinal == 0) {
            standard = new ScrimConfig.Standard(scrollAware.color);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            standard = new ScrimConfig.Heavy(scrollAware.color);
        }
        return standard;
    }
}
