package com.facebook.aura.composer.view;

import X.AYA;
import X.AbstractC1671Anw;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import X.InterfaceC2161Azr;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchComposerKt$ComposerRichContentInput$2$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ InterfaceC2161Azr $noAutofillValue;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        interfaceC0857A6e.Aca(AbstractC1671Anw.A02, AYA.A00);
        InterfaceC2161Azr interfaceC2161Azr = this.$noAutofillValue;
        if (interfaceC2161Azr != null) {
            interfaceC0857A6e.Aca(AbstractC1671Anw.A08, interfaceC2161Azr);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerRichContentInput$2$1(InterfaceC2161Azr interfaceC2161Azr) {
        super(1);
        this.$noAutofillValue = interfaceC2161Azr;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
