package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ConfidentialVmSwitchIntroLegalTextKt$ConfidentialVmSwitchIntroLegalText$1$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmSwitchIntroLegalTextKt$ConfidentialVmSwitchIntroLegalText$1$1(Object obj) {
        super(0, obj, ConfidentialVmSwitchViewModel.class, "onIntroLegalLinkClick", "onIntroLegalLinkClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmSwitchViewModel) this.receiver).onIntroLegalLinkClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
