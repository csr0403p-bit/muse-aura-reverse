package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.BcM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2495BcM implements InterfaceC2497BcO {
    public final InterfaceC2486BcD A00;
    public final Map<String, C2479Bc6> A01;

    public C2495BcM(Context context, Object obj, Set<String> set) {
        C2496BcN c2496BcN = new C2496BcN();
        this.A01 = BV4.A0u();
        this.A00 = c2496BcN;
        C2538BdP c2538BdP = (C2538BdP) obj;
        context.getClass();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            this.A01.put(strA0j, new C2479Bc6(context, this.A00, c2538BdP, strA0j));
        }
    }
}
