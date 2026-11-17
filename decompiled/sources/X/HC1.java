package X;

import java.util.Set;

/* loaded from: classes6.dex */
public abstract class HC1 extends AbstractC10356HBv implements HBU {
    public Set<String> A01 = null;
    public String A00 = null;
    public Set<String> A04 = null;
    public Set<String> A03 = null;
    public Set<String> A02 = null;

    @Override // X.HBU
    public final String AJd() {
        return this.A00;
    }

    @Override // X.HBU
    public final Set<String> AJe() {
        return this.A01;
    }

    @Override // X.HBU
    public final Set<String> AJf() {
        return this.A02;
    }

    @Override // X.HBU
    public final Set<String> AJg() {
        return this.A03;
    }

    @Override // X.HBU
    public final Set<String> ALT() {
        return this.A04;
    }

    @Override // X.HBU
    public final void AeO(String str) {
        this.A00 = str;
    }

    @Override // X.HBU
    public final void AeP(Set<String> set) {
        this.A01 = set;
    }

    @Override // X.HBU
    public final void AeQ(Set<String> set) {
        this.A02 = set;
    }

    @Override // X.HBU
    public final void AeR(Set<String> set) {
        this.A03 = set;
    }

    @Override // X.HBU
    public final void Aeu(Set<String> set) {
        this.A04 = set;
    }
}
