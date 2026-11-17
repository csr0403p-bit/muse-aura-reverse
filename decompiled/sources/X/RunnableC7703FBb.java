package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FBb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7703FBb implements Runnable {
    public static final String __redex_internal_original_name = "BloksComponentQueryStore$subscriberForCallback$subscriber$1$2";
    public final /* synthetic */ FBN A00;
    public final /* synthetic */ String A01;

    public RunnableC7703FBb(FBN fbn, String str) {
        this.A00 = fbn;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FBN fbn = this.A00;
        Object obj = fbn.A06;
        String str = this.A01;
        synchronized (obj) {
            List<C7719FBv> list = fbn.A09;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C7719FBv> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().A00.equals(str)) {
                        break;
                    }
                }
            }
            FBQ fbq = fbn.A03;
            C7384Etj.A0Y(str, 0);
            C7718FBu c7718FBuRemove = fbq.A02.remove(str);
            if (c7718FBuRemove != null && !c7718FBuRemove.A01) {
                c7718FBuRemove.A01 = true;
            }
        }
    }
}
