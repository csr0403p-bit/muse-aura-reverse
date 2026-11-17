package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import androidx.glance.appwidget.GlanceAppWidget;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AgentWidgetReceiver$glanceAppWidget$2 extends AbstractC7559F3s implements Function0<GlanceAppWidget> {
    public final /* synthetic */ AgentWidgetReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentWidgetReceiver$glanceAppWidget$2(AgentWidgetReceiver agentWidgetReceiver) {
        super(0);
        this.this$0 = agentWidgetReceiver;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GlanceAppWidget invoke() {
        return this.this$0.getAgentWidget$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets().newGlanceWidget();
    }
}
