package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FancyPinTransitionBatch {
    public final long generation;
    public final Set<String> pinIds;
    public final Set<FancyPinTransitionToken> tokens;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinTransitionBatch) {
                FancyPinTransitionBatch fancyPinTransitionBatch = (FancyPinTransitionBatch) obj;
                if (this.generation != fancyPinTransitionBatch.generation || !C7384Etj.areEqual(this.pinIds, fancyPinTransitionBatch.pinIds) || !C7384Etj.areEqual(this.tokens, fancyPinTransitionBatch.tokens)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FancyPinTransitionBatch copy$default(FancyPinTransitionBatch fancyPinTransitionBatch, long j, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fancyPinTransitionBatch.generation;
        }
        if ((i & 2) != 0) {
            set = fancyPinTransitionBatch.pinIds;
        }
        if ((i & 4) != 0) {
            set2 = fancyPinTransitionBatch.tokens;
        }
        return fancyPinTransitionBatch.copy(j, set, set2);
    }

    public final long component1() {
        return this.generation;
    }

    public final Set<String> component2() {
        return this.pinIds;
    }

    public final Set<FancyPinTransitionToken> component3() {
        return this.tokens;
    }

    public final long getGeneration() {
        return this.generation;
    }

    public final Set<String> getPinIds() {
        return this.pinIds;
    }

    public final Set<FancyPinTransitionToken> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.tokens, AnonymousClass005.A0F(this.pinIds, C3cI.A01(this.generation)));
    }

    public String toString() {
        long j = this.generation;
        Set<String> set = this.pinIds;
        Set<FancyPinTransitionToken> set2 = this.tokens;
        StringBuilder sbA0z = C60O.A0z("FancyPinTransitionBatch(generation=", j);
        sbA0z.append(", pinIds=");
        sbA0z.append(set);
        return C3cJ.A0L(set2, ", tokens=", sbA0z);
    }

    public FancyPinTransitionBatch(long j, Set<String> set, Set<FancyPinTransitionToken> set2) {
        AnonymousClass003.A0x(set, set2);
        this.generation = j;
        this.pinIds = set;
        this.tokens = set2;
    }

    public final FancyPinTransitionBatch copy(long j, Set<String> set, Set<FancyPinTransitionToken> set2) {
        AnonymousClass003.A0x(set, set2);
        return new FancyPinTransitionBatch(j, set, set2);
    }
}
