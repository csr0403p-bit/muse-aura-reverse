package X;

/* renamed from: X.Cpo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4202Cpo implements InterfaceC4362Cu6, InterfaceC4375CuV {
    public C4200Cpj A00;
    public boolean A01 = true;
    public final InterfaceC4462Cwe A02;
    public final /* synthetic */ C4109Cmq A03;

    @Override // X.InterfaceC4362Cu6
    public final synchronized C4200Cpj AjE() {
        return this.A00;
    }

    @Override // X.InterfaceC4362Cu6
    public final synchronized void AjU(C4200Cpj c4200Cpj) {
        C4200Cpj c4200Cpj2 = this.A00;
        if (c4200Cpj2 != c4200Cpj) {
            c4200Cpj2.A02 = null;
            c4200Cpj2.A01 = null;
            this.A00 = c4200Cpj;
        }
    }

    @Override // X.InterfaceC4362Cu6
    public final void AjV() {
        C4248CrK<?> c4248CrK;
        synchronized (this) {
            this.A01 = false;
            c4248CrK = this.A00.A01;
        }
        if (c4248CrK != null) {
            this.A03.A04(c4248CrK, 2441);
        }
    }

    public C4202Cpo(C4200Cpj c4200Cpj, InterfaceC4462Cwe interfaceC4462Cwe, C4109Cmq c4109Cmq) {
        this.A03 = c4109Cmq;
        this.A00 = c4200Cpj;
        this.A02 = interfaceC4462Cwe;
    }

    @Override // X.InterfaceC4375CuV
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        C4248CrK c4248CrK;
        boolean z;
        C4196CpV c4196CpV = (C4196CpV) obj;
        CSE cse = (CSE) obj2;
        synchronized (this) {
            c4248CrK = this.A00.A01;
            z = this.A01;
            C4200Cpj c4200Cpj = this.A00;
            c4200Cpj.A02 = null;
            c4200Cpj.A01 = null;
        }
        if (c4248CrK == null) {
            cse.A02(AnonymousClass001.A0h());
        } else {
            c4196CpV.A07(c4248CrK, cse, z);
        }
    }
}
