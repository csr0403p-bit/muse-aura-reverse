package com.facebook.aura.vds.compose.button;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraElevatedButtonKt$AuraElevatedIconSurface$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraElevatedButtonKt$AuraElevatedIconSurface$1$1(boolean z) {
        super(1);
        this.$enabled = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass003.A0r(interfaceC0857A6e);
        if (this.$enabled) {
            return;
        }
        AbstractC1564Ale.A02(interfaceC0857A6e);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
