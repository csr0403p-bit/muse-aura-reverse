package com.facebook.aura.status.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C05663ul;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3pU;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.viewmodel.HatchStatusPillViewModel$special$$inlined$flatMapLatest$1", f = "HatchStatusPillViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusPillViewModel$special$$inlined$flatMapLatest$1 extends AbstractC07127nr implements G0W<C20Z<? super Boolean>, Boolean, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HatchStatusPillViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillViewModel$special$$inlined$flatMapLatest$1(HtJ htJ, HatchStatusPillViewModel hatchStatusPillViewModel) {
        super(3, htJ);
        this.this$0 = hatchStatusPillViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Q c20qA03;
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (AnonymousClass001.A1X(obj2)) {
                long jLongValue = this.this$0.botStatusMuteStore.userSendCount.getValue().longValue();
                c20qA03 = C3rb.A03(new HatchStatusPillViewModel$isWithinForegroundGrace$1$2(jLongValue, null), new C05663ul(new HatchStatusPillViewModel$isWithinForegroundGrace$1$1(null)), this.this$0.botStatusMuteStore.userSendCount);
            } else {
                c20qA03 = new C20Y(AnonymousClass001.A0h());
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c20qA03, c20z) == enumC10460Hji) {
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

    @Override // X.G0W
    public final Object invoke(C20Z<? super Boolean> c20z, Boolean bool, HtJ<? super Unit> htJ) {
        HatchStatusPillViewModel$special$$inlined$flatMapLatest$1 hatchStatusPillViewModel$special$$inlined$flatMapLatest$1 = new HatchStatusPillViewModel$special$$inlined$flatMapLatest$1(htJ, this.this$0);
        hatchStatusPillViewModel$special$$inlined$flatMapLatest$1.L$0 = c20z;
        hatchStatusPillViewModel$special$$inlined$flatMapLatest$1.L$1 = bool;
        return hatchStatusPillViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
