package X;

import androidx.media3.common.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Dtx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6014Dtx {
    public final int A00;
    public final Dy6 A01;
    public final CopyOnWriteArrayList<C6023DuI> A02;

    public C6014Dtx() {
        this(null, new CopyOnWriteArrayList(), 0);
    }

    public final void A00() {
        Iterator<C6023DuI> it = this.A02.iterator();
        while (it.hasNext()) {
            C6023DuI next = it.next();
            final InterfaceC6021DuE interfaceC6021DuE = next.A01;
            Util.A0L(next.A00, new Runnable() { // from class: X.DuC
                public static final String __redex_internal_original_name = "DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda4";

                @Override // java.lang.Runnable
                public final void run() {
                    C6014Dtx c6014Dtx = this.A00;
                    interfaceC6021DuE.ASj(c6014Dtx.A01, c6014Dtx.A00);
                }
            });
        }
    }

    public final void A01() {
        Iterator<C6023DuI> it = this.A02.iterator();
        while (it.hasNext()) {
            C6023DuI next = it.next();
            final InterfaceC6021DuE interfaceC6021DuE = next.A01;
            Util.A0L(next.A00, new Runnable() { // from class: X.DuA
                public static final String __redex_internal_original_name = "DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C6014Dtx c6014Dtx = this.A00;
                    interfaceC6021DuE.ASk(c6014Dtx.A01, c6014Dtx.A00);
                }
            });
        }
    }

    public final void A02() {
        Iterator<C6023DuI> it = this.A02.iterator();
        while (it.hasNext()) {
            C6023DuI next = it.next();
            final InterfaceC6021DuE interfaceC6021DuE = next.A01;
            Util.A0L(next.A00, new Runnable() { // from class: X.DuD
                public static final String __redex_internal_original_name = "DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda5";

                @Override // java.lang.Runnable
                public final void run() {
                    C6014Dtx c6014Dtx = this.A00;
                    interfaceC6021DuE.ASo(c6014Dtx.A01, c6014Dtx.A00);
                }
            });
        }
    }

    public final void A03(final int i) {
        Iterator<C6023DuI> it = this.A02.iterator();
        while (it.hasNext()) {
            C6023DuI next = it.next();
            final InterfaceC6021DuE interfaceC6021DuE = next.A01;
            Util.A0L(next.A00, new Runnable() { // from class: X.DuB
                public static final String __redex_internal_original_name = "DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda3";

                @Override // java.lang.Runnable
                public final void run() {
                    C6014Dtx c6014Dtx = this.A01;
                    InterfaceC6021DuE interfaceC6021DuE2 = interfaceC6021DuE;
                    int i2 = i;
                    interfaceC6021DuE2.ASl(c6014Dtx.A01, c6014Dtx.A00, i2);
                }
            });
        }
    }

    public final void A04(final Exception exc) {
        Iterator<C6023DuI> it = this.A02.iterator();
        while (it.hasNext()) {
            C6023DuI next = it.next();
            final InterfaceC6021DuE interfaceC6021DuE = next.A01;
            Util.A0L(next.A00, new Runnable() { // from class: X.Du9
                public static final String __redex_internal_original_name = "DrmSessionEventListener$EventDispatcher$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C6014Dtx c6014Dtx = this.A00;
                    interfaceC6021DuE.ASm(c6014Dtx.A01, exc, c6014Dtx.A00);
                }
            });
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/CopyOnWriteArrayList<LX/DuI;>;ILX/Dy6;)V */
    public C6014Dtx(Dy6 dy6, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = dy6;
    }
}
