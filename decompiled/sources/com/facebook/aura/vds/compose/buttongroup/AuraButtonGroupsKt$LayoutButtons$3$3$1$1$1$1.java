package com.facebook.aura.vds.compose.buttongroup;

import X.AbstractC1564Ale;
import X.AbstractC1671Anw;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraButtonGroupsKt$LayoutButtons$3$3$1$1$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ ButtonContent $buttonContent;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, String.valueOf(this.$buttonContent.contentDescription));
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        String str = this.$buttonContent.id;
        if (str == null) {
            str = "";
        }
        interfaceC0857A6e.Aca(AbstractC1671Anw.A0a, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraButtonGroupsKt$LayoutButtons$3$3$1$1$1$1(ButtonContent buttonContent) {
        super(1);
        this.$buttonContent = buttonContent;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
