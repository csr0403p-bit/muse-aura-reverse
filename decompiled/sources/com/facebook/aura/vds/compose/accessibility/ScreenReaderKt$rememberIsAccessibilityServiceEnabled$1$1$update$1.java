package com.facebook.aura.vds.compose.accessibility;

import X.AbstractC7559F3s;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AccessibilityManager $accessibilityManager;
    public final /* synthetic */ MutableState<Boolean> $isEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1(AccessibilityManager accessibilityManager, MutableState<Boolean> mutableState) {
        super(0);
        this.$accessibilityManager = accessibilityManager;
        this.$isEnabled$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(ScreenReaderKt.hasEnabledService(this.$accessibilityManager), this.$isEnabled$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
