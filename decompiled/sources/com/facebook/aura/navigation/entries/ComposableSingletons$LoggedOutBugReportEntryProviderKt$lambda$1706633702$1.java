package com.facebook.aura.navigation.entries;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.bugreport.AuraBugReportScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.LoggedOutBugReportScreenKey;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$-1706633702$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1706633702$1 extends AbstractC7559F3s implements G0W<LoggedOutBugReportScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1706633702$1 INSTANCE = new ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1706633702$1();

    public ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1706633702$1() {
        super(3);
    }

    public final void invoke(LoggedOutBugReportScreenKey loggedOutBugReportScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(loggedOutBugReportScreenKey, 0);
        BBI bbi = (BBI) bfm;
        AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
        boolean zA67 = bfm.A67(auraNavigatorA05);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1706633702$1$1$1(auraNavigatorA05);
            BBI.A0O(bbi, objAaT);
        }
        AuraBugReportScreenKt.AuraBugReportScreen((Function0) objAaT, loggedOutBugReportScreenKey.submissionId, loggedOutBugReportScreenKey.screenshotUri, null, null, null, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 104);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LoggedOutBugReportScreenKey loggedOutBugReportScreenKey, BFM bfm, Integer num) {
        invoke(loggedOutBugReportScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
