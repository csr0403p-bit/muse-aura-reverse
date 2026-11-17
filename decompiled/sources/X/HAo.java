package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class HAo extends HAp {
    public static int A00(int i) {
        if (i < 48) {
            return -1;
        }
        if (i <= 57) {
            return i - 48;
        }
        if (i < 65) {
            return -1;
        }
        if (i <= 70) {
            return i - 55;
        }
        if (i < 97) {
            return -1;
        }
        int i2 = i - 87;
        if (i > 102) {
            return -1;
        }
        return i2;
    }

    private List<C10466Hjw> A01() {
        List<HAl> list;
        List<HAy> list2;
        if (!AnonymousClass002.A1Q(this.A01, this.A00)) {
            int i = this.A01;
            if (A0G('(')) {
                A0E();
                ArrayList arrayListA02 = A02(this);
                if (arrayListA02 == null || !A0G(')')) {
                    this.A01 = i;
                    return null;
                }
                Iterator it = arrayListA02.iterator();
                while (it.hasNext() && (list = ((C10466Hjw) it.next()).A01) != null) {
                    Iterator<HAl> it2 = list.iterator();
                    while (it2.hasNext() && (list2 = it2.next().A03) != null) {
                        Iterator<HAy> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() instanceof HAr) {
                            }
                        }
                    }
                }
                return arrayListA02;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x03f3, code lost:
    
        throw new com.caverock.androidsvg.CSSParseException("Invalid attribute simpleSelectors");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0406, code lost:
    
        r30.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0415, code lost:
    
        throw new com.caverock.androidsvg.CSSParseException(X.FGI.A0M("Invalid or missing parameter section for pseudo class: ", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0189, code lost:
    
        r30.A01 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e3 A[PHI: r20
  0x02e3: PHI (r20v1 int) = (r20v0 int), (r20v2 int) binds: [B:154:0x02d9, B:157:0x02e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Type inference failed for: r1v91, types: [java.util.AbstractCollection, java.util.ArrayList, java.util.List<X.Hjw>] */
    /* JADX WARN: Type inference failed for: r2v15, types: [X.HAs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [X.HAs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [X.HAq] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [X.HAr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [X.HAw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A02(X.HAo r30) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HAo.A02(X.HAo):java.util.ArrayList");
    }

    public final String A0I() {
        char cCharAt;
        if (AnonymousClass002.A1Q(this.A01, this.A00) || !((cCharAt = this.A03.charAt(this.A01)) == '\'' || cCharAt == '\"')) {
            return null;
        }
        StringBuilder sbA0w = C60O.A0w();
        this.A01++;
        loop0: while (true) {
            int iIntValue = A0B().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = A0B().intValue();
                    if (iIntValue == -1) {
                        break loop0;
                    }
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        break;
                    }
                    int iA00 = A00(iIntValue);
                    if (iA00 != -1) {
                        int i = 1;
                        do {
                            iIntValue = A0B().intValue();
                            int iA002 = A00(iIntValue);
                            if (iA002 != -1) {
                                iA00 = (iA00 * 16) + iA002;
                                i++;
                            }
                            sbA0w.append((char) iA00);
                        } while (i <= 5);
                        sbA0w.append((char) iA00);
                    }
                }
                sbA0w.append((char) iIntValue);
            }
            break loop0;
        }
        return sbA0w.toString();
    }

    public final String A0J() {
        boolean zA1Q = AnonymousClass002.A1Q(this.A01, this.A00);
        int i = this.A01;
        int i2 = i;
        if (!zA1Q) {
            int iCharAt = this.A03.charAt(i);
            if (iCharAt == 45) {
                iCharAt = A08();
            }
            if (iCharAt >= 65 && (iCharAt <= 90 || (iCharAt < 97 ? iCharAt == 95 : iCharAt <= 122))) {
                while (true) {
                    int iA08 = A08();
                    if (iA08 >= 65) {
                        if (iA08 > 90) {
                            if (iA08 < 97) {
                                if (iA08 != 95) {
                                    break;
                                }
                            } else if (iA08 > 122) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (iA08 >= 48) {
                        if (iA08 > 57) {
                            break;
                        }
                    } else if (iA08 != 45) {
                        break;
                    }
                }
                i2 = this.A01;
            }
            this.A01 = i;
        }
        if (i2 == i) {
            return null;
        }
        String strSubstring = this.A03.substring(i, i2);
        this.A01 = i2;
        return strSubstring;
    }
}
