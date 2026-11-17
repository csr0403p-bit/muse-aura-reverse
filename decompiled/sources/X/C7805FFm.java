package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FFm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7805FFm implements FAR {
    public final int A00 = AbstractC7806FFn.A02.get();

    @Override // X.FAR
    public final /* bridge */ /* synthetic */ Object AGT() {
        return Integer.valueOf(this.A00);
    }

    @Override // X.FAR
    public final Runnable A6c(FB4 fb4, String str) {
        List<C7807FFo> list;
        List listA0X;
        AnonymousClass003.A0x(str, fb4);
        Object obj = AbstractC7806FFn.A00;
        synchronized (obj) {
            list = AbstractC7806FFn.A01;
            listA0X = AbstractC0878AGe.A0X(list);
        }
        if (!(listA0X instanceof Collection) || !listA0X.isEmpty()) {
            Iterator it = listA0X.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(((C7807FFo) it.next()).A00.get(), fb4)) {
                    throw C3cG.A0Q("Observer is already subscribed. Cannot subscribe again.");
                }
            }
        }
        C7807FFo c7807FFo = new C7807FFo(BV4.A0q(fb4), C8631Fhi.A00(7));
        synchronized (obj) {
            list.add(c7807FFo);
        }
        return new RunnableC7808FFp(new C8826Fle(c7807FFo, 0));
    }
}
