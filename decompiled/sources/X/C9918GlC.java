package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GlC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9918GlC {
    public final AbstractC9870GjI A00;
    public final C10122Gpn[] A01;
    public final C9913Gl1[] A02;
    public final String[] A03;
    public final Map<String, Object> A04;

    public final void A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, String str) throws MismatchedInputException, JsonGenerationException {
        Object obj2 = this.A04.get(str);
        if (obj2 != null) {
            String strA1c = abstractC9916Gl7.A1c();
            if (obj2 instanceof List) {
                Iterator itA13 = AbstractC7607F5u.A13(obj2);
                while (itA13.hasNext()) {
                    int iA03 = C60Q.A03(itA13);
                    if (str.equals(this.A01[iA03].A03)) {
                        if (obj != null) {
                            C9913Gl1[] c9913Gl1Arr = this.A02;
                            if (c9913Gl1Arr[iA03] != null) {
                                A00(abstractC9916Gl7, abstractC9904Gkk, obj, strA1c, iA03);
                                c9913Gl1Arr[iA03] = null;
                            }
                        }
                        this.A03[iA03] = strA1c;
                    }
                }
                return;
            }
            int iA0F = AnonymousClass001.A0F(obj2);
            if (str.equals(this.A01[iA0F].A03)) {
                if (obj != null) {
                    C9913Gl1[] c9913Gl1Arr2 = this.A02;
                    if (c9913Gl1Arr2[iA0F] != null) {
                        A00(abstractC9916Gl7, abstractC9904Gkk, obj, strA1c, iA0F);
                        c9913Gl1Arr2[iA0F] = null;
                        return;
                    }
                }
                this.A03[iA0F] = strA1c;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Gl1[]] */
    public final boolean A03(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, String str) throws MismatchedInputException, JsonGenerationException {
        String[] strArr;
        C9913Gl1[] c9913Gl1Arr;
        String str2;
        Object obj2 = this.A04.get(str);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof List) {
            Iterator itA13 = AbstractC7607F5u.A13(obj2);
            Number number = (Number) itA13.next();
            C10122Gpn[] c10122GpnArr = this.A01;
            int iIntValue = number.intValue();
            if (str.equals(c10122GpnArr[iIntValue].A03)) {
                String strA1c = abstractC9916Gl7.A1c();
                abstractC9916Gl7.A1j();
                String[] strArr2 = this.A03;
                strArr2[iIntValue] = strA1c;
                while (itA13.hasNext()) {
                    strArr2[C60Q.A03(itA13)] = strA1c;
                }
                return true;
            }
            C9913Gl1 c9913Gl1 = new C9913Gl1(abstractC9916Gl7);
            c9913Gl1.A13(abstractC9916Gl7);
            C9913Gl1[] c9913Gl1Arr2 = this.A02;
            c9913Gl1Arr2[iIntValue] = c9913Gl1;
            while (itA13.hasNext()) {
                c9913Gl1Arr2[C60Q.A03(itA13)] = c9913Gl1;
            }
            return true;
        }
        int iA0F = AnonymousClass001.A0F(obj2);
        if (str.equals(this.A01[iA0F].A03)) {
            String[] strArr3 = this.A03;
            strArr3[iA0F] = abstractC9916Gl7.A27();
            abstractC9916Gl7.A1j();
            if (obj == null) {
                return true;
            }
            ?? r1 = this.A02;
            str2 = r1[iA0F];
            c9913Gl1Arr = r1;
            strArr = strArr3;
        } else {
            C9913Gl1 c9913Gl12 = new C9913Gl1(abstractC9916Gl7);
            c9913Gl12.A13(abstractC9916Gl7);
            C9913Gl1[] c9913Gl1Arr3 = this.A02;
            c9913Gl1Arr3[iA0F] = c9913Gl12;
            if (obj == null) {
                return true;
            }
            String[] strArr4 = this.A03;
            str2 = strArr4[iA0F];
            c9913Gl1Arr = c9913Gl1Arr3;
            strArr = strArr4;
        }
        if (str2 == null) {
            return true;
        }
        String str3 = strArr[iA0F];
        strArr[iA0F] = null;
        A00(abstractC9916Gl7, abstractC9904Gkk, obj, str3, iA0F);
        c9913Gl1Arr[iA0F] = null;
        return true;
    }

    private final void A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, String str, int i) throws MismatchedInputException, JsonGenerationException {
        Class<?> cls = abstractC9904Gkk._view;
        if (cls == null || this.A01[i].A01.A0R(cls)) {
            if (str == null) {
                throw MismatchedInputException.A00(abstractC9904Gkk.A00, this.A00, "Internal error in external Type Id handling: `null` type id passed");
            }
            C9926GlN c9926GlNA10 = this.A02[i].A10(abstractC9916Gl7);
            if (c9926GlNA10.A1P() == EnumC9834GiY.VALUE_NULL) {
                this.A01[i].A01.A0L(obj, null);
                return;
            }
            C9913Gl1 c9913Gl1 = new C9913Gl1(abstractC9916Gl7);
            c9913Gl1.A0S();
            c9913Gl1.A0s(str);
            c9913Gl1.A13(c9926GlNA10);
            c9913Gl1.A0P();
            C9926GlN c9926GlNA102 = c9913Gl1.A10(abstractC9916Gl7);
            c9926GlNA102.A1P();
            this.A01[i].A01.A0K(obj, c9926GlNA102, abstractC9904Gkk);
        }
    }

    public final void A02(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException, JsonGenerationException {
        AbstractC9870GjI abstractC9870GjI;
        String str;
        Object[] objArr;
        String str2;
        Class<?> cls = abstractC9904Gkk._view;
        C10122Gpn[] c10122GpnArr = this.A01;
        int length = c10122GpnArr.length;
        for (int i = 0; i < length; i++) {
            C10122Gpn c10122Gpn = c10122GpnArr[i];
            if (cls == null || c10122Gpn.A01.A0R(cls)) {
                String strANR = this.A03[i];
                C9913Gl1 c9913Gl1 = this.A02[i];
                if (strANR == null) {
                    if (c9913Gl1 != null) {
                        if (C9997GnR.A04[((int) c9913Gl1.A04.A00) & 15]._isScalar) {
                            C9926GlN c9926GlNA10 = c9913Gl1.A10(abstractC9916Gl7);
                            c9926GlNA10.A1P();
                            AbstractC9915Gl5 abstractC9915Gl5 = c10122Gpn.A01;
                            Object objA02 = AbstractC9986Gn8.A02(c9926GlNA10, abstractC9915Gl5._type);
                            if (objA02 != null) {
                                abstractC9915Gl5.A0L(obj, objA02);
                            }
                        }
                        AbstractC9852Giw abstractC9852Giw = (AbstractC9852Giw) c10122Gpn.A02;
                        AbstractC9870GjI abstractC9870GjI2 = abstractC9852Giw._defaultImpl;
                        if (abstractC9870GjI2 != null) {
                            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                            Class<?> cls2 = abstractC9870GjI2._class;
                            if (cls2 == null || (strANR = abstractC9852Giw._idResolver.ANR(cls2, null)) == null) {
                                abstractC9870GjI = this.A00;
                                str = c10122Gpn.A01._propName._simpleName;
                                objArr = new Object[]{c10122Gpn.A03};
                                str2 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver";
                            }
                        } else {
                            abstractC9870GjI = this.A00;
                            str = c10122Gpn.A01._propName._simpleName;
                            objArr = new Object[]{c10122Gpn.A03};
                            str2 = "Missing external type id property '%s' (and no 'defaultImpl' specified)";
                        }
                        Class<?> cls3 = abstractC9870GjI._class;
                        MismatchedInputException mismatchedInputExceptionA04 = AbstractC9849Git.A04(abstractC9904Gkk, cls3, str2, objArr);
                        if (str == null) {
                            throw mismatchedInputExceptionA04;
                        }
                        mismatchedInputExceptionA04.A06(cls3, str);
                        throw mismatchedInputExceptionA04;
                    }
                    continue;
                } else if (c9913Gl1 == null) {
                    AbstractC9915Gl5 abstractC9915Gl52 = c10122Gpn.A01;
                    Boolean bool = abstractC9915Gl52._metadata._required;
                    if (bool == null || !bool.booleanValue()) {
                        if (!AbstractC7609F5w.A1U(EnumC9965Gmd.A09._mask, abstractC9904Gkk._featureFlags)) {
                            return;
                        }
                    }
                    Class<?> cls4 = obj.getClass();
                    String str3 = abstractC9915Gl52._propName._simpleName;
                    MismatchedInputException mismatchedInputExceptionA042 = AbstractC9849Git.A04(abstractC9904Gkk, cls4, "Missing property '%s' for external type id '%s'", new Object[]{str3, c10122Gpn.A03});
                    if (str3 == null) {
                        throw mismatchedInputExceptionA042;
                    }
                    mismatchedInputExceptionA042.A06(cls4, str3);
                    throw mismatchedInputExceptionA042;
                }
                A00(abstractC9916Gl7, abstractC9904Gkk, obj, strANR, i);
            }
        }
    }

    public C9918GlC(C9918GlC c9918GlC) {
        this.A00 = c9918GlC.A00;
        C10122Gpn[] c10122GpnArr = c9918GlC.A01;
        this.A01 = c10122GpnArr;
        this.A04 = c9918GlC.A04;
        int length = c10122GpnArr.length;
        this.A03 = new String[length];
        this.A02 = new C9913Gl1[length];
    }

    public C9918GlC(AbstractC9870GjI abstractC9870GjI, Map map, C10122Gpn[] c10122GpnArr) {
        this.A00 = abstractC9870GjI;
        this.A01 = c10122GpnArr;
        this.A04 = map;
        this.A03 = null;
        this.A02 = null;
    }
}
