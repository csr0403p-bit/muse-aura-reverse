package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class C6J implements InterfaceC3231C4o {
    public final File A00;

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0b;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Integer num;
        File fileA0O = C3cG.A0O(this.A00, "detection_stages.txt");
        if (fileA0O.exists()) {
            BufferedReader bufferedReaderA0I = BV5.A0I(fileA0O);
            try {
                for (String line = bufferedReaderA0I.readLine(); line != null; line = bufferedReaderA0I.readLine()) {
                    String[] strArrSplit = line.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                    if (strArrSplit.length == 2) {
                        try {
                            String str = strArrSplit[0];
                            if (str.equals("JAVA_CRASH_DETECTION")) {
                                num = C79.A00;
                            } else if (str.equals("NATIVE_CRASH_DETECTION")) {
                                num = C79.A01;
                            } else if (str.equals("UNEXPLAINED_DETECTION")) {
                                num = C79.A0C;
                            } else if (str.equals("ANR_DETECTION")) {
                                num = C79.A0K;
                            } else {
                                if (!str.equals("LIFECYCLE_DETECTION")) {
                                    throw C60O.A0i(str);
                                }
                                num = C79.A0P;
                            }
                            int iA0F = BV6.A0F(strArrSplit, 1);
                            int iIntValue = num.intValue();
                            if (iIntValue == 3) {
                                C3228C4l.A01(C6B.A40, c3228C4l, iA0F);
                            } else if (iIntValue == 0) {
                                C3228C4l.A01(C6B.A41, c3228C4l, iA0F);
                            } else if (iIntValue == 1) {
                                C3228C4l.A01(C6B.A43, c3228C4l, iA0F);
                            } else if (iIntValue == 4) {
                                C3228C4l.A01(C6B.A42, c3228C4l, iA0F);
                            } else if (iIntValue == 2) {
                                C3228C4l.A01(C6B.A44, c3228C4l, iA0F);
                            }
                        } catch (IllegalArgumentException unused) {
                            continue;
                        }
                    }
                }
                bufferedReaderA0I.close();
            } catch (Throwable th) {
                try {
                    bufferedReaderA0I.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }
    }

    public C6J(File file) {
        this.A00 = file;
    }
}
