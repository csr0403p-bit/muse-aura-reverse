package com.facebook.aura.partners.voice.infra;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class VoiceOnboardingRepository {
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository", f = "VoiceOnboardingRepository.kt", l = {61}, m = "reset", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
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
            return VoiceOnboardingRepository.this.reset(this);
        }
    }

    public VoiceOnboardingRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reset(X.HtJ<? super com.facebook.aura.partners.voice.infra.VoiceOnboardingStatusJson> r25) {
        /*
            r24 = this;
            r4 = r25
            boolean r0 = r4 instanceof com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository.AnonymousClass1
            r5 = r24
            if (r0 == 0) goto L86
            r2 = r4
            com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$1 r2 = (com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository.AnonymousClass1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L86
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r15 = 1
            if (r0 == 0) goto L2b
            if (r0 != r15) goto L8c
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L2a
            r1 = 0
        L2a:
            return r1
        L2b:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.voice.api.VoiceJarvisPath$VoiceOnboardingReset r7 = com.facebook.aura.partners.voice.api.VoiceJarvisPath.VoiceOnboardingReset.INSTANCE
            X.9jH r0 = X.C9jH.A00
            kotlinx.serialization.json.JsonObject r8 = new kotlinx.serialization.json.JsonObject
            r8.<init>(r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r10 = r5.userSession
            r6 = 0
            X.HxE[] r13 = new X.HxE[r6]
            java.util.Set r14 = X.AnonymousClass004.A18()
            com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r11 = 0
            r2.L$0 = r11
            r2.L$1 = r11
            r2.L$2 = r11
            r2.L$3 = r11
            r2.L$4 = r11
            r2.L$5 = r11
            r2.L$6 = r11
            r2.L$7 = r11
            r2.I$0 = r15
            r2.I$1 = r15
            r2.I$2 = r6
            r2.I$3 = r15
            r2.I$4 = r6
            r2.I$5 = r6
            r2.I$6 = r6
            r2.label = r15
            r12 = r11
            r16 = r15
            r18 = r11
            r19 = r6
            r20 = r15
            r21 = r6
            r22 = r6
            r23 = r11
            r24 = r6
            r25 = r2
            r17 = r0
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r0 == r1) goto L2a
            r1 = r0
            goto L25
        L86:
            com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$1 r2 = new com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository$reset$1
            r2.<init>(r4)
            goto L16
        L8c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository.reset(X.HtJ):java.lang.Object");
    }
}
