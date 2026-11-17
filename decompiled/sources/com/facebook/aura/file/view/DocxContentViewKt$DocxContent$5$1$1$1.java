package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BBI;
import X.BFM;
import X.C0CD;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.file.docx.DocElement;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class DocxContentViewKt$DocxContent$5$1$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ List<DocElement> $docElements;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final List<DocElement> list = this.$docElements;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.DocxContentViewKt$DocxContent$5$1$1$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.DocxContentViewKt$DocxContent$5$1$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.file.view.DocxContentViewKt$DocxContent$5$1$1$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                boolean z;
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                DocElement docElement = (DocElement) list.get(i);
                bfm.AgE(-1764963803);
                if (docElement instanceof DocElement.Para) {
                    bfm.AgE(-1858048188);
                    z = false;
                    DocxContentViewKt.DocxParagraph((DocElement.Para) docElement, bfm, 0);
                } else if (docElement instanceof DocElement.Image) {
                    bfm.AgE(-1858046272);
                    z = false;
                    DocxContentViewKt.DocxImage((DocElement.Image) docElement, bfm, 0);
                } else if (docElement instanceof DocElement.Table) {
                    bfm.AgE(-1858044480);
                    z = false;
                    DocxContentViewKt.DocxTable((DocElement.Table) docElement, bfm, 0);
                } else {
                    if (!(docElement instanceof DocElement.Drawing)) {
                        bfm.AgE(-1858049634);
                        AnonymousClass002.A19(bfm);
                        throw C3cG.A0q();
                    }
                    bfm.AgE(-1858042611);
                    z = false;
                    DocxContentViewKt.DocxDrawingPlaceholder((DocElement.Drawing) docElement, bfm, 0);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, z);
                BBI.A0R(bbi, z);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), list.size());
    }

    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxContent$5$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Integer, DocElement, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, DocElement docElement) {
            return Integer.valueOf(AnonymousClass001.A0F(num));
        }

        public final Object invoke(int i, DocElement docElement) {
            return Integer.valueOf(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocxContentViewKt$DocxContent$5$1$1$1(List<? extends DocElement> list) {
        super(1);
        this.$docElements = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
