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
public final class HatchNavigationWidgetKt$HatchNavigationRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ UiAction $action;
    public final /* synthetic */ NavigationWidgetData $data;
    public final /* synthetic */ G0U<NavigationUiControl, Unit> $onPerformUiControl;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchNavigationWidgetKt$HatchNavigationRow$1$1(NavigationWidgetData navigationWidgetData, UiAction uiAction, HatchScreen hatchScreen, Map<String, String> map, G0U<? super NavigationUiControl, Unit> g0u) {
        super(0);
        this.$data = navigationWidgetData;
        this.$action = uiAction;
        this.$screen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$onPerformUiControl = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NavigationUiControl navigationUiControl = this.$data.uiControl;
        if (navigationUiControl != null) {
            UiAction uiAction = this.$action;
            HatchScreen hatchScreen = this.$screen;
            Map<String, String> map = this.$threadLogMetadata;
            G0U<NavigationUiControl, Unit> g0u = this.$onPerformUiControl;
            HatchNavigationWidgetKt.logNavigationWidgetClick(uiAction, hatchScreen, map);
            g0u.invoke(navigationUiControl);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
