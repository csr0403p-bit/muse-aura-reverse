package X;

import java.util.ArrayList;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* renamed from: X.9sL, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sL<Tag> implements InterfaceC07789is, C9j5 {
    public final ArrayList<Tag> A00 = new ArrayList<>();

    /* JADX WARN: Incorrect return type in method signature: (LX/9iZ;I)TTag; */
    public abstract String A01(C9iZ c9iZ, int i);

    @Override // X.C9j5
    public final void AA7(C9iZ c9iZ, int i, boolean z) {
        C7384Etj.A0Y(c9iZ, 0);
        String strA01 = A01(c9iZ, i);
        C7384Etj.A0Y(strA01, 0);
        Boolean boolValueOf = Boolean.valueOf(z);
        C9iZ c9iZ2 = C9oY.A00;
        ((C9sN) this).A07(strA01, new JsonLiteral(boolValueOf, null, false));
    }

    @Override // X.C9j5
    public final void AA9(C9iZ c9iZ, byte b, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        String strA01 = A01(c9iZ, i);
        C7384Etj.A0Y(strA01, 0);
        ((C9sN) this).A07(strA01, C9oY.A06(Byte.valueOf(b)));
    }

    @Override // X.C9j5
    public final void AAB(C9iZ c9iZ, char c, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        String strA01 = A01(c9iZ, i);
        C7384Etj.A0Y(strA01, 0);
        ((C9sN) this).A07(strA01, C9oY.A07(String.valueOf(c)));
    }

    @Override // X.C9j5
    public final void AAD(C9iZ c9iZ, double d, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        A03(A01(c9iZ, i), d);
    }

    @Override // X.InterfaceC07789is
    public final void AAE(C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        String str = (String) A00(this);
        C7384Etj.A0Y(str, 0);
        ((C9sN) this).A07(str, C9oY.A07(c9iZ.AF5(i)));
    }

    @Override // X.C9j5
    public final void AAG(C9iZ c9iZ, float f, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        A04(A01(c9iZ, i), f);
    }

    @Override // X.C9j5
    public final InterfaceC07789is AAI(C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        return A02(A01(c9iZ, i), c9iZ.AF3(i));
    }

    @Override // X.C9j5
    public final void AAK(C9iZ c9iZ, int i, int i2) {
        C7384Etj.A0Y(c9iZ, 0);
        String strA01 = A01(c9iZ, i);
        C7384Etj.A0Y(strA01, 0);
        ((C9sN) this).A07(strA01, C9oY.A06(Integer.valueOf(i2)));
    }

    @Override // X.C9j5
    public final void AAN(C9iZ c9iZ, int i, long j) {
        C7384Etj.A0Y(c9iZ, 0);
        String strA01 = A01(c9iZ, i);
        C7384Etj.A0Y(strA01, 0);
        ((C9sN) this).A07(strA01, C9oY.A06(Long.valueOf(j)));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9iZ;ILX/9hv<-TT;>;TT;)V */
    @Override // X.C9j5
    public void AAP(Object obj, C9hv c9hv, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9hv, 2);
        this.A00.add(A01(c9iZ, i));
        if (c9hv.getDescriptor().AOo() || obj != null) {
            AAR(obj, c9hv);
        } else {
            AAO();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9iZ;ILX/9hv<-TT;>;TT;)V */
    @Override // X.C9j5
    public final void AAQ(Object obj, C9hv c9hv, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9hv, 2);
        this.A00.add(A01(c9iZ, i));
        AAR(obj, c9hv);
    }

    @Override // X.InterfaceC07789is
    public abstract /* synthetic */ void AAR(Object obj, C9hv c9hv);

    @Override // X.C9j5
    public final void AAT(C9iZ c9iZ, int i, short s) {
        C7384Etj.A0Y(c9iZ, 0);
        String strA01 = A01(c9iZ, i);
        C7384Etj.A0Y(strA01, 0);
        ((C9sN) this).A07(strA01, C9oY.A06(Short.valueOf(s)));
    }

    @Override // X.InterfaceC07789is
    public final void AAU(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = (String) A00(this);
        C7384Etj.A0Y(str2, 0);
        ((C9sN) this).A07(str2, C9oY.A07(str));
    }

    @Override // X.C9j5
    public final void AAd(C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 0);
        if (!this.A00.isEmpty()) {
            A00(this);
        }
        C9sN c9sN = (C9sN) this;
        c9sN.A02.invoke(c9sN.A06());
    }

    public static final Object A00(C9sL c9sL) {
        ArrayList<Tag> arrayList = c9sL.A00;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InterfaceC07789is A02(Tag tag, C9iZ c9iZ) {
        C9sN c9sN = (C9sN) this;
        String str = (String) tag;
        AnonymousClass003.A0u(str, c9iZ);
        Set<C9iZ> set = C9oB.A00;
        boolean zIsInline = c9iZ.isInline();
        if (zIsInline && set.contains(c9iZ)) {
            return new C08049sn(str, c9sN);
        }
        if (zIsInline && c9iZ.equals(C9oY.A00)) {
            return new C08129sv(str, c9iZ, c9sN);
        }
        ((C9sL) c9sN).A00.add(str);
        return c9sN;
    }

    private final void A03(Tag tag, double d) {
        C9sN c9sN = (C9sN) this;
        String strA13 = C8j3.A13(tag);
        Double dValueOf = Double.valueOf(d);
        c9sN.A07(strA13, C9oY.A06(dValueOf));
        if (c9sN.A04.A04 || Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        String string = c9sN.A06().toString();
        C7384Etj.A0Y(string, 2);
        StringBuilder sbA0f = C3cG.A0f(dValueOf, "Unexpected special floating-point value ");
        sbA0f.append(" with key ");
        sbA0f.append(strA13);
        throw new JsonEncodingException(C9rA.A01(string, sbA0f));
    }

    private final void A04(Tag tag, float f) {
        C9sN c9sN = (C9sN) this;
        String strA13 = C8j3.A13(tag);
        Float fValueOf = Float.valueOf(f);
        c9sN.A07(strA13, C9oY.A06(fValueOf));
        if (c9sN.A04.A04 || Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        String string = c9sN.A06().toString();
        C7384Etj.A0Y(string, 2);
        StringBuilder sbA0f = C3cG.A0f(fValueOf, "Unexpected special floating-point value ");
        sbA0f.append(" with key ");
        sbA0f.append(strA13);
        throw new JsonEncodingException(C9rA.A01(string, sbA0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07789is
    public final InterfaceC07789is AAH(C9iZ c9iZ) {
        C9sN c9sN = (C9sN) this;
        C7384Etj.A0Y(c9iZ, 0);
        if (AbstractC0878AGe.A0I(((C9sL) c9sN).A00) != null) {
            if (c9sN.A00 != null) {
                c9sN.A01 = c9iZ.AKP();
            }
            return c9sN.A02(A00(c9sN), c9iZ);
        }
        C9t2 c9t2 = new C9t2(c9sN.A02, c9sN.A03);
        ((C9sL) c9t2).A00.add("primitive");
        return c9t2.AAH(c9iZ);
    }

    @Override // X.InterfaceC07789is
    public final void AA6(boolean z) {
        String str = (String) A00(this);
        C7384Etj.A0Y(str, 0);
        Boolean boolValueOf = Boolean.valueOf(z);
        C9iZ c9iZ = C9oY.A00;
        ((C9sN) this).A07(str, new JsonLiteral(boolValueOf, null, false));
    }

    @Override // X.InterfaceC07789is
    public final void AA8(byte b) {
        ((C9sN) this).A07(C8j3.A13(A00(this)), C9oY.A06(Byte.valueOf(b)));
    }

    @Override // X.InterfaceC07789is
    public final void AAA(char c) {
        ((C9sN) this).A07(C8j3.A13(A00(this)), C9oY.A07(String.valueOf(c)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07789is
    public final void AAC(double d) {
        A03(A00(this), d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07789is
    public final void AAF(float f) {
        A04(A00(this), f);
    }

    @Override // X.InterfaceC07789is
    public final void AAJ(int i) {
        ((C9sN) this).A07(C8j3.A13(A00(this)), C9oY.A06(Integer.valueOf(i)));
    }

    @Override // X.InterfaceC07789is
    public final void AAM(long j) {
        ((C9sN) this).A07(C8j3.A13(A00(this)), C9oY.A06(Long.valueOf(j)));
    }

    @Override // X.InterfaceC07789is
    public final void AAS(short s) {
        ((C9sN) this).A07(C8j3.A13(A00(this)), C9oY.A06(Short.valueOf(s)));
    }

    @Override // X.C9j5
    public final void AAV(String str, C9iZ c9iZ, int i) {
        AnonymousClass003.A0v(c9iZ, str);
        String strA01 = A01(c9iZ, i);
        C7384Etj.A0Y(strA01, 0);
        ((C9sN) this).A07(strA01, C9oY.A07(str));
    }
}
