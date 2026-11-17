package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.G7i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9227G7i {
    public final CharSequence A00;
    public final List<CharSequence> A01;
    public final G7T A02;

    public C9227G7i(CharSequence charSequence) {
        this.A00 = charSequence;
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        while (true) {
            int iA08 = C7BY.A08(charSequence, '\n', i);
            if (iA08 == -1) {
                break;
            }
            arrayListA0h.add(charSequence.subSequence(i, iA08));
            i = iA08 + 1;
        }
        arrayListA0h.add(AbstractC7608F5v.A0c(charSequence, i));
        this.A01 = arrayListA0h;
        this.A02 = charSequence.length() > 0 ? new G7T(this, 0, -1, -1).A05(1) : null;
    }
}
