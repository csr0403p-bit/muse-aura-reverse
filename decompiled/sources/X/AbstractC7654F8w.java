package X;

import com.instagram.common.bloks.lexer.ParsingException;
import java.io.IOException;
import java.util.List;

/* renamed from: X.F8w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7654F8w {
    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/F94;LX/F9C;)TT; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.FDW] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.HsM] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.FDW] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.F9z, X.FDW] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static FDW A01(F9C f9c, F94 f94) throws IOException {
        Integer numAXl;
        String strValueOf;
        ?? fdw;
        Object objA00;
        int i;
        F99 f99;
        F99 f992 = null;
        F9C f9c2 = null;
        boolean z = false;
        if (f9c != null) {
            z = true;
            f9c2 = f9c;
            f992 = new F99(null);
        }
        Integer numAXl2 = f94.AXl();
        Integer num = C79.A0C;
        if (numAXl2 != num) {
            f94.Afp();
            throw new IOException("Token parsing error.");
        }
        FDW fdw2 = null;
        while (true) {
            Integer numARK = f94.ARK();
            Integer num2 = C79.A0K;
            if (numARK == num2) {
                if (fdw2 == null) {
                    FFI.A04(new IOException("unknown bloks data type"));
                }
                return fdw2;
            }
            String strAXk = f94.AXk();
            int iA00 = FBK.A00(strAXk);
            boolean zA1P = BV5.A1P(iA00, 32);
            f94.ARK();
            if (zA1P) {
                if (13347 == iA00) {
                    F85 f85 = new F85();
                    if (f94.AXl() != num) {
                        f94.Afp();
                        f85 = null;
                    } else {
                        while (f94.ARK() != num2) {
                            int iA002 = FBK.A00(f94.AXk());
                            f94.ARK();
                            if (iA002 >= 32) {
                                if (35 == iA002) {
                                    f85.A00 = A01(null, f94);
                                } else if (33 == iA002) {
                                    F95 f95AXm = f94.AXm();
                                    numAXl = f94.AXl();
                                    if (numAXl != null) {
                                        int iIntValue = numAXl.intValue();
                                        if (iIntValue == 7) {
                                            strValueOf = String.valueOf(f95AXm.APz());
                                        } else if (iIntValue == 5) {
                                            strValueOf = f95AXm.AgW();
                                            C7384Etj.A0U(strValueOf);
                                        }
                                        f85.A03 = strValueOf;
                                    }
                                } else if (38 == iA002) {
                                    f85.A02 = F93.A01(f94);
                                } else if (43 == iA002) {
                                    f85.A01 = F93.A01(f94);
                                }
                            }
                            f94.Afp();
                        }
                    }
                    FDW fdw3 = f85.A00;
                    if (fdw3 == null) {
                        throw new ParsingException("Shadow component should never be a leaf node");
                    }
                    fdw = new FDW(fdw3, f85);
                    f85.A00 = null;
                }
                f94.Afp();
                fdw2 = fdw;
            } else {
                FFI.A03("No delegate parser found for unminified payload, field name: ", strAXk);
            }
            fdw = new C7681F9z(iA00);
            if (zA1P) {
                F9E f9e = null;
                if (f94.AXl() != num) {
                    f94.Afp();
                    fdw = 0;
                    f94.Afp();
                    fdw2 = fdw;
                } else {
                    if (z) {
                        List<Integer> list = f992.A01;
                        AbstractC7608F5v.A1A(iA00, list);
                        f9e = new F9E(f9c2, new F9F(f992.A00, list));
                        fdw.A01 = f9e;
                    }
                    while (f94.ARK() != num2) {
                        String strAXk2 = f94.AXk();
                        f94.ARK();
                        int iA003 = FBK.A00(strAXk2);
                        F99 f993 = null;
                        switch (f94.AXl().intValue()) {
                            case 0:
                                objA00 = C3cG.A0h();
                                int i2 = 0;
                                while (f94.ARK() != C79.A01) {
                                    if (f94.AXl() == num) {
                                        if (f9e != null) {
                                            f99 = new F99(f9e);
                                            List<Integer> list2 = f99.A01;
                                            AbstractC7608F5v.A1A(iA003, list2);
                                            i = i2 + 1;
                                            AbstractC7608F5v.A1A(i2, list2);
                                        } else {
                                            i = i2;
                                            f99 = null;
                                        }
                                        objA00.add(A00(f99, f94));
                                        i2 = i;
                                    } else {
                                        objA00.add(AbstractC7655F8x.A00(f94));
                                    }
                                }
                                AbstractC7607F5u.A1M(fdw, objA00, iA003);
                                break;
                            case 2:
                                if (f9e != null) {
                                    f993 = new F99(f9e);
                                    AbstractC7608F5v.A1A(iA003, f993.A01);
                                }
                                objA00 = A00(f993, f94);
                                AbstractC7607F5u.A1M(fdw, objA00, iA003);
                                break;
                            case 5:
                                objA00 = f94.AXm().AgW();
                                AbstractC7607F5u.A1M(fdw, objA00, iA003);
                                break;
                            case 6:
                                objA00 = F93.A01(f94);
                                AbstractC7607F5u.A1M(fdw, objA00, iA003);
                                break;
                            case 7:
                                objA00 = f94.AXm().ARX();
                                AbstractC7607F5u.A1M(fdw, objA00, iA003);
                                break;
                            case 8:
                                objA00 = F94.A00(f94);
                                AbstractC7607F5u.A1M(fdw, objA00, iA003);
                                break;
                        }
                        f94.Afp();
                    }
                }
            } else {
                FFI.A01(null, String.format(FGI.A0M("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", strAXk), BV4.A1W()), null);
            }
            fdw.A0M();
            f94.Afp();
            fdw2 = fdw;
        }
        throw FGI.A00("Bloks id only supports long and String types but got: ", HqV.A00(numAXl));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.FDW] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.F9z, X.FDW] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.HsM] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.FDW] */
    public static FDW A00(F99 f99, F94 f94) throws IOException {
        Integer numAXl;
        String strValueOf;
        ?? fdw;
        Object objARX;
        int i;
        F99 f992;
        Integer numAXl2 = f94.AXl();
        Integer num = C79.A0C;
        if (numAXl2 != num) {
            f94.Afp();
            throw new IOException("Token parsing error.");
        }
        FDW fdw2 = null;
        while (true) {
            Integer numARK = f94.ARK();
            Integer num2 = C79.A0K;
            if (numARK == num2) {
                if (fdw2 == null) {
                    FFI.A04(new IOException("unknown bloks data type"));
                }
                return fdw2;
            }
            String strAXk = f94.AXk();
            int iA00 = FBK.A00(strAXk);
            boolean zA1P = BV5.A1P(iA00, 32);
            f94.ARK();
            if (zA1P) {
                if (13347 == iA00) {
                    F85 f85 = new F85();
                    if (f94.AXl() != num) {
                        f94.Afp();
                        f85 = null;
                    } else {
                        while (f94.ARK() != num2) {
                            int iA002 = FBK.A00(f94.AXk());
                            f94.ARK();
                            if (iA002 >= 32) {
                                if (35 == iA002) {
                                    f85.A00 = A01(null, f94);
                                } else if (33 == iA002) {
                                    F95 f95AXm = f94.AXm();
                                    numAXl = f94.AXl();
                                    if (numAXl != null) {
                                        int iIntValue = numAXl.intValue();
                                        if (iIntValue == 7) {
                                            strValueOf = String.valueOf(f95AXm.APz());
                                        } else if (iIntValue == 5) {
                                            strValueOf = f95AXm.AgW();
                                            C7384Etj.A0U(strValueOf);
                                        }
                                        f85.A03 = strValueOf;
                                    }
                                } else if (38 == iA002) {
                                    f85.A02 = F93.A01(f94);
                                } else if (43 == iA002) {
                                    f85.A01 = F93.A01(f94);
                                }
                            }
                            f94.Afp();
                        }
                    }
                    FDW fdw3 = f85.A00;
                    if (fdw3 == null) {
                        throw new ParsingException("Shadow component should never be a leaf node");
                    }
                    fdw = new FDW(fdw3, f85);
                    f85.A00 = null;
                }
                f94.Afp();
                fdw2 = fdw;
            } else {
                FFI.A03("No delegate parser found for unminified payload, field name: ", strAXk);
            }
            fdw = new C7681F9z(iA00);
            if (zA1P) {
                F9F f9f = null;
                if (f94.AXl() != num) {
                    f94.Afp();
                    fdw = 0;
                    f94.Afp();
                    fdw2 = fdw;
                } else {
                    if (f99 != null) {
                        List<Integer> list = f99.A01;
                        AbstractC7608F5v.A1A(iA00, list);
                        f9f = new F9F(f99.A00, list);
                        fdw.A01 = f9f;
                    }
                    while (f94.ARK() != num2) {
                        String strAXk2 = f94.AXk();
                        f94.ARK();
                        int iA003 = FBK.A00(strAXk2);
                        F99 f993 = null;
                        switch (f94.AXl().intValue()) {
                            case 0:
                                objARX = C3cG.A0h();
                                int i2 = 0;
                                while (f94.ARK() != C79.A01) {
                                    if (f94.AXl() == num) {
                                        if (f9f != null) {
                                            f992 = new F99(f9f);
                                            List<Integer> list2 = f992.A01;
                                            AbstractC7608F5v.A1A(iA003, list2);
                                            i = i2 + 1;
                                            AbstractC7608F5v.A1A(i2, list2);
                                        } else {
                                            i = i2;
                                            f992 = null;
                                        }
                                        objARX.add(A00(f992, f94));
                                        i2 = i;
                                    } else {
                                        objARX.add(AbstractC7655F8x.A00(f94));
                                    }
                                }
                                AbstractC7607F5u.A1M(fdw, objARX, iA003);
                                break;
                            case 2:
                                if (f9f != null) {
                                    f993 = new F99(f9f);
                                    AbstractC7608F5v.A1A(iA003, f993.A01);
                                }
                                objARX = A00(f993, f94);
                                AbstractC7607F5u.A1M(fdw, objARX, iA003);
                                break;
                            case 5:
                                objARX = f94.AXm().AgW();
                                AbstractC7607F5u.A1M(fdw, objARX, iA003);
                                break;
                            case 6:
                                objARX = F93.A01(f94);
                                AbstractC7607F5u.A1M(fdw, objARX, iA003);
                                break;
                            case 7:
                                objARX = f94.AXm().ARX();
                                AbstractC7607F5u.A1M(fdw, objARX, iA003);
                                break;
                            case 8:
                                objARX = F94.A00(f94);
                                AbstractC7607F5u.A1M(fdw, objARX, iA003);
                                break;
                        }
                        f94.Afp();
                    }
                }
            } else {
                FFI.A01(null, String.format(FGI.A0M("Unexpectedly attempting to parse\"\n              + \" an unminified payload: ", strAXk), BV4.A1W()), null);
            }
            fdw.A0M();
            f94.Afp();
            fdw2 = fdw;
        }
        throw FGI.A00("Bloks id only supports long and String types but got: ", HqV.A00(numAXl));
    }
}
