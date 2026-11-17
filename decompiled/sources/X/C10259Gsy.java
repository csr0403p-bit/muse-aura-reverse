package X;

import X.Gt4;
import java.util.Iterator;

/* renamed from: X.Gsy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10259Gsy<T extends Gt4> implements Iterator<T> {
    public Gt4 A00;
    public Gt4 A01;
    public T A02;
    public Gt4 A03;
    public Gt4 A04;
    public final Class<T> A05;

    public static void A00(C10259Gsy c10259Gsy) {
        T tCast;
        if (c10259Gsy.A02 == null) {
            if (c10259Gsy.A01 != null && c10259Gsy.A00.A01 == null) {
                c10259Gsy.A00 = c10259Gsy.A03;
            }
            Gt4 gt4A0H = c10259Gsy.A00;
            loop0: while (true) {
                tCast = null;
                if (gt4A0H.A04() <= 0) {
                    while (!c10259Gsy.A04.equals(gt4A0H)) {
                        if (gt4A0H.A0H() == null) {
                            gt4A0H = gt4A0H.A01;
                            if (gt4A0H == null) {
                                break loop0;
                            }
                        } else {
                            gt4A0H = gt4A0H.A0H();
                        }
                    }
                    break loop0;
                }
                gt4A0H = AbstractC7609F5w.A12(gt4A0H, 0);
                if (gt4A0H == null) {
                    break;
                }
                Class<T> cls = c10259Gsy.A05;
                if (cls.isInstance(gt4A0H)) {
                    tCast = cls.cast(gt4A0H);
                    break;
                }
            }
            c10259Gsy.A02 = tCast;
        }
    }

    public final void A01(Gt4 gt4) {
        Class<T> cls = this.A05;
        if (cls.isInstance(gt4)) {
            this.A02 = cls.cast(gt4);
        }
        this.A00 = gt4;
        this.A03 = gt4;
        this.A04 = gt4;
        this.A01 = gt4.A01;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Gt4 gt4 = this.A00;
        Gt3 gt3 = gt4.A01;
        if (gt3 != null) {
            gt3.A0O(gt4);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gt4;Ljava/lang/Class<TT;>;)V */
    public C10259Gsy(Class cls, Gt4 gt4) {
        this.A05 = cls;
        A01(gt4);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        A00(this);
        return AnonymousClass002.A1X(this.A02);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        A00(this);
        T t = this.A02;
        if (t == null) {
            throw C8j3.A1D();
        }
        this.A03 = this.A00;
        this.A00 = t;
        this.A01 = t.A01;
        this.A02 = null;
        return t;
    }
}
