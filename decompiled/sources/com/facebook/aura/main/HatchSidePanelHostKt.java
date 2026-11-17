package com.facebook.aura.main;

import X.AKH;
import X.AKQ;
import X.AT5;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AYD;
import X.AZ3;
import X.AaL;
import X.AaM;
import X.AbstractC04540eo;
import X.AbstractC1396AiR;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BNH;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0Hi;
import X.C0v5;
import X.C0z7;
import X.C0zJ;
import X.C1051ASv;
import X.C10G;
import X.C11U;
import X.C1247Afe;
import X.C1299Agk;
import X.C1515AkP;
import X.C1743Apg;
import X.C1BO;
import X.C1C3;
import X.C1DI;
import X.C1DM;
import X.C1OP;
import X.C1YD;
import X.C1er;
import X.C2HJ;
import X.C2VU;
import X.C31t;
import X.C3U4;
import X.C3UT;
import X.C3Ue;
import X.C3bf;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.EnumC1820Arj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2k;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelContentKey;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import com.facebook.aura.navigation.SidePanelOpenGestureKt;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.tabs.AuraFixedNavBarKt;
import com.facebook.aura.ui.adaptive.AuraSidePanelPresentation;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSidePanelHostKt {
    public static final int SIDE_PANEL_CLOSE_DURATION_MS = 250;
    public static final float SIDE_PANEL_CLOSE_THRESHOLD_FRACTION = 0.2f;
    public static final float SIDE_PANEL_FLING_VELOCITY_PANEL_WIDTHS_PER_SECOND = 0.6f;
    public static final float SIDE_PANEL_FLOATING_ELEVATION = 8.0f;
    public static final float SIDE_PANEL_FLOATING_INSET = 8.0f;
    public static final float SIDE_PANEL_SCREEN_CORNER_RADIUS = 50.0f;
    public static final float SIDE_PANEL_SCREEN_SHADOW_ELEVATION = 10.0f;

    /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$ConversationHistoryPanel$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $activeListState;
        public final /* synthetic */ LazyListState $archivedListState;
        public final /* synthetic */ Function0<Unit> $closePanel;
        public final /* synthetic */ boolean $isVisible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Function0<Boolean>, Unit> $onBackPressedHandlerChanged;
        public final /* synthetic */ G0U<Boolean, Unit> $onSearchModeChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(boolean z, Function0<Unit> function0, LazyListState lazyListState, LazyListState lazyListState2, G0U<? super Function0<Boolean>, Unit> g0u, G0U<? super Boolean, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$isVisible = z;
            this.$closePanel = function0;
            this.$activeListState = lazyListState;
            this.$archivedListState = lazyListState2;
            this.$onBackPressedHandlerChanged = g0u;
            this.$onSearchModeChanged = g0u2;
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
            HatchSidePanelHostKt.ConversationHistoryPanel(this.$isVisible, this.$closePanel, this.$activeListState, this.$archivedListState, this.$onBackPressedHandlerChanged, this.$onSearchModeChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$DockedSidePanel$4, reason: invalid class name and case insensitive filesystem */
    public final class C126564 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $activeListState;
        public final /* synthetic */ LazyListState $archivedListState;
        public final /* synthetic */ HatchSidePanelDockState $dockState;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126564(HatchSidePanelDockState hatchSidePanelDockState, LazyListState lazyListState, LazyListState lazyListState2, BRg bRg, int i, int i2) {
            super(2);
            this.$dockState = hatchSidePanelDockState;
            this.$activeListState = lazyListState;
            this.$archivedListState = lazyListState2;
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
            HatchSidePanelHostKt.DockedSidePanel(this.$dockState, this.$activeListState, this.$archivedListState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$HatchSidePanelHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchSidePanelDockState $dockState;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchSidePanelDockState hatchSidePanelDockState, BRg bRg, int i, int i2) {
            super(2);
            this.$dockState = hatchSidePanelDockState;
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
            HatchSidePanelHostKt.HatchSidePanelHost(this.$dockState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$HatchSidePanelScreenScrim$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
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
            HatchSidePanelHostKt.HatchSidePanelScreenScrim(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $activeConversationHistoryListState;
        public final /* synthetic */ LazyListState $archivedConversationHistoryListState;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(LazyListState lazyListState, LazyListState lazyListState2, BRg bRg, int i, int i2) {
            super(2);
            this.$activeConversationHistoryListState = lazyListState;
            this.$archivedConversationHistoryListState = lazyListState2;
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
            HatchSidePanelHostKt.ModalSidePanel(this.$activeConversationHistoryListState, this.$archivedConversationHistoryListState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $activeConversationHistoryListState;
        public final /* synthetic */ LazyListState $archivedConversationHistoryListState;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(LazyListState lazyListState, LazyListState lazyListState2, BRg bRg, int i, int i2) {
            super(2);
            this.$activeConversationHistoryListState = lazyListState;
            this.$archivedConversationHistoryListState = lazyListState2;
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
            HatchSidePanelHostKt.ModalSidePanel(this.$activeConversationHistoryListState, this.$archivedConversationHistoryListState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchSidePanelHost(HatchSidePanelDockState hatchSidePanelDockState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchSidePanelDockState, 0);
        bfm.AgG(-1083318979);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchSidePanelDockState) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            LazyListState lazyListStateA002 = AZ3.A00(0, 0, bfm, 0, 3);
            if (hatchSidePanelDockState.dock.isDocked) {
                bfm.AgE(-771177495);
                DockedSidePanel(hatchSidePanelDockState, lazyListStateA00, lazyListStateA002, bRg2, bfm, (iA0d & 14) | ((iA0d << 6) & 7168), 0);
            } else {
                bfm.AgE(-770953117);
                ModalSidePanel(lazyListStateA00, lazyListStateA002, bRg2, bfm, (iA0d << 3) & 896, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchSidePanelDockState, bRg2, i, i2);
        }
    }

    public static final void HatchSidePanelScreenScrim(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-948188812);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
            float fRememberSidePanelWidthPx = SidePanelOpenGestureKt.rememberSidePanelWidthPx(false, bfm, 0, 1);
            EnumC1820Arj enumC1820Arj = (EnumC1820Arj) bfm.A6v(Am0.A0A);
            long j = AnonymousClass002.A0c(bfm).panelTransitionScrim;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120027);
            BRg bRgHatchSidePanelCloseGesture = hatchSidePanelCloseGesture(m1339hatchSidePanelScreenCardxwkQ0AY(AnonymousClass002.A0R(bRg2, bfm, -676340404), hatchSidePanelController, fRememberSidePanelWidthPx, enumC1820Arj, B6A.A06), AnonymousClass002.A1X(hatchSidePanelController.getContentKey()), fRememberSidePanelWidthPx, hatchSidePanelController, enumC1820Arj);
            if (hatchSidePanelController.getContentKey() != null) {
                BS0 bs0 = BRg.A00;
                C1YD c1yd = new C1YD(0);
                boolean zA67 = bfm.A67(hatchSidePanelController);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchSidePanelHostKt$HatchSidePanelScreenScrim$1$1$1(hatchSidePanelController);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA04 = C0v5.A04(bs0, c1yd, null, (Function0) objAaT, true);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSidePanelHostKt$HatchSidePanelScreenScrim$1$2$1(strA01);
                    bfm.Ai0(objAaT2);
                }
                bRgHatchSidePanelCloseGesture = bRgHatchSidePanelCloseGesture.then(AnonymousClass001.A0Y(bRgA04, objAaT2, false));
            }
            AnonymousClass001.A1D(bfm);
            boolean zA1T = AnonymousClass002.A1T(bfm, j, bfm.A67(hatchSidePanelController), bfm.A62(fRememberSidePanelWidthPx));
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == C78N.A00) {
                objAaT3 = new HatchSidePanelHostKt$HatchSidePanelScreenScrim$2$1(hatchSidePanelController, fRememberSidePanelWidthPx, j);
                bfm.Ai0(objAaT3);
            }
            C0zJ.A00(bRgHatchSidePanelCloseGesture, (G0U) objAaT3, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    /* renamed from: hatchSidePanelScreenCard-xwkQ0AY, reason: not valid java name */
    public static final BRg m1339hatchSidePanelScreenCardxwkQ0AY(BRg bRg, HatchSidePanelController hatchSidePanelController, float f, EnumC1820Arj enumC1820Arj, long j) {
        AnonymousClass005.A0y(bRg, hatchSidePanelController, enumC1820Arj);
        return AbstractC1396AiR.A00(bRg, new HatchSidePanelHostKt$hatchSidePanelScreenCard$1(hatchSidePanelController, f, enumC1820Arj, j));
    }

    public static final void ConversationHistoryPanel(boolean z, Function0<Unit> function0, LazyListState lazyListState, LazyListState lazyListState2, G0U<? super Function0<Boolean>, Unit> g0u, G0U<? super Boolean, Unit> g0u2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1171128254);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, lazyListState);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, lazyListState2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0n |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0n |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0n, 599186), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            int i4 = iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigatorA0b, AnonymousClass002.A1Q(i4, 32));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchSidePanelHostKt$ConversationHistoryPanel$1$1(function0, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSidePanelHostKt$ConversationHistoryPanel$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            Function0 function03 = (Function0) objAaT2;
            boolean zA1T2 = AnonymousClass001.A1T(bfm, auraNavigatorA0b, i4 == 32);
            Object objAaT3 = bfm.AaT();
            if (zA1T2 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchSidePanelHostKt$ConversationHistoryPanel$3$1(function0, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            HatchConversationHistorySidePanelKt.HatchConversationHistorySidePanelContent(function0, function02, function03, (G2k) objAaT3, lazyListState, lazyListState2, bRg2, z, g0u, g0u2, bfm, AnonymousClass004.A01(iA0n << 12, AnonymousClass001.A0C(iA0n << 21, AnonymousClass004.A03(iA0n << 6, (iA0n >> 3) & 14) | (3670016 & iA0n))), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(z, function0, lazyListState, lazyListState2, g0u, g0u2, bRg2, i, i2);
        }
    }

    public static final void DockedSidePanel(HatchSidePanelDockState hatchSidePanelDockState, LazyListState lazyListState, LazyListState lazyListState2, BRg bRg, BFM bfm, int i, int i2) {
        float f;
        BRg bRg2 = bRg;
        bfm.AgG(-702339603);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, hatchSidePanelDockState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, lazyListState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, lazyListState2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            float visiblePanelProgress = hatchSidePanelDockState.getVisiblePanelProgress();
            float f2 = hatchSidePanelDockState.dock.railWidth;
            if (hatchSidePanelDockState.isRailVisible()) {
                BRg bRgA0R = AnonymousClass002.A0R(bRg2, bfm, 1681957257);
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0E, false);
                f = 0.0f;
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0R);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                    BRg bRgA0C = C3U4.A0C(BNH.A00(new C1OP(C1743Apg.A01(bfm).A0D, C1743Apg.A01(bfm).A01), C0z7.A00.A4C(C2VU.A0B, BRg.A00)), (f2 - AuraFixedNavBarKt.TAB_RAIL_WIDTH) / 2.0f, 0.0f, 0.0f, 0.0f);
                    boolean zA62 = bfm.A62(visiblePanelProgress) | bfm.A62(f2);
                    Object objAaT2 = bfm.AaT();
                    if (zA62 || objAaT2 == obj) {
                        objAaT2 = new HatchSidePanelHostKt$DockedSidePanel$1$1$1(visiblePanelProgress, f2);
                        bfm.Ai0(objAaT2);
                    }
                    AuraFixedNavBarKt.AuraTabRail(AnonymousClass001.A0W(bRgA0C, objAaT2), bfm, 0, 0);
                    BBI.A0R(bbi, true);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            f = 0.0f;
            bfm.AgE(1682491573);
            BBI bbi2 = (BBI) bfm;
            BBI.A0R(bbi2, false);
            if (visiblePanelProgress > f) {
                bfm.AgE(1682546505);
                boolean zA1X = AnonymousClass002.A1X(mutableState.getValue());
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = new HatchSidePanelHostKt$DockedSidePanel$2$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                B81.A00(zA1X, (Function0) objAaT3, bfm, 48, 0);
                BRg bRgA0T = AnonymousClass001.A0T(bRg2);
                Alignment alignment = C2VU.A0E;
                InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                int iA0J2 = AnonymousClass003.A0J(bbi2);
                AKQ akqA042 = BBI.A04(bbi2);
                BRg bRgA012 = AxM.A01(bfm, bRgA0T);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi2.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi2, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA012, akqA042, bRgA012, iA0J2);
                    C0z7 c0z7 = C0z7.A00;
                    Object objAaT4 = bfm.AaT();
                    if (objAaT4 == obj) {
                        objAaT4 = HatchSidePanelHostKt$DockedSidePanel$3$1$1.INSTANCE;
                        bfm.Ai0(objAaT4);
                    }
                    Function0 function03 = (Function0) objAaT4;
                    Object objAaT5 = bfm.AaT();
                    if (objAaT5 == obj) {
                        objAaT5 = new HatchSidePanelHostKt$DockedSidePanel$3$2$1(mutableState);
                        bfm.Ai0(objAaT5);
                    }
                    G0U g0u = (G0U) objAaT5;
                    Object objAaT6 = bfm.AaT();
                    if (objAaT6 == obj) {
                        objAaT6 = HatchSidePanelHostKt$DockedSidePanel$3$3$1.INSTANCE;
                        bfm.Ai0(objAaT6);
                    }
                    G0U g0u2 = (G0U) objAaT6;
                    BRg bRgThen = C10G.A08(BRg.A00, SidePanelLocalsKt.HATCH_SIDE_PANEL_DOCK_WIDTH).then(C10G.A00);
                    boolean zA622 = bfm.A62(visiblePanelProgress);
                    Object objAaT7 = bfm.AaT();
                    if (zA622 || objAaT7 == obj) {
                        objAaT7 = new HatchSidePanelHostKt$DockedSidePanel$3$4$1(visiblePanelProgress);
                        bfm.Ai0(objAaT7);
                    }
                    BRg bRgA4C = c0z7.A4C(alignment, hatchFloatingSidePanelCard(AYD.A03(bRgThen, (G0U) objAaT7), bfm, 0));
                    int i4 = iA0d << 3;
                    ConversationHistoryPanel(true, function03, lazyListState, lazyListState2, g0u, g0u2, bRgA4C, bfm, (i4 & 896) | 221238 | (i4 & 7168), 0);
                    BBI.A0R(bbi2, true);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(1683419093);
            BBI.A0R(bbi2, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126564(hatchSidePanelDockState, lazyListState, lazyListState2, bRg2, i, i2);
        }
    }

    public static final void ModalSidePanel(LazyListState lazyListState, LazyListState lazyListState2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass12;
        BRg bRg2 = bRg;
        bfm.AgG(-2130120439);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, lazyListState2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
            C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
            float fRememberSidePanelWidthDp = SidePanelOpenGestureKt.rememberSidePanelWidthDp(MutableState.A0A(hatchSidePanelController.isSearchExpanded$delegate), bfm, 0, 0);
            C1BO c1boA02 = C31t.A02(AnonymousClass003.A0Q(null), bfm, null, fRememberSidePanelWidthDp, 432, 8);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            float fAh4 = axnA0Y.Ah4(C1BO.A00(c1boA02));
            float fAh42 = axnA0Y.Ah4(fRememberSidePanelWidthDp);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            AT5 at5 = (AT5) AnonymousClass005.A0e(bfm, objAaT, obj);
            MutableState mutableState = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState mutableStateA00 = C1er.A00(bfm, Float.valueOf(fAh4));
            boolean zA1M = AnonymousClass003.A1M(bfm, at5, hatchSidePanelController);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new HatchSidePanelHostKt$ModalSidePanel$1$1(at5, hatchSidePanelController, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, at5);
            AuraSidePanelPresentation presentation = hatchSidePanelController.getPresentation();
            boolean zA67 = bfm.A67(at5);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchSidePanelHostKt$ModalSidePanel$2$1(at5, mutableState, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, presentation);
            HatchSidePanelContentKey contentKey = hatchSidePanelController.getContentKey();
            boolean zA1O = AnonymousClass003.A1O(bfm, c0Hi, c1c3, bfm.A67(hatchSidePanelController));
            Object objAaT4 = bfm.AaT();
            if (zA1O || objAaT4 == obj) {
                objAaT4 = new HatchSidePanelHostKt$ModalSidePanel$3$1(hatchSidePanelController, c0Hi, c1c3);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, contentKey);
            HatchSidePanelContentKey contentKey2 = hatchSidePanelController.getContentKey();
            Float fValueOf = Float.valueOf(fAh42);
            boolean zA1M2 = AnonymousClass003.A1M(bfm, hatchSidePanelController, at5) | bfm.A62(fAh42);
            Object objAaT5 = bfm.AaT();
            if (zA1M2 || objAaT5 == obj) {
                objAaT5 = new HatchSidePanelHostKt$ModalSidePanel$4$1(hatchSidePanelController, at5, fAh42, mutableState, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A1A(bfm, objAaT5, contentKey2, fValueOf);
            HatchSidePanelContentKey openDragContentKey = hatchSidePanelController.getOpenDragContentKey();
            boolean zA1O2 = AnonymousClass003.A1O(bfm, c0Hi, c1c3, bfm.A67(hatchSidePanelController));
            Object objAaT6 = bfm.AaT();
            if (zA1O2 || objAaT6 == obj) {
                objAaT6 = new HatchSidePanelHostKt$ModalSidePanel$5$1(hatchSidePanelController, c0Hi, c1c3, null);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A18(bfm, objAaT6, openDragContentKey);
            Integer numValueOf = Integer.valueOf(hatchSidePanelController.openDragCancelToken$delegate.AGd());
            boolean zA1O3 = AnonymousClass003.A1O(bfm, at5, mutableStateA00, bfm.A67(hatchSidePanelController));
            Object objAaT7 = bfm.AaT();
            if (zA1O3 || objAaT7 == obj) {
                objAaT7 = new HatchSidePanelHostKt$ModalSidePanel$6$1(hatchSidePanelController, at5, mutableState, mutableStateA00, null);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A18(bfm, objAaT7, numValueOf);
            Integer numValueOf2 = Integer.valueOf(hatchSidePanelController.closeToken$delegate.AGd());
            boolean zA1M3 = AnonymousClass003.A1M(bfm, hatchSidePanelController, at5);
            Object objAaT8 = bfm.AaT();
            if (zA1M3 || objAaT8 == obj) {
                objAaT8 = new HatchSidePanelHostKt$ModalSidePanel$7$1(hatchSidePanelController, at5, mutableState, null);
                bfm.Ai0(objAaT8);
            }
            AnonymousClass001.A18(bfm, objAaT8, numValueOf2);
            Integer numValueOf3 = Integer.valueOf(hatchSidePanelController.openDragToken$delegate.AGd());
            boolean zA1U = AnonymousClass005.A1U(bfm, c1c3, at5, mutableStateA00, AnonymousClass003.A1M(bfm, hatchSidePanelController, c0Hi));
            Object objAaT9 = bfm.AaT();
            if (zA1U || objAaT9 == obj) {
                objAaT9 = new HatchSidePanelHostKt$ModalSidePanel$8$1(hatchSidePanelController, c0Hi, c1c3, at5, mutableState, mutableStateA00, null);
                bfm.Ai0(objAaT9);
            }
            AnonymousClass001.A18(bfm, objAaT9, numValueOf3);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120608);
            HatchSidePanelContentKey contentKey3 = hatchSidePanelController.getContentKey();
            if (contentKey3 == null && (contentKey3 = hatchSidePanelController.getOpenDragContentKey()) == null && (!MutableState.A0A(mutableState) || (contentKey3 = HatchSidePanelContentKey.ConversationHistory.INSTANCE) == null)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass12 = new AnonymousClass9(lazyListState, lazyListState2, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass12;
                }
                return;
            }
            bfm.AgE(1653829183);
            bfm.AgE(1653816770);
            BS0 bs0 = BRg.A00;
            BRg bRgThen = C10G.A08(bs0, C1BO.A00(c1boA02)).then(C10G.A00);
            boolean zA1M4 = AnonymousClass003.A1M(bfm, hatchSidePanelController, at5) | bfm.A62(fAh4);
            Object objAaT10 = bfm.AaT();
            if (zA1M4 || objAaT10 == obj) {
                objAaT10 = new HatchSidePanelHostKt$ModalSidePanel$panelModifier$1$1(hatchSidePanelController, at5, fAh4);
                bfm.Ai0(objAaT10);
            }
            BRg bRgA03 = AYD.A03(bRgThen, (G0U) objAaT10);
            if (hatchSidePanelController.getPresentation().getFloatsOverScreen()) {
                bRgA03 = bRgA03.then(hatchFloatingSidePanelCard(bs0, bfm, 6));
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BRg bRgHatchSidePanelCloseGesture = hatchSidePanelCloseGesture(bRgA03, AnonymousClass002.A1X(hatchSidePanelController.getContentKey()), fAh4, hatchSidePanelController, enumC1820ArjA0d);
            if (hatchSidePanelController.getContentKey() != null) {
                boolean zA65 = bfm.A65(strA01);
                Object objAaT11 = bfm.AaT();
                if (zA65 || objAaT11 == obj) {
                    objAaT11 = new HatchSidePanelHostKt$ModalSidePanel$panelModifier$3$1$1(strA01);
                    bfm.Ai0(objAaT11);
                }
                bRgHatchSidePanelCloseGesture = bRgHatchSidePanelCloseGesture.then(AnonymousClass001.A0Y(bs0, objAaT11, false));
            }
            BBI.A0R(bbi, false);
            if (hatchSidePanelController.getContentKey() != null) {
                boolean zA1Z = AnonymousClass001.A1Z(hatchSidePanelController, bfm, -270730982);
                Object objAaT12 = bfm.AaT();
                if (zA1Z || objAaT12 == obj) {
                    objAaT12 = new HatchSidePanelHostKt$ModalSidePanel$10$1(hatchSidePanelController, mutableState2);
                    bfm.Ai0(objAaT12);
                }
                B81.A00(false, (Function0) objAaT12, bfm, 0, 1);
            } else {
                bfm.AgE(-270393671);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (!contentKey3.equals(HatchSidePanelContentKey.ConversationHistory.INSTANCE)) {
                throw AnonymousClass003.A0k(bfm, bbi, -1158519503);
            }
            bfm.AgE(-1158516688);
            boolean z = hatchSidePanelController.getContentKey() != null;
            boolean zA672 = bfm.A67(hatchSidePanelController);
            Object objAaT13 = bfm.AaT();
            if (zA672 || objAaT13 == obj) {
                objAaT13 = new HatchSidePanelHostKt$ModalSidePanel$11$1$1(hatchSidePanelController);
                bfm.Ai0(objAaT13);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT13);
            Object objAaT14 = bfm.AaT();
            if (objAaT14 == obj) {
                objAaT14 = new HatchSidePanelHostKt$ModalSidePanel$11$2$1(mutableState2);
                bfm.Ai0(objAaT14);
            }
            G0U g0u = (G0U) objAaT14;
            boolean zA673 = bfm.A67(hatchSidePanelController);
            Object objAaT15 = bfm.AaT();
            if (zA673 || objAaT15 == obj) {
                objAaT15 = new HatchSidePanelHostKt$ModalSidePanel$11$3$1(hatchSidePanelController);
                bfm.Ai0(objAaT15);
            }
            BRg bRgA4C = c0z7.A4C(alignment, bRgHatchSidePanelCloseGesture);
            int i4 = iA0d << 6;
            ConversationHistoryPanel(z, function02, lazyListState, lazyListState2, g0u, (G0U) ((InterfaceC7353EnQ) objAaT15), bRgA4C, bfm, (i4 & 7168) | (i4 & 896) | RuntimeInternals.IOPRIO_BACKGROUND, 0);
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass12 = new AnonymousClass12(lazyListState, lazyListState2, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass12;
        }
    }

    public static final float currentRevealPx(HatchSidePanelController hatchSidePanelController, float f) {
        if (hatchSidePanelController.dragOffsetPx$delegate.AFn() > 0.0f) {
            f = hatchSidePanelController.dragOffsetPx$delegate.AFn();
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    public static final BRg hatchSidePanelCloseGesture(BRg bRg, boolean z, final float f, final HatchSidePanelController hatchSidePanelController, final EnumC1820Arj enumC1820Arj) {
        if (!z) {
            return bRg;
        }
        Object[] objArr = {Float.valueOf(f), hatchSidePanelController, enumC1820Arj};
        PointerInputEventHandler pointerInputEventHandler = new PointerInputEventHandler() { // from class: com.facebook.aura.main.HatchSidePanelHostKt.hatchSidePanelCloseGesture.1

            /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$hatchSidePanelCloseGesture$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02341 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                public final /* synthetic */ HatchSidePanelController $controller;
                public final /* synthetic */ C1051ASv $dragDistance;
                public final /* synthetic */ float $panelWidthPx;
                public final /* synthetic */ C1051ASv $rawVelocityX;
                public final /* synthetic */ C3UT $velocityTracker;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C02341(C1051ASv c1051ASv, C1051ASv c1051ASv2, C3UT c3ut, HatchSidePanelController hatchSidePanelController, float f) {
                    super(1);
                    this.$dragDistance = c1051ASv;
                    this.$rawVelocityX = c1051ASv2;
                    this.$velocityTracker = c3ut;
                    this.$controller = hatchSidePanelController;
                    this.$panelWidthPx = f;
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                    m1343invokek4lQ0M(aWx.A00);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m1343invokek4lQ0M(long j) {
                    this.$dragDistance.element = 0.0f;
                    this.$rawVelocityX.element = 0.0f;
                    this.$velocityTracker.A00.AbS();
                    this.$controller.updateDragOffset(this.$panelWidthPx);
                }
            }

            /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$hatchSidePanelCloseGesture$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
                public final /* synthetic */ HatchSidePanelController $controller;
                public final /* synthetic */ C1051ASv $dragDistance;
                public final /* synthetic */ float $flingVelocityThreshold;
                public final /* synthetic */ C1051ASv $rawVelocityX;
                public final /* synthetic */ float $threshold;
                public final /* synthetic */ float $towardsOpen;
                public final /* synthetic */ C3UT $velocityTracker;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(C3UT c3ut, float f, C1051ASv c1051ASv, float f2, float f3, C1051ASv c1051ASv2, HatchSidePanelController hatchSidePanelController) {
                    super(0);
                    this.$velocityTracker = c3ut;
                    this.$towardsOpen = f;
                    this.$dragDistance = c1051ASv;
                    this.$threshold = f2;
                    this.$flingVelocityThreshold = f3;
                    this.$rawVelocityX = c1051ASv2;
                    this.$controller = hatchSidePanelController;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    float fA03 = AnonymousClass003.A03(this.$velocityTracker.A00()) * this.$towardsOpen;
                    if (this.$dragDistance.element < this.$threshold) {
                        float f = -this.$flingVelocityThreshold;
                        if (fA03 > f && this.$rawVelocityX.element > f) {
                            this.$controller.settleOpenFromDrag();
                            return;
                        }
                    }
                    HatchInteractionLogger.INSTANCE.logSwipe(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.THREAD_SIDEBAR, null);
                    this.$controller.close();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$hatchSidePanelCloseGesture$1$3, reason: invalid class name */
            public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
                public final /* synthetic */ HatchSidePanelController $controller;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(HatchSidePanelController hatchSidePanelController) {
                    super(0);
                    this.$controller = hatchSidePanelController;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$controller.settleOpenFromDrag();
                }
            }

            /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$hatchSidePanelCloseGesture$1$4, reason: invalid class name */
            public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<C1299Agk, Float, Unit> {
                public final /* synthetic */ HatchSidePanelController $controller;
                public final /* synthetic */ C1051ASv $dragDistance;
                public final /* synthetic */ float $panelWidthPx;
                public final /* synthetic */ C1051ASv $rawVelocityX;
                public final /* synthetic */ float $towardsOpen;
                public final /* synthetic */ C3UT $velocityTracker;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(float f, C1051ASv c1051ASv, float f2, C3UT c3ut, C1051ASv c1051ASv2, HatchSidePanelController hatchSidePanelController) {
                    super(2);
                    this.$towardsOpen = f;
                    this.$dragDistance = c1051ASv;
                    this.$panelWidthPx = f2;
                    this.$velocityTracker = c3ut;
                    this.$rawVelocityX = c1051ASv2;
                    this.$controller = hatchSidePanelController;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, Float f) {
                    invoke(c1299Agk, AnonymousClass001.A02(f));
                    return Unit.INSTANCE;
                }

                public final void invoke(C1299Agk c1299Agk, float f) {
                    C7384Etj.A0Y(c1299Agk, 0);
                    float f2 = f * this.$towardsOpen;
                    C1051ASv c1051ASv = this.$dragDistance;
                    c1051ASv.element = ATD.A03(c1051ASv.element - f2, 0.0f, this.$panelWidthPx);
                    C3UT c3ut = this.$velocityTracker;
                    long j = c1299Agk.A0C;
                    long j2 = c1299Agk.A0B;
                    C2HJ c2hj = c3ut.A00;
                    c2hj.A3p(j, j2);
                    c2hj.A3p(c1299Agk.A0E, c1299Agk.A0A);
                    this.$rawVelocityX.element = HatchSidePanelHostKt.horizontalVelocityPxPerSecond(c1299Agk) * this.$towardsOpen;
                    float f3 = this.$dragDistance.element;
                    if (f3 > 0.0f || f2 < 0.0f) {
                        c1299Agk.A02();
                    }
                    this.$controller.updateDragOffset(this.$panelWidthPx - f3);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                float f2 = HatchSidePanelHostKt.towardsOpenSign(enumC1820Arj);
                float f3 = f;
                C3UT c3ut = new C3UT();
                C1051ASv c1051ASv = new C1051ASv();
                C1051ASv c1051ASv2 = new C1051ASv();
                HatchSidePanelController hatchSidePanelController2 = hatchSidePanelController;
                float f4 = f;
                Object objA0l = AnonymousClass006.A0l(bRr, htJ, new C3bf(null, new AnonymousClass2(c3ut, f2, c1051ASv, f3 * 0.2f, f3 * 0.6f, c1051ASv2, hatchSidePanelController2), new AnonymousClass3(hatchSidePanelController2), new C02341(c1051ASv, c1051ASv2, c3ut, hatchSidePanelController2, f4), new AnonymousClass4(f2, c1051ASv, f4, c3ut, c1051ASv2, hatchSidePanelController2), 0));
                return objA0l != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0l;
            }
        };
        C1247Afe c1247Afe = AaM.A00;
        return bRg.then(new AaL(pointerInputEventHandler, null, null, objArr));
    }

    /* renamed from: hatchSidePanelScreenCard-xwkQ0AY$default, reason: not valid java name */
    public static /* synthetic */ BRg m1340hatchSidePanelScreenCardxwkQ0AY$default(BRg bRg, HatchSidePanelController hatchSidePanelController, float f, EnumC1820Arj enumC1820Arj, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = B6A.A06;
        }
        return m1339hatchSidePanelScreenCardxwkQ0AY(bRg, hatchSidePanelController, f, enumC1820Arj, j);
    }

    public static final float horizontalVelocityPxPerSecond(C1299Agk c1299Agk) {
        long j = c1299Agk.A0E - c1299Agk.A0C;
        if (j < 1) {
            j = 1;
        }
        return ((AnonymousClass001.A00(c1299Agk.A0A) - AnonymousClass001.A00(c1299Agk.A0B)) * 1000.0f) / j;
    }

    public static /* synthetic */ void openChatFromSidePanel$default(AuraNavigator auraNavigator, ConversationScreenKey conversationScreenKey, int i, Object obj) {
        if ((i & 1) != 0) {
            conversationScreenKey = null;
        }
        openChatFromSidePanel(auraNavigator, conversationScreenKey);
    }

    public static final float towardsOpenSign(EnumC1820Arj enumC1820Arj) {
        return enumC1820Arj == EnumC1820Arj.A03 ? -1.0f : 1.0f;
    }

    public static final /* synthetic */ Function0 access$DockedSidePanel$lambda$1(MutableState mutableState) {
        return (Function0) mutableState.getValue();
    }

    public static final /* synthetic */ Function0 access$ModalSidePanel$lambda$8(MutableState mutableState) {
        return (Function0) mutableState.getValue();
    }

    public static final BRg hatchFloatingSidePanelCard(BRg bRg, BFM bfm, int i) {
        C1DM c1dm = AnonymousClass002.A0e(bfm).elevated;
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long jA0F = C06G.A0F(bfm, akh);
        return C1DI.A02(C11U.A03(AbstractC04540eo.A00(C3U4.A09(BNH.A00(new C1OP(C1743Apg.A01(bfm).A0D, C1743Apg.A01(bfm).A01), bRg), SIDE_PANEL_FLOATING_INSET), c1dm, SIDE_PANEL_FLOATING_ELEVATION, 4, jA0F, jA0F), c1dm), c1dm, 1.0f, C06G.A0E(bfm, akh));
    }

    public static final void openChatFromSidePanel(AuraNavigator auraNavigator, ConversationScreenKey conversationScreenKey) {
        AnonymousClass006.A1D(auraNavigator);
        if (conversationScreenKey != null) {
            auraNavigator.navigate((AuraNavKey) conversationScreenKey, false);
        }
    }
}
