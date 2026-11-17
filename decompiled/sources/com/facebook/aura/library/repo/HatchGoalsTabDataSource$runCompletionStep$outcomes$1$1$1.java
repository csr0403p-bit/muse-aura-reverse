package com.facebook.aura.library.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$runCompletionStep$outcomes$1$1$1", f = "HatchGoalsTabDataSource.kt", l = {2141}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$runCompletionStep$outcomes$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super GoalCompletionOutcome>, Object> {
    public final /* synthetic */ String $id;
    public final /* synthetic */ GoalCompletionStep $step;
    public int label;
    public final /* synthetic */ HatchGoalsTabDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabDataSource$runCompletionStep$outcomes$1$1$1(HatchGoalsTabDataSource hatchGoalsTabDataSource, String str, GoalCompletionStep goalCompletionStep, HtJ<? super HatchGoalsTabDataSource$runCompletionStep$outcomes$1$1$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGoalsTabDataSource;
        this.$id = str;
        this.$step = goalCompletionStep;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGoalsTabDataSource$runCompletionStep$outcomes$1$1$1(this.this$0, this.$id, this.$step, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
            String str = this.$id;
            boolean z = this.$step.completed;
            this.label = 1;
            obj = hatchGoalsTabDataSource.patchGoalStatus(str, z, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super GoalCompletionOutcome> htJ) {
        return ((HatchGoalsTabDataSource$runCompletionStep$outcomes$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
