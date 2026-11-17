package X;

/* renamed from: X.G7e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9223G7e {
    public static final boolean A03(G7Y g7y, G7Y g7y2) {
        return g7y.A05(g7y2) && !g7y.A04(g7y2.A01.length);
    }

    public static final G7Y A02(G7T g7t, G7Y g7y) {
        if (g7t.A02 != -1) {
            throw AbstractC7608F5v.A19();
        }
        G7Y g7yA03 = g7y.A03(g7t);
        CharSequence charSequence = g7t.A03;
        while (true) {
            G7Y g7yA02 = g7yA03.A02(g7t.A05(A00(charSequence, g7yA03) + 1));
            if (g7yA02 == null) {
                return g7yA03;
            }
            g7yA03 = g7yA02;
        }
    }

    public static final int A00(CharSequence charSequence, G7Y g7y) {
        AnonymousClass003.A0u(g7y, charSequence);
        return Math.min(g7y.A00, charSequence.length());
    }

    public static final CharSequence A01(CharSequence charSequence, G7Y g7y) {
        AnonymousClass003.A0u(g7y, charSequence);
        int length = charSequence.length();
        int i = g7y.A00;
        return length < i ? "" : AbstractC7608F5v.A0c(charSequence, i);
    }
}
