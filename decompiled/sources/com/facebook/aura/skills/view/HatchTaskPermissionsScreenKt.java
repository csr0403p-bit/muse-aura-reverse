package com.facebook.aura.skills.view;

import X.AFz;
import X.AGH;
import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.model.FacebookSkillConstantsKt;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.TaskConnectorPermissions;
import com.facebook.aura.skills.repo.TaskPermissions;
import com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState;
import com.facebook.aura.skills.viewmodel.TaskPermissionsUiState;
import com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchTaskPermissionsScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt$HatchTaskPermissionsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C07C, TaskPermissionsUiState, BFM, Integer, Unit> {
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ String $taskName;
        public final /* synthetic */ TaskPermissionsViewModel $viewModel;

        public final void invoke(C07C c07c, TaskPermissionsUiState taskPermissionsUiState, BFM bfm, int i) {
            C7384Etj.A0Y(taskPermissionsUiState, 1);
            HatchTaskPermissionsScreenKt.TaskConnectedConnectors(this.$taskId, this.$taskName, taskPermissionsUiState, null, bfm, (i << 3) & 896, 8);
            TaskPermissionsViewModel taskPermissionsViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(taskPermissionsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchTaskPermissionsScreenKt$HatchTaskPermissionsScreen$1$1$1(taskPermissionsViewModel);
                bfm.Ai0(objAaT);
            }
            TaskWebsiteSectionsKt.TaskWebsiteSections(taskPermissionsUiState, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, (i >> 3) & 14, 4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, TaskPermissionsViewModel taskPermissionsViewModel) {
            super(4);
            this.$taskId = str;
            this.$taskName = str2;
            this.$viewModel = taskPermissionsViewModel;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, TaskPermissionsUiState taskPermissionsUiState, BFM bfm, Integer num) {
            invoke(c07c, taskPermissionsUiState, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt$HatchTaskPermissionsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ String $taskName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$taskId = str;
            this.$taskName = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTaskPermissionsScreenKt.HatchTaskPermissionsScreen(this.$taskId, this.$taskName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt$TaskConnectedConnectors$2, reason: invalid class name and case insensitive filesystem */
    public final class C138662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ TaskPermissionsUiState $state;
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ String $taskName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138662(String str, String str2, TaskPermissionsUiState taskPermissionsUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$taskId = str;
            this.$taskName = str2;
            this.$state = taskPermissionsUiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTaskPermissionsScreenKt.TaskConnectedConnectors(this.$taskId, this.$taskName, this.$state, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt$TaskConnectorRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ TaskConnectorPermissions $permission;
        public final /* synthetic */ Skill $skill;
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ String $taskName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138672(String str, String str2, Skill skill, TaskConnectorPermissions taskConnectorPermissions, BRg bRg, int i, int i2) {
            super(2);
            this.$taskId = str;
            this.$taskName = str2;
            this.$skill = skill;
            this.$permission = taskConnectorPermissions;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTaskPermissionsScreenKt.TaskConnectorRow(this.$taskId, this.$taskName, this.$skill, this.$permission, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt$TaskPermissionSectionTitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C138682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138682(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTaskPermissionsScreenKt.TaskPermissionSectionTitle(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt$TaskPermissionsPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C138692 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G2j<C07C, TaskPermissionsUiState, BFM, Integer, Unit> $content;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ C1BO<TaskPermissionsUiState> $state$delegate;
        public final /* synthetic */ TaskPermissionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138692(TaskPermissionsViewModel taskPermissionsViewModel, HatchScreen hatchScreen, G2j<? super C07C, ? super TaskPermissionsUiState, ? super BFM, ? super Integer, Unit> g2j, C1BO<TaskPermissionsUiState> c1bo) {
            super(4);
            this.$viewModel = taskPermissionsViewModel;
            this.$screen = hatchScreen;
            this.$content = g2j;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2166invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2166invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C10G.A01);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA07 = C3U4.A07(bRgA0T, C3cG.A00(bfm, auraTheme));
            TaskPermissionsViewModel taskPermissionsViewModel = this.$viewModel;
            HatchScreen hatchScreen = this.$screen;
            G2j<C07C, TaskPermissionsUiState, BFM, Integer, Unit> g2j = this.$content;
            C1BO<TaskPermissionsUiState> c1bo = this.$state$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            if (c1bo.getValue().permissions != null) {
                bfm.AgE(-779346375);
                if (c1bo.getValue().loadingState == SkillPermissionsLoadingState.ERROR) {
                    bfm.AgE(-779276346);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012c);
                    boolean zA67 = bfm.A67(taskPermissionsViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new HatchTaskPermissionsScreenKt$TaskPermissionsPage$2$1$1$1(taskPermissionsViewModel);
                        bfm.Ai0(objAaT);
                    }
                    HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) ((InterfaceC7353EnQ) objAaT), C10G.A04(C10G.A02, 120.0f), HatchSurface.STATUS, HatchSubsurface.PERMISSIONS, hatchScreen, null, bfm, 28032, 64);
                } else {
                    bfm.AgE(-778918854);
                }
                BBI.A0R(bbi, false);
                g2j.invoke(c90l, c1bo.getValue(), bfm, 6);
            } else if (c1bo.getValue().loadingState == SkillPermissionsLoadingState.ERROR) {
                bfm.AgE(-1410595678);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012c);
                boolean zA672 = bfm.A67(taskPermissionsViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchTaskPermissionsScreenKt$TaskPermissionsPage$2$1$2$1(taskPermissionsViewModel);
                    bfm.Ai0(objAaT2);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(strA012, (Function0) ((InterfaceC7353EnQ) objAaT2), C10G.A04(C10G.A02, 240.0f), HatchSurface.STATUS, HatchSubsurface.PERMISSIONS, hatchScreen, null, bfm, 28032, 64);
            } else {
                bfm.AgE(-1410584334);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C10G.A04(C10G.A02, 240.0f), bfm, 6, 0);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2 + C3cG.A00(bfm, auraTheme), true);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchTaskPermissionsScreenKt$TaskPermissionsPage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<C07C, TaskPermissionsUiState, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ TaskPermissionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, TaskPermissionsViewModel taskPermissionsViewModel, HatchScreen hatchScreen, BRg bRg, G2j<? super C07C, ? super TaskPermissionsUiState, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$viewModel = taskPermissionsViewModel;
            this.$screen = hatchScreen;
            this.$modifier = bRg;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTaskPermissionsScreenKt.TaskPermissionsPage(this.$title, this.$subtitle, this.$viewModel, this.$screen, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchTaskPermissionsScreen(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(1390241682);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            TaskPermissionsViewModel taskPermissionsViewModelRememberTaskPermissionsViewModel = rememberTaskPermissionsViewModel(str, bfm, iA0d & 14);
            TaskPermissionsPage(str2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f50), taskPermissionsViewModelRememberTaskPermissionsViewModel, HatchScreen.CONNECTOR_PERMISSIONS_LIST, bRg2, B1V.A00(bfm, new AnonymousClass1(str, str2, taskPermissionsViewModelRememberTaskPermissionsViewModel), 954654686), bfm, ((iA0d << 6) & 57344) | ((iA0d >> 3) & 14) | 199680, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, i, i2);
        }
    }

    public static final TaskPermissionsViewModel rememberTaskPermissionsViewModel(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        String strA0M = FGI.A0M("TaskPermissions:", str);
        TaskPermissionsViewModel.Factory factory = new TaskPermissionsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (TaskPermissionsViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), TaskPermissionsViewModel.class, strA0M);
    }

    public static final void TaskConnectedConnectors(String str, String str2, TaskPermissionsUiState taskPermissionsUiState, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c138662;
        AHD<TaskConnectorPermissions> ahd;
        BRg bRg2 = bRg;
        bfm.AgG(-1780145691);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, taskPermissionsUiState);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            TaskPermissions taskPermissions = taskPermissionsUiState.permissions;
            if (taskPermissions == null || (ahd = taskPermissions.connectors) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c138662 = new HatchTaskPermissionsScreenKt$TaskConnectedConnectors$connectors$1(str, str2, taskPermissionsUiState, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c138662);
                }
                return;
            }
            AHD<Skill> ahd2 = taskPermissionsUiState.connectedConnectors;
            boolean zA1K = AnonymousClass003.A1K(bfm, ahd2, ahd);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                ArrayList arrayListA0h = C3cG.A0h();
                for (Skill skill : ahd2) {
                    Iterator it = ahd.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            TaskConnectorPermissions taskConnectorPermissions = (TaskConnectorPermissions) next;
                            if (C7384Etj.areEqual(permissionConnectorKey(taskConnectorPermissions.id), permissionConnectorKey(skill.id)) && !taskConnectorPermissions.methods.isEmpty()) {
                                if (next != null) {
                                    AnonymousClass002.A1J(skill, next, arrayListA0h);
                                }
                            }
                        }
                    }
                }
                objAaT = AGH.A06(arrayListA0h);
                bfm.Ai0(objAaT);
            }
            Map map = (Map) objAaT;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            C90l c90l = C90l.A00;
            TaskPermissionSectionTitle(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee4), null, bfm, 0, 2);
            if (map.isEmpty()) {
                C60R.A11(bfm, 35372806);
            } else {
                boolean zA1Z = AnonymousClass001.A1Z(map, bfm, 35481585) | AnonymousClass004.A1F(iA0d) | ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
                Object objAaT2 = bfm.AaT();
                if (zA1Z || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchTaskPermissionsScreenKt$TaskConnectedConnectors$1$1$1(map, str, str2);
                    bfm.Ai0(objAaT2);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c138662 = new C138662(str, str2, taskPermissionsUiState, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c138662);
        }
    }

    public static final void TaskConnectorRow(String str, String str2, Skill skill, TaskConnectorPermissions taskConnectorPermissions, BRg bRg, BFM bfm, int i, int i2) {
        String strA0e;
        BRg bRg2 = bRg;
        bfm.AgG(537561168);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, skill);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, taskConnectorPermissions);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            if (taskConnectorPermissions.getHasOverrides()) {
                bfm.AgE(-1447993852);
                strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f1210db);
            } else {
                AnonymousClass003.A0l(bfm, -1447912819);
                strA0e = null;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, skill, AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1M(bfm, taskConnectorPermissions, auraNavigatorA0b), AnonymousClass001.A1N(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchTaskPermissionsScreenKt$TaskConnectorRow$1$1(taskConnectorPermissions, auraNavigatorA0b, str, str2, skill);
                bfm.Ai0(objAaT);
            }
            ConnectorRowKt.ConnectorRow(skill, bRg2, null, strA0e, (Function0) objAaT, ComposableSingletons$HatchTaskPermissionsScreenKt.lambda$1613454609, bfm, ((iA0d >> 6) & 14) | 196608 | ((iA0d >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138672(str, str2, skill, taskConnectorPermissions, bRg2, i, i2);
        }
    }

    public static final void TaskPermissionSectionTitle(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1619089045);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bRg2, AuraDimensKt.SpacingMedium, 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchTaskPermissionsScreenKt$TaskPermissionSectionTitle$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA07, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138682(str, bRg2, i, i2);
        }
    }

    public static final void TaskPermissionsPage(String str, String str2, TaskPermissionsViewModel taskPermissionsViewModel, HatchScreen hatchScreen, BRg bRg, G2j<? super C07C, ? super TaskPermissionsUiState, ? super BFM, ? super Integer, Unit> g2j, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(str2, taskPermissionsViewModel, hatchScreen, 1);
        C7384Etj.A0Y(g2j, 5);
        bfm.AgG(-1047054109);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, taskPermissionsViewModel);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, hatchScreen.ordinal());
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1BO c1boA02 = C2CK.A02(bfm, taskPermissionsViewModel.uiState);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchTaskPermissionsScreenKt$TaskPermissionsPage$impressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            long jA05 = C3cG.A05(AFz.A03(bfm, (Function0) objAaT, objArr));
            boolean zA1M = AnonymousClass004.A1M(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.STATUS, HatchSurface.STATUS, HatchSubsurface.PERMISSIONS, hatchScreen, null, null, null, null, 500L, 0.0f, FGI.A0a("task_permissions:", hatchScreen.getValue(), ":", jA05), null, null);
                bfm.Ai0(objAaT2);
            }
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgThen = bRg2.then((BRg) objAaT2);
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(HatchSurface.STATUS, hatchScreen);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchTaskPermissionsScreenKt$TaskPermissionsPage$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            int i4 = iA0d << 12;
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRgThen, null, 0L, str, str2, (Function0) objAaT3, null, false, false, 0, null, null, null, null, null, null, 0L, jA07, c1822ArmA0B, 0.0f, null, null, null, 0, null, null, hatchBackClickAnalytics, false, B1V.A00(bfm, new C138692(taskPermissionsViewModel, hatchScreen, g2j, c1boA02), -774740098), bfm, AnonymousClass001.A08(i4, (57344 & i4) | 6), 0, (HatchBackClickAnalytics.$stable << 21) | 805306368, 401866636);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, taskPermissionsViewModel, hatchScreen, bRg2, g2j, i, i2);
        }
    }

    public static final void logTaskConnectorRowClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.PERMISSIONS, HatchScreen.CONNECTOR_PERMISSIONS_LIST, HatchComponent.SKILL_ROW, null, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str), null);
    }

    public static final /* synthetic */ TaskPermissionsUiState access$TaskPermissionsPage$lambda$0(C1BO c1bo) {
        return (TaskPermissionsUiState) c1bo.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final String permissionConnectorKey(String str) {
        switch (str.hashCode()) {
            case -363366361:
                if (str.equals(FacebookSkillConstantsKt.FACEBOOK_SKILL_NAME)) {
                    str = MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK;
                    break;
                }
                break;
            case -6555489:
                if (str.equals("whatsapp_companion")) {
                    str = NativeLoginAccountResolverKt.WHATSAPP_USER_ID;
                    break;
                }
                break;
            case 207171756:
                if (str.equals("stripe_link")) {
                    str = "stripe-link";
                    break;
                }
                break;
            case 628247362:
                if (str.equals("messenger_read")) {
                    str = "messenger";
                    break;
                }
                break;
        }
        return str.replace('-', '_');
    }
}
