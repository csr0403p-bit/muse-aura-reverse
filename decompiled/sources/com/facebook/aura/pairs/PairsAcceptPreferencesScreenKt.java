package com.facebook.aura.pairs;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BQN;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
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
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PairsAcceptPreferencesSheetKey;
import com.facebook.aura.pairs.PairsAcceptPreferencesUiState;
import com.facebook.aura.pairs.PairsAcceptPreferencesViewModel;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PairsAcceptPreferencesScreenKt {

    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PairsLevel, Unit> $onLevelSelected;
        public final /* synthetic */ PairsAcceptPreferencesUiState.Ready $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(PairsAcceptPreferencesUiState.Ready ready, G0U<? super PairsLevel, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = ready;
            this.$onLevelSelected = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptPreferencesScreenKt.PairsAcceptPreferencesContent(this.$state, this.$onLevelSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$2, reason: invalid class name and case insensitive filesystem */
    public final class C128972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $fromHub;
        public final /* synthetic */ G0U<PairsContact, Unit> $onAlreadyPaired;
        public final /* synthetic */ G0U<PairsContact, Unit> $onRemovalOffered;
        public final /* synthetic */ PairsAcceptPreferencesViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128972(PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel, boolean z, G0U<? super PairsContact, Unit> g0u, G0U<? super PairsContact, Unit> g0u2, int i) {
            super(2);
            this.$viewModel = pairsAcceptPreferencesViewModel;
            this.$fromHub = z;
            this.$onRemovalOffered = g0u;
            this.$onAlreadyPaired = g0u2;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptPreferencesScreenKt.PairsAcceptPreferencesEffects(this.$viewModel, this.$fromHub, this.$onRemovalOffered, this.$onAlreadyPaired, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<PairsAcceptPreferencesUiState> $uiState$delegate;
        public final /* synthetic */ PairsAcceptPreferencesViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(ConnectionsLogContext connectionsLogContext, PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel, C1BO<? extends PairsAcceptPreferencesUiState> c1bo) {
            super(3);
            this.$log = connectionsLogContext;
            this.$viewModel = pairsAcceptPreferencesViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            PairsAcceptPreferencesUiState value = this.$uiState$delegate.getValue();
            if (C7384Etj.areEqual(value, PairsAcceptPreferencesUiState.Loading.INSTANCE)) {
                bfm.AgE(85479556);
                PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
            } else if (value instanceof PairsAcceptPreferencesUiState.Message) {
                bfm.AgE(85481669);
                PairsComponentsKt.PairsMessage(AbstractC2271BQs.A01(bfm, ((PairsAcceptPreferencesUiState.Message) value).message), null, null, bfm, 0, 6);
            } else {
                if (!(value instanceof PairsAcceptPreferencesUiState.Ready)) {
                    throw AnonymousClass005.A0k(bfm, 85477814);
                }
                bfm.AgE(85485465);
                PairsAcceptPreferencesUiState.Ready ready = (PairsAcceptPreferencesUiState.Ready) value;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                ConnectionsLogContext connectionsLogContext = this.$log;
                PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$5$1$1(connectionsLogContext, pairsAcceptPreferencesViewModel);
                    bfm.Ai0(objAaT);
                }
                PairsAcceptPreferencesScreenKt.PairsAcceptPreferencesContent(ready, (G0U) objAaT, C60R.A0G(bfm, HatchComponent.CONNECTIONS_SCREEN_VIEW, this.$log, ConnectionsLogContext.$stable), bfm, PairsAcceptPreferencesUiState.Ready.$stable, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsAcceptPreferencesSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = pairsAcceptPreferencesSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptPreferencesScreenKt.PairsAcceptPreferencesScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void PairsAcceptPreferencesContent(PairsAcceptPreferencesUiState.Ready ready, G0U<? super PairsLevel, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1384587667);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ready, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z = ready.levels.size() > 1;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRg2, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0H);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0J);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            PairsHeldInvite pairsHeldInvite = ready.invite;
            int i4 = R.string._name_removed__res_0x7f120d7f;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120d7e;
            }
            PairsAcceptLinkScreenKt.PairsInviteHeader(pairsHeldInvite, AnonymousClass001.A0t(bfm, HatchAppName.value, i4), null, bfm, PairsHeldInvite.$stable, 4);
            BRg bRgA0C = C3U4.A0C(c1062ATq, 16.0f, 12.0f, 16.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(16.0f), bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (z) {
                bfm.AgE(1164528716);
                PairsComponentsKt.PairsSectionHeader(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120d6c), null, bfm, 0, 2);
                PairsLevelCardsKt.PairsLevelCards(ready.levels, ready.selectedLevel, g0u, null, !ready.isAccepting, bfm, (iA05 << 3) & 896, 8);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1164819899);
                BBI.A0R(bbi, false);
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d5c);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ready, g0u, bRg2, i, i2);
        }
    }

    public static final void PairsAcceptPreferencesScreen(PairsAcceptPreferencesSheetKey pairsAcceptPreferencesSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        BBI bbiA0M;
        boolean z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pairsAcceptPreferencesSheetKey, 0);
        bfm.AgG(-2054049983);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, pairsAcceptPreferencesSheetKey) : i;
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = pairsAcceptPreferencesSheetKey.token;
            String strA0d = FGI.A0d("pairs-accept-preferences:", str, ":", str2);
            PairsAcceptPreferencesViewModel.Factory factory = new PairsAcceptPreferencesViewModel.Factory(abstractC3358CGzA0h, str2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel = (PairsAcceptPreferencesViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0d, C3cG.A0x(PairsAcceptPreferencesViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, pairsAcceptPreferencesViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTION_ACCEPT_LEVEL, bfm, 6);
            boolean z2 = pairsAcceptPreferencesSheetKey.fromHub;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$2$1(mutableState2);
                bfm.Ai0(objAaT3);
            }
            B1U b1uA00 = null;
            PairsAcceptPreferencesEffects(pairsAcceptPreferencesViewModel, z2, g0u, (G0U) objAaT3, bfm, PairsAcceptPreferencesViewModel.$stable | 3456);
            PairsContact pairsContact = (PairsContact) mutableState2.getValue();
            if (pairsContact == null) {
                bbiA0M = AnonymousClass002.A0M(bfm, -1803089786);
            } else {
                bfm.AgE(-1803089785);
                if (pairsContact.displayName.length() == 0) {
                    bfm.AgE(-1487854750);
                    strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d53);
                } else {
                    bfm.AgE(-1487852465);
                    strA0t = AnonymousClass001.A0t(bfm, pairsContact.displayName, R.string._name_removed__res_0x7f120d52);
                }
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
                boolean zA65 = bfm.A65(strA0t);
                Object objAaT4 = bfm.AaT();
                if (zA65 || objAaT4 == obj) {
                    objAaT4 = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$3$1$1(strA0t, mutableState2, null);
                    bfm.Ai0(objAaT4);
                }
                AnonymousClass001.A18(bfm, objAaT4, pairsContact);
                BBI.A0R(bbiA0M, false);
            }
            PairsAcceptPreferencesUiState pairsAcceptPreferencesUiState = (PairsAcceptPreferencesUiState) c1boA02.getValue();
            PairsAcceptPreferencesUiState.Ready ready = pairsAcceptPreferencesUiState instanceof PairsAcceptPreferencesUiState.Ready ? (PairsAcceptPreferencesUiState.Ready) pairsAcceptPreferencesUiState : null;
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "pairs-accept-preferences");
            if (ready == null) {
                bfm.AgE(-1802554819);
                BBI.A0R(bbiA0M, false);
                z = true;
            } else {
                bfm.AgE(-1802554818);
                z = true;
                b1uA00 = B1V.A00(bfm, new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$4$1(ready, connectionsLogContextRememberConnectionsLogContext, pairsAcceptPreferencesViewModel, auraNavigatorA0b), -28076859);
                BBI.A0R(bbiA0M, false);
            }
            PairsComponentsKt.PairsSheet(bRgA00, null, false, null, null, z, null, b1uA00, B1V.A00(bfm, new AnonymousClass5(connectionsLogContextRememberConnectionsLogContext, pairsAcceptPreferencesViewModel, c1boA02), -205497418), bfm, 100859904, 94);
            PairsContact pairsContact2 = (PairsContact) mutableState.getValue();
            if (pairsContact2 == null) {
                bfm.AgE(-1800845882);
            } else {
                bfm.AgE(-1800845881);
                PairsConfirmation pairsConfirmationA0S = C60R.A0S(bfm, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d4e), removeEarlierRequestMessage(pairsContact2, bfm, PairsContact.$stable), R.string._name_removed__res_0x7f120d80);
                boolean zA1S = AnonymousClass005.A1S(bfm, connectionsLogContextRememberConnectionsLogContext, pairsAcceptPreferencesViewModel, pairsContact2);
                Object objAaT5 = bfm.AaT();
                if (zA1S || objAaT5 == obj) {
                    objAaT5 = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$6$1$1(connectionsLogContextRememberConnectionsLogContext, pairsAcceptPreferencesViewModel, pairsContact2, mutableState);
                    bfm.Ai0(objAaT5);
                }
                Function0 function0 = (Function0) objAaT5;
                boolean zA67 = bfm.A67(connectionsLogContextRememberConnectionsLogContext);
                Object objAaT6 = bfm.AaT();
                if (zA67 || objAaT6 == obj) {
                    objAaT6 = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$6$2$1(connectionsLogContextRememberConnectionsLogContext, mutableState);
                    bfm.Ai0(objAaT6);
                }
                Function0 function02 = (Function0) objAaT6;
                Object objAaT7 = bfm.AaT();
                if (objAaT7 == obj) {
                    objAaT7 = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$6$3$1(mutableState);
                    bfm.Ai0(objAaT7);
                }
                PairsComponentsKt.PairsConfirmationDialog(pairsConfirmationA0S, function0, function02, (Function0) objAaT7, null, bfm, PairsConfirmation.$stable | 3072, 16);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(pairsAcceptPreferencesSheetKey, bRg2, i, i2);
        }
    }

    public static final String removeEarlierRequestMessage(PairsContact pairsContact, BFM bfm, int i) {
        String strA0t;
        if (pairsContact.displayName.length() == 0) {
            bfm.AgE(-115631189);
            strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d85);
        } else {
            bfm.AgE(-115546466);
            strA0t = AnonymousClass001.A0t(bfm, pairsContact.displayName, R.string._name_removed__res_0x7f120d84);
        }
        AnonymousClass001.A1D(bfm);
        return strA0t;
    }

    public static final void PairsAcceptPreferencesEffects(PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel, boolean z, G0U<? super PairsContact, Unit> g0u, G0U<? super PairsContact, Unit> g0u2, BFM bfm, int i) {
        bfm.AgG(862181444);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsAcceptPreferencesViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d4d);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass001.A1R(bfm, strA01, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(pairsAcceptPreferencesViewModel))) | AnonymousClass003.A1E(iA05), AnonymousClass003.A1D(iA05)) | AnonymousClass003.A1C(iA05);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesEffects$1$1(pairsAcceptPreferencesViewModel, strA01, g0u2, g0u, auraNavigatorA0b, z, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, pairsAcceptPreferencesViewModel, auraNavigatorA0b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128972(pairsAcceptPreferencesViewModel, z, g0u, g0u2, i);
        }
    }

    public static final /* synthetic */ PairsAcceptPreferencesUiState access$PairsAcceptPreferencesScreen$lambda$0(C1BO c1bo) {
        return (PairsAcceptPreferencesUiState) c1bo.getValue();
    }
}
