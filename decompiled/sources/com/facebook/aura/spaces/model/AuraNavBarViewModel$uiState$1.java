package com.facebook.aura.spaces.model;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.model.AuraNavBarViewModel$uiState$1", f = "AuraNavBarViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraNavBarViewModel$uiState$1 extends AbstractC07127nr implements G0W<Boolean, AHD<? extends String>, HtJ<? super NavBarUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public AuraNavBarViewModel$uiState$1(HtJ<? super AuraNavBarViewModel$uiState$1> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        Iterable iterable = (Iterable) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return new NavBarUiState(z, AGI.A09(iterable));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, AHD<? extends String> ahd, HtJ<? super NavBarUiState> htJ) {
        return invoke(AnonymousClass001.A1X(bool), (AHD<String>) ahd, htJ);
    }

    public final Object invoke(boolean z, AHD<String> ahd, HtJ<? super NavBarUiState> htJ) {
        AuraNavBarViewModel$uiState$1 auraNavBarViewModel$uiState$1 = new AuraNavBarViewModel$uiState$1(htJ);
        auraNavBarViewModel$uiState$1.Z$0 = z;
        auraNavBarViewModel$uiState$1.L$0 = ahd;
        return auraNavBarViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }
}
