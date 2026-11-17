package X;

import android.app.Activity;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CDs implements CDr {
    public final CEQ A00;
    public final CEQ A01;
    public final CEQ A02;

    private final CDr A00() {
        return (CDr) (this.A02.AjF() != null ? this.A01 : this.A00).AjF();
    }

    public CDs(CEQ ceq, CEQ ceq2, CEQ ceq3) {
        this.A00 = ceq;
        this.A01 = ceq2;
        this.A02 = ceq3;
    }

    @Override // X.CDr
    public final CSA<Void> A5y(int i) {
        return A00().A5y(i);
    }

    @Override // X.CDr
    public final CSA<Void> A8l(List<String> list) {
        return A00().A8l(list);
    }

    @Override // X.CDr
    public final CSA<Void> A8m(List<String> list) {
        return A00().A8m(list);
    }

    @Override // X.CDr
    public final Set<String> AGZ() {
        return A00().AGZ();
    }

    @Override // X.CDr
    public final CSA<List<CJN>> AKW() {
        return A00().AKW();
    }

    @Override // X.CDr
    public final void Aa1(InterfaceC3390CIx interfaceC3390CIx) {
        A00().Aa1(interfaceC3390CIx);
    }

    @Override // X.CDr
    public final boolean Afx(Activity activity, CJN cjn, int i) {
        return A00().Afx(activity, cjn, i);
    }

    @Override // X.CDr
    public final CSA<Integer> Ag7(CEU ceu) {
        return A00().Ag7(ceu);
    }
}
