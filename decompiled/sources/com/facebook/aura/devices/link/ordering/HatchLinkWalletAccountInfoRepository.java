package com.facebook.aura.devices.link.ordering;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchLinkWalletAccountInfoRepository {
    public static final int $stable = 0;
    public static final HatchLinkWalletAccountInfoRepository INSTANCE = new HatchLinkWalletAccountInfoRepository();

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository", f = "HatchLinkWalletAccountInfo.kt", l = {54}, m = "fetchSavedDetails", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository$fetchSavedDetails$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLinkWalletAccountInfoRepository.this.fetchSavedDetails(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchSavedDetails(X.HtJ<? super com.facebook.aura.devices.link.ordering.HatchLinkSavedDetails> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository.AnonymousClass1
            if (r0 == 0) goto L3e
            r4 = r6
            com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository$fetchSavedDetails$1 r4 = (com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L44
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            boolean r0 = r1 instanceof X.C10571Hud
            r2 = 0
            if (r0 == 0) goto L27
            r1 = r2
        L27:
            com.facebook.aura.wallet.address.HatchWalletAccountInfoResponseJson r1 = (com.facebook.aura.wallet.address.HatchWalletAccountInfoResponseJson) r1
            if (r1 == 0) goto L2f
            com.facebook.aura.devices.link.ordering.HatchLinkSavedDetails r2 = com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoKt.toSavedDetails(r1)
        L2f:
            return r2
        L30:
            X.Hwg.A00(r3)
            com.facebook.aura.wallet.address.HatchWalletAddressFetcher r0 = com.facebook.aura.wallet.address.HatchWalletAddressFetcher.INSTANCE
            r4.label = r1
            java.lang.Object r1 = r0.m3148fetchAccountInfoIoAF18A(r4)
            if (r1 != r2) goto L21
            return r2
        L3e:
            com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository$fetchSavedDetails$1 r4 = new com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository$fetchSavedDetails$1
            r4.<init>(r6)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkWalletAccountInfoRepository.fetchSavedDetails(X.HtJ):java.lang.Object");
    }
}
