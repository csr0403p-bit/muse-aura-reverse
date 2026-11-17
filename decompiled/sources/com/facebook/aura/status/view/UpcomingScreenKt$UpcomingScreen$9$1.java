package com.facebook.aura.status.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel;
import com.facebook.aura.status.viewmodel.TaskCategory;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class UpcomingScreenKt$UpcomingScreen$9$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ AHD<HatchTaskUiModel> $dailyTasks;
    public final /* synthetic */ AHD<HatchTaskUiModel> $intervalTasks;
    public final /* synthetic */ AHD<HatchTaskUiModel> $monthlyTasks;
    public final /* synthetic */ G0U<String, Unit> $onRemoveTask;
    public final /* synthetic */ AHD<HatchTaskUiModel> $reminderTasks;
    public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
    public final /* synthetic */ TasksViewModel $tasksViewModel;
    public final /* synthetic */ AHD<HatchUpcomingTaskUiModel> $upcomingTasks;
    public final /* synthetic */ AHD<HatchTaskUiModel> $weeklyTasks;
    public final /* synthetic */ AHD<HatchTaskUiModel> $yearlyTasks;

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingScreen$9$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<String, Unit> $onRemoveTask;
        public final /* synthetic */ AHD<HatchUpcomingTaskUiModel> $upcomingTasks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<HatchUpcomingTaskUiModel> ahd, G0U<? super String, Unit> g0u) {
            super(3);
            this.$upcomingTasks = ahd;
            this.$onRemoveTask = g0u;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                UpcomingScreenKt.UpcomingCard(this.$upcomingTasks, this.$onRemoveTask, null, bfm, 0, 4);
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

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingScreen$9$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<HatchTaskUiModel> $reminderTasks;
        public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
        public final /* synthetic */ TasksViewModel $tasksViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<HatchTaskUiModel> ahd, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
            super(3);
            this.$reminderTasks = ahd;
            this.$tasksViewModel = tasksViewModel;
            this.$selectedTask$delegate = mutableState;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            TaskCategory taskCategory = TaskCategory.REMINDERS;
            AHD<HatchTaskUiModel> ahd = this.$reminderTasks;
            boolean zA67 = bfm.A67(this.$tasksViewModel);
            TasksViewModel tasksViewModel = this.$tasksViewModel;
            MutableState<HatchTaskUiModel> mutableState = this.$selectedTask$delegate;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new UpcomingScreenKt$UpcomingScreen$9$1$2$1$1(tasksViewModel, mutableState);
                bfm.Ai0(objAaT);
            }
            C3cJ.A0b(bfm, taskCategory, objAaT, ahd);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingScreen$9$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<HatchTaskUiModel> $dailyTasks;
        public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
        public final /* synthetic */ TasksViewModel $tasksViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AHD<HatchTaskUiModel> ahd, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
            super(3);
            this.$dailyTasks = ahd;
            this.$tasksViewModel = tasksViewModel;
            this.$selectedTask$delegate = mutableState;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            TaskCategory taskCategory = TaskCategory.DAILY;
            AHD<HatchTaskUiModel> ahd = this.$dailyTasks;
            boolean zA67 = bfm.A67(this.$tasksViewModel);
            TasksViewModel tasksViewModel = this.$tasksViewModel;
            MutableState<HatchTaskUiModel> mutableState = this.$selectedTask$delegate;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new UpcomingScreenKt$UpcomingScreen$9$1$3$1$1(tasksViewModel, mutableState);
                bfm.Ai0(objAaT);
            }
            C3cJ.A0b(bfm, taskCategory, objAaT, ahd);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingScreen$9$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<HatchTaskUiModel> $intervalTasks;
        public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
        public final /* synthetic */ TasksViewModel $tasksViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AHD<HatchTaskUiModel> ahd, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
            super(3);
            this.$intervalTasks = ahd;
            this.$tasksViewModel = tasksViewModel;
            this.$selectedTask$delegate = mutableState;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            TaskCategory taskCategory = TaskCategory.INTERVAL;
            AHD<HatchTaskUiModel> ahd = this.$intervalTasks;
            boolean zA67 = bfm.A67(this.$tasksViewModel);
            TasksViewModel tasksViewModel = this.$tasksViewModel;
            MutableState<HatchTaskUiModel> mutableState = this.$selectedTask$delegate;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new UpcomingScreenKt$UpcomingScreen$9$1$4$1$1(tasksViewModel, mutableState);
                bfm.Ai0(objAaT);
            }
            C3cJ.A0b(bfm, taskCategory, objAaT, ahd);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingScreen$9$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
        public final /* synthetic */ TasksViewModel $tasksViewModel;
        public final /* synthetic */ AHD<HatchTaskUiModel> $weeklyTasks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AHD<HatchTaskUiModel> ahd, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
            super(3);
            this.$weeklyTasks = ahd;
            this.$tasksViewModel = tasksViewModel;
            this.$selectedTask$delegate = mutableState;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            TaskCategory taskCategory = TaskCategory.WEEKLY;
            AHD<HatchTaskUiModel> ahd = this.$weeklyTasks;
            boolean zA67 = bfm.A67(this.$tasksViewModel);
            TasksViewModel tasksViewModel = this.$tasksViewModel;
            MutableState<HatchTaskUiModel> mutableState = this.$selectedTask$delegate;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new UpcomingScreenKt$UpcomingScreen$9$1$5$1$1(tasksViewModel, mutableState);
                bfm.Ai0(objAaT);
            }
            C3cJ.A0b(bfm, taskCategory, objAaT, ahd);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingScreen$9$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<HatchTaskUiModel> $monthlyTasks;
        public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
        public final /* synthetic */ TasksViewModel $tasksViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(AHD<HatchTaskUiModel> ahd, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
            super(3);
            this.$monthlyTasks = ahd;
            this.$tasksViewModel = tasksViewModel;
            this.$selectedTask$delegate = mutableState;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            TaskCategory taskCategory = TaskCategory.MONTHLY;
            AHD<HatchTaskUiModel> ahd = this.$monthlyTasks;
            boolean zA67 = bfm.A67(this.$tasksViewModel);
            TasksViewModel tasksViewModel = this.$tasksViewModel;
            MutableState<HatchTaskUiModel> mutableState = this.$selectedTask$delegate;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new UpcomingScreenKt$UpcomingScreen$9$1$6$1$1(tasksViewModel, mutableState);
                bfm.Ai0(objAaT);
            }
            C3cJ.A0b(bfm, taskCategory, objAaT, ahd);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingScreen$9$1$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
        public final /* synthetic */ TasksViewModel $tasksViewModel;
        public final /* synthetic */ AHD<HatchTaskUiModel> $yearlyTasks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AHD<HatchTaskUiModel> ahd, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
            super(3);
            this.$yearlyTasks = ahd;
            this.$tasksViewModel = tasksViewModel;
            this.$selectedTask$delegate = mutableState;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            TaskCategory taskCategory = TaskCategory.YEARLY;
            AHD<HatchTaskUiModel> ahd = this.$yearlyTasks;
            boolean zA67 = bfm.A67(this.$tasksViewModel);
            TasksViewModel tasksViewModel = this.$tasksViewModel;
            MutableState<HatchTaskUiModel> mutableState = this.$selectedTask$delegate;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new UpcomingScreenKt$UpcomingScreen$9$1$7$1$1(tasksViewModel, mutableState);
                bfm.Ai0(objAaT);
            }
            C3cJ.A0b(bfm, taskCategory, objAaT, ahd);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        if (!this.$upcomingTasks.isEmpty()) {
            C3cI.A19(c0cd, new AnonymousClass1(this.$upcomingTasks, this.$onRemoveTask), -657176059);
        }
        if (!this.$reminderTasks.isEmpty()) {
            C3cI.A19(c0cd, new AnonymousClass2(this.$reminderTasks, this.$tasksViewModel, this.$selectedTask$delegate), -1470507154);
        }
        if (!this.$dailyTasks.isEmpty()) {
            C3cI.A19(c0cd, new AnonymousClass3(this.$dailyTasks, this.$tasksViewModel, this.$selectedTask$delegate), 240771213);
        }
        if (!this.$intervalTasks.isEmpty()) {
            C3cI.A19(c0cd, new AnonymousClass4(this.$intervalTasks, this.$tasksViewModel, this.$selectedTask$delegate), 1952049580);
        }
        if (!this.$weeklyTasks.isEmpty()) {
            C3cI.A19(c0cd, new AnonymousClass5(this.$weeklyTasks, this.$tasksViewModel, this.$selectedTask$delegate), -631639349);
        }
        if (!this.$monthlyTasks.isEmpty()) {
            C3cI.A19(c0cd, new AnonymousClass6(this.$monthlyTasks, this.$tasksViewModel, this.$selectedTask$delegate), 1079639018);
        }
        if (this.$yearlyTasks.isEmpty()) {
            return;
        }
        C3cI.A19(c0cd, new AnonymousClass7(this.$yearlyTasks, this.$tasksViewModel, this.$selectedTask$delegate), -1504049911);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UpcomingScreenKt$UpcomingScreen$9$1(AHD<HatchUpcomingTaskUiModel> ahd, AHD<HatchTaskUiModel> ahd2, AHD<HatchTaskUiModel> ahd3, AHD<HatchTaskUiModel> ahd4, AHD<HatchTaskUiModel> ahd5, AHD<HatchTaskUiModel> ahd6, AHD<HatchTaskUiModel> ahd7, G0U<? super String, Unit> g0u, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
        super(1);
        this.$upcomingTasks = ahd;
        this.$reminderTasks = ahd2;
        this.$dailyTasks = ahd3;
        this.$intervalTasks = ahd4;
        this.$weeklyTasks = ahd5;
        this.$monthlyTasks = ahd6;
        this.$yearlyTasks = ahd7;
        this.$onRemoveTask = g0u;
        this.$tasksViewModel = tasksViewModel;
        this.$selectedTask$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
