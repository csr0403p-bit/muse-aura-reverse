package X;

/* renamed from: X.EiC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7199EiC extends AbstractC7206EiO {
    public final InterfaceC7251EjV A00;
    public final C7266Ejr A01;

    /* JADX WARN: Incorrect types in method signature: (LX/EeM<TT;>;LX/Ejr;LX/EjV;)V */
    public AbstractC7199EiC(InterfaceC7251EjV interfaceC7251EjV, InterfaceC7015EeM interfaceC7015EeM, C7266Ejr c7266Ejr) {
        C7384Etj.A0Y(interfaceC7015EeM, 0);
        this.A01 = c7266Ejr;
        this.A00 = interfaceC7251EjV;
        C7267Ejs.A00();
        this.A04 = c7266Ejr.A0B;
        C7267Ejs.A00();
        interfaceC7251EjV.AVQ(c7266Ejr);
        C7267Ejs.A00();
        interfaceC7015EeM.AYc(new C7201EiF(this), c7266Ejr);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;ILX/Eea;)V */
    public void A08(InterfaceC7029Eea interfaceC7029Eea, Object obj, int i) {
        C7384Etj.A0Y(interfaceC7029Eea, 2);
        boolean zA1Y = BV8.A1Y(i);
        if (super.A06(obj, interfaceC7029Eea.getExtras(), zA1Y) && zA1Y) {
            this.A00.AVS(this.A01);
        }
    }

    @Override // X.AbstractC7206EiO, X.InterfaceC7236Ej0
    public final boolean A6Q() {
        if (!super.A6Q()) {
            return false;
        }
        if (AOQ()) {
            return true;
        }
        InterfaceC7251EjV interfaceC7251EjV = this.A00;
        C7266Ejr c7266Ejr = this.A01;
        interfaceC7251EjV.AVM(c7266Ejr);
        c7266Ejr.A03();
        return true;
    }
}
