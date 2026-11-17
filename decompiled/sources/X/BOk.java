package X;

/* loaded from: classes4.dex */
public final class BOk implements InterfaceC08439ui {
    public static final BOk A00 = new BOk();

    @Override // X.InterfaceC08439ui
    public final /* synthetic */ AEs create(Class cls) {
        throw C8j3.A18("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
        C7384Etj.A0Y(c9uG, 0);
        return (T) AbstractC0855A6c.A00(C9uT.A01(c9uG));
    }

    @Override // X.InterfaceC08439ui
    public final /* synthetic */ AEs create(Class cls, A6J a6j) {
        return InterfaceC08439ui.A00(this, cls);
    }
}
