package X;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.9tR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tR implements C9iZ {
    public final C9iZ A00;

    @Override // X.C9iZ
    public final int AF4(String str) {
        C7384Etj.A0Y(str, 0);
        Integer numA0r = C9tI.A0r(str);
        if (numA0r != null) {
            return numA0r.intValue();
        }
        throw C60Q.A0U(str, " is not a valid list index");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9tR) {
                C9tR c9tR = (C9tR) obj;
                if (!this.A00.equals(c9tR.A00) || !C7384Etj.areEqual(AKP(), c9tR.AKP())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C9iZ
    public final List<Annotation> AF2(int i) {
        if (i >= 0) {
            return C0881AGi.A00;
        }
        throw C60O.A0i(FGI.A09(i, "Illegal index ", ", ", AKP(), " expects only non-negative indices"));
    }

    @Override // X.C9iZ
    public final C9iZ AF3(int i) {
        if (i >= 0) {
            return this.A00;
        }
        throw C60O.A0i(FGI.A09(i, "Illegal index ", ", ", AKP(), " expects only non-negative indices"));
    }

    @Override // X.C9iZ
    public final int AF6() {
        return 1;
    }

    @Override // X.C9iZ
    public final BL8 AGs() {
        return C9tD.A00;
    }

    @Override // X.C9iZ
    public final boolean AOL(int i) {
        if (i >= 0) {
            return false;
        }
        throw C60O.A0i(FGI.A09(i, "Illegal index ", ", ", AKP(), " expects only non-negative indices"));
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean AOo() {
        return false;
    }

    @Override // X.C9iZ
    public final /* synthetic */ List getAnnotations() {
        return C0881AGi.A00;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(AKP(), AnonymousClass005.A0E(this.A00));
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public C9tR(C9iZ c9iZ) {
        this.A00 = c9iZ;
    }

    @Override // X.C9iZ
    public final String AF5(int i) {
        return String.valueOf(i);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(AKP());
        sbA0w.append('(');
        return AnonymousClass007.A0Z(this.A00, sbA0w);
    }
}
