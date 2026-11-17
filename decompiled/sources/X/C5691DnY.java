package X;

import android.util.Pair;

/* renamed from: X.DnY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5691DnY {
    public final double A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Pair<String, String> A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    /* JADX WARN: Incorrect types in method signature: (ZLandroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;DLandroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Landroid/util/Pair<Ljava/lang/Float;Ljava/lang/Float;>;Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;Landroid/util/Pair<Ljava/lang/Integer;Ljava/lang/Integer;>;Landroid/util/Pair<Ljava/lang/Float;Ljava/lang/Float;>;)LX/DnY; */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b A[PHI: r17
  0x009b: PHI (r17v1 float) = (r17v0 float), (r17v3 float) binds: [B:51:0x0098, B:46:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4 A[PHI: r15
  0x00a4: PHI (r15v1 float) = (r15v0 float), (r15v3 float) binds: [B:56:0x00a1, B:18:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C5691DnY A00(android.util.Pair r19, android.util.Pair r20, android.util.Pair r21, android.util.Pair r22, android.util.Pair r23, android.util.Pair r24, java.lang.String r25, double r26, boolean r28) {
        /*
            r1 = -1
            r2 = r20
            if (r20 == 0) goto Laa
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Laa
            int r0 = r0.intValue()
        Lf:
            long r6 = (long) r0
            if (r20 == 0) goto La7
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto La7
            int r0 = r0.intValue()
        L1c:
            long r4 = (long) r0
            r2 = r21
            if (r21 == 0) goto La0
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto La0
            float r15 = r0.floatValue()
        L2b:
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto La4
            float r16 = r0.floatValue()
        L35:
            r11 = 0
            r0 = r22
            if (r22 == 0) goto L3e
            java.lang.Object r11 = r0.first
            java.lang.String r11 = (java.lang.String) r11
        L3e:
            java.lang.String r12 = ""
            if (r11 != 0) goto L43
            r11 = r12
        L43:
            if (r22 == 0) goto L4c
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L4c
            r12 = r0
        L4c:
            r8 = r23
            if (r23 == 0) goto L9e
            java.lang.Object r0 = r8.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L9e
            int r0 = r0.intValue()
        L5a:
            long r2 = (long) r0
            if (r23 == 0) goto L67
            java.lang.Object r0 = r8.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L67
            int r1 = r0.intValue()
        L67:
            long r0 = (long) r1
            r9 = r24
            if (r24 == 0) goto L96
            java.lang.Object r8 = r9.first
            java.lang.Number r8 = (java.lang.Number) r8
            if (r8 == 0) goto L96
            float r17 = r8.floatValue()
        L76:
            java.lang.Object r8 = r9.second
            java.lang.Number r8 = (java.lang.Number) r8
            if (r8 == 0) goto L9b
            float r18 = r8.floatValue()
        L80:
            X.DnY r8 = new X.DnY
            r9 = r19
            r10 = r25
            r13 = r26
            r27 = r28
            r23 = r2
            r25 = r0
            r21 = r4
            r19 = r6
            r8.<init>(r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r21, r23, r25, r27)
            return r8
        L96:
            r17 = 0
            if (r24 == 0) goto L9b
            goto L76
        L9b:
            r18 = 0
            goto L80
        L9e:
            r0 = -1
            goto L5a
        La0:
            r15 = 0
            if (r21 == 0) goto La4
            goto L2b
        La4:
            r16 = 0
            goto L35
        La7:
            r0 = -1
            goto L1c
        Laa:
            r0 = -1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5691DnY.A00(android.util.Pair, android.util.Pair, android.util.Pair, android.util.Pair, android.util.Pair, android.util.Pair, java.lang.String, double, boolean):X.DnY");
    }

    /* JADX WARN: Incorrect types in method signature: (ZLandroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;DJJFFLjava/lang/String;Ljava/lang/String;JJFF)V */
    public C5691DnY(Pair pair, String str, String str2, String str3, double d, float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, boolean z) {
        this.A0D = z;
        this.A09 = pair;
        this.A0C = str;
        this.A00 = d;
        this.A08 = j;
        this.A07 = j2;
        this.A04 = f;
        this.A03 = f2;
        this.A0B = str2;
        this.A0A = str3;
        this.A06 = j3;
        this.A05 = j4;
        this.A02 = f3;
        this.A01 = f4;
    }
}
