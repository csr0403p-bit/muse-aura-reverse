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

@DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$setGoalCompleted$1$3", f = "HatchGoalsTabDataSource.kt", l = {1617}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$setGoalCompleted$1$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $goalId;
    public int label;
    public final /* synthetic */ HatchGoalsTabDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabDataSource$setGoalCompleted$1$3(HatchGoalsTabDataSource hatchGoalsTabDataSource, String str, HtJ<? super HatchGoalsTabDataSource$setGoalCompleted$1$3> htJ) {
        super(2, htJ);
        this.this$0 = hatchGoalsTabDataSource;
        this.$goalId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGoalsTabDataSource$setGoalCompleted$1$3(this.this$0, this.$goalId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
            String str = this.$goalId;
            this.label = 1;
            if (hatchGoalsTabDataSource.runInFlightCompletion(str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGoalsTabDataSource$setGoalCompleted$1$3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
