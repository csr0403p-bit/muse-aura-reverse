package com.google.common.base;

import X.AnonymousClass006;
import X.C8j3;
import com.google.common.base.Splitter;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {
    public T next;
    public State state = State.NOT_READY;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        T t;
        int i;
        State state = this.state;
        State state2 = State.FAILED;
        Preconditions.checkState(AnonymousClass006.A1Z(state, state2));
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        this.state = state2;
        Splitter.SplittingIterator splittingIterator = (Splitter.SplittingIterator) this;
        int i2 = splittingIterator.offset;
        while (true) {
            int i3 = splittingIterator.offset;
            if (i3 == -1) {
                splittingIterator.state = State.DONE;
                t = null;
                break;
            }
            Splitter.AnonymousClass1.C04511 c04511 = (Splitter.AnonymousClass1.C04511) splittingIterator;
            int iIndexIn = Splitter.AnonymousClass1.this.val$separatorMatcher.indexIn(c04511.toSplit, i3);
            if (iIndexIn == -1) {
                iIndexIn = splittingIterator.toSplit.length();
                splittingIterator.offset = -1;
                i = -1;
            } else {
                i = iIndexIn + 1;
                splittingIterator.offset = i;
            }
            if (i == i2) {
                int i4 = i + 1;
                splittingIterator.offset = i4;
                if (i4 > splittingIterator.toSplit.length()) {
                    splittingIterator.offset = -1;
                }
            } else {
                while (i2 < iIndexIn && splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(i2))) {
                    i2++;
                }
                while (iIndexIn > i2 && splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(iIndexIn - 1))) {
                    iIndexIn--;
                }
                int i5 = splittingIterator.limit;
                if (i5 == 1) {
                    iIndexIn = splittingIterator.toSplit.length();
                    splittingIterator.offset = -1;
                    while (iIndexIn > i2) {
                        int i6 = iIndexIn - 1;
                        if (!splittingIterator.trimmer.matches(splittingIterator.toSplit.charAt(i6))) {
                            break;
                        }
                        iIndexIn = i6;
                    }
                } else {
                    splittingIterator.limit = i5 - 1;
                }
                t = (T) splittingIterator.toSplit.subSequence(i2, iIndexIn).toString();
            }
        }
        this.next = t;
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        this.state = State.NOT_READY;
        T t = this.next;
        this.next = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }
}
