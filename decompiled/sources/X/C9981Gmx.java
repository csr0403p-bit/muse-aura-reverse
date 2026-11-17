package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gmx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9981Gmx extends AbstractC9988GnE {
    public int A00;
    public int A01;
    public long A02;
    public Reader A03;
    public boolean A04;
    public char[] A05;
    public boolean A06;
    public final int A07;
    public final Gn3 A08;

    public static final EnumC9834GiY A0T(C9981Gmx c9981Gmx, int i) throws JsonParseException {
        int i2 = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i3 = i2 - 1;
        int i4 = ((AbstractC9980Gmw) c9981Gmx).A04;
        if (i == 48) {
            return c9981Gmx.A0Q(i3, false);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = c9981Gmx.A05[i2];
            if (c < '0') {
                if (c != '.') {
                }
                ((AbstractC9980Gmw) c9981Gmx).A05 = i6;
                return c9981Gmx.A0P(c, i3, i6, i5, false);
            }
            if (c <= '9') {
                i5++;
                i2 = i6;
            }
            if ((c | ' ') != 101) {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i2;
                if (((AbstractC10020Gns) c9981Gmx.A0F).A02 == 0) {
                    c9981Gmx.A0c(c);
                }
                c9981Gmx.A0R.A0C(c9981Gmx.A05, i3, i2 - i3);
                return c9981Gmx.A2O(i5, false);
            }
            ((AbstractC9980Gmw) c9981Gmx).A05 = i6;
            return c9981Gmx.A0P(c, i3, i6, i5, false);
        }
        ((AbstractC9980Gmw) c9981Gmx).A05 = i3;
        return c9981Gmx.A0Q(i3, false);
    }

    public static final EnumC9834GiY A0V(C9981Gmx c9981Gmx, boolean z) throws JsonParseException {
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = i;
        if (z) {
            i2 = i - 1;
        }
        int i3 = ((AbstractC9980Gmw) c9981Gmx).A04;
        if (i < i3) {
            char[] cArr = c9981Gmx.A05;
            int i4 = i + 1;
            char c = cArr[i];
            int i5 = 1;
            if (c > '9' || c < '0') {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i4;
                return c == '.' ? A0U(c9981Gmx, z) : c9981Gmx.A0R(c, z, true);
            }
            if (c != '0') {
                while (i4 < i3) {
                    int i6 = i4 + 1;
                    char c2 = cArr[i4];
                    if (c2 < '0') {
                        if (c2 != '.') {
                        }
                        ((AbstractC9980Gmw) c9981Gmx).A05 = i6;
                        return c9981Gmx.A0P(c2, i2, i6, i5, z);
                    }
                    if (c2 <= '9') {
                        i5++;
                        i4 = i6;
                    }
                    if ((c2 | ' ') != 101) {
                        ((AbstractC9980Gmw) c9981Gmx).A05 = i4;
                        if (((AbstractC10020Gns) c9981Gmx.A0F).A02 == 0) {
                            c9981Gmx.A0c(c2);
                        }
                        c9981Gmx.A0R.A0C(c9981Gmx.A05, i2, i4 - i2);
                        return c9981Gmx.A2O(i5, z);
                    }
                    ((AbstractC9980Gmw) c9981Gmx).A05 = i6;
                    return c9981Gmx.A0P(c2, i2, i6, i5, z);
                }
            }
        }
        return c9981Gmx.A0Q(i2, z);
    }

    public static final void A0h(C9981Gmx c9981Gmx) throws JsonParseException {
        c9981Gmx.A04 = false;
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = ((AbstractC9980Gmw) c9981Gmx).A04;
        char[] cArr = c9981Gmx.A05;
        while (true) {
            if (i >= i2) {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i;
                if (!A0m(c9981Gmx)) {
                    c9981Gmx.A2G(EnumC9834GiY.VALUE_STRING, ": was expecting closing quote for a string value");
                    throw F60.createAndThrow();
                }
                i = ((AbstractC9980Gmw) c9981Gmx).A05;
                i2 = ((AbstractC9980Gmw) c9981Gmx).A04;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    ((AbstractC9980Gmw) c9981Gmx).A05 = i3;
                    c9981Gmx.A2K();
                    i = ((AbstractC9980Gmw) c9981Gmx).A05;
                    i2 = ((AbstractC9980Gmw) c9981Gmx).A04;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        ((AbstractC9980Gmw) c9981Gmx).A05 = i3;
                        return;
                    } else if (c < ' ') {
                        ((AbstractC9980Gmw) c9981Gmx).A05 = i3;
                        c9981Gmx.A2a(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r6 == ':') goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r0 r6
  0x003a: PHI (r0v3 int) = (r0v2 int), (r0v5 int) binds: [B:11:0x002c, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r6v3 char) = (r6v2 char), (r6v5 char) binds: [B:11:0x002c, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A0L(X.C9981Gmx r10) {
        /*
            int r9 = r10.A05
            int r1 = r9 + 4
            int r0 = r10.A04
            r8 = 0
            if (r1 >= r0) goto L48
            char[] r7 = r10.A05
            char r6 = r7[r9]
            r0 = 58
            r5 = 9
            r4 = 35
            r3 = 47
            r2 = 32
            r1 = 1
            if (r6 == r0) goto L26
            if (r6 == r2) goto L1e
            if (r6 != r5) goto L24
        L1e:
            int r9 = r9 + 1
            r10.A05 = r9
            char r6 = r7[r9]
        L24:
            if (r6 != r0) goto L48
        L26:
            int r0 = r9 + 1
            r10.A05 = r0
            char r6 = r7[r0]
            if (r6 > r2) goto L3a
            if (r6 == r2) goto L32
            if (r6 != r5) goto L43
        L32:
            int r0 = r0 + 1
            r10.A05 = r0
            char r6 = r7[r0]
            if (r6 <= r2) goto L43
        L3a:
            if (r6 == r3) goto L43
            if (r6 == r4) goto L43
            int r0 = r0 + 1
            r10.A05 = r0
            return r6
        L43:
            int r6 = r10.A0O(r1)
            return r6
        L48:
            int r6 = r10.A0O(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0L(X.Gmx):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r2 != '\t') goto L50;
     */
    /* JADX WARN: Path cross not found for [B:59:?, B:12:0x002b], limit reached: 82 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004a -> B:14:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004e -> B:14:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A0M(X.C9981Gmx r9) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            int r1 = r9.A05
            int r0 = r9.A04
            if (r1 < r0) goto L11
            boolean r0 = A0m(r9)
            if (r0 != 0) goto L11
        Lc:
            r9.A2A()
            r2 = -1
        L10:
            return r2
        L11:
            char[] r2 = r9.A05
            int r1 = r9.A05
            int r0 = r1 + 1
            r9.A05 = r0
            char r2 = r2[r1]
            r8 = 35
            r7 = 47
            r6 = 32
            if (r2 > r6) goto L51
            r5 = 9
            r4 = 13
            r3 = 10
            if (r2 == r6) goto L30
            if (r2 != r3) goto L48
            X.AbstractC9916Gl7.A07(r9, r0)
        L30:
            int r2 = r9.A05
            int r0 = r9.A04
            if (r2 >= r0) goto L59
            char[] r1 = r9.A05
            int r0 = r2 + 1
            r9.A05 = r0
            char r2 = r1[r2]
            if (r2 > r6) goto L51
            if (r2 == r6) goto L30
            if (r2 != r3) goto L48
            X.AbstractC9916Gl7.A07(r9, r0)
            goto L30
        L48:
            if (r2 != r4) goto L4e
            r9.A0b()
            goto L30
        L4e:
            if (r2 == r5) goto L30
            goto L9b
        L51:
            if (r2 == r7) goto L55
            if (r2 != r8) goto L10
        L55:
            int r0 = r0 + (-1)
            r9.A05 = r0
        L59:
            int r1 = r9.A05
            int r0 = r9.A04
            if (r1 < r0) goto L66
            boolean r0 = A0m(r9)
            if (r0 != 0) goto L66
            goto Lc
        L66:
            char[] r2 = r9.A05
            int r0 = r9.A05
            int r1 = r0 + 1
            r9.A05 = r1
            char r2 = r2[r0]
            if (r2 <= r6) goto L85
            if (r2 != r7) goto L78
            r9.A0Z()
            goto L59
        L78:
            if (r2 != r8) goto L10
            int r1 = r9.A00
            int r0 = X.AbstractC9988GnE.A04
            r1 = r1 & r0
            if (r1 == 0) goto L10
            r9.A0a()
            goto L59
        L85:
            if (r2 == r6) goto L59
            r0 = 10
            if (r2 != r0) goto L8f
            X.AbstractC9916Gl7.A07(r9, r1)
            goto L59
        L8f:
            r0 = 13
            if (r2 != r0) goto L97
            r9.A0b()
            goto L59
        L97:
            r0 = 9
            if (r2 == r0) goto L59
        L9b:
            r9.A2C(r2)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0M(X.Gmx):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (((X.AbstractC9980Gmw) r3).A05 < ((X.AbstractC9980Gmw) r3).A04) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (A0m(r3) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        throw X.AbstractC9916Gl7.A03(r3, X.AbstractC9916Gl7.A06(r3.A0F, "Unexpected end-of-input within/between "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r2 = r3.A05;
        r0 = ((X.AbstractC9980Gmw) r3).A05;
        r1 = r0 + 1;
        ((X.AbstractC9980Gmw) r3).A05 = r1;
        r2 = r2[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r2 <= ' ') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r2 != '/') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        r3.A0Z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r2 != '#') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if ((((X.AbstractC9916Gl7) r3).A00 & X.AbstractC9988GnE.A04) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r3.A0a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r2 >= ' ') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r2 != '\n') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        X.AbstractC9916Gl7.A07(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r2 != '\r') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        r3.A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009b, code lost:
    
        if (r2 == '\t') goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A0N(X.C9981Gmx r3, int r4) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r0 = 44
            if (r4 == r0) goto L14
            java.lang.String r1 = "was expecting comma to separate "
            X.Gnr r0 = r3.A0F
            java.lang.String r0 = X.AbstractC9916Gl7.A06(r0, r1)
            r3.A2D(r4, r0)
        Lf:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L14:
            int r2 = r3.A05
            int r0 = r3.A04
            if (r2 >= r0) goto L32
            char[] r0 = r3.A05
            int r1 = r2 + 1
            r3.A05 = r1
            char r2 = r0[r2]
            r0 = 32
            if (r2 <= r0) goto L82
            r0 = 47
            if (r2 == r0) goto L2e
            r0 = 35
            if (r2 != r0) goto La2
        L2e:
            int r0 = r1 + (-1)
            r3.A05 = r0
        L32:
            int r1 = r3.A05
            int r0 = r3.A04
            if (r1 < r0) goto L4b
            boolean r0 = A0m(r3)
            if (r0 != 0) goto L4b
            java.lang.String r1 = "Unexpected end-of-input within/between "
            X.Gnr r0 = r3.A0F
            java.lang.String r0 = X.AbstractC9916Gl7.A06(r0, r1)
            com.fasterxml.jackson.core.JsonParseException r0 = X.AbstractC9916Gl7.A03(r3, r0)
            throw r0
        L4b:
            char[] r2 = r3.A05
            int r0 = r3.A05
            int r1 = r0 + 1
            r3.A05 = r1
            char r2 = r2[r0]
            r0 = 32
            if (r2 <= r0) goto L70
            r0 = 47
            if (r2 != r0) goto L61
            r3.A0Z()
            goto L32
        L61:
            r0 = 35
            if (r2 != r0) goto La2
            int r1 = r3.A00
            int r0 = X.AbstractC9988GnE.A04
            r1 = r1 & r0
            if (r1 == 0) goto La2
            r3.A0a()
            goto L32
        L70:
            if (r2 >= r0) goto L32
            r0 = 10
            if (r2 != r0) goto L7a
            X.AbstractC9916Gl7.A07(r3, r1)
            goto L32
        L7a:
            r0 = 13
            if (r2 != r0) goto L99
            r3.A0b()
            goto L32
        L82:
            if (r2 >= r0) goto L14
            r0 = 10
            if (r2 != r0) goto L8c
            X.AbstractC9916Gl7.A07(r3, r1)
            goto L14
        L8c:
            r0 = 13
            if (r2 != r0) goto L94
            r3.A0b()
            goto L14
        L94:
            r0 = 9
            if (r2 == r0) goto L14
            goto L9d
        L99:
            r0 = 9
            if (r2 == r0) goto L32
        L9d:
            r3.A2C(r2)
            goto Lf
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0N(X.Gmx, int):int");
    }

    private final int A0O(boolean z) throws JsonParseException {
        while (true) {
            if (super.A05 >= super.A04 && !A0m(this)) {
                A2G(null, AbstractC9916Gl7.A06(this.A0F, " within/between "));
                break;
            }
            char[] cArr = this.A05;
            int i = super.A05;
            int i2 = i + 1;
            super.A05 = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    A0Z();
                } else if (c == '#' && (((AbstractC9916Gl7) this).A00 & AbstractC9988GnE.A04) != 0) {
                    A0a();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        A2D(c, "was expecting a colon to separate field name and value");
                        break;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                AbstractC9916Gl7.A07(this, i2);
            } else if (c == '\r') {
                A0b();
            } else if (c != '\t') {
                A2C(c);
                break;
            }
        }
        throw F60.createAndThrow();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v2 ??, r10v9 ??, r10v1 ??, r10v7 ??, r10v6 ??, r10v5 ??, r10v4 ??, r10v8 ??, r10v3 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final X.EnumC9834GiY A0P(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v2 ??, r10v9 ??, r10v1 ??, r10v7 ??, r10v6 ??, r10v5 ??, r10v4 ??, r10v8 ??, r10v3 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (X.AbstractC7609F5w.A1U(((X.AbstractC9916Gl7) r15).A00, X.EnumC10011Gnj.A01._mappedFeature._mask) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e A[EDGE_INSN: B:43:0x008e->B:19:0x003f BREAK  A[LOOP:0: B:54:0x00b7->B:150:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.EnumC9834GiY A0Q(int r16, boolean r17) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0Q(int, boolean):X.GiY");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.EnumC9834GiY A0R(int r8, boolean r9, boolean r10) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r7 = this;
            r0 = 73
            if (r8 != r0) goto L51
            int r1 = r7.A05
            int r0 = r7.A04
            if (r1 < r0) goto L1c
            boolean r0 = A0m(r7)
            if (r0 != 0) goto L1c
            X.GiY r1 = X.EnumC9834GiY.VALUE_NUMBER_INT
            java.lang.String r0 = " in a Number value"
            r7.A2G(r1, r0)
        L17:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1c:
            char r8 = X.AbstractC9916Gl7.A00(r7)
            r2 = 78
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            java.lang.String r6 = "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            java.lang.String r5 = "Non-standard token '"
            r3 = 3
            if (r8 != r2) goto L45
            if (r9 == 0) goto L42
            java.lang.String r4 = "-INF"
        L2f:
            A0k(r7, r4, r3)
            int r3 = r7.A00
            int r2 = X.AbstractC9988GnE.A0A
            r3 = r3 & r2
            if (r3 == 0) goto L73
            if (r9 != 0) goto L3d
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
        L3d:
            X.GiY r0 = r7.A2P(r4, r0)
            return r0
        L42:
            java.lang.String r4 = "+INF"
            goto L2f
        L45:
            r2 = 110(0x6e, float:1.54E-43)
            if (r8 != r2) goto L51
            if (r9 == 0) goto L4e
            java.lang.String r4 = "-Infinity"
            goto L2f
        L4e:
            java.lang.String r4 = "+Infinity"
            goto L2f
        L51:
            X.Gnj r0 = X.EnumC10011Gnj.A02
            X.Gnk r0 = r0._mappedFeature
            int r1 = r7.A00
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r1, r0)
            if (r0 != 0) goto L6b
            if (r10 == 0) goto L6b
            if (r9 != 0) goto L70
            r8 = 43
            java.lang.String r0 = "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow"
        L67:
            r7.A2J(r0, r8)
            goto L17
        L6b:
            if (r9 != 0) goto L70
            java.lang.String r0 = "expected digit (0-9) for valid numeric value"
            goto L67
        L70:
            java.lang.String r0 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            goto L67
        L73:
            java.lang.String r0 = X.FGI.A0U(r5, r4, r6)
            com.fasterxml.jackson.core.JsonParseException r0 = X.AbstractC9916Gl7.A03(r7, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0R(int, boolean, boolean):X.GiY");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC9834GiY A0S(X.C9981Gmx r7, int r8) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0S(X.Gmx, int):X.GiY");
    }

    public static final EnumC9834GiY A0U(C9981Gmx c9981Gmx, boolean z) throws JsonParseException {
        if (!AbstractC7609F5w.A1U(((AbstractC9916Gl7) c9981Gmx).A00, EnumC10011Gnj.A01._mappedFeature._mask)) {
            A0S(c9981Gmx, 46);
            throw F60.createAndThrow();
        }
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return c9981Gmx.A0P(46, i2, i, 0, z);
    }

    private String A0W(int i, int i2, int i3) throws JsonParseException, StreamConstraintsException {
        Gn2 gn2 = this.A0R;
        gn2.A0C(this.A05, i, super.A05 - i);
        char[] cArrA0G = gn2.A0G();
        int i4 = gn2.A00;
        int length = 0;
        while (true) {
            if (super.A05 >= super.A04 && !A0m(this)) {
                A2G(EnumC9834GiY.FIELD_NAME, " in field name");
                throw F60.createAndThrow();
            }
            char cA00 = AbstractC9916Gl7.A00(this);
            if (cA00 <= '\\') {
                if (cA00 == '\\') {
                    cA00 = A2K();
                } else if (cA00 <= i3) {
                    if (cA00 == i3) {
                        gn2.A00 = i4;
                        char[] cArrA0H = gn2.A0H();
                        int i5 = gn2.A02;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        return this.A08.A01(cArrA0H, i5, gn2.A05(), i2);
                    }
                    if (cA00 < ' ') {
                        A2a(cA00, "name");
                    }
                }
            }
            i2 = (i2 * 33) + cA00;
            int i6 = i4 + 1;
            cArrA0G[i4] = cA00;
            if (i6 >= cArrA0G.length) {
                length += cArrA0G.length;
                ((AbstractC9927GlO) this).A02.A04(length);
                cArrA0G = gn2.A0F();
                i4 = 0;
            } else {
                i4 = i6;
            }
        }
    }

    public static final String A0X(C9981Gmx c9981Gmx) {
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = c9981Gmx.A07;
        int[] iArr = AbstractC9988GnE.A07;
        while (true) {
            if (i >= ((AbstractC9980Gmw) c9981Gmx).A04) {
                break;
            }
            char[] cArr = c9981Gmx.A05;
            char c = cArr[i];
            if (c >= '\u0100' || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i + 1;
                return c9981Gmx.A08.A01(cArr, i, i - i, i2);
            }
        }
        ((AbstractC9980Gmw) c9981Gmx).A05 = i;
        return c9981Gmx.A0W(i, i2, 34);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A0Y(X.C9981Gmx r10, int r11) throws com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0Y(X.Gmx, int):java.lang.String");
    }

    private void A0Z() throws JsonParseException {
        if ((((AbstractC9916Gl7) this).A00 & AbstractC9988GnE.A09) == 0) {
            A2D(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        } else if (super.A05 < super.A04 || A0m(this)) {
            char cA00 = AbstractC9916Gl7.A00(this);
            if (cA00 != '/') {
                if (cA00 == '*') {
                    while (true) {
                        if (super.A05 >= super.A04 && !A0m(this)) {
                            break;
                        }
                        char[] cArr = this.A05;
                        int i = super.A05;
                        int i2 = i + 1;
                        super.A05 = i2;
                        char c = cArr[i];
                        if (c <= '*') {
                            if (c == '*') {
                                if (i2 >= super.A04 && !A0m(this)) {
                                    break;
                                }
                                char[] cArr2 = this.A05;
                                int i3 = super.A05;
                                if (cArr2[i3] == '/') {
                                    super.A05 = i3 + 1;
                                    return;
                                }
                            } else if (c >= ' ') {
                                continue;
                            } else if (c == '\n') {
                                AbstractC9916Gl7.A07(this, i2);
                            } else if (c == '\r') {
                                A0b();
                            } else if (c != '\t') {
                                A2C(c);
                                break;
                            }
                        }
                    }
                } else {
                    A2D(cA00, "was expecting either '*' or '/' for a comment");
                }
            } else {
                A0a();
                return;
            }
        } else {
            A2G(null, " in a comment");
        }
        throw F60.createAndThrow();
    }

    private void A0a() throws JsonParseException {
        while (true) {
            if (super.A05 >= super.A04 && !A0m(this)) {
                return;
            }
            char[] cArr = this.A05;
            int i = super.A05;
            int i2 = i + 1;
            super.A05 = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    AbstractC9916Gl7.A07(this, i2);
                    return;
                } else if (c == '\r') {
                    A0b();
                    return;
                } else if (c != '\t') {
                    A2C(c);
                    throw F60.createAndThrow();
                }
            }
        }
    }

    private final void A0b() {
        if (super.A05 < super.A04 || A0m(this)) {
            char[] cArr = this.A05;
            int i = super.A05;
            if (cArr[i] == '\n') {
                super.A05 = i + 1;
            }
        }
        ((AbstractC9980Gmw) this).A02++;
        ((AbstractC9980Gmw) this).A03 = super.A05;
    }

    private final void A0c(int i) throws JsonParseException {
        int i2 = super.A05 + 1;
        super.A05 = i2;
        if (i != 9) {
            if (i == 10) {
                AbstractC9916Gl7.A07(this, i2);
            } else if (i == 13) {
                super.A05 = i2 - 1;
            } else if (i != 32) {
                A2D(i, "Expected space separating root-level values");
                throw F60.createAndThrow();
            }
        }
    }

    public static final void A0d(C9981Gmx c9981Gmx) {
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = ((AbstractC9980Gmw) c9981Gmx).A04;
        if (i < i2) {
            int[] iArr = AbstractC9988GnE.A07;
            while (true) {
                char[] cArr = c9981Gmx.A05;
                char c = cArr[i];
                if (c >= '\u0100' || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    c9981Gmx.A0R.A0C(cArr, i, i - i);
                    ((AbstractC9980Gmw) c9981Gmx).A05 = i + 1;
                    return;
                }
            }
        }
        Gn2 gn2 = c9981Gmx.A0R;
        char[] cArr2 = c9981Gmx.A05;
        int i3 = i - i;
        gn2.A08 = null;
        gn2.A02 = -1;
        gn2.A01 = 0;
        gn2.A04 = null;
        gn2.A09 = null;
        if (gn2.A06) {
            Gn2.A01(gn2);
        } else if (gn2.A07 == null) {
            gn2.A07 = Gn2.A04(gn2, i3);
        }
        gn2.A03 = 0;
        gn2.A00 = 0;
        gn2.A0B(cArr2, i, i3);
        ((AbstractC9980Gmw) c9981Gmx).A05 = i;
        char[] cArrA0G = gn2.A0G();
        int i4 = gn2.A00;
        int i5 = i4;
        int[] iArr2 = AbstractC9988GnE.A07;
        while (true) {
            if (((AbstractC9980Gmw) c9981Gmx).A05 >= ((AbstractC9980Gmw) c9981Gmx).A04 && !A0m(c9981Gmx)) {
                c9981Gmx.A2G(EnumC9834GiY.VALUE_STRING, ": was expecting closing quote for a string value");
                throw F60.createAndThrow();
            }
            char cA00 = AbstractC9916Gl7.A00(c9981Gmx);
            if (cA00 < '\u0100' && iArr2[cA00] != 0) {
                if (cA00 == '\"') {
                    gn2.A00 = i4;
                    return;
                } else if (cA00 == '\\') {
                    cA00 = c9981Gmx.A2K();
                } else if (cA00 < ' ') {
                    c9981Gmx.A2a(cA00, "string value");
                }
            }
            if (i4 >= cArrA0G.length) {
                cArrA0G = gn2.A0F();
                i5 = 0;
            }
            i4 = i5 + 1;
            cArrA0G[i5] = cA00;
            i5 = i4;
        }
    }

    public static final void A0e(C9981Gmx c9981Gmx) throws JsonParseException {
        char c;
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = i + 4;
        if (i2 < ((AbstractC9980Gmw) c9981Gmx).A04) {
            char[] cArr = c9981Gmx.A05;
            if (cArr[i] == 'a' && cArr[i + 1] == 'l' && cArr[i + 2] == 's' && cArr[i + 3] == 'e' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i2;
                return;
            }
        }
        A0k(c9981Gmx, "false", 1);
    }

    public static final void A0f(C9981Gmx c9981Gmx) throws JsonParseException {
        char c;
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = i + 3;
        if (i2 < ((AbstractC9980Gmw) c9981Gmx).A04) {
            char[] cArr = c9981Gmx.A05;
            if (cArr[i] == 'u' && cArr[i + 1] == 'l' && cArr[i + 2] == 'l' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i2;
                return;
            }
        }
        A0k(c9981Gmx, HatchCcvLoggingKt.NO_POSTAL_FIELD, 1);
    }

    public static final void A0g(C9981Gmx c9981Gmx) throws JsonParseException {
        char c;
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        int i2 = i + 3;
        if (i2 < ((AbstractC9980Gmw) c9981Gmx).A04) {
            char[] cArr = c9981Gmx.A05;
            if (cArr[i] == 'r' && cArr[i + 1] == 'u' && cArr[i + 2] == 'e' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                ((AbstractC9980Gmw) c9981Gmx).A05 = i2;
                return;
            }
        }
        A0k(c9981Gmx, "true", 1);
    }

    public static final void A0i(C9981Gmx c9981Gmx) {
        int i = ((AbstractC9980Gmw) c9981Gmx).A05;
        c9981Gmx.A0D = c9981Gmx.A0B + i;
        c9981Gmx.A0A = ((AbstractC9980Gmw) c9981Gmx).A02;
        c9981Gmx.A09 = i - ((AbstractC9980Gmw) c9981Gmx).A03;
    }

    public static void A0j(C9981Gmx c9981Gmx, int i) throws JsonParseException, StreamConstraintsException {
        EnumC9834GiY enumC9834GiY;
        if (i == 93) {
            A0i(c9981Gmx);
            C10019Gnr c10019Gnr = c9981Gmx.A0F;
            if (((AbstractC10020Gns) c10019Gnr).A02 != 1) {
                c9981Gmx.A2X(i, '}');
                throw F60.createAndThrow();
            }
            c10019Gnr.A04 = null;
            c9981Gmx.A0F = c10019Gnr.A06;
            enumC9834GiY = EnumC9834GiY.END_ARRAY;
            c9981Gmx.A2F(enumC9834GiY);
        }
        if (i == 125) {
            A0i(c9981Gmx);
            C10019Gnr c10019Gnr2 = c9981Gmx.A0F;
            if (((AbstractC10020Gns) c10019Gnr2).A02 != 2) {
                c9981Gmx.A2X(i, ']');
                throw F60.createAndThrow();
            }
            c10019Gnr2.A04 = null;
            c9981Gmx.A0F = c10019Gnr2.A06;
            enumC9834GiY = EnumC9834GiY.END_OBJECT;
            c9981Gmx.A2F(enumC9834GiY);
        }
    }

    public static final boolean A0m(C9981Gmx c9981Gmx) throws IOException {
        Reader reader = c9981Gmx.A03;
        if (reader != null) {
            int i = ((AbstractC9980Gmw) c9981Gmx).A04;
            long j = i;
            long j2 = c9981Gmx.A0B + j;
            c9981Gmx.A0B = j2;
            ((AbstractC9980Gmw) c9981Gmx).A03 -= i;
            ((AbstractC9927GlO) c9981Gmx).A02.A05(j2);
            char[] cArr = c9981Gmx.A05;
            int i2 = reader.read(cArr, 0, cArr.length);
            if (i2 > 0) {
                c9981Gmx.A02 -= j;
                ((AbstractC9980Gmw) c9981Gmx).A05 = 0;
                ((AbstractC9980Gmw) c9981Gmx).A04 = i2;
                return true;
            }
            ((AbstractC9980Gmw) c9981Gmx).A04 = 0;
            ((AbstractC9980Gmw) c9981Gmx).A05 = 0;
            c9981Gmx.A2T();
            if (i2 == 0) {
                throw new IOException(FGI.A0H("Reader returned 0 characters when trying to read ", ((AbstractC9980Gmw) c9981Gmx).A04));
            }
        }
        return false;
    }

    @Override // X.AbstractC9916Gl7
    public final String A27() {
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) this).A00;
        if (enumC9834GiY != EnumC9834GiY.VALUE_STRING) {
            return enumC9834GiY == EnumC9834GiY.FIELD_NAME ? A1a() : super.A29(null);
        }
        if (this.A04) {
            this.A04 = false;
            A0d(this);
        }
        return this.A0R.A07();
    }

    @Override // X.AbstractC9927GlO
    public final String A29(String str) {
        EnumC9834GiY enumC9834GiY = ((AbstractC9927GlO) this).A00;
        if (enumC9834GiY != EnumC9834GiY.VALUE_STRING) {
            return enumC9834GiY == EnumC9834GiY.FIELD_NAME ? A1a() : super.A29(str);
        }
        if (this.A04) {
            this.A04 = false;
            A0d(this);
        }
        return this.A0R.A07();
    }

    public C9981Gmx(AbstractC9794GhC abstractC9794GhC, C9984Gn6 c9984Gn6, Gn3 gn3, Reader reader, int i) {
        super(c9984Gn6, i);
        ((AbstractC9988GnE) this).A00 = abstractC9794GhC;
        this.A03 = reader;
        C9984Gn6.A00(c9984Gn6.A06);
        char[] cArrA03 = c9984Gn6.A0C.A03(0, 0);
        c9984Gn6.A06 = cArrA03;
        this.A05 = cArrA03;
        super.A05 = 0;
        super.A04 = 0;
        this.A08 = gn3;
        this.A07 = gn3.A0A;
        this.A06 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r1 = X.BV4.A0j(r6, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0k(X.C9981Gmx r5, java.lang.String r6, int r7) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            int r2 = r6.length()
            int r4 = r5.A05
            r1 = r4
            int r3 = r4 + r2
            int r0 = r5.A04
            if (r3 < r0) goto L56
        Ld:
            int r0 = r5.A04
            if (r4 < r0) goto L17
            boolean r0 = A0m(r5)
            if (r0 == 0) goto L51
        L17:
            char[] r1 = r5.A05
            int r0 = r5.A05
            char r1 = r1[r0]
            char r0 = r6.charAt(r7)
            if (r1 != r0) goto L51
            int r0 = r5.A05
            int r4 = r0 + 1
            r5.A05 = r4
            int r7 = r7 + 1
            if (r7 < r2) goto Ld
            int r0 = r5.A04
            if (r4 < r0) goto L38
            boolean r0 = A0m(r5)
            if (r0 != 0) goto L38
        L37:
            return
        L38:
            char[] r1 = r5.A05
            int r0 = r5.A05
            char r1 = r1[r0]
            r0 = 48
            if (r1 < r0) goto L37
            r0 = 93
            if (r1 == r0) goto L37
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L37
            char r0 = (char) r1
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            if (r0 == 0) goto L37
        L51:
            java.lang.String r1 = X.BV4.A0j(r6, r7)
            goto L85
        L56:
            char[] r0 = r5.A05
            char r1 = r0[r1]
            char r0 = r6.charAt(r7)
            if (r1 != r0) goto L81
            int r0 = r5.A05
            int r1 = r0 + 1
            r5.A05 = r1
            int r7 = r7 + 1
            if (r7 < r2) goto L56
            char[] r0 = r5.A05
            char r1 = r0[r1]
            r0 = 48
            if (r1 < r0) goto L37
            r0 = 93
            if (r1 == r0) goto L37
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L37
            char r0 = (char) r1
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            if (r0 == 0) goto L37
        L81:
            java.lang.String r1 = X.BV4.A0j(r6, r7)
        L85:
            java.lang.String r0 = r5.A2S()
            r5.A0l(r1, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9981Gmx.A0k(X.Gmx, java.lang.String, int):void");
    }

    private final void A0l(String str, String str2) throws JsonParseException {
        StringBuilder sbA0x = C60O.A0x(str);
        while (true) {
            if (super.A05 >= super.A04 && !A0m(this)) {
                break;
            }
            char c = this.A05[super.A05];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            super.A05++;
            sbA0x.append(c);
            if (sbA0x.length() >= this.A0Q.A08._maxErrorTokenLength) {
                sbA0x.append("...");
                break;
            }
        }
        throw AbstractC9916Gl7.A03(this, String.format("Unrecognized token '%s': was expecting %s", sbA0x, str2));
    }

    @Override // X.AbstractC9980Gmw
    public final void A2U() {
        char[] cArr;
        Gn3 gn3;
        super.A2U();
        Gn3 gn32 = this.A08;
        if ((!gn32.A06) && (gn3 = gn32.A0B) != null && gn32.A05) {
            C10081Gp2 c10081Gp2 = new C10081Gp2(gn32);
            int i = c10081Gp2.A01;
            AtomicReference<C10081Gp2> atomicReference = gn3.A0C;
            C10081Gp2 c10081Gp22 = atomicReference.get();
            if (i != c10081Gp22.A01) {
                if (i > 12000) {
                    c10081Gp2 = new C10081Gp2(new C10161GqW[32], new String[64]);
                }
                Bs8.A00(c10081Gp22, c10081Gp2, atomicReference);
            }
            gn32.A06 = true;
        }
        if (!this.A06 || (cArr = this.A05) == null) {
            return;
        }
        this.A05 = null;
        C9984Gn6 c9984Gn6 = this.A0Q;
        char[] cArr2 = c9984Gn6.A06;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw C60O.A0i("Trying to release buffer smaller than original");
        }
        c9984Gn6.A06 = null;
        c9984Gn6.A0C.A02(cArr, 0);
    }

    public C9981Gmx(AbstractC9794GhC abstractC9794GhC, C9984Gn6 c9984Gn6, Gn3 gn3, char[] cArr, int i, int i2) {
        super(c9984Gn6, i);
        ((AbstractC9988GnE) this).A00 = abstractC9794GhC;
        this.A03 = null;
        this.A05 = cArr;
        super.A05 = 0;
        super.A04 = i2;
        ((AbstractC9980Gmw) this).A03 = 0;
        this.A0B = 0L;
        this.A08 = gn3;
        this.A07 = gn3.A0A;
        this.A06 = true;
    }
}
