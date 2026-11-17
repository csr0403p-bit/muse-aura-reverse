package X;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: X.9iY, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9iY {
    public static final C9iO A01(String str, G0U g0u) {
        C7384Etj.A0Y(g0u, 2);
        if (C7BY.A0j(str)) {
            throw C60O.A0i("Blank serial names are prohibited");
        }
        C9e5 c9e5 = new C9e5(str);
        g0u.invoke(c9e5);
        return new C9iO(str, C0881AGi.A00, c9e5, C9iN.A00, c9e5.A03.size());
    }

    public static final C9iO A02(String str, G0U g0u, BL8 bl8) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (bl8.equals(C9iN.A00)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C9e5 c9e5 = new C9e5(str);
        g0u.invoke(c9e5);
        return new C9iO(str, C0881AGi.A00, c9e5, bl8, c9e5.A03.size());
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.9iX] */
    public static final C9iX A04(final String str, final C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 1);
        if (C7BY.A0j(str)) {
            throw C60O.A0i("Blank serial names are prohibited");
        }
        if (str.equals(c9iZ.AKP())) {
            throw C60O.A0i(FGI.A0e("The name of the wrapped descriptor (", str, ") cannot be the same as the name of the original descriptor (", c9iZ.AKP(), ')'));
        }
        if (c9iZ.AGs() instanceof AbstractC07679ic) {
            AbstractC08189td.A00(str);
        }
        return new C9iZ(str, c9iZ) { // from class: X.9iX
            public final String A00;
            public final C9iZ A01;

            @Override // X.C9iZ
            public final int AF4(String str2) {
                C7384Etj.A0Y(str2, 0);
                return this.A01.AF4(str2);
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C9iX) {
                        C9iX c9iX = (C9iX) obj;
                        if (!this.A00.equals(c9iX.A00) || !this.A01.equals(c9iX.A01)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // X.C9iZ
            public final List<Annotation> AF2(int i) {
                return this.A01.AF2(i);
            }

            @Override // X.C9iZ
            public final C9iZ AF3(int i) {
                return this.A01.AF3(i);
            }

            @Override // X.C9iZ
            public final String AF5(int i) {
                return this.A01.AF5(i);
            }

            @Override // X.C9iZ
            public final int AF6() {
                return this.A01.AF6();
            }

            @Override // X.C9iZ
            public final BL8 AGs() {
                return this.A01.AGs();
            }

            @Override // X.C9iZ
            public final String AKP() {
                return this.A00;
            }

            @Override // X.C9iZ
            public final boolean AOL(int i) {
                return this.A01.AOL(i);
            }

            @Override // X.C9iZ
            public final boolean AOo() {
                return this.A01.AOo();
            }

            @Override // X.C9iZ
            public final List<Annotation> getAnnotations() {
                return this.A01.getAnnotations();
            }

            public final int hashCode() {
                return AnonymousClass005.A0G(this.A01, AnonymousClass001.A0G(this.A00));
            }

            @Override // X.C9iZ
            public final boolean isInline() {
                return this.A01.isInline();
            }

            {
                this.A00 = str;
                this.A01 = c9iZ;
            }

            public final String toString() {
                return C9iP.A01(this);
            }
        };
    }

    public static final C07709if A05(String str, AbstractC07679ic abstractC07679ic) {
        C7384Etj.A0Y(abstractC07679ic, 1);
        if (C7BY.A0j(str)) {
            throw C60O.A0i("Blank serial names are prohibited");
        }
        AbstractC08189td.A00(str);
        return new C07709if(str, abstractC07679ic);
    }

    public static C9iO A00(String str) {
        return A01(str, new C2276BSc(44));
    }

    public static C9iO A03(String str, BL8 bl8) {
        return A02(str, new C2276BSc(45), bl8);
    }
}
