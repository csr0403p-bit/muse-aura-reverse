package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1736ApY;
import X.C1822Arm;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2k;
import X.G2l;
import com.facebook.aura.markdown.render.AuraMarkdownTextKt;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$markdown$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ B6A $inlineCodeBackground;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ B6A $linkColor;
    public final /* synthetic */ C1736ApY $linkFontWeight;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ Function0<Unit> $onCompleted;
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
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ boolean $shouldAnimateText;
    public final /* synthetic */ String $streamingRevealKey;
    public final /* synthetic */ C1822Arm $textStyle;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$markdown$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchContentViewModelData $contentViewModel;
        public final /* synthetic */ B6A $inlineCodeBackground;
        public final /* synthetic */ boolean $isStreaming;
        public final /* synthetic */ B6A $linkColor;
        public final /* synthetic */ C1736ApY $linkFontWeight;
        public final /* synthetic */ Function0<Unit> $onCompleted;
        public final /* synthetic */ boolean $reflowSoftLineBreaks;
        public final /* synthetic */ boolean $shouldAnimateText;
        public final /* synthetic */ String $streamingRevealKey;
        public final /* synthetic */ C1822Arm $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchContentViewModelData hatchContentViewModelData, C1822Arm c1822Arm, boolean z, String str, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z2, boolean z3, Function0<Unit> function0) {
            super(2);
            this.$contentViewModel = hatchContentViewModelData;
            this.$textStyle = c1822Arm;
            this.$isStreaming = z;
            this.$streamingRevealKey = str;
            this.$linkColor = b6a;
            this.$linkFontWeight = c1736ApY;
            this.$inlineCodeBackground = b6a2;
            this.$reflowSoftLineBreaks = z2;
            this.$shouldAnimateText = z3;
            this.$onCompleted = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                String str = ((HatchContentViewModelData.Markdown) this.$contentViewModel).markdown;
                if (str == null) {
                    str = "";
                }
                AuraMarkdownTextKt.m1368AuraMarkdownTextrAaX7yc(str, null, this.$textStyle, this.$isStreaming, this.$streamingRevealKey, null, this.$linkColor, this.$linkFontWeight, this.$inlineCodeBackground, this.$reflowSoftLineBreaks, this.$shouldAnimateText, this.$onCompleted, bfm, 0, 0, 34);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$markdown$1(G0U<? super HatchContentViewModelData, Unit> g0u, G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, Unit> g0u2, String str, String str2, boolean z, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, G0V<? super String, ? super Boolean, Unit> g0v6, HatchContentViewModelData hatchContentViewModelData, C1822Arm c1822Arm, String str3, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z2, boolean z3, Function0<Unit> function0) {
        super(2);
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
        this.$isStreaming = z;
        this.$inlineFilePreview = g2l;
        this.$onUrlClick = g0v6;
        this.$contentViewModel = hatchContentViewModelData;
        this.$textStyle = c1822Arm;
        this.$streamingRevealKey = str3;
        this.$linkColor = b6a;
        this.$linkFontWeight = c1736ApY;
        this.$inlineCodeBackground = b6a2;
        this.$reflowSoftLineBreaks = z2;
        this.$shouldAnimateText = z3;
        this.$onCompleted = function0;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
            G0V<String, String, Unit> g0v = this.$onInlineImageClick;
            G0V<AHD<HatchInlineImageData>, Integer, Unit> g0v2 = this.$onInlineImageGridClick;
            G0V<String, String, Unit> g0v3 = this.$onInlineFileClick;
            G0V<String, String, Unit> g0v4 = this.$onInlineSlidesClick;
            G0V<String, String, Unit> g0v5 = this.$onInlineVideoClick;
            G2k<String, String, BRg, BFM, Integer, Unit> g2k = this.$onInlineAudioContent;
            G0U<String, Unit> g0u2 = this.$onImageError;
            String str = this.$sharedElementKeyPrefix;
            String str2 = this.$messageId;
            boolean z = this.$isStreaming;
            G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> g2l = this.$inlineFilePreview;
            boolean zA65 = bfm.A65(this.$onUrlClick);
            G0V<String, Boolean, Unit> g0v6 = this.$onUrlClick;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$markdown$1$1$1(g0v6);
                bfm.Ai0(objAaT);
            }
            HatchAuraMarkdownProvidersKt.HatchAuraMarkdownProviders(g0u, g0v, g0v2, g0v3, g0v4, g0v5, g2k, g0u2, str, str2, z, g2l, (G0U) objAaT, B1V.A00(bfm, new AnonymousClass2(this.$contentViewModel, this.$textStyle, this.$isStreaming, this.$streamingRevealKey, this.$linkColor, this.$linkFontWeight, this.$inlineCodeBackground, this.$reflowSoftLineBreaks, this.$shouldAnimateText, this.$onCompleted), -1726991082), bfm, 0, 3072, 0);
            return;
        }
        bfm.Afo();
    }
}
