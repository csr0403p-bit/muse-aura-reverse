package com.facebook.aura.composer.dictation;

import X.AbstractC0878AGe;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class VoiceDictationSendRequest {
    public static final int $stable = 8;
    public final List<G0V<DictationOutcome, Boolean, Unit>> callbacks = C3cG.A0h();
    public volatile boolean isPending;

    public final void resolve(DictationOutcome dictationOutcome, boolean z) {
        C7384Etj.A0Y(dictationOutcome, 0);
        if (this.isPending) {
            this.isPending = false;
            List listA0X = AbstractC0878AGe.A0X(this.callbacks);
            this.callbacks.clear();
            Iterator it = listA0X.iterator();
            while (it.hasNext()) {
                ((G0V) it.next()).invoke(dictationOutcome, Boolean.valueOf(z));
            }
        }
    }

    public final boolean isPending() {
        return this.isPending;
    }

    public final boolean request(G0V<? super DictationOutcome, ? super Boolean, Unit> g0v) {
        if (g0v != null) {
            this.callbacks.add(g0v);
        }
        if (this.isPending) {
            return false;
        }
        this.isPending = true;
        return true;
    }
}
