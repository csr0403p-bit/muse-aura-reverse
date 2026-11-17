package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.ActivationBugReportScreenKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$BugReportEntryProviderKt$lambda$-1394708031$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$BugReportEntryProviderKt$lambda$1394708031$1 extends AbstractC7559F3s implements G0W<ActivationBugReportScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$BugReportEntryProviderKt$lambda$1394708031$1 INSTANCE = new ComposableSingletons$BugReportEntryProviderKt$lambda$1394708031$1();

    public ComposableSingletons$BugReportEntryProviderKt$lambda$1394708031$1() {
        super(3);
    }

    public final void invoke(ActivationBugReportScreenKey activationBugReportScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(activationBugReportScreenKey, 0);
        BugReportEntryProvider.INSTANCE.BugReportScreen(activationBugReportScreenKey.submissionId, activationBugReportScreenKey.screenshotUri, activationBugReportScreenKey.endpoint, bfm, 3072);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ActivationBugReportScreenKey activationBugReportScreenKey, BFM bfm, Integer num) {
        invoke(activationBugReportScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
