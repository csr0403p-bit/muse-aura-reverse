package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.InterfaceC08439ui;
import com.facebook.aura.widgets.SpaceWidgetPickerViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceWidgetConfigureActivity$viewModel$2 extends AbstractC7559F3s implements Function0<InterfaceC08439ui> {
    public final /* synthetic */ SpaceWidgetConfigureActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceWidgetConfigureActivity$viewModel$2(SpaceWidgetConfigureActivity spaceWidgetConfigureActivity) {
        super(0);
        this.this$0 = spaceWidgetConfigureActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC08439ui invoke() {
        return new SpaceWidgetPickerViewModel.Factory(AnonymousClass001.A0I(this.this$0));
    }
}
