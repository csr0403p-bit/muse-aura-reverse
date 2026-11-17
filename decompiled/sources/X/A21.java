package X;

/* loaded from: classes4.dex */
public final class A21 extends AEs {
    public static final InterfaceC08439ui A01 = new InterfaceC08439ui() { // from class: X.9ul
        @Override // X.InterfaceC08439ui
        public final <T extends AEs> T create(Class<T> cls) {
            return new A21();
        }

        @Override // X.InterfaceC08439ui
        public final /* synthetic */ AEs create(C9uG c9uG, A6J a6j) {
            return AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public final /* synthetic */ AEs create(Class cls, A6J a6j) {
            return InterfaceC08439ui.A00(this, cls);
        }
    };
    public Ao1 A00 = new Ao1();

    @Override // X.AEs
    public final void onCleared() {
        Ao1 ao1 = this.A00;
        if (0 < ao1.A00) {
            ao1.A02(0);
            throw new NullPointerException("destroy");
        }
        ao1.A00 = 0;
    }
}
