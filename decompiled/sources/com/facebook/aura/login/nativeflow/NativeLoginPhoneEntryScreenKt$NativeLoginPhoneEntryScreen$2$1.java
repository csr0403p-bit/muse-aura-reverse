package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.header.view.HeaderButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$2$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ Function0<Unit> $onOpenSettings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$2$1(Function0<Unit> function0) {
        super(1);
        this.$onOpenSettings = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        this.$onOpenSettings.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        this.$onOpenSettings.invoke();
    }
}
