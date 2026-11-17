package X;

/* renamed from: X.AqL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1768AqL extends AbstractC1437Aj6 implements InterfaceC1219Aex, C1Z2 {
    public InterfaceC2056AxT A00;
    public final AbstractC1769AqM A01;
    public final ARP A02;

    @Override // X.InterfaceC1219Aex
    public final ARP AJE() {
        return this.A02;
    }

    public C1768AqL(InterfaceC2056AxT interfaceC2056AxT) {
        this.A00 = interfaceC2056AxT;
        C2035Awp c2035Awp = new C2035Awp(this);
        this.A01 = c2035Awp;
        ARR<AbstractC1769AqM> arr = AbstractC1767AqK.A00;
        ARO aro = new ARO(arr);
        aro.A01(arr, c2035Awp);
        this.A02 = aro;
        A0G(new C1756Aq9(new C2334BUi(10, C2278BSe.A00(27), new C1880Asu(c2035Awp, C2295BSv.A00(this, 10)))));
    }

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ Object AEO(ARR arr) {
        return AbstractC1218Aew.A00(this, arr);
    }
}
