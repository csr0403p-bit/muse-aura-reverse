package com.facebook.aura.pairs;

import X.AKQ;
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
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsShareStatusSheetKey;
import com.facebook.aura.pairs.ConnectionsShareStatusUiState;
import com.facebook.aura.pairs.ConnectionsShareStatusViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsShareStatusScreenKt {

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareStatusScreenKt$ConnectionsOpenChatButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchScreen $logScreen;
        public final /* synthetic */ Map<String, String> $metadata;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchScreen hatchScreen, Map<String, String> map, BRg bRg, int i, int i2) {
            super(2);
            this.$logScreen = hatchScreen;
            this.$metadata = map;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsShareStatusScreenKt.ConnectionsOpenChatButton(this.$logScreen, this.$metadata, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareStatusScreenKt$ConnectionsShareStatusScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectionsLogContext connectionsLogContext) {
            super(3);
            this.$log = connectionsLogContext;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ConnectionsShareStatusScreenKt.ConnectionsOpenChatButton(this.$log.screen, null, null, bfm, 48, 4);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareStatusScreenKt$ConnectionsShareStatusScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C128372 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsShareStatusSheetKey $key;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<ConnectionsShareStatusUiState> $uiState$delegate;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            ConnectionsShareStatusUiState value = this.$uiState$delegate.getValue();
            if (C7384Etj.areEqual(value, ConnectionsShareStatusUiState.Loading.INSTANCE)) {
                bfm.AgE(-1127407009);
                PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
            } else if (C7384Etj.areEqual(value, ConnectionsShareStatusUiState.Unavailable.INSTANCE)) {
                bfm.AgE(-1127404512);
                PairsComponentsKt.PairsMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12082c), null, null, bfm, 0, 6);
            } else {
                if (!(value instanceof ConnectionsShareStatusUiState.Known)) {
                    throw AnonymousClass005.A0k(bfm, -1127408464);
                }
                bfm.AgE(-1127399418);
                BRg bRgA0B = C3U4.A0B(C10G.A02.then(PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_SCREEN_VIEW, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60)), 20.0f, 12.0f);
                C9m9 c9m9A00 = AcQ.A00(8.0f);
                ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey = this.$key;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                if (connectionsShareStatusSheetKey.title.length() > 0) {
                    bfm.AgE(745655699);
                    String str = connectionsShareStatusSheetKey.title;
                    AuraTheme auraTheme = AuraTheme.INSTANCE;
                    AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                } else {
                    bfm.AgE(745842567);
                }
                BBI.A0R(bbi, false);
                String strA01 = AbstractC2271BQs.A01(bfm, ConnectionsShareScreenKt.labelRes(((ConnectionsShareStatusUiState.Known) value).status));
                AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A07(bfm, auraTheme2), C3cH.A0C(bfm, auraTheme2), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128372(ConnectionsLogContext connectionsLogContext, C1BO<? extends ConnectionsShareStatusUiState> c1bo, ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey) {
            super(3);
            this.$log = connectionsLogContext;
            this.$uiState$delegate = c1bo;
            this.$key = connectionsShareStatusSheetKey;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareStatusScreenKt$ConnectionsShareStatusScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsShareStatusSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = connectionsShareStatusSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsShareStatusScreenKt.ConnectionsShareStatusScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ConnectionsOpenChatButton(HatchScreen hatchScreen, Map<String, String> map, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchScreen, 0);
        bfm.AgG(876633851);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchScreen) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass002.A06(AnonymousClass004.A1Y(map, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120820);
            boolean zA1B = AnonymousClass003.A1B(iA08);
            if ((iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 32 && ((iA08 & 64) == 0 || !bfm.A67(map))) {
                z = false;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, zA1B, z);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new ConnectionsShareStatusScreenKt$ConnectionsOpenChatButton$1$1(hatchScreen, map, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            PairsComponentsKt.PairsPrimaryButton(strA01, (Function0) objAaT, bRg2, false, false, bfm, iA08 & 896, 24);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchScreen, map, bRg2, i, i2);
        }
    }

    public static final void ConnectionsShareStatusScreen(ConnectionsShareStatusSheetKey connectionsShareStatusSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        ConnectionsShareStatusUiState.Known known;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectionsShareStatusSheetKey, 0);
        bfm.AgG(1274293148);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectionsShareStatusSheetKey) | i : i;
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
            String str2 = connectionsShareStatusSheetKey.messageId;
            String strA0d = FGI.A0d("connections-share-status:", str, ":", str2);
            ConnectionsShareStatusViewModel.Factory factory = new ConnectionsShareStatusViewModel.Factory(abstractC3358CGzA0h, str2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((ConnectionsShareStatusViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ConnectionsShareStatusViewModel.class, strA0d)).uiState);
            ConnectionsShareStatusUiState connectionsShareStatusUiState = (ConnectionsShareStatusUiState) c1boA02.getValue();
            ConnectionsShareStatus connectionsShareStatus = (!(connectionsShareStatusUiState instanceof ConnectionsShareStatusUiState.Known) || (known = (ConnectionsShareStatusUiState.Known) connectionsShareStatusUiState) == null) ? null : known.status;
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTIONS_SHARE_STATUS, bfm, 6);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12082b);
            HatchScreen hatchScreen = connectionsLogContextRememberConnectionsLogContext.screen;
            if (connectionsShareStatus == ConnectionsShareStatus.AWAITING_USER) {
                bfm.AgE(-747924366);
                b1uA00 = B1V.A00(bfm, new AnonymousClass1(connectionsLogContextRememberConnectionsLogContext), 1727960631);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -747836760);
                b1uA00 = null;
            }
            PairsComponentsKt.PairsSheet(bRg2, strA01, false, hatchScreen, null, false, null, b1uA00, B1V.A00(bfm, new C128372(connectionsLogContextRememberConnectionsLogContext, c1boA02, connectionsShareStatusSheetKey), -1172121583), bfm, ((iA0T >> 3) & 14) | 100663296, 116);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(connectionsShareStatusSheetKey, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConnectionsShareStatusUiState access$ConnectionsShareStatusScreen$lambda$0(C1BO c1bo) {
        return (ConnectionsShareStatusUiState) c1bo.getValue();
    }

    public static final void openMainChat(AuraNavigator auraNavigator) {
        auraNavigator.dismissBottomSheetStack(Integer.MAX_VALUE);
        AnonymousClass006.A1D(auraNavigator);
    }
}
