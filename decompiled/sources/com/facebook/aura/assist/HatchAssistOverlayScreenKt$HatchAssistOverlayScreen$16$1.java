package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$16$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ MutableState<Boolean> $showEnableScreenshotDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$16$1(Context context, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$context = context;
        this.$onDismissRequest = function0;
        this.$showEnableScreenshotDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showEnableScreenshotDialog$delegate);
        HatchAssistOverlayScreenKt.openAssistSettings(this.$context);
        this.$onDismissRequest.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
