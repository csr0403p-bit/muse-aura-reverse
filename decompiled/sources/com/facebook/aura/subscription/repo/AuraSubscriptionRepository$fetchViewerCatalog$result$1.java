package com.facebook.aura.subscription.repo;

import X.AbstractC07127nr;
import X.G0U;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$result$1", f = "AuraSubscriptionRepository.kt", l = {418, 839}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionRepository$fetchViewerCatalog$result$1 extends AbstractC07127nr implements G0U<HtJ<? super ViewerCatalogResponseJson>, Object> {
    public final /* synthetic */ boolean $isCvm;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionRepository$fetchViewerCatalog$result$1(boolean z, HtJ<? super AuraSubscriptionRepository$fetchViewerCatalog$result$1> htJ) {
        super(1, htJ);
        this.$isCvm = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AuraSubscriptionRepository$fetchViewerCatalog$result$1(this.$isCvm, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super ViewerCatalogResponseJson> htJ) {
        return new AuraSubscriptionRepository$fetchViewerCatalog$result$1(this.$isCvm, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L21
            if (r0 == r1) goto L32
            if (r0 != r2) goto L60
            java.lang.Object r3 = X.AnonymousClass001.A0q(r15)
        L10:
            java.lang.Throwable r2 = X.HsJ.A00(r3)
            r1 = 0
            if (r2 == 0) goto L1c
            java.lang.String r0 = "fetch_catalog"
            com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt.recordServerFailure(r0, r2, r1)
        L1c:
            boolean r0 = r3 instanceof X.C10571Hud
            if (r0 == 0) goto L5f
            return r1
        L21:
            com.facebook.aura.network.http.HatchHttpApi r5 = X.C60O.A06(r15)
            com.facebook.aura.iap.HatchSubscriptionPurchase r0 = com.facebook.aura.iap.HatchSubscriptionPurchase.INSTANCE
            r14.L$0 = r5
            r14.label = r1
            java.lang.Object r15 = r0.storeCountry(r14)
            if (r15 != r4) goto L39
            return r4
        L32:
            java.lang.Object r5 = r14.L$0
            com.facebook.aura.network.http.HatchHttpApi r5 = (com.facebook.aura.network.http.HatchHttpApi) r5
            X.Hwg.A00(r15)
        L39:
            java.lang.String r15 = (java.lang.String) r15
            boolean r0 = r14.$isCvm
            com.facebook.aura.subscription.repo.SubscriptionStefiPath$ViewerCatalog r8 = new com.facebook.aura.subscription.repo.SubscriptionStefiPath$ViewerCatalog
            r8.<init>(r15, r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r12 = X.C9jH.A00
            com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$result$1$invokeSuspend$$inlined$executeStefiRequest-bMdYcbs$default$1 r6 = com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$result$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r7 = 0
            r10 = 0
            r14.L$0 = r10
            r14.L$1 = r10
            r14.L$2 = r10
            r14.L$3 = r10
            r14.L$4 = r10
            r14.label = r2
            r11 = r10
            r13 = r12
            java.lang.Object r3 = r5.m1596executeBodylessStefiRequestWithtZkwj4A(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r4) goto L10
            return r4
        L5f:
            return r3
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$fetchViewerCatalog$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
