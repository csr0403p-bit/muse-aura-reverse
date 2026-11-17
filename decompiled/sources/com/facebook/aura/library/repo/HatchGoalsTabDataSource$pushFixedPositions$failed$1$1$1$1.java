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

@DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$pushFixedPositions$failed$1$1$1$1", f = "HatchGoalsTabDataSource.kt", l = {2054}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$pushFixedPositions$failed$1$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ long $position;
    public int label;
    public final /* synthetic */ HatchGoalsTabDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabDataSource$pushFixedPositions$failed$1$1$1$1(HatchGoalsTabDataSource hatchGoalsTabDataSource, String str, long j, HtJ<? super HatchGoalsTabDataSource$pushFixedPositions$failed$1$1$1$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGoalsTabDataSource;
        this.$goalId = str;
        this.$position = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGoalsTabDataSource$pushFixedPositions$failed$1$1$1$1(this.this$0, this.$goalId, this.$position, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGoalsTabDataSource hatchGoalsTabDataSource = this.this$0;
            String str = this.$goalId;
            long j = this.$position;
            this.label = 1;
            obj = hatchGoalsTabDataSource.patchFixedPosition(str, j, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HatchGoalsTabDataSource$pushFixedPositions$failed$1$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
