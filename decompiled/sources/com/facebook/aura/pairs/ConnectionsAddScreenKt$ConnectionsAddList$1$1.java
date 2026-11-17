package com.facebook.aura.pairs;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C1BO;
import X.C3U4;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.pairs.ConnectionsUiState;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectionsAddScreenKt$ConnectionsAddList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasTyped$delegate;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ C1BO<AHD<PairsSuggestion>> $people$delegate;
    public final /* synthetic */ C1BO<String> $query$delegate;
    public final /* synthetic */ ConnectionsUiState.Loaded $state;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddList$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $hasTyped$delegate;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<String> $query$delegate;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA08 = C1BO.A08(this.$query$delegate);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120818);
            long jAdaptiveFill = AuraAdaptiveColorsKt.adaptiveFill(C3cH.A0W(bfm), bfm, AuraColors.$stable);
            long j = B6A.A06;
            BRg bRgA0C = C3U4.A0C(BRg.A00, 16.0f, 0.0f, 16.0f, 8.0f);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1T(bfm, this.$log, bfm.A65(this.$hasTyped$delegate)));
            ConnectionsLogContext connectionsLogContext = this.$log;
            ConnectionsViewModel connectionsViewModel = this.$viewModel;
            MutableState<Boolean> mutableState = this.$hasTyped$delegate;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new ConnectionsAddScreenKt$ConnectionsAddList$1$1$1$1$1(connectionsLogContext, connectionsViewModel, mutableState);
                bfm.Ai0(objAaT);
            }
            ConnectionsComponentsKt.m1651PairsSearchFieldwBJOh4Y(strA08, (G0U) objAaT, bRgA0C, strA01, jAdaptiveFill, j, bfm, 196992, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState, ConnectionsLogContext connectionsLogContext, ConnectionsViewModel connectionsViewModel, C1BO<String> c1bo) {
            super(3);
            this.$hasTyped$delegate = mutableState;
            this.$log = connectionsLogContext;
            this.$viewModel = connectionsViewModel;
            this.$query$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ(AuraDeeplinkRouteMapper.SEARCH_ROUTE, null, B1V.A01(new AnonymousClass1(this.$hasTyped$delegate, this.$log, this.$viewModel, this.$query$delegate), 953644999, true));
        final AHD<PairsSuggestion> value = this.$people$delegate.getValue();
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final ConnectionsLogContext connectionsLogContext = this.$log;
        final ConnectionsUiState.Loaded loaded = this.$state;
        final ConnectionsViewModel connectionsViewModel = this.$viewModel;
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddList$1$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), value, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddList$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                value.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                value.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddList$1$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                int i3 = iA0d & 126;
                PairsSuggestion pairsSuggestion = (PairsSuggestion) value.get(i);
                bfm.AgE(-1208021690);
                ConnectionsLogContext connectionsLogContext2 = connectionsLogContext;
                boolean zContains = loaded.sentIds.contains(pairsSuggestion.id);
                boolean zContains2 = loaded.busyIds.contains(pairsSuggestion.id);
                boolean zA67 = bfm.A67(connectionsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConnectionsAddScreenKt$ConnectionsAddList$1$1$3$1$1(connectionsViewModel);
                    bfm.Ai0(objAaT);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
                boolean zA672 = bfm.A67(connectionsViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsAddScreenKt$ConnectionsAddList$1$1$3$2$1(connectionsViewModel);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u2 = (G0U) ((InterfaceC7353EnQ) objAaT2);
                boolean zA673 = bfm.A67(connectionsViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConnectionsAddScreenKt$ConnectionsAddList$1$1$3$3$1(connectionsViewModel);
                    bfm.Ai0(objAaT3);
                }
                ConnectionsComponentsKt.ConnectionsSuggestionRow(pairsSuggestion, connectionsLogContext2, i, zContains, zContains2, g0u, g0u2, (G0U) ((InterfaceC7353EnQ) objAaT3), null, bfm, PairsSuggestion.$stable | (ConnectionsLogContext.$stable << 3) | ((i3 << 3) & 896), 256);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), value.size());
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Integer, PairsSuggestion, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, PairsSuggestion pairsSuggestion) {
            AnonymousClass005.A0w(num);
            PairsSuggestion pairsSuggestion2 = pairsSuggestion;
            C7384Etj.A0Y(pairsSuggestion2, 1);
            return pairsSuggestion2.id;
        }

        public final Object invoke(int i, PairsSuggestion pairsSuggestion) {
            C7384Etj.A0Y(pairsSuggestion, 1);
            return pairsSuggestion.id;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsAddScreenKt$ConnectionsAddList$1$1(MutableState<Boolean> mutableState, ConnectionsLogContext connectionsLogContext, ConnectionsViewModel connectionsViewModel, C1BO<String> c1bo, C1BO<? extends AHD<PairsSuggestion>> c1bo2, ConnectionsUiState.Loaded loaded) {
        super(1);
        this.$hasTyped$delegate = mutableState;
        this.$log = connectionsLogContext;
        this.$viewModel = connectionsViewModel;
        this.$query$delegate = c1bo;
        this.$people$delegate = c1bo2;
        this.$state = loaded;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
