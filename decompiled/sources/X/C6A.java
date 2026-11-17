package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class C6A implements InterfaceC3231C4o {
    public final C54 A00;
    public final File A01;

    public static String A00(RandomAccessFile randomAccessFile, int i) throws IOException {
        byte[] bArr = new byte[i];
        randomAccessFile.readFully(bArr, 0, i);
        return new String(bArr);
    }

    public static boolean A01(char c) {
        return c == C68.A02.mSymbol || c == C68.A03.mSymbol || c == C68.A01.mSymbol || c == C68.A06.mSymbol || c == C68.A05.mSymbol || c == C68.A07.mSymbol || c == C68.A04.mSymbol || c == C68.A0A.mSymbol;
    }

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:1000:0x0873 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0750 A[PHI: r4
  0x0750: PHI (r4v3 java.lang.Boolean) = (r4v44 java.lang.Boolean), (r4v48 java.lang.Boolean) binds: [B:478:0x074c, B:480:0x074f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:997:0x0940 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC3231C4o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AY4(X.C3228C4l r14, X.EnumC3223C4g r15) throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6A.AY4(X.C4l, X.C4g):void");
    }

    public C6A(C54 c54, File file) {
        this.A01 = file;
        this.A00 = c54;
    }
}
