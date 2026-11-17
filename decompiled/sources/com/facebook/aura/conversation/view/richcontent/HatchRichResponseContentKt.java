package com.facebook.aura.conversation.view.richcontent;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BRg;
import X.C3TG;
import X.C3TQ;
import X.C3UC;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.markdown.render.spacing.BlockSpacingCategory;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchRichResponseContentKt {
    public static final String MIME_TYPE_HTML = "text/html";

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$fullBleed$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ C3TQ $parentPadding;

        /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$fullBleed$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01131 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;
            public final /* synthetic */ int $startPx;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AYU.A04(ayu, this.$placeable, -this.$startPx, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01131(AZE aze, int i) {
                super(1);
                this.$placeable = aze;
                this.$startPx = i;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C3TQ c3tq) {
            super(3);
            this.$parentPadding = c3tq;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m686invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m686invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            int iAbr = axy.Abr(this.$parentPadding.A5k(axy.getLayoutDirection()));
            int iAbr2 = axy.Abr(this.$parentPadding.A5n(axy.getLayoutDirection()));
            int iA01 = Constraints.A01(j);
            AZE azeAQW = c3tg.AQW(AnonymousClass004.A0x(j, Constraints.A03(j), iA01 + iAbr + iAbr2));
            return AnonymousClass002.A0X(axy, new C01131(azeAQW, iAbr), iA01, azeAQW.A00);
        }
    }

    public static final BRg fullBleed(BRg bRg, C3TQ c3tq) {
        return C3UC.A00(bRg, new AnonymousClass1(c3tq));
    }

    public static final boolean isHtml(String str, String str2, String str3) {
        return HatchFileUIUtils.FileExtensions.INSTANCE.isHtml(str, str2, str3);
    }

    public static final BlockSpacingCategory spacingCategory(HatchContentViewModelData hatchContentViewModelData) {
        return hatchContentViewModelData instanceof HatchContentViewModelData.Markdown ? BlockSpacingCategory.PARAGRAPH : hatchContentViewModelData instanceof HatchContentViewModelData.Table ? BlockSpacingCategory.TABLE : hatchContentViewModelData instanceof HatchContentViewModelData.Code ? BlockSpacingCategory.CODE : hatchContentViewModelData instanceof HatchContentViewModelData.MermaidDiagram ? BlockSpacingCategory.MERMAID : hatchContentViewModelData instanceof HatchContentViewModelData.Math ? BlockSpacingCategory.MATH : ((hatchContentViewModelData instanceof HatchContentViewModelData.InlineImage) || (hatchContentViewModelData instanceof HatchContentViewModelData.InlineImageGroup) || (hatchContentViewModelData instanceof HatchContentViewModelData.InlineFile) || (hatchContentViewModelData instanceof HatchContentViewModelData.InlineSlides) || (hatchContentViewModelData instanceof HatchContentViewModelData.InlineHtml)) ? BlockSpacingCategory.ATTACHMENT : hatchContentViewModelData instanceof HatchContentViewModelData.EmbeddedFileHTMLContent ? BlockSpacingCategory.HTML : hatchContentViewModelData instanceof HatchContentViewModelData.Divider ? BlockSpacingCategory.THEMATIC_BREAK : BlockSpacingCategory.CUSTOM;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* renamed from: HatchRichResponseContent-XdLsqko, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m685HatchRichResponseContentXdLsqko(X.AHD<? extends com.facebook.aura.model.HatchContentViewModelData> r92, X.G0V<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r93, X.BRg r94, kotlin.jvm.functions.Function0<kotlin.Unit> r95, X.BRg r96, boolean r97, boolean r98, X.C1822Arm r99, X.B6A r100, X.C1736ApY r101, X.B6A r102, boolean r103, java.lang.String r104, java.lang.String r105, kotlin.jvm.functions.Function0<kotlin.Unit> r106, int r107, int r108, boolean r109, boolean r110, boolean r111, X.G0U<? super java.lang.String, kotlin.Unit> r112, X.G0U<? super java.lang.String, kotlin.Unit> r113, boolean r114, boolean r115, java.lang.String r116, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r117, X.G0V<? super X.AHD<com.facebook.aura.conversation.view.richcontent.HatchInlineImageData>, ? super java.lang.Integer, kotlin.Unit> r118, X.G0U<? super java.lang.String, kotlin.Unit> r119, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r120, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r121, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r122, X.G0U<? super com.facebook.aura.model.HatchContentViewModelData, kotlin.Unit> r123, X.G2k<? super java.lang.String, ? super java.lang.String, ? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r124, X.G0U<? super java.lang.String, kotlin.Unit> r125, java.lang.String r126, java.lang.String r127, boolean r128, X.C3TQ r129, X.G2l<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super X.G0U<? super java.lang.String, kotlin.Unit>, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r130, X.BFM r131, int r132, int r133, int r134, int r135, int r136, int r137) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt.m685HatchRichResponseContentXdLsqko(X.AHD, X.G0V, X.BRg, kotlin.jvm.functions.Function0, X.BRg, boolean, boolean, X.Arm, X.B6A, X.ApY, X.B6A, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, int, int, boolean, boolean, boolean, X.G0U, X.G0U, boolean, boolean, java.lang.String, X.G0V, X.G0V, X.G0U, X.G0V, X.G0V, X.G0V, X.G0U, X.G2k, X.G0U, java.lang.String, java.lang.String, boolean, X.3TQ, X.G2l, X.BFM, int, int, int, int, int, int):void");
    }
}
