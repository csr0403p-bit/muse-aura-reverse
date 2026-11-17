package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraBugReportDiagnosticLogsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class BugReportEntryProvider$BugReportScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $endpoint;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $submissionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReportEntryProvider$BugReportScreen$2$1(AuraNavigator auraNavigator, String str, String str2) {
        super(0);
        this.$navigator = auraNavigator;
        this.$submissionId = str;
        this.$endpoint = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new AuraBugReportDiagnosticLogsScreenKey(this.$submissionId, this.$endpoint), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
