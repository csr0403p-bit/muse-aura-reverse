package com.facebook.aura.pairs;

import X.AHD;
import X.AKQ;
import X.AZ3;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
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
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0CD;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1DP;
import X.C1YD;
import X.C1YY;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7bA;
import X.C9m9;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HtJ;
import X.HzP;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.header.view.HatchTabScreenKt;
import com.facebook.aura.header.view.HeaderLeadingButton;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsModalScreenKey;
import com.facebook.aura.navigation.key.ConnectionsScreenKey;
import com.facebook.aura.pairs.ConnectionsUiState;
import com.facebook.aura.pairs.ConnectionsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsTabScreenKt {
    public static final float AVATAR_SIZE = 60.0f;
    public static final int SUGGESTION_PREVIEW_COUNT = 3;

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsAvatar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsPerson $person;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectionsPerson connectionsPerson) {
            super(2);
            this.$person = connectionsPerson;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(this.$person.contact.photo, ConnectionsTabScreenKt.AVATAR_SIZE, null, 0L, bfm, PairsImageRef.$stable | 48, 12);
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

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsAvatar$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ ConnectionsPerson $person;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectionsPerson connectionsPerson, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$person = connectionsPerson;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsAvatar(this.$person, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsConnectChip$1, reason: invalid class name and case insensitive filesystem */
    public final class C128511 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128511(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsConnectChip(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsEffects$2, reason: invalid class name and case insensitive filesystem */
    public final class C128522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128522(ConnectionsViewModel connectionsViewModel, int i) {
            super(2);
            this.$viewModel = connectionsViewModel;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsEffects(this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsOlderActivity$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = connectionsViewModel;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsOlderActivity(this.$viewModel, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C128532 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<ConnectionsPerson> $connections;
        public final /* synthetic */ List<ConnectionsGroup> $groups;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenAdd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128532(List<ConnectionsPerson> list, List<ConnectionsGroup> list2, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$connections = list;
            this.$groups = list2;
            this.$log = connectionsLogContext;
            this.$onOpenAdd = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsRow(this.$connections, this.$groups, this.$log, this.$onOpenAdd, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRowItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C128542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $avatar;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128542(String str, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$label = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$avatar = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsRowItem(this.$label, this.$onClick, this.$modifier, this.$avatar, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsSeeMoreButton$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C128552 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
        public static final C128552 INSTANCE = new C128552();

        public C128552() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final C1822Arm invoke(BFM bfm, int i) {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, 616450561).subheadlineMedium;
            AnonymousClass002.A19(bfm);
            return c1822Arm;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsSeeMoreButton$3, reason: invalid class name and case insensitive filesystem */
    public final class C128563 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128563(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsSeeMoreButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsTabScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C128572 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<ConnectionsUiState> $uiState$delegate;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsTabScreen$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
            public final /* synthetic */ ConnectionsLogContext $log;
            public final /* synthetic */ float $topPadding;
            public final /* synthetic */ C1BO<ConnectionsUiState> $uiState$delegate;
            public final /* synthetic */ ConnectionsViewModel $viewModel;

            public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
                C7384Etj.A0Y(interfaceC05151eP, 0);
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                ConnectionsUiState value = this.$uiState$delegate.getValue();
                if (C7384Etj.areEqual(value, ConnectionsUiState.Loading.INSTANCE)) {
                    PairsComponentsKt.PairsLoading(C3U4.A04(C3cG.A09(bfm, -1493702081), this.$topPadding), bfm, 0, 0);
                } else if (C7384Etj.areEqual(value, ConnectionsUiState.Unavailable.INSTANCE)) {
                    bfm.AgE(-1493698577);
                    PairsComponentsKt.PairsMessage(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120d9e), C3U4.A04(BRg.A00, this.$topPadding).then(PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_UNAVAILABLE_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60)), null, bfm, 0, 4);
                } else if (C7384Etj.areEqual(value, ConnectionsUiState.Failed.INSTANCE)) {
                    bfm.AgE(-1493688663);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d75);
                    BRg bRgThen = C3U4.A04(BRg.A00, this.$topPadding).then(PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_ERROR_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60));
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                    ConnectionsLogContext connectionsLogContext = this.$log;
                    ConnectionsViewModel connectionsViewModel = this.$viewModel;
                    Object objAaT = bfm.AaT();
                    if (zA1T || objAaT == C78N.A00) {
                        objAaT = new ConnectionsTabScreenKt$ConnectionsTabScreen$2$1$1$1(connectionsLogContext, connectionsViewModel);
                        bfm.Ai0(objAaT);
                    }
                    PairsComponentsKt.PairsMessage(strA01, bRgThen, (Function0) objAaT, bfm, 0, 0);
                } else {
                    if (!(value instanceof ConnectionsUiState.Loaded)) {
                        throw AnonymousClass005.A0k(bfm, -1493703314);
                    }
                    bfm.AgE(-1493675577);
                    ConnectionsTabScreenKt.m1656ConnectionsTabContentTN_CM5M((ConnectionsUiState.Loaded) value, this.$viewModel, this.$topPadding, this.$log, null, bfm, ConnectionsUiState.Loaded.$stable | (ConnectionsViewModel.$stable << 3) | (ConnectionsLogContext.$stable << 9), 16);
                }
                AnonymousClass001.A1D(bfm);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(float f, ConnectionsLogContext connectionsLogContext, ConnectionsViewModel connectionsViewModel, C1BO<? extends ConnectionsUiState> c1bo) {
                super(3);
                this.$topPadding = f;
                this.$log = connectionsLogContext;
                this.$viewModel = connectionsViewModel;
                this.$uiState$delegate = c1bo;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
                invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128572(ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, C1BO<? extends ConnectionsUiState> c1bo) {
            super(3);
            this.$viewModel = connectionsViewModel;
            this.$log = connectionsLogContext;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
            m1660invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-8Feqmps, reason: not valid java name */
        public final void m1660invoke8Feqmps(float f, BFM bfm, int i) {
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                bfm.Afo();
            } else {
                ConnectionsViewModel connectionsViewModel = this.$viewModel;
                ConnectionsTabScreenKt.m1655ConnectionsPullToRefreshDzVHIIc(connectionsViewModel, f, null, B1V.A00(bfm, new AnonymousClass1(f, this.$log, connectionsViewModel, this.$uiState$delegate), 1871069295), bfm, ConnectionsViewModel.$stable | 3072 | ((i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
            }
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsTabScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C128583 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $registerWithTabBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128583(BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$registerWithTabBar = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsTabScreenKt.ConnectionsTabScreen(this.$modifier, this.$registerWithTabBar, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsTitle$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C128592 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128592(BRg bRg, int i, int i2) {
            super(2);
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
            ConnectionsTabScreenKt.ConnectionsTitle(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsActivity$1, reason: invalid class name and case insensitive filesystem */
    public final class C128601 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207ca);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A07(BRg.A00, 16.0f).then(PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_EMPTY_STATE, HatchSubsurface.CONNECTIONS_ACTIVITY, null, null, null, bfm, ConnectionsLogContext.$stable | 432, 56)), C3cH.A05(bfm, auraTheme), c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128601(ConnectionsLogContext connectionsLogContext) {
            super(3);
            this.$log = connectionsLogContext;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsActivity$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext) {
            super(3);
            this.$viewModel = connectionsViewModel;
            this.$log = connectionsLogContext;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ConnectionsTabScreenKt.ConnectionsOlderActivity(this.$viewModel, this.$log, null, bfm, ConnectionsViewModel.$stable | (ConnectionsLogContext.$stable << 3), 4);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsSuggestions$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C128621 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ Function0<Unit> $onOpenAdd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128621(ConnectionsLogContext connectionsLogContext, Function0<Unit> function0) {
            super(3);
            this.$log = connectionsLogContext;
            this.$onOpenAdd = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            C7384Etj.A0Y(anonymousClass037, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0B = C3U4.A0B(bs0, 16.0f, 0.0f);
                ConnectionsLogContext connectionsLogContext = this.$log;
                Function0<Unit> function0 = this.$onOpenAdd;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1207ec);
                C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(strA0v, C3U4.A0B(bs0, 0.0f, 4.0f), C06G.A08(bfm), c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                boolean zA1N = AnonymousClass003.A1N(bfm, connectionsLogContext, function0);
                Object objAaT = bfm.AaT();
                if (zA1N || objAaT == C78N.A00) {
                    objAaT = new ConnectionsTabScreenKt$connectionsSuggestions$1$1$1$1(connectionsLogContext, function0);
                    bfm.Ai0(objAaT);
                }
                ConnectionsComponentsKt.ConnectionsSearchEntry((Function0) objAaT, C3U4.A0B(bs0, 0.0f, 12.0f), bfm, 48, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsSuggestions$4, reason: invalid class name and case insensitive filesystem */
    public final class C128644 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ Function0<Unit> $onOpenAdd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128644(ConnectionsLogContext connectionsLogContext, Function0<Unit> function0) {
            super(3);
            this.$log = connectionsLogContext;
            this.$onOpenAdd = function0;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onOpenAdd, bfm.A67(this.$log));
            ConnectionsLogContext connectionsLogContext = this.$log;
            Function0<Unit> function0 = this.$onOpenAdd;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$connectionsSuggestions$4$1$1(connectionsLogContext, function0);
                bfm.Ai0(objAaT);
            }
            ConnectionsTabScreenKt.ConnectionsSeeMoreButton((Function0) objAaT, C3U4.A0C(BRg.A00, 16.0f, 8.0f, 16.0f, 16.0f), bfm, 48, 0);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabScreenKt", f = "ConnectionsTabScreen.kt", l = {475}, m = "shareConnectionsUrl", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$shareConnectionsUrl$1, reason: invalid class name and case insensitive filesystem */
    public final class C128651 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsTabScreenKt.shareConnectionsUrl(null, null, null, this);
        }

        public C128651(HtJ<? super C128651> htJ) {
            super(htJ);
        }
    }

    public static final void ConnectionsAvatar(ConnectionsPerson connectionsPerson, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(945201208);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsPerson, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            bfm.AgE(2100266548);
            String strA01 = connectionsPerson.contact.displayName;
            if (strA01.length() == 0) {
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120837);
            }
            AnonymousClass001.A1D(bfm);
            ConnectionsRowItem(strA01, function0, bRg2, B1V.A00(bfm, new AnonymousClass1(connectionsPerson), 298871984), bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3072 | (iA05 & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(connectionsPerson, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsConnectChip(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1098699833);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0T << 3;
            ConnectionsRowItem(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207e5), function0, bRg2, ComposableSingletons$ConnectionsTabScreenKt.f202lambda$1984005041, bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3072 | (i4 & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128511(function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsEffects(ConnectionsViewModel connectionsViewModel, BFM bfm, int i) {
        C7384Etj.A0Y(connectionsViewModel, 0);
        bfm.AgG(-609018689);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsViewModel, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120d8e);
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(connectionsViewModel))) {
                z = false;
            }
            boolean zA1Y = AnonymousClass005.A1Y(bfm, abstractC3358CGzA0h, auraNavigatorA0b, AnonymousClass001.A1S(bfm, contextA0H, z), bfm.A65(strA0v));
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$ConnectionsEffects$1$1(connectionsViewModel, contextA0H, strA0v, abstractC3358CGzA0h, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, connectionsViewModel, contextA0H, auraNavigatorA0b, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128522(connectionsViewModel, i);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionsOlderActivityState.values().length];
            try {
                AnonymousClass002.A13(ConnectionsOlderActivityState.LOADING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionsOlderActivityState.FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectionsOlderActivityState.IDLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsActivity$2, reason: invalid class name and case insensitive filesystem */
    public final class C128612 extends AbstractC7559F3s implements G0V<Integer, ConnectionsActivity, Object> {
        public static final C128612 INSTANCE = new C128612();

        public C128612() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ConnectionsActivity connectionsActivity) {
            AnonymousClass005.A0w(num);
            ConnectionsActivity connectionsActivity2 = connectionsActivity;
            C7384Etj.A0Y(connectionsActivity2, 1);
            return connectionsActivity2.id;
        }

        public final Object invoke(int i, ConnectionsActivity connectionsActivity) {
            C7384Etj.A0Y(connectionsActivity, 1);
            return connectionsActivity.id;
        }
    }

    public static final void ConnectionsOlderActivity(ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(57433911);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsLogContext, bfm, i) ? 1 : 0);
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
            int iOrdinal = ((ConnectionsOlderActivityState) C1BO.A07(bfm, connectionsViewModel.olderActivity)).ordinal();
            if (iOrdinal == 1) {
                bfm.AgE(-640577413);
                PairsComponentsKt.PairsLoading(C10G.A04(bRg2, 56.0f), bfm, 0, 0);
            } else if (iOrdinal == 2) {
                bfm.AgE(1617052774);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207d6);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
                long jA07 = C3cH.A07(bfm, auraTheme);
                BRg bRgThen = AnonymousClass001.A0R(bRg2).then(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, HatchComponent.CONNECTIONS_ERROR_STATE, HatchSubsurface.CONNECTIONS_ACTIVITY, null, null, null, bfm, ConnectionsLogContext.$stable | 432 | ((iA05 >> 3) & 14), 56));
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean z = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(connectionsViewModel))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsLogContext)));
                Object objAaT = bfm.AaT();
                if (z || objAaT == C78N.A00) {
                    objAaT = new ConnectionsTabScreenKt$ConnectionsOlderActivity$1$1(connectionsLogContext, connectionsViewModel);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA09 = C3U4.A09(C0v5.A04(bRgThen, c1ydA0A, null, (Function0) objAaT, true), 16.0f);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = ConnectionsTabScreenKt$ConnectionsOlderActivity$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA09, objAaT2, false), jA07, c1822ArmA0B, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            } else {
                if (iOrdinal != 0) {
                    throw AnonymousClass005.A0k(bfm, -640578391);
                }
                AnonymousClass003.A0l(bfm, -640543365);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(connectionsViewModel, connectionsLogContext, bRg2, i, i2);
        }
    }

    /* renamed from: ConnectionsPullToRefresh-DzVHIIc, reason: not valid java name */
    public static final void m1655ConnectionsPullToRefreshDzVHIIc(ConnectionsViewModel connectionsViewModel, float f, BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1145442991);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0w);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA0F = C1BO.A0F(C2CK.A02(bfm, connectionsViewModel.isRefreshing));
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(connectionsViewModel))) {
                z = true;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$ConnectionsPullToRefresh$1$1(connectionsViewModel);
                bfm.Ai0(objAaT);
            }
            HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(zA0F, (Function0) objAaT, AnonymousClass001.A0T(bRg2), f, null, g0w, bfm, (iA05 << 6) & 465920, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConnectionsTabScreenKt$ConnectionsPullToRefresh$2(connectionsViewModel, f, bRg2, g0w, i, i2);
        }
    }

    public static final void ConnectionsRow(List<ConnectionsPerson> list, List<ConnectionsGroup> list2, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1864289841);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(list2, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1DP c1dp = new C1DP(16.0f, 16.0f, 16.0f, 16.0f);
            C9m9 c9m9A00 = AcQ.A00(10.0f);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass003.A1E(iA05), (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(list)));
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(list2))) {
                z = true;
            }
            boolean z2 = zA1V | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$ConnectionsRow$1$1(list, list2, connectionsLogContext, function0, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            C1YY.A00(null, null, c9m9A00, c1dp, null, bfm, null, bRgA0R, (G0U) objAaT, 24960, 490, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128532(list, list2, connectionsLogContext, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsRowItem(String str, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-17766522);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(C10G.A08(bRg2, 80.0f), C3cG.A0A(0), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 6.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA0J);
            AnonymousClass003.A13(bfm, g0v, iA0d >> 9);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(3), false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14770);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128542(str, function0, bRg2, g0v, i, i2);
        }
    }

    public static final void ConnectionsSeeMoreButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-13751485);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
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
            long j = C3cH.A0W(bfm).highlight;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120819);
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$ConnectionsSeeMoreButton$1$1(j);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0R, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, (Function0) objAaT, C128552.INSTANCE, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 133414853);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128563(function0, bRg2, i, i2);
        }
    }

    /* renamed from: ConnectionsTabContent-TN_CM5M, reason: not valid java name */
    public static final void m1656ConnectionsTabContentTN_CM5M(ConnectionsUiState.Loaded loaded, ConnectionsViewModel connectionsViewModel, float f, ConnectionsLogContext connectionsLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(568304147);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(loaded, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$ConnectionsTabContent$openAdd$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            if (loaded.hasOlderActivity) {
                bfm.AgE(679450849);
                boolean z = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsViewModel));
                Object objAaT2 = bfm.AaT();
                if (z || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsTabScreenKt$ConnectionsTabContent$1$1(connectionsViewModel);
                    bfm.Ai0(objAaT2);
                }
                AutoLoadMoreKt.AutoLoadMore(lazyListStateA00, 0, (Function0<Unit>) objAaT2, bfm, 0, 1);
            } else {
                bfm.AgE(-411815953);
            }
            AnonymousClass001.A1D(bfm);
            int size = loaded.connections.size() + loaded.groups.size();
            boolean zA63 = bfm.A63(size);
            Object objAaT3 = bfm.AaT();
            if (zA63 || objAaT3 == C78N.A00) {
                objAaT3 = PairsAnalytics.INSTANCE.totalCount$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(size);
                bfm.Ai0(objAaT3);
            }
            BRg bRgThen = AnonymousClass001.A0T(bRg2).then(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, HatchComponent.CONNECTIONS_SCREEN_VIEW, null, (Map) objAaT3, null, null, bfm, ((iA05 >> 9) & 14) | ConnectionsLogContext.$stable | 48, 52));
            C1DP c1dp = new C1DP(0.0f, f, 0.0f, 120.0f);
            boolean zA1W = AnonymousClass002.A1W(bfm, function0, bfm.A63(size) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(loaded))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsViewModel))), (iA05 & 7168) == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext)));
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == C78N.A00) {
                objAaT4 = new ConnectionsTabScreenKt$ConnectionsTabContent$2$1(size, loaded, connectionsViewModel, connectionsLogContext, function0);
                bfm.Ai0(objAaT4);
            }
            C1YY.A01(null, null, null, c1dp, lazyListStateA00, bfm, null, bRgThen, (G0U) objAaT4, 0, 504, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConnectionsTabScreenKt$ConnectionsTabContent$3(loaded, connectionsViewModel, f, connectionsLogContext, bRg2, i, i2);
        }
    }

    public static final void ConnectionsTabScreen(BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean zA1Q = z;
        BRg bRg2 = bRg;
        bfm.AgG(156924356);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, zA1Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            ConnectionsViewModel connectionsViewModel = connectionsViewModel(bfm, 0);
            C1BO c1boA02 = C2CK.A02(bfm, connectionsViewModel.uiState);
            AuraNavKey auraNavKey = zA1Q ? ConnectionsScreenKey.INSTANCE : ConnectionsModalScreenKey.INSTANCE;
            int i5 = ConnectionsViewModel.$stable;
            ConnectionsLogContext connectionsLogContextRememberConnectionsTabLogContext = PairsAnalyticsKt.rememberConnectionsTabLogContext(connectionsViewModel, auraNavKey, bfm, i5);
            ConnectionsEffects(connectionsViewModel, bfm, i5);
            boolean zA67 = bfm.A67(connectionsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$ConnectionsTabScreen$1$1(connectionsViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, connectionsViewModel, (G0U) objAaT, i5, 2);
            HatchTabScreenKt.m1022HatchTabScreenTsp2nRQ(ConnectionsScreenKey.INSTANCE, AbstractC07539Wl.A00(bRg2, "hatch-connections-tab"), null, null, 0L, null, null, 0.0f, false, null, null, null, null, null, null, HeaderLeadingButton.SidePanel, false, false, null, null, null, null, false, false, false, zA1Q, 0.0f, null, B1V.A00(bfm, new C128572(connectionsViewModel, connectionsLogContextRememberConnectionsTabLogContext, c1boA02), 830625724), bfm, 6, 196608, ((iA0d << 12) & 458752) | 100663296, 234848252);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128583(bRg2, zA1Q, i, i2);
        }
    }

    public static final void ConnectionsTitle(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(927789841);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120836);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title2Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA03 = C3U4.A03(AnonymousClass001.A0R(bRg2), 4.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectionsTabScreenKt$ConnectionsTitle$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA03, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128592(bRg2, i, i2);
        }
    }

    public static final void connectionsActivity(C0CD c0cd, final ConnectionsUiState.Loaded loaded, final ConnectionsViewModel connectionsViewModel, final ConnectionsLogContext connectionsLogContext) {
        c0cd.APJ("activity", null, ComposableSingletons$ConnectionsTabScreenKt.f206lambda$994995760);
        if (loaded.activity.isEmpty()) {
            c0cd.APJ("activity-empty", null, B1V.A01(new C128601(connectionsLogContext), 1083072747, true));
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final AHD<ConnectionsActivity> ahd = loaded.activity;
        final C128612 c128612 = C128612.INSTANCE;
        c0cd.APL(c128612 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsActivity$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), ahd, c128612, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsActivity$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                ahd.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsActivity$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ConnectionsActivity connectionsActivity = (ConnectionsActivity) ahd.get(i);
                bfm.AgE(-775861997);
                ConnectionsUiState.Loaded loaded2 = loaded;
                ConnectionsActivityItemsKt.ConnectionsActivityItem(connectionsActivity, loaded2.busyIds, jCurrentTimeMillis, loaded2.personTargets.get(connectionsActivity.museId), connectionsViewModel, connectionsLogContext, i, null, bfm, ConnectionsActivity.$stable | (ConnectionsViewModel.$stable << 12) | (ConnectionsLogContext.$stable << 15) | (((iA0d & 126) << 15) & 3670016), 128);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), ahd.size());
        if (loaded.hasOlderActivity) {
            c0cd.APJ("activity-older", null, B1V.A01(new AnonymousClass4(connectionsViewModel, connectionsLogContext), 1265819170, true));
        }
    }

    public static final void connectionsSuggestions(C0CD c0cd, final ConnectionsUiState.Loaded loaded, final ConnectionsViewModel connectionsViewModel, final ConnectionsLogContext connectionsLogContext, Function0<Unit> function0) {
        c0cd.APJ("intro", null, B1V.A01(new C128621(connectionsLogContext, function0), -1886849020, true));
        final List listA0a = AbstractC0878AGe.A0a(loaded.suggestions, 3);
        final C128632 c128632 = C128632.INSTANCE;
        c0cd.APL(c128632 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsSuggestions$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), listA0a, c128632, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsSuggestions$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                listA0a.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                listA0a.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsSuggestions$$inlined$itemsIndexed$default$3
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
                PairsSuggestion pairsSuggestion = (PairsSuggestion) listA0a.get(i);
                bfm.AgE(2051408571);
                ConnectionsLogContext connectionsLogContext2 = connectionsLogContext;
                boolean zContains = loaded.sentIds.contains(pairsSuggestion.id);
                boolean zContains2 = loaded.busyIds.contains(pairsSuggestion.id);
                boolean zA67 = bfm.A67(connectionsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConnectionsTabScreenKt$connectionsSuggestions$3$1$1(connectionsViewModel);
                    bfm.Ai0(objAaT);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
                boolean zA672 = bfm.A67(connectionsViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsTabScreenKt$connectionsSuggestions$3$2$1(connectionsViewModel);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u2 = (G0U) ((InterfaceC7353EnQ) objAaT2);
                boolean zA673 = bfm.A67(connectionsViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConnectionsTabScreenKt$connectionsSuggestions$3$3$1(connectionsViewModel);
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
        }, 2039820996, true), listA0a.size());
        if (loaded.suggestions.size() > 3) {
            c0cd.APJ("see-more", null, B1V.A01(new C128644(connectionsLogContext, function0), 1637403849, true));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object shareConnectionsUrl(android.content.Context r6, java.lang.String r7, java.lang.String r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.pairs.ConnectionsTabScreenKt.C128651
            if (r0 == 0) goto L4e
            r5 = r9
            com.facebook.aura.pairs.ConnectionsTabScreenKt$shareConnectionsUrl$1 r5 = (com.facebook.aura.pairs.ConnectionsTabScreenKt.C128651) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 != r3) goto L54
            java.lang.Object r8 = r5.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r5.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r5.L$0
            android.content.Context r6 = X.C60P.A02(r0, r1)
        L2b:
            android.net.Uri r1 = (android.net.Uri) r1
            com.facebook.aura.file.actions.HatchShare r0 = com.facebook.aura.file.actions.HatchShare.INSTANCE
            r0.shareUrl(r6, r7, r8, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L35:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.pairs.ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1 r0 = new com.facebook.aura.pairs.ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1
            r0.<init>(r6, r1)
            r5.L$0 = r6
            r5.L$1 = r7
            r5.L$2 = r8
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L2b
            return r4
        L4e:
            com.facebook.aura.pairs.ConnectionsTabScreenKt$shareConnectionsUrl$1 r5 = new com.facebook.aura.pairs.ConnectionsTabScreenKt$shareConnectionsUrl$1
            r5.<init>(r9)
            goto L12
        L54:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabScreenKt.shareConnectionsUrl(android.content.Context, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final /* synthetic */ ConnectionsUiState access$ConnectionsTabScreen$lambda$0(C1BO c1bo) {
        return (ConnectionsUiState) c1bo.getValue();
    }

    public static final ConnectionsViewModel connectionsViewModel(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        ConnectionsViewModel.Factory factory = new ConnectionsViewModel.Factory(abstractC3358CGzA0h);
        String strA0M = FGI.A0M("connections:", ((CH0) abstractC3358CGzA0h).A01);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (ConnectionsViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), ConnectionsViewModel.class, strA0M);
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$connectionsSuggestions$2, reason: invalid class name and case insensitive filesystem */
    public final class C128632 extends AbstractC7559F3s implements G0V<Integer, PairsSuggestion, Object> {
        public static final C128632 INSTANCE = new C128632();

        public C128632() {
            super(2);
        }

        public final Object invoke(int i, PairsSuggestion pairsSuggestion) {
            C7384Etj.A0Y(pairsSuggestion, 1);
            return FGI.A0M("suggestion:", pairsSuggestion.id);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, PairsSuggestion pairsSuggestion) {
            return invoke(AnonymousClass001.A0F(num), pairsSuggestion);
        }
    }
}
