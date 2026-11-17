package X;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.9tQ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tQ implements C9iZ {
    public final String A00;
    public final C9iZ A01;
    public final C9iZ A02;

    @Override // X.C9iZ
    public final int AF4(String str) {
        C7384Etj.A0Y(str, 0);
        Integer numA0r = C9tI.A0r(str);
        if (numA0r != null) {
            return numA0r.intValue();
        }
        throw C60Q.A0U(str, " is not a valid map index");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9tQ) {
                C9tQ c9tQ = (C9tQ) obj;
                if (!this.A00.equals(c9tQ.A00) || !this.A01.equals(c9tQ.A01) || !this.A02.equals(c9tQ.A02)) {
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
        throw C60O.A0i(FGI.A09(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    @Override // X.C9iZ
    public final C9iZ AF3(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(FGI.A09(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.A01;
        }
        if (i2 == 1) {
            return this.A02;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // X.C9iZ
    public final int AF6() {
        return 2;
    }

    @Override // X.C9iZ
    public final BL8 AGs() {
        return C9tE.A00;
    }

    @Override // X.C9iZ
    public final String AKP() {
        return this.A00;
    }

    @Override // X.C9iZ
    public final boolean AOL(int i) {
        if (i >= 0) {
            return false;
        }
        throw C60O.A0i(FGI.A09(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
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
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass001.A0G(this.A00)));
    }

    @Override // X.C9iZ
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public C9tQ(String str, C9iZ c9iZ, C9iZ c9iZ2) {
        this.A00 = str;
        this.A01 = c9iZ;
        this.A02 = c9iZ2;
    }

    @Override // X.C9iZ
    public final String AF5(int i) {
        return String.valueOf(i);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        sbA0w.append('(');
        sbA0w.append(this.A01);
        C8j3.A1K(sbA0w);
        return AnonymousClass007.A0Z(this.A02, sbA0w);
    }
}
