package X;

/* loaded from: classes5.dex */
public final class EjO implements EjP {
    public static EjP A00;
    public static final EjO A01 = new EjO();

    @Override // X.EjP
    public final synchronized InterfaceC7145EhB getConfig() {
        return A00().getConfig();
    }

    @Override // X.EjP
    public final synchronized EjK getController() {
        return A00().getController();
    }

    @Override // X.EjP
    public final synchronized InterfaceC7237Ej1 getImagePipeline() {
        return A00().getImagePipeline();
    }

    @Override // X.EjP
    public final synchronized InterfaceC7146EhC getPrefetcher() {
        return A00().getPrefetcher();
    }

    public static final synchronized EjP A00() {
        EjP ejP;
        ejP = A00;
        if (ejP == null) {
            throw BV4.A0c("Fresco context provider must be set");
        }
        return ejP;
    }
}
