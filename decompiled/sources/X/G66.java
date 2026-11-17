package X;

import com.facebook.aura.markdown.parser.custom.adapter.JetBrainsAstAdapter;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class G66 {
    public static final G65 A02(G72 g72, G65 g65) {
        Object next;
        C7384Etj.A0Y(g65, 0);
        Iterator itA00 = G65.A00(g65);
        while (true) {
            if (!itA00.hasNext()) {
                next = null;
                break;
            }
            next = itA00.next();
            if (((G69) ((G65) next)).A03.equals(g72)) {
                break;
            }
        }
        return (G65) next;
    }

    public static String A01(JetBrainsAstAdapter jetBrainsAstAdapter, G65 g65) {
        return A00(jetBrainsAstAdapter.source, g65).toString();
    }

    public static final CharSequence A00(CharSequence charSequence, G65 g65) {
        AnonymousClass003.A0u(g65, charSequence);
        G69 g69 = (G69) g65;
        return charSequence.subSequence(g69.A02, g69.A01);
    }
}
