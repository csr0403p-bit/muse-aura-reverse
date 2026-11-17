package com.facebook.aura.library.view;

import X.AFz;
import X.AGI;
import X.AHD;
import X.AHG;
import X.AHH;
import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0A8;
import X.C0dx;
import X.C0lh;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11T;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C31t;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.library.model.GoalDetailViewModel;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalAssociation;
import com.facebook.aura.library.repo.GoalDetail;
import com.facebook.aura.library.repo.GoalUpdate;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.TaskDeleteConfirmationDialogKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class GoalDetailScreenKt {
    public static final int ARTIFACTS_PAGE_SIZE = 10;
    public static final String CRON_ASSOCIATION_TYPE = "cron";
    public static final int CRON_MENU_ID_DELETE = 1;
    public static final float CRON_OVERFLOW_FOOTPRINT = 24.0f;
    public static final float CRON_OVERFLOW_TOUCH_TARGET = 48.0f;
    public static final String GOALS_SECTION_ARTIFACTS = "artifacts";
    public static final String GOALS_SECTION_SUBGOALS = "subgoals";
    public static final List<String> ISO_INPUT_PATTERNS = Arrays.asList("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd");

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalActivityItem$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLast;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ GoalUpdate $update;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GoalUpdate goalUpdate, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$update = goalUpdate;
            this.$isLast = z;
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
            GoalDetailScreenKt.GoalActivityItem(this.$update, this.$isLast, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalActivitySection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<GoalUpdate> $updates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AHD<GoalUpdate> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$updates = ahd;
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
            GoalDetailScreenKt.GoalActivitySection(this.$updates, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalActivitySection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<GoalUpdate> $updates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<GoalUpdate> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$updates = ahd;
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
            GoalDetailScreenKt.GoalActivitySection(this.$updates, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalArtifactRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C123472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ GoalAssociation $association;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ G0U<String, Unit> $onDeleteCron;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123472(String str, GoalAssociation goalAssociation, int i, Function0<Unit> function0, G0U<? super String, Unit> g0u, BRg bRg, int i2, int i3) {
            super(2);
            this.$goalId = str;
            this.$association = goalAssociation;
            this.$absolutePosition = i;
            this.$onClick = function0;
            this.$onDeleteCron = g0u;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalDetailScreenKt.GoalArtifactRow(this.$goalId, this.$association, this.$absolutePosition, this.$onClick, this.$onDeleteCron, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalArtifactsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C123481 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<GoalAssociation> $associations;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<GoalAssociation, Integer, Unit> $onArtifactClick;
        public final /* synthetic */ G0U<String, Unit> $onDeleteCron;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123481(String str, AHD<? extends GoalAssociation> ahd, G0V<? super GoalAssociation, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$goalId = str;
            this.$associations = ahd;
            this.$onArtifactClick = g0v;
            this.$onDeleteCron = g0u;
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
            GoalDetailScreenKt.GoalArtifactsSection(this.$goalId, this.$associations, this.$onArtifactClick, this.$onDeleteCron, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalArtifactsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C123492 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AHD<GoalAssociation> $associations;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ G0V<GoalAssociation, Integer, Unit> $onArtifactClick;
        public final /* synthetic */ G0U<String, Unit> $onDeleteCron;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123492(AHD<? extends GoalAssociation> ahd, String str, G0V<? super GoalAssociation, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u) {
            super(2);
            this.$associations = ahd;
            this.$goalId = str;
            this.$onArtifactClick = g0v;
            this.$onDeleteCron = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public static final void invoke$lambda$2(MutableState<Integer> mutableState, int i) {
            mutableState.Af8(Integer.valueOf(i));
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                Object[] objArr = {Integer.valueOf(this.$associations.size())};
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = GoalDetailScreenKt$GoalArtifactsSection$2$visibleCount$2$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT, objArr);
                int iA0F = AnonymousClass001.A0F(mutableStateA0K.getValue());
                boolean zA63 = bfm.A63(iA0F) | bfm.A65(this.$associations);
                AHD<GoalAssociation> ahd = this.$associations;
                Object objAaT2 = bfm.AaT();
                if (zA63 || objAaT2 == obj) {
                    objAaT2 = AbstractC0878AGe.A0a(ahd, AnonymousClass001.A0F(mutableStateA0K.getValue()));
                    bfm.Ai0(objAaT2);
                }
                bfm.AgE(306641773);
                String str = this.$goalId;
                G0V<GoalAssociation, Integer, Unit> g0v = this.$onArtifactClick;
                G0U<String, Unit> g0u = this.$onDeleteCron;
                int i2 = 0;
                for (Object obj2 : (List) objAaT2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    GoalAssociation goalAssociation = (GoalAssociation) obj2;
                    bfm.Ag8(-1617834040, goalAssociation.getAssociationId());
                    boolean zA1a = AnonymousClass001.A1a(AnonymousClass003.A1J(bfm, g0v, goalAssociation), bfm, i2);
                    Object objAaT3 = bfm.AaT();
                    if (zA1a || objAaT3 == obj) {
                        objAaT3 = new GoalDetailScreenKt$GoalArtifactsSection$2$1$1$1(g0v, goalAssociation, i2);
                        bfm.Ai0(objAaT3);
                    }
                    GoalDetailScreenKt.GoalArtifactRow(str, goalAssociation, i2, (Function0) objAaT3, g0u, null, bfm, 0, 32);
                    AnonymousClass001.A1D(bfm);
                    i2 = i3;
                }
                BBI bbiA07 = C3cG.A07(bfm);
                int size = this.$associations.size() - AnonymousClass001.A0F(mutableStateA0K.getValue());
                if (size > 0) {
                    bfm.AgE(916404231);
                    if (size > 10) {
                        size = 10;
                    }
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$associations, AnonymousClass003.A1K(bfm, this.$goalId, mutableStateA0K));
                    String str2 = this.$goalId;
                    AHD<GoalAssociation> ahd2 = this.$associations;
                    Object objAaT4 = bfm.AaT();
                    if (zA1T || objAaT4 == obj) {
                        objAaT4 = new GoalDetailScreenKt$GoalArtifactsSection$2$2$1(str2, ahd2, mutableStateA0K);
                        bfm.Ai0(objAaT4);
                    }
                    GoalDetailScreenKt.ShowMoreArtifactsRow(size, (Function0) objAaT4, null, bfm, 0, 4);
                } else {
                    bfm.AgE(916803046);
                }
                BBI.A0R(bbiA07, false);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalArtifactsSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C123503 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<GoalAssociation> $associations;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<GoalAssociation, Integer, Unit> $onArtifactClick;
        public final /* synthetic */ G0U<String, Unit> $onDeleteCron;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123503(String str, AHD<? extends GoalAssociation> ahd, G0V<? super GoalAssociation, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$goalId = str;
            this.$associations = ahd;
            this.$onArtifactClick = g0v;
            this.$onDeleteCron = g0u;
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
            GoalDetailScreenKt.GoalArtifactsSection(this.$goalId, this.$associations, this.$onArtifactClick, this.$onDeleteCron, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalCollapsibleSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C123512 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $collapseLabel;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ int $count;
        public final /* synthetic */ String $expandLabel;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ String $goalsSection;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123512(String str, int i, String str2, String str3, String str4, String str5, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i2, int i3) {
            super(2);
            this.$title = str;
            this.$count = i;
            this.$expandLabel = str2;
            this.$collapseLabel = str3;
            this.$goalId = str4;
            this.$goalsSection = str5;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalDetailScreenKt.GoalCollapsibleSection(this.$title, this.$count, this.$expandLabel, this.$collapseLabel, this.$goalId, this.$goalsSection, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalCronOverflowMenu$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ String $cronId;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDelete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$goalId = str;
            this.$cronId = str2;
            this.$absolutePosition = i;
            this.$onDelete = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalDetailScreenKt.GoalCronOverflowMenu(this.$goalId, this.$cronId, this.$absolutePosition, this.$onDelete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalDetailScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C123523 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $currentGoalPending;
        public final /* synthetic */ C1BO<GoalDetail> $goalDetail$delegate;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ MutableState<Boolean> $menuGoalCompleted$delegate;
        public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;
        public final /* synthetic */ String $updatingGoalDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123523(boolean z, String str, String str2, C1BO<GoalDetail> c1bo, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(2);
            this.$currentGoalPending = z;
            this.$updatingGoalDescription = str;
            this.$goalId = str2;
            this.$goalDetail$delegate = c1bo;
            this.$menuGoalCompleted$delegate = mutableState;
            this.$showMenu$delegate = mutableState2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$currentGoalPending) {
                    BS0 bs0A09 = C3cG.A09(bfm, -2145792830);
                    boolean zA65 = bfm.A65(this.$updatingGoalDescription);
                    String str = this.$updatingGoalDescription;
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new GoalDetailScreenKt$GoalDetailScreen$3$1$1(str);
                        bfm.Ai0(objAaT);
                    }
                    AnonymousClass007.A0v(bfm, bs0A09, (G0U) objAaT);
                } else {
                    bfm.AgE(-2145530880);
                    AVy aVyA00 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120704);
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$goalDetail$delegate, bfm.A65(this.$goalId));
                    String str2 = this.$goalId;
                    C1BO<GoalDetail> c1bo = this.$goalDetail$delegate;
                    MutableState<Boolean> mutableState = this.$menuGoalCompleted$delegate;
                    MutableState<Boolean> mutableState2 = this.$showMenu$delegate;
                    Object objAaT2 = bfm.AaT();
                    if (zA1R || objAaT2 == C78N.A00) {
                        objAaT2 = new GoalDetailScreenKt$GoalDetailScreen$3$2$1(str2, c1bo, mutableState, mutableState2);
                        bfm.Ai0(objAaT2);
                    }
                    AnonymousClass005.A0o(bfm, aVyA00, strA01, (Function0) objAaT2);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalDetailScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C123534 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ boolean $currentGoalPending;
        public final /* synthetic */ C1BO<GoalDetail> $goalDetail$delegate;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ String $goalTitle;
        public final /* synthetic */ C1BO<GoalDetailViewModel.LoadState> $loadState$delegate;
        public final /* synthetic */ MutableState<Boolean> $menuGoalCompleted$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $parentGoalTitle;
        public final /* synthetic */ C1BO<AHG<String>> $pendingCompletionIds$delegate;
        public final /* synthetic */ MutableState<String> $renameText$delegate;
        public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;
        public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ GoalDetailViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123534(C1BO<GoalDetail> c1bo, String str, String str2, String str3, Context context, AuraNavigator auraNavigator, GoalDetailViewModel goalDetailViewModel, MutableState<String> mutableState, MutableState<Boolean> mutableState2, boolean z, AbstractC3358CGz abstractC3358CGz, C1BO<? extends AHG<String>> c1bo2, C1BO<? extends GoalDetailViewModel.LoadState> c1bo3, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4) {
            super(4);
            this.$goalDetail$delegate = c1bo;
            this.$goalId = str;
            this.$goalTitle = str2;
            this.$parentGoalTitle = str3;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$viewModel = goalDetailViewModel;
            this.$renameText$delegate = mutableState;
            this.$showRenameDialog$delegate = mutableState2;
            this.$currentGoalPending = z;
            this.$userSession = abstractC3358CGz;
            this.$pendingCompletionIds$delegate = c1bo2;
            this.$loadState$delegate = c1bo3;
            this.$showMenu$delegate = mutableState3;
            this.$menuGoalCompleted$delegate = mutableState4;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1150invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x03ee  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0572  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0152 A[PHI: r4
  0x0152: PHI (r4v24 java.lang.String) = (r4v1 java.lang.String), (r4v25 java.lang.String) binds: [B:26:0x0150, B:24:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1150invokei1RSzL4(float r56, float r57, X.BFM r58, int r59) {
            /*
                Method dump skipped, instructions count: 1422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalDetailScreenKt.C123534.m1150invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalDetailScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ String $goalTitle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $parentGoalTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, BRg bRg, String str2, String str3, int i, int i2) {
            super(2);
            this.$goalId = str;
            this.$modifier = bRg;
            this.$goalTitle = str2;
            this.$parentGoalTitle = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalDetailScreenKt.GoalDetailScreen(this.$goalId, this.$modifier, this.$goalTitle, this.$parentGoalTitle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalSubgoalRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C123542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ Goal $subgoal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123542(Goal goal, G0U<? super Boolean, Boolean> g0u, boolean z) {
            super(2);
            this.$subgoal = goal;
            this.$onToggleComplete = g0u;
            this.$pending = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                Goal goal = this.$subgoal;
                boolean zIsCompleted = goal.isCompleted();
                G0U<Boolean, Boolean> g0u = this.$onToggleComplete;
                String str = goal.title;
                if (str == null) {
                    str = "";
                }
                GoalCheckboxKt.GoalCheckbox(zIsCompleted, g0u, str, null, this.$pending, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalSubgoalRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C123553 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
        public final /* synthetic */ MutableState<Boolean> $menuGoalCompleted$delegate;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ Function0<Unit> $openMenu;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ Goal $subgoal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123553(Goal goal, Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, boolean z, int i, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(2);
            this.$subgoal = goal;
            this.$openMenu = function0;
            this.$onToggleComplete = g0u;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$pending = z;
            this.$absolutePosition = i;
            this.$menuExpanded$delegate = mutableState;
            this.$menuGoalCompleted$delegate = mutableState2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                Goal goal = this.$subgoal;
                boolean zA0A = MutableState.A0A((MutableState) this.$menuExpanded$delegate);
                boolean zA0A2 = MutableState.A0A((MutableState) this.$menuGoalCompleted$delegate);
                HatchScreen hatchScreen = HatchScreen.GOAL_DETAIL;
                Function0<Unit> function0 = this.$openMenu;
                MutableState<Boolean> mutableState = this.$menuExpanded$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new GoalDetailScreenKt$GoalSubgoalRow$3$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                GoalRowOverflowMenuKt.GoalRowOverflowMenu(goal, zA0A, zA0A2, hatchScreen, function0, (Function0) objAaT, this.$onToggleComplete, this.$onDeleteGoal, this.$onRenameGoal, true, null, this.$pending, false, Integer.valueOf(this.$absolutePosition), null, bfm, 805506048, 0, 21504);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalSubgoalRow$4, reason: invalid class name and case insensitive filesystem */
    public final class C123564 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ Goal $subgoal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123564(Goal goal, int i, G0U<? super Boolean, Boolean> g0u, boolean z, Function0<Unit> function0, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, int i2, int i3) {
            super(2);
            this.$subgoal = goal;
            this.$absolutePosition = i;
            this.$onToggleComplete = g0u;
            this.$pending = z;
            this.$onOpen = function0;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalDetailScreenKt.GoalSubgoalRow(this.$subgoal, this.$absolutePosition, this.$onToggleComplete, this.$pending, this.$onOpen, this.$onDeleteGoal, this.$onRenameGoal, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalSubgoalsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C123571 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteSubgoal;
        public final /* synthetic */ G0U<Goal, Unit> $onOpenSubgoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameSubgoal;
        public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ AHG<String> $pendingCompletionIds;
        public final /* synthetic */ AHD<Goal> $subgoals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123571(String str, AHD<Goal> ahd, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super Goal, Unit> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, int i, int i2) {
            super(2);
            this.$goalId = str;
            this.$subgoals = ahd;
            this.$onToggleComplete = g0v;
            this.$pendingCompletionIds = ahg;
            this.$onOpenSubgoal = g0u;
            this.$onDeleteSubgoal = g0u2;
            this.$onRenameSubgoal = g0w;
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
            GoalDetailScreenKt.GoalSubgoalsSection(this.$goalId, this.$subgoals, this.$onToggleComplete, this.$pendingCompletionIds, this.$onOpenSubgoal, this.$onDeleteSubgoal, this.$onRenameSubgoal, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalSubgoalsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C123582 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onDeleteSubgoal;
        public final /* synthetic */ G0U<Goal, Unit> $onOpenSubgoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameSubgoal;
        public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ AHG<String> $pendingCompletionIds;
        public final /* synthetic */ AHD<Goal> $subgoals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123582(AHD<Goal> ahd, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super Goal, Unit> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w) {
            super(2);
            this.$subgoals = ahd;
            this.$onToggleComplete = g0v;
            this.$pendingCompletionIds = ahg;
            this.$onOpenSubgoal = g0u;
            this.$onDeleteSubgoal = g0u2;
            this.$onRenameSubgoal = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AHD<Goal> ahd = this.$subgoals;
                G0V<String, Boolean, Boolean> g0v = this.$onToggleComplete;
                AHG<String> ahg = this.$pendingCompletionIds;
                G0U<Goal, Unit> g0u = this.$onOpenSubgoal;
                G0U<String, Unit> g0u2 = this.$onDeleteSubgoal;
                G0W<String, String, String, Unit> g0w = this.$onRenameSubgoal;
                int i2 = 0;
                for (Object obj : ahd) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    Goal goal = (Goal) obj;
                    bfm.Ag8(-1070156085, goal.id);
                    boolean zA1J = AnonymousClass003.A1J(bfm, g0v, goal);
                    Object objAaT = bfm.AaT();
                    if (zA1J || objAaT == C78N.A00) {
                        objAaT = new GoalDetailScreenKt$GoalSubgoalsSection$2$1$1$1(g0v, goal);
                        bfm.Ai0(objAaT);
                    }
                    G0U g0u3 = (G0U) objAaT;
                    boolean zContains = ahg.contains(goal.id);
                    boolean zA1W = AnonymousClass002.A1W(bfm, g0u, bfm.A67(goal), bfm.A63(i2));
                    Object objAaT2 = bfm.AaT();
                    if (zA1W || objAaT2 == C78N.A00) {
                        objAaT2 = new GoalDetailScreenKt$GoalSubgoalsSection$2$1$2$1(goal, i2, g0u);
                        bfm.Ai0(objAaT2);
                    }
                    GoalDetailScreenKt.GoalSubgoalRow(goal, i2, g0u3, zContains, (Function0) objAaT2, g0u2, g0w, null, bfm, 0, 128);
                    AnonymousClass001.A1D(bfm);
                    i2 = i3;
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$GoalSubgoalsSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C123593 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onDeleteSubgoal;
        public final /* synthetic */ G0U<Goal, Unit> $onOpenSubgoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameSubgoal;
        public final /* synthetic */ G0V<String, Boolean, Boolean> $onToggleComplete;
        public final /* synthetic */ AHG<String> $pendingCompletionIds;
        public final /* synthetic */ AHD<Goal> $subgoals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123593(String str, AHD<Goal> ahd, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super Goal, Unit> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, int i, int i2) {
            super(2);
            this.$goalId = str;
            this.$subgoals = ahd;
            this.$onToggleComplete = g0v;
            this.$pendingCompletionIds = ahg;
            this.$onOpenSubgoal = g0u;
            this.$onDeleteSubgoal = g0u2;
            this.$onRenameSubgoal = g0w;
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
            GoalDetailScreenKt.GoalSubgoalsSection(this.$goalId, this.$subgoals, this.$onToggleComplete, this.$pendingCompletionIds, this.$onOpenSubgoal, this.$onDeleteSubgoal, this.$onRenameSubgoal, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.GoalDetailScreenKt$ShowMoreArtifactsRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C123602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ int $revealCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123602(int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$revealCount = i;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            GoalDetailScreenKt.ShowMoreArtifactsRow(this.$revealCount, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String formatGoalUpdateDate(String str) {
        Long isoToMillis;
        if (str == null || C7BY.A0j(str) || (isoToMillis = parseIsoToMillis(str)) == null) {
            return null;
        }
        return new SimpleDateFormat("MMM d", Locale.getDefault()).format(new Date(isoToMillis.longValue()));
    }

    public static final void GoalActivityItem(GoalUpdate goalUpdate, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1214887660);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, goalUpdate) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA00 = BGR.A00(C0lh.A03, AnonymousClass001.A0R(bRg2));
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0C = C3U4.A0C(bRgA00, 22.0f, 0.0f, C3cG.A00(bfm, auraTheme), 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, 14.0f, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0S);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v2 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v2);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A00;
            float f = AuraDimensKt.SpacingMicro;
            BRg bRgA0C2 = C3U4.A0C(c1062ATq, 0.0f, f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(f), bfm, C2VU.A00, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v2);
            C90l c90l = C90l.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.circlecircle_outline_24_wght600, 0), AuraIconSize.X_TINY, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            if (z) {
                bfm.AgE(1296486036);
            } else {
                bfm.AgE(1296388975);
                C1b8.A04(bfm, c90l.AiP(C10G.A08(bs0, 1.0f), 1.0f, true), auraTheme.getColors(bfm, 6).border);
            }
            boolean zA1V = AnonymousClass003.A1V(bbi);
            BRg bRgA0C3 = C3U4.A0C(AnonymousClass001.A0O(c90m, bs0, zA1V), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C3);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v2);
            AuraTextKt.m2639AuraTextUY9GdpU(goalUpdate.title, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            String str = goalUpdate.summary;
            if ((str == null && (str = goalUpdate.description) == null) || C7BY.A0j(str)) {
                bfm.AgE(-763773859);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -763932672).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            String str2 = goalUpdate.effectiveAt;
            if (str2 == null) {
                str2 = goalUpdate.createdAt;
            }
            String goalUpdateDate = formatGoalUpdateDate(str2);
            if (goalUpdateDate != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(goalUpdateDate, null, C3cH.A05(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -763648867).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(-763487171);
            }
            AnonymousClass002.A10(bbi, false, zA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(goalUpdate, z, bRg2, i, i2);
        }
    }

    public static final void GoalActivitySection(AHD<GoalUpdate> ahd, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        BRg bRg2 = bRg;
        bfm.AgG(1106786500);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(ahd, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA06 = C3U4.A06(bRg2.then(c1062ATq), AuraDimensKt.SpacingXsmallPlusNano);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a64);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).bodyMedium;
                long jA06 = C3cH.A06(bfm, auraTheme);
                BS0 bs0 = BRg.A00;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3cI.A05(bfm, c1062ATq, auraTheme), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmall);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -63743154);
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        GoalActivityItem((GoalUpdate) next, AnonymousClass002.A1Q(i4, ahd.size() - 1), null, bfm, 0, 4);
                        i4 = i5;
                    }
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(ahd, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final void GoalArtifactRow(String str, GoalAssociation goalAssociation, int i, Function0<Unit> function0, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA06;
        BRg bRg2;
        BRg bRg3 = bRg;
        bfm.AgG(-646968409);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(goalAssociation, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        int i4 = i3 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg3);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg3 = BRg.A00;
            }
            boolean zIsActionable = goalAssociation.isActionable();
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg3.then(c1062ATq);
            if (zIsActionable) {
                bRg2 = BRg.A00;
                bRgA06 = C3cI.A06(bRg2, null, function0);
            } else {
                bRgA06 = BRg.A00;
                bRg2 = bRgA06;
            }
            BRg bRgThen2 = bRgThen.then(bRgA06);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            float fA00 = C3cG.A00(bfm, auraTheme);
            float f = AuraDimensKt.SpacingXsmallPlusNano;
            BRg bRgA0B = C3U4.A0B(bRgThen2, fA00, f);
            C9m9 c9m9A00 = AcQ.A00(f);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90m c90m = C90m.A00;
            GoalAssociationUiKt.m1149GoalAssociationLeadingIcon942rkJo(goalAssociation, null, 44.0f, C1D8.A00(AuraDimensKt.SpacingSmall), bfm, ((iA0d >> 3) & 14) | 384, 2);
            BRg bRgAiP = c90m.AiP(bRg2, 1.0f, true);
            float f2 = AuraDimensKt.SpacingNano;
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f2, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(f2), bfm, c1ac, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            GoalArtifactFormatting goalArtifactFormatting = GoalArtifactFormatting.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(goalArtifactFormatting.displayTitle(goalAssociation), c90m.AiP(bRg2, 1.0f, true), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (zIsActionable) {
                bfm.AgE(1205241119);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ellipsisvertical_outline_24_wght400, 0), AuraIconSize.X_SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbi, false);
            } else if (goalAssociation instanceof GoalAssociation.Cron) {
                bfm.AgE(1205545446);
                String str2 = ((GoalAssociation.Cron) goalAssociation).cronId;
                boolean zA1Q = AnonymousClass002.A1Q(57344 & iA0d, 16384) | ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(goalAssociation)));
                Object objAaT = bfm.AaT();
                if (zA1Q || objAaT == C78N.A00) {
                    objAaT = new GoalDetailScreenKt$GoalArtifactRow$1$1$1$1$1(g0u, goalAssociation);
                    bfm.Ai0(objAaT);
                }
                GoalCronOverflowMenu(str, str2, i, (Function0) objAaT, null, bfm, iA0d & 910, 16);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1205778969);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            String strDisplaySubtitle = goalArtifactFormatting.displaySubtitle(goalAssociation);
            if (strDisplaySubtitle == null || C7BY.A0j(strDisplaySubtitle)) {
                bfm.AgE(-1200527563);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strDisplaySubtitle, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -1200759412).subheadlineRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123472(str, goalAssociation, i, function0, g0u, bRg3, i2, i3);
        }
    }

    public static final void GoalArtifactsSection(String str, AHD<? extends GoalAssociation> ahd, G0V<? super GoalAssociation, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c123503;
        BRg bRg2 = bRg;
        bfm.AgG(-861505446);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(ahd, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
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
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c123503 = new C123481(str, ahd, g0v, g0u, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c123503);
                }
                return;
            }
            GoalCollapsibleSection(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a65), ahd.size(), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a81), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a6f), str, "artifacts", bRg2, B1V.A00(bfm, new C123492(ahd, str, g0v, g0u), -607501476), bfm, ((iA0d << 12) & 57344) | 12779520 | ((iA0d << 6) & 3670016), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c123503 = new C123503(str, ahd, g0v, g0u, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c123503);
        }
    }

    public static final void GoalCollapsibleSection(String str, int i, String str2, String str3, String str4, String str5, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-241855112);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str4);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str5);
        }
        int i4 = i3 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0d |= iA0j;
        } else if ((i2 & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if ((i2 & 12582912) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = GoalDetailScreenKt$GoalCollapsibleSection$expanded$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT, objArr);
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = NumberFormat.getInstance(Locale.getDefault()).format(i);
                bfm.Ai0(objAaT2);
            }
            String str6 = (String) objAaT2;
            C1BO c1boA01 = C31t.A01(null, bfm, MutableState.A0A(mutableState) ? 90.0f : 0.0f, 3072, 22);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingXsmallPlusNano;
            BRg bRgA0B = C3U4.A0B(c1062ATq, 0.0f, f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str7 = str2;
            if (MutableState.A0A(mutableState)) {
                str7 = str3;
            }
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA65 = bfm.A65(mutableState) | AnonymousClass005.A1M(iA0d) | AnonymousClass007.A1I(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new GoalDetailScreenKt$GoalCollapsibleSection$1$1$1$1(str4, str5, mutableState);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA04 = C0v5.A04(c1062ATq, c1ydA0A, str7, (Function0) objAaT3, true);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B2 = C3U4.A0B(bRgA04, C3cG.A00(bfm, auraTheme), f);
            InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, C2VU.A04, 48);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(C90m.A00, bs0, true), C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            C7384Etj.A0X(str6);
            AuraTextKt.m2639AuraTextUY9GdpU(str6, null, C3cH.A05(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            boolean zA652 = bfm.A65(c1boA01);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == obj) {
                objAaT4 = new GoalDetailScreenKt$GoalCollapsibleSection$1$1$2$1$1(c1boA01);
                bfm.Ai0(objAaT4);
            }
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0W(bs0, objAaT4), BOf.A00(bfm, R.drawable.chevronright_outline_24_wght600, 0), AuraIconSize.X_SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 32);
            BBI.A0R(bbi, true);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-1104056029);
                AnonymousClass003.A13(bfm, g0v, iA0d >> 21);
            } else {
                bfm.AgE(-1104030082);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            AuraDividerKt.AuraDivider(c1062ATq, AuraDividerStyle.Secondary.INSTANCE, false, bfm, 54, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123512(str, i, str2, str3, str4, str5, bRg2, g0v, i2, i3);
        }
    }

    public static final void GoalCronOverflowMenu(String str, String str2, int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1516889062);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121059);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0);
            boolean zA1K = AnonymousClass003.A1K(bfm, strA01, aVyA00);
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == obj) {
                objAaT2 = AGI.A0E(new AuraContextMenuItem(1, strA01, null, aVyA00, null, null, false, false, false, true, true, BRg.A00, 1, 1));
                bfm.Ai0(objAaT2);
            }
            AHH ahh = (AHH) objAaT2;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA07 = C10G.A07(BRg.A00, CRON_OVERFLOW_FOOTPRINT);
            Alignment alignment = C2VU.A09;
            BRg bRgA06 = C10G.A06(C10G.A02(alignment, bRgA07, true), CRON_OVERFLOW_TOUCH_TARGET);
            C1YD c1ydA0A = C3cG.A0A(0);
            int i5 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 4);
            int i6 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i7 = iA0d & 896;
            boolean zA1Q2 = zA1Q | AnonymousClass002.A1Q(i6, 32) | AnonymousClass002.A1Q(i7, 256);
            Object objAaT3 = bfm.AaT();
            if (zA1Q2 || objAaT3 == obj) {
                objAaT3 = new GoalDetailScreenKt$GoalCronOverflowMenu$1$1$1(str, str2, i, mutableState);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA04 = C0v5.A04(bRgA06, c1ydA0A, null, (Function0) objAaT3, true);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA04);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA01, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ellipsisvertical_outline_24_wght400, 0), AuraIconSize.X_SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120704), C3cH.A0W(bfm).tertiaryText, null, bfm, AnonymousClass001.A03(), 33);
            BBI.A0R(bbi, true);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1Q3 = AnonymousClass002.A1Q(i6, 32) | AnonymousClass002.A1Q(i5, 4) | AnonymousClass002.A1Q(i7, 256);
            Object objAaT4 = bfm.AaT();
            if (zA1Q3 || objAaT4 == obj) {
                objAaT4 = new GoalDetailScreenKt$GoalCronOverflowMenu$1$3$1(str, str2, i, mutableState, mutableState2);
                bfm.Ai0(objAaT4);
            }
            G0U g0u2 = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new GoalDetailScreenKt$GoalCronOverflowMenu$1$4$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u2, (Function0) objAaT5, zA0A, null, 0L, null, false, new GoalDetailScreenKt$GoalCronOverflowMenu$1$5(ahh), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, true);
            if (MutableState.A0A(mutableState2)) {
                bfm.AgE(2006345412);
                boolean zA1M = AnonymousClass004.A1M(iA0d);
                Object objAaT6 = bfm.AaT();
                if (zA1M || objAaT6 == obj) {
                    objAaT6 = new GoalDetailScreenKt$GoalCronOverflowMenu$2$1(function0, mutableState2);
                    bfm.Ai0(objAaT6);
                }
                Function0 function03 = (Function0) objAaT6;
                Object objAaT7 = bfm.AaT();
                if (objAaT7 == obj) {
                    objAaT7 = new GoalDetailScreenKt$GoalCronOverflowMenu$3$1(mutableState2);
                    bfm.Ai0(objAaT7);
                }
                TaskDeleteConfirmationDialogKt.TaskDeleteConfirmationDialog(function03, (Function0) objAaT7, null, null, bfm, 48, 12);
            } else {
                bfm.AgE(2006533768);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, str2, i, function0, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalDetailScreen(java.lang.String r48, X.BRg r49, java.lang.String r50, java.lang.String r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalDetailScreenKt.GoalDetailScreen(java.lang.String, X.BRg, java.lang.String, java.lang.String, X.BFM, int, int):void");
    }

    public static final void GoalSubgoalRow(Goal goal, int i, G0U<? super Boolean, Boolean> g0u, boolean z, Function0<Unit> function0, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1239831710);
        int iA0T = (i2 & 6) == 0 ? AnonymousClass004.A0T(bfm, goal) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0T |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i2 & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i2) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if ((1572864 & i2) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, g0w);
        }
        int i4 = i3 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA0T |= iA0k;
        } else if ((12582912 & i2) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0T |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0T, 4793490), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0S(bfm, goal.isCompleted());
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            boolean zA67 = bfm.A67(goal);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new GoalDetailScreenKt$GoalSubgoalRow$openMenu$1$1(goal, mutableState2, mutableState);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) objAaT3;
            String str = goal.title;
            if (str == null) {
                str = "";
            }
            boolean zIsCompleted = goal.isCompleted();
            C1YD c1ydA0A = C3cG.A0A(0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120704);
            boolean zA1N = AnonymousClass003.A1N(bfm, c0dxA0T, function02);
            Object objAaT4 = bfm.AaT();
            if (zA1N || objAaT4 == obj) {
                objAaT4 = new GoalDetailScreenKt$GoalSubgoalRow$1$1(c0dxA0T, function02);
                bfm.Ai0(objAaT4);
            }
            GoalListItemRowKt.GoalListItemRow(str, C0v5.A03(bRg2, c1ydA0A, strA01, (Function0) objAaT4, function0, true), null, false, zIsCompleted, null, null, B1V.A00(bfm, new C123542(goal, g0u, z), 1489483522), B1V.A00(bfm, new C123553(goal, function02, g0u, g0u2, g0w, z, i, mutableState, mutableState2), 805253217), bfm, 113249280, 100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123564(goal, i, g0u, z, function0, g0u2, g0w, bRg2, i2, i3);
        }
    }

    public static final void GoalSubgoalsSection(String str, AHD<Goal> ahd, G0V<? super String, ? super Boolean, Boolean> g0v, AHG<String> ahg, G0U<? super Goal, Unit> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c123593;
        BRg bRg2 = bRg;
        bfm.AgG(257191798);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, ahg);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0w);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0d, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c123593 = new C123571(str, ahd, g0v, ahg, g0u, g0u2, g0w, bRg2, i, i2);
                    bBbAAc.A06 = c123593;
                }
                return;
            }
            GoalCollapsibleSection(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a67), ahd.size(), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a82), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a70), str, GOALS_SECTION_SUBGOALS, bRg2, B1V.A00(bfm, new C123582(ahd, g0v, ahg, g0u, g0u2, g0w), 1532333236), bfm, AnonymousClass001.A05(iA0d >> 3, ((iA0d << 12) & 57344) | 12779520), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c123593 = new C123593(str, ahd, g0v, ahg, g0u, g0u2, g0w, bRg2, i, i2);
            bBbAAc.A06 = c123593;
        }
    }

    public static final void ShowMoreArtifactsRow(int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1768739421);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA05 = C3cI.A05(bfm, bRgA04, auraTheme);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA05);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA02);
            AuraIconKt.m2567AuraIconFHprtrg(C11T.A00(BRg.A00, -90.0f), BOf.A00(bfm, R.drawable.dot6_wght400_outline_24, 0), AuraIconSize.SMALL, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 32);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f10002f), null, C3cH.A05(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123602(i, function0, bRg2, i2, i3);
        }
    }

    public static final Map<String, String> cronRowLogMetadata(String str, String str2, int i) {
        return C3cH.A0n(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i), C3cG.A0r(HatchMetadataKey.GOAL_ID.getValue(), str), C3cG.A0r(HatchMetadataKey.ASSOCIATION_TYPE.getValue(), CRON_ASSOCIATION_TYPE), C3cG.A0r(HatchMetadataKey.ASSOCIATION_ID.getValue(), str2));
    }

    public static final Long parseIsoToMillis(String str) {
        Iterator<String> it = ISO_INPUT_PATTERNS.iterator();
        while (it.hasNext()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AnonymousClass005.A0j(it), Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat.setLenient(false);
            ParsePosition parsePosition = new ParsePosition(0);
            Date date = simpleDateFormat.parse(str, parsePosition);
            if (date != null && parsePosition.getIndex() == str.length()) {
                return Long.valueOf(date.getTime());
            }
        }
        return null;
    }

    public static final /* synthetic */ GoalDetail access$GoalDetailScreen$lambda$0(C1BO c1bo) {
        return (GoalDetail) c1bo.getValue();
    }

    public static final /* synthetic */ GoalDetailViewModel.LoadState access$GoalDetailScreen$lambda$1(C1BO c1bo) {
        return (GoalDetailViewModel.LoadState) c1bo.getValue();
    }

    public static final /* synthetic */ AHG access$GoalDetailScreen$lambda$2(C1BO c1bo) {
        return (AHG) c1bo.getValue();
    }
}
