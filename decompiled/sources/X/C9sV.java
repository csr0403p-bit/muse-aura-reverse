package X;

/* renamed from: X.9sV, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sV {
    public static final C9iZ A00(C9iZ c9iZ, C07959pz c07959pz) {
        C9hr c9hrA00;
        C9iZ descriptor;
        C9iZ c9iZA00;
        C7384Etj.A0Y(c9iZ, 0);
        if (!C7384Etj.areEqual(c9iZ.AGs(), C9hs.A00)) {
            return c9iZ.isInline() ? A00(c9iZ.AF3(0), c07959pz) : c9iZ;
        }
        C9uG<?> c9uGA00 = C9ia.A00(c9iZ);
        return (c9uGA00 == null || (c9hrA00 = c07959pz.A00(C0881AGi.A00, c9uGA00)) == null || (descriptor = c9hrA00.getDescriptor()) == null || (c9iZA00 = A00(descriptor, c07959pz)) == null) ? c9iZ : c9iZA00;
    }

    public static final C9sh A01(C9iZ c9iZ, C9sU c9sU) {
        C7384Etj.A0Y(c9sU, 0);
        BL8 bl8AGs = c9iZ.AGs();
        if (bl8AGs instanceof C9hz) {
            return C9sh.A05;
        }
        if (!C7384Etj.areEqual(bl8AGs, C9tD.A00)) {
            if (!C7384Etj.areEqual(bl8AGs, C9tE.A00)) {
                return C9sh.A04;
            }
            C9iZ c9iZA00 = A00(c9iZ.AF3(0), c9sU.A02);
            BL8 bl8AGs2 = c9iZA00.AGs();
            if ((bl8AGs2 instanceof AbstractC07679ic) || C7384Etj.areEqual(bl8AGs2, C9i9.A00)) {
                return C9sh.A03;
            }
            if (!c9sU.A00.A05) {
                throw C9rA.A04(c9iZA00);
            }
        }
        return C9sh.A02;
    }
}
