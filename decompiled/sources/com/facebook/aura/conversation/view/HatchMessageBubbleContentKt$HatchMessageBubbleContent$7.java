package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C3TH;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageBubbleContent$7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0<String> $agentName;
    public final /* synthetic */ Function0<Float> $alpha;
    public final /* synthetic */ HatchConversationTheme $conversationTheme;
    public final /* synthetic */ float $highlightGlowAlpha;
    public final /* synthetic */ C3TH $horizontalAlignment;
    public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<BLU, Unit> $onBubbleBoundsInWindowChanged;
    public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ B6A $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageBubbleContent$7(HatchMessageUiModel hatchMessageUiModel, Function0<Float> function0, C3TH c3th, Function0<String> function02, BRg bRg, HatchConversationTheme hatchConversationTheme, B6A b6a, float f, InlineContentCallbacks inlineContentCallbacks, G0U<? super String, Unit> g0u, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0U<? super HatchMessageUiModel, Unit> g0u2, G0U<? super BLU, Unit> g0u3, int i, int i2, int i3) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$alpha = function0;
        this.$horizontalAlignment = c3th;
        this.$agentName = function02;
        this.$modifier = bRg;
        this.$conversationTheme = hatchConversationTheme;
        this.$textColor = b6a;
        this.$highlightGlowAlpha = f;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$onFirstTokenRendered = g0u;
        this.$inBubbleTokenContent = g2j;
        this.$onSelectionReply = g0u2;
        this.$onBubbleBoundsInWindowChanged = g0u3;
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
        HatchMessageBubbleContentKt.m633HatchMessageBubbleContentz756j2U(this.$message, this.$alpha, this.$horizontalAlignment, this.$agentName, this.$modifier, this.$conversationTheme, this.$textColor, this.$highlightGlowAlpha, this.$inlineContentCallbacks, this.$onFirstTokenRendered, this.$inBubbleTokenContent, this.$onSelectionReply, this.$onBubbleBoundsInWindowChanged, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
