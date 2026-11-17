package com.facebook.aura.vds.compose.input;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$4$2$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ String $stateDescription;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        String str = this.$contentDescription;
        if (str != null) {
            AbstractC1564Ale.A08(interfaceC0857A6e, str);
        }
        String str2 = this.$stateDescription;
        if (str2 != null) {
            AbstractC1564Ale.A09(interfaceC0857A6e, str2);
            AbstractC1564Ale.A04(interfaceC0857A6e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCodeInputKt$AuraCodeInput$4$2$1(String str, String str2) {
        super(1);
        this.$contentDescription = str;
        this.$stateDescription = str2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
