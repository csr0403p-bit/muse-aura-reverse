package X;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: X.D9d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4858D9d {
    public boolean A00 = false;
    public byte[] A01;
    public C4860D9f[] A02;
    public final AssetManager A03;
    public final InterfaceC4498CxV A04;
    public final File A05;
    public final String A06;
    public final byte[] A07;
    public final Executor A08;

    public static void A02(final C4858D9d c4858D9d, final Object obj, final int i) {
        c4858D9d.A08.execute(new Runnable() { // from class: X.D9i
            public static final String __redex_internal_original_name = "DeviceProfileWriter$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                C4858D9d c4858D9d2 = this.A01;
                c4858D9d2.A04.AVZ(i, obj);
            }
        });
    }

    public static byte[] A03(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw BV7.A0l("Not enough bytes to read: ", i);
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] A04(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw C3cG.A0Q(FGI.A0I("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ", i, " bytes"));
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw C3cG.A0Q(e.getMessage());
                }
            }
            if (i3 != i) {
                throw C3cG.A0Q(FGI.A0T("Didn't read enough bytes during decompression. expected=", " actual=", i, i3));
            }
            if (inflater.finished()) {
                return bArr;
            }
            throw C3cG.A0Q("Inflater did not finish");
        } finally {
            inflater.end();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c9  */
    /* JADX WARN: Type inference failed for: r1v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v24, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4858D9d A05() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4858D9d.A05():X.D9d");
    }

    public C4858D9d(AssetManager assetManager, InterfaceC4498CxV interfaceC4498CxV, File file, String str, Executor executor) {
        this.A03 = assetManager;
        this.A08 = executor;
        this.A04 = interfaceC4498CxV;
        this.A06 = str;
        this.A05 = file;
        this.A07 = Build.VERSION.SDK_INT >= 31 ? AbstractC4862D9h.A06 : AbstractC4862D9h.A05;
    }

    public static long A00(InputStream inputStream, int i) throws IOException {
        byte[] bArrA03 = A03(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrA03[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    private FileInputStream A01(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.A04.ASX(5, null);
            }
            return null;
        }
    }
}
