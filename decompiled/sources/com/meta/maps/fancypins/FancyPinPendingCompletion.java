package com.meta.maps.fancypins;

import X.AnonymousClass003;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinPendingCompletion implements FancyPinPartApplyCompletion {
    public boolean accepted;
    public boolean completed;
    public boolean finished;
    public final Function0<Unit> onDiscard;
    public final FancyPinTransitionCompletionTracker tracker;

    private final void finishIfReady() {
        if (this.accepted && this.completed && !this.finished) {
            this.finished = true;
            this.tracker.finishPart$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(null);
        }
    }

    public final void accept() {
        if (this.finished) {
            return;
        }
        this.accepted = true;
        finishIfReady();
    }

    public final void discard() {
        if (this.finished) {
            return;
        }
        this.finished = true;
        this.tracker.finishPart$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(this.onDiscard);
    }

    @Override // com.meta.maps.fancypins.FancyPinPartApplyCompletion
    public void onComplete() {
        if (this.finished) {
            return;
        }
        this.completed = true;
        finishIfReady();
    }

    public FancyPinPendingCompletion(FancyPinTransitionCompletionTracker fancyPinTransitionCompletionTracker, Function0<Unit> function0) {
        AnonymousClass003.A0u(fancyPinTransitionCompletionTracker, function0);
        this.tracker = fancyPinTransitionCompletionTracker;
        this.onDiscard = function0;
    }
}
