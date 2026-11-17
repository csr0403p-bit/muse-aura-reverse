package com.facebook.aura.file.view;

import X.AbstractC1913AtY;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C06G;
import X.C0CD;
import X.C1110AYw;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FileViewerContentKt$ScrollingFileTextContent$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ List<List<String>> $chunks;
    public final /* synthetic */ ExternalFileSource $externalSource;
    public final /* synthetic */ C1110AYw $horizontalScrollState;
    public final /* synthetic */ boolean $isCode;
    public final /* synthetic */ String $mimeType;
    public final /* synthetic */ boolean $previewTruncated;
    public final /* synthetic */ C1822Arm $textStyle;

    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$ScrollingFileTextContent$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ExternalFileSource $externalSource;
        public final /* synthetic */ String $mimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ExternalFileSource externalFileSource, String str) {
            super(3);
            this.$externalSource = externalFileSource;
            this.$mimeType = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                OpenExternallyCardKt.OpenExternallyCard(this.$externalSource, this.$mimeType, C3U4.A04(BRg.A00, AuraDimensKt.SpacingLargePlusMicro), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209ef), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$ScrollingFileTextContent$1$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(float f) {
            super(3);
            this.$bottomPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$bottomPadding + C06G.A00(bfm));
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        ExternalFileSource externalFileSource;
        C7384Etj.A0Y(c0cd, 0);
        final List<List<String>> list = this.$chunks;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final boolean z = this.$isCode;
        final C1110AYw c1110AYw = this.$horizontalScrollState;
        final C1822Arm c1822Arm = this.$textStyle;
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.FileViewerContentKt$ScrollingFileTextContent$1$1$invoke$$inlined$itemsIndexed$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.FileViewerContentKt$ScrollingFileTextContent$1$1$invoke$$inlined$itemsIndexed$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return "text_chunk";
            }

            public final Object invoke(int i) {
                list.get(i);
                return "text_chunk";
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.file.view.FileViewerContentKt$ScrollingFileTextContent$1$1$invoke$$inlined$itemsIndexed$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                List list2 = (List) list.get(i);
                bfm.AgE(2146908605);
                AbstractC1913AtY.A01(null, B1V.A00(bfm, new FileViewerContentKt$ScrollingFileTextContent$1$1$3$1(list2, z, c1110AYw, c1822Arm), -1976504274), bfm, 48, 1);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), list.size());
        if (this.$previewTruncated && (externalFileSource = this.$externalSource) != null) {
            c0cd.APJ(null, "open_externally", B1V.A01(new AnonymousClass4(externalFileSource, this.$mimeType), -1776105766, true));
        }
        c0cd.APJ(null, "bottom_spacer", B1V.A01(new AnonymousClass5(this.$bottomPadding), -1162607339, true));
    }

    /* renamed from: com.facebook.aura.file.view.FileViewerContentKt$ScrollingFileTextContent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Integer, List<? extends String>, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final Object invoke(int i, List<String> list) {
            return Integer.valueOf(i);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, List<? extends String> list) {
            return Integer.valueOf(AnonymousClass001.A0F(num));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileViewerContentKt$ScrollingFileTextContent$1$1(List<? extends List<String>> list, boolean z, ExternalFileSource externalFileSource, boolean z2, C1110AYw c1110AYw, C1822Arm c1822Arm, String str, float f) {
        super(1);
        this.$chunks = list;
        this.$previewTruncated = z;
        this.$externalSource = externalFileSource;
        this.$isCode = z2;
        this.$horizontalScrollState = c1110AYw;
        this.$textStyle = c1822Arm;
        this.$mimeType = str;
        this.$bottomPadding = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
