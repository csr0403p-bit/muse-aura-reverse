package com.facebook.aura.activation.model;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class TosConsentKt {
    public static final String ANDROID_DEFAULT_DISCLOSURE_VERSION = "android_default";

    @DebugMetadata(c = "com.facebook.aura.activation.model.TosConsentKt", f = "TosConsent.kt", l = {16}, m = "submitTosConsent", v = 2)
    /* renamed from: com.facebook.aura.activation.model.TosConsentKt$submitTosConsent$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TosConsentKt.submitTosConsent(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object submitTosConsent(com.facebook.aura.activation.repo.AuraActivationRepository r6, com.facebook.aura.activation.data.HatchTosMetadata r7, java.lang.String r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.activation.model.TosConsentKt.AnonymousClass1
            if (r0 == 0) goto L60
            r5 = r9
            com.facebook.aura.activation.model.TosConsentKt$submitTosConsent$1 r5 = (com.facebook.aura.activation.model.TosConsentKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L74
            X.Hwg.A00(r2)
        L20:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L66
            com.facebook.aura.perf.HatchActivationQplLogger r1 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE
            java.lang.String r0 = "tos_accepted"
            r1.pointFlow(r0)
            return r2
        L30:
            X.Hwg.A00(r2)
            com.facebook.aura.perf.HatchActivationQplLogger r1 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE
            java.lang.String r0 = "tos_submitted"
            r1.pointFlow(r0)
            if (r7 == 0) goto L40
            java.lang.String r2 = r7.disclosureVersion
            if (r2 != 0) goto L42
        L40:
            java.lang.String r2 = "android_default"
        L42:
            java.lang.String r0 = "consent_version"
            r1.annotateFlow(r0, r2)
            if (r7 == 0) goto L4d
            java.lang.String r1 = r7.disclosureText
            if (r1 != 0) goto L4e
        L4d:
            r1 = r8
        L4e:
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.label = r3
            java.lang.Object r2 = r6.acceptTosConsent(r1, r2, r5)
            if (r2 != r4) goto L20
            return r4
        L60:
            com.facebook.aura.activation.model.TosConsentKt$submitTosConsent$1 r5 = new com.facebook.aura.activation.model.TosConsentKt$submitTosConsent$1
            r5.<init>(r9)
            goto L12
        L66:
            com.facebook.aura.perf.HatchActivationQplLogger r3 = com.facebook.aura.perf.HatchActivationQplLogger.INSTANCE
            r7 = 0
            java.lang.String r4 = "tos_accept"
            java.lang.String r5 = "mutation_error"
            java.lang.String r6 = "false_result"
            r8 = r7
            r3.pointActivationStepFailed(r4, r5, r6, r7, r8)
            return r2
        L74:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.TosConsentKt.submitTosConsent(com.facebook.aura.activation.repo.AuraActivationRepository, com.facebook.aura.activation.data.HatchTosMetadata, java.lang.String, X.HtJ):java.lang.Object");
    }
}
