package com.facebook.aura.pairs;

import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC0885AGm;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0A8;
import X.C0v2;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PeerGoalScreenKey;
import com.facebook.aura.pairs.SharedGoalViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchRenameDialogKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SharedGoalScreenKt {
    public static final String PROBLEM_BANNER_ROW_KEY = "banner";
    public static final int TASK_MENU_REMOVE = 1;
    public static final int TASK_MENU_RENAME = 0;

    /* renamed from: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $bottomPadding;
        public final /* synthetic */ boolean $editing;
        public final /* synthetic */ SharedGoal $goal;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onEditingChange;
        public final /* synthetic */ float $topPadding;
        public final /* synthetic */ SharedGoalUiState $uiState;
        public final /* synthetic */ SharedGoalViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(SharedGoal sharedGoal, SharedGoalUiState sharedGoalUiState, SharedGoalViewModel sharedGoalViewModel, ConnectionsLogContext connectionsLogContext, boolean z, G0U<? super Boolean, Unit> g0u, float f, float f2, BRg bRg, int i, int i2) {
            super(2);
            this.$goal = sharedGoal;
            this.$uiState = sharedGoalUiState;
            this.$viewModel = sharedGoalViewModel;
            this.$log = connectionsLogContext;
            this.$editing = z;
            this.$onEditingChange = g0u;
            this.$topPadding = f;
            this.$bottomPadding = f2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            SharedGoalScreenKt.SharedGoalContent(this.$goal, this.$uiState, this.$viewModel, this.$log, this.$editing, this.$onEditingChange, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalProblemBanner$2, reason: invalid class name and case insensitive filesystem */
    public final class C130052 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $hasDraft;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDiscard;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ SharedGoalProblem $problem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130052(SharedGoalProblem sharedGoalProblem, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$problem = sharedGoalProblem;
            this.$hasDraft = z;
            this.$isSaving = z2;
            this.$onRetry = function0;
            this.$onDiscard = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SharedGoalScreenKt.SharedGoalProblemBanner(this.$problem, this.$hasDraft, this.$isSaving, this.$onRetry, this.$onDiscard, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $editing$delegate;
        public final /* synthetic */ SharedGoal $goal;
        public final /* synthetic */ ConnectionsLogContext $log;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SharedGoal sharedGoal, ConnectionsLogContext connectionsLogContext, MutableState<Boolean> mutableState) {
            super(2);
            this.$goal = sharedGoal;
            this.$log = connectionsLogContext;
            this.$editing$delegate = mutableState;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$goal == null || MutableState.A0A((MutableState) this.$editing$delegate)) {
                bfm.AgE(-1637050647);
            } else {
                bfm.AgE(-1637411022);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.pencil_wght400_outline_24, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f70);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$editing$delegate, bfm.A67(this.$log));
                ConnectionsLogContext connectionsLogContext = this.$log;
                MutableState<Boolean> mutableState = this.$editing$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new SharedGoalScreenKt$SharedGoalScreen$4$1$1(connectionsLogContext, mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA01, (Function0) objAaT, null, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable, 0, 2040);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $editing$delegate;
        public final /* synthetic */ SharedGoal $goal;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<SharedGoalUiState> $uiState$delegate;
        public final /* synthetic */ SharedGoalViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(SharedGoal sharedGoal, SharedGoalViewModel sharedGoalViewModel, ConnectionsLogContext connectionsLogContext, MutableState<Boolean> mutableState, C1BO<SharedGoalUiState> c1bo) {
            super(4);
            this.$goal = sharedGoal;
            this.$viewModel = sharedGoalViewModel;
            this.$log = connectionsLogContext;
            this.$editing$delegate = mutableState;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) throws Resources.NotFoundException {
            m1680invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1680invokei1RSzL4(float f, float f2, BFM bfm, int i) throws Resources.NotFoundException {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$goal != null) {
                bfm.AgE(-238761534);
                SharedGoal sharedGoal = this.$goal;
                SharedGoalUiState value = this.$uiState$delegate.getValue();
                SharedGoalViewModel sharedGoalViewModel = this.$viewModel;
                ConnectionsLogContext connectionsLogContext = this.$log;
                boolean zA0A = MutableState.A0A((MutableState) this.$editing$delegate);
                boolean zA65 = bfm.A65(this.$editing$delegate);
                MutableState<Boolean> mutableState = this.$editing$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SharedGoalScreenKt$SharedGoalScreen$5$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                ConnectionsLogContext connectionsLogContext2 = this.$log;
                HatchComponent hatchComponent = HatchComponent.CONNECTIONS_SCREEN_VIEW;
                int i2 = ConnectionsLogContext.$stable;
                SharedGoalScreenKt.SharedGoalContent(sharedGoal, value, sharedGoalViewModel, connectionsLogContext, zA0A, (G0U) objAaT, f, f2, C60R.A0G(bfm, hatchComponent, connectionsLogContext2, i2), bfm, SharedGoal.$stable | (SharedGoalUiState.$stable << 3) | (SharedGoalViewModel.$stable << 6) | (i2 << 9), 0);
            } else {
                Function0 function0 = null;
                if (this.$uiState$delegate.getValue().isLoading) {
                    bfm.AgE(-238747697);
                    PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
                } else {
                    bfm.AgE(1188805897);
                    SharedGoalProblem sharedGoalProblem = this.$uiState$delegate.getValue().problem;
                    if (sharedGoalProblem == null) {
                        sharedGoalProblem = SharedGoalProblem.LOAD_FAILED;
                    }
                    String strA01 = AbstractC2271BQs.A01(bfm, SharedGoalScreenKt.messageRes(sharedGoalProblem));
                    ConnectionsLogContext connectionsLogContext3 = this.$log;
                    HatchComponent hatchComponent2 = HatchComponent.CONNECTIONS_ERROR_STATE;
                    PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
                    String strName = sharedGoalProblem.name();
                    BRg bRgRememberConnectionsImpression = PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext3, hatchComponent2, null, pairsAnalytics.failureReason$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(AnonymousClass001.A0u(strName)), null, strName, bfm, ConnectionsLogContext.$stable | 48, 20);
                    if (SharedGoalScreenKt.isRetryable(this.$uiState$delegate.getValue().problem)) {
                        bfm.AgE(1189249724);
                        boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                        ConnectionsLogContext connectionsLogContext4 = this.$log;
                        SharedGoalViewModel sharedGoalViewModel2 = this.$viewModel;
                        Object objAaT2 = bfm.AaT();
                        if (zA1T || objAaT2 == C78N.A00) {
                            objAaT2 = new SharedGoalScreenKt$SharedGoalScreen$5$2$1(connectionsLogContext4, sharedGoalViewModel2);
                            bfm.Ai0(objAaT2);
                        }
                        function0 = (Function0) objAaT2;
                    } else {
                        bfm.AgE(1189415543);
                    }
                    AnonymousClass001.A1D(bfm);
                    PairsComponentsKt.PairsMessage(strA01, bRgRememberConnectionsImpression, function0, bfm, 0, 0);
                }
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PeerGoalScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(PeerGoalScreenKey peerGoalScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = peerGoalScreenKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SharedGoalScreenKt.SharedGoalScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalTaskMenu$6, reason: invalid class name and case insensitive filesystem */
    public final class C130066 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ G0U<String, Unit> $onRename;
        public final /* synthetic */ Function0<Unit> $onRenameCancel;
        public final /* synthetic */ Function0<Unit> $onRenameClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130066(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$enabled = z;
            this.$onOpen = function0;
            this.$onRenameClick = function02;
            this.$onRename = g0u;
            this.$onRenameCancel = function03;
            this.$onRemove = function04;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SharedGoalScreenKt.SharedGoalTaskMenu(this.$title, this.$enabled, this.$onOpen, this.$onRenameClick, this.$onRename, this.$onRenameCancel, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SharedGoalScreenKt$SharedGoalTaskRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C130072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;
        public final /* synthetic */ Function0<Unit> $onMenuOpen;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ G0U<String, Unit> $onRename;
        public final /* synthetic */ Function0<Unit> $onRenameCancel;
        public final /* synthetic */ Function0<Unit> $onRenameClick;
        public final /* synthetic */ SharedGoalTask $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130072(SharedGoalTask sharedGoalTask, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u2, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$task = sharedGoalTask;
            this.$checked = z;
            this.$enabled = z2;
            this.$onCheckedChange = g0u;
            this.$onMenuOpen = function0;
            this.$onRenameClick = function02;
            this.$onRename = g0u2;
            this.$onRenameCancel = function03;
            this.$onRemove = function04;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SharedGoalScreenKt.SharedGoalTaskRow(this.$task, this.$checked, this.$enabled, this.$onCheckedChange, this.$onMenuOpen, this.$onRenameClick, this.$onRename, this.$onRenameCancel, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
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
            int[] iArr = new int[SharedGoalProblem.values().length];
            try {
                AnonymousClass002.A13(SharedGoalProblem.LOAD_FAILED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SharedGoalProblem.NO_ACCESS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SharedGoalProblem.MISSING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(SharedGoalProblem.RATE_LIMITED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(SharedGoalProblem.HOST_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(SharedGoalProblem.CONFLICT, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(SharedGoalProblem.SAVE_FAILED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SharedGoalContent(SharedGoal sharedGoal, SharedGoalUiState sharedGoalUiState, SharedGoalViewModel sharedGoalViewModel, ConnectionsLogContext connectionsLogContext, boolean z, G0U<? super Boolean, Unit> g0u, float f, float f2, BRg bRg, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        int i3;
        Boolean bool;
        BRg bRg2 = bRg;
        bfm.AgG(2092924395);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(sharedGoal, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(sharedGoalUiState, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(sharedGoalViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0A(bfm, f);
        }
        if ((i & 12582912) == 0) {
            iA05 |= bfm.A62(f2) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        int iA0l = 100663296;
        if (i4 != 0) {
            iA05 |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA05 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 38347923, 38347922), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass005.A0T(bfm, AnonymousClass001.A0T(bRg2)), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(12.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA02);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
                if (!MutableState.A0A(mutableState) || sharedGoalUiState.isSaving) {
                    bfm.AgE(1710640801);
                } else {
                    bfm.AgE(1710484158);
                    SharedGoalChange sharedGoalChange = sharedGoalUiState.draft;
                    boolean zA1Q = ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(sharedGoalUiState))) | AnonymousClass002.A1Q(iA05 & 458752, 131072);
                    Object objAaT2 = bfm.AaT();
                    if (zA1Q || objAaT2 == obj) {
                        objAaT2 = new SharedGoalScreenKt$SharedGoalContent$1$1$1(sharedGoalUiState, g0u, mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    AnonymousClass001.A17(bfm, objAaT2, sharedGoalChange);
                }
                BBI.A0R(bbi, false);
                BS0 bs0 = BRg.A00;
                C01N.A08(bfm, bs0, f);
                if (z) {
                    bfm.AgE(1710718022);
                    boolean z2 = sharedGoalUiState.isSaving;
                    int i5 = iA05 & 7168;
                    int i6 = 458752 & iA05;
                    boolean zA1Q2 = AnonymousClass002.A1Q(i6, 131072) | (i5 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext))) | ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(sharedGoalViewModel)));
                    Object objAaT3 = bfm.AaT();
                    if (zA1Q2 || objAaT3 == obj) {
                        objAaT3 = new SharedGoalScreenKt$SharedGoalContent$1$2$1(connectionsLogContext, sharedGoalViewModel, g0u, mutableState);
                        bfm.Ai0(objAaT3);
                    }
                    G2j g2j = (G2j) objAaT3;
                    boolean zA1Q3 = (i5 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass002.A1Q(i6, 131072);
                    Object objAaT4 = bfm.AaT();
                    if (zA1Q3 || objAaT4 == obj) {
                        objAaT4 = new SharedGoalScreenKt$SharedGoalContent$1$3$1(connectionsLogContext, g0u);
                        bfm.Ai0(objAaT4);
                    }
                    SharedGoalEditorKt.SharedGoalEditor(sharedGoal, z2, g2j, (Function0) objAaT4, null, bfm, SharedGoal.$stable | (iA05 & 14), 16);
                    BBI.A0R(bbi, false);
                    i3 = 256;
                } else if (C7BY.A0j(sharedGoal.summary)) {
                    i3 = 256;
                    bfm.AgE(1711435393);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1711285291);
                    String str = sharedGoal.summary;
                    AuraTheme auraTheme = AuraTheme.INSTANCE;
                    C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
                    long jA07 = C3cH.A07(bfm, auraTheme);
                    i3 = 256;
                    AuraTextKt.m2639AuraTextUY9GdpU(str, null, jA07, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, false);
                }
                if (sharedGoal.totalTasks > 0) {
                    bfm.AgE(1711484094);
                    int i7 = sharedGoal.totalTasks;
                    String strA00 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100038, new Object[]{Integer.valueOf(sharedGoal.completedTasks), Integer.valueOf(i7)}, bfm, i7);
                    AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                    AuraTextKt.m2639AuraTextUY9GdpU(strA00, null, C3cH.A07(bfm, auraTheme2), auraTheme2.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1711831201);
                    BBI.A0R(bbi, false);
                }
                SharedGoalProblem sharedGoalProblem = sharedGoalUiState.problem;
                if (sharedGoalProblem == null) {
                    bfm.AgE(1711875499);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1711875500);
                    boolean zA1X = AnonymousClass002.A1X(sharedGoalUiState.draft);
                    boolean z3 = sharedGoalUiState.isSaving;
                    int i8 = iA05 & 7168;
                    int i9 = iA05 & 896;
                    boolean z4 = (i9 == i3 || ((iA05 & 512) != 0 && bfm.A67(sharedGoalViewModel))) | (i8 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext)));
                    Object objAaT5 = bfm.AaT();
                    if (z4 || objAaT5 == obj) {
                        objAaT5 = new SharedGoalScreenKt$SharedGoalContent$1$4$1$1(connectionsLogContext, sharedGoalViewModel);
                        bfm.Ai0(objAaT5);
                    }
                    Function0 function02 = (Function0) objAaT5;
                    boolean z5 = (i9 == 256 || ((iA05 & 512) != 0 && bfm.A67(sharedGoalViewModel))) | (i8 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext)));
                    Object objAaT6 = bfm.AaT();
                    if (z5 || objAaT6 == obj) {
                        objAaT6 = new SharedGoalScreenKt$SharedGoalContent$1$4$2$1(connectionsLogContext, sharedGoalViewModel);
                        bfm.Ai0(objAaT6);
                    }
                    HatchComponent hatchComponent = HatchComponent.CONNECTIONS_ERROR_STATE;
                    PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
                    String strName = sharedGoalProblem.name();
                    SharedGoalProblemBanner(sharedGoalProblem, zA1X, z3, function02, (Function0) objAaT6, PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, hatchComponent, null, pairsAnalytics.failureReason$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(AnonymousClass001.A0u(strName)), null, FGI.A0M("banner:", strName), bfm, ConnectionsLogContext.$stable | 48 | ((iA05 >> 9) & 14), 20), bfm, 0, 0);
                    BBI.A0R(bbi, false);
                }
                bfm.AgE(-221848752);
                int i10 = 0;
                for (SharedGoalTask sharedGoalTask : sharedGoal.tasks) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        SharedGoalTask sharedGoalTask2 = sharedGoalTask;
                        SharedGoalChange sharedGoalChange2 = sharedGoalUiState.draft;
                        if (sharedGoalChange2 == null || !C7384Etj.areEqual(sharedGoalChange2.taskId, sharedGoalTask2.id)) {
                            sharedGoalChange2 = null;
                        }
                        Map<String, String> mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl = PairsAnalytics.INSTANCE.position$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(i10);
                        boolean zBooleanValue = (sharedGoalChange2 == null || (bool = sharedGoalChange2.completed) == null) ? sharedGoalTask2.isCompleted : bool.booleanValue();
                        boolean z6 = !sharedGoalUiState.isSaving;
                        int i12 = iA05 & 7168;
                        int i13 = iA05 & 896;
                        boolean zA1V = AnonymousClass002.A1V(bfm, sharedGoalTask2, i13 == 256 || ((iA05 & 512) != 0 && bfm.A67(sharedGoalViewModel)), AnonymousClass001.A1S(bfm, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl, i12 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext))));
                        Object objAaT7 = bfm.AaT();
                        if (zA1V || objAaT7 == obj) {
                            objAaT7 = new SharedGoalScreenKt$SharedGoalContent$1$5$1$1(connectionsLogContext, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl, sharedGoalViewModel, sharedGoalTask2);
                            bfm.Ai0(objAaT7);
                        }
                        G0U g0u2 = (G0U) objAaT7;
                        boolean zA1T = AnonymousClass001.A1T(bfm, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl, i12 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext)));
                        Object objAaT8 = bfm.AaT();
                        if (zA1T || objAaT8 == obj) {
                            objAaT8 = new SharedGoalScreenKt$SharedGoalContent$1$5$2$1(connectionsLogContext, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl);
                            bfm.Ai0(objAaT8);
                        }
                        Function0 function03 = (Function0) objAaT8;
                        boolean zA1T2 = AnonymousClass001.A1T(bfm, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl, i12 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext)));
                        Object objAaT9 = bfm.AaT();
                        if (zA1T2 || objAaT9 == obj) {
                            objAaT9 = new SharedGoalScreenKt$SharedGoalContent$1$5$3$1(connectionsLogContext, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl);
                            bfm.Ai0(objAaT9);
                        }
                        Function0 function04 = (Function0) objAaT9;
                        boolean zA1V2 = AnonymousClass002.A1V(bfm, sharedGoalTask2, i13 == 256 || ((iA05 & 512) != 0 && bfm.A67(sharedGoalViewModel)), i12 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext)));
                        Object objAaT10 = bfm.AaT();
                        if (zA1V2 || objAaT10 == obj) {
                            objAaT10 = new SharedGoalScreenKt$SharedGoalContent$1$5$4$1(connectionsLogContext, sharedGoalViewModel, sharedGoalTask2);
                            bfm.Ai0(objAaT10);
                        }
                        G0U g0u3 = (G0U) objAaT10;
                        boolean z7 = i12 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext));
                        Object objAaT11 = bfm.AaT();
                        if (z7 || objAaT11 == obj) {
                            objAaT11 = new SharedGoalScreenKt$SharedGoalContent$1$5$5$1(connectionsLogContext);
                            bfm.Ai0(objAaT11);
                        }
                        Function0 function05 = (Function0) objAaT11;
                        boolean zA1V3 = AnonymousClass002.A1V(bfm, sharedGoalTask2, AnonymousClass001.A1T(bfm, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl, i12 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext))), i13 == 256 || ((iA05 & 512) != 0 && bfm.A67(sharedGoalViewModel)));
                        Object objAaT12 = bfm.AaT();
                        if (zA1V3 || objAaT12 == obj) {
                            objAaT12 = new SharedGoalScreenKt$SharedGoalContent$1$5$6$1(connectionsLogContext, mapPosition$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl, sharedGoalViewModel, sharedGoalTask2);
                            bfm.Ai0(objAaT12);
                        }
                        SharedGoalTaskRow(sharedGoalTask2, zBooleanValue, z6, g0u2, function03, function04, g0u3, function05, (Function0) objAaT12, null, bfm, SharedGoalTask.$stable, 512);
                        i10 = i11;
                    }
                }
                BBI.A0R(bbi, false);
                C01N.A04(bfm, bbi, bs0, f2, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(sharedGoal, sharedGoalUiState, sharedGoalViewModel, connectionsLogContext, z, g0u, f, f2, bRg2, i, i2);
        }
    }

    public static final void SharedGoalProblemBanner(SharedGoalProblem sharedGoalProblem, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1118940134);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, sharedGoalProblem) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA08 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA08 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA08, 74898), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0H = C60R.A0H(bRgA0R, auraTheme.getShapes(bfm, 6).large, C60R.A04(bfm, auraTheme));
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 8.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0H);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, messageRes(sharedGoalProblem)), null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (z && isRetryable(sharedGoalProblem)) {
                bfm.AgE(105606190);
                C9m9 c9m9A00 = AcQ.A00(8.0f);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, C2VU.A05, 6);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f6d);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = auraButtonStyles.secondary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                boolean z3 = !z2;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, null, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, z3, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA08 << 3) & 57344, 0, 134200781);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f6f), null, null, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, z3, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, iA08 & 57344, 0, 134200781);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(106175102);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130052(sharedGoalProblem, z, z2, function0, function02, bRg2, i, i2);
        }
    }

    public static final void SharedGoalScreen(PeerGoalScreenKey peerGoalScreenKey, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(peerGoalScreenKey, 0);
        bfm.AgG(-318131834);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, peerGoalScreenKey) | i : i;
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
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = peerGoalScreenKey.hostMuse;
            String str3 = peerGoalScreenKey.goalId;
            String strA0j = FGI.A0j("shared-goal:", str, ":", str2, ":", str3);
            SharedGoalViewModel.Factory factory = new SharedGoalViewModel.Factory(abstractC3358CGzA0h, str2, str3);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SharedGoalViewModel sharedGoalViewModel = (SharedGoalViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SharedGoalViewModel.class, strA0j);
            C1BO c1boA02 = C2CK.A02(bfm, sharedGoalViewModel.uiState);
            SharedGoal sharedGoal = ((SharedGoalUiState) c1boA02.getValue()).goal;
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = SharedGoalScreenKt$SharedGoalScreen$editing$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT, objArr);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.SHARED_GOAL, bfm, 6);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            if (sharedGoal == null || (strA01 = sharedGoal.title) == null || C7BY.A0j(strA01)) {
                bfm.AgE(1528522265);
                strA01 = peerGoalScreenKey.title;
                if (C7BY.A0j(strA01)) {
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f71);
                }
            } else {
                bfm.AgE(-781978590);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "shared-goal");
            boolean zA1M = AnonymousClass003.A1M(bfm, connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new SharedGoalScreenKt$SharedGoalScreen$3$1(connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRgA00, null, 0L, strA01, null, (Function0) objAaT2, null, false, false, 0, null, null, null, null, null, B1V.A00(bfm, new AnonymousClass4(sharedGoal, connectionsLogContextRememberConnectionsLogContext, mutableStateA0K), 1499889305), 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass5(sharedGoal, sharedGoalViewModel, connectionsLogContextRememberConnectionsLogContext, mutableStateA0K, c1boA02), 200868641), bfm, 6, 1572864, 805306368, 536805292);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(peerGoalScreenKey, bRg2, i, i2);
        }
    }

    public static final void SharedGoalTaskMenu(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(929986374);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function03);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function04);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0R(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass004.A11(bfm, str);
            }
            MutableState mutableState3 = (MutableState) objAaT3;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f79);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f78);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            boolean zA1K = AnonymousClass004.A1K(iA0d);
            Object objAaT4 = bfm.AaT();
            if (zA1K || objAaT4 == obj) {
                objAaT4 = new SharedGoalScreenKt$SharedGoalTaskMenu$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT4);
            }
            ConnectionsComponentsKt.m1650ConnectionsOverflowButtonxfPyhaw((Function0) objAaT4, null, z, 0.0f, 0L, bfm, (iA0d << 3) & 896, 26);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1F = AnonymousClass004.A1F(iA0d) | AnonymousClass003.A1E(iA0d) | AnonymousClass005.A1B(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA1F || objAaT5 == obj) {
                objAaT5 = new SharedGoalScreenKt$SharedGoalTaskMenu$1$2$1(function02, str, function04, mutableState, mutableState3, mutableState2);
                bfm.Ai0(objAaT5);
            }
            G0U g0u2 = (G0U) objAaT5;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = new SharedGoalScreenKt$SharedGoalTaskMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT6);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u2, (Function0) objAaT6, zA0A, null, 0L, null, false, new SharedGoalScreenKt$SharedGoalTaskMenu$1$4(strA01, strA012), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, true);
            if (MutableState.A0A(mutableState2)) {
                bfm.AgE(-1608603619);
                String strA05 = MutableState.A05(mutableState3);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f82);
                String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f7a);
                String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d54);
                Object objAaT7 = bfm.AaT();
                if (objAaT7 == obj) {
                    objAaT7 = new SharedGoalScreenKt$SharedGoalTaskMenu$2$1(mutableState3);
                    bfm.Ai0(objAaT7);
                }
                G0U g0u3 = (G0U) objAaT7;
                boolean zA1F2 = AnonymousClass003.A1F(iA0d, 57344, 16384);
                Object objAaT8 = bfm.AaT();
                if (zA1F2 || objAaT8 == obj) {
                    objAaT8 = new SharedGoalScreenKt$SharedGoalTaskMenu$3$1(g0u, mutableState2, mutableState3);
                    bfm.Ai0(objAaT8);
                }
                Function0 function06 = (Function0) objAaT8;
                Object objAaT9 = bfm.AaT();
                if (objAaT9 == obj) {
                    objAaT9 = new SharedGoalScreenKt$SharedGoalTaskMenu$4$1(mutableState2);
                    bfm.Ai0(objAaT9);
                }
                Function0 function07 = (Function0) objAaT9;
                boolean z2 = (iA0d & 458752) == 131072;
                Object objAaT10 = bfm.AaT();
                if (z2 || objAaT10 == obj) {
                    objAaT10 = new SharedGoalScreenKt$SharedGoalTaskMenu$5$1(function03, mutableState2);
                    bfm.Ai0(objAaT10);
                }
                HatchRenameDialogKt.HatchRenameDialog(strA05, strA01, strA013, strA014, strA015, g0u3, function06, function07, null, false, 0, null, false, (Function0) objAaT10, bfm, 12779520, 0, 7936);
            } else {
                bfm.AgE(-1608077828);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130066(str, z, function0, function02, g0u, function03, function04, bRg2, i, i2);
        }
    }

    public static final boolean isRetryable(SharedGoalProblem sharedGoalProblem) {
        return (sharedGoalProblem == SharedGoalProblem.NO_ACCESS || sharedGoalProblem == SharedGoalProblem.MISSING) ? false : true;
    }

    public static final /* synthetic */ SharedGoalUiState access$SharedGoalScreen$lambda$0(C1BO c1bo) {
        return (SharedGoalUiState) c1bo.getValue();
    }

    public static final int messageRes(SharedGoalProblem sharedGoalProblem) {
        switch (sharedGoalProblem.ordinal()) {
            case 0:
                return R.string._name_removed__res_0x7f120f73;
            case 1:
                return R.string._name_removed__res_0x7f120f75;
            case 2:
                return R.string._name_removed__res_0x7f120f74;
            case 3:
                return R.string._name_removed__res_0x7f120f76;
            case 4:
                return R.string._name_removed__res_0x7f120f72;
            case 5:
                return R.string._name_removed__res_0x7f120f6e;
            case 6:
                return R.string._name_removed__res_0x7f120f7b;
            default:
                throw C3cG.A0q();
        }
    }

    public static final void SharedGoalTaskRow(SharedGoalTask sharedGoalTask, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u2, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        int iA0b;
        long jA06;
        BRg bRg2 = bRg;
        bfm.AgG(-975879466);
        if ((i & 6) == 0) {
            iA0b = AnonymousClass002.A05(AnonymousClass004.A1X(sharedGoalTask, bfm, i) ? 1 : 0) | i;
        } else {
            iA0b = i;
        }
        if ((i & 48) == 0) {
            iA0b |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0b |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0b |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0b |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0b |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((1572864 & i) == 0) {
            iA0b |= AnonymousClass004.A0Z(bfm, g0u2);
        }
        if ((12582912 & i) == 0) {
            iA0b |= AnonymousClass004.A0a(bfm, function03);
        }
        if ((100663296 & i) == 0) {
            iA0b |= AnonymousClass004.A0b(bfm, function04);
        }
        int i3 = i2 & 512;
        int iA0m = 805306368;
        if (i3 != 0) {
            iA0b |= iA0m;
        } else if ((i & 805306368) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA0b |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0b & 306783379, 306783378), bfm, iA0b)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA09 = C3U4.A09(C0v2.A01(C60R.A0F(bfm, AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 52.0f), auraTheme.getShapes(bfm, 6).large, auraTheme), C3cG.A0A(1), g0u, z, z2), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            int i4 = R.drawable.square_outline_24_wght400;
            if (z) {
                i4 = R.drawable.squarecheck_outline_24_wght400;
            }
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, i4, 0), 24.0f, null, C3cH.A06(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            bfm.AgE(1002323196);
            String strA01 = sharedGoalTask.title;
            if (C7BY.A0j(strA01)) {
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f84);
            }
            BBI.A0R(bbi, false);
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            if (!z) {
                bfm.AgE(1002329541);
                jA06 = C3cH.A06(bfm, auraTheme);
            } else {
                bfm.AgE(1002328391);
                jA06 = C3cH.A07(bfm, auraTheme);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0O(c90m, BRg.A00, true), jA06, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            String str = sharedGoalTask.title;
            int i5 = (iA0b >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i6 = iA0b >> 6;
            SharedGoalTaskMenu(str, z2, function0, function02, g0u2, function03, function04, null, bfm, AnonymousClass001.A05(i6, AnonymousClass004.A02(i6, (i6 & 896) | i5 | (i6 & 7168))), 128);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130072(sharedGoalTask, z, z2, g0u, function0, function02, g0u2, function03, function04, bRg2, i, i2);
        }
    }
}
