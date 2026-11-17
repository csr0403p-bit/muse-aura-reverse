package com.facebook.aura.pairs;

import X.AKQ;
import X.AVy;
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
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BQN;
import X.BRg;
import X.C00x;
import X.C07C;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PairsAcceptLinkSheetKey;
import com.facebook.aura.pairs.PairsAcceptLinkUiState;
import com.facebook.aura.pairs.PairsAcceptLinkViewModel;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PairsAcceptLinkScreenKt {

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsAcceptIntro$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsHeldInvite $invite;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PairsHeldInvite pairsHeldInvite, BRg bRg, int i, int i2) {
            super(2);
            this.$invite = pairsHeldInvite;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptLinkScreenKt.PairsAcceptIntro(this.$invite, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C128922 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ PairsAcceptLinkSheetKey $key;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ AuraNavigator $navigator;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d58);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$key, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$log)));
            ConnectionsLogContext connectionsLogContext = this.$log;
            AuraNavigator auraNavigator = this.$navigator;
            PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey = this.$key;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$2$1$1(connectionsLogContext, auraNavigator, pairsAcceptLinkSheetKey);
                bfm.Ai0(objAaT);
            }
            PairsComponentsKt.PairsPrimaryButton(strA01, (Function0) objAaT, AbstractC07539Wl.A00(BRg.A00, "pairs-accept-continue"), false, false, bfm, 384, 24);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d79);
            AuraLabelButtonStyle auraLabelButtonStyleTertiary = AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1);
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A02, "pairs-accept-not-now");
            boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$log));
            ConnectionsLogContext connectionsLogContext2 = this.$log;
            AuraNavigator auraNavigator2 = this.$navigator;
            Object objAaT2 = bfm.AaT();
            if (zA1T2 || objAaT2 == C78N.A00) {
                objAaT2 = new PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$2$2$1(connectionsLogContext2, auraNavigator2);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgA00, auraLabelButtonStyleTertiary, null, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134201317);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128922(ConnectionsLogContext connectionsLogContext, AuraNavigator auraNavigator, PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey) {
            super(3);
            this.$log = connectionsLogContext;
            this.$navigator = auraNavigator;
            this.$key = pairsAcceptLinkSheetKey;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<PairsAcceptLinkUiState> $uiState$delegate;
        public final /* synthetic */ PairsAcceptLinkViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ConnectionsLogContext connectionsLogContext, PairsAcceptLinkViewModel pairsAcceptLinkViewModel, C1BO<? extends PairsAcceptLinkUiState> c1bo) {
            super(3);
            this.$log = connectionsLogContext;
            this.$viewModel = pairsAcceptLinkViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            PairsAcceptLinkUiState value = this.$uiState$delegate.getValue();
            Function0 function0 = null;
            if (C7384Etj.areEqual(value, PairsAcceptLinkUiState.Loading.INSTANCE) || C7384Etj.areEqual(value, PairsAcceptLinkUiState.PostedToChat.INSTANCE) || (value instanceof PairsAcceptLinkUiState.AlreadyPaired)) {
                bfm.AgE(803433114);
                PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
            } else if (value instanceof PairsAcceptLinkUiState.Message) {
                bfm.AgE(803435910);
                PairsAcceptLinkUiState.Message message = (PairsAcceptLinkUiState.Message) value;
                String strA01 = AbstractC2271BQs.A01(bfm, message.failure.getMessage());
                BRg bRgRememberConnectionsImpression = PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_ERROR_STATE, null, PairsAnalytics.INSTANCE.failureReason$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(message.failure.getWire()), null, message.failure.getWire(), bfm, ConnectionsLogContext.$stable | 48, 20);
                if (message.failure.getCanRetry()) {
                    bfm.AgE(-862912984);
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                    ConnectionsLogContext connectionsLogContext = this.$log;
                    PairsAcceptLinkViewModel pairsAcceptLinkViewModel = this.$viewModel;
                    Object objAaT = bfm.AaT();
                    if (zA1T || objAaT == C78N.A00) {
                        objAaT = new PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$3$1$1(connectionsLogContext, pairsAcceptLinkViewModel);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                } else {
                    bfm.AgE(-862738392);
                }
                AnonymousClass001.A1D(bfm);
                PairsComponentsKt.PairsMessage(strA01, bRgRememberConnectionsImpression, function0, bfm, 0, 0);
            } else {
                if (!(value instanceof PairsAcceptLinkUiState.Ready)) {
                    throw AnonymousClass005.A0k(bfm, 803429063);
                }
                bfm.AgE(803457360);
                PairsAcceptLinkScreenKt.PairsAcceptIntro(((PairsAcceptLinkUiState.Ready) value).invite, PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_SCREEN_VIEW, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60), bfm, PairsHeldInvite.$stable, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsAcceptLinkSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = pairsAcceptLinkSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptLinkScreenKt.PairsAcceptLinkScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsInviteHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C128932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsHeldInvite $invite;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128932(PairsHeldInvite pairsHeldInvite, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$invite = pairsHeldInvite;
            this.$subtitle = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptLinkScreenKt.PairsInviteHeader(this.$invite, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsOwnMuseAccountLine$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptLinkScreenKt.PairsOwnMuseAccountLine(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsOwnMuseAccountLine$2, reason: invalid class name and case insensitive filesystem */
    public final class C128942 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128942(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptLinkScreenKt.PairsOwnMuseAccountLine(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsAcceptLinkScreenKt$PairsWelcomeBenefit$2, reason: invalid class name and case insensitive filesystem */
    public final class C128952 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128952(int i, String str, String str2, BRg bRg, int i2, int i3) {
            super(2);
            this.$icon = i;
            this.$title = str;
            this.$body = str2;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            PairsAcceptLinkScreenKt.PairsWelcomeBenefit(this.$icon, this.$title, this.$body, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void PairsAcceptIntro(PairsHeldInvite pairsHeldInvite, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-12506499);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsHeldInvite, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
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
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            PairsInviteHeader(pairsHeldInvite, museLine(pairsHeldInvite.preview.agentName, bfm, 0), null, bfm, (iA05 & 14) | PairsHeldInvite.$stable, 4);
            PairsOwnMuseAccountLine(C3U4.A0C(BRg.A00, 0.0f, 2.0f, 0.0f, 0.0f), bfm, 6, 0);
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, 24.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 20.0f, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            PairsWelcomeBenefit(R.drawable.userbadgecheck_outline_24_wght400, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d8b), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120da7), null, bfm, 0, 8);
            PairsWelcomeBenefit(R.drawable.lockbadgeheart_outline_24_wght400, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120da6), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120da5), null, bfm, 0, 8);
            PairsWelcomeBenefit(R.drawable.handshake_outline_24_wght400, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120da4), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120da3), null, bfm, 0, 8);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pairsHeldInvite, bRg2, i, i2);
        }
    }

    public static final void PairsAcceptLinkScreen(PairsAcceptLinkSheetKey pairsAcceptLinkSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pairsAcceptLinkSheetKey, 0);
        bfm.AgG(-1227551615);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, pairsAcceptLinkSheetKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = pairsAcceptLinkSheetKey.token;
            String strA0d = FGI.A0d("pairs-accept-link:", str, ":", str2);
            PairsAcceptLinkViewModel.Factory factory = new PairsAcceptLinkViewModel.Factory(abstractC3358CGzA0h, str2, pairsAcceptLinkSheetKey.opensInChat);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            PairsAcceptLinkViewModel pairsAcceptLinkViewModel = (PairsAcceptLinkViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0d, C3cG.A0x(PairsAcceptLinkViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, pairsAcceptLinkViewModel.uiState);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTION_ACCEPT_INVITE, bfm, 6);
            Object value = c1boA02.getValue();
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new PairsAcceptLinkScreenKt$PairsAcceptLinkScreen$1$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, value);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "pairs-accept");
            boolean z = pairsAcceptLinkSheetKey.fromHub;
            if (c1boA02.getValue() instanceof PairsAcceptLinkUiState.Ready) {
                bfm.AgE(1657735316);
                b1uA00 = B1V.A00(bfm, new C128922(connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b, pairsAcceptLinkSheetKey), 1834104020);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 1658554243);
                b1uA00 = null;
            }
            PairsComponentsKt.PairsSheet(bRgA00, null, z, null, null, true, null, b1uA00, B1V.A00(bfm, new AnonymousClass3(connectionsLogContextRememberConnectionsLogContext, pairsAcceptLinkViewModel, c1boA02), 1717035244), bfm, 100859904, 90);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(pairsAcceptLinkSheetKey, bRg2, i, i2);
        }
    }

    public static final void PairsInviteHeader(PairsHeldInvite pairsHeldInvite, String str, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(pairsHeldInvite, str);
        bfm.AgG(-636327710);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsHeldInvite, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str2 = pairsHeldInvite.preview.displayName;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(null, 72.0f, null, auraTheme.getColors(bfm, 6).card, bfm, 54, 4);
            if (str2 == null || str2.length() == 0) {
                bfm.AgE(-1296171770);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d50);
            } else {
                bfm.AgE(-1296169340);
                strA01 = AnonymousClass001.A0t(bfm, str2, R.string._name_removed__res_0x7f120d7d);
            }
            BBI.A0R(bbi, false);
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title1Emphasized;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, 12.0f, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PairsAcceptLinkScreenKt$PairsInviteHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(c1062ATq, 20.0f, 2.0f, 20.0f, 0.0f), C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, (iA05 >> 3) & 14, 0, 16304);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128932(pairsHeldInvite, str, bRg2, i, i2);
        }
    }

    public static final void PairsOwnMuseAccountLine(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c128942;
        BRg bRg2 = bRg;
        bfm.AgG(-121584923);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((HatchIdentityProvider) objAaT).aiIdentityName);
            if (C7BY.A0j(C1BO.A08(c1boA02))) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c128942 = new AnonymousClass1(bRg2, i, i2);
                    bBbAAc.A06 = c128942;
                }
                return;
            }
            String strA0w = AnonymousClass006.A0w(bfm, HatchAppName.value, c1boA02.getValue(), R.string._name_removed__res_0x7f120d4c);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0w, AbstractC07539Wl.A00(C3U4.A07(AnonymousClass001.A0R(bRg2), 20.0f), "pairs-accept-account"), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c128942 = new C128942(bRg2, i, i2);
            bBbAAc.A06 = c128942;
        }
    }

    public static final void PairsWelcomeBenefit(int i, String str, String str2, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1047896700);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), 20.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(16.0f), bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, i, iA0D & 14);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2568AuraIconFyETyZw(null, aVyA00, 24.0f, null, auraTheme.getColors(bfm, 6).primaryIcon.enabled, null, bfm, AnonymousClass001.A03(), 41);
            BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 3) & 14, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 6) & 14, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128952(i, str, str2, bRg2, i2, i3);
        }
    }

    public static final String museLine(String str, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        if (str == null || str.length() == 0) {
            bfm.AgE(-400684892);
            i2 = R.string._name_removed__res_0x7f120d77;
            objArr = new Object[]{HatchAppName.value};
        } else {
            bfm.AgE(-400594155);
            i2 = R.string._name_removed__res_0x7f120d76;
            objArr = new Object[]{str};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA02;
    }

    public static final /* synthetic */ PairsAcceptLinkUiState access$PairsAcceptLinkScreen$lambda$0(C1BO c1bo) {
        return (PairsAcceptLinkUiState) c1bo.getValue();
    }
}
