package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsRuleEditorSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$edit$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $changePrompt;
    public final /* synthetic */ String $connectionId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConnectionsSharingRule $rule;
    public final /* synthetic */ C1BO<ConnectionsGuidanceUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$edit$1$1(String str, AuraNavigator auraNavigator, ConnectionsSharingRule connectionsSharingRule, String str2, C1BO<ConnectionsGuidanceUiState> c1bo) {
        super(0);
        this.$connectionId = str;
        this.$navigator = auraNavigator;
        this.$rule = connectionsSharingRule;
        this.$changePrompt = str2;
        this.$uiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$connectionId == null || !this.$uiState$delegate.getValue().canEdit) {
            ConnectionsGuidanceSectionKt.openChatWithPrompt(this.$navigator, this.$changePrompt);
        } else {
            this.$navigator.navigate((AuraNavKey) new ConnectionsRuleEditorSheetKey(this.$connectionId, this.$rule.id), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
