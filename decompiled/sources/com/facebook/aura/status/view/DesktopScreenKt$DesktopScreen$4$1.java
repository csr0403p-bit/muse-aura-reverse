package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.C0CD;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.G2j;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.status.viewmodel.DesktopUiState;
import com.facebook.aura.status.viewmodel.DesktopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DesktopScreenKt$DesktopScreen$4$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ C1BO<Boolean> $isLeasing$delegate;
    public final /* synthetic */ DesktopUiState $state;
    public final /* synthetic */ DesktopViewModel $viewModel;

    /* renamed from: com.facebook.aura.status.view.DesktopScreenKt$DesktopScreen$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Boolean> $isLeasing$delegate;
        public final /* synthetic */ DesktopUiState $state;
        public final /* synthetic */ DesktopViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DesktopUiState desktopUiState, DesktopViewModel desktopViewModel, C1BO<Boolean> c1bo) {
            super(3);
            this.$state = desktopUiState;
            this.$viewModel = desktopViewModel;
            this.$isLeasing$delegate = c1bo;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            int size = ((DesktopUiState.Loaded) this.$state).tasks.size();
            boolean zA0F = C1BO.A0F(this.$isLeasing$delegate);
            boolean zA67 = bfm.A67(this.$viewModel);
            DesktopViewModel desktopViewModel = this.$viewModel;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new DesktopScreenKt$DesktopScreen$4$1$1$1$1(desktopViewModel);
                bfm.Ai0(objAaT);
            }
            DesktopScreenKt.BrowserTaskListHeader(size, zA0F, (Function0) objAaT, null, bfm, 0, 8);
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
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass1(this.$state, this.$viewModel, this.$isLeasing$delegate), 1703914103, true));
        final AHD<BrowserTaskPresentation> ahd = ((DesktopUiState.Loaded) this.$state).tasks;
        final DesktopViewModel desktopViewModel = this.$viewModel;
        final DesktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$1 desktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.status.view.DesktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(BrowserTaskPresentation browserTaskPresentation) {
                return null;
            }
        };
        c0cd.APL(null, new G0U<Integer, Object>() { // from class: com.facebook.aura.status.view.DesktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return desktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$1.invoke(ahd.get(i));
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.status.view.DesktopScreenKt$DesktopScreen$4$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                BrowserTaskPresentation browserTaskPresentation = (BrowserTaskPresentation) ahd.get(i);
                bfm.AgE(-2024144302);
                boolean zA1M = AnonymousClass003.A1M(bfm, desktopViewModel, browserTaskPresentation);
                Object objAaT = bfm.AaT();
                if (zA1M || objAaT == C78N.A00) {
                    objAaT = new DesktopScreenKt$DesktopScreen$4$1$2$1$1(desktopViewModel, browserTaskPresentation);
                    bfm.Ai0(objAaT);
                }
                DesktopScreenKt.BrowserTaskRow(browserTaskPresentation, (Function0) objAaT, null, bfm, BrowserTaskPresentation.$stable, 4);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DesktopScreenKt$DesktopScreen$4$1(DesktopUiState desktopUiState, DesktopViewModel desktopViewModel, C1BO<Boolean> c1bo) {
        super(1);
        this.$state = desktopUiState;
        this.$viewModel = desktopViewModel;
        this.$isLeasing$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
