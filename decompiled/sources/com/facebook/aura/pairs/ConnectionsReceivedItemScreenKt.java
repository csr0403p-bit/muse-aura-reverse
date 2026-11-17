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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
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
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
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
import com.facebook.aura.navigation.key.ConnectionsReceivedItemSheetKey;
import com.facebook.aura.pairs.ConnectionsReceivedItemUiState;
import com.facebook.aura.pairs.ConnectionsReceivedItemViewModel;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsReceivedItemScreenKt {

    /* renamed from: com.facebook.aura.pairs.ConnectionsReceivedItemScreenKt$ConnectionsReceivedItemScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConnectionsReceivedItemUiState> $load$delegate;
        public final /* synthetic */ ConnectionsLogContext $log;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            ConnectionsReceivedItemUiState value = this.$load$delegate.getValue();
            if (C7384Etj.areEqual(value, ConnectionsReceivedItemUiState.Loading.INSTANCE)) {
                bfm.AgE(982445736);
                PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
            } else if (C7384Etj.areEqual(value, ConnectionsReceivedItemUiState.Failed.INSTANCE)) {
                bfm.AgE(982448203);
                PairsComponentsKt.PairsMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12080a), PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_ERROR_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60), null, bfm, 0, 4);
            } else {
                if (!(value instanceof ConnectionsReceivedItemUiState.Loaded)) {
                    throw AnonymousClass005.A0k(bfm, 982445035);
                }
                bfm.AgE(982456995);
                ConnectionsReceivedItemUiState.Loaded loaded = (ConnectionsReceivedItemUiState.Loaded) value;
                BRg bRgA0B = C3U4.A0B(AnonymousClass007.A0H(bfm, C10G.A02, PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_SCREEN_VIEW, null, PairsAnalytics.INSTANCE.shareContentType$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(loaded.item.kind.getWire()), null, null, bfm, ConnectionsLogContext.$stable | 48, 52)), 20.0f, 12.0f);
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(8.0f), bfm, C2VU.A02, 6);
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
                String strA01 = AbstractC2271BQs.A01(bfm, ConnectionsReceivedItemScreenKt.receivedLabelRes(loaded.item.kind));
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                bfm.AgE(255831041);
                String strA012 = loaded.item.title;
                if (strA012.length() == 0) {
                    strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12080b);
                }
                BBI.A0R(bbi, false);
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title3Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                String str = loaded.item.text;
                if (str == null) {
                    bfm.AgE(-658898683);
                } else {
                    AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -658898682).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ConnectionsLogContext connectionsLogContext, C1BO<? extends ConnectionsReceivedItemUiState> c1bo) {
            super(3);
            this.$log = connectionsLogContext;
            this.$load$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsReceivedItemScreenKt$ConnectionsReceivedItemScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsReceivedItemSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = connectionsReceivedItemSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsReceivedItemScreenKt.ConnectionsReceivedItemScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionsSharedItemKind.values().length];
            try {
                AnonymousClass002.A13(ConnectionsSharedItemKind.FEED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionsSharedItemKind.IDEA, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectionsSharedItemKind.GOAL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConnectionsSharedItemKind.SPACE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConnectionsSharedItemKind.FILE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConnectionsReceivedItemScreen(ConnectionsReceivedItemSheetKey connectionsReceivedItemSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectionsReceivedItemSheetKey, 0);
        bfm.AgG(1683566447);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectionsReceivedItemSheetKey) | i : i;
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
            String str2 = connectionsReceivedItemSheetKey.shareId;
            String strA0d = FGI.A0d("connections-received-item:", str, ":", str2);
            ConnectionsReceivedItemViewModel.Factory factory = new ConnectionsReceivedItemViewModel.Factory(abstractC3358CGzA0h, str2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((ConnectionsReceivedItemViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ConnectionsReceivedItemViewModel.class, strA0d)).uiState);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTIONS_RECEIVED_ITEM, bfm, 6);
            PairsComponentsKt.PairsSheet(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120808), false, connectionsLogContextRememberConnectionsLogContext.screen, null, false, null, null, B1V.A00(bfm, new AnonymousClass1(connectionsLogContextRememberConnectionsLogContext, c1boA02), 1842361050), bfm, ((iA0T >> 3) & 14) | 100663296, 244);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(connectionsReceivedItemSheetKey, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConnectionsReceivedItemUiState access$ConnectionsReceivedItemScreen$lambda$0(C1BO c1bo) {
        return (ConnectionsReceivedItemUiState) c1bo.getValue();
    }

    public static final int receivedLabelRes(ConnectionsSharedItemKind connectionsSharedItemKind) {
        int iOrdinal = connectionsSharedItemKind.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f120807;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f120809;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f1207d1;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f1207da;
        }
        if (iOrdinal == 4) {
            return R.string._name_removed__res_0x7f1207cf;
        }
        throw C3cG.A0q();
    }
}
