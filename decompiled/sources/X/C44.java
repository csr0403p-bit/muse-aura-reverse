package X;

import android.app.Application;
import android.os.Trace;
import com.facebook.breakpad.BreakpadManager;

/* loaded from: classes5.dex */
public final class C44 implements InterfaceC3269C6v {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ F18 A01;
    public final /* synthetic */ F18 A02;

    public C44(Application application, F18 f18, F18 f182) {
        this.A01 = f18;
        this.A00 = application;
        this.A02 = f182;
    }

    @Override // X.InterfaceC3269C6v
    public final EnumC3250C5k getName() {
        return EnumC3250C5k.A02;
    }

    @Override // X.InterfaceC3269C6v
    public final void init(C3241C4y c3241C4y) {
        Trace.beginSection("BreakpadManager.start");
        try {
            Trace.beginSection("BreakpadEarlyNativeInit.prepare");
            String str = c3241C4y.A0U.AMN();
            long jA06 = BV4.A06(this.A01.AMN());
            Trace.endSection();
            Application application = this.A00;
            BreakpadManager.start(application, jA06, 1536000, str, null, false, false);
            BreakpadManager.setCustomData(C6B.A5P.name, str, new Object[0]);
            Trace.beginSection("BreakpadEarlyNativeInit.coreDumping");
            BreakpadManager.ensureLoadLibrary();
            if ((BreakpadManager.nativeGetMinidumpFlags() & 416) == 0 && AnonymousClass001.A1X(this.A02.AMN())) {
                BreakpadManager.enableCoreDumping(application);
            }
            Trace.endSection();
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.InterfaceC3269C6v
    public final BWq getWhenToInit() {
        throw F60.createAndThrow();
    }
}
