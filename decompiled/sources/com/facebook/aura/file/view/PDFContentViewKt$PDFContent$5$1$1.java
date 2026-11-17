package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G2j;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PDFContentViewKt$PDFContent$5$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<Boolean> $loadError$delegate;
    public final /* synthetic */ MutableState<List<PageSize>> $pageSizes$delegate;
    public final /* synthetic */ int $renderWidth;
    public final /* synthetic */ PdfRendererHolder $rendererHolder;

    /* renamed from: com.facebook.aura.file.view.PDFContentViewKt$PDFContent$5$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<PageSize, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(PageSize pageSize) {
            C7384Etj.A0Y(pageSize, 0);
            return Integer.valueOf(pageSize.index);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final List<PageSize> value = this.$pageSizes$delegate.getValue();
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final int i = this.$renderWidth;
        final PdfRendererHolder pdfRendererHolder = this.$rendererHolder;
        final MutableState<Boolean> mutableState = this.$loadError$delegate;
        final MutableState<List<PageSize>> mutableState2 = this.$pageSizes$delegate;
        final PDFContentViewKt$PDFContent$5$1$1$invoke$$inlined$items$default$1 pDFContentViewKt$PDFContent$5$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.file.view.PDFContentViewKt$PDFContent$5$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(PageSize pageSize) {
                return null;
            }
        };
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.PDFContentViewKt$PDFContent$5$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i2) {
                return AnonymousClass006.A0p(value, anonymousClass1, i2);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.PDFContentViewKt$PDFContent$5$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i2) {
                return AnonymousClass006.A0p(value, pDFContentViewKt$PDFContent$5$1$1$invoke$$inlined$items$default$1, i2);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.file.view.PDFContentViewKt$PDFContent$5$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i2, BFM bfm, int i3) {
                int iA0d = (i3 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i3 : i3;
                if ((i3 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i2);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                PageSize pageSize = (PageSize) value.get(i2);
                bfm.AgE(996848634);
                int i4 = pageSize.index;
                float f = pageSize.aspectRatio;
                int size = ((List) mutableState2.getValue()).size();
                int i5 = i;
                PdfRendererHolder pdfRendererHolder2 = pdfRendererHolder;
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new PDFContentViewKt$PDFContent$5$1$1$2$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                PDFContentViewKt.PdfPage(i4, f, size, i5, pdfRendererHolder2, (Function0) objAaT, bfm, PdfRendererHolder.$stable << 12);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018), value.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFContentViewKt$PDFContent$5$1$1(MutableState<List<PageSize>> mutableState, int i, PdfRendererHolder pdfRendererHolder, MutableState<Boolean> mutableState2) {
        super(1);
        this.$pageSizes$delegate = mutableState;
        this.$renderWidth = i;
        this.$rendererHolder = pdfRendererHolder;
        this.$loadError$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
