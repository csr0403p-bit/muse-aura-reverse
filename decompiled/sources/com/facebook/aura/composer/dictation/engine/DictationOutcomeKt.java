package com.facebook.aura.composer.dictation.engine;

import X.C7384Etj;

/* loaded from: classes5.dex */
public abstract class DictationOutcomeKt {
    public static final DictationOutcome resolveStopOutcome(DictationOutcome dictationOutcome, boolean z, boolean z2, boolean z3, boolean z4) {
        C7384Etj.A0Y(dictationOutcome, 0);
        return (dictationOutcome != DictationOutcome.FAILED || !z || z2 || z3 || z4) ? dictationOutcome : DictationOutcome.COMPLETED;
    }
}
