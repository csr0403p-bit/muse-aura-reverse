package X;

/* renamed from: X.AfF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1232AfF implements AfD {
    public final /* synthetic */ C1369Ahv A00;
    public final /* synthetic */ Object A01;

    @Override // X.AfD
    public final void Abg(InterfaceC2246BCr interfaceC2246BCr) {
    }

    public C1232AfF(C1369Ahv c1369Ahv, Object obj) {
        this.A00 = c1369Ahv;
        this.A01 = obj;
    }

    @Override // X.AfD
    public final AfC A4N() {
        return C1369Ahv.A00(this.A00, this.A01);
    }

    @Override // X.AfD
    public final void cancel() {
    }

    @Override // X.AfD
    public final boolean isComplete() {
        return true;
    }
}
