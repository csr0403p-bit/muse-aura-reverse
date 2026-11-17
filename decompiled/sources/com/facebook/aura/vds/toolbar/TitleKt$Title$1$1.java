package com.facebook.aura.vds.toolbar;

import X.AbstractC7559F3s;
import X.C1518AkS;
import X.G0U;
import X.InterfaceC1497Ak4;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class TitleKt$Title$1$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ C1518AkS $titleFocusRequester;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleKt$Title$1$1(C1518AkS c1518AkS) {
        super(1);
        this.$titleFocusRequester = c1518AkS;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C1518AkS.A00(this.$titleFocusRequester);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C1518AkS.A00(this.$titleFocusRequester);
    }
}
