package X;

/* loaded from: classes4.dex */
public class BG0 implements InterfaceC08439ui {
    public static BG0 A00;
    public static final BNw<String> A01 = BON.A01;

    @Override // X.InterfaceC08439ui
    public <T extends AEs> T create(Class<T> cls) {
        C7384Etj.A0Y(cls, 0);
        return (T) AbstractC0855A6c.A00(cls);
    }

    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
        AnonymousClass003.A0u(c9uG, a6j);
        return (T) create(C9uT.A01(c9uG), a6j);
    }

    @Override // X.InterfaceC08439ui
    public <T extends AEs> T create(Class<T> cls, A6J a6j) {
        C7384Etj.A0Y(cls, 0);
        return (T) create(cls);
    }
}
