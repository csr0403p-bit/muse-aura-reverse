package X;

/* loaded from: classes5.dex */
public final class C4A extends C4B<Object> {
    public static C4B A00;

    public static synchronized C4B A00() {
        C4B c4a;
        c4a = A00;
        if (c4a == null) {
            c4a = new C4A();
            A00 = c4a;
        }
        return c4a;
    }
}
