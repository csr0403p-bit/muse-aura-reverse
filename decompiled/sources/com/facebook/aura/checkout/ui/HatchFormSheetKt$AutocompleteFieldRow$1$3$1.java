package com.facebook.aura.checkout.ui;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$AutocompleteFieldRow$1$3$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $announcement;
    public final /* synthetic */ boolean $expanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$AutocompleteFieldRow$1$3$1(boolean z, String str) {
        super(1);
        this.$expanded = z;
        this.$announcement = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        if (this.$expanded) {
            AbstractC1564Ale.A08(interfaceC0857A6e, this.$announcement);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
