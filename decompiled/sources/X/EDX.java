package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class EDX implements InterfaceC6536EDr {
    public final ED8 A00;

    /* JADX INFO: Incorrect field signature: TT; */
    public final EDT A01;
    public final Map<File, C6538EDt> A02;
    public final Executor A03;
    public final LightweightQuickPerformanceLogger A04;
    public final AtomicBoolean A05;
    public final AtomicLong A06;

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public EDX(EDT edt) {
        C7384Etj.A0Y(edt, 0);
        this.A01 = edt;
        Map<File, C6538EDt> mapA14 = BV5.A14();
        C7384Etj.A0U(mapA14);
        this.A02 = mapA14;
        this.A00 = ((EE6) edt).getStore("eviction.v2");
        this.A03 = edt.getExecutor(BYM.A02);
        this.A05 = BV4.A12(false);
        this.A06 = BV5.A19();
        this.A04 = BV4.A0D();
    }

    @Override // X.InterfaceC6536EDr
    public final /* bridge */ /* synthetic */ void onPathRequested(EDW edw, EE9 ee9, File file) throws IOException {
        File absoluteFile;
        C6538EDt c6538EDt = (C6538EDt) ee9;
        AnonymousClass005.A0x(edw, c6538EDt, file);
        String str = c6538EDt.A00;
        if (str == null) {
            str = edw.A01;
        }
        c6538EDt.A00 = str;
        Map<File, C6538EDt> map = this.A02;
        try {
            absoluteFile = file.getCanonicalFile();
            C7384Etj.A0X(absoluteFile);
        } catch (IOException unused) {
            absoluteFile = file.getAbsoluteFile();
            C7384Etj.A0X(absoluteFile);
        }
        map.put(absoluteFile, c6538EDt);
        this.A03.execute(new EDY(edw, this, c6538EDt, file));
    }
}
