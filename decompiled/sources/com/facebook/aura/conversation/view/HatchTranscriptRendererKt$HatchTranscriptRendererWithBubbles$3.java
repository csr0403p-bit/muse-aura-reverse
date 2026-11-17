package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.C1DM;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0<Float> $alpha;
    public final /* synthetic */ long $bubbleBackground;
    public final /* synthetic */ long $chatBackground;
    public final /* synthetic */ float $highlightGlowAlpha;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ boolean $isAgent;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ G0U<String, Unit> $onFirstTokenRendered;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ AHD<String> $reactions;
    public final /* synthetic */ AHD<HatchRenderSegment> $renderSegments;
    public final /* synthetic */ String $sender;
    public final /* synthetic */ B6A $textColor;
    public final /* synthetic */ C1DM $textShape;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingContent;
    public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $widgetTokenContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTranscriptRendererKt$HatchTranscriptRendererWithBubbles$3(AHD<? extends HatchRenderSegment> ahd, HatchMessageUiModel hatchMessageUiModel, Function0<Float> function0, C1DM c1dm, InlineContentCallbacks inlineContentCallbacks, AHD<String> ahd2, boolean z, long j, long j2, B6A b6a, float f, G0V<? super BFM, ? super Integer, Unit> g0v, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, G0U<? super String, Unit> g0u, G0U<? super HatchMessageUiModel, Unit> g0u2, String str, int i, int i2, int i3) {
        super(2);
        this.$renderSegments = ahd;
        this.$message = hatchMessageUiModel;
        this.$alpha = function0;
        this.$textShape = c1dm;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$reactions = ahd2;
        this.$isAgent = z;
        this.$bubbleBackground = j;
        this.$chatBackground = j2;
        this.$textColor = b6a;
        this.$highlightGlowAlpha = f;
        this.$trailingContent = g0v;
        this.$widgetTokenContent = g2j;
        this.$onFirstTokenRendered = g0u;
        this.$onSelectionReply = g0u2;
        this.$sender = str;
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
        HatchTranscriptRendererKt.m670HatchTranscriptRendererWithBubblesOqtexg8(this.$renderSegments, this.$message, this.$alpha, this.$textShape, this.$inlineContentCallbacks, this.$reactions, this.$isAgent, this.$bubbleBackground, this.$chatBackground, this.$textColor, this.$highlightGlowAlpha, this.$trailingContent, this.$widgetTokenContent, this.$onFirstTokenRendered, this.$onSelectionReply, this.$sender, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
