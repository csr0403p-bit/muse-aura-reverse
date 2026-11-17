package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.model.NavigationUiControl;
import com.facebook.aura.model.NavigationWidgetData;
import com.facebook.aura.uicontrol.UiAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchNavigationWidgetKt$NavigationWidgetButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ UiAction $action;
    public final /* synthetic */ NavigationWidgetData $data;
    public final /* synthetic */ G0U<NavigationUiControl, Unit> $onPerformUiControl;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchNavigationWidgetKt$NavigationWidgetButton$1$1(UiAction uiAction, HatchScreen hatchScreen, Map<String, String> map, NavigationWidgetData navigationWidgetData, G0U<? super NavigationUiControl, Unit> g0u) {
        super(0);
        this.$action = uiAction;
        this.$screen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$data = navigationWidgetData;
        this.$onPerformUiControl = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchNavigationWidgetKt.logNavigationWidgetClick(this.$action, this.$screen, this.$threadLogMetadata);
        NavigationUiControl navigationUiControl = this.$data.uiControl;
        if (navigationUiControl != null) {
            this.$onPerformUiControl.invoke(navigationUiControl);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
