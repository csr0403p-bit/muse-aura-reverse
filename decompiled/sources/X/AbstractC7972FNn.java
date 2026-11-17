package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FNn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7972FNn {
    public final C7979FNv A00;
    public final C7975FNq<T> A01;
    public final Hi0 A02;
    public final FO9 A03;

    public static void A00(AbstractC7972FNn abstractC7972FNn) {
        int iA07;
        ArrayList arrayListA0t;
        C7971FNk c7971FNk = C7971FNk.A03;
        String datakey = abstractC7972FNn.A02.getDatakey();
        synchronized (c7971FNk.A01) {
            iA07 = BV6.A07(c7971FNk.A00.getOrDefault(datakey, 0));
        }
        if (iA07 <= 0) {
            List list = abstractC7972FNn.A01.A01;
            if (list == null || list.isEmpty()) {
                C7979FNv c7979FNv = abstractC7972FNn.A00;
                synchronized (c7979FNv) {
                    arrayListA0t = BV4.A0t(c7979FNv.A02);
                }
                Iterator it = arrayListA0t.iterator();
                while (it.hasNext()) {
                    AbstractC7972FNn abstractC7972FNn2 = (AbstractC7972FNn) it.next();
                    if (abstractC7972FNn2 != null) {
                        C7973FNo c7973FNo = (C7973FNo) abstractC7972FNn2;
                        if (c7973FNo.A02.compareAndSet(true, false)) {
                            C7974FNp<T, Config> c7974FNp = c7973FNo.A01;
                            FO9 fo9 = c7974FNp.A02;
                            if (!fo9.AOp()) {
                                fo9.AYE(new FO4(c7974FNp));
                            }
                        }
                        C7974FNp<T, Config> c7974FNp2 = c7973FNo.A01;
                        FO9 fo92 = c7974FNp2.A02;
                        if (fo92.AOp()) {
                            C7974FNp.A01(c7973FNo, c7974FNp2);
                        } else {
                            fo92.AYE(new RunnableC7982FNz(c7973FNo, c7974FNp2));
                        }
                        C7975FNq<T> c7975FNq = c7973FNo.A00;
                        synchronized (c7975FNq) {
                            c7975FNq.A00 = null;
                        }
                        FO9 fo93 = c7975FNq.A02;
                        if (fo93.AOp()) {
                            List list2 = c7975FNq.A01;
                            if (list2 != null) {
                                list2.clear();
                            }
                        } else {
                            fo93.AYE(new FNx(c7975FNq));
                        }
                    }
                }
            }
        }
    }

    public final void A02() {
        FO9 fo9 = this.A03;
        if (fo9.AOp()) {
            A00(this);
        } else {
            fo9.AYE(new FO2(this));
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FNv;LX/FO9;LX/FNq<TT;>;)V */
    public AbstractC7972FNn(C7979FNv c7979FNv, C7975FNq c7975FNq, FO9 fo9) {
        synchronized (c7979FNv) {
            c7979FNv.A02.add(this);
        }
        this.A00 = c7979FNv;
        this.A03 = fo9;
        this.A01 = c7975FNq;
        this.A02 = c7979FNv.A01;
    }
}
