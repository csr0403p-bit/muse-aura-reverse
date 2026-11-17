package X;

import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Dtw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6013Dtw {
    public final int A00;
    public final Dy6 A01;
    public final CopyOnWriteArrayList<C6024DuJ> A02;

    public static void A00(C6013Dtw c6013Dtw, Object obj, Object obj2, Object obj3) {
        c6013Dtw.A06(new C7577F4q(new C7579F4s(obj, obj2, obj3, 3), 2));
    }

    public C6013Dtw() {
        this(null, new CopyOnWriteArrayList(), 0);
    }

    public final void A06(final InterfaceC5344Dgn<Du7> interfaceC5344Dgn) {
        Iterator<C6024DuJ> it = this.A02.iterator();
        while (it.hasNext()) {
            C6024DuJ next = it.next();
            final Du7 du7 = next.A01;
            Util.A0L(next.A00, new Runnable() { // from class: X.DuH
                public static final String __redex_internal_original_name = "MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda6";

                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC5344Dgn.accept(du7);
                }
            });
        }
    }

    public final void A01(C6154Dwx c6154Dwx, C5072DTn c5072DTn, IOException iOException, Object obj, int i, int i2, int i3, long j, long j2, boolean z) {
        A06(new Du5(c5072DTn, new C5893Dra(c6154Dwx, obj, i, i2, i3, Util.A0B(j), Util.A0B(j2)), this, iOException, z));
    }

    public final void A02(C6154Dwx c6154Dwx, C5072DTn c5072DTn, Object obj, int i, int i2, int i3, int i4, long j, long j2) {
        A06(new Du6(c5072DTn, new C5893Dra(c6154Dwx, obj, i, i2, i3, Util.A0B(j), Util.A0B(j2)), this, i4));
    }

    public final void A03(C6154Dwx c6154Dwx, C5072DTn c5072DTn, Object obj, int i, int i2, int i3, long j, long j2) {
        A06(new C7579F4s(c5072DTn, new C5893Dra(c6154Dwx, obj, i, i2, i3, Util.A0B(j), Util.A0B(j2)), this, 1));
    }

    public final void A04(C6154Dwx c6154Dwx, C5072DTn c5072DTn, Object obj, int i, int i2, int i3, long j, long j2) {
        A06(new C7579F4s(c5072DTn, new C5893Dra(c6154Dwx, obj, i, i2, i3, Util.A0B(j), Util.A0B(j2)), this, 0));
    }

    public final void A05(C6154Dwx c6154Dwx, Object obj, int i, int i2, long j) {
        A06(new Du8(new C5893Dra(c6154Dwx, obj, 1, i, i2, Util.A0B(j), -9223372036854775807L), this));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/CopyOnWriteArrayList<LX/DuJ;>;ILX/Dy6;)V */
    public C6013Dtw(Dy6 dy6, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = dy6;
    }
}
