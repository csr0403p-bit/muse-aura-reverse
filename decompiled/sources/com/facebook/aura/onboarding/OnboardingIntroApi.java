package com.facebook.aura.onboarding;

import X.AbstractC3358CGz;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class OnboardingIntroApi {
    public static final OnboardingIntroApi INSTANCE = new OnboardingIntroApi();
    public static final String REQUEST_ID_HEADER = "x-request-id";

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingIntroApi", f = "OnboardingIntroApi.kt", l = {103}, m = "getVariants", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingIntroApi$getVariants$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingIntroApi.this.getVariants(null, this);
        }
    }

    /* renamed from: getIntro-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m1614getIntroBWLJW6A$default(OnboardingIntroApi onboardingIntroApi, AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return onboardingIntroApi.m1615getIntroBWLJW6A(abstractC3358CGz, str, str2, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* renamed from: getIntro-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1615getIntroBWLJW6A(X.AbstractC3358CGz r28, java.lang.String r29, java.lang.String r30, X.HtJ<? super X.HsJ<com.facebook.aura.onboarding.OnboardingIntroResponse>> r31) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingIntroApi.m1615getIntroBWLJW6A(X.CGz, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getVariants(X.AbstractC3358CGz r18, X.HtJ<? super java.util.List<java.lang.String>> r19) {
        /*
            r17 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.onboarding.OnboardingIntroApi.AnonymousClass1
            if (r0 == 0) goto L71
            r3 = r4
            com.facebook.aura.onboarding.OnboardingIntroApi$getVariants$1 r3 = (com.facebook.aura.onboarding.OnboardingIntroApi.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r3.label = r2
        L14:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L32
            if (r0 != r14) goto L7a
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L23:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L29
            r2 = r0
        L29:
            com.facebook.aura.onboarding.OnboardingVariantsPayloadJson r2 = (com.facebook.aura.onboarding.OnboardingVariantsPayloadJson) r2
            if (r2 == 0) goto L79
            java.util.List r1 = r2.toDomain()
            return r1
        L32:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$OnboardingVariants r7 = com.facebook.aura.network.api.JarvisPath.OnboardingVariants.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.onboarding.OnboardingIntroApi$getVariants$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.onboarding.OnboardingIntroApi$getVariants$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.L$3 = r10
            r3.L$4 = r10
            r3.L$5 = r10
            r3.L$6 = r10
            r3.L$7 = r10
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r9 = r18
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r3
            java.lang.Object r2 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r2 != r1) goto L23
            return r1
        L71:
            com.facebook.aura.onboarding.OnboardingIntroApi$getVariants$1 r3 = new com.facebook.aura.onboarding.OnboardingIntroApi$getVariants$1
            r0 = r17
            r3.<init>(r4)
            goto L14
        L79:
            return r0
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingIntroApi.getVariants(X.CGz, X.HtJ):java.lang.Object");
    }
}
