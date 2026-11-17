package X;

import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class CQB implements Iterable {
    public final Optional<Iterable<E>> A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Iterable A02;

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        Iterable iterable = this.A02;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.A01), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i = this.A01;
        it.getClass();
        Preconditions.checkArgument(C8j3.A1Q(i), "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new CPf(this, it);
    }

    public final String toString() {
        Iterator it = ((Iterable) this.A00.or((Optional<Iterable<E>>) this)).iterator();
        StringBuilder sbA0x = C60O.A0x("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                C8j3.A1K(sbA0x);
            }
            sbA0x.append(it.next());
            z = false;
        }
        return BV5.A0o(sbA0x);
    }

    public CQB() {
        this.A00 = Absent.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CQB(final Iterable val$iterable, final int val$numberToSkip) {
        this();
        this.A02 = val$iterable;
        this.A01 = val$numberToSkip;
    }
}
