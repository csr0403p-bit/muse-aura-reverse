package X;

import android.app.Application;
import android.net.Uri;
import android.os.Trace;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.acra.util.HttpConnectionProvider;
import com.facebook.acra.util.UnsafeConnectionProvider;
import com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public final class F4A extends C6X {
    public final int $t;
    public final Object A00;

    public F4A(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, X.C2q] */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, X.C2d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, X.C7k] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, X.C5F] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, X.C4X] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, X.C6S] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, X.C7B] */
    @Override // X.C6X
    public final T create() {
        Uri uriA01;
        HttpConnectionProvider ccy;
        T c4i;
        try {
            switch (this.$t) {
                case 0:
                    return this.A00;
                case 1:
                    return ((F18) this.A00).AMN();
                case 2:
                    return new C3278C7g();
                case 3:
                    C3241C4y c3241C4y = (C3241C4y) this.A00;
                    F18 f4a = c3241C4y.A0A;
                    if (f4a == null) {
                        f4a = new F4A(c3241C4y, 2);
                        c3241C4y.A0A = f4a;
                    }
                    C3278C7g c3278C7g = (C3278C7g) f4a.AMN();
                    String str = C7Y.A00;
                    List<String> list = C3280C7k.A04;
                    String str2 = C3241C4y.A0b;
                    if (str != null) {
                        uriA01 = C7Je.A01(str2).buildUpon().authority(C7Y.A00).build();
                        ccy = new UnsafeConnectionProvider(30000, null);
                    } else {
                        uriA01 = C7Je.A01(str2);
                        ccy = new CCY();
                    }
                    return new C3280C7k(uriA01, ccy, c3278C7g, "Android");
                case 4:
                    return new C5F(this);
                case 5:
                    C3264C6k c3264C6k = ((C3241C4y) this.A00).A03().A03;
                    BeS.A03(c3264C6k, "Did you call SessionManager.init()?");
                    return new C4X(c3264C6k.A01.A02);
                case 6:
                    C3241C4y c3241C4y2 = (C3241C4y) this.A00;
                    C3241C4y c3241C4y3 = C3241C4y.A0a;
                    return new C6S(c3241C4y2.A0E);
                case 7:
                    Trace.beginSection("ReportSender");
                    C3241C4y c3241C4y4 = (C3241C4y) this.A00;
                    Application application = c3241C4y4.A0E;
                    F18<String> f18 = c3241C4y4.A0X;
                    F18<String> f182 = c3241C4y4.A0N;
                    F18<String> f183 = c3241C4y4.A0M;
                    F18<String> f184 = c3241C4y4.A0V;
                    F18 f4a2 = c3241C4y4.A05;
                    if (f4a2 == null) {
                        f4a2 = new F4A(c3241C4y4, 3);
                        c3241C4y4.A05 = f4a2;
                    }
                    F18 f4a3 = c3241C4y4.A09;
                    if (f4a3 == null) {
                        f4a3 = new F4A(c3241C4y4, 11);
                        c3241C4y4.A09 = f4a3;
                    }
                    F18 f4a4 = c3241C4y4.A04;
                    if (f4a4 == null) {
                        f4a4 = new F4A(c3241C4y4, 12);
                        c3241C4y4.A04 = f4a4;
                    }
                    c4i = new C4I(application, (C4E) f4a4.AMN(), new Runnable() { // from class: X.C52
                        public static final String __redex_internal_original_name = "LacrimaConfig$2$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            CFK.A06(C9Y.TAG, "Deleting report, reached max attempt count");
                        }
                    }, c3241C4y4.A0S.AMN(), f18, f182, f183, f184, f4a2, f4a3, c3241C4y4.A0C);
                    break;
                case 8:
                    C3241C4y c3241C4y5 = (C3241C4y) this.A00;
                    C3241C4y c3241C4y6 = C3241C4y.A0a;
                    Application application2 = c3241C4y5.A0E;
                    c3241C4y5.A0Q.AMN();
                    return new C7B(application2);
                case 9:
                    C3241C4y c3241C4y7 = (C3241C4y) this.A00;
                    F18 f4a5 = c3241C4y7.A06;
                    if (f4a5 == null) {
                        f4a5 = new F4A(c3241C4y7, 10);
                        c3241C4y7.A06 = f4a5;
                    }
                    return new C3192C2q((InterfaceC3189C2f) f4a5.AMN());
                case 10:
                    return new InterfaceC3189C2f() { // from class: X.C2d
                        @Override // X.InterfaceC3189C2f
                        public final C3193C2r A7U(File file, int i) {
                            C3241C4y c3241C4y8 = (C3241C4y) this.A00.A00;
                            C3241C4y c3241C4y9 = C3241C4y.A0a;
                            if (c3241C4y8.A0Y) {
                                try {
                                    return new MLockedFile(file, i);
                                } catch (IOException e) {
                                    C2Q.A00().AT9("MLockedFileCreate", e, null);
                                    CFK.A0A(C9Y.TAG, "Failed to initialize mlocked file, using fallback", e);
                                }
                            }
                            try {
                                return new C3193C2r(file, i);
                            } catch (IOException e2) {
                                C2Q.A00().AT9("SimpleMappedFileCreate", e2, null);
                                CFK.A0A(C9Y.TAG, "Failed to initialize mapped file", e2);
                                return null;
                            }
                        }
                    };
                case 11:
                    Trace.beginSection("ReportAssembler");
                    C3241C4y c3241C4y8 = (C3241C4y) this.A00;
                    C54 c54A03 = c3241C4y8.A03();
                    F18 f4a6 = c3241C4y8.A08;
                    if (f4a6 == null) {
                        f4a6 = new F4A(c3241C4y8, 9);
                        c3241C4y8.A08 = f4a6;
                    }
                    c4i = new C4Z((C3192C2q) f4a6.AMN(), c54A03);
                    break;
                default:
                    Trace.beginSection("GlobalCleanup");
                    List list2 = C4E.A05;
                    C3241C4y c3241C4y9 = (C3241C4y) this.A00;
                    C3241C4y c3241C4y10 = C3241C4y.A0a;
                    Application application3 = c3241C4y9.A0E;
                    c4i = new C4E(application3, new C4G(), application3.getDir(ErrorReportingConstants.APP_ERROR_REPORTING_DIR_NAME, 0));
                    break;
            }
            return c4i;
        } finally {
            Trace.endSection();
        }
    }
}
