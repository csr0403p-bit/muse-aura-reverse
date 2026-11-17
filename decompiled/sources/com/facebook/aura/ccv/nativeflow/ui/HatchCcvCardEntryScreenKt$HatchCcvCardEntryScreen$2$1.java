package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.header.view.HeaderButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$2$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ Function0<Unit> $onSettingsClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$HatchCcvCardEntryScreen$2$1(Function0<Unit> function0) {
        super(1);
        this.$onSettingsClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        this.$onSettingsClick.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        this.$onSettingsClick.invoke();
    }
}
