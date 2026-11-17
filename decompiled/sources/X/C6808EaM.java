package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.ArrayList;

/* renamed from: X.EaM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6808EaM {
    public static final C6808EaM A00 = new C6808EaM();
    public static volatile InterfaceC6814EaS A01 = new InterfaceC6814EaS() { // from class: X.EaQ
        @Override // X.InterfaceC6814EaS
        public final void Ab2() {
        }
    };

    public static final Object A00(C6808EaM c6808EaM, C6807EaL c6807EaL) throws Exception {
        HyR c5216DdS;
        Object objValueOf;
        int i;
        long j;
        Object objValueOf2;
        int iIntValue = c6807EaL.A07().intValue();
        int i2 = 0;
        if (iIntValue != 0) {
            if (iIntValue == 2) {
                return c6807EaL.A08();
            }
            if (iIntValue != 3) {
                if (iIntValue == 4) {
                    return Boolean.valueOf(c6807EaL.A0A());
                }
                if (iIntValue == 5) {
                    c6807EaL.A07();
                    Integer num = c6807EaL.A07;
                    if (num != C79.A0T) {
                        throw BV5.A0U("Expected null but was ", AbstractC6810EaO.A00(num));
                    }
                    c6807EaL.A03++;
                    C6807EaL.A04(c6807EaL);
                }
                return null;
            }
            c6807EaL.A07();
            Integer num2 = c6807EaL.A07;
            if (num2 != C79.A0C && num2 != C79.A0K) {
                throw BV5.A0U("Expected a number but was ", AbstractC6810EaO.A00(num2));
            }
            int length = c6807EaL.A08.length();
            while (true) {
                String str = c6807EaL.A08;
                if (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '.' || cCharAt == 'e' || cCharAt == 'E') {
                        break;
                    }
                    i2++;
                } else {
                    try {
                        long j2 = Long.parseLong(str);
                        objValueOf2 = (j2 < AuraImpressionTimeTracker.UNKNOWN_TIME || j2 > 2147483647L) ? Long.valueOf(j2) : Integer.valueOf((int) j2);
                    } catch (NumberFormatException unused) {
                        objValueOf2 = Double.valueOf(Double.parseDouble(str));
                    }
                }
            }
            objValueOf2 = Double.valueOf(Double.parseDouble(c6807EaL.A08));
            c6807EaL.A03++;
            C6807EaL.A04(c6807EaL);
            return objValueOf2;
        }
        Integer num3 = C79.A00;
        c6807EaL.A07();
        if (c6807EaL.A07 != num3) {
            throw C3cG.A0Q(FGI.A0d("Expected ", "BEGIN_LIST", " but was ", AbstractC6810EaO.A00(c6807EaL.A07())));
        }
        C6807EaL.A04(c6807EaL);
        try {
            String strA08 = c6807EaL.A08();
            C7384Etj.A0X(strA08);
            if (strA08.startsWith("#")) {
                c5216DdS = new HyS(strA08.substring(1));
            } else {
                if (strA08.equals(HatchCcvLoggingKt.NO_POSTAL_FIELD) || C7BY.A0q(strA08, ".", false)) {
                    A01.Ab2();
                    if (AbstractC6813EaR.A00 != null) {
                        throw new Exception("Minification mapper UL Static plugin failed to load for app. Please reach out in Bloks Q&A to help resolve this.");
                    }
                    throw C60O.A0i("Lispy minification map not loaded, critical error");
                }
                c5216DdS = new C5216DdS(Integer.parseInt(strA08, 36));
            }
            int i3 = c6807EaL.A03;
            ArrayList arrayListA0h = C3cG.A0h();
            if (c5216DdS instanceof C5216DdS) {
                int i4 = ((C5216DdS) c5216DdS).A00;
                if (i4 == 17809) {
                    objValueOf = Boolean.valueOf(c6807EaL.A0A());
                } else if (i4 == 18327 || i4 == 18338) {
                    c6807EaL.A07();
                    Integer num4 = c6807EaL.A07;
                    if (num4 != C79.A0C && num4 != C79.A0K) {
                        throw BV5.A0U("Expected a double but was ", AbstractC6810EaO.A00(num4));
                    }
                    c6807EaL.A03++;
                    double d = Double.parseDouble(c6807EaL.A08);
                    C6807EaL.A04(c6807EaL);
                    objValueOf = AbstractC10477Hkr.A02(d);
                } else if (i4 == 19222) {
                    c6807EaL.A07();
                    Integer num5 = c6807EaL.A07;
                    if (num5 != C79.A0C && num5 != C79.A0K) {
                        throw BV5.A0U("Expected an int but was ", AbstractC6810EaO.A00(num5));
                    }
                    try {
                        i = Integer.parseInt(c6807EaL.A08);
                    } catch (NumberFormatException unused2) {
                        String str2 = c6807EaL.A08;
                        double d2 = Double.parseDouble(str2);
                        i = (int) d2;
                        if (i != d2) {
                            throw BV6.A0k(str2);
                        }
                    }
                    c6807EaL.A03++;
                    C6807EaL.A04(c6807EaL);
                    objValueOf = Integer.valueOf(i);
                } else if (i4 == 19237) {
                    c6807EaL.A07();
                    Integer num6 = c6807EaL.A07;
                    if (num6 != C79.A0C && num6 != C79.A0K) {
                        throw BV5.A0U("Expected a long but was ", AbstractC6810EaO.A00(num6));
                    }
                    try {
                        j = Long.parseLong(c6807EaL.A08);
                    } catch (NumberFormatException unused3) {
                        String str3 = c6807EaL.A08;
                        double d3 = Double.parseDouble(str3);
                        j = (long) d3;
                        if (j != d3) {
                            throw BV6.A0k(str3);
                        }
                    }
                    c6807EaL.A03++;
                    C6807EaL.A04(c6807EaL);
                    objValueOf = Long.valueOf(j);
                }
                return objValueOf;
            }
            while (true) {
                c6807EaL.A07();
                if (!AnonymousClass006.A1Z(c6807EaL.A07, C79.A01)) {
                    return new Hq6(c5216DdS, arrayListA0h, i3);
                }
                arrayListA0h.add(A00(c6808EaM, c6807EaL));
            }
        } finally {
            c6807EaL.A09();
        }
    }
}
