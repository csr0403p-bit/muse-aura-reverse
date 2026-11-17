package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.qpl.AuraDebugAndTestConfig;
import com.facebook.common.util.TriState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

/* renamed from: X.COv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3470COv implements DJF {
    public final DJe A00;
    public final F18 A01;
    public final InterfaceC3472COx A02;
    public final List<Integer> A03;

    @Override // X.DJF
    public final void visit(COt cOt) {
        C7384Etj.A0Y(cOt, 0);
        if (C9X.A04() || ((AuraDebugAndTestConfig) this.A02).isOutputToLogcatJsonEnabled == TriState.A04) {
            F18 f18 = this.A01;
            String strA00 = CP4.A00(cOt, f18, true);
            synchronized (this) {
                synchronized (C3471COw.class) {
                    int length = strA00.length();
                    int i = 0;
                    int i2 = (length / 1000) + (length % 1000 == 0 ? 0 : 1);
                    while (i < i2) {
                        String str = i > 0 ? "..." : "";
                        int i3 = 1000 * i;
                        i++;
                        CFK.A06("QuickPerformanceLoggerImpl", FGI.A0M(str, strA00.substring(i3, Math.min(1000 * i, length))));
                    }
                }
            }
            CFK.A06("QuickPerformanceLoggerImpl", "EndQPLSentJson");
            if (C9X.A04()) {
                synchronized (this) {
                    String str2 = C9X.A00;
                    C7384Etj.A0U(str2);
                    if (!str2.equals("")) {
                        File file = new File(str2);
                        File parentFile = file.getParentFile();
                        if (parentFile != null && !parentFile.exists()) {
                            if (parentFile.mkdirs()) {
                                CFK.A05("QuickPerformanceLoggerImpl", FGI.A0M("Created the missing directory for QPL File Events: ", parentFile.getPath()));
                            } else {
                                CFK.A06("QuickPerformanceLoggerImpl", FGI.A0M("Failed to create directory for QPL Events: ", parentFile.getPath()));
                            }
                        }
                        try {
                            String strA002 = CP4.A00(cOt, f18, false);
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8);
                            try {
                                outputStreamWriter.write(FGI.A0M(strA002, PairsDiscretionDocument.TERMINATOR));
                                outputStreamWriter.flush();
                                outputStreamWriter.close();
                            } catch (Throwable th) {
                                try {
                                    outputStreamWriter.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            CFK.A08("QuickPerformanceLoggerImpl", "Exception writing qpls to file", e);
                        }
                    }
                }
                this.A03.contains(Integer.valueOf(cOt.getMarkerId()));
            }
        }
    }

    public C3470COv(InterfaceC3472COx interfaceC3472COx, DJe dJe, F18 f18) {
        AnonymousClass003.A0u(interfaceC3472COx, f18);
        this.A02 = interfaceC3472COx;
        this.A01 = f18;
        this.A00 = dJe;
        this.A03 = BV4.A0t(Collections.singletonList(27792138));
    }

    @Override // X.DJF
    public final int getPriority() {
        return Integer.MAX_VALUE;
    }
}
