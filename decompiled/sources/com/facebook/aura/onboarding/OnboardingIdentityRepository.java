package com.facebook.aura.onboarding;

import X.C06H;
import X.C5246DeB;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class OnboardingIdentityRepository {
    public static final Companion Companion = new Companion();

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingIdentityRepository", f = "OnboardingIdentityRepository.kt", l = {75}, m = "getIdentity", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingIdentityRepository$getIdentity$1, reason: invalid class name */
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
            return OnboardingIdentityRepository.this.getIdentity(null, this);
        }
    }

    public final class Companion {
        public final OnboardingIdentityRepository getInstance() {
            return (OnboardingIdentityRepository) C5246DeB.A00(32773);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getIdentity(X.AbstractC3358CGz r18, X.HtJ<? super com.facebook.aura.onboarding.OnboardingIdentity> r19) {
        /*
            r17 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.onboarding.OnboardingIdentityRepository.AnonymousClass1
            if (r0 == 0) goto L73
            r3 = r4
            com.facebook.aura.onboarding.OnboardingIdentityRepository$getIdentity$1 r3 = (com.facebook.aura.onboarding.OnboardingIdentityRepository.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r3.label = r2
        L14:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L32
            if (r0 != r14) goto L7c
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L23:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L29
            r2 = r0
        L29:
            com.facebook.aura.onboarding.OnboardingIdentityPayloadJson r2 = (com.facebook.aura.onboarding.OnboardingIdentityPayloadJson) r2
            if (r2 == 0) goto L7b
            com.facebook.aura.onboarding.OnboardingIdentity r1 = r2.toDomain()
            return r1
        L32:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$OnboardingIdentity r7 = com.facebook.aura.network.api.JarvisPath.OnboardingIdentity.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            r6 = 0
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.AGH.A0E()
            com.facebook.aura.onboarding.OnboardingIdentityRepository$getIdentity$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.onboarding.OnboardingIdentityRepository$getIdentity$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
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
        L73:
            com.facebook.aura.onboarding.OnboardingIdentityRepository$getIdentity$1 r3 = new com.facebook.aura.onboarding.OnboardingIdentityRepository$getIdentity$1
            r0 = r17
            r3.<init>(r4)
            goto L14
        L7b:
            return r0
        L7c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingIdentityRepository.getIdentity(X.CGz, X.HtJ):java.lang.Object");
    }
}
