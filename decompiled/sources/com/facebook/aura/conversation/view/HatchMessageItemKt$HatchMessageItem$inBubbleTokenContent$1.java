package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchSendMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$inBubbleTokenContent$1 extends AbstractC7559F3s implements G2j<AHD<? extends String>, Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ HatchConversationTheme $conversationTheme;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;

    public final void invoke(AHD<String> ahd, boolean z, BFM bfm, int i) {
        C7384Etj.A0Y(ahd, 0);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, ahd) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        HatchMessageUiModel hatchMessageUiModel = this.$message;
        G0U<HatchSendMessage, Unit> g0u = this.$onWidgetSendMessage;
        G0W<String, String, String, Unit> g0w = this.$onWidgetSetState;
        Function0<Unit> function0 = this.$onFocusComposer;
        G0U<String, Integer> g0u2 = this.$onGetWidgetHeight;
        G0V<String, Integer, Unit> g0v = this.$onSetWidgetHeight;
        long jBubbleBackground = HatchMessageBubbleKt.bubbleBackground(hatchMessageUiModel.role, this.$conversationTheme, bfm, HatchConversationTheme.$stable << 3);
        HatchMessageUiModel hatchMessageUiModel2 = this.$message;
        HatchConversationWidgetsKt.m579WidgetTokenWidgetsVRxQTpk(hatchMessageUiModel, ahd, z, g0u, g0w, function0, g0u2, g0v, jBubbleBackground, HatchMessageBubbleKt.m637bubbleShapeTDGSqEk(hatchMessageUiModel2.role, hatchMessageUiModel2.groupPosition, AnonymousClass002.A0d(bfm).bubbleCornerRadius, false, false), bfm, AnonymousClass002.A07(iA0d << 3, HatchMessageUiModel.$stable));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$inBubbleTokenContent$1(HatchMessageUiModel hatchMessageUiModel, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, HatchConversationTheme hatchConversationTheme) {
        super(4);
        this.$message = hatchMessageUiModel;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$conversationTheme = hatchConversationTheme;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(AHD<? extends String> ahd, Boolean bool, BFM bfm, Integer num) {
        invoke((AHD<String>) ahd, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
