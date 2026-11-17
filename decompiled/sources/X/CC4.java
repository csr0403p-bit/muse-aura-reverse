package X;

import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.systrace.Systrace;

/* loaded from: classes5.dex */
public final class CC4 implements InterfaceC3458COe {
    @Override // X.InterfaceC3458COe
    public final void AWa() {
        if (Systrace.A09(34359738368L)) {
            Systrace.A01();
            ClassTracingLogger.A00(true);
        }
    }

    @Override // X.InterfaceC3458COe
    public final void AWb() {
        if (Systrace.A09(34359738368L)) {
            ClassTracingLogger.A00(false);
            Systrace.A02();
        }
    }
}
