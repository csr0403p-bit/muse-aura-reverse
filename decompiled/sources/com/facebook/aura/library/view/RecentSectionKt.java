package com.facebook.aura.library.view;

import X.AHD;
import X.AKQ;
import X.AZ3;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C1515AkP;
import X.C1DP;
import X.C1YY;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.model.RecentFile;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class RecentSectionKt {

    /* renamed from: com.facebook.aura.library.view.RecentSectionKt$RecentEmptyState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            RecentSectionKt.RecentEmptyState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.RecentSectionKt$RecentErrorState$2, reason: invalid class name and case insensitive filesystem */
    public final class C124012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124012(BRg bRg, int i, int i2) {
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
            RecentSectionKt.RecentErrorState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.RecentSectionKt$RecentLoadingState$2, reason: invalid class name and case insensitive filesystem */
    public final class C124022 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124022(BRg bRg, int i, int i2) {
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
            RecentSectionKt.RecentLoadingState(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.RecentSectionKt$RecentSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoadingMore;
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ G0U<RecentFile, Unit> $onRecentItemClick;
        public final /* synthetic */ Function0<Unit> $onSeeAllClick;
        public final /* synthetic */ AHD<RecentFile> $recentFiles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AHD<RecentFile> ahd, LoadingState loadingState, G0U<? super RecentFile, Unit> g0u, Function0<Unit> function0, BRg bRg, boolean z, Function0<Unit> function02, int i, int i2) {
            super(2);
            this.$recentFiles = ahd;
            this.$loadingState = loadingState;
            this.$onRecentItemClick = g0u;
            this.$onSeeAllClick = function0;
            this.$modifier = bRg;
            this.$isLoadingMore = z;
            this.$onLoadMore = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            RecentSectionKt.RecentSection(this.$recentFiles, this.$loadingState, this.$onRecentItemClick, this.$onSeeAllClick, this.$modifier, this.$isLoadingMore, this.$onLoadMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void RecentEmptyState(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1062367028);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c72);
            BS0 bs0 = BRg.A00;
            SectionHeaderKt.SectionHeader(strA01, AbstractC07539Wl.A00(bs0, "hatch-section-recent"), null, null, bfm, 48, 12);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c73), C3U4.A05(bs0, C06G.A00(bfm)), C06G.A09(bfm), C06G.A0T(bfm), null, null, null, false, 0, 2, 0, null, null, null, bfm, 805306368, 0, 15856);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final void RecentErrorState(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1575729913);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c72);
            BS0 bs0 = BRg.A00;
            SectionHeaderKt.SectionHeader(strA01, AbstractC07539Wl.A00(bs0, "hatch-section-recent"), null, null, bfm, 48, 12);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c74), C3U4.A05(bs0, C06G.A00(bfm)), C06G.A09(bfm), C06G.A0T(bfm), null, null, null, false, 0, 2, 0, null, null, null, bfm, 805306368, 0, 15856);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C124012(bRg2, i, i2);
        }
    }

    public static final void RecentLoadingState(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1820900229);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c72);
            BS0 bs0 = BRg.A00;
            SectionHeaderKt.SectionHeader(strA01, AbstractC07539Wl.A00(bs0, "hatch-section-recent"), null, null, bfm, 48, 12);
            float f = AuraDimensKt.SpacingSmall;
            C01N.A08(bfm, bs0, f);
            BRg bRgA0M = C06G.A0M(bfm, bs0);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0M);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AnonymousClass007.A0u(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c75), null, C06G.A09(bfm), C06G.A0T(bfm), null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C124022(bRg2, i, i2);
        }
    }

    public static final void RecentSection(AHD<RecentFile> ahd, LoadingState loadingState, G0U<? super RecentFile, Unit> g0u, Function0<Unit> function0, BRg bRg, boolean z, Function0<Unit> function02, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean z2 = z;
        Function0<Unit> function03 = function02;
        boolean zA1Z = AnonymousClass005.A1Z(ahd, loadingState, g0u);
        C7384Etj.A0Y(function0, 3);
        bfm.AgG(-1256730561);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, loadingState);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRgA0Q);
        }
        int i4 = i2 & 32;
        int iA0s = 196608;
        if (i4 != 0) {
            iA05 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z2);
            iA05 |= iA0s;
        }
        int i5 = i2 & 64;
        int iA0Z = 1572864;
        if (i5 != 0) {
            iA05 |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, function03);
            iA05 |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = RecentSectionKt$RecentSection$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function03 = (Function0) objAaT;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (!ahd.isEmpty()) {
                bfm.AgE(-1830277229);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c72);
                BS0 bs0 = BRg.A00;
                SectionHeaderKt.SectionHeader(strA01, AbstractC07539Wl.A00(bs0, "hatch-section-recent"), HatchComponent.LIBRARY_SECTION_RECENT, function0, bfm, (iA05 & 7168) | 432, 0);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmallPlusNano);
                LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
                float fA00 = C06G.A00(bfm);
                C1DP c1dp = new C1DP(fA00, 0.0f, fA00, 0.0f);
                C9m9 c9m9A00 = AcQ.A00(10.0f);
                boolean zA1K = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(ahd))) | AnonymousClass004.A1K(iA05) | AnonymousClass007.A1H(iA05);
                Object objAaT2 = bfm.AaT();
                if (zA1K || objAaT2 == C78N.A00) {
                    objAaT2 = new RecentSectionKt$RecentSection$2$1$1(ahd, z2, g0u);
                    bfm.Ai0(objAaT2);
                }
                C1YY.A00(null, null, c9m9A00, c1dp, lazyListStateA00, bfm, null, null, (G0U) objAaT2, RuntimeInternals.IOPRIO_BACKGROUND, 489, false, false);
                boolean zA1Y = AnonymousClass006.A1Y(iA05, 3670016);
                Object objAaT3 = bfm.AaT();
                if (zA1Y || objAaT3 == C78N.A00) {
                    objAaT3 = new RecentSectionKt$RecentSection$2$2$1(function03);
                    bfm.Ai0(objAaT3);
                }
                AutoLoadMoreKt.AutoLoadMore(lazyListStateA00, 0, (Function0<Unit>) objAaT3, bfm, 0, zA1Z ? 1 : 0);
            } else if (loadingState == LoadingState.ERROR) {
                bfm.AgE(-1828914035);
                RecentErrorState(null, bfm, 0, zA1Z ? 1 : 0);
            } else if (loadingState == LoadingState.LOADING || loadingState == LoadingState.INITIAL) {
                bfm.AgE(-1828794933);
                RecentLoadingState(null, bfm, 0, zA1Z ? 1 : 0);
            } else {
                bfm.AgE(-1828755315);
                RecentEmptyState(null, bfm, 0, zA1Z ? 1 : 0);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(ahd, loadingState, g0u, function0, bRgA0Q, z2, function03, i, i2);
        }
    }
}
