package X;

/* loaded from: classes4.dex */
public final class BON {
    public static final BNw<String> A01 = new BSV(4);
    public final C0854A6a A00;

    public BON(InterfaceC08439ui interfaceC08439ui, BJt bJt, A6J a6j) {
        C7384Etj.A0Y(bJt, 0);
        C7384Etj.A0Y(interfaceC08439ui, 1);
        C7384Etj.A0Y(a6j, 2);
        this.A00 = new C0854A6a(interfaceC08439ui, bJt, a6j);
    }

    public static final BON A00(InterfaceC08439ui interfaceC08439ui, BJt bJt, A6J a6j) {
        C7384Etj.A0Y(bJt, 0);
        C7384Etj.A0Y(interfaceC08439ui, 1);
        C7384Etj.A0Y(a6j, 2);
        return new BON(interfaceC08439ui, bJt, a6j);
    }

    public final <T extends AEs> T A02(C9uG<T> c9uG) {
        C0854A6a c0854A6a = this.A00;
        String strA00 = C0861A6i.A00(((C0861A6i) c9uG).A00);
        if (strA00 != null) {
            return (T) c0854A6a.A00(FGI.A0M("androidx.lifecycle.ViewModelProvider.DefaultKey:", strA00), c9uG);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final <T extends AEs> T A01(Class<T> cls) {
        return (T) A02(C3cG.A0x(cls));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BON(BOD bod) {
        InterfaceC08439ui defaultViewModelProviderFactory;
        A6J defaultViewModelCreationExtras;
        BJt viewModelStore = bod.getViewModelStore();
        if (bod instanceof BRk) {
            BRk bRk = (BRk) bod;
            defaultViewModelProviderFactory = bRk.getDefaultViewModelProviderFactory();
            defaultViewModelCreationExtras = bRk.getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelProviderFactory = BOk.A00;
            defaultViewModelCreationExtras = A6K.A00;
        }
        this(defaultViewModelProviderFactory, viewModelStore, defaultViewModelCreationExtras);
    }
}
