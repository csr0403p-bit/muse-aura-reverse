package com.facebook.voltron.metadata;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C7384Etj;
import X.C7BY;
import X.CFK;

/* loaded from: classes.dex */
public final class VoltronModuleMetadataHelper {
    public static final int getBase62ClassName(String str) {
        int i;
        int i2 = 0;
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        for (int iA09 = C7BY.A09(str, '.', length - 1) + 1; iA09 < length; iA09++) {
            i2 *= 62;
            char cCharAt = str.charAt(iA09);
            if (cCharAt >= '0') {
                if (cCharAt <= '9') {
                    i = cCharAt - '0';
                } else if (cCharAt >= 'A') {
                    if (cCharAt <= 'Z') {
                        i = cCharAt - '7';
                    } else if (cCharAt >= 'a' && cCharAt <= 'z') {
                        i = cCharAt - '=';
                    }
                }
                i2 += i;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r2 > 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        return r8.substring(0, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getPackageNameForClass(java.lang.String r8) {
        /*
            r7 = 0
            X.C7384Etj.A0Y(r8, r7)
            int r6 = r8.length()
            r1 = 1
            if (r6 != 0) goto L13
            java.lang.String r1 = "Class name is empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L13:
            java.lang.String r0 = "X."
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = "X"
            return r0
        L1e:
            int r0 = r8.codePointAt(r7)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            java.lang.String r5 = ""
            if (r0 == 0) goto L54
            int r4 = r6 - r1
            r3 = 46
            int r2 = X.C7BY.A08(r8, r3, r7)
        L32:
            if (r2 <= 0) goto L47
            if (r2 >= r4) goto L47
            int r1 = r2 + 1
            int r0 = r8.codePointAt(r1)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto L4f
            int r2 = X.C7BY.A08(r8, r3, r1)
            goto L32
        L47:
            int r0 = r6 + (-1)
            int r2 = X.C7BY.A09(r8, r3, r0)
            if (r2 <= 0) goto L54
        L4f:
            java.lang.String r0 = r8.substring(r7, r2)
            return r0
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.voltron.metadata.VoltronModuleMetadataHelper.getPackageNameForClass(java.lang.String):java.lang.String");
    }

    public static final int getModuleRangeIndexForRedexClassName(String str, int[] iArr) {
        return getModuleRangeIndexForRedexClassName(getBase62ClassName(str), iArr, AnonymousClass004.A1b(str, iArr) ? 1 : 0, (iArr.length / 2) - 1);
    }

    public static final String getShortNameForClass(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        int length = str2.length();
        return length != 0 ? str.substring(length + 1) : str;
    }

    public static final int getModuleRangeIndexForRedexClassName(int i, int[] iArr, int i2, int i3) {
        int i4;
        if (i2 > i3) {
            return -1;
        }
        int i5 = (i2 + i3) / 2;
        int i6 = i5 * 2;
        int i7 = i6 + 1;
        int i8 = iArr[i6];
        if (i8 == -1 || (i4 = iArr[i7]) == -1) {
            CFK.A06("VoltronModuleMetadataHelper", "Invalid range in module range index");
            return -1;
        }
        if (i > i4) {
            return getModuleRangeIndexForRedexClassName(i, iArr, i5 + 1, i3);
        }
        return i < i8 ? getModuleRangeIndexForRedexClassName(i, iArr, i2, i5 - 1) : i5;
    }
}
