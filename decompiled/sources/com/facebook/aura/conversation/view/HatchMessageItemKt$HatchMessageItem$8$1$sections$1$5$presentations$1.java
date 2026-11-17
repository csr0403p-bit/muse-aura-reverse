package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C3TH;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.HatchWidgetPresentation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5$presentations$1 extends AbstractC7559F3s implements G2j<BRg, G0U<? super BLU, ? extends Unit>, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $allowLivePresentationEntry;
    public final /* synthetic */ C3TH $cardAlignment;
    public final /* synthetic */ HatchConversationTheme $conversationTheme;
    public final /* synthetic */ boolean $hasStandaloneWidgets;
    public final /* synthetic */ InlineContentCallbacks $inlineCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ Function0<Unit> $onFocusComposer;
    public final /* synthetic */ G0U<String, Integer> $onGetWidgetHeight;
    public final /* synthetic */ G0V<String, Integer, Unit> $onSetWidgetHeight;
    public final /* synthetic */ G0U<HatchSendMessage, Unit> $onWidgetSendMessage;
    public final /* synthetic */ G0W<String, String, String, Unit> $onWidgetSetState;
    public final /* synthetic */ boolean $shouldRenderBubble;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ List<HatchWidgetPresentation> $standalonePresentations;

    public final void invoke(BRg bRg, G0U<? super BLU, Unit> g0u, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        boolean z = this.$shouldRenderBubble || this.$hasStandaloneWidgets;
        HatchConversationPresentationsKt.m563WidgetPresentationssx27Oc(this.$message, this.$standalonePresentations, z, this.$sideChatSessionId, this.$onWidgetSendMessage, this.$onWidgetSetState, this.$onFocusComposer, this.$onGetWidgetHeight, this.$onSetWidgetHeight, HatchMessageBubbleKt.bubbleBackground(this.$message.role, this.$conversationTheme, bfm, HatchConversationTheme.$stable << 3), this.$inlineCallbacks, this.$allowLivePresentationEntry, bRg, this.$cardAlignment, g0u, bfm, HatchMessageUiModel.$stable, AnonymousClass001.A0B(iA0d << 9, InlineContentCallbacks.$stable | ((iA0d << 6) & 896)), 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$5$presentations$1(boolean z, boolean z2, HatchMessageUiModel hatchMessageUiModel, HatchConversationTheme hatchConversationTheme, List<HatchWidgetPresentation> list, String str, G0U<? super HatchSendMessage, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, Function0<Unit> function0, G0U<? super String, Integer> g0u2, G0V<? super String, ? super Integer, Unit> g0v, InlineContentCallbacks inlineContentCallbacks, boolean z3, C3TH c3th) {
        super(4);
        this.$shouldRenderBubble = z;
        this.$hasStandaloneWidgets = z2;
        this.$message = hatchMessageUiModel;
        this.$conversationTheme = hatchConversationTheme;
        this.$standalonePresentations = list;
        this.$sideChatSessionId = str;
        this.$onWidgetSendMessage = g0u;
        this.$onWidgetSetState = g0w;
        this.$onFocusComposer = function0;
        this.$onGetWidgetHeight = g0u2;
        this.$onSetWidgetHeight = g0v;
        this.$inlineCallbacks = inlineContentCallbacks;
        this.$allowLivePresentationEntry = z3;
        this.$cardAlignment = c3th;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, G0U<? super BLU, ? extends Unit> g0u, BFM bfm, Integer num) {
        invoke(bRg, (G0U<? super BLU, Unit>) g0u, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
