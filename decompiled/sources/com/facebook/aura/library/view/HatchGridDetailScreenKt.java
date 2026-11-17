package com.facebook.aura.library.view;

import X.AHD;
import X.AKQ;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C2VU;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.library.model.RecentFile;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchGridDetailScreenKt {
    public static final int GRID_COLUMNS = 2;
    public static final float GRID_MIN_CELL_WIDTH = 190.0f;
    public static final float GRID_SPACING = 20.0f;

    /* renamed from: com.facebook.aura.library.view.HatchGridDetailScreenKt$HatchGridDetailScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $emptySubtitleRes;
        public final /* synthetic */ int $emptyTitleRes;
        public final /* synthetic */ G2j<T, Function0<Unit>, BFM, Integer, Unit> $fileViewer;
        public final /* synthetic */ AHD<T> $gridItems;
        public final /* synthetic */ G0U<T, String> $imageUri;
        public final /* synthetic */ boolean $isEmpty;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isLoadingMore;
        public final /* synthetic */ G0U<T, Object> $itemKey;
        public final /* synthetic */ int $loadingTextRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ G0U<T, AHD<String>> $previewUris;
        public final /* synthetic */ String $title;
        public final /* synthetic */ G0U<T, RecentFile> $toRecentFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, AHD<? extends T> ahd, boolean z, boolean z2, Function0<Unit> function0, G0U<? super T, ? extends Object> g0u, G0U<? super T, RecentFile> g0u2, G0U<? super T, String> g0u3, G0U<? super T, ? extends AHD<String>> g0u4, int i, int i2, int i3, BRg bRg, boolean z3, Function0<Unit> function02, G2j<? super T, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2j, int i4, int i5, int i6) {
            super(2);
            this.$title = str;
            this.$gridItems = ahd;
            this.$isLoading = z;
            this.$isEmpty = z2;
            this.$onBack = function0;
            this.$itemKey = g0u;
            this.$toRecentFile = g0u2;
            this.$imageUri = g0u3;
            this.$previewUris = g0u4;
            this.$loadingTextRes = i;
            this.$emptyTitleRes = i2;
            this.$emptySubtitleRes = i3;
            this.$modifier = bRg;
            this.$isLoadingMore = z3;
            this.$onLoadMore = function02;
            this.$fileViewer = g2j;
            this.$$changed = i4;
            this.$$changed1 = i5;
            this.$$default = i6;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGridDetailScreenKt.HatchGridDetailScreen(this.$title, this.$gridItems, this.$isLoading, this.$isEmpty, this.$onBack, this.$itemKey, this.$toRecentFile, this.$imageUri, this.$previewUris, this.$loadingTextRes, this.$emptyTitleRes, this.$emptySubtitleRes, this.$modifier, this.$isLoadingMore, this.$onLoadMore, this.$fileViewer, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGridDetailScreenKt$LobsterGridEmptyState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $subtitleRes;
        public final /* synthetic */ int $titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, int i2, BRg bRg, int i3, int i4) {
            super(2);
            this.$titleRes = i;
            this.$subtitleRes = i2;
            this.$modifier = bRg;
            this.$$changed = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGridDetailScreenKt.LobsterGridEmptyState(this.$titleRes, this.$subtitleRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchGridDetailScreenKt$LobsterGridLoadingState$2, reason: invalid class name and case insensitive filesystem */
    public final class C123922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $loadingTextRes;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123922(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$loadingTextRes = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGridDetailScreenKt.LobsterGridLoadingState(this.$loadingTextRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void HatchGridDetailScreen(java.lang.String r71, X.AHD<? extends T> r72, boolean r73, boolean r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, X.G0U<? super T, ? extends java.lang.Object> r76, X.G0U<? super T, com.facebook.aura.library.model.RecentFile> r77, X.G0U<? super T, java.lang.String> r78, X.G0U<? super T, ? extends X.AHD<java.lang.String>> r79, int r80, int r81, int r82, X.BRg r83, boolean r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, X.G2j<? super T, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r86, X.BFM r87, int r88, int r89, int r90) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchGridDetailScreenKt.HatchGridDetailScreen(java.lang.String, X.AHD, boolean, boolean, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.G0U, int, int, int, X.BRg, boolean, kotlin.jvm.functions.Function0, X.G2j, X.BFM, int, int, int):void");
    }

    public static final void LobsterGridEmptyState(int i, int i2, BRg bRg, BFM bfm, int i3, int i4) {
        BRg bRg2 = bRg;
        bfm.AgG(1188723665);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        int i5 = i4 & 4;
        if (i5 != 0) {
            iA0D |= 384;
        } else if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0R, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, HatchFileUIUtils.Icons.FILE, 0), AuraIconSize.X_LARGE, null, C06G.A08(bfm), null, bfm, AnonymousClass001.A04(), 33);
            BS0 bs0 = BRg.A00;
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i), null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 4.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, i2, bRg2, i3, i4);
        }
    }

    public static final void LobsterGridLoadingState(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(312359555);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0R, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C1AC c1ac = C2VU.A04;
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A08(C10G.A04(bs0, 16.0f), 16.0f), null, 0L, bfm, 6, 6);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123922(i, bRg2, i2, i3);
        }
    }
}
