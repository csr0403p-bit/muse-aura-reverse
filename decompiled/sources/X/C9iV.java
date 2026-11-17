package X;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.9iV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9iV implements C9iZ {
    public final String A00;
    public final C9uG<?> A01;
    public final C9iZ A02;

    @Override // X.C9iZ
    public final int AF4(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A02.AF4(str);
    }

    @Override // X.C9iZ
    public final List<Annotation> AF2(int i) {
        return this.A02.AF2(i);
    }

    @Override // X.C9iZ
    public final C9iZ AF3(int i) {
        return this.A02.AF3(i);
    }

    @Override // X.C9iZ
    public final String AF5(int i) {
        return this.A02.AF5(i);
    }

    @Override // X.C9iZ
    public final int AF6() {
        return this.A02.AF6();
    }

    @Override // X.C9iZ
    public final BL8 AGs() {
        return this.A02.AGs();
    }

    @Override // X.C9iZ
    public final String AKP() {
        return this.A00;
    }

    @Override // X.C9iZ
    public final boolean AOL(int i) {
        return this.A02.AOL(i);
    }

    @Override // X.C9iZ
    public final boolean AOo() {
        return this.A02.AOo();
    }

    public final boolean equals(Object obj) {
        C9iV c9iV = obj instanceof C9iV ? (C9iV) obj : null;
        return c9iV != null && this.A02.equals(c9iV.A02) && c9iV.A01.equals(this.A01);
    }

    @Override // X.C9iZ
    public final List<Annotation> getAnnotations() {
        return this.A02.getAnnotations();
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass005.A0E(C9uT.A02(this.A01)));
    }

    @Override // X.C9iZ
    public final boolean isInline() {
        return this.A02.isInline();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ContextDescriptor(kClass: ");
        sbA0x.append(this.A01);
        sbA0x.append(", original: ");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9iZ;LX/9uG<*>;)V */
    public C9iV(C9uG c9uG, C9iZ c9iZ) {
        this.A02 = c9iZ;
        this.A01 = c9uG;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(c9iZ.AKP());
        sbA0w.append('<');
        sbA0w.append(C8j3.A12(c9uG));
        this.A00 = C8j3.A16(sbA0w, '>');
    }
}
