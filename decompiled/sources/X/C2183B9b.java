package X;

import java.util.Set;

/* renamed from: X.B9b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2183B9b {
    public final C2182B9a A00;
    public final B9r A01;
    public final Set<B9Z<?>> A02;
    public final Set<AbstractC2184B9c> A03;
    public final Set<C2183B9b> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/B9Z<*>;I)V */
    public static final void A00(C2183B9b c2183B9b, B9Z b9z) {
        C7384Etj.A0Y(b9z, 0);
        if (c2183B9b.A02.add(b9z)) {
            C2182B9a c2182B9a = c2183B9b.A00;
            if (b9z.A00 != null) {
                throw C8j3.A0w("' is already registered with a dispatcher", C3cG.A0f(b9z, "Handler '"));
            }
            c2182B9a.A09.addFirst(b9z);
            b9z.A00 = c2183B9b;
            c2182B9a.A01();
        }
    }

    public final void A01(C2193B9y c2193B9y, AbstractC2184B9c abstractC2184B9c) {
        C2182B9a c2182B9a = this.A00;
        if (c2182B9a.A00 == 0) {
            B9Z<?> b9zA00 = C2182B9a.A00(c2182B9a, -1);
            c2182B9a.A01 = b9zA00;
            c2182B9a.A00 = -1;
            c2182B9a.A02 = abstractC2184B9c;
            if (c2193B9y != null) {
                if (b9zA00 != null) {
                    b9zA00.A02 = new AMV(c2193B9y);
                    if (b9zA00 instanceof B9X) {
                        B9X b9x = (B9X) b9zA00;
                        b9x.A04.invoke(((B9Z) b9x).A02);
                    } else if (b9zA00 instanceof B9V) {
                        B9U b9u = ((B9V) b9zA00).A00;
                        new C2194B9z(c2193B9y);
                        b9u.A03();
                    } else {
                        AbstractC2185B9e abstractC2185B9e = ((B9Y) b9zA00).A00;
                        new C2194B9z(c2193B9y);
                        abstractC2185B9e.A05();
                    }
                }
                AnonymousClass002.A1I(c2182B9a.A0B, new AMV(c2193B9y));
            }
        }
    }

    public final void A02(AbstractC2184B9c abstractC2184B9c) {
        C7384Etj.A0Y(abstractC2184B9c, 0);
        if (this.A03.add(abstractC2184B9c)) {
            this.A00.A02(this, abstractC2184B9c, -1);
        }
    }

    public C2183B9b(B9r b9r) {
        this.A01 = b9r;
        this.A00 = new C2182B9a();
        this.A04 = C3cG.A0k();
        this.A02 = C3cG.A0k();
        this.A03 = C3cG.A0k();
    }

    public C2183B9b() {
        this(null);
    }
}
