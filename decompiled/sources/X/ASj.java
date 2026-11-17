package X;

/* loaded from: classes4.dex */
public final class ASj<T> implements InterfaceC1042ASl<T> {
    public final int A00;
    public final int A01;
    public final C28s A02;

    public static AQJ A00(C28s c28s, int i, int i2) {
        return AbstractC1011APs.A0E(new ASj(c28s, i, i2));
    }

    @Override // X.InterfaceC1042ASl
    public final /* bridge */ /* synthetic */ InterfaceC1044ASn AiH(C31w c31w) {
        return new C1121Aam(this.A02, this.A01, this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ASj)) {
            return false;
        }
        ASj aSj = (ASj) obj;
        if (aSj.A01 == this.A01 && aSj.A00 == this.A00) {
            return C8j3.A1W(aSj.A02, this.A02, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, this.A01 * 31) + this.A00;
    }

    @Override // X.AOe, X.AOc
    public final /* bridge */ /* synthetic */ AOX vectorize(C31w c31w) {
        return new C1121Aam(this.A02, this.A01, this.A00);
    }

    public ASj(C28s c28s, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c28s;
    }

    public ASj() {
        this(C2HU.A01, 300, 0);
    }

    @Override // X.AOc
    public final /* bridge */ /* synthetic */ InterfaceC0999AOh vectorize(C31w c31w) {
        return new C1121Aam(this.A02, this.A01, this.A00);
    }
}
