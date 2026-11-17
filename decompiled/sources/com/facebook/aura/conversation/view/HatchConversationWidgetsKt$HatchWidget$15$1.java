package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.ImageOptionsWidgetData;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$15$1 extends AbstractC7559F3s implements G0V<String, List<? extends Integer>, Unit> {
    public final /* synthetic */ HatchWidgetData $data;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$15$1(G0W<? super String, ? super String, ? super String, Unit> g0w, String str, HatchWidget hatchWidget, G0U<? super HatchSendMessage, Unit> g0u, HatchWidgetData hatchWidgetData) {
        super(2);
        this.$onWidgetSetState = g0w;
        this.$hostMessageId = str;
        this.$widget = hatchWidget;
        this.$onWidgetSendMessage = g0u;
        this.$data = hatchWidgetData;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends Integer> list) {
        invoke2(str, (List<Integer>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, List<Integer> list) {
        AnonymousClass003.A0u(str, list);
        G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
        if (g0w != null) {
            g0w.invoke(this.$hostMessageId, this.$widget.widgetId, HatchWidgetPresentationKt.imageOptionsMultiSelectionStateJson(list));
        }
        G0U<HatchSendMessage, Unit> g0u = this.$onWidgetSendMessage;
        if (g0u != null) {
            g0u.invoke(HatchWidgetPresentationKt.imageOptionsReplyMessage(str, this.$hostMessageId, HatchConversationWidgetsKt.multiImageSelectionReplyTarget((ImageOptionsWidgetData) this.$data, list)));
        }
    }
}
