package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C7384Etj;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinDisappearCompletionTracker {
    public FancyPinPartApplyCompletion completion;
    public final Function0<Boolean> isCurrent;
    public final Set<String> pendingPartIds;

    public final FancyPinPartApplyCompletion completionFor(final String str) {
        C7384Etj.A0Y(str, 0);
        return new FancyPinPartApplyCompletion() { // from class: com.meta.maps.fancypins.FancyPinDisappearCompletionTracker.completionFor.1
            @Override // com.meta.maps.fancypins.FancyPinPartApplyCompletion
            public final void onComplete() {
                if (AnonymousClass003.A1Y(FancyPinDisappearCompletionTracker.this.isCurrent) && FancyPinDisappearCompletionTracker.this.pendingPartIds.remove(str)) {
                    FancyPinDisappearCompletionTracker.this.finishIfReady();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishIfReady() {
        if (this.pendingPartIds.isEmpty() && AnonymousClass003.A1Y(this.isCurrent)) {
            FancyPinPartApplyCompletion fancyPinPartApplyCompletion = this.completion;
            if (fancyPinPartApplyCompletion != null) {
                fancyPinPartApplyCompletion.onComplete();
            }
            this.completion = null;
        }
    }

    public FancyPinDisappearCompletionTracker(Collection<String> collection, Function0<Boolean> function0, FancyPinPartApplyCompletion fancyPinPartApplyCompletion) {
        AnonymousClass003.A0u(collection, function0);
        this.isCurrent = function0;
        this.completion = fancyPinPartApplyCompletion;
        this.pendingPartIds = AbstractC0878AGe.A0f(collection);
        finishIfReady();
    }
}
