package com.facebook.aura.bloks.bottomsheet;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C90m;
import X.EnumC1820Arj;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraBloksBottomSheetContentKt {

    /* renamed from: com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ AuraBloksBottomSheetStateHolder $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, AuraBloksBottomSheetStateHolder auraBloksBottomSheetStateHolder, int i, int i2) {
            super(2);
            this.$onDismissRequest = function0;
            this.$viewModel = auraBloksBottomSheetStateHolder;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBloksBottomSheetContentKt.AuraBloksBottomSheetContent(this.$onDismissRequest, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentKt$AuraBloksBottomSheetHeader$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraBloksBottomSheetHeaderData $headerData;
        public final /* synthetic */ Function0<Unit> $onBackClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, Function0<Unit> function0) {
            super(2);
            this.$headerData = auraBloksBottomSheetHeaderData;
            this.$onBackClick = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
                BRg bRgA0C = C3U4.A0C(c1062ATq, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), 16.0f);
                C1AC c1ac = C2VU.A04;
                AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData = this.$headerData;
                Function0<Unit> function0 = this.$onBackClick;
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
                C90m c90m = C90m.A00;
                if (auraBloksBottomSheetHeaderData.hideBackButton) {
                    bfm.AgE(-1749606144);
                    C01N.A0A(bfm, bs0, C06G.A0d(bfm, akh).xSmall);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-1749507130);
                    AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, BOf.A00(bfm, R.drawable.arrow_left_wght400_outline_24, 0), AuraIconButtonSizeV2.SMALL, AuraIconButtonStyle.PRIMARY, AuraIconButtonBackground.NO_BACKGROUND, null, AbstractC2271BQs.A01(bfm, R.string.back), function0, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 16161);
                    BBI.A0R(bbi, false);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(auraBloksBottomSheetHeaderData.title, C3U4.A0B(c90m.AiP(bs0, 1.0f, true), 8.0f, 0.0f), 0L, C06G.A0W(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16308);
                C01N.A0A(bfm, bs0, AnonymousClass002.A0d(bfm).icon.xSmall);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentKt$AuraBloksBottomSheetHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraBloksBottomSheetHeaderData $headerData;
        public final /* synthetic */ Function0<Unit> $onBackClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, int i) {
            super(2);
            this.$onBackClick = function0;
            this.$headerData = auraBloksBottomSheetHeaderData;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBloksBottomSheetContentKt.AuraBloksBottomSheetHeader(this.$onBackClick, this.$headerData, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraBloksBottomSheetContent(kotlin.jvm.functions.Function0<kotlin.Unit> r28, com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetStateHolder r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentKt.AuraBloksBottomSheetContent(kotlin.jvm.functions.Function0, com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetStateHolder, X.BFM, int, int):void");
    }

    public static final void AuraBloksBottomSheetHeader(Function0<Unit> function0, AuraBloksBottomSheetHeaderData auraBloksBottomSheetHeaderData, BFM bfm, int i) {
        bfm.AgG(142170674);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraBloksBottomSheetHeaderData, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            AnonymousClass003.A0m(bfm, Am0.A0A.A04(EnumC1820Arj.A02), new AnonymousClass1(auraBloksBottomSheetHeaderData, function0), 1717161330);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, auraBloksBottomSheetHeaderData, i);
        }
    }
}
