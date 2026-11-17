package com.facebook.aura.settings;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchWalletScreenKt$walletPageStatus$1$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $loadingLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletScreenKt$walletPageStatus$1$1$1(String str) {
        super(1);
        this.$loadingLabel = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$loadingLabel);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
