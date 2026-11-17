package X;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Dtu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6011Dtu implements InterfaceC6009Dts {
    public E6Y A00;
    public Looper A01;
    public Timeline A02;
    public final ArrayList<InterfaceC6025DuK> A06 = C60O.A11(1);
    public final HashSet<InterfaceC6025DuK> A05 = new HashSet<>(1);
    public final C6013Dtw A04 = new C6013Dtw();
    public final C6014Dtx A03 = new C6014Dtx();

    public abstract void A0B();

    public abstract void A0C(CXB cxb);

    public final void A0A(Timeline timeline) {
        this.A02 = timeline;
        Iterator<InterfaceC6025DuK> it = this.A06.iterator();
        while (it.hasNext()) {
            it.next().AW1(timeline, this);
        }
    }

    @Override // X.InterfaceC6009Dts
    public final void A91(InterfaceC6025DuK interfaceC6025DuK) {
        HashSet<InterfaceC6025DuK> hashSet = this.A05;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC6025DuK);
        if (!zIsEmpty && hashSet.isEmpty() && (this instanceof AbstractC6010Dtt)) {
            Iterator itA0x = BV5.A0x(((AbstractC6010Dtt) this).A02);
            while (itA0x.hasNext()) {
                C6016Dtz c6016Dtz = (C6016Dtz) itA0x.next();
                c6016Dtz.A02.A91(c6016Dtz.A01);
            }
        }
    }

    @Override // X.InterfaceC6009Dts
    public final void A9x(InterfaceC6025DuK interfaceC6025DuK) {
        this.A01.getClass();
        HashSet<InterfaceC6025DuK> hashSet = this.A05;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC6025DuK);
        if (zIsEmpty && (this instanceof AbstractC6010Dtt)) {
            Iterator itA0x = BV5.A0x(((AbstractC6010Dtt) this).A02);
            while (itA0x.hasNext()) {
                C6016Dtz c6016Dtz = (C6016Dtz) itA0x.next();
                c6016Dtz.A02.A9x(c6016Dtz.A01);
            }
        }
    }

    @Override // X.InterfaceC6009Dts
    public final /* synthetic */ Timeline AGS() {
        if (this instanceof AbstractC6008Dtr) {
            return ((AbstractC6008Dtr) this).A00.AGS();
        }
        return null;
    }

    @Override // X.InterfaceC6009Dts
    public final /* synthetic */ boolean AP2() {
        if (this instanceof AbstractC6008Dtr) {
            return ((AbstractC6008Dtr) this).A00.AP2();
        }
        return true;
    }

    @Override // X.InterfaceC6009Dts
    public final void AaJ(InterfaceC6025DuK interfaceC6025DuK) {
        ArrayList<InterfaceC6025DuK> arrayList = this.A06;
        arrayList.remove(interfaceC6025DuK);
        if (!arrayList.isEmpty()) {
            A91(interfaceC6025DuK);
            return;
        }
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05.clear();
        A0B();
    }

    @Override // X.InterfaceC6009Dts
    public final void Aao(InterfaceC6021DuE interfaceC6021DuE) {
        CopyOnWriteArrayList<C6023DuI> copyOnWriteArrayList = this.A03.A02;
        Iterator<C6023DuI> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C6023DuI next = it.next();
            if (next.A01 == interfaceC6021DuE) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // X.InterfaceC6009Dts
    public final void Aap(Du7 du7) {
        CopyOnWriteArrayList<C6024DuJ> copyOnWriteArrayList = this.A04.A02;
        Iterator<C6024DuJ> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C6024DuJ next = it.next();
            if (next.A01 == du7) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // X.InterfaceC6009Dts
    public final void A3W(Handler handler, Du7 du7) {
        handler.getClass();
        du7.getClass();
        CopyOnWriteArrayList<C6024DuJ> copyOnWriteArrayList = this.A04.A02;
        C6024DuJ c6024DuJ = new C6024DuJ();
        c6024DuJ.A00 = handler;
        c6024DuJ.A01 = du7;
        copyOnWriteArrayList.add(c6024DuJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    @Override // X.InterfaceC6009Dts
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AYS(X.CXB r4, X.E6Y r5, X.InterfaceC6025DuK r6) {
        /*
            r3 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = r3.A01
            if (r1 == 0) goto Lb
            r0 = 0
            if (r1 != r2) goto Lc
        Lb:
            r0 = 1
        Lc:
            X.C1G.A07(r0)
            r3.A00 = r5
            androidx.media3.common.Timeline r1 = r3.A02
            java.util.ArrayList<X.DuK> r0 = r3.A06
            r0.add(r6)
            android.os.Looper r0 = r3.A01
            if (r0 != 0) goto L27
            r3.A01 = r2
            java.util.HashSet<X.DuK> r0 = r3.A05
            r0.add(r6)
            r3.A0C(r4)
        L26:
            return
        L27:
            if (r1 == 0) goto L26
            r3.A9x(r6)
            r6.AW1(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6011Dtu.AYS(X.CXB, X.E6Y, X.DuK):void");
    }
}
