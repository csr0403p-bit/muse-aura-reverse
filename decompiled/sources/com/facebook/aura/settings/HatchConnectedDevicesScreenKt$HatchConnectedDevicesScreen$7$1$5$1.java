package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C07C;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.settings.ConnectedDevicesUiState;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$5$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ ConnectedDevicesUiState $state;
    public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectedDevicesUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectedDevicesUiState connectedDevicesUiState) {
            super(3);
            this.$state = connectedDevicesUiState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.None none = AuraCardType.None.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207b1);
                String strA0e = ((ConnectedDevicesUiState.Error) this.$state).message;
                if (strA0e == null) {
                    bfm.AgE(-65567641);
                    strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120ee5);
                } else {
                    AnonymousClass003.A0l(bfm, -65569346);
                }
                ApQ apQA0X = AnonymousClass005.A0X(strA0e);
                C0953AJg c0953AJgA00 = C0953AJg.A00();
                long j = B6A.A07;
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(strA01, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQA0X, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), none, null, null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262128);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$5$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel) {
            super(3);
            this.$viewModel = hatchConnectedDevicesViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207bf);
                C0953AJg c0953AJgA00 = C0953AJg.A00();
                long j = B6A.A07;
                AuraCardContent auraCardContent = new AuraCardContent(strA01, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchConnectedDevicesScreenKt.lambda$1560655414;
                boolean zA67 = bfm.A67(this.$viewModel);
                HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$5$1$2$1$1(hatchConnectedDevicesViewModel);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, clickable, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27654, 0, 262048);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$state), -934145423);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$viewModel), 515759450);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$5$1(ConnectedDevicesUiState connectedDevicesUiState, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel) {
        super(1);
        this.$state = connectedDevicesUiState;
        this.$viewModel = hatchConnectedDevicesViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
