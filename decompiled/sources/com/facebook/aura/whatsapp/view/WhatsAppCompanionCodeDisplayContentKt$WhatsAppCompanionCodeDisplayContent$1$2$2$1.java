package com.facebook.aura.whatsapp.view;

import X.AbstractC7559F3s;
import X.C0fG;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WhatsAppCompanionCodeDisplayContentKt$WhatsAppCompanionCodeDisplayContent$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0fG $clipboardManager;
    public final /* synthetic */ String $linkCode;
    public final /* synthetic */ Function0<Unit> $onCopyCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppCompanionCodeDisplayContentKt$WhatsAppCompanionCodeDisplayContent$1$2$2$1(Function0<Unit> function0, C0fG c0fG, String str) {
        super(0);
        this.$onCopyCode = function0;
        this.$clipboardManager = c0fG;
        this.$linkCode = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCopyCode.invoke();
        C0fG.A00(this.$clipboardManager, this.$linkCode);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
