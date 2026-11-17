package com.facebook.aura.whatsapp.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$1$1 extends C7438Evz implements G0U<String, Unit> {
    public WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$1$1(Object obj) {
        super(1, obj, WhatsAppCompanionViewModel.class, "onPhoneSubmit", "onPhoneSubmit(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((WhatsAppCompanionViewModel) AnonymousClass006.A0o(str, this)).onPhoneSubmit(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
