package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.status.viewmodel.DesktopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DesktopScreenKt$DesktopScreen$4$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BrowserTaskPresentation $task;
    public final /* synthetic */ DesktopViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesktopScreenKt$DesktopScreen$4$1$2$1$1(DesktopViewModel desktopViewModel, BrowserTaskPresentation browserTaskPresentation) {
        super(0);
        this.$viewModel = desktopViewModel;
        this.$task = browserTaskPresentation;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DesktopScreenKt.logOpen(HatchComponent.BROWSER_TASK_ROW);
        this.$viewModel.openTask(this.$task);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
