package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LoggedOutBugReportScreenKey;
import com.facebook.aura.navigation.key.ShakeToReportBottomSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1405660474$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ShakeToReportBottomSheetKey $key;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1405660474$1$1$1(AuraNavigator auraNavigator, ShakeToReportBottomSheetKey shakeToReportBottomSheetKey) {
        super(0);
        this.$navigator = auraNavigator;
        this.$key = shakeToReportBottomSheetKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        ShakeToReportBottomSheetKey shakeToReportBottomSheetKey = this.$key;
        auraNavigator.navigate((AuraNavKey) new LoggedOutBugReportScreenKey(shakeToReportBottomSheetKey.submissionId, shakeToReportBottomSheetKey.screenshotUri), true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
