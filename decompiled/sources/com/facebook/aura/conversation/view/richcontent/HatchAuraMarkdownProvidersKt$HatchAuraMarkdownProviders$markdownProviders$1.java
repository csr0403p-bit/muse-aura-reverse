package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AHI;
import X.AKJ;
import X.AKT;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C14P;
import X.C3U4;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.G2k;
import X.G2l;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkKind;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkPayload;
import com.facebook.aura.markdown.parser.custom.extensions.ImageGroupPayload;
import com.facebook.aura.markdown.parser.custom.extensions.MermaidPayload;
import com.facebook.aura.markdown.render.AuraMarkdownExtensionRenderersKt;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.markdown.render.inline.InlineMathEntity;
import com.facebook.aura.model.HatchContentViewModelData;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
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
    public final /* synthetic */ G0U<String, String> $resolveImageUrl;
    public final /* synthetic */ G0U<String, String> $resolveUrl;
    public final /* synthetic */ G0U<String, List<String>> $resolveVideoThumbnails;
    public final /* synthetic */ String $sharedElementKeyPrefix;

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<MermaidPayload, AuraMarkdownTheme, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;

        public final void invoke(MermaidPayload mermaidPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
            C7384Etj.A0Y(mermaidPayload, 0);
            String str = mermaidPayload.source;
            boolean zA1J = AnonymousClass003.A1J(bfm, this.$onRichFormatOpenCTAClick, mermaidPayload);
            G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$1$1$1(g0u, mermaidPayload);
                bfm.Ai0(objAaT);
            }
            HatchMermaidContentKt.m683HatchMermaidContentFJfuzF0(str, (Function0) objAaT, null, mermaidPayload.isStreaming, 0.0f, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super HatchContentViewModelData, Unit> g0u) {
            super(4);
            this.$onRichFormatOpenCTAClick = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(MermaidPayload mermaidPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
            invoke(mermaidPayload, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<AHD<? extends InlineMathEntity>, B6A, BFM, Integer, BO6<String, ? extends C14P>> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(4);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ BO6<String, ? extends C14P> invoke(AHD<? extends InlineMathEntity> ahd, B6A b6a, BFM bfm, Integer num) {
            return m674invokeRPmYEkk(ahd, b6a.A00, bfm, AnonymousClass001.A0F(num));
        }

        /* renamed from: invoke-RPmYEkk, reason: not valid java name */
        public final BO6<String, C14P> m674invokeRPmYEkk(AHD<InlineMathEntity> ahd, long j, BFM bfm, int i) {
            C7384Etj.A0Y(ahd, 0);
            bfm.AgE(-56103030);
            BO6<String, C14P> bo6M673rememberHatchInlineMathContentRPmYEkk = HatchAuraMarkdownProvidersKt.m673rememberHatchInlineMathContentRPmYEkk(ahd, j, bfm, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | InlineMathEntity.$stable | (i & 14));
            AnonymousClass001.A1D(bfm);
            return bo6M673rememberHatchInlineMathContentRPmYEkk;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<AuraBlock.Table, AuraMarkdownTheme, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isStreaming;
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;

        public final void invoke(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
            Function0 function0;
            boolean zA1b = AnonymousClass004.A1b(table, auraMarkdownTheme);
            boolean z = this.$isStreaming;
            G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
            if (g0u == null) {
                AnonymousClass003.A0l(bfm, -511261605);
                function0 = null;
            } else {
                bfm.AgE(-511261604);
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, table);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$3$1$1$1(g0u, table);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                AnonymousClass001.A1D(bfm);
            }
            HatchMarkdownTableCardKt.m681HatchMarkdownTableCardb7W0Lw(table, auraMarkdownTheme, null, 0.0f, zA1b, z, function0, bfm, (i & 14) | 27648 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(boolean z, G0U<? super HatchContentViewModelData, Unit> g0u) {
            super(4);
            this.$isStreaming = z;
            this.$onRichFormatOpenCTAClick = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(AuraBlock.Table table, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
            invoke(table, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<AuraBlock.CodeBlock, AuraMarkdownTheme, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<HatchContentViewModelData, Unit> $onRichFormatOpenCTAClick;

        public final void invoke(AuraBlock.CodeBlock codeBlock, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
            Function0 function0;
            C7384Etj.A0Y(codeBlock, 0);
            String str = codeBlock.language;
            if (str == null) {
                str = "";
            }
            String str2 = codeBlock.code;
            G0U<HatchContentViewModelData, Unit> g0u = this.$onRichFormatOpenCTAClick;
            if (g0u == null) {
                AnonymousClass003.A0l(bfm, -1340845219);
                function0 = null;
            } else {
                bfm.AgE(-1340845218);
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, codeBlock);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$4$1$1$1(g0u, codeBlock);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                AnonymousClass001.A1D(bfm);
            }
            HatchCodeBlockKt.m675HatchCodeBlockhGBTI10(str, str2, null, 0.0f, function0, bfm, 3072, 4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(G0U<? super HatchContentViewModelData, Unit> g0u) {
            super(4);
            this.$onRichFormatOpenCTAClick = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(AuraBlock.CodeBlock codeBlock, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
            invoke(codeBlock, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<AuraInline.Image, AuraMarkdownTheme, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineImageClick;
        public final /* synthetic */ G0U<String, String> $resolveImageUrl;
        public final /* synthetic */ String $sharedElementKeyPrefix;

        public final void invoke(AuraInline.Image image, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
            Function0 function0;
            C7384Etj.A0Y(image, 0);
            String strInvoke = this.$resolveImageUrl.invoke(image.url);
            String str = image.alt;
            G0V<String, String, Unit> g0v = this.$onInlineImageClick;
            if (g0v == null) {
                AnonymousClass003.A0l(bfm, 2081984118);
                function0 = null;
            } else {
                boolean zA1S = AnonymousClass004.A1S(bfm, strInvoke, image, AnonymousClass001.A1Y(g0v, bfm, 2081984119));
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$5$1$1$1(g0v, strInvoke, image);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                AnonymousClass001.A1D(bfm);
            }
            G0U<String, Unit> g0u = this.$onImageError;
            String str2 = this.$sharedElementKeyPrefix;
            HatchInlineImageKt.m676HatchInlineImageTxD2sAc(strInvoke, str, null, 0.0f, 0.0f, false, null, function0, g0u, str2 != null ? FGI.A0U(str2, "_", strInvoke) : null, bfm, 0, 124);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(G0U<? super String, String> g0u, G0V<? super String, ? super String, Unit> g0v, G0U<? super String, Unit> g0u2, String str) {
            super(4);
            this.$resolveImageUrl = g0u;
            this.$onInlineImageClick = g0v;
            this.$onImageError = g0u2;
            this.$sharedElementKeyPrefix = str;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(AuraInline.Image image, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
            invoke(image, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G2j<ImageGroupPayload, AuraMarkdownTheme, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onInlineImageGridClick;
        public final /* synthetic */ G0U<String, String> $resolveImageUrl;
        public final /* synthetic */ String $sharedElementKeyPrefix;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u, String str, G0U<? super String, String> g0u2) {
            super(4);
            this.$onInlineImageGridClick = g0v;
            this.$onImageError = g0u;
            this.$sharedElementKeyPrefix = str;
            this.$resolveImageUrl = g0u2;
        }

        public final void invoke(ImageGroupPayload imageGroupPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
            boolean zA1b = AnonymousClass004.A1b(imageGroupPayload, auraMarkdownTheme);
            boolean zA65 = bfm.A65(imageGroupPayload.images);
            G0U<String, String> g0u = this.$resolveImageUrl;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                List<AuraInline.Image> list = imageGroupPayload.images;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (AuraInline.Image image : list) {
                    arrayListA0i.add(new HatchInlineImageData(g0u.invoke(image.url), image.alt, zA1b, null));
                }
                objAaT = AnonymousClass001.A0z(bfm, arrayListA0i);
            }
            HatchInlineImageKt.m677HatchInlineImageGridtw_glAc((AHD) objAaT, null, 0.0f, 0.0f, this.$onInlineImageGridClick, this.$onImageError, this.$sharedElementKeyPrefix, zA1b, bfm, HatchInlineImageData.$stable, 142);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(ImageGroupPayload imageGroupPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
            invoke(imageGroupPayload, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G2j<FileLinkPayload, AuraMarkdownTheme, BFM, Integer, Unit> {
        public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $inlineFilePreview;
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ G2k<String, String, BRg, BFM, Integer, Unit> $onInlineAudioContent;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineSlidesClick;
        public final /* synthetic */ G0V<String, String, Unit> $onInlineVideoClick;
        public final /* synthetic */ G0U<String, String> $resolveUrl;
        public final /* synthetic */ G0U<String, List<String>> $resolveVideoThumbnails;
        public final /* synthetic */ String $sharedElementKeyPrefix;

        public final void invoke(FileLinkPayload fileLinkPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, int i) {
            BBI bbiA0M;
            AHD ahd;
            Function0 function0;
            C7384Etj.A0Y(fileLinkPayload, 0);
            C7384Etj.A0Y(auraMarkdownTheme, 1);
            String str = fileLinkPayload.url;
            if (fileLinkPayload.kind == FileLinkKind.VIDEO) {
                boolean zA1Y = AnonymousClass001.A1Y(str, bfm, -51584580);
                G0U<String, List<String>> g0u = this.$resolveVideoThumbnails;
                Object objAaT = bfm.AaT();
                if (zA1Y || objAaT == C78N.A00) {
                    objAaT = AnonymousClass001.A0z(bfm, g0u.invoke(str));
                }
                ahd = (AHD) objAaT;
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -51460487);
                ahd = AHI.A01;
            }
            String strInvoke = this.$resolveUrl.invoke(str);
            String str2 = fileLinkPayload.displayName;
            int iOrdinal = fileLinkPayload.kind.ordinal();
            if (iOrdinal == 3) {
                bfm.AgE(829632906);
                G0V<String, String, Unit> g0v = this.$onInlineVideoClick;
                if (g0v == null) {
                    bfm.AgE(-50973044);
                    BBI.A0R(bbiA0M, false);
                    function0 = null;
                } else {
                    bfm.AgE(-50973043);
                    boolean zA1R = AnonymousClass005.A1R(bfm, g0v, strInvoke, str2);
                    Object objAaT2 = bfm.AaT();
                    if (zA1R || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$7$1$1$1(g0v, strInvoke, str2);
                        bfm.Ai0(objAaT2);
                    }
                    function0 = (Function0) objAaT2;
                    BBI.A0R(bbiA0M, false);
                }
                G0U<String, Unit> g0u2 = this.$onImageError;
                String str3 = this.$sharedElementKeyPrefix;
                HatchInlineImageKt.m678HatchInlineVideoThumbnailWSk2ftU(strInvoke, str2, null, 0.0f, ahd, false, 0.0f, function0, g0u2, str3 != null ? FGI.A0U(str3, "_", strInvoke) : null, false, bfm, 0, 0, 1132);
            } else if (iOrdinal == 1) {
                bfm.AgE(-50581978);
                HatchAuraMarkdownProvidersKt.FileChipWithPreview(str2, strInvoke, null, true, this.$onInlineSlidesClick, this.$inlineFilePreview, null, false, false, bfm, 3456, VideoConfigJsonKt.SOURCE_WIDTH);
            } else if (iOrdinal == 2) {
                bfm.AgE(-50171011);
                HatchAuraMarkdownProvidersKt.FileChipWithPreview(str2, strInvoke, "text/html", false, this.$onInlineFileClick, this.$inlineFilePreview, null, false, false, bfm, 3456, VideoConfigJsonKt.SOURCE_WIDTH);
            } else if (iOrdinal == 4) {
                bfm.AgE(-49733911);
                G2k<String, String, BRg, BFM, Integer, Unit> g2k = this.$onInlineAudioContent;
                if (g2k == null) {
                    bfm.AgE(-49724612);
                    BBI.A0R(bbiA0M, false);
                    bfm.AgE(829685873);
                    HatchAuraMarkdownProvidersKt.FileChipWithPreview(str2, strInvoke, null, false, this.$onInlineFileClick, this.$inlineFilePreview, null, false, false, bfm, 3456, VideoConfigJsonKt.SOURCE_WIDTH);
                } else {
                    g2k.invoke(strInvoke, str2, C3U4.A0C(C3cG.A09(bfm, 829679973), 0.0f, 0.0f, 0.0f, 8.0f), bfm, 384);
                    BBI.A0R(bbiA0M, false);
                    bfm.AgE(829679673);
                }
                BBI.A0R(bbiA0M, false);
            } else {
                if (iOrdinal != 0) {
                    throw AnonymousClass003.A0k(bfm, bbiA0M, 829632309);
                }
                bfm.AgE(-49132697);
                HatchAuraMarkdownProvidersKt.FileChipWithPreview(str2, strInvoke, null, false, this.$onInlineFileClick, this.$inlineFilePreview, null, false, false, bfm, 3456, VideoConfigJsonKt.SOURCE_WIDTH);
            }
            BBI.A0R(bbiA0M, false);
        }

        /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1$7$WhenMappings */
        /* loaded from: classes4.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileLinkKind.values().length];
                try {
                    AnonymousClass002.A13(FileLinkKind.VIDEO, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(FileLinkKind.SLIDES, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(FileLinkKind.HTML_ARTIFACT, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(FileLinkKind.AUDIO, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(FileLinkKind.FILE, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(G0U<? super String, String> g0u, G0V<? super String, ? super String, Unit> g0v, G0U<? super String, Unit> g0u2, String str, G0V<? super String, ? super String, Unit> g0v2, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, G0V<? super String, ? super String, Unit> g0v3, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, ? extends List<String>> g0u3) {
            super(4);
            this.$resolveUrl = g0u;
            this.$onInlineVideoClick = g0v;
            this.$onImageError = g0u2;
            this.$sharedElementKeyPrefix = str;
            this.$onInlineSlidesClick = g0v2;
            this.$inlineFilePreview = g2l;
            this.$onInlineFileClick = g0v3;
            this.$onInlineAudioContent = g2k;
            this.$resolveVideoThumbnails = g0u3;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(FileLinkPayload fileLinkPayload, AuraMarkdownTheme auraMarkdownTheme, BFM bfm, Integer num) {
            invoke(fileLinkPayload, auraMarkdownTheme, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAuraMarkdownProvidersKt$HatchAuraMarkdownProviders$markdownProviders$1(G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super HatchContentViewModelData, Unit> g0u, boolean z, G0U<? super String, String> g0u2, G0V<? super String, ? super String, Unit> g0v2, G0U<? super String, Unit> g0u3, String str, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v3, G0U<? super String, String> g0u4, G0V<? super String, ? super String, Unit> g0v4, G0V<? super String, ? super String, Unit> g0v5, G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, G0V<? super String, ? super String, Unit> g0v6, G2k<? super String, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, G0U<? super String, ? extends List<String>> g0u5) {
        super(2);
        this.$content = g0v;
        this.$onRichFormatOpenCTAClick = g0u;
        this.$isStreaming = z;
        this.$resolveImageUrl = g0u2;
        this.$onInlineImageClick = g0v2;
        this.$onImageError = g0u3;
        this.$sharedElementKeyPrefix = str;
        this.$onInlineImageGridClick = g0v3;
        this.$resolveUrl = g0u4;
        this.$onInlineVideoClick = g0v4;
        this.$onInlineSlidesClick = g0v5;
        this.$inlineFilePreview = g2l;
        this.$onInlineFileClick = g0v6;
        this.$onInlineAudioContent = g2k;
        this.$resolveVideoThumbnails = g0u5;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AKT.A02(bfm, this.$content, new AKJ[]{AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownShowInternalDebug.A04(Boolean.valueOf(HatchUtil.INSTANCE.isViewerEmployee())), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownMermaidBlockRenderer.A04(B1V.A00(bfm, new AnonymousClass1(this.$onRichFormatOpenCTAClick), 2100687106)), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownMathBlockRenderer.A04(ComposableSingletons$HatchAuraMarkdownProvidersKt.lambda$580816159), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineMathRenderer.A04(ComposableSingletons$HatchAuraMarkdownProvidersKt.f34lambda$1984664366), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownInlineMathContentBuilder.A04(AnonymousClass2.INSTANCE), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownTableBlockRenderer.A04(B1V.A00(bfm, new AnonymousClass3(this.$isStreaming, this.$onRichFormatOpenCTAClick), -1211333197)), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownCodeBlockRenderer.A04(B1V.A00(bfm, new AnonymousClass4(this.$onRichFormatOpenCTAClick), 1679967522)), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownImageBlockRenderer.A04(B1V.A00(bfm, new AnonymousClass5(this.$resolveImageUrl, this.$onInlineImageClick, this.$onImageError, this.$sharedElementKeyPrefix), -190955320)), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownImageGroupBlockRenderer.A04(B1V.A00(bfm, new AnonymousClass6(this.$onInlineImageGridClick, this.$onImageError, this.$sharedElementKeyPrefix, this.$resolveImageUrl), 441532922)), AuraMarkdownExtensionRenderersKt.LocalAuraMarkdownFileLinkInlineRenderer.A04(B1V.A00(bfm, new AnonymousClass7(this.$resolveUrl, this.$onInlineVideoClick, this.$onImageError, this.$sharedElementKeyPrefix, this.$onInlineSlidesClick, this.$inlineFilePreview, this.$onInlineFileClick, this.$onInlineAudioContent, this.$resolveVideoThumbnails), -1223716371))}, 0);
        } else {
            bfm.Afo();
        }
    }
}
