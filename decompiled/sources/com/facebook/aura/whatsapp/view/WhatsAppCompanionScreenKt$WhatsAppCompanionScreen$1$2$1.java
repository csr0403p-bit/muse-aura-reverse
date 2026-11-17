package com.facebook.aura.whatsapp.view;

import X.C7438Evz;
import com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$2$1 extends C7438Evz implements Function0<Unit> {
    public WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$2$1(Object obj) {
        super(0, obj, WhatsAppCompanionViewModel.class, "onCountryPickerOpened", "onCountryPickerOpened()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((WhatsAppCompanionViewModel) this.receiver).onCountryPickerOpened();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
