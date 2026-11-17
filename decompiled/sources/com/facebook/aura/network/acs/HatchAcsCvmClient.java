package com.facebook.aura.network.acs;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.InterfaceC7549F2g;

/* loaded from: classes4.dex */
public final class HatchAcsCvmClient implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final HatchAnonCredProvider anonCredProvider;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: issueCredential-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1582issueCredentialIoAF18A(X.HtJ<? super X.HsJ<? extends X.A8F>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$1
            if (r0 == 0) goto L38
            r5 = r7
            com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$1 r5 = (com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3e
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$2 r0 = new com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$2
            r0.<init>(r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L38:
            com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$1 r5 = new com.facebook.aura.network.acs.HatchAcsCvmClient$issueCredential$1
            r5.<init>(r6, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.network.acs.HatchAcsCvmClient.m1582issueCredentialIoAF18A(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchAcsCvmClient getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAcsCvmClient) abstractC3358CGz.A03(HatchAcsCvmClient.class, new HatchAcsCvmClient$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAcsCvmClient(AbstractC3358CGz abstractC3358CGz) {
        this.anonCredProvider = HatchAnonCredProvider.Companion.getInstance(abstractC3358CGz);
    }

    public /* synthetic */ HatchAcsCvmClient(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
