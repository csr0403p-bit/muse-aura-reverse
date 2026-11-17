package com.facebook.aura.settings.support;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchContactSupportScreenKt$HatchContactSupportScreen$4$2$1 extends C7438Evz implements G0U<String, Unit> {
    public HatchContactSupportScreenKt$HatchContactSupportScreen$4$2$1(Object obj) {
        super(1, obj, HatchContactSupportViewModel.class, "onNameChange", "onNameChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((HatchContactSupportViewModel) AnonymousClass006.A0o(str, this)).onNameChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
