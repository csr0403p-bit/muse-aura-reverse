package com.google.common.collect;

import X.AbstractC6503E9m;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes5.dex */
public final class ImmutableRangeSet<C extends Comparable> extends AbstractC6503E9m<C> implements Serializable {
    public final transient ImmutableList<Range<C>> A00;
    public static final ImmutableRangeSet<Comparable<?>> A02 = new ImmutableRangeSet<>(ImmutableList.of());
    public static final ImmutableRangeSet<Comparable<?>> A01 = new ImmutableRangeSet<>(ImmutableList.of(Range.A00));

    public final class SerializedForm<C extends Comparable> implements Serializable {
        public final ImmutableList<Range<C>> ranges;

        public Object readResolve() {
            return this.ranges.isEmpty() ? ImmutableRangeSet.A02 : this.ranges.equals(ImmutableList.of(Range.A00)) ? ImmutableRangeSet.A01 : new ImmutableRangeSet(this.ranges);
        }

        public SerializedForm(ImmutableList<Range<C>> ranges) {
            this.ranges = ranges;
        }
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public Object writeReplace() {
        return new SerializedForm(this.A00);
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> ranges) {
        this.A00 = ranges;
    }
}
