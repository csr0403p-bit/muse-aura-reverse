package com.facebook.aura.status.view;

import X.AEk;
import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AXN;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.Akx;
import X.Am0;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00q;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0881AGi;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1251Afj;
import X.C1515AkP;
import X.C1743Apg;
import X.C1BO;
import X.C1DI;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C8jn;
import X.C90m;
import X.Ey9;
import X.F60;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.graphics.Bitmap;
import android.graphics.Paint;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionApprovalsScreenKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.hatch.HatchTimeSpentLogger;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearanceKt;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepositoryKt;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.main.api.TimeSpentModules;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import com.facebook.aura.navigation.key.HatchStatusTab;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.api.StatusTab;
import com.facebook.aura.status.api.StatusTabEntry;
import com.facebook.aura.status.viewmodel.HatchStatusState;
import com.facebook.aura.status.viewmodel.HatchStatusUiState;
import com.facebook.aura.status.viewmodel.HatchStatusViewModel;
import com.facebook.aura.status.viewmodel.HatchSubAgentUiModel;
import com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.header.AuraPageHeaderKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.segmentedtabs.AuraSegmentedTabsKt;
import com.facebook.aura.vds.compose.segmentedtabs.IconTab;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchStatusScreenKt {
    public static final int EDIT_MENU_CHANGE_AVATAR = 1;
    public static final int EDIT_MENU_CHANGE_VOICE = 4;
    public static final int EDIT_MENU_EDIT_NAME = 2;
    public static final int EDIT_MENU_SHARE_AVATAR = 3;
    public static final float TAB_SHADOW_BLUR = 16.0f;
    public static final float TAB_SHADOW_MAX_ALPHA = 0.08f;
    public static final float TAB_SHADOW_THRESHOLD = 48.0f;

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$CloseButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCloseClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onCloseClick = function0;
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
            HatchStatusScreenKt.CloseButton(this.$onCloseClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$EditMenuButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChangeAvatar;
        public final /* synthetic */ G0U<String, Unit> $onChangeVoice;
        public final /* synthetic */ G0U<String, Unit> $onEditName;
        public final /* synthetic */ Function0<Unit> $onShareAvatar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, G0U<? super String, Unit> g0u3, BRg bRg, int i, int i2) {
            super(2);
            this.$onChangeAvatar = g0u;
            this.$onEditName = g0u2;
            this.$onShareAvatar = function0;
            this.$onChangeVoice = g0u3;
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
            HatchStatusScreenKt.EditMenuButton(this.$onChangeAvatar, this.$onEditName, this.$onShareAvatar, this.$onChangeVoice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$HatchStatusScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ List<StatusTab> $extensionTabs;
        public final /* synthetic */ String $initialExtensionTab;
        public final /* synthetic */ MutableState<Boolean> $isTabSelectionLocked$delegate;
        public final /* synthetic */ boolean $isTasksInActivity;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ G0V<String, Bitmap, Unit> $onNavigateToConversation;
        public final /* synthetic */ MutableState<String> $pendingExtensionAction$delegate;
        public final /* synthetic */ int $selectedTab;
        public final /* synthetic */ MutableState<StatusTabEntry> $selectedTabEntry$delegate;
        public final /* synthetic */ MutableState<String> $selectedTabId$delegate;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ List<String> $tabIds;
        public final /* synthetic */ C1BO<HatchStatusUiState> $uiState$delegate;
        public final /* synthetic */ HatchStatusViewModel $viewModel;
        public final /* synthetic */ AHD<HatchStatusTab> $visibleTabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(AXN axn, int i, HatchStatusViewModel hatchStatusViewModel, Function0<Unit> function0, C1BO<HatchStatusUiState> c1bo, List<? extends StatusTab> list, AHD<? extends HatchStatusTab> ahd, MutableState<String> mutableState, boolean z, String str, G0V<? super String, ? super Bitmap, Unit> g0v, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, List<String> list2, String str2, MutableState<StatusTabEntry> mutableState4) {
            super(2);
            this.$density = axn;
            this.$selectedTab = i;
            this.$viewModel = hatchStatusViewModel;
            this.$onDismissRequest = function0;
            this.$uiState$delegate = c1bo;
            this.$extensionTabs = list;
            this.$visibleTabs = ahd;
            this.$pendingExtensionAction$delegate = mutableState;
            this.$isTasksInActivity = z;
            this.$sessionId = str;
            this.$onNavigateToConversation = g0v;
            this.$isTabSelectionLocked$delegate = mutableState2;
            this.$selectedTabId$delegate = mutableState3;
            this.$tabIds = list2;
            this.$initialExtensionTab = str2;
            this.$selectedTabEntry$delegate = mutableState4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                bfm.AgE(133453142);
                AXN axn = this.$density;
                float fAgy = axn.Agy(C1743Apg.A01(bfm).A04.ACy(axn));
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A01;
                BRg bRgA02 = AbstractC1754Apr.A02(c1062ATq);
                int i2 = this.$selectedTab;
                HatchStatusViewModel hatchStatusViewModel = this.$viewModel;
                Function0<Unit> function0 = this.$onDismissRequest;
                C1BO<HatchStatusUiState> c1bo = this.$uiState$delegate;
                List<StatusTab> list = this.$extensionTabs;
                AHD<HatchStatusTab> ahd = this.$visibleTabs;
                MutableState<String> mutableState = this.$pendingExtensionAction$delegate;
                boolean z = this.$isTasksInActivity;
                String str = this.$sessionId;
                G0V<String, Bitmap, Unit> g0v = this.$onNavigateToConversation;
                MutableState<Boolean> mutableState2 = this.$isTabSelectionLocked$delegate;
                MutableState<String> mutableState3 = this.$selectedTabId$delegate;
                List<String> list2 = this.$tabIds;
                String str2 = this.$initialExtensionTab;
                MutableState<StatusTabEntry> mutableState4 = this.$selectedTabEntry$delegate;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                long j = bbi.A06;
                int i3 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA02);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0U, g0v2);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i3);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                Alignment alignment = C2VU.A0E;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA01, g0v2);
                BPg.A02(bfm, akqA042, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraPageHeaderKt.AuraPageHeader(null, null, null, new AuraToolbarAgent.Config(false, AuraToolbarAgent.NavIconType.Back.INSTANCE, null, true, null, false, C0881AGi.A00, false, null, null, false, null, false, null, true, null, false, false), false, B1V.A00(bfm, new HatchStatusScreenKt$HatchStatusScreen$5$1$1$1(hatchStatusViewModel, function0, c1bo), 1220726082), null, bfm, (AuraToolbarAgent.Config.$stable << 9) | 221184, 71);
                HatchStatusHeaderKt.m2227HatchStatusHeaderosbwsH8(null, c1bo.getValue().botName, HatchAvatarSizeKt.rememberStatusSheetAvatarSizeDp(HatchAvatarSizeRepositoryKt.rememberHatchAvatarSize(bfm, 0), bfm, 0), true, c1bo.getValue().headerUiState, c1bo.getValue().outOfCreditsCta, bfm, 3072, 1);
                BBI.A0R(bbi, true);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = AnonymousClass004.A11(bfm, 0);
                }
                MutableState mutableState5 = (MutableState) objAaT;
                AKH<AXN> akh = Am0.A04;
                float fAh4 = ((AXN) bfm.A6v(akh)).Ah4(HatchStatusScreenKt.TAB_SHADOW_THRESHOLD);
                final C00q c00q = (C00q) AnonymousClass007.A0T(bfm, obj);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = new Akx() { // from class: com.facebook.aura.status.view.HatchStatusScreenKt$HatchStatusScreen$5$1$tabShadowConnection$1$1
                        @Override // X.Akx
                        /* renamed from: onPostScroll-DzOQY0M */
                        public long mo4onPostScrollDzOQY0M(long j2, long j3, int i4) {
                            C00q c00q2 = c00q;
                            float fAFn = c00q2.AFn() - AnonymousClass004.A00(j2);
                            if (fAFn < 0.0f) {
                                fAFn = 0.0f;
                            }
                            c00q2.AdS(fAFn);
                            return 0L;
                        }

                        @Override // X.Akx
                        /* renamed from: onPostFling-RZ2iAVY */
                        public /* bridge */ Object mo3onPostFlingRZ2iAVY(long j2, long j3, HtJ<? super C1251Afj> htJ) {
                            return AnonymousClass006.A0a();
                        }

                        @Override // X.Akx
                        /* renamed from: onPreFling-QWom1Mo */
                        public /* bridge */ Object mo5onPreFlingQWom1Mo(long j2, HtJ<? super C1251Afj> htJ) {
                            return AnonymousClass006.A0a();
                        }

                        @Override // X.Akx
                        /* renamed from: onPreScroll-OzD1aCk */
                        public /* bridge */ long mo6onPreScrollOzD1aCk(long j2, int i4) {
                            return 0L;
                        }
                    };
                    bfm.Ai0(objAaT2);
                }
                HatchStatusScreenKt$HatchStatusScreen$5$1$tabShadowConnection$1$1 hatchStatusScreenKt$HatchStatusScreen$5$1$tabShadowConnection$1$1 = (HatchStatusScreenKt$HatchStatusScreen$5$1$tabShadowConnection$1$1) objAaT2;
                Object objAaT3 = bfm.AaT();
                Object obj2 = objAaT3;
                if (objAaT3 == obj) {
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setColor(0);
                    bfm.Ai0(paint);
                    obj2 = paint;
                }
                Paint paint2 = (Paint) obj2;
                Integer numValueOf = Integer.valueOf(i2);
                Object objAaT4 = bfm.AaT();
                if (objAaT4 == obj) {
                    objAaT4 = new HatchStatusScreenKt$HatchStatusScreen$5$1$2$1(c00q);
                    bfm.Ai0(objAaT4);
                }
                AnonymousClass001.A17(bfm, objAaT4, numValueOf);
                BRg bRgA00 = C8jn.A00(c1062ATq, hatchStatusScreenKt$HatchStatusScreen$5$1$tabShadowConnection$1$1, null);
                InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA00);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA012, g0v2);
                BPg.A02(bfm, akqA043, g0v3);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C0z7 c0z7 = C0z7.A00;
                float fAgy2 = ((AXN) bfm.A6v(akh)).Agy(MutableState.A02(mutableState5) / 2);
                StatusTab statusTab = (StatusTab) AbstractC0878AGe.A0A(i2 - ahd.size(), list);
                if (statusTab != null) {
                    bfm.AgE(590172083);
                    String strA05 = MutableState.A05(mutableState);
                    if (!C7384Etj.areEqual(statusTab.getId(), str2)) {
                        strA05 = null;
                    }
                    StatusTabEntry value = mutableState4.getValue();
                    BRg bRgA002 = C11U.A00(C3U4.A04(c1062ATq, fAgy2));
                    boolean zA65 = bfm.A65(mutableState);
                    Object objAaT5 = bfm.AaT();
                    if (zA65 || objAaT5 == obj) {
                        objAaT5 = new HatchStatusScreenKt$HatchStatusScreen$5$1$3$2$1(mutableState);
                        bfm.Ai0(objAaT5);
                    }
                    statusTab.mo735ContentcmhDWc(fAgy2, fAgy, bRgA002, strA05, (Function0) objAaT5, value, bfm, 0);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(2097262710);
                    HatchStatusTab hatchStatusTab = (HatchStatusTab) AbstractC0878AGe.A0A(i2, ahd);
                    if (hatchStatusTab == null) {
                        hatchStatusTab = HatchStatusTab.ACTIVITY;
                    }
                    HatchStatusScreenKt.m2241StatusTabContentEQC0FA8(hatchStatusTab, z, c1bo.getValue(), hatchStatusViewModel, str, g0v, fAgy2, fAgy, C11U.A00(C3U4.A04(c1062ATq, fAgy2)), bfm, 0, 0);
                    BBI.A0R(bbi, false);
                }
                AHD<IconTab> ahdStatusSegmentTabs = HatchStatusScreenKt.statusSegmentTabs(ahd, R.drawable.shield_check_wght400_outline_24);
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (StatusTab statusTab2 : list) {
                    arrayListA0i.add(new IconTab(statusTab2.getIconRes(), Integer.valueOf(statusTab2.getLabelRes())));
                }
                AHD ahdA07 = AGI.A07(AbstractC0878AGe.A0P(arrayListA0i, ahdStatusSegmentTabs));
                AuraIconSize auraIconSize = AuraIconSize.X_SMALL;
                BRg bRgA003 = AbstractC07539Wl.A00(AnonymousClass001.A0R(c0z7.A4C(C2VU.A0C, bs0)), "hatch-status-tabs");
                Object objAaT6 = bfm.AaT();
                if (objAaT6 == obj) {
                    objAaT6 = new HatchStatusScreenKt$HatchStatusScreen$5$1$3$4$1(mutableState5);
                    bfm.Ai0(objAaT6);
                }
                BRg bRgA004 = BIj.A00(bRgA003, (G0U) objAaT6);
                AKH<AuraDimensions> akh2 = AuraDimensionsKt.LocalAuraDimensions;
                float fA01 = C06G.A01(bfm, akh2);
                float f = AuraDimensKt.SpacingXsmallPlusNano;
                BRg bRgA0C = C3U4.A0C(bRgA004, fA01, f, C06G.A01(bfm, akh2), f);
                boolean zA1T = AnonymousClass001.A1T(bfm, paint2, bfm.A62(fAh4));
                Object objAaT7 = bfm.AaT();
                if (zA1T || objAaT7 == obj) {
                    objAaT7 = new HatchStatusScreenKt$HatchStatusScreen$5$1$3$5$1(c00q, fAh4, paint2);
                    bfm.Ai0(objAaT7);
                }
                BRg bRgA022 = C1DI.A02(AEk.A01(bRgA0C, (G0U) objAaT7), AnonymousClass002.A0e(bfm).pill, 1.0f, AnonymousClass002.A0c(bfm).border);
                boolean zA1T2 = AnonymousClass001.A1T(bfm, list2, AnonymousClass005.A1R(bfm, ahd, mutableState2, mutableState3));
                Object objAaT8 = bfm.AaT();
                if (zA1T2 || objAaT8 == obj) {
                    objAaT8 = new HatchStatusScreenKt$HatchStatusScreen$5$1$3$6$1(ahd, list2, mutableState2, mutableState4, mutableState3);
                    bfm.Ai0(objAaT8);
                }
                AuraSegmentedTabsKt.m2609AuraToggleSegmentedTabswDTT_x8((G0V) objAaT8, ahdA07, i2, bRgA022, 0L, 0L, 16.0f, 12.0f, 6.0f, auraIconSize, null, bfm, (IconTab.$stable << 3) | 920125440, 0, HatchMessageShareDocumentRenderer.CONTENT_WIDTH_PX);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$HatchStatusScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $initialExtensionAction;
        public final /* synthetic */ String $initialExtensionTab;
        public final /* synthetic */ HatchStatusTab $initialTab;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ G0V<String, Bitmap, Unit> $onNavigateToConversation;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ HatchStatusViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function0<Unit> function0, BRg bRg, HatchStatusTab hatchStatusTab, String str, String str2, String str3, HatchStatusViewModel hatchStatusViewModel, G0V<? super String, ? super Bitmap, Unit> g0v, int i, int i2) {
            super(2);
            this.$onDismissRequest = function0;
            this.$modifier = bRg;
            this.$initialTab = hatchStatusTab;
            this.$initialExtensionTab = str;
            this.$initialExtensionAction = str2;
            this.$sessionId = str3;
            this.$viewModel = hatchStatusViewModel;
            this.$onNavigateToConversation = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusScreenKt.HatchStatusScreen(this.$onDismissRequest, this.$modifier, this.$initialTab, this.$initialExtensionTab, this.$initialExtensionAction, this.$sessionId, this.$viewModel, this.$onNavigateToConversation, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$HeaderButtons$2, reason: invalid class name and case insensitive filesystem */
    public final class C140792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ HatchStatusUiState $uiState;
        public final /* synthetic */ HatchStatusViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140792(HatchStatusViewModel hatchStatusViewModel, HatchStatusUiState hatchStatusUiState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchStatusViewModel;
            this.$uiState = hatchStatusUiState;
            this.$onDismissRequest = function0;
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
            HatchStatusScreenKt.HeaderButtons(this.$viewModel, this.$uiState, this.$onDismissRequest, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$RefreshButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C140801 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onRefreshClick;
        public final /* synthetic */ HatchStatusState $statusState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140801(HatchStatusState hatchStatusState, Function0<Unit> function0, int i) {
            super(2);
            this.$statusState = hatchStatusState;
            this.$onRefreshClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusScreenKt.RefreshButton(this.$statusState, this.$onRefreshClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$ShareAvatarButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C140811 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140811(Function0<Unit> function0, int i) {
            super(2);
            this.$onClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusScreenKt.ShareAvatarButton(this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$StatusHeaderActions$2, reason: invalid class name and case insensitive filesystem */
    public final class C140822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ HatchStatusUiState $uiState;
        public final /* synthetic */ HatchStatusViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140822(HatchStatusViewModel hatchStatusViewModel, HatchStatusUiState hatchStatusUiState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchStatusViewModel;
            this.$uiState = hatchStatusUiState;
            this.$onDismissRequest = function0;
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
            HatchStatusScreenKt.StatusHeaderActions(this.$viewModel, this.$uiState, this.$onDismissRequest, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchStatusScreenKt$VisibilityLogger$2, reason: invalid class name and case insensitive filesystem */
    public final class C140832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140832(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchStatusScreenKt.VisibilityLogger(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final HatchModule currentPageModule(AuraNavigator auraNavigator) {
        AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(false);
        if (auraNavKeyCurrentKey instanceof ConversationTabScreenKey) {
            return HatchModule.HATCH_CHAT;
        }
        if (auraNavKeyCurrentKey instanceof FeedScreenKey) {
            return HatchModule.HATCH_FEED;
        }
        if (auraNavKeyCurrentKey instanceof ExploreScreenKey) {
            return HatchModule.HATCH_IDEAS;
        }
        if (auraNavKeyCurrentKey instanceof LibraryScreenKey) {
            return HatchModule.HATCH_LIBRARY;
        }
        if (auraNavKeyCurrentKey instanceof HatchGoalsTabScreenKey) {
            return HatchModule.HATCH_GOALS;
        }
        if (auraNavKeyCurrentKey == null) {
            return null;
        }
        return TimeSpentModules.INSTANCE.moduleFor(auraNavKeyCurrentKey);
    }

    public static final HatchModule currentTabModule(AuraNavigator auraNavigator) {
        HatchModule hatchModuleModuleFor;
        AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(true);
        return (!(auraNavKeyCurrentKey instanceof AuraBottomSheetNavKey) || auraNavKeyCurrentKey == null || (hatchModuleModuleFor = TimeSpentModules.INSTANCE.moduleFor(auraNavKeyCurrentKey)) == null) ? currentPageModule(auraNavigator) : hatchModuleModuleFor;
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchStatusTab.values().length];
            try {
                AnonymousClass002.A13(HatchStatusTab.ACTIVITY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchStatusTab.APPROVALS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchStatusTab.DESKTOP, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchStatusTab.TASKS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchStatusTab.IDENTITY, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CloseButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-87208782);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
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
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.x_wght400_outline_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ed), function0, HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(bRg2, false, bfm, (iA0T >> 3) & 14, 1), false, 0.0f, null, new B6A(C06G.A0C(bfm)), null, false, false, bfm, AVy.$stable | ((iA0T << 6) & 896), 0, 1904);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, bRg2, i, i2);
        }
    }

    public static final void EditMenuButton(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, G0U<? super String, Unit> g0u3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1343825530);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u2);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u3);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121027);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102c);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102e);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121028);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102d);
            String strA016 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121029);
            String strA017 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102a);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i4);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchStatusScreenKt$EditMenuButton$1$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA00 = AbstractC07539Wl.A00(ARD.A01(bs0, (G0U) objAaT2, true), "hatch-status-edit-button");
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new HatchStatusScreenKt$EditMenuButton$1$2$1(mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraElevatedButtonKt.m2420AuraPillButtonq88KkHs((Function0) objAaT3, bRgA00, false, 0.0f, 16.0f, 0.0f, false, ComposableSingletons$HatchStatusScreenKt.f300lambda$333752098, bfm, 12610566, 100);
            BRg bRgAQJ = c0z7.AQJ(bs0);
            boolean zA0A = MutableState.A0A(mutableState);
            long jA0B = AnonymousClass007.A0B(0.0f, 8.0f);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA017, AnonymousClass002.A1W(bfm, strA015, bfm.A65(strA014) | AnonymousClass004.A1F(iA0T), AnonymousClass003.A1C(iA0T)) | AnonymousClass004.A1K(iA0T), AnonymousClass004.A1M(iA0T));
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == obj) {
                objAaT4 = new HatchStatusScreenKt$EditMenuButton$1$3$1(g0u, strA014, g0u2, strA015, function0, g0u3, strA017, mutableState);
                bfm.Ai0(objAaT4);
            }
            G0U g0u4 = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new HatchStatusScreenKt$EditMenuButton$1$4$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRgAQJ, g0u4, (Function0) objAaT5, zA0A, null, jA0B, null, false, new HatchStatusScreenKt$EditMenuButton$1$5(strA01, strA012, strA016, strA013), false, null, null, null, false, bfm, 196992, 0, 16080);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(g0u, g0u2, function0, g0u3, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchStatusScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r44, X.BRg r45, com.facebook.aura.navigation.key.HatchStatusTab r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, com.facebook.aura.status.viewmodel.HatchStatusViewModel r50, X.G0V<? super java.lang.String, ? super android.graphics.Bitmap, kotlin.Unit> r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusScreenKt.HatchStatusScreen(kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.navigation.key.HatchStatusTab, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.status.viewmodel.HatchStatusViewModel, X.G0V, X.BFM, int, int):void");
    }

    public static final void HeaderButtons(HatchStatusViewModel hatchStatusViewModel, HatchStatusUiState hatchStatusUiState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(221051957);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchStatusViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, hatchStatusUiState);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 60.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0U);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            boolean zA1D = AnonymousClass003.A1D(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchStatusScreenKt$HeaderButtons$1$1$1(function0);
                bfm.Ai0(objAaT);
            }
            CloseButton((Function0) objAaT, null, bfm, 0, 2);
            BS0 bs0 = BRg.A00;
            C01N.A07(bfm, c90m.AiP(bs0, 1.0f, true));
            StatusHeaderActions(hatchStatusViewModel, hatchStatusUiState, function0, HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(bs0, false, bfm, 6, 1), bfm, iA0T & 1022, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140792(hatchStatusViewModel, hatchStatusUiState, function0, bRg2, i, i2);
        }
    }

    public static final void StatusHeaderActions(HatchStatusViewModel hatchStatusViewModel, HatchStatusUiState hatchStatusUiState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(1828621919);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchStatusViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, hatchStatusUiState);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zIsAvatarDark = HatchAvatarAppearanceKt.isAvatarDark(bfm, 0);
            boolean zA1V = AnonymousClass004.A1V(bfm, abstractC3358CGzA0h, zIsAvatarDark, AnonymousClass003.A1M(bfm, auraNavigatorA0b, hatchStatusUiState));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchStatusScreenKt$StatusHeaderActions$1$onShareAvatar$1$1(auraNavigatorA0b, hatchStatusUiState, zIsAvatarDark, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            Function0 function03 = (Function0) objAaT;
            if (HatchUtil.INSTANCE.isShareAvatarEnabled()) {
                bfm.AgE(-976633651);
                if (HatchStatusMC.INSTANCE.isShareAvatarEnabled()) {
                    bfm.AgE(-976587709);
                    ShareAvatarButton(function03, bfm, 0);
                } else {
                    bfm.AgE(-976530049);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-976495794);
                int i4 = iA0T & 896;
                boolean zA1S = AnonymousClass001.A1S(bfm, auraNavigatorA0b, AnonymousClass003.A19(i4));
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchStatusScreenKt$StatusHeaderActions$1$1$1(function0, auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u = (G0U) objAaT2;
                boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigatorA0b, AnonymousClass003.A19(i4));
                Object objAaT3 = bfm.AaT();
                if (zA1T || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchStatusScreenKt$StatusHeaderActions$1$2$1(function0, auraNavigatorA0b);
                    bfm.Ai0(objAaT3);
                }
                G0U g0u2 = (G0U) objAaT3;
                boolean zA1S2 = AnonymousClass001.A1S(bfm, auraNavigatorA0b, AnonymousClass003.A19(i4));
                Object objAaT4 = bfm.AaT();
                if (zA1S2 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchStatusScreenKt$StatusHeaderActions$1$3$1(function0, auraNavigatorA0b);
                    bfm.Ai0(objAaT4);
                }
                EditMenuButton(g0u, g0u2, function03, (G0U) objAaT4, null, bfm, 0, 16);
            }
            BBI.A0R(bbi, false);
            HatchStatusState hatchStatusState = hatchStatusUiState.statusState;
            boolean zA67 = bfm.A67(hatchStatusViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchStatusScreenKt$StatusHeaderActions$1$4$1(hatchStatusViewModel);
                bfm.Ai0(objAaT5);
            }
            RefreshButton(hatchStatusState, (Function0) ((InterfaceC7353EnQ) objAaT5), bfm, 0);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140822(hatchStatusViewModel, hatchStatusUiState, function0, bRgA0P, i, i2);
        }
    }

    /* renamed from: StatusTabContent-EQC0FA8, reason: not valid java name */
    public static final void m2241StatusTabContentEQC0FA8(HatchStatusTab hatchStatusTab, boolean z, HatchStatusUiState hatchStatusUiState, HatchStatusViewModel hatchStatusViewModel, String str, G0V<? super String, ? super Bitmap, Unit> g0v, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbi;
        float f3 = f;
        float f4 = f2;
        BRg bRg2 = bRg;
        bfm.AgG(-87910649);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchStatusTab) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, hatchStatusUiState);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, hatchStatusViewModel);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, str);
        }
        int i3 = i2 & 64;
        int iA0A = 1572864;
        if (i3 != 0) {
            iA08 |= iA0A;
        } else if ((1572864 & i) == 0) {
            iA0A = AnonymousClass004.A0A(bfm, f3);
            iA08 |= iA0A;
        }
        int i4 = i2 & 128;
        int iA0B = 12582912;
        if (i4 != 0) {
            iA08 |= iA0B;
        } else if ((12582912 & i) == 0) {
            iA0B = AnonymousClass004.A0B(bfm, f4);
            iA08 |= iA0B;
        }
        int i5 = i2 & 256;
        int iA0l = 100663296;
        if (i5 != 0) {
            iA08 |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA08 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 38282387, 38282386), bfm, iA08)) {
            boolean z2 = false;
            if (i3 != 0) {
                f3 = 0.0f;
            }
            if (i4 != 0) {
                f4 = 0.0f;
            }
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            HatchStatusState hatchStatusState = hatchStatusUiState.statusState;
            if (hatchStatusState != HatchStatusState.DISCONNECTED && hatchStatusState != HatchStatusState.ERROR) {
                z2 = true;
            }
            int iOrdinal = hatchStatusTab.ordinal();
            B1U b1uA00 = null;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    AgentPermissionApprovalsScreenKt.m161AgentPermissionApprovalsScreendjqsMU(str, f3, f4, AnonymousClass002.A0R(bRg2, bfm, 1417252850), bfm, AnonymousClass002.A07(iA08 >> 15, (iA08 >> 12) & 14), 0);
                } else if (iOrdinal == 2) {
                    DesktopScreenKt.m2217DesktopScreenpBklqvs(f3, f4, AnonymousClass002.A0R(bRg2, bfm, 1417260542), null, bfm, (iA08 >> 18) & 126, 8);
                } else if (iOrdinal == 3) {
                    bfm.AgE(1417266709);
                    AHD<HatchUpcomingTaskUiModel> ahd = hatchStatusUiState.upcomingTasks;
                    boolean zA67 = bfm.A67(hatchStatusViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new HatchStatusScreenKt$StatusTabContent$2$1(hatchStatusViewModel);
                        bfm.Ai0(objAaT);
                    }
                    UpcomingScreenKt.m2254UpcomingScreenYlGCr2M(ahd, (G0U) ((InterfaceC7353EnQ) objAaT), z2, f3, f4, AnonymousClass001.A0T(bRg2), null, bfm, (iA08 >> 9) & 64512, 64);
                } else {
                    if (iOrdinal != 4) {
                        throw AnonymousClass005.A0k(bfm, 1417229869);
                    }
                    IdentityScreenKt.m2245IdentityScreenpBklqvs(f3, f4, C06G.A0M(bfm, AnonymousClass002.A0R(bRg2, bfm, 1417277574)), null, bfm, (iA08 >> 18) & 126, 8);
                }
                bbi = (BBI) bfm;
            } else {
                bfm.AgE(1417230441);
                AHD<HatchSubAgentUiModel> ahd2 = hatchStatusUiState.subAgents;
                BRg bRgA0T = AnonymousClass001.A0T(bRg2);
                if (z) {
                    bfm.AgE(984742428);
                    b1uA00 = B1V.A00(bfm, new HatchStatusScreenKt$StatusTabContent$1(hatchStatusUiState, hatchStatusViewModel, z2), -1199187961);
                } else {
                    bfm.AgE(985055062);
                }
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                ActivityScreenKt.m2210ActivityScreentw_glAc(ahd2, z2, f3, f4, bRgA0T, b1uA00, z, null, bfm, ((iA08 >> 12) & 8064) | ((iA08 << 15) & 3670016), 128);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchStatusScreenKt$StatusTabContent$3(hatchStatusTab, z, hatchStatusUiState, hatchStatusViewModel, str, g0v, f3, f4, bRg2, i, i2);
        }
    }

    public static final void logShareAvatarClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, null, HatchScreen.BOT_SHEET, HatchComponent.SHARE_BUTTON, null, null, null);
    }

    public static final void RefreshButton(HatchStatusState hatchStatusState, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1716843019);
        int iA08 = (i & 6) == 0 ? i | AnonymousClass005.A08(bfm, hatchStatusState) : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            if (hatchStatusState == HatchStatusState.DISCONNECTED || hatchStatusState == HatchStatusState.ERROR) {
                bfm.AgE(-1999636909);
                AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.arrow_counterclockwise_outline_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121037), function0, null, false, 0.0f, AuraIconSize.X_SMALL, new B6A(C06G.A0C(bfm)), null, false, false, bfm, 1572864 | AVy.$stable | ((iA08 << 3) & 896), 0, 1848);
            } else {
                bfm.AgE(-1999304403);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140801(hatchStatusState, function0, i);
        }
    }

    public static final void ShareAvatarButton(Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1600273277);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102e), function0, AbstractC07539Wl.A00(BRg.A00, "hatch-status-share-avatar-button"), false, 0.0f, null, new B6A(C06G.A0C(bfm)), null, false, false, bfm, AVy.$stable | 3072 | ((iA0T << 6) & 896), 0, 1904);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140811(function0, i);
        }
    }

    public static final void VisibilityLogger(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 1857674321, i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchTimeSpentLogger companion = HatchTimeSpentLogger.Companion.getInstance(AnonymousClass002.A0h(bfm));
            Unit unit = Unit.INSTANCE;
            boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA0b, companion);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchStatusScreenKt$VisibilityLogger$1$1(auraNavigatorA0b, companion);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140832(i);
        }
    }

    public static final /* synthetic */ StatusTabEntry access$HatchStatusScreen$lambda$18(MutableState mutableState) {
        return (StatusTabEntry) mutableState.getValue();
    }

    public static final /* synthetic */ HatchStatusUiState access$HatchStatusScreen$lambda$2(C1BO c1bo) {
        return (HatchStatusUiState) c1bo.getValue();
    }

    public static final HatchComponent analyticsComponent(HatchStatusTab hatchStatusTab) {
        int iOrdinal = hatchStatusTab.ordinal();
        if (iOrdinal == 0) {
            return HatchComponent.TAB_ACTIVITY;
        }
        if (iOrdinal == 1) {
            return HatchComponent.TAB_APPROVALS;
        }
        if (iOrdinal == 2) {
            return HatchComponent.TAB_DESKTOP;
        }
        if (iOrdinal == 3) {
            return HatchComponent.TAB_UPCOMING;
        }
        if (iOrdinal == 4) {
            return HatchComponent.TAB_IDENTITY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int iconRes(HatchStatusTab hatchStatusTab, int i) {
        int iOrdinal = hatchStatusTab.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.list_bullet_wght400_outline_24;
        }
        if (iOrdinal == 1) {
            return i;
        }
        if (iOrdinal == 2) {
            return R.drawable.monitor_wght400_outline_24;
        }
        if (iOrdinal == 3) {
            return R.drawable.clock_semi_circle_dashed_wght400_outline_24;
        }
        if (iOrdinal == 4) {
            return R.drawable.fingerprint_wght400_outline_24;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int labelRes(HatchStatusTab hatchStatusTab) {
        int iOrdinal = hatchStatusTab.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f121054;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f121055;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f121056;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f121058;
        }
        if (iOrdinal == 4) {
            return R.string._name_removed__res_0x7f121057;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void prefillPromptInComposer(String str, AuraNavigator auraNavigator) {
        AnonymousClass003.A0u(str, auraNavigator);
        HatchPendingMessage.INSTANCE.setPendingComposerText(str, null);
        AnonymousClass006.A1D(auraNavigator);
    }

    public static final AHD<IconTab> statusSegmentTabs(AHD<? extends HatchStatusTab> ahd, int i) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        for (HatchStatusTab hatchStatusTab : ahd) {
            arrayListA0i.add(new IconTab(iconRes(hatchStatusTab, i), Integer.valueOf(labelRes(hatchStatusTab))));
        }
        return AGI.A07(arrayListA0i);
    }

    public static final AHD<HatchStatusTab> visibleStatusTabs(boolean z, boolean z2) {
        Ey9<HatchStatusTab> entries = HatchStatusTab.getEntries();
        ArrayList arrayList = new ArrayList();
        for (HatchStatusTab hatchStatusTab : entries) {
            if (hatchStatusTab != HatchStatusTab.DESKTOP || z) {
                if (hatchStatusTab != HatchStatusTab.TASKS || !z2) {
                    arrayList.add(hatchStatusTab);
                }
            }
        }
        return AGI.A07(arrayList);
    }
}
