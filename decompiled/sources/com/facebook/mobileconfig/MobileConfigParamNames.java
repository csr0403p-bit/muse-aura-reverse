package com.facebook.mobileconfig;

/* loaded from: classes6.dex */
public class MobileConfigParamNames {
    public static int NUM_BUCKETS = 8;

    public static int getNumSlotsPerType(int i) {
        if (i == 1) {
            return 431;
        }
        if (i != 2) {
            return i != 3 ? 0 : 86;
        }
        return 3095;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0019 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getParamName(long r7) {
        /*
            r0 = 48
            long r2 = r7 >>> r0
            r0 = 63
            long r2 = r2 & r0
            int r6 = (int) r2
            int r0 = X.AbstractC7608F5v.A07(r7)
            int r5 = getBucketIdx(r6, r0)
            r4 = 4
            r3 = 3
            r2 = 2
            r1 = 1
            java.lang.String r0 = ""
            switch(r5) {
                case 0: goto L1a;
                case 1: goto L25;
                case 2: goto L30;
                case 3: goto L3b;
                case 4: goto L46;
                case 5: goto L51;
                case 6: goto L5c;
                case 7: goto L67;
                default: goto L19;
            }
        L19:
            return r0
        L1a:
            if (r6 == r1) goto L7a
            if (r6 == r2) goto L75
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames0.getStringParamName(r7)
            return r0
        L25:
            if (r6 == r1) goto L84
            if (r6 == r2) goto L7f
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames1.getStringParamName(r7)
            return r0
        L30:
            if (r6 == r1) goto L8e
            if (r6 == r2) goto L89
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames2.getStringParamName(r7)
            return r0
        L3b:
            if (r6 == r1) goto L98
            if (r6 == r2) goto L93
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames3.getStringParamName(r7)
            return r0
        L46:
            if (r6 == r1) goto La2
            if (r6 == r2) goto L9d
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames4.getStringParamName(r7)
            return r0
        L51:
            if (r6 == r1) goto Lac
            if (r6 == r2) goto La7
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames5.getStringParamName(r7)
            return r0
        L5c:
            if (r6 == r1) goto Lb6
            if (r6 == r2) goto Lb1
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames6.getStringParamName(r7)
            return r0
        L67:
            if (r6 == r1) goto Lc0
            if (r6 == r2) goto Lbb
            if (r6 != r3) goto L72
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames7.getStringParamName(r7)
            return r0
        L72:
            if (r6 == r4) goto L19
            return r0
        L75:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames0.getLongParamName(r7)
            return r0
        L7a:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames0.getBooleanParamName(r7)
            return r0
        L7f:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames1.getLongParamName(r7)
            return r0
        L84:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames1.getBooleanParamName(r7)
            return r0
        L89:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames2.getLongParamName(r7)
            return r0
        L8e:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames2.getBooleanParamName(r7)
            return r0
        L93:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames3.getLongParamName(r7)
            return r0
        L98:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames3.getBooleanParamName(r7)
            return r0
        L9d:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames4.getLongParamName(r7)
            return r0
        La2:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames4.getBooleanParamName(r7)
            return r0
        La7:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames5.getLongParamName(r7)
            return r0
        Lac:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames5.getBooleanParamName(r7)
            return r0
        Lb1:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames6.getLongParamName(r7)
            return r0
        Lb6:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames6.getBooleanParamName(r7)
            return r0
        Lbb:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames7.getLongParamName(r7)
            return r0
        Lc0:
            java.lang.String r0 = com.facebook.mobileconfig.MobileConfigParamNames7.getBooleanParamName(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mobileconfig.MobileConfigParamNames.getParamName(long):java.lang.String");
    }

    public static int getBucketIdx(int i, int i2) {
        if (getNumSlotsPerType(i) == 0) {
            return -1;
        }
        return i2 / (((r0 + r1) - 1) / NUM_BUCKETS);
    }
}
