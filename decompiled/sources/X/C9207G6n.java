package X;

import java.util.Set;

/* renamed from: X.G6n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9207G6n {
    public static final Set<G72> A08 = BFI.A0H(new G72[]{AbstractC9205G6l.A0a, AbstractC9205G6l.A0c, AbstractC9205G6l.A09, AbstractC9205G6l.A0O, AbstractC9205G6l.A0P, AbstractC9205G6l.A0b, AbstractC9205G6l.A02, AbstractC9205G6l.A0C, AbstractC9205G6l.A04});
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public CharSequence A04 = "";
    public G72 A05;
    public G72 A06;
    public final InterfaceC9216G6x A07;

    public static final void A00(C9207G6n c9207G6n) {
        G72 g72;
        do {
            InterfaceC9216G6x interfaceC9216G6x = c9207G6n.A07;
            c9207G6n.A02 = interfaceC9216G6x.ALl();
            G72 g72A46 = interfaceC9216G6x.A46();
            c9207G6n.A05 = g72A46;
            g72 = c9207G6n.A06;
            if (!C7384Etj.areEqual(g72A46, g72) || g72 == null) {
                return;
            }
        } while (A08.contains(g72));
    }

    public C9207G6n(InterfaceC9216G6x interfaceC9216G6x) {
        this.A07 = interfaceC9216G6x;
    }
}
