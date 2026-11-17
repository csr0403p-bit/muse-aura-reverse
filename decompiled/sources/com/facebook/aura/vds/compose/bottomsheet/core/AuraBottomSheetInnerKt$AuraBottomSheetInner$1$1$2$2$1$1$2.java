package com.facebook.aura.vds.compose.bottomsheet.core;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C10543Hqv;
import X.C1DG;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBottomSheetInnerKt$AuraBottomSheetInner$1$1$2$2$1$1$2 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C10543Hqv<MutableState<C1DG>> $footerHeightDp;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        C1DG.A06(this.$density.Agy(AnonymousClass002.A09(interfaceC1497Ak4.AKd())), this.$footerHeightDp.element);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBottomSheetInnerKt$AuraBottomSheetInner$1$1$2$2$1$1$2(C10543Hqv<MutableState<C1DG>> c10543Hqv, AXN axn) {
        super(1);
        this.$footerHeightDp = c10543Hqv;
        this.$density = axn;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
