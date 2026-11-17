package com.facebook.aura.conversation.view.richcontent;

import X.AGO;
import X.AHD;
import X.AKH;
import X.AKT;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C0jP;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2k;
import X.G2l;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchAuraMarkdownProvidersKt {
    public static final AKH<Boolean> LocalInsideInlineFilePreview = new AGO(HatchAuraMarkdownProvidersKt$LocalInsideInlineFilePreview$1.INSTANCE);
    public static final String MIME_TYPE_HTML = "text/html";

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$FileChipWithPreview$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $addBottomPadding;
        public final /* synthetic */ boolean $addTopPadding;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
        public final /* synthetic */ boolean $isSlides;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(String str, String str2, String str3, boolean z, G0V<? super String, ? super String, Unit> g0v, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, BRg bRg, boolean z2, boolean z3, int i, int i2) {
            super(2);
            this.$fileName = str;
            this.$url = str2;
            this.$mimeType = str3;
            this.$isSlides = z;
            this.$onInlineFileClick = g0v;
            this.$inlineFilePreview = g2l;
            this.$modifier = bRg;
            this.$addBottomPadding = z2;
            this.$addTopPadding = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAuraMarkdownProvidersKt.FileChipWithPreview(this.$fileName, this.$url, this.$mimeType, this.$isSlides, this.$onInlineFileClick, this.$inlineFilePreview, this.$modifier, this.$addBottomPadding, this.$addTopPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ String $imageVersion;
        public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
        public final /* synthetic */ boolean $isStreaming;
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ G2k<String, String, BRg, BFM, Integer, Unit> $onInlineAudioContent;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
        public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;
        public final /* synthetic */ G0U<String, Unit> $onUrlClick;
        public final /* synthetic */ String $sharedElementKeyPrefix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super HatchContentViewModelData, Unit> g0u, G0V<? super String, ? super String, Unit> g0v, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2, G0V<? super String, ? super String, Unit> g0v3, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, Unit> g0u2, String str, String str2, boolean z, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, G0U<? super String, Unit> g0u3, G0V<? super BFM, ? super Integer, Unit> g0v6, int i, int i2, int i3) {
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
            this.$imageVersion = str2;
            this.$isStreaming = z;
            this.$inlineFilePreview = g2l;
            this.$onUrlClick = g0u3;
            this.$content = g0v6;
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
            HatchAuraMarkdownProvidersKt.HatchAuraMarkdownProviders(this.$onRichFormatOpenCTAClick, this.$onInlineImageClick, this.$onInlineImageGridClick, this.$onInlineFileClick, this.$onInlineSlidesClick, this.$onInlineVideoClick, this.$onInlineAudioContent, this.$onImageError, this.$sharedElementKeyPrefix, this.$imageVersion, this.$isStreaming, this.$inlineFilePreview, this.$onUrlClick, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownUrlHandler$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C115161 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ G0U<String, Unit> $onUrlClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115161(G0U<? super String, Unit> g0u, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$onUrlClick = g0u;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAuraMarkdownProvidersKt.HatchAuraMarkdownUrlHandler(this.$onUrlClick, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* renamed from: rememberHatchInlineMathContent-RPmYEkk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BO6<java.lang.String, X.C14P> m673rememberHatchInlineMathContentRPmYEkk(X.AHD<com.facebook.aura.markdown.render.inline.InlineMathEntity> r17, long r18, X.BFM r20, int r21) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt.m673rememberHatchInlineMathContentRPmYEkk(X.AHD, long, X.BFM, int):X.BO6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HatchAuraMarkdownUrlHandler(final G0U<? super String, Unit> g0u, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        AnonymousClass003.A0u(g0u, g0v);
        bfm.AgG(-1207890040);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            boolean zA1M = AnonymousClass001.A1M(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new C0jP() { // from class: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownUrlHandler$uriHandler$1$1
                    @Override // X.C0jP
                    public void openUri(String str) {
                        C7384Etj.A0Y(str, 0);
                        g0u.invoke(str);
                    }
                };
                bfm.Ai0(objAaT);
            }
            AKT.A01(bfm, Am0.A0G.A04(objAaT), g0v, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115161(g0u, g0v, i);
        }
    }

    public static final /* synthetic */ BO6 access$rememberHatchInlineMathContent_RPmYEkk$lambda$3(MutableState mutableState) {
        return (BO6) mutableState.getValue();
    }

    public static final HatchContentViewModelData.Table toContentViewModelDataTable(AuraBlock.Table table) {
        return new HatchContentViewModelData.Table(HatchMarkdownTableCardKt.toHatchTableParamsModel(table), null, false);
    }

    public static final void FileChipWithPreview(String str, String str2, String str3, boolean z, G0V<? super String, ? super String, Unit> g0v, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, BRg bRg, boolean z2, boolean z3, BFM bfm, int i, int i2) {
        int iA0Y;
        Function0 function0;
        BBI bbiA07;
        B1U b1uA00;
        BRg bRg2 = bRg;
        boolean z4 = z2;
        boolean z5 = z3;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(1072653434);
        if ((i & 6) == 0) {
            iA0Y = AnonymousClass004.A0d(bfm, str) | i;
        } else {
            iA0Y = i;
        }
        if ((i & 48) == 0) {
            iA0Y |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0Y |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0Y |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0Y |= AnonymousClass004.A0X(bfm, g0v);
        }
        if ((196608 & i) == 0) {
            iA0Y |= AnonymousClass004.A0Y(bfm, g2l);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0Y |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0Y |= iA0j;
        }
        int i4 = i2 & 128;
        int iA0u = 12582912;
        if (i4 != 0) {
            iA0Y |= iA0u;
        } else if ((12582912 & i) == 0) {
            iA0u = AnonymousClass004.A0u(bfm, z4);
            iA0Y |= iA0u;
        }
        int i5 = i2 & 256;
        int i6 = 100663296;
        if (i5 != 0) {
            iA0Y |= i6;
        } else if ((100663296 & i) == 0) {
            i6 = 33554432;
            if (bfm.A66(z5)) {
                i6 = 67108864;
            }
            iA0Y |= i6;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0Y), bfm, iA0Y)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z4 = true;
            }
            if (i5 != 0) {
                z5 = true;
            }
            int i7 = iA0Y & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA18 = AnonymousClass003.A18(i7);
            Object objAaT = bfm.AaT();
            if (zA18 || objAaT == C78N.A00) {
                objAaT = HatchFileUIUtils.INSTANCE.resolvePreviewPathFromUrl(str2);
                bfm.Ai0(objAaT);
            }
            String str4 = (String) objAaT;
            int i8 = iA0Y & 14;
            boolean zA182 = AnonymousClass003.A18(i7) | AnonymousClass003.A17(i8);
            Object objAaT2 = bfm.AaT();
            if (zA182 || objAaT2 == C78N.A00) {
                objAaT2 = HatchInlineFileChipKt.resolveFileExtension(str, str2);
                bfm.Ai0(objAaT2);
            }
            String str5 = (String) objAaT2;
            boolean zA65 = bfm.A65(str5);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = AnonymousClass001.A0j(bfm, HatchFileUIUtils.FileExtensions.INSTANCE.isPreviewableExtension(str5));
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT3);
            boolean zA183 = AnonymousClass003.A18(i7);
            Object objAaT4 = bfm.AaT();
            if (zA183 || objAaT4 == C78N.A00) {
                objAaT4 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT4;
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA1J = AnonymousClass003.A1J(bfm, str4, abstractC3358CGzA0h);
            Object objAaT5 = bfm.AaT();
            if (zA1J || objAaT5 == C78N.A00) {
                objAaT5 = new HatchAuraMarkdownProvidersKt$FileChipWithPreview$1$1(str4, abstractC3358CGzA0h);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A19(bfm, objAaT5, str4, abstractC3358CGzA0h);
            boolean zA1G = AnonymousClass003.A1G(bfm, LocalInsideInlineFilePreview);
            String strA05 = MutableState.A05(mutableState);
            if (g0v == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, 864025770);
                function0 = null;
            } else {
                boolean zA184 = AnonymousClass003.A18(i7) | AnonymousClass001.A1Y(g0v, bfm, 864025771) | AnonymousClass003.A17(i8);
                Object objAaT6 = bfm.AaT();
                if (zA184 || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchAuraMarkdownProvidersKt$FileChipWithPreview$2$1$1(g0v, str2, str);
                    bfm.Ai0(objAaT6);
                }
                function0 = (Function0) objAaT6;
                bbiA07 = C3cG.A07(bfm);
            }
            if (str4 != null && zA1X && !zA1G) {
                bfm.AgE(864193481);
                if (g2l == null) {
                    bfm.AgE(1617416666);
                    BBI.A0R(bbiA07, zA1b);
                    b1uA00 = null;
                } else {
                    bfm.AgE(1617416667);
                    b1uA00 = B1V.A00(bfm, new HatchAuraMarkdownProvidersKt$FileChipWithPreview$4$1$1(g2l, str4, str5, str3, mutableState), 2073469363);
                    BBI.A0R(bbiA07, zA1b);
                }
                BBI.A0R(bbiA07, zA1b);
            } else {
                bfm.AgE(864193480);
                BBI.A0R(bbiA07, zA1b);
                b1uA00 = null;
            }
            int iA0C = AnonymousClass001.A0C(iA0Y << 12, (iA0Y & 1022) | ((iA0Y >> 9) & 7168));
            int i9 = iA0Y << 3;
            BRg bRg3 = bRg2;
            boolean z6 = z4;
            HatchInlineFileChipKt.HatchInlineFileChip(str, str2, str3, bRg3, strA05, zA1b, zA1b, z, z6, z5, null, function0, b1uA00, bfm, AnonymousClass001.A06(i9, iA0C | (234881024 & i9)), zA1b ? 1 : 0, 1120);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, str2, str3, z, g0v, g2l, bRg2, z4, z5, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchAuraMarkdownProviders(X.G0U<? super com.facebook.aura.model.HatchContentViewModelData, kotlin.Unit> r37, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r38, X.G0V<? super X.AHD<com.facebook.aura.conversation.view.richcontent.HatchInlineImageData>, ? super java.lang.Integer, kotlin.Unit> r39, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r40, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r41, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r42, X.G2k<? super java.lang.String, ? super java.lang.String, ? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r43, X.G0U<? super java.lang.String, kotlin.Unit> r44, java.lang.String r45, java.lang.String r46, boolean r47, X.G2l<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super X.G0U<? super java.lang.String, kotlin.Unit>, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r48, X.G0U<? super java.lang.String, kotlin.Unit> r49, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r50, X.BFM r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt.HatchAuraMarkdownProviders(X.G0U, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G2k, X.G0U, java.lang.String, java.lang.String, boolean, X.G2l, X.G0U, X.G0V, X.BFM, int, int, int):void");
    }
}
