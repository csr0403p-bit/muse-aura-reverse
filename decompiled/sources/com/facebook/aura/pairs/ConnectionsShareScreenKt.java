package com.facebook.aura.pairs;

import X.AKQ;
import X.AZ3;
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
import X.BRg;
import X.C00x;
import X.C07C;
import X.C0v2;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DP;
import X.C1YD;
import X.C1YY;
import X.C1b8;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsShareSheetKey;
import com.facebook.aura.pairs.ConnectionsShareViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsShareScreenKt {
    public static final int LOAD_MORE_THRESHOLD = 5;

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDone;
        public final /* synthetic */ G0U<HatchComponent, Unit> $onShare;
        public final /* synthetic */ ConnectionsShareUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(ConnectionsShareUiState connectionsShareUiState, G0U<? super HatchComponent, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = connectionsShareUiState;
            this.$onShare = g0u;
            this.$onDone = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsShareScreenKt.ConnectionsShareButton(this.$uiState, this.$onShare, this.$onDone, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ G0W<String, Integer, Boolean, Unit> $onToggle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ ConnectionsShareUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, ConnectionsShareUiState connectionsShareUiState, G0W<? super String, ? super Integer, ? super Boolean, Unit> g0w, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$uiState = connectionsShareUiState;
            this.$onToggle = g0w;
            this.$onLoadMore = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsShareScreenKt.ConnectionsShareList(this.$title, this.$uiState, this.$onToggle, this.$onLoadMore, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C128353 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggle;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ ConnectionsShareStatus $status;
        public final /* synthetic */ ConnectionsShareTarget $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128353(ConnectionsShareTarget connectionsShareTarget, boolean z, ConnectionsShareStatus connectionsShareStatus, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$target = connectionsShareTarget;
            this.$selected = z;
            this.$status = connectionsShareStatus;
            this.$enabled = z2;
            this.$onToggle = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsShareScreenKt.ConnectionsShareRow(this.$target, this.$selected, this.$status, this.$enabled, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Map<String, String> $contentType;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<ConnectionsShareUiState> $uiState$delegate;
        public final /* synthetic */ ConnectionsShareViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectionsLogContext connectionsLogContext, Map<String, String> map, ConnectionsShareViewModel connectionsShareViewModel, C1BO<ConnectionsShareUiState> c1bo) {
            super(3);
            this.$log = connectionsLogContext;
            this.$contentType = map;
            this.$viewModel = connectionsShareViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$uiState$delegate.getValue().statuses.values().contains(ConnectionsShareStatus.AWAITING_USER)) {
                bfm.AgE(-1275831627);
                ConnectionsShareStatusScreenKt.ConnectionsOpenChatButton(this.$log.screen, this.$contentType, C3U4.A03(BRg.A00, 8.0f), bfm, 384, 0);
            } else {
                bfm.AgE(-1275643271);
            }
            AnonymousClass002.A19(bfm);
            ConnectionsShareUiState value = this.$uiState$delegate.getValue();
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1T(bfm, this.$contentType, bfm.A67(this.$log)));
            ConnectionsLogContext connectionsLogContext = this.$log;
            Map<String, String> map = this.$contentType;
            ConnectionsShareViewModel connectionsShareViewModel = this.$viewModel;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new ConnectionsShareScreenKt$ConnectionsShareScreen$1$1$1(connectionsLogContext, map, connectionsShareViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$contentType, bfm.A67(this.$log));
            ConnectionsLogContext connectionsLogContext2 = this.$log;
            Map<String, String> map2 = this.$contentType;
            Object objAaT2 = bfm.AaT();
            if (zA1T2 || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectionsShareScreenKt$ConnectionsShareScreen$1$2$1(connectionsLogContext2, map2);
                bfm.Ai0(objAaT2);
            }
            ConnectionsShareScreenKt.ConnectionsShareButton(value, g0u, (Function0) objAaT2, null, bfm, ConnectionsShareUiState.$stable, 8);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Map<String, String> $contentType;
        public final /* synthetic */ ConnectionsShareSheetKey $key;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<ConnectionsShareUiState> $uiState$delegate;
        public final /* synthetic */ ConnectionsShareViewModel $viewModel;

        /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareScreen$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConnectionsSharePhase.values().length];
                try {
                    AnonymousClass002.A13(ConnectionsSharePhase.READY, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ConnectionsSharePhase.LOADING, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ConnectionsSharePhase.EMPTY, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(ConnectionsSharePhase.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(ConnectionsSharePhase.FAILED, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectionsShareSheetKey connectionsShareSheetKey, ConnectionsLogContext connectionsLogContext, Map<String, String> map, ConnectionsShareViewModel connectionsShareViewModel, C1BO<ConnectionsShareUiState> c1bo) {
            super(3);
            this.$key = connectionsShareSheetKey;
            this.$log = connectionsLogContext;
            this.$contentType = map;
            this.$viewModel = connectionsShareViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String strA0v;
            ConnectionsLogContext connectionsLogContext;
            HatchComponent hatchComponent;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            int iOrdinal = this.$uiState$delegate.getValue().phase.ordinal();
            if (iOrdinal == 1) {
                bfm.AgE(1662204332);
                String str = this.$key.title;
                ConnectionsShareUiState value = this.$uiState$delegate.getValue();
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1T(bfm, this.$contentType, bfm.A67(this.$log)));
                ConnectionsLogContext connectionsLogContext2 = this.$log;
                Map<String, String> map = this.$contentType;
                ConnectionsShareViewModel connectionsShareViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new ConnectionsShareScreenKt$ConnectionsShareScreen$2$1$1(connectionsLogContext2, map, connectionsShareViewModel);
                    bfm.Ai0(objAaT);
                }
                G0W g0w = (G0W) objAaT;
                ConnectionsShareViewModel connectionsShareViewModel2 = this.$viewModel;
                boolean zA67 = bfm.A67(connectionsShareViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsShareScreenKt$ConnectionsShareScreen$2$2$1(connectionsShareViewModel2);
                    bfm.Ai0(objAaT2);
                }
                ConnectionsShareScreenKt.ConnectionsShareList(str, value, g0w, (Function0) ((InterfaceC7353EnQ) objAaT2), PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_SCREEN_VIEW, null, this.$contentType, null, null, bfm, ConnectionsLogContext.$stable | 48, 52), bfm, ConnectionsShareUiState.$stable << 3, 0);
            } else if (iOrdinal != 0) {
                if (iOrdinal == 2) {
                    bfm.AgE(1662229911);
                    strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12081d);
                    connectionsLogContext = this.$log;
                    hatchComponent = HatchComponent.CONNECTIONS_EMPTY_STATE;
                } else if (iOrdinal == 3) {
                    bfm.AgE(1662238486);
                    strA0v = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12082f);
                    connectionsLogContext = this.$log;
                    hatchComponent = HatchComponent.CONNECTIONS_UNAVAILABLE_STATE;
                } else {
                    if (iOrdinal != 4) {
                        throw AnonymousClass005.A0k(bfm, 1662203226);
                    }
                    bfm.AgE(1662248945);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12081e);
                    BRg bRgRememberConnectionsImpression = PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_ERROR_STATE, null, this.$contentType, null, null, bfm, ConnectionsLogContext.$stable | 48, 52);
                    boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1T(bfm, this.$contentType, bfm.A67(this.$log)));
                    ConnectionsLogContext connectionsLogContext3 = this.$log;
                    Map<String, String> map2 = this.$contentType;
                    ConnectionsShareViewModel connectionsShareViewModel3 = this.$viewModel;
                    Object objAaT3 = bfm.AaT();
                    if (zA1T2 || objAaT3 == C78N.A00) {
                        objAaT3 = new ConnectionsShareScreenKt$ConnectionsShareScreen$2$3$1(connectionsLogContext3, map2, connectionsShareViewModel3);
                        bfm.Ai0(objAaT3);
                    }
                    PairsComponentsKt.PairsMessage(strA01, bRgRememberConnectionsImpression, (Function0) objAaT3, bfm, 0, 0);
                }
                PairsComponentsKt.PairsMessage(strA0v, PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, hatchComponent, null, this.$contentType, null, null, bfm, ConnectionsLogContext.$stable | 48, 52), null, bfm, 0, 4);
            } else {
                bfm.AgE(1662227729);
                PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C128363 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsShareSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128363(ConnectionsShareSheetKey connectionsShareSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = connectionsShareSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsShareScreenKt.ConnectionsShareScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
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
            int[] iArr = new int[ConnectionsShareStatus.values().length];
            try {
                AnonymousClass002.A13(ConnectionsShareStatus.SENDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionsShareStatus.REVIEWING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectionsShareStatus.AWAITING_MUSE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConnectionsShareStatus.AWAITING_USER, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConnectionsShareStatus.QUEUED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConnectionsShareStatus.DELIVERED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConnectionsShareStatus.UNCERTAIN, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConnectionsShareStatus.DENIED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(ConnectionsShareStatus.CANCELLED, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(ConnectionsShareStatus.NOT_SENT, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(ConnectionsShareStatus.REFUSED, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(ConnectionsShareStatus.FAILED, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConnectionsShareButton(ConnectionsShareUiState connectionsShareUiState, G0U<? super HatchComponent, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        Function0 function02;
        int i3;
        boolean z;
        int i4;
        BRg bRg2 = bRg;
        bfm.AgG(841091214);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsShareUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            if (!(!connectionsShareUiState.statuses.isEmpty())) {
                bfm.AgE(109410355);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12081b);
                z = !connectionsShareUiState.selected.isEmpty();
                boolean zA1N = AnonymousClass001.A1N(iA05);
                Object objAaT = bfm.AaT();
                if (zA1N || objAaT == C78N.A00) {
                    objAaT = new ConnectionsShareScreenKt$ConnectionsShareButton$1$1(g0u);
                    bfm.Ai0(objAaT);
                }
                function02 = (Function0) objAaT;
                i4 = (iA05 >> 3) & 896;
                i3 = 16;
            } else if (connectionsShareUiState.getRetryable().isEmpty()) {
                bfm.AgE(834829937);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12081c);
                boolean zA1S = AnonymousClass001.A1S(bfm, auraNavigatorA0b, (iA05 & 896) == 256);
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsShareScreenKt$ConnectionsShareButton$3$1(function0, auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                PairsComponentsKt.PairsPrimaryButton(strA012, (Function0) objAaT2, bRg2, false, false, bfm, (iA05 >> 3) & 896, 24);
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(834823024);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d9d);
                boolean zA1N2 = AnonymousClass001.A1N(iA05);
                Object objAaT3 = bfm.AaT();
                if (zA1N2 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConnectionsShareScreenKt$ConnectionsShareButton$2$1(g0u);
                    bfm.Ai0(objAaT3);
                }
                function02 = (Function0) objAaT3;
                i3 = 24;
                z = false;
                i4 = (iA05 >> 3) & 896;
            }
            PairsComponentsKt.PairsPrimaryButton(strA01, function02, bRg2, z, false, bfm, i4, i3);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(connectionsShareUiState, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsShareList(String str, ConnectionsShareUiState connectionsShareUiState, G0W<? super String, ? super Integer, ? super Boolean, Unit> g0w, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(879954391);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsShareUiState, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA1K = AnonymousClass003.A1K(bfm, lazyListStateA00, mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new ConnectionsShareScreenKt$ConnectionsShareList$1$1(lazyListStateA00, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, lazyListStateA00);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1DP c1dp = new C1DP(16.0f, 8.0f, 16.0f, 8.0f);
            C9m9 c9m9A00 = AcQ.A00(8.0f);
            boolean zA1F = ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(connectionsShareUiState))) | AnonymousClass004.A1F(iA0d) | ((iA0d & 896) == 256);
            Object objAaT2 = bfm.AaT();
            if (zA1F || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectionsShareScreenKt$ConnectionsShareList$2$1(str, connectionsShareUiState, g0w);
                bfm.Ai0(objAaT2);
            }
            C1YY.A01(null, null, c9m9A00, c1dp, lazyListStateA00, bfm, null, bRgA0R, (G0U) objAaT2, 24960, 488, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, connectionsShareUiState, g0w, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsShareRow(ConnectionsShareTarget connectionsShareTarget, boolean z, ConnectionsShareStatus connectionsShareStatus, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        long jA07;
        BRg bRgA0Q = bRg;
        bfm.AgG(272445161);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsShareTarget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(connectionsShareStatus));
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRgA0Q);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A03(AnonymousClass007.A0I(bRgA0Q), auraTheme.getShapes(bfm, 6).large), C60R.A04(bfm, auraTheme));
            C1YD c1ydA0A = C3cG.A0A(1);
            boolean zA1M = AnonymousClass005.A1M(iA05);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new ConnectionsShareScreenKt$ConnectionsShareRow$1$1(function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA09 = C3U4.A09(C0v2.A01(bRgA01, c1ydA0A, (G0U) objAaT, z, z2), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90m c90m = C90m.A00;
            PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(connectionsShareTarget.photo, 40.0f, null, 0L, bfm, PairsImageRef.$stable | 48, 12);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            bfm.AgE(1242258091);
            String strA01 = connectionsShareTarget.name;
            if (strA01.length() == 0) {
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120837);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (connectionsShareStatus != null) {
                bfm.AgE(-144418556);
                String strA012 = AbstractC2271BQs.A01(bfm, labelRes(connectionsShareStatus));
                C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
                if (connectionsShareStatus == ConnectionsShareStatus.FAILED || connectionsShareStatus == ConnectionsShareStatus.NOT_SENT || connectionsShareStatus == ConnectionsShareStatus.REFUSED) {
                    bfm.AgE(-144054089);
                    jA07 = auraTheme.getColors(bfm, 6).error;
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-143988369);
                    jA07 = C3cH.A07(bfm, auraTheme);
                    BBI.A0R(bbi, false);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, jA07, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-143904173);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (z) {
                bfm.AgE(1477298347);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.circle_check_wght400_outline_24, 0), 24.0f, null, C3cH.A06(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(1477506109);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128353(connectionsShareTarget, z, connectionsShareStatus, z2, function0, bRgA0Q, i, i2);
        }
    }

    public static final void ConnectionsShareScreen(ConnectionsShareSheetKey connectionsShareSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectionsShareSheetKey, 0);
        bfm.AgG(300407406);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectionsShareSheetKey) | i : i;
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
            String str2 = connectionsShareSheetKey.kind;
            String str3 = connectionsShareSheetKey.itemId;
            String strA0j = FGI.A0j("connections-share:", str, ":", str2, ":", str3);
            ConnectionsShareViewModel.Factory factory = new ConnectionsShareViewModel.Factory(abstractC3358CGzA0h, str2, str3);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ConnectionsShareViewModel connectionsShareViewModel = (ConnectionsShareViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ConnectionsShareViewModel.class, strA0j);
            C1BO c1boA02 = C2CK.A02(bfm, connectionsShareViewModel.uiState);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTIONS_SHARE, bfm, 6);
            boolean zA65 = bfm.A65(connectionsShareSheetKey.kind);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = PairsAnalytics.INSTANCE.shareContentType$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionsShareSheetKey.kind);
                bfm.Ai0(objAaT);
            }
            Map map = (Map) objAaT;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12082e);
            HatchScreen hatchScreen = connectionsLogContextRememberConnectionsLogContext.screen;
            if (((ConnectionsShareUiState) c1boA02.getValue()).phase == ConnectionsSharePhase.READY) {
                bfm.AgE(-1273953706);
                b1uA00 = B1V.A00(bfm, new AnonymousClass1(connectionsLogContextRememberConnectionsLogContext, map, connectionsShareViewModel, c1boA02), 1711687113);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -1273272202);
                b1uA00 = null;
            }
            PairsComponentsKt.PairsSheet(bRg2, strA01, false, hatchScreen, map, false, null, b1uA00, B1V.A00(bfm, new AnonymousClass2(connectionsShareSheetKey, connectionsLogContextRememberConnectionsLogContext, map, connectionsShareViewModel, c1boA02), 2075470371), bfm, ((iA0T >> 3) & 14) | 100663296, 100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128363(connectionsShareSheetKey, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConnectionsShareUiState access$ConnectionsShareScreen$lambda$0(C1BO c1bo) {
        return (ConnectionsShareUiState) c1bo.getValue();
    }

    public static final int labelRes(ConnectionsShareStatus connectionsShareStatus) {
        switch (AnonymousClass003.A0L(connectionsShareStatus)) {
            case 0:
                return R.string._name_removed__res_0x7f12082a;
            case 1:
            case 3:
                return R.string._name_removed__res_0x7f120821;
            case 2:
                return R.string._name_removed__res_0x7f120828;
            case 4:
                return R.string._name_removed__res_0x7f120822;
            case 5:
                return R.string._name_removed__res_0x7f120824;
            case 6:
                return R.string._name_removed__res_0x7f12082d;
            case 7:
                return R.string._name_removed__res_0x7f120825;
            case 8:
                return R.string._name_removed__res_0x7f120823;
            case 9:
                return R.string._name_removed__res_0x7f120827;
            case 10:
                return R.string._name_removed__res_0x7f120829;
            case 11:
                return R.string._name_removed__res_0x7f120826;
            default:
                throw C3cG.A0q();
        }
    }
}
