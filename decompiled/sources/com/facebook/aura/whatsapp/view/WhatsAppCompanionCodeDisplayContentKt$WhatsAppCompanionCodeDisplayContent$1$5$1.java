package com.facebook.aura.whatsapp.view;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WhatsAppCompanionCodeDisplayContentKt$WhatsAppCompanionCodeDisplayContent$1$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onOpenWhatsApp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppCompanionCodeDisplayContentKt$WhatsAppCompanionCodeDisplayContent$1$5$1(Function0<Unit> function0, Context context) {
        super(0);
        this.$onOpenWhatsApp = function0;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpenWhatsApp.invoke();
        WhatsAppCompanionCodeDisplayContentKt.deeplinkToWhatsAppLinkedDevices(this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
