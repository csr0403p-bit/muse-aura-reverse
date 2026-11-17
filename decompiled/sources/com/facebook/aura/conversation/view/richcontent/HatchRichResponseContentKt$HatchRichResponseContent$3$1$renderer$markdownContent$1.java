package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AKQ;
import X.AbstractC1913AtY;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.G2l;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1 extends AbstractC7559F3s implements G0W<Function0<? extends Unit>, BFM, Integer, Unit> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ B6A $inlineCodeBackground;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
    public final /* synthetic */ boolean $isStreaming;
    public final /* synthetic */ B6A $linkColor;
    public final /* synthetic */ C1736ApY $linkFontWeight;
    public final /* synthetic */ String $messageId;
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
    public final /* synthetic */ boolean $selectionEnabled;
    public final /* synthetic */ BRg $selectionModifier;
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ boolean $shouldAnimateText;
    public final /* synthetic */ String $streamingRevealKey;
    public final /* synthetic */ C1822Arm $textStyle;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $markdown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$markdown = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass006.A1Q(bfm, this.$markdown);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1(boolean z, BRg bRg, G0U<? super HatchContentViewModelData, Unit> g0u, G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, Unit> g0u2, String str, String str2, boolean z2, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, G0V<? super String, ? super Boolean, Unit> g0v6, HatchContentViewModelData hatchContentViewModelData, C1822Arm c1822Arm, String str3, B6A b6a, C1736ApY c1736ApY, B6A b6a2, boolean z3, boolean z4) {
        super(3);
        this.$selectionEnabled = z;
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
        this.$isStreaming = z2;
        this.$inlineFilePreview = g2l;
        this.$onUrlClick = g0v6;
        this.$contentViewModel = hatchContentViewModelData;
        this.$textStyle = c1822Arm;
        this.$streamingRevealKey = str3;
        this.$linkColor = b6a;
        this.$linkFontWeight = c1736ApY;
        this.$inlineCodeBackground = b6a2;
        this.$reflowSoftLineBreaks = z3;
        this.$shouldAnimateText = z4;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0, BFM bfm, Integer num) {
        invoke((Function0<Unit>) function0, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(Function0<Unit> function0, BFM bfm, int i) {
        int iA0T = i;
        C7384Etj.A0Y(function0, 0);
        if ((i & 6) == 0) {
            iA0T = i | AnonymousClass004.A0T(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            B1U b1uA00 = B1V.A00(bfm, new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$markdownContent$1$markdown$1(this.$onRichFormatOpenCTAClick, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onInlineAudioContent, this.$onImageError, this.$sharedElementKeyPrefix, this.$messageId, this.$isStreaming, this.$inlineFilePreview, this.$onUrlClick, this.$contentViewModel, this.$textStyle, this.$streamingRevealKey, this.$linkColor, this.$linkFontWeight, this.$inlineCodeBackground, this.$reflowSoftLineBreaks, this.$shouldAnimateText, function0), 251544333);
            if (this.$selectionEnabled) {
                bfm.AgE(498185401);
                AbstractC1913AtY.A01(this.$selectionModifier, B1V.A00(bfm, new AnonymousClass1(b1uA00), 423573666), bfm, 48, 0);
            } else {
                bfm.AgE(498291080);
                BRg bRg = this.$selectionModifier;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                AnonymousClass001.A1B(b1uA00, bfm, 6);
                BBI.A0R(bbi, true);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
