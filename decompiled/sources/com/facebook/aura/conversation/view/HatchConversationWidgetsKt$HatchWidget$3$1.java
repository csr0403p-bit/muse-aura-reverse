package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0W;
import com.facebook.aura.model.HatchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$3$1(G0W<? super String, ? super String, ? super String, Unit> g0w, String str, HatchWidget hatchWidget) {
        super(0);
        this.$onWidgetSetState = g0w;
        this.$hostMessageId = str;
        this.$widget = hatchWidget;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
        if (g0w != null) {
            g0w.invoke(this.$hostMessageId, this.$widget.widgetId, HatchConversationWidgetsKt.letterOpenedStateJson());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
