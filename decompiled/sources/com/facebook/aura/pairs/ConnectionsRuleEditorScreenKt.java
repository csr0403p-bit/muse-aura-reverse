package com.facebook.aura.pairs;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DM;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsRuleEditorSheetKey;
import com.facebook.aura.pairs.ConnectionsRuleEditorViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsRuleEditorScreenKt {

    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleConflictBanner$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $canUseSaved;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onUseSaved;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$canUseSaved = z;
            this.$onUseSaved = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsRuleEditorScreenKt.ConnectionsRuleConflictBanner(this.$canUseSaved, this.$onUseSaved, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleDeleteButton$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(boolean z, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$log = connectionsLogContext;
            this.$onConfirm = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsRuleEditorScreenKt.ConnectionsRuleDeleteButton(this.$enabled, this.$log, this.$onConfirm, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C128292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectionsRuleEditorUiState $uiState;
        public final /* synthetic */ ConnectionsRuleEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128292(ConnectionsRuleEditorUiState connectionsRuleEditorUiState, ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = connectionsRuleEditorUiState;
            this.$viewModel = connectionsRuleEditorViewModel;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsRuleEditorScreenKt.ConnectionsRuleEditorFooter(this.$uiState, this.$viewModel, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$2, reason: invalid class name and case insensitive filesystem */
    public final class C128302 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectionsRuleEditorUiState $uiState;
        public final /* synthetic */ ConnectionsRuleEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128302(ConnectionsRuleEditorUiState connectionsRuleEditorUiState, ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = connectionsRuleEditorUiState;
            this.$viewModel = connectionsRuleEditorViewModel;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsRuleEditorScreenKt.ConnectionsRuleEditorForm(this.$uiState, this.$viewModel, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<ConnectionsRuleEditorUiState> $uiState$delegate;
        public final /* synthetic */ ConnectionsRuleEditorViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel, ConnectionsLogContext connectionsLogContext, C1BO<ConnectionsRuleEditorUiState> c1bo) {
            super(2);
            this.$viewModel = connectionsRuleEditorViewModel;
            this.$log = connectionsLogContext;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ConnectionsRuleEditorScreenKt.ConnectionsRuleEditorFooter(this.$uiState$delegate.getValue(), this.$viewModel, this.$log, null, bfm, ConnectionsRuleEditorUiState.$stable | (ConnectionsRuleEditorViewModel.$stable << 3) | (ConnectionsLogContext.$stable << 6), 8);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<ConnectionsRuleEditorUiState> $uiState$delegate;
        public final /* synthetic */ ConnectionsRuleEditorViewModel $viewModel;

        /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorScreen$4$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConnectionsRuleEditorPhase.values().length];
                try {
                    AnonymousClass002.A13(ConnectionsRuleEditorPhase.READY, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ConnectionsRuleEditorPhase.FAILED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ConnectionsRuleEditorPhase.MISSING, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(ConnectionsRuleEditorPhase.LOADING, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(ConnectionsRuleEditorPhase.DONE, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel, ConnectionsLogContext connectionsLogContext, C1BO<ConnectionsRuleEditorUiState> c1bo) {
            super(3);
            this.$viewModel = connectionsRuleEditorViewModel;
            this.$log = connectionsLogContext;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(c07c, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c07c);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            int iOrdinal = this.$uiState$delegate.getValue().phase.ordinal();
            if (iOrdinal == 1) {
                bfm.AgE(-228211473);
                ConnectionsRuleEditorUiState value = this.$uiState$delegate.getValue();
                ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel = this.$viewModel;
                ConnectionsLogContext connectionsLogContext = this.$log;
                BRg bRgAiP = c07c.AiP(BRg.A00, 1.0f, true);
                HatchComponent hatchComponent = HatchComponent.CONNECTIONS_SCREEN_VIEW;
                int i2 = ConnectionsLogContext.$stable;
                ConnectionsRuleEditorScreenKt.ConnectionsRuleEditorForm(value, connectionsRuleEditorViewModel, connectionsLogContext, bRgAiP.then(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, hatchComponent, null, null, null, null, bfm, i2 | 48, 60)), bfm, ConnectionsRuleEditorUiState.$stable | (ConnectionsRuleEditorViewModel.$stable << 3) | (i2 << 6), 0);
            } else if (iOrdinal == 2) {
                bfm.AgE(-228202961);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120812);
                BRg bRgThen = c07c.AiP(BRg.A00, 1.0f, true).then(PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_ERROR_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60));
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                ConnectionsLogContext connectionsLogContext2 = this.$log;
                ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel2 = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorScreen$4$1$1(connectionsLogContext2, connectionsRuleEditorViewModel2);
                    bfm.Ai0(objAaT);
                }
                PairsComponentsKt.PairsMessage(strA01, bRgThen, (Function0) objAaT, bfm, 0, 0);
            } else if (iOrdinal == 3) {
                bfm.AgE(-228188716);
                PairsComponentsKt.PairsMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120813), c07c.AiP(BRg.A00, 1.0f, true), null, bfm, 0, 4);
            } else {
                if (iOrdinal != 0 && iOrdinal != 4) {
                    throw AnonymousClass005.A0k(bfm, -228213021);
                }
                PairsComponentsKt.PairsLoading(c07c.AiP(C3cG.A09(bfm, -228181438), 1.0f, true), bfm, 0, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorScreen$5, reason: invalid class name and case insensitive filesystem */
    public final class C128315 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsRuleEditorSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128315(ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = connectionsRuleEditorSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsRuleEditorScreenKt.ConnectionsRuleEditorScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ConnectionsRuleConflictBanner(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2000170815);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0H = C60R.A0H(bRgA0R, auraTheme.getShapes(bfm, 6).large, C60R.A04(bfm, auraTheme));
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 8.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0H);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            int i4 = R.string._name_removed__res_0x7f120810;
            if (z) {
                i4 = R.string._name_removed__res_0x7f12080f;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i4), null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (z) {
                bfm.AgE(-1751728846);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120817), null, null, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, (iA0n << 9) & 57344, 0, 134201325);
            } else {
                bfm.AgE(-1751549139);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsRuleDeleteButton(boolean z, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1665526958);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207fd);
            AuraLabelButtonStyle auraLabelButtonStyleA0g = AnonymousClass006.A0g(bfm);
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 44.0f);
            int i4 = iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z2 = i4 == 32 || ((iA0n & 64) != 0 && bfm.A67(connectionsLogContext));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == obj) {
                objAaT2 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleDeleteButton$1$1(connectionsLogContext, mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0U, auraLabelButtonStyleA0g, null, null, false, false, z, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, (iA0n << 27) & 1879048192, 0, 0, 134200805);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(2044146038);
                PairsConfirmation pairsConfirmationA0S = C60R.A0S(bfm, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207ff), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207fe), R.string._name_removed__res_0x7f120811);
                boolean zA1K = AnonymousClass004.A1K(iA0n) | (i4 == 32 || ((iA0n & 64) != 0 && bfm.A67(connectionsLogContext)));
                Object objAaT3 = bfm.AaT();
                if (zA1K || objAaT3 == obj) {
                    objAaT3 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleDeleteButton$2$1(connectionsLogContext, function0, mutableState);
                    bfm.Ai0(objAaT3);
                }
                Function0 function02 = (Function0) objAaT3;
                boolean z3 = i4 == 32 || ((iA0n & 64) != 0 && bfm.A67(connectionsLogContext));
                Object objAaT4 = bfm.AaT();
                if (z3 || objAaT4 == obj) {
                    objAaT4 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleDeleteButton$3$1(connectionsLogContext, mutableState);
                    bfm.Ai0(objAaT4);
                }
                Function0 function03 = (Function0) objAaT4;
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == obj) {
                    objAaT5 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleDeleteButton$4$1(mutableState);
                    bfm.Ai0(objAaT5);
                }
                PairsComponentsKt.PairsConfirmationDialog(pairsConfirmationA0S, function02, function03, (Function0) objAaT5, null, bfm, PairsConfirmation.$stable | 3072, 16);
            } else {
                bfm.AgE(2044970576);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(z, connectionsLogContext, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsRuleEditorFooter(ConnectionsRuleEditorUiState connectionsRuleEditorUiState, ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Y;
        BRg bRg2 = bRg;
        bfm.AgG(-711936036);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsRuleEditorUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsRuleEditorViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207fb);
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), 24.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA02);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120815);
            boolean canSave = connectionsRuleEditorUiState.getCanSave();
            boolean z = connectionsRuleEditorUiState.isBusy;
            if (connectionsRuleEditorUiState.needsConfirmation) {
                BS0 bs0A09 = C3cG.A09(bfm, 418383998);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorFooter$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                bRgA0Y = AnonymousClass001.A0Y(bs0A09, objAaT, false);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(418385946);
                BBI.A0R(bbi, false);
                bRgA0Y = BRg.A00;
            }
            boolean z2 = (iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext));
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z3 = z2 | (i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsRuleEditorViewModel)));
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorFooter$1$2$1(connectionsLogContext, connectionsRuleEditorViewModel);
                bfm.Ai0(objAaT2);
            }
            boolean z4 = false;
            PairsComponentsKt.PairsPrimaryButton(strA012, (Function0) objAaT2, bRgA0Y, canSave, z, bfm, 0, 0);
            if (connectionsRuleEditorUiState.isNew) {
                bfm.AgE(85249680);
            } else {
                bfm.AgE(85106491);
                boolean z5 = !connectionsRuleEditorUiState.isBusy;
                if (i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsRuleEditorViewModel))) {
                    z4 = true;
                }
                Object objAaT3 = bfm.AaT();
                if (z4 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorFooter$1$3$1(connectionsRuleEditorViewModel);
                    bfm.Ai0(objAaT3);
                }
                ConnectionsRuleDeleteButton(z5, connectionsLogContext, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, (ConnectionsLogContext.$stable << 3) | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 8);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128292(connectionsRuleEditorUiState, connectionsRuleEditorViewModel, connectionsLogContext, bRg2, i, i2);
        }
    }

    public static final void ConnectionsRuleEditorForm(ConnectionsRuleEditorUiState connectionsRuleEditorUiState, ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-30009595);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsRuleEditorUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsRuleEditorViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$hasTyped$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(AnonymousClass007.A0H(bfm, bRg2, c1062ATq), 16.0f, 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(8.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA02);
            if (connectionsRuleEditorUiState.hasConflict) {
                bfm.AgE(777354553);
                boolean zA1X = AnonymousClass002.A1X(connectionsRuleEditorUiState.savedVersion);
                boolean z = ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsRuleEditorViewModel)));
                Object objAaT2 = bfm.AaT();
                if (z || objAaT2 == obj) {
                    objAaT2 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$1$1$1(connectionsLogContext, connectionsRuleEditorViewModel);
                    bfm.Ai0(objAaT2);
                }
                ConnectionsRuleConflictBanner(zA1X, (Function0) objAaT2, PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, HatchComponent.RULE_CONFLICT_BANNER, null, null, null, null, bfm, ((iA05 >> 6) & 14) | ConnectionsLogContext.$stable | 48, 60), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(777675527);
                BBI.A0R(bbi, false);
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120803);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0C = C3U4.A0C(BRg.A00, 12.0f, 0.0f, 0.0f, 0.0f);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$1$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            boolean z2 = false;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A00(bRgA0C, (G0U) objAaT3), jA07, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            String str = connectionsRuleEditorUiState.description;
            boolean zA65 = bfm.A65(strA01);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$1$3$1(strA01);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(c1062ATq, objAaT4, false);
            C1DM c1dm = auraTheme.getShapes(bfm, 6).large;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            boolean z3 = !connectionsRuleEditorUiState.isBusy;
            AuJ auJ = new AuJ(null, 3, 0, -1);
            boolean zA652 = bfm.A65(mutableStateA0N);
            if ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext))) {
                z2 = true;
            }
            boolean z4 = zA652 | z2 | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsRuleEditorViewModel)));
            Object objAaT5 = bfm.AaT();
            if (z4 || objAaT5 == obj) {
                objAaT5 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorForm$1$4$1(connectionsLogContext, connectionsRuleEditorViewModel, mutableStateA0N);
                bfm.Ai0(objAaT5);
            }
            AuraTextInputKt.AuraTextInput(str, null, bRgA0Y, null, auJ, null, null, c1822ArmA0C, false, 0, 4, null, null, null, null, z3, false, false, false, c1dm, (G0U) objAaT5, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 6, 0, 490346);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128302(connectionsRuleEditorUiState, connectionsRuleEditorViewModel, connectionsLogContext, bRg2, i, i2);
        }
    }

    public static final void ConnectionsRuleEditorScreen(ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectionsRuleEditorSheetKey, 0);
        bfm.AgG(-916294204);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectionsRuleEditorSheetKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = connectionsRuleEditorSheetKey.connectionId;
            String str3 = connectionsRuleEditorSheetKey.ruleId;
            String strA0j = FGI.A0j("connections-rule-editor:", str, ":", str2, ":", str3);
            ConnectionsRuleEditorViewModel.Factory factory = new ConnectionsRuleEditorViewModel.Factory(abstractC3358CGzA0h, str2, str3);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel = (ConnectionsRuleEditorViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ConnectionsRuleEditorViewModel.class, strA0j);
            C1BO c1boA02 = C2CK.A02(bfm, connectionsRuleEditorViewModel.uiState);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTION_RULE_EDITOR, bfm, 6);
            if (((ConnectionsRuleEditorUiState) c1boA02.getValue()).phase == ConnectionsRuleEditorPhase.DONE) {
                bfm.AgE(1492144396);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorScreen$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, unit);
            } else {
                bfm.AgE(1492223198);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            boolean z = ((ConnectionsRuleEditorUiState) c1boA02.getValue()).isNew;
            int i4 = R.string._name_removed__res_0x7f120801;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120802;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            AuraBottomSheetHeaderConfig.AccessoryButton.Companion companion = AuraBottomSheetHeaderConfig.AccessoryButton.Companion;
            boolean zA1M = AnonymousClass003.A1M(bfm, connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectionsRuleEditorScreenKt$ConnectionsRuleEditorScreen$2$1(connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(strA01, null, companion.back((Function0) objAaT2), null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            if (((ConnectionsRuleEditorUiState) c1boA02.getValue()).phase == ConnectionsRuleEditorPhase.READY) {
                bfm.AgE(1492951884);
                b1uA00 = B1V.A00(bfm, new AnonymousClass3(connectionsRuleEditorViewModel, connectionsLogContextRememberConnectionsLogContext, c1boA02), 2034473063);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(1493037568);
                BBI.A0R(bbiA07, false);
                b1uA00 = null;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, auraBottomSheetHeaderConfig, b1uA00, null, null, false, false, true, null, B1V.A00(bfm, new AnonymousClass4(connectionsRuleEditorViewModel, connectionsLogContextRememberConnectionsLogContext, c1boA02), -1327610303), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 805306752, 48, 1505);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128315(connectionsRuleEditorSheetKey, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConnectionsRuleEditorUiState access$ConnectionsRuleEditorScreen$lambda$0(C1BO c1bo) {
        return (ConnectionsRuleEditorUiState) c1bo.getValue();
    }
}
