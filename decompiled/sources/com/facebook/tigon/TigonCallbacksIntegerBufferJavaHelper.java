package com.facebook.tigon;

import X.AbstractC3613CXs;
import X.C3614CXy;
import X.C3615CXz;
import X.C7384Etj;
import X.CY0;
import X.CYF;
import X.FGI;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class TigonCallbacksIntegerBufferJavaHelper {
    public static void onResponse(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        C7384Etj.A0Y(bArr, 0);
        C3614CXy c3614CXy = new C3614CXy(bArr, i);
        tigonCallbacks.onResponse(new CYF(C3615CXz.A00(c3614CXy), C3615CXz.A03(CY0.A00, c3614CXy)));
    }

    public static void onStarted(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        C7384Etj.A0Y(bArr, 0);
        AbstractC3613CXs.A02(new C3614CXy(bArr, i));
    }

    public static void onEOM(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        boolean z;
        try {
        } catch (OutOfMemoryError e) {
            e = e;
            z = false;
        }
        try {
            tigonCallbacks.onEOM(AbstractC3613CXs.A01(bArr, i));
        } catch (OutOfMemoryError e2) {
            e = e2;
            z = true;
            String strA0d = FGI.A0d("OutOfMemory in TigonCallbacksIntegerBufferJavaHelper onEOM. size:", String.valueOf(i), " tigonSummaryDeserialized:", String.valueOf(z));
            PrintStream printStream = System.out;
            printStream.println(strA0d);
            printStream.println(Arrays.toString(e.getStackTrace()));
            throw new Error(strA0d, e);
        }
    }

    public static void onError(TigonCallbacks tigonCallbacks, byte[] bArr, int i, byte[] bArr2, int i2) {
        tigonCallbacks.onError(AbstractC3613CXs.A00(bArr, i), AbstractC3613CXs.A01(bArr2, i2));
    }

    public static void onWillRetry(TigonCallbacks tigonCallbacks, byte[] bArr, int i, byte[] bArr2, int i2) {
        AbstractC3613CXs.A00(bArr, i);
        AbstractC3613CXs.A01(bArr2, i2);
    }
}
