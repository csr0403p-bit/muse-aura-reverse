package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinTransitionCompletionTracker {
    public FancyPinPartApplyCompletion completion;
    public final Function0<Boolean> isCurrent;
    public boolean isSealed;
    public int pendingCount;

    /* renamed from: com.meta.maps.fancypins.FancyPinTransitionCompletionTracker$beginPart$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public FancyPinTransitionCompletionTracker(Function0<Boolean> function0, FancyPinPartApplyCompletion fancyPinPartApplyCompletion) {
        C7384Etj.A0Y(function0, 0);
        this.isCurrent = function0;
        this.completion = fancyPinPartApplyCompletion;
    }

    public final FancyPinPendingCompletion beginPart(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.pendingCount++;
        return new FancyPinPendingCompletion(this, function0);
    }

    public final void seal() {
        this.isSealed = true;
        finishIfReady();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FancyPinPendingCompletion beginPart$default(FancyPinTransitionCompletionTracker fancyPinTransitionCompletionTracker, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = AnonymousClass1.INSTANCE;
        }
        return fancyPinTransitionCompletionTracker.beginPart(function0);
    }

    private final void finishIfReady() {
        if (!AnonymousClass003.A1Y(this.isCurrent)) {
            this.completion = null;
            return;
        }
        if (this.isSealed && this.pendingCount == 0) {
            FancyPinPartApplyCompletion fancyPinPartApplyCompletion = this.completion;
            this.completion = null;
            if (fancyPinPartApplyCompletion != null) {
                fancyPinPartApplyCompletion.onComplete();
            }
        }
    }

    public final void finishPart$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(Function0<Unit> function0) {
        int i = this.pendingCount;
        if (i <= 0) {
            throw C3cG.A0Q("FancyPin transition completed more parts than it started");
        }
        this.pendingCount = i - 1;
        if (function0 != null) {
            function0.invoke();
        }
        finishIfReady();
    }
}
