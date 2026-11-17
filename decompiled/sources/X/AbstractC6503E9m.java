package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Set;

/* renamed from: X.E9m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6503E9m {
    public final Set<Range<C>> A00() {
        ImmutableList<Range<C>> immutableList = ((ImmutableRangeSet) this).A00;
        if (immutableList.isEmpty()) {
            return RegularImmutableSet.A05;
        }
        RegularImmutableSortedSet<Comparable> regularImmutableSortedSet = RegularImmutableSortedSet.A01;
        Range<Comparable> range = Range.A00;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.A00);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6503E9m) {
            return A00().equals(((AbstractC6503E9m) obj).A00());
        }
        return false;
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public final String toString() {
        return A00().toString();
    }
}
