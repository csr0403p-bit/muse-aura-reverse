package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C0981AMm;
import X.C1736ApY;
import X.C1822Arm;
import X.C1BO;
import X.C1Cd;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.G2l;
import com.facebook.aura.conversation.view.richcontent.ContentRenderer;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3 extends AbstractC7559F3s implements G0W<Integer, BFM, Integer, Unit> {
    public final /* synthetic */ String $attachmentSender;
    public final /* synthetic */ AHD<HatchContentViewModelData> $contentViewModelData;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnContentCompleted$delegate;
    public final /* synthetic */ boolean $disableVisibilityAnimation;
    public final /* synthetic */ boolean $fillTableScreenWidth;
    public final /* synthetic */ B6A $inlineCodeBackground;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ B6A $linkColor;
    public final /* synthetic */ C1736ApY $linkFontWeight;
    public final /* synthetic */ AuraMarkdownTheme $markdownTheme;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ G2k<String, String, BRg, BFM, Integer, Unit> $onInlineAudioContent;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
    public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
    public final /* synthetic */ G0V<String, Boolean, Unit> $onUrlClick;
    public final /* synthetic */ boolean $reflowSoftLineBreaks;
    public final /* synthetic */ C0981AMm<Integer, Boolean> $renderingCompletedIndices;
    public final /* synthetic */ boolean $selectionEnabled;
    public final /* synthetic */ BRg $selectionModifier;
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ boolean $shouldAnimateText;
    public final /* synthetic */ String $streamingRevealKey;
    public final /* synthetic */ C1822Arm $textStyle;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$HatchRichResponseContent$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ String $attachmentSender;
        public final /* synthetic */ HatchContentViewModelData $contentViewModel;
        public final /* synthetic */ boolean $fillTableScreenWidth;
        public final /* synthetic */ B6A $inlineCodeBackground;
        public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
        public final /* synthetic */ boolean $isStreaming;
        public final /* synthetic */ B6A $linkColor;
        public final /* synthetic */ C1736ApY $linkFontWeight;
        public final /* synthetic */ AuraMarkdownTheme $markdownTheme;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ G2k<String, String, BRg, BFM, Integer, Unit> $onInlineAudioContent;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
        public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
        public final /* synthetic */ Function0<Unit> $onItemCompleted;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0V<String, Boolean, Unit> $onUrlClick;
        public final /* synthetic */ boolean $reflowSoftLineBreaks;
        public final /* synthetic */ boolean $selectionEnabled;
        public final /* synthetic */ BRg $selectionModifier;
        public final /* synthetic */ String $sharedElementKeyPrefix;
        public final /* synthetic */ boolean $shouldAnimateText;
        public final /* synthetic */ String $streamingRevealKey;
        public final /* synthetic */ C1822Arm $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchContentViewModelData hatchContentViewModelData, boolean z, Function0<Unit> function0, boolean z2, BRg bRg, G0U<? super HatchContentViewModelData, Unit> g0u, G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, Unit> g0u2, String str, String str2, boolean z3, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, G0V<? super String, ? super Boolean, Unit> g0v6, C1822Arm c1822Arm, String str3, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z4, AuraMarkdownTheme auraMarkdownTheme, boolean z5, G0U<? super String, Unit> g0u3, String str4) {
            super(3);
            this.$contentViewModel = hatchContentViewModelData;
            this.$shouldAnimateText = z;
            this.$onItemCompleted = function0;
            this.$selectionEnabled = z2;
            this.$selectionModifier = bRg;
            this.$onRichFormatOpenCTAClick = g0u;
            this.$onInlineImageClick = g0v;
            this.$onInlineImageGridClick = g0v2;
            this.$onInlineFileClick = g0v3;
            this.$onInlineSlidesClick = g0v4;
            this.$onInlineVideoClick = g0v5;
            this.$onInlineAudioContent = g2k;
            this.$onImageError = g0u2;
            this.$sharedElementKeyPrefix = str;
            this.$messageId = str2;
            this.$isStreaming = z3;
            this.$inlineFilePreview = g2l;
            this.$onUrlClick = g0v6;
            this.$textStyle = c1822Arm;
            this.$streamingRevealKey = str3;
            this.$linkColor = b6a;
            this.$linkFontWeight = c1736ApY;
            this.$inlineCodeBackground = b6a2;
            this.$reflowSoftLineBreaks = z4;
            this.$markdownTheme = auraMarkdownTheme;
            this.$fillTableScreenWidth = z5;
            this.$onArtifactVisible = g0u3;
            this.$attachmentSender = str4;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            G0V<BFM, Integer, Unit> g0v;
            ContentRenderer immediate;
            Object hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11;
            int i2;
            BBI bbiA0M;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
                HatchContentViewModelData hatchContentViewModelData = this.$contentViewModel;
                if (hatchContentViewModelData instanceof HatchContentViewModelData.Markdown) {
                    bfm.AgE(199383567);
                    B1U b1uA00 = B1V.A00(bfm, new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1(this.$selectionEnabled, this.$selectionModifier, this.$onRichFormatOpenCTAClick, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onInlineAudioContent, this.$onImageError, this.$sharedElementKeyPrefix, this.$messageId, this.$isStreaming, this.$inlineFilePreview, this.$onUrlClick, this.$contentViewModel, this.$textStyle, this.$streamingRevealKey, this.$linkColor, this.$linkFontWeight, this.$inlineCodeBackground, this.$reflowSoftLineBreaks, this.$shouldAnimateText), -1264498076);
                    if (this.$shouldAnimateText) {
                        bbiA0M = AnonymousClass002.A0M(bfm, 202292235);
                        immediate = new ContentRenderer.Callback(b1uA00);
                    } else {
                        bfm.AgE(202372804);
                        immediate = new ContentRenderer.Immediate(B1V.A00(bfm, new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$1(b1uA00), 182781427));
                        bbiA0M = (BBI) bfm;
                        BBI.A0R(bbiA0M, false);
                    }
                    BBI.A0R(bbiA0M, false);
                } else {
                    if (hatchContentViewModelData instanceof HatchContentViewModelData.Table) {
                        bfm.AgE(202537414);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$2(this.$contentViewModel, this.$markdownTheme, this.$fillTableScreenWidth, this.$onRichFormatOpenCTAClick);
                        i2 = 1584248974;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.Code) {
                        bfm.AgE(203230884);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$3(this.$contentViewModel, this.$onRichFormatOpenCTAClick);
                        i2 = -163933937;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.MermaidDiagram) {
                        bfm.AgE(203690149);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$4(this.$contentViewModel, this.$onRichFormatOpenCTAClick);
                        i2 = -1912116848;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.Math) {
                        bfm.AgE(204135402);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$5(this.$contentViewModel);
                        i2 = 634667537;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImage) {
                        bfm.AgE(204504798);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$6(this.$contentViewModel, this.$onInlineImageClick, this.$onImageError, this.$sharedElementKeyPrefix);
                        i2 = -1113515374;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImageGroup) {
                        bfm.AgE(205317215);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$7(this.$contentViewModel, this.$onInlineImageGridClick, this.$onImageError, this.$sharedElementKeyPrefix);
                        i2 = 1433269011;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineFile) {
                        bfm.AgE(206096524);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8(this.$contentViewModel, this.$onInlineVideoClick, this.$onImageError, this.$sharedElementKeyPrefix, this.$onInlineAudioContent, this.$onArtifactVisible, this.$attachmentSender, this.$onInlineFileClick, this.$inlineFilePreview);
                        i2 = -314913900;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineSlides) {
                        bfm.AgE(209822135);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$9(this.$onArtifactVisible, this.$contentViewModel, this.$inlineFilePreview, this.$attachmentSender, this.$onInlineSlidesClick);
                        i2 = -2063096811;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.InlineHtml) {
                        bfm.AgE(211781273);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10(this.$onArtifactVisible, this.$contentViewModel, this.$inlineFilePreview, this.$attachmentSender, this.$onInlineFileClick);
                        i2 = 483687574;
                    } else if (hatchContentViewModelData instanceof HatchContentViewModelData.EmbeddedFileHTMLContent) {
                        bfm.AgE(213675094);
                        hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11 = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11(this.$contentViewModel);
                        i2 = -1776164346;
                    } else {
                        if (hatchContentViewModelData instanceof HatchContentViewModelData.Divider) {
                            AnonymousClass003.A0l(bfm, 214130701);
                            g0v = ComposableSingletons$HatchRichResponseContentKt.lambda$770620039;
                        } else {
                            AnonymousClass003.A0l(bfm, 214226894);
                            g0v = ComposableSingletons$HatchRichResponseContentKt.lambda$1469252334;
                        }
                        immediate = new ContentRenderer.Immediate(g0v);
                    }
                    immediate = new ContentRenderer.Immediate(B1V.A00(bfm, hatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$11, i2));
                    AnonymousClass001.A1D(bfm);
                }
                immediate.Render(this.$onItemCompleted, bfm, ContentRenderer.$stable << 3);
                return;
            }
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BFM bfm, Integer num2) {
        invoke(AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3(AHD<? extends HatchContentViewModelData> ahd, boolean z, C0981AMm<Integer, Boolean> c0981AMm, C1BO<? extends Function0<Unit>> c1bo, boolean z2, boolean z3, BRg bRg, G0U<? super HatchContentViewModelData, Unit> g0u, G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, Unit> g0u2, String str, String str2, boolean z4, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, G0V<? super String, ? super Boolean, Unit> g0v6, C1822Arm c1822Arm, String str3, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z5, AuraMarkdownTheme auraMarkdownTheme, boolean z6, G0U<? super String, Unit> g0u3, String str4) {
        super(3);
        this.$contentViewModelData = ahd;
        this.$disableVisibilityAnimation = z;
        this.$renderingCompletedIndices = c0981AMm;
        this.$currentOnContentCompleted$delegate = c1bo;
        this.$shouldAnimateText = z2;
        this.$selectionEnabled = z3;
        this.$selectionModifier = bRg;
        this.$onRichFormatOpenCTAClick = g0u;
        this.$onInlineImageClick = g0v;
        this.$onInlineImageGridClick = g0v2;
        this.$onInlineFileClick = g0v3;
        this.$onInlineSlidesClick = g0v4;
        this.$onInlineVideoClick = g0v5;
        this.$onInlineAudioContent = g2k;
        this.$onImageError = g0u2;
        this.$sharedElementKeyPrefix = str;
        this.$messageId = str2;
        this.$isStreaming = z4;
        this.$inlineFilePreview = g2l;
        this.$onUrlClick = g0v6;
        this.$textStyle = c1822Arm;
        this.$streamingRevealKey = str3;
        this.$linkColor = b6a;
        this.$linkFontWeight = c1736ApY;
        this.$inlineCodeBackground = b6a2;
        this.$reflowSoftLineBreaks = z5;
        this.$markdownTheme = auraMarkdownTheme;
        this.$fillTableScreenWidth = z6;
        this.$onArtifactVisible = g0u3;
        this.$attachmentSender = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(int r50, X.BFM r51, int r52) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$HatchRichResponseContent$3.invoke(int, X.BFM, int):void");
    }
}
