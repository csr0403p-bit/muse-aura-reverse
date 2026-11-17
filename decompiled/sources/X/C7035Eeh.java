package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Eeh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7035Eeh<T> extends AbstractC7025EeW<T> {
    public static final String __redex_internal_original_name = "ThreadHandoffProducer$produceResults$1$statefulRunnable$1";
    public final /* synthetic */ InterfaceC7028EeZ<T> A00;
    public final /* synthetic */ InterfaceC7029Eea A01;
    public final /* synthetic */ InterfaceC7027EeY A02;
    public final /* synthetic */ C7036Eei<T> A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/EeZ<TT;>;LX/EeY;LX/Eea;LX/Eei<TT;>;)V */
    public C7035Eeh(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea, InterfaceC7027EeY interfaceC7027EeY, C7036Eei c7036Eei) {
        super(interfaceC7028EeZ, interfaceC7029Eea, interfaceC7027EeY, "BackgroundThreadHandoffProducer");
        this.A00 = interfaceC7028EeZ;
        this.A02 = interfaceC7027EeY;
        this.A01 = interfaceC7029Eea;
        this.A03 = c7036Eei;
    }

    @Override // X.AbstractC7025EeW, X.AbstractRunnableC7002Ee4
    public final void A04(T t) {
        InterfaceC7027EeY interfaceC7027EeY = this.A02;
        InterfaceC7029Eea interfaceC7029Eea = this.A01;
        interfaceC7027EeY.AV4(interfaceC7029Eea, "BackgroundThreadHandoffProducer", null);
        this.A03.A00.AYc(this.A00, interfaceC7029Eea);
    }
}
