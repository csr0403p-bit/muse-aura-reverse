package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.AbstractC7611F5y;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes6.dex */
public final class FancyPinViewRegistry$updateActiveVariant$4 extends AbstractC7559F3s implements G0U<String, Boolean> {
    public final /* synthetic */ FancyPinPresentation $presentation;
    public final /* synthetic */ FancyPinViewRegistry this$0;

    @Override // X.G0U
    public final Boolean invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return Boolean.valueOf(AbstractC7611F5y.A1A(this.$presentation.blueprint, str, this.this$0.partRegistrations));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinViewRegistry$updateActiveVariant$4(FancyPinViewRegistry fancyPinViewRegistry, FancyPinPresentation fancyPinPresentation) {
        super(1);
        this.this$0 = fancyPinViewRegistry;
        this.$presentation = fancyPinPresentation;
    }
}
