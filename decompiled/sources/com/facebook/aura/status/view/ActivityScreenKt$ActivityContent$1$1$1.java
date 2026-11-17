package com.facebook.aura.status.view;

import X.AHD;
import X.AHI;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0CD;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import com.facebook.aura.status.viewmodel.HatchSubAgentUiModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityContent$1$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AHD<ActivityViewModel.DayGroupUiModel> $dayGroups;
    public final /* synthetic */ boolean $hasMore;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $header;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ String $nextCursor;
    public final /* synthetic */ G0U<ActivityAction, Unit> $onActionClick;
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ G0U<String, Unit> $onToggleDay;
    public final /* synthetic */ AHD<HatchSubAgentUiModel> $subAgents;

    /* renamed from: com.facebook.aura.status.view.ActivityScreenKt$ActivityContent$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $header;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$header = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$header, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityScreenKt$ActivityContent$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<ActivityViewModel.DayGroupUiModel, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(ActivityViewModel.DayGroupUiModel dayGroupUiModel) {
            ActivityViewModel.DayGroupUiModel dayGroupUiModel2 = dayGroupUiModel;
            C7384Etj.A0Y(dayGroupUiModel2, 0);
            return dayGroupUiModel2.dateKey;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ActivityViewModel.DayGroupUiModel dayGroupUiModel) {
            C7384Etj.A0Y(dayGroupUiModel, 0);
            return dayGroupUiModel.dateKey;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityScreenKt$ActivityContent$1$1$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoadingMore;
        public final /* synthetic */ int $loadedActivityCount;
        public final /* synthetic */ String $nextCursor;
        public final /* synthetic */ Function0<Unit> $onLoadMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i, String str, Function0<Unit> function0, boolean z) {
            super(3);
            this.$loadedActivityCount = i;
            this.$nextCursor = str;
            this.$onLoadMore = function0;
            this.$isLoadingMore = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                Integer numValueOf = Integer.valueOf(this.$loadedActivityCount);
                String str = this.$nextCursor;
                boolean zA65 = bfm.A65(this.$onLoadMore);
                Function0<Unit> function0 = this.$onLoadMore;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new ActivityScreenKt$ActivityContent$1$1$1$4$1$1(function0, null);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A1A(bfm, objAaT, numValueOf, str);
                if (this.$isLoadingMore) {
                    bfm.AgE(99510000);
                    BRg bRgA09 = C3U4.A09(C10G.A02, AuraDimensKt.SpacingMedium);
                    InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA09);
                    Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(99717576);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        G0V<BFM, Integer, Unit> g0v = this.$header;
        if (g0v != null) {
            c0cd.APJ("activity_header", null, B1V.A01(new AnonymousClass1(g0v), -23105263, true));
        }
        final AHD<ActivityViewModel.DayGroupUiModel> ahd = this.$dayGroups;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final AHD<HatchSubAgentUiModel> ahd2 = this.$subAgents;
        final G0U<ActivityAction, Unit> g0u = this.$onActionClick;
        final G0U<String, Unit> g0u2 = this.$onToggleDay;
        final ActivityScreenKt$ActivityContent$1$1$1$invoke$$inlined$items$default$1 activityScreenKt$ActivityContent$1$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.status.view.ActivityScreenKt$ActivityContent$1$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(ActivityViewModel.DayGroupUiModel dayGroupUiModel) {
                return null;
            }
        };
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.status.view.ActivityScreenKt$ActivityContent$1$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.status.view.ActivityScreenKt$ActivityContent$1$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, activityScreenKt$ActivityContent$1$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.status.view.ActivityScreenKt$ActivityContent$1$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ActivityViewModel.DayGroupUiModel dayGroupUiModel = (ActivityViewModel.DayGroupUiModel) ahd.get(i);
                bfm.AgE(327479476);
                AHD ahd3 = C7384Etj.areEqual(dayGroupUiModel, AbstractC0878AGe.A0G(ahd)) ? ahd2 : AHI.A01;
                G0U g0u3 = g0u;
                Function0 function0 = null;
                BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "hatch-activity-day-card");
                if (g0u2 == null) {
                    bfm.AgE(327790497);
                } else {
                    bfm.AgE(327790498);
                    G0U g0u4 = g0u2;
                    boolean zA1J = AnonymousClass003.A1J(bfm, g0u4, dayGroupUiModel);
                    Object objAaT = bfm.AaT();
                    if (zA1J || objAaT == C78N.A00) {
                        objAaT = new ActivityScreenKt$ActivityContent$1$1$1$3$1$1$1(g0u4, dayGroupUiModel);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                ActivityScreenKt.ActivityDaySection(dayGroupUiModel, ahd3, g0u3, bRgA00, function0, bfm, 3072, 0);
                BBI.A0R(bbi, false);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), ahd.size());
        if (this.$hasMore) {
            Iterator it = this.$dayGroups.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((ActivityViewModel.DayGroupUiModel) it.next()).itemCount;
            }
            c0cd.APJ(FGI.A0H("load_more_sentinel_", i), null, B1V.A01(new AnonymousClass4(i, this.$nextCursor, this.$onLoadMore, this.$isLoadingMore), 887225274, true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityScreenKt$ActivityContent$1$1$1(G0V<? super BFM, ? super Integer, Unit> g0v, AHD<ActivityViewModel.DayGroupUiModel> ahd, boolean z, AHD<HatchSubAgentUiModel> ahd2, G0U<? super ActivityAction, Unit> g0u, G0U<? super String, Unit> g0u2, String str, Function0<Unit> function0, boolean z2) {
        super(1);
        this.$header = g0v;
        this.$dayGroups = ahd;
        this.$hasMore = z;
        this.$subAgents = ahd2;
        this.$onActionClick = g0u;
        this.$onToggleDay = g0u2;
        this.$nextCursor = str;
        this.$onLoadMore = function0;
        this.$isLoadingMore = z2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
