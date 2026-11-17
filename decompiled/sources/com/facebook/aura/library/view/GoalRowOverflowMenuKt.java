package com.facebook.aura.library.view;

import X.AIW;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.library.repo.Goal;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class GoalRowOverflowMenuKt {
    public static final float OVERFLOW_MENU_FOOTPRINT = 24.0f;
    public static final float OVERFLOW_MENU_TOUCH_TARGET = 48.0f;

    /* renamed from: com.facebook.aura.library.view.GoalRowOverflowMenuKt$GoalRowOverflowMenu$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $absolutePosition;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Goal $goal;
        public final /* synthetic */ boolean $isSubGoal;
        public final /* synthetic */ boolean $menuGoalCompleted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Boolean> $onComplete;
        public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ Function0<Unit> $onPromoteToGoal;
        public final /* synthetic */ G0W<String, String, String, Unit> $onRenameGoal;
        public final /* synthetic */ boolean $pending;
        public final /* synthetic */ boolean $replaceWithPendingIndicator;
        public final /* synthetic */ HatchScreen $screen;

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Goal goal, boolean z, boolean z2, HatchScreen hatchScreen, Function0<Unit> function0, Function0<Unit> function02, G0U<? super Boolean, Boolean> g0u, G0U<? super String, Unit> g0u2, G0W<? super String, ? super String, ? super String, Unit> g0w, boolean z3, BRg bRg, boolean z4, boolean z5, Integer num, Function0<Unit> function03, int i, int i2, int i3) {
            super(2);
            this.$goal = goal;
            this.$expanded = z;
            this.$menuGoalCompleted = z2;
            this.$screen = hatchScreen;
            this.$onOpen = function0;
            this.$onDismiss = function02;
            this.$onComplete = g0u;
            this.$onDeleteGoal = g0u2;
            this.$onRenameGoal = g0w;
            this.$isSubGoal = z3;
            this.$modifier = bRg;
            this.$pending = z4;
            this.$replaceWithPendingIndicator = z5;
            this.$absolutePosition = num;
            this.$onPromoteToGoal = function03;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            GoalRowOverflowMenuKt.GoalRowOverflowMenu(this.$goal, this.$expanded, this.$menuGoalCompleted, this.$screen, this.$onOpen, this.$onDismiss, this.$onComplete, this.$onDeleteGoal, this.$onRenameGoal, this.$isSubGoal, this.$modifier, this.$pending, this.$replaceWithPendingIndicator, this.$absolutePosition, this.$onPromoteToGoal, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    public static final void logGoalCompleteToggle(boolean z, HatchScreen hatchScreen, String str, Integer num, HatchSubsurface hatchSubsurface) {
        AnonymousClass003.A0x(hatchScreen, str);
        C7384Etj.A0Y(hatchSubsurface, 4);
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.GOALS, hatchSubsurface, hatchScreen, HatchComponent.GOAL_COMPLETE_BUTTON, null, goalRowLogMetadata(str, num));
    }

    public static final void logGoalRowClick(HatchComponent hatchComponent, HatchScreen hatchScreen, String str, HatchSubsurface hatchSubsurface, Integer num) {
        AnonymousClass005.A14(hatchComponent, hatchScreen, str, hatchSubsurface);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.GOALS, hatchSubsurface, hatchScreen, hatchComponent, null, goalRowLogMetadata(str, num), null);
    }

    public static /* synthetic */ void logGoalCompleteToggle$default(boolean z, HatchScreen hatchScreen, String str, Integer num, HatchSubsurface hatchSubsurface, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            hatchSubsurface = HatchSubsurface.DOT_MENU;
        }
        logGoalCompleteToggle(z, hatchScreen, str, num, hatchSubsurface);
    }

    public static /* synthetic */ void logGoalRowClick$default(HatchComponent hatchComponent, HatchScreen hatchScreen, String str, HatchSubsurface hatchSubsurface, Integer num, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchSubsurface = HatchSubsurface.GOALS;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        logGoalRowClick(hatchComponent, hatchScreen, str, hatchSubsurface, num);
    }

    public static final Map<String, String> goalRowLogMetadata(String str, Integer num) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.GOAL_ID, str, c0924AIaA0u);
        if (num != null) {
            AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIaA0u, num.intValue());
        }
        return AIW.A0K(c0924AIaA0u);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalRowOverflowMenu(com.facebook.aura.library.repo.Goal r49, boolean r50, boolean r51, com.facebook.aura.analytics.hatch.HatchScreen r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, X.G0U<? super java.lang.Boolean, java.lang.Boolean> r55, X.G0U<? super java.lang.String, kotlin.Unit> r56, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r57, boolean r58, X.BRg r59, boolean r60, boolean r61, java.lang.Integer r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63, X.BFM r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.GoalRowOverflowMenuKt.GoalRowOverflowMenu(com.facebook.aura.library.repo.Goal, boolean, boolean, com.facebook.aura.analytics.hatch.HatchScreen, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0W, boolean, X.BRg, boolean, boolean, java.lang.Integer, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }
}
