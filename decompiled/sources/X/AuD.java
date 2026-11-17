package X;

/* loaded from: classes4.dex */
public final class AuD implements InterfaceC2056AxT {
    public int A00;
    public final /* synthetic */ C2035Awp A01;

    @Override // X.InterfaceC2056AxT
    public final void onDragStart() {
        this.A00 = 0;
        this.A01.A01.A00.onDragStart();
    }

    public AuD(C2035Awp c2035Awp) {
        this.A01 = c2035Awp;
    }

    @Override // X.InterfaceC2056AxT
    public final void onDragEnd() {
        this.A01.A01.A00.onDragEnd();
        this.A00 = 0;
    }

    @Override // X.InterfaceC2056AxT
    public final void onDragEnter() {
        InterfaceC2056AxT interfaceC2056AxT;
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 1) {
            this.A01.A01.A00.onDragEnter();
        }
        AbstractC1769AqM abstractC1769AqMA00 = AbstractC1767AqK.A00(this.A01.A01);
        if (abstractC1769AqMA00 == null || (interfaceC2056AxT = ((C2035Awp) abstractC1769AqMA00).A00) == null) {
            return;
        }
        interfaceC2056AxT.onDragEnter();
    }

    @Override // X.InterfaceC2056AxT
    public final void onDragExit() {
        InterfaceC2056AxT interfaceC2056AxT;
        int i = this.A00;
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        this.A00 = i2;
        if (i2 == 0 && i > 0) {
            this.A01.A01.A00.onDragExit();
        }
        AbstractC1769AqM abstractC1769AqMA00 = AbstractC1767AqK.A00(this.A01.A01);
        if (abstractC1769AqMA00 == null || (interfaceC2056AxT = ((C2035Awp) abstractC1769AqMA00).A00) == null) {
            return;
        }
        interfaceC2056AxT.onDragExit();
    }

    @Override // X.InterfaceC2056AxT
    public final C2040Ax7 onReceive(C2040Ax7 c2040Ax7) {
        InterfaceC2056AxT interfaceC2056AxT;
        C1768AqL c1768AqL = this.A01.A01;
        C2040Ax7 c2040Ax7OnReceive = c1768AqL.A00.onReceive(c2040Ax7);
        if (c2040Ax7OnReceive == null) {
            return null;
        }
        AbstractC1769AqM abstractC1769AqMA00 = AbstractC1767AqK.A00(c1768AqL);
        return (abstractC1769AqMA00 == null || (interfaceC2056AxT = ((C2035Awp) abstractC1769AqMA00).A00) == null) ? c2040Ax7OnReceive : interfaceC2056AxT.onReceive(c2040Ax7OnReceive);
    }
}
