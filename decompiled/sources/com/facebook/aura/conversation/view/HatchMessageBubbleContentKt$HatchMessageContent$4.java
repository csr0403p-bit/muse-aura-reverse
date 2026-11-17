package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageContent$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $attachmentSender;
    public final /* synthetic */ B6A $linkColor;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ Function0<Unit> $onBubbleTap;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ Function0<Unit> $onSelectionReply;
    public final /* synthetic */ G0V<String, String, Unit> $onSlidesClick;
    public final /* synthetic */ Function0<Unit> $onTextRevealCompleted;
    public final /* synthetic */ G0U<String, Unit> $onUrlClick;
    public final /* synthetic */ boolean $reflowSoftLineBreaks;
    public final /* synthetic */ boolean $selectionAllowed;
    public final /* synthetic */ String $sender;
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ boolean $shouldAnimateText;
    public final /* synthetic */ String $streamingRevealKey;
    public final /* synthetic */ B6A $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageContent$4(HatchMessageUiModel hatchMessageUiModel, BRg bRg, Function0<Unit> function0, G0V<? super String, ? super String, Unit> g0v, G0V<? super String, ? super String, Unit> g0v2, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0V<? super String, ? super String, Unit> g0v6, G0U<? super HatchContentViewModelData, Unit> g0u2, G0U<? super String, Unit> g0u3, String str, B6A b6a, B6A b6a2, boolean z, String str2, Function0<Unit> function02, Function0<Unit> function03, boolean z2, G0U<? super String, Unit> g0u4, boolean z3, String str3, String str4, int i, int i2, int i3, int i4) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$modifier = bRg;
        this.$onBubbleTap = function0;
        this.$onSlidesClick = g0v;
        this.$onInlineImageClick = g0v2;
        this.$onInlineImageGridClick = g0v3;
        this.$onImageError = g0u;
        this.$onInlineFileClick = g0v4;
        this.$onInlineSlidesClick = g0v5;
        this.$onInlineVideoClick = g0v6;
        this.$onRichFormatOpenCTAClick = g0u2;
        this.$onArtifactVisible = g0u3;
        this.$sharedElementKeyPrefix = str;
        this.$textColor = b6a;
        this.$linkColor = b6a2;
        this.$shouldAnimateText = z;
        this.$streamingRevealKey = str2;
        this.$onTextRevealCompleted = function02;
        this.$onSelectionReply = function03;
        this.$selectionAllowed = z2;
        this.$onUrlClick = g0u4;
        this.$reflowSoftLineBreaks = z3;
        this.$sender = str3;
        this.$attachmentSender = str4;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchMessageBubbleContentKt.m634HatchMessageContentZdSQAXI(this.$message, this.$modifier, this.$onBubbleTap, this.$onSlidesClick, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onImageError, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onRichFormatOpenCTAClick, this.$onArtifactVisible, this.$sharedElementKeyPrefix, this.$textColor, this.$linkColor, this.$shouldAnimateText, this.$streamingRevealKey, this.$onTextRevealCompleted, this.$onSelectionReply, this.$selectionAllowed, this.$onUrlClick, this.$reflowSoftLineBreaks, this.$sender, this.$attachmentSender, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
