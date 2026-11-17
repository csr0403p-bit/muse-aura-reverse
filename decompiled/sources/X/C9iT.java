package X;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* renamed from: X.9iT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9iT implements C9iZ, C9iH {
    public final C9iZ A00;
    public final String A01;
    public final Set<String> A02;

    public C9iT(C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 0);
        this.A00 = c9iZ;
        this.A01 = FGI.A0E(c9iZ.AKP(), '?');
        this.A02 = C9iG.A00(c9iZ);
    }

    @Override // X.C9iZ
    public final int AF4(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A00.AF4(str);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9iT) && this.A00.equals(((C9iT) obj).A00));
    }

    @Override // X.C9iZ
    public final List<Annotation> AF2(int i) {
        return this.A00.AF2(i);
    }

    @Override // X.C9iZ
    public final C9iZ AF3(int i) {
        return this.A00.AF3(i);
    }

    @Override // X.C9iZ
    public final String AF5(int i) {
        return this.A00.AF5(i);
    }

    @Override // X.C9iZ
    public final int AF6() {
        return this.A00.AF6();
    }

    @Override // X.C9iZ
    public final BL8 AGs() {
        return this.A00.AGs();
    }

    @Override // X.C9iZ
    public final String AKP() {
        return this.A01;
    }

    @Override // X.C9iH
    public final Set<String> AKQ() {
        return this.A02;
    }

    @Override // X.C9iZ
    public final boolean AOL(int i) {
        return this.A00.AOL(i);
    }

    @Override // X.C9iZ
    public final boolean AOo() {
        return true;
    }

    @Override // X.C9iZ
    public final List<Annotation> getAnnotations() {
        return this.A00.getAnnotations();
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00);
    }

    @Override // X.C9iZ
    public final boolean isInline() {
        return this.A00.isInline();
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A00);
        return C8j3.A16(sbA0w, '?');
    }
}
