package com.hatch.browser.protocol;

import X.C06H;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class SubmitIntent {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public List<KeyChord> keys;

    public SubmitIntent(List<KeyChord> list) {
        C7384Etj.A0Y(list, 0);
        this.keys = list;
    }

    public final SubmitIntent copy(List<KeyChord> list) {
        C7384Etj.A0Y(list, 0);
        return new SubmitIntent(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SubmitIntent) && C7384Etj.areEqual(this.keys, ((SubmitIntent) obj).keys));
    }

    public final void setKeys(List<KeyChord> list) {
        C7384Etj.A0Y(list, 0);
        this.keys = list;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ SubmitIntent copy$default(SubmitIntent submitIntent, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = submitIntent.keys;
        }
        C7384Etj.A0Y(list, 0);
        return new SubmitIntent(list);
    }

    public final List<KeyChord> component1() {
        return this.keys;
    }

    public final List<KeyChord> getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    public String toString() {
        return C3cJ.A0M("SubmitIntent(keys=", this.keys);
    }
}
