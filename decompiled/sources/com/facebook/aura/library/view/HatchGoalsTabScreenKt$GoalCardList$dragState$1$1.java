package com.facebook.aura.library.view;

import X.AHG;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cG;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.GoalListSection;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$dragState$1$1 extends AbstractC7559F3s implements G0V<GoalListSection, String, Unit> {
    public final /* synthetic */ MutableState<AHG<String>> $expandedGoalIds$delegate;
    public final /* synthetic */ MutableState<AHG<String>> $trackingExpandedGoalIds$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoalListSection.values().length];
            try {
                AnonymousClass002.A13(GoalListSection.GOALS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(GoalListSection.TRACKING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalCardList$dragState$1$1(MutableState<AHG<String>> mutableState, MutableState<AHG<String>> mutableState2) {
        super(2);
        this.$expandedGoalIds$delegate = mutableState;
        this.$trackingExpandedGoalIds$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(GoalListSection goalListSection, String str) {
        invoke2(goalListSection, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GoalListSection goalListSection, String str) {
        MutableState<AHG<String>> mutableState;
        boolean zA1a = AnonymousClass002.A1a(goalListSection, str);
        int iOrdinal = goalListSection.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == zA1a) {
                mutableState = this.$trackingExpandedGoalIds$delegate;
            } else {
                throw C3cG.A0q();
            }
        } else {
            mutableState = this.$expandedGoalIds$delegate;
        }
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        mutableState.Af8(mutableState.getValue().A35(str));
    }
}
