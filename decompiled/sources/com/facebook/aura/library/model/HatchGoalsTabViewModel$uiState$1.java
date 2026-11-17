package com.facebook.aura.library.model;

import X.AHG;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.G2j;
import X.HtJ;
import X.HwV;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.model.HatchGoalsTabViewModel$uiState$1", f = "HatchGoalsTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGoalsTabViewModel$uiState$1 extends AbstractC07127nr implements G2j<Integer, Boolean, AHG<? extends String>, HtJ<? super HwV<? extends Integer, ? extends Boolean, ? extends AHG<? extends String>>>, Object> {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public HatchGoalsTabViewModel$uiState$1(HtJ<? super HatchGoalsTabViewModel$uiState$1> htJ) {
        super(4, htJ);
    }

    public final Object invoke(int i, boolean z, AHG<String> ahg, HtJ<? super HwV<Integer, Boolean, ? extends AHG<String>>> htJ) {
        HatchGoalsTabViewModel$uiState$1 hatchGoalsTabViewModel$uiState$1 = new HatchGoalsTabViewModel$uiState$1(htJ);
        hatchGoalsTabViewModel$uiState$1.I$0 = i;
        hatchGoalsTabViewModel$uiState$1.Z$0 = z;
        hatchGoalsTabViewModel$uiState$1.L$0 = ahg;
        return hatchGoalsTabViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        boolean z = this.Z$0;
        Object obj2 = this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return new HwV(C3cG.A0R(i), Boolean.valueOf(z), obj2);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Boolean bool, AHG<? extends String> ahg, HtJ<? super HwV<? extends Integer, ? extends Boolean, ? extends AHG<? extends String>>> htJ) {
        return invoke(AnonymousClass001.A0F(num), AnonymousClass001.A1X(bool), (AHG<String>) ahg, (HtJ<? super HwV<Integer, Boolean, ? extends AHG<String>>>) htJ);
    }
}
