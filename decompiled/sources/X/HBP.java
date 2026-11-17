package X;

import com.caverock.androidsvg.SVGParseException;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class HBP extends AbstractC10356HBv implements HB7, HBU {
    public List<HB3> A01 = C3cG.A0h();
    public Set<String> A02 = null;
    public String A00 = null;
    public Set<String> A05 = null;
    public Set<String> A04 = null;
    public Set<String> A03 = null;

    @Override // X.HB7
    public final void A3S(HB3 hb3) throws SVGParseException {
        if ((this instanceof HBO) && !(hb3 instanceof HC7)) {
            throw AbstractC7607F5u.A0r(AnonymousClass001.A0v(" elements.", C3cG.A0f(hb3, "Text content elements cannot contain ")));
        }
        this.A01.add(hb3);
    }

    @Override // X.HB7
    public final List<HB3> ADb() {
        return this.A01;
    }

    @Override // X.HBU
    public final String AJd() {
        return this.A00;
    }

    @Override // X.HBU
    public final Set<String> AJe() {
        return this.A02;
    }

    @Override // X.HBU
    public final Set<String> AJf() {
        return this.A03;
    }

    @Override // X.HBU
    public final Set<String> AJg() {
        return this.A04;
    }

    @Override // X.HBU
    public final Set<String> ALT() {
        return null;
    }

    @Override // X.HBU
    public final void AeO(String str) {
        this.A00 = str;
    }

    @Override // X.HBU
    public final void AeP(Set<String> set) {
        this.A02 = set;
    }

    @Override // X.HBU
    public final void AeQ(Set<String> set) {
        this.A03 = set;
    }

    @Override // X.HBU
    public final void AeR(Set<String> set) {
        this.A04 = set;
    }

    @Override // X.HBU
    public final void Aeu(Set<String> set) {
        this.A05 = set;
    }
}
