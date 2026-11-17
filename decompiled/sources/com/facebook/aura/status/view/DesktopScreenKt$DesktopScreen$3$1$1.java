package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.status.viewmodel.DesktopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DesktopScreenKt$DesktopScreen$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ DesktopViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesktopScreenKt$DesktopScreen$3$1$1(DesktopViewModel desktopViewModel) {
        super(0);
        this.$viewModel = desktopViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DesktopScreenKt.logOpen(HatchComponent.OPEN_BROWSER_BUTTON);
        this.$viewModel.openNewBrowser();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
