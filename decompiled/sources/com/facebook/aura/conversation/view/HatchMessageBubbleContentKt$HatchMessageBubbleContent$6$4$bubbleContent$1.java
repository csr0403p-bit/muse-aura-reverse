package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.BFM;
import X.C1D3;
import X.C1DG;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.compose.ui.Alignment;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$4$bubbleContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Float> $alpha;
    public final /* synthetic */ boolean $animateBubbleSize;
    public final /* synthetic */ String $bodyKey;
    public final /* synthetic */ long $bubbleBg;
    public final /* synthetic */ C1D3 $bubbleShapeForBody;
    public final /* synthetic */ HatchMessageUiModel $displayMessage;
    public final /* synthetic */ float $highlightGlowAlpha;
    public final /* synthetic */ C1DG $hugWidth;
    public final /* synthetic */ G2j<AHD<String>, Boolean, BFM, Integer, Unit> $inBubbleTokenContent;
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ boolean $inlineWidgetsWaitingForBody;
    public final /* synthetic */ boolean $isAttachmentOnly;
    public final /* synthetic */ boolean $isFileOnly;
    public final /* synthetic */ long $linkColor;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ Function0<Unit> $onBodyBeforeInlineWidgetsCompleted;
    public final /* synthetic */ Function0<Unit> $onChannelFooterToggle;
    public final /* synthetic */ G0U<HatchMessageUiModel, Unit> $onSelectionReply;
    public final /* synthetic */ boolean $reflowSoftLineBreaks;
    public final /* synthetic */ String $sender;
    public final /* synthetic */ boolean $shouldShowInlineWidgetContent;
    public final /* synthetic */ B6A $textColor;
    public final /* synthetic */ Alignment $textStartAlignment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$4$bubbleContent$1(HatchMessageUiModel hatchMessageUiModel, float f, Function0<Float> function0, Function0<Unit> function02, boolean z, long j, C1D3 c1d3, boolean z2, C1DG c1dg, Alignment alignment, HatchMessageUiModel hatchMessageUiModel2, InlineContentCallbacks inlineContentCallbacks, boolean z3, G0U<? super HatchMessageUiModel, Unit> g0u, String str, B6A b6a, long j2, String str2, Function0<Unit> function03, boolean z4, boolean z5, G2j<? super AHD<String>, ? super Boolean, ? super BFM, ? super Integer, Unit> g2j, boolean z6) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$highlightGlowAlpha = f;
        this.$alpha = function0;
        this.$onChannelFooterToggle = function02;
        this.$isAttachmentOnly = z;
        this.$bubbleBg = j;
        this.$bubbleShapeForBody = c1d3;
        this.$animateBubbleSize = z2;
        this.$hugWidth = c1dg;
        this.$textStartAlignment = alignment;
        this.$displayMessage = hatchMessageUiModel2;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$inlineWidgetsWaitingForBody = z3;
        this.$onSelectionReply = g0u;
        this.$sender = str;
        this.$textColor = b6a;
        this.$linkColor = j2;
        this.$bodyKey = str2;
        this.$onBodyBeforeInlineWidgetsCompleted = function03;
        this.$reflowSoftLineBreaks = z4;
        this.$shouldShowInlineWidgetContent = z5;
        this.$inBubbleTokenContent = g2j;
        this.$isFileOnly = z6;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r50, int r51) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$4$bubbleContent$1.invoke(X.BFM, int):void");
    }
}
