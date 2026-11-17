package X;

import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.73g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC060773g {
    public static final void A01(BFM bfm, C72S c72s, C76B c76b, final C71K c71k, final String str, int i, final int i2, final int i3) {
        C72S c72s2 = c72s;
        int i4 = i;
        C76B c76b2 = c76b;
        bfm.AgG(491792371);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c71k, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            iA05 |= 384;
        } else if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c76b2);
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            iA05 |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, i4);
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, c72s, 32768, i2) ? 1 : 0);
        }
        if ((iA05 & 9363) == 9362 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i5 != 0) {
                c76b2 = C76B.A00;
            }
            if (i6 != 0) {
                i4 = 1;
            }
            if (i7 != 0) {
                c72s2 = null;
            }
            A00(bfm, c72s2, c76b2, c71k, null, str, i4, AnonymousClass001.A0B(iA05, AnonymousClass003.A06(iA05, (iA05 & 14) | 196608)), 0);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final C72S c72s3 = c72s2;
            final C76B c76b3 = c76b2;
            final int i8 = i4;
            bBbAAc.A06 = new G0V() { // from class: X.72o
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    C71K c71k2 = c71k;
                    String str2 = str;
                    C76B c76b4 = c76b3;
                    int i9 = i8;
                    C72S c72s4 = c72s3;
                    int i10 = i2;
                    AbstractC060773g.A01((BFM) obj, c72s4, c76b4, c71k2, str2, i9, AnonymousClass011.A00(i10), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void A00(BFM bfm, C72S c72s, C76B c76b, final C71K c71k, Float f, final String str, int i, final int i2, final int i3) {
        BBI bbi;
        boolean z;
        C76B c76bAgp;
        final C72S c72s2 = c72s;
        final C76B c76b2 = c76b;
        final Float f2 = f;
        final int i4 = i;
        bfm.AgG(2075067909);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c71k, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            iA05 |= 384;
        } else if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c76b2);
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            iA05 |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, i4);
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, c72s2, 32768, i2) ? 1 : 0);
        }
        int i8 = i3 & 32;
        int iA0i = 196608;
        if (i8 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, f2);
            iA05 |= iA0i;
        }
        if ((74899 & iA05) == 74898 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i5 != 0) {
                c76b2 = C76B.A00;
            }
            if (i6 != 0) {
                i4 = 1;
            }
            if (i7 != 0) {
                c72s2 = null;
            }
            if (i8 != 0) {
                f2 = null;
            }
            if (str != null) {
                bfm.AgF(884096034);
                bfm.AgF(5004770);
                boolean zA1I = AnonymousClass004.A1I(iA05);
                Object objAaT = bfm.AaT();
                if (zA1I || objAaT == C78N.A00) {
                    objAaT = new C8iK(str, 0);
                    bfm.Ai0(objAaT);
                }
                bbi = (BBI) bfm;
                z = false;
                BBI.A0R(bbi, false);
                C060973i c060973i = new C060973i();
                ((G0U) objAaT).invoke(c060973i);
                c76bAgp = c76b2.Agp(new C75W(c060973i));
                BBI.A0R(bbi, false);
            } else {
                bfm.AgF(884190429);
                bbi = (BBI) bfm;
                z = false;
                BBI.A0R(bbi, false);
                c76bAgp = c76b2;
            }
            bfm.AgF(1849434622);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = C060173a.A00;
                bfm.Ai0(objAaT2);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT2;
            BBI.A0R(bbi, z);
            C60R.A10(bfm);
            if (!(bbi.A0V instanceof C73Q)) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            C60R.A12(bfm, bbi, interfaceC7353EnQ);
            C8i0.A00(bfm, c71k, 1);
            C8i0.A00(bfm, c76bAgp, 2);
            C8i0.A00(bfm, new C061073j(i4), 3);
            C8i0.A00(bfm, c72s2, 4);
            C8i0.A00(bfm, f2, 5);
            AnonymousClass002.A10(bbi, true, z);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.73h
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    C71K c71k2 = c71k;
                    String str2 = str;
                    C76B c76b3 = c76b2;
                    int i9 = i4;
                    C72S c72s3 = c72s2;
                    Float f3 = f2;
                    int i10 = i2;
                    AbstractC060773g.A00((BFM) obj, c72s3, c76b3, c71k2, f3, str2, i9, AnonymousClass011.A00(i10), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean A02(C061173k c061173k) {
        String str;
        C75W c75w = (C75W) c061173k.A02.foldIn(null, new G0V<C75W, InterfaceC060673f, C75W>() { // from class: X.73l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.G0V
            public final /* bridge */ /* synthetic */ C75W invoke(C75W c75w2, InterfaceC060673f interfaceC060673f) {
                return interfaceC060673f instanceof C75W ? interfaceC060673f : c75w2;
            }
        });
        if (c75w != null) {
            Object obj = c75w.A00.A00.get(AbstractC061473n.A00);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
                return false;
            }
        }
        return true;
    }
}
