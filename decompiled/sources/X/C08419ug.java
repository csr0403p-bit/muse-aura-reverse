package X;

/* renamed from: X.9ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08419ug implements InterfaceC08439ui {
    public static final C08419ug A00 = new C08419ug();

    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(Class<T> cls) {
        return new A24();
    }

    @Override // X.InterfaceC08439ui
    public final /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
        return (T) AbstractC08429uh.A00(this, a6j, c9uG);
    }

    @Override // X.InterfaceC08439ui
    public final /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
        return (T) InterfaceC08439ui.A00(this, cls);
    }
}
