package X;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
public final class C61 {
    public final char A00;
    public final char A01;
    public final char A02;
    public final char A03;
    public final char A04;
    public final Context A05;
    public final boolean A06;
    public final boolean A07;
    public final File A08;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C61 A00(android.content.Context r15, X.C54 r16, java.io.File r17) {
        /*
            r14 = 0
            r9 = r17
            if (r17 != 0) goto Lb
            X.C61 r7 = new X.C61
            r7.<init>()
            return r7
        Lb:
            X.C5d r0 = X.C3246C5d.A03
            if (r0 != 0) goto L12
            X.C3246C5d.A00(r16)
        L12:
            java.lang.String r0 = "state.txt"
            java.io.File r0 = X.C3cG.A0O(r9, r0)
            X.C65 r2 = new X.C65
            r2.<init>(r0)
            java.lang.String r0 = "native_state.txt"
            java.io.File r8 = X.C3cG.A0O(r9, r0)
            java.lang.String r0 = "anr_state.txt"
            java.io.File r7 = X.C3cG.A0O(r9, r0)
            char r6 = r2.A02()
            char r5 = X.C69.A00(r8)
            char r4 = X.C69.A00(r7)
            char r13 = r2.A01()
            boolean r3 = X.AbstractC3263C6j.A00(r13)
            X.C5u r0 = X.EnumC3254C5u.JAVA
            boolean r0 = X.AbstractC3263C6j.A01(r0, r6)
            if (r0 != 0) goto L83
            X.C5u r1 = X.EnumC3254C5u.ANR
            boolean r0 = X.AbstractC3263C6j.A01(r1, r6)
            if (r0 != 0) goto L83
            X.C5u r0 = X.EnumC3254C5u.NATIVE
            boolean r0 = X.AbstractC3263C6j.A01(r0, r5)
            if (r0 != 0) goto L83
            boolean r0 = X.AbstractC3263C6j.A01(r1, r4)
            if (r0 != 0) goto L83
            r0 = 102(0x66, float:1.43E-43)
            if (r13 != r0) goto L83
            java.lang.String r1 = r2.A04()
            java.lang.Object r0 = X.C7C.A01
            java.lang.String r0 = X.C3cI.A0Y(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L83
        L70:
            char r10 = r2.A02()
            char r11 = X.C69.A00(r8)
            char r12 = X.C69.A00(r7)
            X.C61 r7 = new X.C61
            r8 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L83:
            r14 = r3
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61.A00(android.content.Context, X.C54, java.io.File):X.C61");
    }

    public final boolean A03() {
        char c = this.A03;
        if (!AbstractC3263C6j.A01(EnumC3254C5u.JAVA, c)) {
            EnumC3254C5u enumC3254C5u = EnumC3254C5u.ANR;
            if (!AbstractC3263C6j.A01(enumC3254C5u, c)) {
                if (!AbstractC3263C6j.A01(EnumC3254C5u.NATIVE, this.A04) && !AbstractC3263C6j.A01(enumC3254C5u, this.A00)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A01() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61.A01():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02() {
        /*
            r3 = this;
            char r0 = r3.A03
            X.C5u r2 = X.EnumC3254C5u.ANR
            boolean r0 = X.AbstractC3263C6j.A01(r2, r0)
            if (r0 == 0) goto L14
            char r1 = r3.A04
            X.C5u r0 = X.EnumC3254C5u.NATIVE
            boolean r0 = X.AbstractC3263C6j.A01(r0, r1)
            if (r0 == 0) goto L1d
        L14:
            char r0 = r3.A00
            boolean r1 = X.AbstractC3263C6j.A01(r2, r0)
            r0 = 0
            if (r1 == 0) goto L1e
        L1d:
            r0 = 1
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61.A02():boolean");
    }

    public C61() {
        this.A07 = false;
        this.A05 = null;
        this.A08 = null;
        this.A03 = (char) 0;
        this.A04 = (char) 0;
        this.A00 = (char) 0;
        this.A01 = (char) 0;
        this.A02 = (char) 0;
        this.A06 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[PHI: r6
  0x006f: PHI (r6v2 char) = (r6v1 char), (r6v0 char), (r6v0 char) binds: [B:34:0x006d, B:29:0x0063, B:27:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61(android.content.Context r3, java.io.File r4, char r5, char r6, char r7, char r8, boolean r9) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.A07 = r0
            r2.A05 = r3
            r2.A08 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A00 = r7
            X.C68 r0 = X.C68.A0D
            char r1 = r0.mSymbol
            if (r6 == r1) goto L66
            X.C68 r0 = X.C68.A09
            char r0 = r0.mSymbol
            if (r6 == r0) goto L66
            X.C68 r0 = X.C68.A0E
            char r0 = r0.mSymbol
            if (r6 != r0) goto L2f
            X.C68 r0 = X.C68.A0A
            char r0 = r0.mSymbol
            if (r5 != r0) goto L2f
        L28:
            r2.A01 = r5
            r2.A02 = r8
            r2.A06 = r9
            return
        L2f:
            X.C68 r0 = X.C68.A02
            char r0 = r0.mSymbol
            if (r5 == r0) goto L5f
            X.C68 r0 = X.C68.A03
            char r0 = r0.mSymbol
            if (r5 == r0) goto L5f
            X.C68 r0 = X.C68.A01
            char r0 = r0.mSymbol
            if (r5 == r0) goto L5f
            X.C68 r0 = X.C68.A06
            char r0 = r0.mSymbol
            if (r5 == r0) goto L5f
            X.C68 r0 = X.C68.A05
            char r0 = r0.mSymbol
            if (r5 == r0) goto L5f
            X.C68 r0 = X.C68.A07
            char r0 = r0.mSymbol
            if (r5 == r0) goto L5f
            X.C68 r0 = X.C68.A04
            char r0 = r0.mSymbol
            if (r5 == r0) goto L5f
            X.C68 r0 = X.C68.A0A
            char r0 = r0.mSymbol
            if (r5 != r0) goto L6f
        L5f:
            X.C68 r0 = X.C68.A08
            char r0 = r0.mSymbol
            if (r6 != r0) goto L6f
            goto L28
        L66:
            r6 = r7
            if (r7 == r1) goto L28
            X.C68 r0 = X.C68.A09
            char r0 = r0.mSymbol
            if (r7 == r0) goto L28
        L6f:
            r5 = r6
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61.<init>(android.content.Context, java.io.File, char, char, char, char, boolean):void");
    }
}
