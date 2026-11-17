package com.facebook.aura.status.viewmodel;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.subscription.repo.TopUpPack;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$prices$1", f = "AuraBuyCreditsViewModel.kt", l = {229}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraBuyCreditsViewModel$fetchPlayPrices$prices$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Map<String, ? extends PlayPackPrice>>, Object> {
    public final /* synthetic */ List<TopUpPack> $packs;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsViewModel$fetchPlayPrices$prices$1(List<TopUpPack> list, HtJ<? super AuraBuyCreditsViewModel$fetchPlayPrices$prices$1> htJ) {
        super(2, htJ);
        this.$packs = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBuyCreditsViewModel$fetchPlayPrices$prices$1(this.$packs, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super Map<String, PlayPackPrice>> htJ) {
        return new AuraBuyCreditsViewModel$fetchPlayPrices$prices$1(this.$packs, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r4 = 1
            if (r0 == 0) goto L65
            if (r0 != r4) goto Lc1
            java.lang.Object r8 = r9.L$3
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r7 = r9.L$2
            java.util.Collection r7 = (java.util.Collection) r7
            X.Hwg.A00(r10)
        L14:
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r0 = r10.entrySet()
            X.AbstractC0882AGj.A0r(r0, r7)
        L1d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L94
            java.util.Map$Entry r0 = X.C3cH.A0l(r8)
            java.lang.String r6 = X.C60O.A0t(r0)
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            com.facebook.aura.iap.HatchSubscriptionPurchase r3 = com.facebook.aura.iap.HatchSubscriptionPurchase.INSTANCE
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r1.next()
            com.facebook.aura.subscription.repo.TopUpPack r0 = (com.facebook.aura.subscription.repo.TopUpPack) r0
            java.lang.String r0 = r0.playProductId
            r2.add(r0)
            goto L3b
        L4d:
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r7
            r9.L$3 = r8
            r9.L$4 = r0
            r9.L$5 = r0
            r9.L$6 = r0
            r9.label = r4
            java.lang.Object r10 = r3.fetchTopUpPrices(r2, r6, r9)
            if (r10 != r5) goto L14
            return r5
        L65:
            X.Hwg.A00(r10)
            java.util.List<com.facebook.aura.subscription.repo.TopUpPack> r0 = r9.$packs
            java.util.LinkedHashMap r3 = X.C3cG.A0j()
            java.util.Iterator r2 = r0.iterator()
        L72:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.subscription.repo.TopUpPack r0 = (com.facebook.aura.subscription.repo.TopUpPack) r0
            java.lang.String r0 = r0.productType
            java.lang.Object r0 = X.C60R.A0Z(r0, r3)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L72
        L8b:
            java.util.ArrayList r7 = X.C3cG.A0h()
            java.util.Iterator r8 = X.C3cG.A0i(r3)
            goto L1d
        L94:
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r7.iterator()
        L9e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lbc
            java.util.Map$Entry r0 = X.C3cH.A0l(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.iap.HatchTierPrice r0 = (com.facebook.aura.iap.HatchTierPrice) r0
            com.facebook.aura.status.viewmodel.PlayPackPrice r0 = com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModelKt.toPlayPackPrice(r0)
            if (r0 == 0) goto L9e
            X.AnonymousClass002.A1J(r1, r0, r3)
            goto L9e
        Lbc:
            java.util.Map r5 = X.AGH.A06(r3)
            return r5
        Lc1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.AuraBuyCreditsViewModel$fetchPlayPrices$prices$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Map<String, ? extends PlayPackPrice>> htJ) {
        return invoke2(c3ux, (HtJ<? super Map<String, PlayPackPrice>>) htJ);
    }
}
