package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchWidgetWebViewKt$HatchWidgetWebView$updateContentHeight$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ WidgetHeightState $heightState;
    public final /* synthetic */ G0U<Integer, Unit> $onHeightMeasured;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchWidgetWebViewKt$HatchWidgetWebView$updateContentHeight$1$1(WidgetHeightState widgetHeightState, G0U<? super Integer, Unit> g0u) {
        super(1);
        this.$heightState = widgetHeightState;
        this.$onHeightMeasured = g0u;
    }

    public final void invoke(int i) {
        G0U<Integer, Unit> g0u;
        if (!this.$heightState.update(i) || (g0u = this.$onHeightMeasured) == null) {
            return;
        }
        g0u.invoke(Integer.valueOf(i));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
