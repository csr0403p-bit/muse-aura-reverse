package com.facebook.aura.graduation.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.graduation.repo.HatchGraduationState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.graduation.viewmodel.GraduationViewModel$uiState$1", f = "GraduationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class GraduationViewModel$uiState$1 extends AbstractC07127nr implements G2j<HatchGraduationState, Boolean, Boolean, HtJ<? super GraduationUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;

    public GraduationViewModel$uiState$1(HtJ<? super GraduationViewModel$uiState$1> htJ) {
        super(4, htJ);
    }

    public final Object invoke(HatchGraduationState hatchGraduationState, boolean z, boolean z2, HtJ<? super GraduationUiState> htJ) {
        GraduationViewModel$uiState$1 graduationViewModel$uiState$1 = new GraduationViewModel$uiState$1(htJ);
        graduationViewModel$uiState$1.L$0 = hatchGraduationState;
        graduationViewModel$uiState$1.Z$0 = z;
        graduationViewModel$uiState$1.Z$1 = z2;
        return graduationViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchGraduationState hatchGraduationState = (HatchGraduationState) this.L$0;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return GraduationViewModelKt.toUiState(hatchGraduationState, z, z2);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(HatchGraduationState hatchGraduationState, Boolean bool, Boolean bool2, HtJ<? super GraduationUiState> htJ) {
        return invoke(hatchGraduationState, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
    }
}
