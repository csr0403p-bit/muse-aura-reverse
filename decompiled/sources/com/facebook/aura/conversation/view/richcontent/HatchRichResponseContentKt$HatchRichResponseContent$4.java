package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1736ApY;
import X.C1822Arm;
import X.C3TQ;
import X.G0U;
import X.G0V;
import X.G2k;
import X.G2l;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$changed3;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $$default1;
    public final /* synthetic */ String $attachmentSender;
    public final /* synthetic */ C3TQ $bubbleInnerPadding;
    public final /* synthetic */ AHD<HatchContentViewModelData> $contentViewModelData;
    public final /* synthetic */ boolean $disableVisibilityAnimation;
    public final /* synthetic */ boolean $fillTableScreenWidth;
    public final /* synthetic */ B6A $inlineCodeBackground;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ B6A $linkColor;
    public final /* synthetic */ C1736ApY $linkFontWeight;
    public final /* synthetic */ int $maxLength;
    public final /* synthetic */ int $maxTextLines;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ G0U<String, Unit> $onCallPhoneNumberClick;
    public final /* synthetic */ Function0<Unit> $onContentCompleted;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G2k<String, String, BRg, BFM, Integer, Unit> $onInlineAudioContent;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
    public final /* synthetic */ G0U<String, Unit> $onMessagePhoneNumberClick;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ Function0<Unit> $onTextContentTap;
    public final /* synthetic */ G0V<String, Boolean, Unit> $onUrlClick;
    public final /* synthetic */ boolean $reflowSoftLineBreaks;
    public final /* synthetic */ boolean $selectionEnabled;
    public final /* synthetic */ BRg $selectionModifier;
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ boolean $shouldAnimateText;
    public final /* synthetic */ boolean $shouldFormatContent;
    public final /* synthetic */ boolean $shouldLinkifyPhoneNumbers;
    public final /* synthetic */ boolean $shouldLinkifyUrl;
    public final /* synthetic */ String $streamingRevealKey;
    public final /* synthetic */ String $tableSubcomposeKeyPrefix;
    public final /* synthetic */ C1822Arm $textStyle;

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$4(AHD<? extends HatchContentViewModelData> ahd, G0V<? super String, ? super Boolean, Unit> g0v, BRg bRg, Function0<Unit> function0, BRg bRg2, boolean z, boolean z2, C1822Arm c1822Arm, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z3, String str, String str2, Function0<Unit> function02, int i, int i2, boolean z4, boolean z5, boolean z6, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, boolean z7, boolean z8, String str3, G0V<? super String, ? super String, Unit> g0v2, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v3, G0U<? super String, Unit> g0u3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G0V<? super String, ? super String, Unit> g0v6, G0U<? super HatchContentViewModelData, Unit> g0u4, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, Unit> g0u5, String str4, String str5, boolean z9, C3TQ c3tq, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(2);
        this.$contentViewModelData = ahd;
        this.$onUrlClick = g0v;
        this.$modifier = bRg;
        this.$onTextContentTap = function0;
        this.$selectionModifier = bRg2;
        this.$selectionEnabled = z;
        this.$shouldAnimateText = z2;
        this.$textStyle = c1822Arm;
        this.$linkColor = b6a;
        this.$linkFontWeight = c1736ApY;
        this.$inlineCodeBackground = b6a2;
        this.$reflowSoftLineBreaks = z3;
        this.$messageId = str;
        this.$streamingRevealKey = str2;
        this.$onContentCompleted = function02;
        this.$maxTextLines = i;
        this.$maxLength = i2;
        this.$shouldFormatContent = z4;
        this.$shouldLinkifyUrl = z5;
        this.$shouldLinkifyPhoneNumbers = z6;
        this.$onCallPhoneNumberClick = g0u;
        this.$onMessagePhoneNumberClick = g0u2;
        this.$disableVisibilityAnimation = z7;
        this.$fillTableScreenWidth = z8;
        this.$tableSubcomposeKeyPrefix = str3;
        this.$onInlineImageClick = g0v2;
        this.$onInlineImageGridClick = g0v3;
        this.$onImageError = g0u3;
        this.$onInlineFileClick = g0v4;
        this.$onInlineSlidesClick = g0v5;
        this.$onInlineVideoClick = g0v6;
        this.$onRichFormatOpenCTAClick = g0u4;
        this.$onInlineAudioContent = g2k;
        this.$onArtifactVisible = g0u5;
        this.$sharedElementKeyPrefix = str4;
        this.$attachmentSender = str5;
        this.$isStreaming = z9;
        this.$bubbleInnerPadding = c3tq;
        this.$inlineFilePreview = g2l;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$changed3 = i6;
        this.$$default = i7;
        this.$$default1 = i8;
    }

    public final void invoke(BFM bfm, int i) {
        HatchRichResponseContentKt.m685HatchRichResponseContentXdLsqko(this.$contentViewModelData, this.$onUrlClick, this.$modifier, this.$onTextContentTap, this.$selectionModifier, this.$selectionEnabled, this.$shouldAnimateText, this.$textStyle, this.$linkColor, this.$linkFontWeight, this.$inlineCodeBackground, this.$reflowSoftLineBreaks, this.$messageId, this.$streamingRevealKey, this.$onContentCompleted, this.$maxTextLines, this.$maxLength, this.$shouldFormatContent, this.$shouldLinkifyUrl, this.$shouldLinkifyPhoneNumbers, this.$onCallPhoneNumberClick, this.$onMessagePhoneNumberClick, this.$disableVisibilityAnimation, this.$fillTableScreenWidth, this.$tableSubcomposeKeyPrefix, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onImageError, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onRichFormatOpenCTAClick, this.$onInlineAudioContent, this.$onArtifactVisible, this.$sharedElementKeyPrefix, this.$attachmentSender, this.$isStreaming, this.$bubbleInnerPadding, this.$inlineFilePreview, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), AnonymousClass011.A01(this.$$changed3), this.$$default, this.$$default1);
    }
}
