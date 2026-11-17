package com.facebook.aura.hotels;

import X.AKO;
import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BIj;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DD;
import X.C1DG;
import X.C1DP;
import X.C1YZ;
import X.C2VU;
import X.C3TQ;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.hotels.HotelLoadState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.adaptive.AuraGridKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HotelResultsScreenKt {

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelCollectionHeading$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsScreenKt.HotelCollectionHeading(this.$title, this.$summary, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelResultsCollection $collection;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ C3TQ $padding;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HotelResultsCollection hotelResultsCollection, String str, Function0<Unit> function0, C3TQ c3tq, BRg bRg, int i, int i2) {
            super(2);
            this.$collection = hotelResultsCollection;
            this.$sessionId = str;
            this.$onRetry = function0;
            this.$padding = c3tq;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsScreenKt.HotelResultsGrid(this.$collection, this.$sessionId, this.$onRetry, this.$padding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsGrid$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelResultsCollection $collection;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ C3TQ $padding;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HotelResultsCollection hotelResultsCollection, String str, Function0<Unit> function0, C3TQ c3tq, BRg bRg, int i, int i2) {
            super(2);
            this.$collection = hotelResultsCollection;
            this.$sessionId = str;
            this.$onRetry = function0;
            this.$padding = c3tq;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsScreenKt.HotelResultsGrid(this.$collection, this.$sessionId, this.$onRetry, this.$padding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C122003 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C00r $headingHeightPx$delegate;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122003(String str, String str2, C00r c00r) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$headingHeightPx$delegate = c00r;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            String str = this.$title;
            String str2 = this.$summary;
            BS0 bs0 = BRg.A00;
            C00r c00r = this.$headingHeightPx$delegate;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new HotelResultsScreenKt$HotelResultsScreen$3$1$1(c00r);
                BBI.A0T(bfm, objAaT);
            }
            HotelResultsScreenKt.HotelCollectionHeading(str, str2, BIj.A00(bs0, (G0U) objAaT), bfm, 384, 0);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HotelResultsScreenKey $key;
        public final /* synthetic */ HotelResultsViewModel $model;
        public final /* synthetic */ C1BO<HotelLoadState<HotelResultsCollection>> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HotelResultsViewModel hotelResultsViewModel, HotelResultsScreenKey hotelResultsScreenKey, C1BO<? extends HotelLoadState<HotelResultsCollection>> c1bo) {
            super(4);
            this.$model = hotelResultsViewModel;
            this.$key = hotelResultsScreenKey;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1084invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1084invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            HotelLoadState<HotelResultsCollection> value = this.$state$delegate.getValue();
            if (C7384Etj.areEqual(value, HotelLoadState.Loading.INSTANCE)) {
                bfm.AgE(-1698012829);
                HotelLoadingStateKt.HotelLoadingState(C3U4.A04(C10G.A01, f), bfm, 0, 0);
            } else if (C7384Etj.areEqual(value, HotelLoadState.Failed.INSTANCE) || C7384Etj.areEqual(value, HotelLoadState.Unavailable.INSTANCE)) {
                bfm.AgE(-1698007948);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120349);
                boolean zA67 = bfm.A67(this.$model);
                HotelResultsViewModel hotelResultsViewModel = this.$model;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HotelResultsScreenKt$HotelResultsScreen$4$1$1(hotelResultsViewModel);
                    BBI.A0T(bfm, objAaT);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) objAaT, C3U4.A04(C10G.A01, f), null, null, null, null, bfm, 0, 120);
            } else {
                if (!(value instanceof HotelLoadState.Loaded)) {
                    throw AnonymousClass005.A0k(bfm, -1698014387);
                }
                bfm.AgE(-1697998552);
                HotelResultsCollection hotelResultsCollection = (HotelResultsCollection) ((HotelLoadState.Loaded) value).value;
                String str = this.$key.sessionId;
                boolean zA672 = bfm.A67(this.$model);
                HotelResultsViewModel hotelResultsViewModel2 = this.$model;
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new HotelResultsScreenKt$HotelResultsScreen$4$2$1(hotelResultsViewModel2);
                    BBI.A0T(bfm, objAaT2);
                }
                HotelResultsScreenKt.HotelResultsGrid(hotelResultsCollection, str, (Function0) objAaT2, new C1DP(16.0f, f, 16.0f, f2), null, bfm, 0, 16);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelResultsScreenKt$HotelResultsScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelResultsScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HotelResultsScreenKey hotelResultsScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = hotelResultsScreenKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelResultsScreenKt.HotelResultsScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HotelCollectionHeading(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1250356340);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(bRg2, 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HotelResultsScreenKt$HotelCollectionHeading$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bs0, (G0U) objAaT, false), 0L, c1822ArmA0D, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16308);
            if (str2.length() > 0) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 580897501).caption1Regular, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16306);
            } else {
                bfm.AgE(581088740);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, i, i2);
        }
    }

    public static final void HotelResultsGrid(HotelResultsCollection hotelResultsCollection, String str, Function0<Unit> function0, C3TQ c3tq, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        BRg bRg2 = bRg;
        bfm.AgG(-229999760);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hotelResultsCollection) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c3tq);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (hotelResultsCollection.entries.isEmpty()) {
                bfm.AgE(-1449795108);
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120347), null, C3U4.A0D(AnonymousClass001.A0T(bRg2), c3tq), null, null, null, null, bfm, 0, 122);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(hotelResultsCollection, str, function0, c3tq, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -1449620206);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbiA0M);
            C1DD c1dd = new C1DD(AuraGridKt.m2362auraGridColumnsWMci_g0(2, 180.0f, 0.0f, bfm, 54, 4));
            C9m9 c9m9A00 = AcQ.A00(16.0f);
            C9m9 c9m9A002 = AcQ.A00(20.0f);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA05, AnonymousClass003.A1B(iA0d), AnonymousClass004.A1K(iA0d)) | ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HotelResultsScreenKt$HotelResultsGrid$2$1(hotelResultsCollection, function0, auraNavigatorA05, str);
                BBI.A0O(bbiA0M, objAaT);
            }
            C1YZ.A00(null, null, c9m9A00, c9m9A002, c3tq, c1dd, null, bfm, bRgA0T, (G0U) objAaT, (iA0d & 7168) | 1769472, 0, 916, false, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(hotelResultsCollection, str, function0, c3tq, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HotelResultsScreen(com.facebook.aura.hotels.HotelResultsScreenKey r53, X.BRg r54, X.BFM r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelResultsScreenKt.HotelResultsScreen(com.facebook.aura.hotels.HotelResultsScreenKey, X.BRg, X.BFM, int, int):void");
    }

    public static final /* synthetic */ HotelLoadState access$HotelResultsScreen$lambda$0(C1BO c1bo) {
        return (HotelLoadState) c1bo.getValue();
    }
}
