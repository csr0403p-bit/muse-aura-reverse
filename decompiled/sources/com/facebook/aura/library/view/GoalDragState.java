package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BIj;
import X.BL4;
import X.BRg;
import X.C0981AMm;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.ReorderableLazyListState;
import com.facebook.aura.ui.ReorderableListKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalDragState {
    public final boolean enabled;
    public final ReorderableLazyListState reorderState;
    public final C0981AMm<Object, Integer> rootRowHeights;
    public final SubGoalDragOut subGoalDragOut;

    /* renamed from: com.facebook.aura.library.view.GoalDragState$rowModifier$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
        public final /* synthetic */ Object $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj) {
            super(1);
            this.$key = obj;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
            m1151invokeozmzZPI(bl4.A00);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final void m1151invokeozmzZPI(long j) {
            GoalDragState.this.rootRowHeights.put(this.$key, Integer.valueOf(AnonymousClass002.A09(j)));
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ReorderableLazyListState getReorderState() {
        return this.reorderState;
    }

    public final C0981AMm<Object, Integer> getRootRowHeights() {
        return this.rootRowHeights;
    }

    public final SubGoalDragOut getSubGoalDragOut() {
        return this.subGoalDragOut;
    }

    public GoalDragState(ReorderableLazyListState reorderableLazyListState, SubGoalDragOut subGoalDragOut, C0981AMm<Object, Integer> c0981AMm, boolean z) {
        AnonymousClass005.A0x(reorderableLazyListState, subGoalDragOut, c0981AMm);
        this.reorderState = reorderableLazyListState;
        this.subGoalDragOut = subGoalDragOut;
        this.rootRowHeights = c0981AMm;
        this.enabled = z;
    }

    public final BRg rowModifier(Object obj, MutableState<Object> mutableState) {
        AnonymousClass003.A0u(obj, mutableState);
        BRg bRgDetectReorderAfterLongPress = BRg.A00;
        BRg bRgA00 = BIj.A00(bRgDetectReorderAfterLongPress, new AnonymousClass1(obj));
        if (this.enabled) {
            bRgDetectReorderAfterLongPress = ReorderableListKt.detectReorderAfterLongPress(bRgDetectReorderAfterLongPress, this.reorderState, obj, mutableState);
        }
        return bRgA00.then(bRgDetectReorderAfterLongPress);
    }
}
