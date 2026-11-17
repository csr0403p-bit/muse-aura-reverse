package com.facebook.aura.library.repo;

import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.EnumC10460Hji;
import X.EsN;
import X.F60;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$failed$1$1", f = "HatchGoalsTabDataSource.kt", l = {2055}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$pushFixedPositions$failed$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
    public final /* synthetic */ List<Map.Entry<String, Long>> $batch;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HatchGoalsTabDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabDataSource$pushFixedPositions$failed$1$1(List<? extends Map.Entry<String, Long>> list, HatchGoalsTabDataSource hatchGoalsTabDataSource, HtJ<? super HatchGoalsTabDataSource$pushFixedPositions$failed$1$1> htJ) {
        super(2, htJ);
        this.$batch = list;
        this.this$0 = hatchGoalsTabDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchGoalsTabDataSource$pushFixedPositions$failed$1$1 hatchGoalsTabDataSource$pushFixedPositions$failed$1$1 = new HatchGoalsTabDataSource$pushFixedPositions$failed$1$1(this.$batch, this.this$0, htJ);
        hatchGoalsTabDataSource$pushFixedPositions$failed$1$1.L$0 = obj;
        return hatchGoalsTabDataSource$pushFixedPositions$failed$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            List<Map.Entry<String, Long>> list = this.$batch;
            HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<Map.Entry<String, Long>> it = list.iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                arrayListA0i.add(AnonymousClass001.A10(new HatchGoalsTabDataSource$pushFixedPositions$failed$1$1$1$1(hatchGoalsTabDataSource, (String) entryA0l.getKey(), C3cG.A05(entryA0l.getValue()), null), c3ux));
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
        Iterable iterable = (Iterable) obj;
        int i2 = 0;
        if (!(iterable instanceof Collection) || !C3cG.A1N(iterable)) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!AnonymousClass001.A1X(it2.next()) && (i2 = i2 + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        return C3cG.A0R(i2);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
        return ((HatchGoalsTabDataSource$pushFixedPositions$failed$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
