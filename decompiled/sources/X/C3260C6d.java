package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.C6d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3260C6d implements C57 {
    @Override // X.C57
    public final void ATR(boolean z) {
        C3272C6z c3272C6z = C64.A0A;
        if (c3272C6z != null) {
            List<C7Z> list = ((C70) c3272C6z).A00;
            synchronized (list) {
                if (z) {
                    Iterator<C7Z> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().onForeground();
                    }
                } else {
                    Iterator<C7Z> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onBackground();
                    }
                }
            }
        }
    }
}
