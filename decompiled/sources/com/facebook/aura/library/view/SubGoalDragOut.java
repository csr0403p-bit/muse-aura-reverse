package com.facebook.aura.library.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.G0U;
import X.G2k;
import com.facebook.aura.library.repo.GoalListSection;
import com.facebook.aura.ui.DraggedRowPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SubGoalDragOut {
    public final Function0<Boolean> collapseDragSlot;
    public final Function0<Float> dragTranslationY;
    public final Function0<Unit> onCancelled;
    public final G0U<DraggedRowPosition, Unit> onMoved;
    public final Function0<Boolean> onReleased;
    public final G2k<Object, String, GoalListSection, String, DraggedRowPosition, Boolean> onStarted;
    public final Function0<Object> retainedDragKey;

    public final Function0<Boolean> getCollapseDragSlot() {
        return this.collapseDragSlot;
    }

    public final Function0<Float> getDragTranslationY() {
        return this.dragTranslationY;
    }

    public final Function0<Unit> getOnCancelled() {
        return this.onCancelled;
    }

    public final G0U<DraggedRowPosition, Unit> getOnMoved() {
        return this.onMoved;
    }

    public final Function0<Boolean> getOnReleased() {
        return this.onReleased;
    }

    public final G2k<Object, String, GoalListSection, String, DraggedRowPosition, Boolean> getOnStarted() {
        return this.onStarted;
    }

    public final Function0<Object> getRetainedDragKey() {
        return this.retainedDragKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubGoalDragOut(G2k<Object, ? super String, ? super GoalListSection, ? super String, ? super DraggedRowPosition, Boolean> g2k, G0U<? super DraggedRowPosition, Unit> g0u, Function0<Boolean> function0, Function0<Unit> function02, Function0<? extends Object> function03, Function0<Float> function04, Function0<Boolean> function05) {
        AnonymousClass005.A17(g2k, g0u, function0, function02, function03);
        AnonymousClass003.A0z(function04, function05);
        this.onStarted = g2k;
        this.onMoved = g0u;
        this.onReleased = function0;
        this.onCancelled = function02;
        this.retainedDragKey = function03;
        this.dragTranslationY = function04;
        this.collapseDragSlot = function05;
    }
}
