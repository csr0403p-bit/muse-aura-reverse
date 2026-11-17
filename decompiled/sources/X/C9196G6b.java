package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.G6b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9196G6b extends G6C {
    public final /* synthetic */ CharSequence A00;
    public final /* synthetic */ HashMap<CharSequence, C9209G6p> A01;

    @Override // X.G6C
    public final void A00(G65 g65) throws UnsupportedEncodingException {
        String strA00;
        Object next;
        CharSequence charSequenceA00;
        C7384Etj.A0Y(g65, 0);
        if (!((G69) g65).A03.equals(AbstractC9206G6m.A0G)) {
            super.A00(g65);
            return;
        }
        Iterator itA00 = G65.A00(g65);
        while (itA00.hasNext()) {
            G65 g65A1D = AbstractC7607F5u.A1D(itA00);
            if (((G69) g65A1D).A03.equals(AbstractC9206G6m.A0I)) {
                CharSequence charSequence = this.A00;
                CharSequence charSequenceA002 = G66.A00(charSequence, g65A1D);
                C7384Etj.A0Y(charSequenceA002, 0);
                String strA0u = AnonymousClass001.A0u(C9211G6r.A01.A03(charSequenceA002, InviteCodeScratcherKt.CODE_SEPARATOR));
                HashMap<CharSequence, C9209G6p> map = this.A01;
                if (map.containsKey(strA0u)) {
                    return;
                }
                Hj9 hj9 = C9211G6r.A02;
                Iterator itA002 = G65.A00(g65);
                while (itA002.hasNext()) {
                    G65 g65A1D2 = AbstractC7607F5u.A1D(itA002);
                    if (((G69) g65A1D2).A03.equals(AbstractC9206G6m.A0H)) {
                        String strA01 = hj9.A01(G66.A00(charSequence, g65A1D2), true);
                        Iterator itA003 = G65.A00(g65);
                        while (true) {
                            strA00 = null;
                            if (!itA003.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = itA003.next();
                                if (((G69) ((G65) next)).A03.equals(AbstractC9206G6m.A0K)) {
                                    break;
                                }
                            }
                        }
                        G65 g652 = (G65) next;
                        if (g652 != null && (charSequenceA00 = G66.A00(charSequence, g652)) != null) {
                            Map<Character, String> map2 = C7l2.A00;
                            strA00 = C7l2.A00(Hj9.A00(charSequenceA00, "\"\"", "''", "()"), true, true);
                        }
                        map.put(strA0u, new C9209G6p(strA01, strA00, g65));
                        return;
                    }
                }
                throw new NoSuchElementException(AnonymousClass000.A00(9));
            }
        }
        throw new NoSuchElementException(AnonymousClass000.A00(9));
    }

    public C9196G6b(CharSequence charSequence, HashMap<CharSequence, C9209G6p> map) {
        this.A00 = charSequence;
        this.A01 = map;
    }
}
