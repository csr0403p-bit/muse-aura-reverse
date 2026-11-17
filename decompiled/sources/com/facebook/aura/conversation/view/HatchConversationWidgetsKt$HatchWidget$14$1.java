package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$14$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ HatchWidget $widget;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
        if (g0w != null) {
            g0w.invoke(this.$hostMessageId, this.$widget.widgetId, HatchWidgetPresentationKt.imageOptionsSelectionStateJson(str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$14$1(G0W<? super String, ? super String, ? super String, Unit> g0w, String str, HatchWidget hatchWidget) {
        super(1);
        this.$onWidgetSetState = g0w;
        this.$hostMessageId = str;
        this.$widget = hatchWidget;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
