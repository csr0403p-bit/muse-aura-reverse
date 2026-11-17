package com.facebook.aura.confidentialvm.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmPinEntryContentKt$ConfidentialVmHeader$1$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $announceTitleLive;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmPinEntryContentKt$ConfidentialVmHeader$1$1$1(boolean z) {
        super(1);
        this.$announceTitleLive = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass006.A19(interfaceC0857A6e);
        if (this.$announceTitleLive) {
            AbstractC1564Ale.A04(interfaceC0857A6e);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
