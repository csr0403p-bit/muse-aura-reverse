package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraBugReportDiagnosticLogsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$BugReportEntryProviderKt$lambda$212607049$1 extends AbstractC7559F3s implements G0W<AuraBugReportDiagnosticLogsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$BugReportEntryProviderKt$lambda$212607049$1 INSTANCE = new ComposableSingletons$BugReportEntryProviderKt$lambda$212607049$1();

    public ComposableSingletons$BugReportEntryProviderKt$lambda$212607049$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey, BFM bfm, Integer num) {
        invoke(auraBugReportDiagnosticLogsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(auraBugReportDiagnosticLogsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = auraBugReportDiagnosticLogsScreenKey.submissionId;
        String str2 = auraBugReportDiagnosticLogsScreenKey.endpoint;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$BugReportEntryProviderKt$lambda$212607049$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        AuraBugReportDiagnosticLogsKt.AuraBugReportDiagnosticLogsScreen(str, str2, (Function0) objAaT, null, bfm, 0, 8);
    }
}
