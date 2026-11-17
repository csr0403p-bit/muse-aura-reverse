package com.facebook.aura.checkout.ui;

import X.AY5;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC2161Azr;
import android.view.autofill.AutofillValue;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$FormSelectionButton$3$1$3$2 extends AbstractC7559F3s implements G0U<InterfaceC2161Azr, Boolean> {
    public final /* synthetic */ G0U<CharSequence, Boolean> $onAutofill;

    @Override // X.G0U
    public final Boolean invoke(InterfaceC2161Azr interfaceC2161Azr) {
        CharSequence textValue;
        C7384Etj.A0Y(interfaceC2161Azr, 0);
        AutofillValue autofillValue = ((AY5) interfaceC2161Azr).A00;
        return Boolean.valueOf((!autofillValue.isText() || (textValue = autofillValue.getTextValue()) == null) ? false : AnonymousClass003.A1X(textValue, this.$onAutofill));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFormSheetKt$FormSelectionButton$3$1$3$2(G0U<? super CharSequence, Boolean> g0u) {
        super(1);
        this.$onAutofill = g0u;
    }
}
