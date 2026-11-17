package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3UX;
import X.C60Q;
import X.EnumC10460Hji;
import X.EsN;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository$connectionNames$3$1", f = "PairsRepository.kt", l = {400}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsRepository$connectionNames$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ List<String> $chunk;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ PairsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsRepository$connectionNames$3$1(List<String> list, PairsRepository pairsRepository, HtJ<? super PairsRepository$connectionNames$3$1> htJ) {
        super(2, htJ);
        this.$chunk = list;
        this.this$0 = pairsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        PairsRepository$connectionNames$3$1 pairsRepository$connectionNames$3$1 = new PairsRepository$connectionNames$3$1(this.$chunk, this.this$0, htJ);
        pairsRepository$connectionNames$3$1.L$0 = obj;
        return pairsRepository$connectionNames$3$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            List<String> list = this.$chunk;
            PairsRepository pairsRepository = this.this$0;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(AnonymousClass001.A10(new PairsRepository$connectionNames$3$1$1$1(pairsRepository, AnonymousClass005.A0j(it), null), c3ux));
            }
            this.L$0 = null;
            this.label = 1;
            obj = EsN.A00(arrayListA0i, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        List listA0U = AbstractC0878AGe.A0U((Iterable) obj);
        PairsRepository pairsRepository2 = this.this$0;
        Iterator it2 = listA0U.iterator();
        while (it2.hasNext()) {
            HxE hxEA10 = C60Q.A10(it2);
            pairsRepository2.connectionNameCache.put(hxEA10.first, hxEA10.second);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PairsRepository$connectionNames$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
