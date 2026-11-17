package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.AuraBugReportScreenKey;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$BugReportEntryProviderKt$lambda$1312316779$1 extends AbstractC7559F3s implements G0W<AuraBugReportScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$BugReportEntryProviderKt$lambda$1312316779$1 INSTANCE = new ComposableSingletons$BugReportEntryProviderKt$lambda$1312316779$1();

    public ComposableSingletons$BugReportEntryProviderKt$lambda$1312316779$1() {
        super(3);
    }

    public final void invoke(AuraBugReportScreenKey auraBugReportScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(auraBugReportScreenKey, 0);
        BugReportEntryProvider.INSTANCE.BugReportScreen(auraBugReportScreenKey.submissionId, auraBugReportScreenKey.screenshotUri, auraBugReportScreenKey.endpoint, bfm, 3072);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraBugReportScreenKey auraBugReportScreenKey, BFM bfm, Integer num) {
        invoke(auraBugReportScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
