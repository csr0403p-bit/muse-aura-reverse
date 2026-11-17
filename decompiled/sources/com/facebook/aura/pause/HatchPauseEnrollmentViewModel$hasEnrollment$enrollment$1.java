package com.facebook.aura.pause;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C20Q;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1", f = "HatchPauseEnrollmentViewModel.kt", l = {434}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $hatchlingId;
    public int label;
    public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str, HtJ<? super HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchPauseEnrollmentViewModel;
        this.$hatchlingId = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1(this.this$0, this.$hatchlingId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<EnrollmentData> enrollment = this.this$0.store.getEnrollment(this.$hatchlingId);
            this.label = 1;
            obj = AbstractC9777Gfy.A02(enrollment, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Boolean.valueOf(obj != null);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
