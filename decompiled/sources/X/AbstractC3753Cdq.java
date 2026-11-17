package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Cdq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3753Cdq implements InterfaceC3748Cdl {
    public transient Map A00;
    public transient Set A01;

    public static Map A00(AbstractC3753Cdq abstractC3753Cdq) {
        Map map = abstractC3753Cdq.A00;
        if (map != null) {
            return map;
        }
        AbstractC3759Cdw abstractC3759Cdw = (AbstractC3759Cdw) abstractC3753Cdq;
        C3754Cdr c3754Cdr = new C3754Cdr(abstractC3759Cdw, abstractC3759Cdw.A01);
        abstractC3753Cdq.A00 = c3754Cdr;
        return c3754Cdr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3748Cdl) {
            return A00(this).equals(A00((AbstractC3753Cdq) ((InterfaceC3748Cdl) obj)));
        }
        return false;
    }

    public final int hashCode() {
        return A00(this).hashCode();
    }

    public final String toString() {
        return ((C3754Cdr) A00(this)).A02.toString();
    }
}
