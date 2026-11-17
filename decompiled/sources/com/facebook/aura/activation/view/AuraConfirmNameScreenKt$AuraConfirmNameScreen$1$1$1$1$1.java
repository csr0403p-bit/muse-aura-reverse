package com.facebook.aura.activation.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.activation.model.AuraConfirmNameViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraConfirmNameScreenKt$AuraConfirmNameScreen$1$1$1$1$1 extends C7438Evz implements G0U<String, Unit> {
    public AuraConfirmNameScreenKt$AuraConfirmNameScreen$1$1$1$1$1(Object obj) {
        super(1, obj, AuraConfirmNameViewModel.class, "onFirstNameChange", "onFirstNameChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((AuraConfirmNameViewModel) AnonymousClass006.A0o(str, this)).onFirstNameChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
