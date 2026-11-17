package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchConversationTheme $conversationTheme;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ AHD<HatchWidget> $standaloneWidgets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$2(HatchMessageUiModel hatchMessageUiModel, AHD<HatchWidget> ahd, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, HatchConversationTheme hatchConversationTheme) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$standaloneWidgets = ahd;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$conversationTheme = hatchConversationTheme;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchMessageUiModel hatchMessageUiModel = this.$message;
            AHD<HatchWidget> ahd = this.$standaloneWidgets;
            G0U<HatchSendMessage, Unit> g0u = this.$onWidgetSendMessage;
            G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
            Function0<Unit> function0 = this.$onFocusComposer;
            G0U<String, Integer> g0u2 = this.$onGetWidgetHeight;
            G0V<String, Integer, Unit> g0v = this.$onSetWidgetHeight;
            long jBubbleBackground = HatchMessageBubbleKt.bubbleBackground(hatchMessageUiModel.role, this.$conversationTheme, bfm, HatchConversationTheme.$stable << 3);
            HatchMessageUiModel hatchMessageUiModel2 = this.$message;
            HatchConversationWidgetsKt.m576InlineWidgetsIc2awPA(hatchMessageUiModel, ahd, g0u, g0w, function0, g0u2, g0v, jBubbleBackground, HatchMessageBubbleKt.m637bubbleShapeTDGSqEk(hatchMessageUiModel2.role, hatchMessageUiModel2.groupPosition, AnonymousClass002.A0d(bfm).bubbleCornerRadius, false, false), false, bfm, (HatchWidget.$stable << 3) | HatchMessageUiModel.$stable, 512);
            return;
        }
        bfm.Afo();
    }
}
