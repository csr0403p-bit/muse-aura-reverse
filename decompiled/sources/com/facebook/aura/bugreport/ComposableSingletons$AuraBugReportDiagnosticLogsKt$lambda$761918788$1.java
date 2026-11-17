package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.bugreport.ComposableSingletons$AuraBugReportDiagnosticLogsKt$lambda$-761918788$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AuraBugReportDiagnosticLogsKt$lambda$761918788$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraBugReportDiagnosticLogsKt$lambda$761918788$1 INSTANCE = new ComposableSingletons$AuraBugReportDiagnosticLogsKt$lambda$761918788$1();

    public ComposableSingletons$AuraBugReportDiagnosticLogsKt$lambda$761918788$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraBugReportDiagnosticLogsKt.ServerLogRow(null, null, null, bfm, 6, 6);
        } else {
            bfm.Afo();
        }
    }
}
