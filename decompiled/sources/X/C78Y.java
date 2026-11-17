package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Unit;

/* renamed from: X.78Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78Y implements C78T, Serializable {
    public final C78X element;
    public final C78T left;

    public C78Y(C78X c78x, C78T c78t) {
        C7384Etj.A0Y(c78t, 0);
        C7384Etj.A0Y(c78x, 1);
        this.left = c78t;
        this.element = c78x;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C8j2.A00(1));
    }

    private final Object writeReplace() {
        int i = 2;
        C78Y c78y = this;
        while (true) {
            C78T c78t = c78y.left;
            if (!(c78t instanceof C78Y) || (c78y = (C78Y) c78t) == null) {
                break;
            }
            i++;
        }
        final C78T[] c78tArr = new C78T[i];
        F1E f1e = new F1E();
        fold(Unit.INSTANCE, new C8iA(3, f1e, c78tArr));
        if (f1e.element == i) {
            return new Serializable(c78tArr) { // from class: X.78Z
                public static final long serialVersionUID = 0;
                public final C78T[] elements;

                private final Object readResolve() {
                    C78T[] c78tArr2 = this.elements;
                    C78T c78tPlus = C6ys.A00;
                    for (C78T c78t2 : c78tArr2) {
                        c78tPlus = c78tPlus.plus(c78t2);
                    }
                    return c78tPlus;
                }

                {
                    this.elements = c78tArr;
                }
            };
        }
        throw C3cG.A0Q("Check failed.");
    }

    @Override // X.C78T
    public final <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 1);
        return g0v.invoke((Object) this.left.fold(r, g0v), this.element);
    }

    @Override // X.C78T
    public final <E extends C78X> E get(C78I<E> c78i) {
        C7384Etj.A0Y(c78i, 0);
        while (true) {
            E e = (E) this.element.get(c78i);
            if (e != null) {
                return e;
            }
            C78T c78t = this.left;
            if (!(c78t instanceof C78Y)) {
                return (E) c78t.get(c78i);
            }
            this = (C78Y) c78t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // X.C78T
    public final C78T minusKey(C78I<?> c78i) {
        C7384Etj.A0Y(c78i, 0);
        C78X c78x = this.element.get(c78i);
        C78T c78t = this.left;
        if (c78x != null) {
            return c78t;
        }
        C78T c78tMinusKey = c78t.minusKey(c78i);
        C78T c78t2 = this.left;
        ?? r3 = this;
        if (c78tMinusKey != c78t2) {
            if (c78tMinusKey != C6ys.A00) {
                return new C78Y(this.element, c78tMinusKey);
            }
            r3 = this.element;
        }
        return r3;
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        C7384Etj.A0Y(c78t, 1);
        return c78t != C6ys.A00 ? (C78T) c78t.fold(this, new C8i0(33)) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78Y)) {
            return false;
        }
        C78Y c78y = (C78Y) obj;
        int i = 2;
        C78Y c78y2 = c78y;
        while (true) {
            C78T c78t = c78y2.left;
            if (!(c78t instanceof C78Y) || (c78y2 = (C78Y) c78t) == null) {
                break;
            }
            i++;
        }
        int i2 = 2;
        C78Y c78y3 = this;
        while (true) {
            C78T c78t2 = c78y3.left;
            if (!(c78t2 instanceof C78Y) || (c78y3 = (C78Y) c78t2) == null) {
                break;
            }
            i2++;
        }
        if (i != i2) {
            return false;
        }
        while (true) {
            C78X c78x = this.element;
            if (!C7384Etj.areEqual(c78y.get(c78x.getKey()), c78x)) {
                return false;
            }
            C78T c78t3 = this.left;
            if (!(c78t3 instanceof C78Y)) {
                C7384Etj.A0Z(c78t3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                C78X c78x2 = (C78X) c78t3;
                return C7384Etj.areEqual(c78y.get(c78x2.getKey()), c78x2);
            }
            this = (C78Y) c78t3;
        }
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.element, this.left.hashCode());
    }

    public final String toString() {
        return FGI.A0N("[", (String) fold("", new C8i0(32)), ']');
    }
}
