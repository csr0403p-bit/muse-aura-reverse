package com.facebook.aura.library.model;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHG;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalAssociation;
import com.facebook.aura.library.repo.GoalDetail;
import com.facebook.aura.library.repo.HatchGoalsTabDataSource;
import com.facebook.aura.library.view.GoalDetailScreenKt;
import com.facebook.aura.model.HatchEngagementEventType;
import com.facebook.aura.status.repo.TaskRemovalResult;
import com.facebook.aura.status.repo.TasksDataSource;
import com.facebook.aura.toast.api.ToastApi;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class GoalDetailViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<GoalDetail> _goalDetail;
    public final BLG<LoadState> _loadState;
    public final HatchGoalsTabDataSource dataSource;
    public final C1BN<GoalDetail> goalDetail;
    public final String goalId;
    public final C1BN<LoadState> loadState;
    public final C1BN<AHG<String>> pendingCompletionIds;
    public final TasksDataSource tasksDataSource;

    public final class Factory extends AuraViewModelFactory<GoalDetailViewModel> {
        public static final int $stable = 8;
        public final String goalId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public GoalDetailViewModel create() {
            return new GoalDetailViewModel(this.goalId, HatchGoalsTabDataSource.Companion.getInstance(this.userSession), TasksDataSource.Companion.getInstance(this.userSession));
        }

        public Factory(String str, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(str, abstractC3358CGz);
            this.goalId = str;
            this.userSession = abstractC3358CGz;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoadState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ LoadState[] $VALUES;
        public static final LoadState FAILED;
        public static final LoadState LOADED;
        public static final LoadState LOADING;

        static {
            LoadState loadState = new LoadState("LOADING", 0);
            LOADING = loadState;
            LoadState loadState2 = new LoadState("LOADED", 1);
            LOADED = loadState2;
            LoadState loadState3 = new LoadState(CvmMigrationStatusJson.STAGE_FAILED, 2);
            FAILED = loadState3;
            LoadState[] loadStateArr = {loadState, loadState2, loadState3};
            $VALUES = loadStateArr;
            $ENTRIES = C3cG.A0w(loadStateArr);
        }

        public static Ey9<LoadState> getEntries() {
            return $ENTRIES;
        }

        public static LoadState valueOf(String str) {
            return (LoadState) Enum.valueOf(LoadState.class, str);
        }

        public static LoadState[] values() {
            return (LoadState[]) $VALUES.clone();
        }

        public LoadState(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$deleteCron$2", f = "GoalDetailViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$deleteCron$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cronId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$cronId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new AnonymousClass2(this.$cronId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                TasksDataSource tasksDataSource = GoalDetailViewModel.this.tasksDataSource;
                String str = this.$cronId;
                this.label = 1;
                obj = tasksDataSource.removeTask(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            TaskRemovalResult taskRemovalResult = (TaskRemovalResult) obj;
            ToastApi.INSTANCE.showToast(taskRemovalResult.getToastRes());
            if (taskRemovalResult == TaskRemovalResult.SUCCESS) {
                GoalDetailViewModel.this.refreshDetail();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$deleteCurrentGoal$1", f = "GoalDetailViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$deleteCurrentGoal$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                GoalDetailViewModel goalDetailViewModel = GoalDetailViewModel.this;
                HatchGoalsTabDataSource hatchGoalsTabDataSource = goalDetailViewModel.dataSource;
                String str = goalDetailViewModel.goalId;
                this.label = 1;
                if (hatchGoalsTabDataSource.deleteGoal(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return GoalDetailViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$deleteSubgoal$2", f = "GoalDetailViewModel.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$deleteSubgoal$2, reason: invalid class name and case insensitive filesystem */
    public final class C122482 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $subgoalId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122482(String str, HtJ<? super C122482> htJ) {
            super(2, htJ);
            this.$subgoalId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new C122482(this.$subgoalId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = GoalDetailViewModel.this.dataSource;
                String str = this.$subgoalId;
                this.label = 1;
                if (hatchGoalsTabDataSource.deleteGoal(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122482) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$recordGoalEngagement$1", f = "GoalDetailViewModel.kt", l = {168}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$recordGoalEngagement$1, reason: invalid class name and case insensitive filesystem */
    public final class C122491 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122491(HtJ<? super C122491> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new C122491(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                GoalDetailViewModel goalDetailViewModel = GoalDetailViewModel.this;
                HatchGoalsTabDataSource hatchGoalsTabDataSource = goalDetailViewModel.dataSource;
                String str = goalDetailViewModel.goalId;
                HatchEngagementEventType hatchEngagementEventType = HatchEngagementEventType.ENGAGEMENT;
                JsonObject jsonObjectSourceMetadata = HatchGoalsTabViewModelKt.sourceMetadata("android_tap");
                this.label = 1;
                if (hatchGoalsTabDataSource.recordGoalEngagement(str, hatchEngagementEventType, HatchGoalsTabViewModelKt.DETAIL_ENGAGEMENT_SURFACE, null, jsonObjectSourceMetadata, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return GoalDetailViewModel.this.new C122491(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$refreshDetail$1", f = "GoalDetailViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$refreshDetail$1, reason: invalid class name and case insensitive filesystem */
    public final class C122501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122501(HtJ<? super C122501> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new C122501(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<LoadState> blg;
            LoadState loadState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (GoalDetailViewModel.this._goalDetail.getValue() == null) {
                    AnonymousClass002.A1I(GoalDetailViewModel.this._loadState, LoadState.LOADING);
                }
                GoalDetailViewModel goalDetailViewModel = GoalDetailViewModel.this;
                HatchGoalsTabDataSource hatchGoalsTabDataSource = goalDetailViewModel.dataSource;
                String str = goalDetailViewModel.goalId;
                this.label = 1;
                obj = hatchGoalsTabDataSource.loadGoalDetail(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BLG<GoalDetail> blg2 = GoalDetailViewModel.this._goalDetail;
            if (obj == null) {
                if (blg2.getValue() == null) {
                    blg = GoalDetailViewModel.this._loadState;
                    loadState = LoadState.FAILED;
                }
                return Unit.INSTANCE;
            }
            AnonymousClass002.A1I(blg2, obj);
            blg = GoalDetailViewModel.this._loadState;
            loadState = LoadState.LOADED;
            AnonymousClass002.A1I(blg, loadState);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return GoalDetailViewModel.this.new C122501(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$renameCurrentGoal$1", f = "GoalDetailViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$renameCurrentGoal$1, reason: invalid class name and case insensitive filesystem */
    public final class C122511 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $title;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122511(String str, String str2, HtJ<? super C122511> htJ) {
            super(2, htJ);
            this.$title = str;
            this.$description = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new C122511(this.$title, this.$description, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                GoalDetailViewModel goalDetailViewModel = GoalDetailViewModel.this;
                HatchGoalsTabDataSource hatchGoalsTabDataSource = goalDetailViewModel.dataSource;
                String str = goalDetailViewModel.goalId;
                String str2 = this.$title;
                String str3 = this.$description;
                this.label = 1;
                if (hatchGoalsTabDataSource.updateGoal(str, str2, str3, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122511) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$renameSubgoal$2", f = "GoalDetailViewModel.kt", l = {134}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$renameSubgoal$2, reason: invalid class name and case insensitive filesystem */
    public final class C122522 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $subgoalId;
        public final /* synthetic */ String $title;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122522(String str, String str2, String str3, HtJ<? super C122522> htJ) {
            super(2, htJ);
            this.$subgoalId = str;
            this.$title = str2;
            this.$description = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new C122522(this.$subgoalId, this.$title, this.$description, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGoalsTabDataSource hatchGoalsTabDataSource = GoalDetailViewModel.this.dataSource;
                String str = this.$subgoalId;
                String str2 = this.$title;
                String str3 = this.$description;
                this.label = 1;
                if (hatchGoalsTabDataSource.updateGoal(str, str2, str3, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122522) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.GoalDetailViewModel$subscribeToGoalUpdated$1", f = "GoalDetailViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.GoalDetailViewModel$subscribeToGoalUpdated$1, reason: invalid class name and case insensitive filesystem */
    public final class C122531 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122531(HtJ<? super C122531> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return GoalDetailViewModel.this.new C122531(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final GoalDetailViewModel goalDetailViewModel = GoalDetailViewModel.this;
                C22I<Goal> c22i = goalDetailViewModel.dataSource.goalCoreUpdates;
                C20Z<? super Goal> c20z = new C20Z() { // from class: com.facebook.aura.library.model.GoalDetailViewModel.subscribeToGoalUpdated.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Goal) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Goal goal, HtJ<? super Unit> htJ) {
                        GoalDetail value;
                        GoalDetail goalDetailCopy;
                        if (C7384Etj.areEqual(goal.id, goalDetailViewModel.goalId)) {
                            BLG<GoalDetail> blg = goalDetailViewModel._goalDetail;
                            do {
                                value = blg.getValue();
                                GoalDetail goalDetail = value;
                                if (goalDetail != null) {
                                    goalDetailCopy = goalDetail.copy(goal, goalDetail.updates, goalDetail.associations);
                                } else {
                                    goalDetailCopy = null;
                                }
                            } while (!blg.A6e(value, goalDetailCopy));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return GoalDetailViewModel.this.new C122531(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void deleteCron(String str) {
        AHD<GoalAssociation> ahd;
        C7384Etj.A0Y(str, 0);
        GoalDetail value = this._goalDetail.getValue();
        if (value == null || (ahd = value.associations) == null) {
            return;
        }
        if ((ahd instanceof Collection) && ahd.isEmpty()) {
            return;
        }
        for (GoalAssociation goalAssociation : ahd) {
            if ((goalAssociation instanceof GoalAssociation.Cron) && str.equals(((GoalAssociation.Cron) goalAssociation).cronId)) {
                HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, HatchSubsurface.GOAL_DELETE_DIALOG, HatchScreen.GOAL_DETAIL, HatchComponent.DELETE_CONFIRM_BUTTON, null, C3cH.A0m(HatchMetadataKey.ASSOCIATION_ID.getValue(), str, C3cG.A0r(HatchMetadataKey.GOAL_ID.getValue(), this.goalId), C3cG.A0r(HatchMetadataKey.ASSOCIATION_TYPE.getValue(), GoalDetailScreenKt.CRON_ASSOCIATION_TYPE)), null);
                AnonymousClass001.A1J(new AnonymousClass2(str, null), AEu.A00(this));
                return;
            }
        }
    }

    public final void deleteSubgoal(String str) {
        Goal goal;
        List<Goal> list;
        C7384Etj.A0Y(str, 0);
        GoalDetail value = this._goalDetail.getValue();
        if (value == null || (goal = value.goal) == null || (list = goal.subGoals) == null) {
            return;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<Goal> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(C3cI.A0c(it))) {
                AnonymousClass001.A1J(new C122482(str, null), AEu.A00(this));
                return;
            }
        }
    }

    public final void renameSubgoal(String str, String str2, String str3) {
        Goal goal;
        List<Goal> list;
        C7384Etj.A0Y(str, 0);
        GoalDetail value = this._goalDetail.getValue();
        if (value == null || (goal = value.goal) == null || (list = goal.subGoals) == null) {
            return;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<Goal> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(C3cI.A0c(it))) {
                AnonymousClass001.A1J(new C122522(str, str2, str3, null), AEu.A00(this));
                return;
            }
        }
    }

    public final boolean setGoalCompleted(String str, boolean z) {
        Goal goal;
        List<Goal> list;
        C7384Etj.A0Y(str, 0);
        GoalDetail value = this._goalDetail.getValue();
        if (value != null && (goal = value.goal) != null && (list = goal.subGoals) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<Goal> it = list.iterator();
            while (it.hasNext()) {
                if (str.equals(C3cI.A0c(it))) {
                    return this.dataSource.setGoalCompleted(str, z);
                }
            }
        }
        return false;
    }

    public final C1BN<GoalDetail> getGoalDetail() {
        return this.goalDetail;
    }

    public final C1BN<LoadState> getLoadState() {
        return this.loadState;
    }

    public final C1BN<AHG<String>> getPendingCompletionIds() {
        return this.pendingCompletionIds;
    }

    public final void recordGoalEngagement() {
        if (this.goalId.length() != 0) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C122491(null), AEu.A00(this));
        }
    }

    public final void retry() {
        if (this._loadState.getValue() == LoadState.FAILED) {
            refreshDetail();
        }
    }

    public final boolean toggleCurrentGoalCompleted() {
        Goal goal;
        GoalDetail value = this._goalDetail.getValue();
        if (value == null || (goal = value.goal) == null) {
            return false;
        }
        return this.dataSource.setGoalCompleted(this.goalId, !goal.isCompleted());
    }

    public GoalDetailViewModel(String str, HatchGoalsTabDataSource hatchGoalsTabDataSource, TasksDataSource tasksDataSource) {
        AnonymousClass005.A0x(str, hatchGoalsTabDataSource, tasksDataSource);
        this.goalId = str;
        this.dataSource = hatchGoalsTabDataSource;
        this.tasksDataSource = tasksDataSource;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._goalDetail = c9286GCnA13;
        this.goalDetail = C3cG.A11(c9286GCnA13);
        C9286GCn c9286GCnA14 = C3cG.A14(LoadState.LOADING);
        this._loadState = c9286GCnA14;
        this.loadState = C3cG.A11(c9286GCnA14);
        this.pendingCompletionIds = hatchGoalsTabDataSource.pendingCompletionIds;
        refreshDetail();
        subscribeToGoalUpdated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshDetail() {
        AnonymousClass001.A1J(new C122501(null), AEu.A00(this));
    }

    private final void subscribeToGoalUpdated() {
        AnonymousClass001.A1J(new C122531(null), AEu.A00(this));
    }

    public final void deleteCurrentGoal() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void renameCurrentGoal(String str, String str2) {
        AnonymousClass001.A1J(new C122511(str, str2, null), AEu.A00(this));
    }
}
