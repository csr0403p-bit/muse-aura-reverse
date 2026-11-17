package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7S implements InterfaceC9228G7j<C9242G7x> {
    public static final C06827l3 A00 = C06827l3.A02("^ {0,3}(-+|=+) *$");

    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        CharSequence charSequence;
        CharSequence charSequenceA01;
        boolean zA1Z = AnonymousClass005.A1Z(g7t, c9236G7r, c9242G7x);
        Iterator it = c9242G7x.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C9219G7a) {
                if (next == null) {
                    break;
                }
            }
        }
        G7Y g7y = c9242G7x.A01;
        if (c9242G7x.A02.equals(g7y) && InterfaceC9228G7j.A01(g7t, g7y)) {
            int i = g7t.A01 + 1;
            List<CharSequence> list = g7t.A04.A01;
            if (i < list.size() && (charSequence = list.get(i)) != null) {
                G7Y g7yA03 = g7y.A03(g7t.A04());
                if (AbstractC9223G7e.A03(g7yA03, g7y) && (charSequenceA01 = AbstractC9223G7e.A01(charSequence, g7yA03)) != null && A00.A08(charSequenceA01) == zA1Z) {
                    return Collections.singletonList(new G7G(c9236G7r, g7y));
                }
            }
        }
        return C0881AGi.A00;
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        return false;
    }
}
