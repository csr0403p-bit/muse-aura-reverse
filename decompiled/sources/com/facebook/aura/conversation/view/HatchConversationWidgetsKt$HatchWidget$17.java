package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationWidgetsKt$HatchWidget$17 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerBackgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ String $imageVersion;
    public final /* synthetic */ boolean $inBubble;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ boolean $messageIsStreaming;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ String $presentationMessageId;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ HatchWidget $widget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationWidgetsKt$HatchWidget$17(HatchWidget hatchWidget, BRg bRg, String str, String str2, String str3, String str4, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, long j, C1D3 c1d3, boolean z, boolean z2, InlineContentCallbacks inlineContentCallbacks, int i, int i2, int i3) {
        super(2);
        this.$widget = hatchWidget;
        this.$modifier = bRg;
        this.$hostMessageId = str;
        this.$imageVersion = str2;
        this.$presentationMessageId = str3;
        this.$sideChatSessionId = str4;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$containerBackgroundColor = j;
        this.$containerShape = c1d3;
        this.$messageIsStreaming = z;
        this.$inBubble = z2;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchConversationWidgetsKt.m575HatchWidgetNjCylvU(this.$widget, this.$modifier, this.$hostMessageId, this.$imageVersion, this.$presentationMessageId, this.$sideChatSessionId, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$containerBackgroundColor, this.$containerShape, this.$messageIsStreaming, this.$inBubble, this.$inlineContentCallbacks, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
