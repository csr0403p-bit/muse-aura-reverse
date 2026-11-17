package X;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.EkX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7306EkX {
    public int A00;
    public final int A01;
    public final InterfaceC7288EkF A02;
    public final C7317Eki A03;
    public final C7178Ehn A04;
    public final AbstractC7151EhM A05;
    public final ConcurrentHashMap<Integer, C7313Eke> A06;
    public final boolean A07;
    public final C7316Ekh A08;
    public volatile int A09;
    public volatile int A0A;
    public volatile EfF<Bitmap> A0B;
    public volatile Map<Integer, Integer> A0C;
    public volatile Set<Integer> A0D;
    public volatile boolean A0E;

    public C7306EkX(InterfaceC7288EkF interfaceC7288EkF, C7316Ekh c7316Ekh, C7178Ehn c7178Ehn, AbstractC7151EhM abstractC7151EhM, int i, boolean z) {
        this.A05 = abstractC7151EhM;
        this.A04 = c7178Ehn;
        this.A08 = c7316Ekh;
        this.A02 = interfaceC7288EkF;
        long jAHK = 1000 / (interfaceC7288EkF.AHK() / interfaceC7288EkF.getFrameCount());
        int i2 = (((int) (jAHK < 1 ? 1L : jAHK)) * i) / 1000;
        i2 = i2 < 1 ? 1 : i2;
        this.A01 = i2;
        this.A07 = z && this.A02.getFrameCount() == 1;
        this.A06 = C60O.A1C();
        this.A03 = new C7317Eki(this.A02.getFrameCount());
        this.A00 = -1;
        this.A0C = AGH.A0E();
        this.A0D = A3q.A00;
        InterfaceC7288EkF interfaceC7288EkF2 = this.A02;
        long jAHK2 = 1000 / (interfaceC7288EkF2.AHK() / interfaceC7288EkF2.getFrameCount());
        A03((int) (jAHK2 < 1 ? 1L : jAHK2));
        this.A0A = (int) (i2 * 0.5f);
    }

    public static final C7312Ekd A00(C7306EkX c7306EkX, int i) {
        EfF<Bitmap> efFClone;
        Integer num;
        int i2 = c7306EkX.A03.A00;
        Iterator<Integer> it = new ADq(0, i2).iterator();
        while (true) {
            if (!it.hasNext()) {
                efFClone = null;
                num = C79.A0C;
                break;
            }
            int iA00 = (i - ((BNt) it).A00()) % i2;
            if (iA00 < 0) {
                iA00 += i2;
            }
            C7313Eke c7313Eke = (C7313Eke) BV7.A0r(c7306EkX.A06, iA00);
            if (c7313Eke != null && !c7313Eke.A00) {
                EfF<Bitmap> efF = c7313Eke.A01;
                if (efF.A05()) {
                    efFClone = efF.clone();
                    c7306EkX.A00 = iA00;
                    num = C79.A01;
                    break;
                }
            }
        }
        return new C7312Ekd(efFClone, num);
    }

    public static final void A01(C7306EkX c7306EkX, int i, int i2) {
        if (c7306EkX.A0E) {
            return;
        }
        c7306EkX.A0E = true;
        int i3 = c7306EkX.A09;
        ThreadFactory threadFactory = Bs6.A01;
        Bs6.A00.execute(new RunnableC7305EkW(c7306EkX, i3, i, i2));
    }

    public final void A02() {
        this.A09++;
        this.A0E = false;
        EfF<Bitmap> efF = this.A0B;
        if (efF != null) {
            efF.close();
        }
        this.A0B = null;
        ConcurrentHashMap<Integer, C7313Eke> concurrentHashMap = this.A06;
        Collection<C7313Eke> collectionValues = concurrentHashMap.values();
        C7384Etj.A0U(collectionValues);
        Iterator<C7313Eke> it = collectionValues.iterator();
        while (it.hasNext()) {
            it.next().A01.close();
        }
        concurrentHashMap.clear();
        this.A00 = -1;
    }

    public final void A03(int i) {
        InterfaceC7288EkF interfaceC7288EkF = this.A02;
        int iAHK = interfaceC7288EkF.AHK();
        int loopCount = interfaceC7288EkF.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i2 = iAHK * loopCount;
        C7316Ekh c7316Ekh = this.A08;
        int frameCount = interfaceC7288EkF.getFrameCount();
        long frameCount2 = 1000 / (iAHK / interfaceC7288EkF.getFrameCount());
        if (frameCount2 < 1) {
            frameCount2 = 1;
        }
        int i3 = (int) frameCount2;
        if (i > i3) {
            i = i3;
        }
        if (i < 1) {
            i = 1;
        }
        int i4 = c7316Ekh.A00;
        if (i > i4) {
            i = i4;
        }
        float fCeil = i * (i2 / 1000.0f);
        if (fCeil < 0.0f) {
            fCeil = 0.0f;
        }
        float f = fCeil % 1.0f;
        if (c7316Ekh.A01 && f > 0.5f) {
            fCeil = (float) Math.ceil(fCeil);
        }
        float f2 = frameCount;
        if (fCeil > f2) {
            fCeil = f2;
        }
        float f3 = f2 / fCeil;
        int i5 = 0;
        ADq aDqA0C = ATD.A0C(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(aDqA0C));
        Iterator<Integer> it = aDqA0C.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            int iA0F = AnonymousClass001.A0F(next);
            if (((int) (iA0F % f3)) == 0) {
                i5 = iA0F;
            }
            C8j4.A1O(next, linkedHashMap, i5);
        }
        this.A0C = linkedHashMap;
        this.A0D = AbstractC0878AGe.A0g(this.A0C.values());
    }
}
