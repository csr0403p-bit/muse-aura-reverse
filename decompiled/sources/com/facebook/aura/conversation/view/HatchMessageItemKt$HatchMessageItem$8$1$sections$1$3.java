package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageItemKt$HatchMessageItem$8$1$sections$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<String> $agentName;
    public final /* synthetic */ HatchConversationTheme $conversationTheme;
    public final /* synthetic */ float $highlightGlowAlpha;
    public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
    public final /* synthetic */ InlineContentCallbacks $inlineCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageItemKt$HatchMessageItem$8$1$sections$1$3(HatchMessageUiModel hatchMessageUiModel, Function0<String> function0, HatchConversationTheme hatchConversationTheme, float f, InlineContentCallbacks inlineContentCallbacks, G0U<? super String, Unit> g0u, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0U<? super HatchMessageUiModel, Unit> g0u2) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$agentName = function0;
        this.$conversationTheme = hatchConversationTheme;
        this.$highlightGlowAlpha = f;
        this.$inlineCallbacks = inlineContentCallbacks;
        this.$onFirstTokenRendered = g0u;
        this.$inBubbleTokenContent = g2j;
        this.$onSelectionReply = g0u2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchMessageBubbleKt.HatchMessageBubble(this.$message, this.$agentName, null, this.$conversationTheme, this.$highlightGlowAlpha, this.$inlineCallbacks, this.$onFirstTokenRendered, this.$inBubbleTokenContent, this.$onSelectionReply, bfm, (InlineContentCallbacks.$stable << 15) | HatchMessageUiModel.$stable | (HatchConversationTheme.$stable << 9), 4);
            return;
        }
        bfm.Afo();
    }
}
