package X;

import android.os.Bundle;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* renamed from: X.9jJ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9jJ implements C9j5, InterfaceC07789is {
    public static String A00(A5Z a5z, Object obj) {
        C7384Etj.A0Y(obj, 0);
        String str = a5z.A00;
        C7384Etj.A0Y(str, 1);
        return str;
    }

    public static String A01(A5Z a5z, Object obj) {
        C7384Etj.A0Y(obj, 0);
        String str = a5z.A00;
        C7384Etj.A0Y(str, 1);
        return str;
    }

    public static boolean A02(C9iZ c9iZ, C9jJ c9jJ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        return c9jJ.A05(c9iZ, i);
    }

    @Override // X.InterfaceC07789is
    public C9j5 A56(C9iZ c9iZ) {
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9iZ;ILX/9hv<-TT;>;TT;)V */
    @Override // X.C9j5
    public void AAP(Object obj, C9hv c9hv, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9hv, 2);
        if (A05(c9iZ, i)) {
            if (c9hv.getDescriptor().AOo() || obj != null) {
                AAR(obj, c9hv);
            } else {
                AAO();
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9iZ;ILX/9hv<-TT;>;TT;)V */
    @Override // X.C9j5
    public final void AAQ(Object obj, C9hv c9hv, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9hv, 2);
        if (A05(c9iZ, i)) {
            AAR(obj, c9hv);
        }
    }

    @Override // X.InterfaceC07789is
    public /* synthetic */ void AAR(Object obj, C9hv c9hv) {
        C7384Etj.A0Y(c9hv, 1);
        c9hv.serialize(this, obj);
    }

    @Override // X.C9j5
    public final void AAV(String str, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(str, 2);
        if (A05(c9iZ, i)) {
            AAU(str);
        }
    }

    @Override // X.C9j5
    public void AAd(C9iZ c9iZ) {
    }

    private final void A04(Object obj) {
        if (this instanceof C9jK) {
            return;
        }
        StringBuilder sbA0x = C60O.A0x("Non-serializable ");
        C8j5.A0o(sbA0x, obj);
        sbA0x.append(" is not supported by ");
        C8j5.A0o(sbA0x, this);
        throw new SerializationException(AnonymousClass001.A0v(" encoder", sbA0x));
    }

    public boolean A05(C9iZ c9iZ, int i) {
        return true;
    }

    @Override // X.InterfaceC07789is
    public final void AA6(boolean z) {
        if (this instanceof C9sQ) {
            C9sQ c9sQ = (C9sQ) this;
            if (c9sQ.A02) {
                c9sQ.AAU(String.valueOf(z));
                return;
            } else {
                c9sQ.A05.A01.Aia(String.valueOf(z));
                return;
            }
        }
        if (this instanceof C9jK) {
            return;
        }
        if (!(this instanceof A5Z)) {
            A04(Boolean.valueOf(z));
            return;
        }
        A5Z a5z = (A5Z) this;
        Bundle bundle = a5z.A01;
        bundle.putBoolean(A01(a5z, bundle), z);
    }

    @Override // X.InterfaceC07789is
    public final void AA8(byte b) {
        if (!(this instanceof C9sQ)) {
            if (this instanceof C08049sn) {
                C08049sn.A03(String.valueOf(b & 255), (C08049sn) this);
                return;
            } else {
                if (this instanceof C9jK) {
                    return;
                }
                if (!(this instanceof A5Z)) {
                    A04(Byte.valueOf(b));
                    return;
                }
                A5Z a5z = (A5Z) this;
                Bundle bundle = a5z.A01;
                bundle.putInt(A01(a5z, bundle), b);
                return;
            }
        }
        C9sQ c9sQ = (C9sQ) this;
        if (c9sQ.A02) {
            c9sQ.AAU(String.valueOf((int) b));
            return;
        }
        C08029sl c08029sl = c9sQ.A05;
        if (!(c08029sl instanceof C08099ss)) {
            c08029sl.A01.writeLong(b);
            return;
        }
        C08099ss c08099ss = (C08099ss) c08029sl;
        boolean z = c08099ss.A00;
        String strValueOf = String.valueOf(b & 255);
        if (z) {
            c08099ss.A05(strValueOf);
        } else {
            c08099ss.A01.Aia(strValueOf);
        }
    }

    @Override // X.InterfaceC07789is
    public final void AAA(char c) {
        if (this instanceof C9sQ) {
            AAU(String.valueOf(c));
            return;
        }
        if (this instanceof C9jK) {
            return;
        }
        if (!(this instanceof A5Z)) {
            A04(Character.valueOf(c));
            return;
        }
        A5Z a5z = (A5Z) this;
        Bundle bundle = a5z.A01;
        bundle.putChar(A01(a5z, bundle), c);
    }

    @Override // X.InterfaceC07789is
    public final void AAC(double d) {
        if (!(this instanceof C9sQ)) {
            if (this instanceof C9jK) {
                return;
            }
            if (!(this instanceof A5Z)) {
                A04(Double.valueOf(d));
                return;
            }
            A5Z a5z = (A5Z) this;
            Bundle bundle = a5z.A01;
            bundle.putDouble(A01(a5z, bundle), d);
            return;
        }
        C9sQ c9sQ = (C9sQ) this;
        if (c9sQ.A02) {
            c9sQ.AAU(String.valueOf(d));
        } else {
            c9sQ.A05.A01.Aia(String.valueOf(d));
        }
        if (c9sQ.A04.A04 || Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d);
        String string = c9sQ.A05.A01.toString();
        C7384Etj.A0Y(string, 1);
        throw new JsonEncodingException(C9rA.A01(string, C3cG.A0f(dValueOf, "Unexpected special floating-point value ")));
    }

    @Override // X.InterfaceC07789is
    public final void AAE(C9iZ c9iZ, int i) {
        if (this instanceof C9sQ) {
            C7384Etj.A0Y(c9iZ, 0);
            AAU(c9iZ.AF5(i));
        } else {
            if (this instanceof C9jK) {
                return;
            }
            if (!(this instanceof A5Z)) {
                A04(Integer.valueOf(i));
                return;
            }
            A5Z a5z = (A5Z) this;
            Bundle bundle = a5z.A01;
            bundle.putInt(A01(a5z, bundle), i);
        }
    }

    @Override // X.InterfaceC07789is
    public final void AAF(float f) {
        if (!(this instanceof C9sQ)) {
            if (this instanceof C9jK) {
                return;
            }
            if (!(this instanceof A5Z)) {
                A04(Float.valueOf(f));
                return;
            }
            A5Z a5z = (A5Z) this;
            Bundle bundle = a5z.A01;
            bundle.putFloat(A01(a5z, bundle), f);
            return;
        }
        C9sQ c9sQ = (C9sQ) this;
        if (c9sQ.A02) {
            c9sQ.AAU(String.valueOf(f));
        } else {
            c9sQ.A05.A01.Aia(String.valueOf(f));
        }
        if (c9sQ.A04.A04 || Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f);
        String string = c9sQ.A05.A01.toString();
        C7384Etj.A0Y(string, 1);
        throw new JsonEncodingException(C9rA.A01(string, C3cG.A0f(fValueOf, "Unexpected special floating-point value ")));
    }

    @Override // X.InterfaceC07789is
    public final InterfaceC07789is AAH(C9iZ c9iZ) {
        C08029sl c08099ss;
        if (!(this instanceof C9sQ)) {
            return this;
        }
        C9sQ c9sQ = (C9sQ) this;
        C7384Etj.A0Y(c9iZ, 0);
        Set<C9iZ> set = C9oB.A00;
        boolean z = false;
        boolean zIsInline = c9iZ.isInline();
        if (zIsInline && set.contains(c9iZ)) {
            z = true;
        }
        if (z) {
            c08099ss = c9sQ.A05;
            if (!(c08099ss instanceof C08099ss)) {
                c08099ss = new C08099ss(c08099ss.A01, c9sQ.A02);
            }
        } else {
            if (!zIsInline || !c9iZ.equals(C9oY.A00)) {
                if (c9sQ.A00 == null) {
                    return c9sQ;
                }
                c9sQ.A01 = c9iZ.AKP();
                return c9sQ;
            }
            c08099ss = c9sQ.A05;
            if (!(c08099ss instanceof C9t3)) {
                final C9t6 c9t6 = c08099ss.A01;
                final boolean z2 = c9sQ.A02;
                c08099ss = new C08029sl(c9t6, z2) { // from class: X.9t3
                    public final boolean A00;

                    @Override // X.C08029sl
                    public final void A05(String str) {
                        C7384Etj.A0Y(str, 0);
                        if (this.A00) {
                            super.A05(str);
                        } else {
                            this.A01.Aia(str);
                        }
                    }

                    {
                        this.A00 = z2;
                    }
                };
            }
        }
        return new C9sQ(c9sQ.A03, c08099ss, c9sQ.A06, null);
    }

    @Override // X.InterfaceC07789is
    public final void AAJ(int i) {
        if (!(this instanceof C9sQ)) {
            if (this instanceof C08049sn) {
                C08049sn.A03(Long.toString(i & 4294967295L, 10), (C08049sn) this);
                return;
            } else {
                if (this instanceof C9jK) {
                    return;
                }
                if (!(this instanceof A5Z)) {
                    A04(Integer.valueOf(i));
                    return;
                }
                A5Z a5z = (A5Z) this;
                Bundle bundle = a5z.A01;
                bundle.putInt(A01(a5z, bundle), i);
                return;
            }
        }
        C9sQ c9sQ = (C9sQ) this;
        if (c9sQ.A02) {
            c9sQ.AAU(String.valueOf(i));
            return;
        }
        C08029sl c08029sl = c9sQ.A05;
        if (!(c08029sl instanceof C08099ss)) {
            c08029sl.A01.writeLong(i);
            return;
        }
        C08099ss c08099ss = (C08099ss) c08029sl;
        boolean z = c08099ss.A00;
        String string = Long.toString(i & 4294967295L, 10);
        if (z) {
            c08099ss.A05(string);
        } else {
            C7384Etj.A0Y(string, 0);
            c08099ss.A01.Aia(string);
        }
    }

    @Override // X.InterfaceC07789is
    public final void AAM(long j) {
        if (!(this instanceof C9sQ)) {
            if (this instanceof C08049sn) {
                C08049sn.A03(AbstractC08169sz.A00(j), (C08049sn) this);
                return;
            } else {
                if (this instanceof C9jK) {
                    return;
                }
                if (!(this instanceof A5Z)) {
                    A04(Long.valueOf(j));
                    return;
                }
                A5Z a5z = (A5Z) this;
                Bundle bundle = a5z.A01;
                bundle.putLong(A01(a5z, bundle), j);
                return;
            }
        }
        C9sQ c9sQ = (C9sQ) this;
        if (c9sQ.A02) {
            c9sQ.AAU(String.valueOf(j));
            return;
        }
        C08029sl c08029sl = c9sQ.A05;
        if (!(c08029sl instanceof C08099ss)) {
            c08029sl.A01.writeLong(j);
            return;
        }
        C08099ss c08099ss = (C08099ss) c08029sl;
        if (c08099ss.A00) {
            c08099ss.A05(AbstractC08169sz.A00(j));
            return;
        }
        String strA00 = AbstractC08169sz.A00(j);
        C7384Etj.A0Y(strA00, 0);
        c08099ss.A01.Aia(strA00);
    }

    @Override // X.InterfaceC07789is
    public final void AAO() {
        if (this instanceof C9sQ) {
            ((C9sQ) this).A05.A01.Aia(HatchCcvLoggingKt.NO_POSTAL_FIELD);
            return;
        }
        if (this instanceof C9jK) {
            return;
        }
        if (!(this instanceof A5Z)) {
            throw new SerializationException("'null' is not supported by default");
        }
        A5Z a5z = (A5Z) this;
        Bundle bundle = a5z.A01;
        bundle.putString(A01(a5z, bundle), null);
    }

    @Override // X.InterfaceC07789is
    public final void AAS(short s) {
        if (!(this instanceof C9sQ)) {
            if (this instanceof C08049sn) {
                C08049sn.A03(String.valueOf(s & 65535), (C08049sn) this);
                return;
            } else {
                if (this instanceof C9jK) {
                    return;
                }
                if (!(this instanceof A5Z)) {
                    A04(Short.valueOf(s));
                    return;
                }
                A5Z a5z = (A5Z) this;
                Bundle bundle = a5z.A01;
                bundle.putInt(A01(a5z, bundle), s);
                return;
            }
        }
        C9sQ c9sQ = (C9sQ) this;
        if (c9sQ.A02) {
            c9sQ.AAU(String.valueOf((int) s));
            return;
        }
        C08029sl c08029sl = c9sQ.A05;
        if (!(c08029sl instanceof C08099ss)) {
            c08029sl.A01.writeLong(s);
            return;
        }
        C08099ss c08099ss = (C08099ss) c08029sl;
        boolean z = c08099ss.A00;
        String strValueOf = String.valueOf(s & 65535);
        if (z) {
            c08099ss.A05(strValueOf);
        } else {
            c08099ss.A01.Aia(strValueOf);
        }
    }

    @Override // X.InterfaceC07789is
    public void AAU(String str) {
        if (this instanceof C08129sv) {
            C08129sv c08129sv = (C08129sv) this;
            C7384Etj.A0Y(str, 0);
            c08129sv.A02.A07(c08129sv.A00, new JsonLiteral(str, c08129sv.A01, false));
        } else {
            if (this instanceof C9jK) {
                return;
            }
            C7384Etj.A0Y(str, 0);
            A04(str);
        }
    }

    @Override // X.C9j5
    public /* synthetic */ boolean AfR() {
        return !(this instanceof A5Z);
    }

    @Override // X.C9j5
    public final void AA7(C9iZ c9iZ, int i, boolean z) {
        if (A02(c9iZ, this, i)) {
            AA6(z);
        }
    }

    @Override // X.C9j5
    public final void AA9(C9iZ c9iZ, byte b, int i) {
        if (A02(c9iZ, this, i)) {
            AA8(b);
        }
    }

    @Override // X.C9j5
    public final void AAB(C9iZ c9iZ, char c, int i) {
        if (A02(c9iZ, this, i)) {
            AAA(c);
        }
    }

    @Override // X.C9j5
    public final void AAD(C9iZ c9iZ, double d, int i) {
        if (A02(c9iZ, this, i)) {
            AAC(d);
        }
    }

    @Override // X.C9j5
    public final void AAG(C9iZ c9iZ, float f, int i) {
        if (A02(c9iZ, this, i)) {
            AAF(f);
        }
    }

    @Override // X.C9j5
    public final InterfaceC07789is AAI(C9iZ c9iZ, int i) {
        return A02(c9iZ, this, i) ? AAH(c9iZ.AF3(i)) : C9jK.A00;
    }

    @Override // X.C9j5
    public final void AAK(C9iZ c9iZ, int i, int i2) {
        if (A02(c9iZ, this, i)) {
            AAJ(i2);
        }
    }

    @Override // X.C9j5
    public final void AAN(C9iZ c9iZ, int i, long j) {
        if (A02(c9iZ, this, i)) {
            AAM(j);
        }
    }

    @Override // X.C9j5
    public final void AAT(C9iZ c9iZ, int i, short s) {
        if (A02(c9iZ, this, i)) {
            AAS(s);
        }
    }
}
