package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite;
import com.facebook.systrace.Systrace;

/* loaded from: classes5.dex */
public final class CC8 implements InterfaceC3458COe {
    @Override // X.InterfaceC3458COe
    public final void AWa() {
        if (Systrace.A09(34359738368L)) {
            Systrace.A01();
            ClassTracingLoggerLite.A02 = true;
            ClassTracingLoggerLite.A01 = AnonymousClass002.A1L(ClassTracingLoggerLite.A02 ? 1 : 0);
        }
    }

    @Override // X.InterfaceC3458COe
    public final void AWb() {
        if (Systrace.A09(34359738368L)) {
            ClassTracingLoggerLite.A02 = false;
            ClassTracingLoggerLite.A01 = AnonymousClass002.A1L(ClassTracingLoggerLite.A02 ? 1 : 0);
            Systrace.A02();
        }
    }
}
