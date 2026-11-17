package X;

/* renamed from: X.FjY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8733FjY {
    /* JADX WARN: Removed duplicated region for block: B:53:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(int r1, android.graphics.Paint r2) {
        /*
            r0 = 0
            if (r1 != r0) goto Lf
            android.graphics.BlendMode r1 = android.graphics.BlendMode.CLEAR
        L5:
            android.graphics.BlendMode r0 = r2.getBlendMode()
            if (r0 == r1) goto Le
            r2.setBlendMode(r1)
        Le:
            return
        Lf:
            r0 = 1
            if (r1 != r0) goto L15
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC
            goto L5
        L15:
            r0 = 3
            if (r1 == r0) goto L6f
            r0 = 4
            if (r1 != r0) goto L1e
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OVER
            goto L5
        L1e:
            r0 = 5
            if (r1 != r0) goto L24
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_IN
            goto L5
        L24:
            r0 = 6
            if (r1 != r0) goto L2a
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_IN
            goto L5
        L2a:
            r0 = 7
            if (r1 != r0) goto L30
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OUT
            goto L5
        L30:
            r0 = 8
            if (r1 != r0) goto L37
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OUT
            goto L5
        L37:
            r0 = 9
            if (r1 != r0) goto L3e
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_ATOP
            goto L5
        L3e:
            r0 = 10
            if (r1 != r0) goto L45
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_ATOP
            goto L5
        L45:
            r0 = 11
            if (r1 != r0) goto L4c
            android.graphics.BlendMode r1 = android.graphics.BlendMode.XOR
            goto L5
        L4c:
            r0 = 16
            if (r1 != r0) goto L53
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DARKEN
            goto L5
        L53:
            r0 = 17
            if (r1 != r0) goto L5a
            android.graphics.BlendMode r1 = android.graphics.BlendMode.LIGHTEN
            goto L5
        L5a:
            r0 = 13
            if (r1 != r0) goto L61
            android.graphics.BlendMode r1 = android.graphics.BlendMode.MULTIPLY
            goto L5
        L61:
            r0 = 14
            if (r1 != r0) goto L68
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SCREEN
            goto L5
        L68:
            r0 = 15
            if (r1 != r0) goto L6f
            android.graphics.BlendMode r1 = android.graphics.BlendMode.OVERLAY
            goto L5
        L6f:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OVER
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8733FjY.A01(int, android.graphics.Paint):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.String r1) {
        /*
            if (r1 == 0) goto Ld
            java.lang.String r1 = X.AnonymousClass001.A0u(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1953166733: goto L8c;
                case -1338968417: goto L83;
                case -1322296865: goto L7b;
                case -1091287984: goto L70;
                case -907689876: goto L67;
                case -894289568: goto L5f;
                case -419044657: goto L56;
                case 114148: goto L4e;
                case 118875: goto L45;
                case 94746189: goto L3b;
                case 170546239: goto L32;
                case 582803342: goto L29;
                case 583222030: goto L21;
                case 653829668: goto L18;
                case 1958476244: goto Lf;
                default: goto Ld;
            }
        Ld:
            r1 = 3
        Le:
            return r1
        Lf:
            java.lang.String r0 = "dst_out"
            boolean r0 = r1.equals(r0)
            r1 = 8
            goto L93
        L18:
            java.lang.String r0 = "multiply"
            boolean r0 = r1.equals(r0)
            r1 = 13
            goto L93
        L21:
            java.lang.String r0 = "dst_over"
            boolean r0 = r1.equals(r0)
            r1 = 4
            goto L93
        L29:
            java.lang.String r0 = "dst_atop"
            boolean r0 = r1.equals(r0)
            r1 = 10
            goto L93
        L32:
            java.lang.String r0 = "lighten"
            boolean r0 = r1.equals(r0)
            r1 = 17
            goto L93
        L3b:
            java.lang.String r0 = "clear"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        L45:
            java.lang.String r0 = "xor"
            boolean r0 = r1.equals(r0)
            r1 = 11
            goto L93
        L4e:
            java.lang.String r0 = "src"
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L93
        L56:
            java.lang.String r0 = "src_atop"
            boolean r0 = r1.equals(r0)
            r1 = 9
            goto L93
        L5f:
            java.lang.String r0 = "src_in"
            boolean r0 = r1.equals(r0)
            r1 = 5
            goto L93
        L67:
            java.lang.String r0 = "screen"
            boolean r0 = r1.equals(r0)
            r1 = 14
            goto L93
        L70:
            java.lang.String r0 = "overlay"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            r1 = 15
            return r1
        L7b:
            java.lang.String r0 = "dst_in"
            boolean r0 = r1.equals(r0)
            r1 = 6
            goto L93
        L83:
            java.lang.String r0 = "darken"
            boolean r0 = r1.equals(r0)
            r1 = 16
            goto L93
        L8c:
            java.lang.String r0 = "src_out"
            boolean r0 = r1.equals(r0)
            r1 = 7
        L93:
            if (r0 != 0) goto Le
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8733FjY.A00(java.lang.String):int");
    }
}
