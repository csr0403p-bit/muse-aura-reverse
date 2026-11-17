package X;

/* loaded from: classes5.dex */
public final class Eh1 implements InterfaceC3590CVw {
    public static Eh1 A00;

    public static synchronized Eh1 A00() {
        Eh1 eh1;
        eh1 = A00;
        if (eh1 == null) {
            eh1 = new Eh1();
            A00 = eh1;
        }
        return eh1;
    }
}
