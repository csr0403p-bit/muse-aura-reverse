package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C3TH;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidgetPresentation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$WidgetPresentations$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $allowLiveEntry;
    public final /* synthetic */ long $containerBackgroundColor;
    public final /* synthetic */ boolean $hasBlockAbove;
    public final /* synthetic */ C3TH $horizontalAlignment;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<BLU, Unit> $onCardBoundsInWindowChanged;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ List<HatchWidgetPresentation> $presentations;
    public final /* synthetic */ String $sideChatSessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationPresentationsKt$WidgetPresentations$6(HatchMessageUiModel hatchMessageUiModel, List<HatchWidgetPresentation> list, boolean z, String str, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, long j, InlineContentCallbacks inlineContentCallbacks, boolean z2, BRg bRg, C3TH c3th, G0U<? super BLU, Unit> g0u3, int i, int i2, int i3) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$presentations = list;
        this.$hasBlockAbove = z;
        this.$sideChatSessionId = str;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$containerBackgroundColor = j;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$allowLiveEntry = z2;
        this.$modifier = bRg;
        this.$horizontalAlignment = c3th;
        this.$onCardBoundsInWindowChanged = g0u3;
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
        HatchConversationPresentationsKt.m563WidgetPresentationssx27Oc(this.$message, this.$presentations, this.$hasBlockAbove, this.$sideChatSessionId, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, this.$containerBackgroundColor, this.$inlineContentCallbacks, this.$allowLiveEntry, this.$modifier, this.$horizontalAlignment, this.$onCardBoundsInWindowChanged, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
