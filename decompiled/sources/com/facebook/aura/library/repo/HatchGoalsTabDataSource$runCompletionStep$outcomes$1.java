package com.facebook.aura.library.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3UX;
import X.EnumC10460Hji;
import X.EsN;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$outcomes$1", f = "HatchGoalsTabDataSource.kt", l = {2141}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$runCompletionStep$outcomes$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends GoalCompletionOutcome>>, Object> {
    public final /* synthetic */ List<String> $goalIds;
    public final /* synthetic */ GoalCompletionStep $step;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HatchGoalsTabDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabDataSource$runCompletionStep$outcomes$1(List<String> list, HatchGoalsTabDataSource hatchGoalsTabDataSource, GoalCompletionStep goalCompletionStep, HtJ<? super HatchGoalsTabDataSource$runCompletionStep$outcomes$1> htJ) {
        super(2, htJ);
        this.$goalIds = list;
        this.this$0 = hatchGoalsTabDataSource;
        this.$step = goalCompletionStep;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchGoalsTabDataSource$runCompletionStep$outcomes$1 hatchGoalsTabDataSource$runCompletionStep$outcomes$1 = new HatchGoalsTabDataSource$runCompletionStep$outcomes$1(this.$goalIds, this.this$0, this.$step, htJ);
        hatchGoalsTabDataSource$runCompletionStep$outcomes$1.L$0 = obj;
        return hatchGoalsTabDataSource$runCompletionStep$outcomes$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            List<String> list = this.$goalIds;
            HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
            GoalCompletionStep goalCompletionStep = this.$step;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(AnonymousClass001.A10(new HatchGoalsTabDataSource$runCompletionStep$outcomes$1$1$1(hatchGoalsTabDataSource, AnonymousClass005.A0j(it), goalCompletionStep, null), c3ux));
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
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super List<? extends GoalCompletionOutcome>> htJ) {
        return ((HatchGoalsTabDataSource$runCompletionStep$outcomes$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
