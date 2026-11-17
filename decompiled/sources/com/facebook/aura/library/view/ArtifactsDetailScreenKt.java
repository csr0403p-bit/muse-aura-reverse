package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C0861A6i;
import X.C1BO;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ArtifactsDetailScreenKt {

    /* renamed from: com.facebook.aura.library.view.ArtifactsDetailScreenKt$ArtifactsDetailScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
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
            ArtifactsDetailScreenKt.ArtifactsDetailScreen(this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ArtifactsDetailScreen(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(439919433);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchLibraryViewModel.Factory factory = new HatchLibraryViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((HatchLibraryViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchLibraryViewModel.class))).uiState);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string.library_artifacts);
            boolean zA65 = bfm.A65(((HatchLibraryViewModel.UiState) c1boA02.getValue()).artifacts);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0z(bfm, ((HatchLibraryViewModel.UiState) c1boA02.getValue()).artifacts);
            }
            AHD ahd = (AHD) objAaT;
            if (((HatchLibraryViewModel.UiState) c1boA02.getValue()).loadingState != LoadingState.LOADING && ((HatchLibraryViewModel.UiState) c1boA02.getValue()).loadingState != LoadingState.INITIAL) {
                z = false;
            }
            boolean zIsEmpty = ((HatchLibraryViewModel.UiState) c1boA02.getValue()).artifacts.isEmpty();
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = ArtifactsDetailScreenKt$ArtifactsDetailScreen$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = ArtifactsDetailScreenKt$ArtifactsDetailScreen$3$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            G0U g0u2 = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = ArtifactsDetailScreenKt$ArtifactsDetailScreen$4$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            G0U g0u3 = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = ArtifactsDetailScreenKt$ArtifactsDetailScreen$5$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            HatchGridDetailScreenKt.HatchGridDetailScreen(strA01, ahd, z, zIsEmpty, function0, g0u, g0u2, g0u3, (G0U) objAaT5, R.string._name_removed__res_0x7f120c5e, R.string._name_removed__res_0x7f120c5c, R.string._name_removed__res_0x7f120c5b, bRg2, false, null, ComposableSingletons$ArtifactsDetailScreenKt.f68lambda$875524665, bfm, AnonymousClass001.A0B(iA0T << 12, (ArtifactFile.$stable << 3) | 115015680), ((iA0T << 3) & 896) | 196608, RuntimeInternals.IOPRIO_BACKGROUND);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(function0, bRg2, i, i2);
        }
    }
}
