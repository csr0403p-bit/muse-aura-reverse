package X;

import android.os.Build;

/* loaded from: classes6.dex */
public final class Hie {
    public static final Hie A00 = new Hie();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable A01(X.FBB r13, X.FDW r14, X.FDW r15) throws com.instagram.common.bloks.lexer.ParsingException {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hie.A01(X.FBB, X.FDW, X.FDW):android.graphics.drawable.Drawable");
    }

    public static float[] A00(FDW fdw, float f) {
        float[] fArr = new float[8];
        Hnb.A01(fArr, f, Hnb.A00(fdw.A0H(56), 15));
        return fArr;
    }

    public final boolean A02(FDW fdw) {
        int i = fdw.A05;
        if (!AnonymousClass801.A0g(i) || i == 13318 || i == 13322 || i == 13330 || i == 13332 || i == 13340 || i == 15775 || i == 16526 || i == 24727) {
            return false;
        }
        if (i == 25546) {
            return BV5.A1P(Build.VERSION.SDK_INT, 33);
        }
        throw AnonymousClass005.A0c(i);
    }
}
