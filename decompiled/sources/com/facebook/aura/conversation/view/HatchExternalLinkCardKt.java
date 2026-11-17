package com.facebook.aura.conversation.view;

import X.AKH;
import X.AKQ;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOI;
import X.BOf;
import X.BPg;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3TG;
import X.C3U4;
import X.C3UC;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.opengraph.HatchWebPageMetadata;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchExternalLinkCardKt {
    public static final float CardWidthFraction = 0.8f;
    public static final float FaviconCornerRadius = 8.0f;
    public static final C7197Ei9 IMAGE_CENTER_CROP = AnonymousClass005.A0Z(C7197Ei9.A0P);
    public static final float PreviewAspectRatio = 1.5f;
    public static final float PreviewCornerRadius = 12.0f;
    public static final float PreviewFallbackIconSize = 72.0f;
    public static final float PreviewInset = 4.0f;
    public static final float PreviewMaxHeight = 220.0f;
    public static final float RowPaddingHorizontal = 12.0f;
    public static final float RowPaddingVertical = 10.0f;
    public static final float TitlePlaceholderCorner = 4.0f;
    public static final float TitlePlaceholderHeight = 12.0f;

    /* renamed from: com.facebook.aura.conversation.view.HatchExternalLinkCardKt$ComposerExternalLinkRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $faviconUrl;
        public final /* synthetic */ String $host;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onImageError;
        public final /* synthetic */ String $source;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, String str4, String str5, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$faviconUrl = str2;
            this.$host = str3;
            this.$title = str4;
            this.$source = str5;
            this.$isLoading = z;
            this.$onImageError = function0;
            this.$onDismiss = function02;
            this.$onClick = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchExternalLinkCardKt.ComposerExternalLinkRow(this.$imageUrl, this.$faviconUrl, this.$host, this.$title, this.$source, this.$isLoading, this.$onImageError, this.$onDismiss, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchExternalLinkCardKt$ExternalLinkPreviewImage$2, reason: invalid class name and case insensitive filesystem */
    public final class C114642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $faviconUrl;
        public final /* synthetic */ String $host;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114642(String str, String str2, String str3, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$faviconUrl = str2;
            this.$host = str3;
            this.$onError = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchExternalLinkCardKt.ExternalLinkPreviewImage(this.$imageUrl, this.$faviconUrl, this.$host, this.$onError, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchExternalLinkCardKt$TitleShimmer$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchExternalLinkCardKt.TitleShimmer(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchExternalLinkCardKt$previewSize$1, reason: invalid class name and case insensitive filesystem */
    public final class C114651 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ float $aspectRatio;

        /* renamed from: com.facebook.aura.conversation.view.HatchExternalLinkCardKt$previewSize$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01071 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                ayu.A0A(this.$placeable, 0.0f, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01071(AZE aze) {
                super(1);
                this.$placeable = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114651(float f) {
            super(3);
            this.$aspectRatio = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m597invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m597invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            int iA01;
            AnonymousClass003.A0u(axy, c3tg);
            int iMin = Math.min(axy.Abr(HatchExternalLinkCardKt.PreviewMaxHeight), Constraints.A00(j));
            if (Constraints.A0A(j)) {
                iA01 = Constraints.A01(j);
            } else {
                iA01 = Ab3.A01(iMin * this.$aspectRatio);
                int iA03 = Constraints.A03(j);
                if (iA01 < iA03) {
                    iA01 = iA03;
                }
            }
            int iMin2 = Math.min(Ab3.A01(iA01 / this.$aspectRatio), iMin);
            int iA02 = Constraints.A02(j);
            if (iMin2 < iA02) {
                iMin2 = iA02;
            }
            return AnonymousClass002.A0X(axy, new C01071(c3tg.AQW(Constraints.A04(iA01, iMin2))), iA01, iMin2);
        }
    }

    public static final void ComposerExternalLinkRow(String str, String str2, String str3, String str4, String str5, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1132685648);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str5);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function02);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0b(bfm, function03);
        }
        int i3 = i2 & 512;
        if (i3 != 0) {
            iA0d |= 805306368;
        } else if ((i & 805306368) == 0) {
            iA0d |= AnonymousClass004.A0m(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A01(AnonymousClass001.A0R(bRg2), 18.0f), AnonymousClass002.A0c(bfm).secondaryElevated);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, interfaceC1380AiAA0W, akqA04, g0v);
            Integer numValueOf = Integer.valueOf(i4);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            BPg.A02(bfm, numValueOf, g0v2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0U(C0v5.A05(c90m.AiP(bs0, 1.0f, true), null, function03, true), 50.0f), 7.0f, 7.0f, 0.0f, 7.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, c1ac, 8.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            BPg.A02(bfm, akqA042, g0vA0t);
            AnonymousClass003.A15(g0u, g0v2, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            if (str != null) {
                bfm.AgE(202203304);
                AuraImageKt.AuraImage(str, C11U.A01(C10G.A07(bs0, 36.0f), 10.0f), IMAGE_CENTER_CROP, null, null, false, null, function0, false, null, bfm, AnonymousClass001.A0C(iA0d << 3, (iA0d & 14) | 1575936), 816);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(202483265);
                int i5 = iA0d >> 3;
                m592ExternalLinkFavicon942rkJo(str2, str3, 36.0f, null, bfm, (i5 & 14) | 384 | (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 8);
                BBI.A0R(bbi, false);
            }
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA043, g0vA0t);
            AnonymousClass003.A15(g0u, g0v2, bfm, iA0D2);
            BPg.A02(bfm, bRgA014, g0vA0u);
            if (z) {
                bfm.AgE(1136814252);
                TitleShimmer(null, bfm, 0, 1);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1136874268);
                String str6 = str4;
                if (str4 == null) {
                    str6 = str3;
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str6, null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str5, null, C06G.A0I(bfm, akh), c1822ArmA0Y, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 12) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C0v5.A05(bs0, null, function02, true), 16.0f), BOf.A00(bfm, R.drawable.nav_close, 0), AuraIconSize.TINY, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12071f), C06G.A0I(bfm, akh), null, bfm, AnonymousClass001.A03(), 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, str4, str5, z, function0, function02, function03, bRg2, i, i2);
        }
    }

    /* renamed from: ExternalLinkFavicon-942rkJo, reason: not valid java name */
    public static final void m592ExternalLinkFavicon942rkJo(String str, String str2, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(607143857);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A07(bRg2, f), FaviconCornerRadius), AnonymousClass002.A0c(bfm).bubble);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            if (str == null || MutableState.A0A(mutableState)) {
                bfm.AgE(-1727383600);
                AuraTextKt.m2639AuraTextUY9GdpU(BQG.A17(str2, 1).toUpperCase(Locale.ROOT), null, C06G.A08(bfm), C06G.A0U(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-1727640218);
                BRg bRgA07 = C10G.A07(BRg.A00, f);
                C7197Ei9 c7197Ei9 = IMAGE_CENTER_CROP;
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchExternalLinkCardKt$ExternalLinkFavicon$1$1$1(mutableState);
                    bfm.Ai0(objAaT2);
                }
                AuraImageKt.AuraImage(str, bRgA07, c7197Ei9, null, null, false, null, (Function0) objAaT2, false, null, bfm, i4 | 1575936, 816);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchExternalLinkCardKt$ExternalLinkFavicon$2(str, str2, f, bRg2, i, i2);
        }
    }

    public static final void ExternalLinkPreviewImage(String str, String str2, String str3, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(2109938685);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            Object[] objArr = {str};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchExternalLinkCardKt$ExternalLinkPreviewImage$imageAspectRatio$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Number number = (Number) mutableStateA0N.getValue();
            BRg bRgA01 = C1b8.A01(previewSize(bRgA0Q, number != null ? number.floatValue() : 1.5f), C06G.A0B(bfm));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            if (str != null) {
                bfm.AgE(290552042);
                C1062ATq c1062ATq = C10G.A01;
                C7197Ei9 c7197Ei9 = IMAGE_CENTER_CROP;
                boolean zA65 = bfm.A65(mutableStateA0N);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == obj) {
                    objAaT2 = new HatchExternalLinkCardKt$ExternalLinkPreviewImage$1$1$1(mutableStateA0N);
                    bfm.Ai0(objAaT2);
                }
                AuraImageKt.AuraImage(str, c1062ATq, c7197Ei9, null, null, false, null, function0, false, (G0U) objAaT2, bfm, AnonymousClass001.A0C(iA0d << 12, 1575984 | (iA0d & 14)), 304);
            } else {
                bfm.AgE(291019057);
                int i4 = iA0d >> 3;
                m592ExternalLinkFavicon942rkJo(str2, str3, PreviewFallbackIconSize, null, bfm, (i4 & 14) | 384 | (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 8);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114642(str, str2, str3, function0, bRgA0Q, i, i2);
        }
    }

    /* renamed from: ExternalLinkTitleRow-Ks3TJJE, reason: not valid java name */
    public static final void m593ExternalLinkTitleRowKs3TJJE(String str, String str2, boolean z, B6A b6a, B6A b6a2, BRg bRg, BFM bfm, int i, int i2) {
        long j;
        long j2;
        BRg bRg2 = bRg;
        bfm.AgG(1650106657);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, b6a);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, b6a2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), RowPaddingHorizontal, RowPaddingVertical);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j3 = bbi.A06;
            int i4 = (int) (j3 ^ (j3 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgAiP = C90m.A00.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(2.0f), bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (str2 != null) {
                C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, 805898538).subheadlineMedium;
                if (b6a == null) {
                    j2 = AnonymousClass003.A0c(bfm, 1134379858).primaryText;
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1134378897);
                    BBI.A0R(bbi, false);
                    j2 = b6a.A00;
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, j2, c1822Arm, null, null, null, false, 0, 2, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            } else if (z) {
                bfm.AgE(806159899);
                TitleShimmer(null, bfm, 0, 1);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(806190651);
                BBI.A0R(bbi, false);
            }
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            if (b6a2 == null) {
                j = AnonymousClass003.A0c(bfm, 1134389428).secondaryText;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1134388498);
                BBI.A0R(bbi, false);
                j = b6a2.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, c1822ArmA0Y, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchExternalLinkCardKt$ExternalLinkTitleRow$2(str, str2, z, b6a, b6a2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* renamed from: HatchExternalLinkCard-y8DT0do, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m594HatchExternalLinkCardy8DT0do(java.lang.String r43, X.BRg r44, long r45, X.B6A r47, X.B6A r48, X.C1D3 r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchExternalLinkCardKt.m594HatchExternalLinkCardy8DT0do(java.lang.String, X.BRg, long, X.B6A, X.B6A, X.1D3, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final BRg previewSize(BRg bRg, float f) {
        return C3UC.A00(bRg, new C114651(f));
    }

    public static final void TitleShimmer(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1152036519);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            C01N.A07(bfm, BOI.A00(C10G.A04(C10G.A03(bRg, 0.6f), TitlePlaceholderHeight), C1D8.A00(TitlePlaceholderCorner), BOI.A01(bfm, null, 0.0f, 252, AnonymousClass001.A0f(bfm, akh).shimmeringBase, AnonymousClass001.A0f(bfm, akh).shimmeringHighlight)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }

    public static final /* synthetic */ HatchWebPageMetadata access$HatchExternalLinkCard_y8DT0do$lambda$2(MutableState mutableState) {
        return (HatchWebPageMetadata) mutableState.getValue();
    }
}
