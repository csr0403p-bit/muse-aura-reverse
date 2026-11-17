package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.RecipientPermissionsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RecipientPermissionsEntryKt$RecipientPermissionsEntry$3$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ String $connectorName;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientPermissionsEntryKt$RecipientPermissionsEntry$3$1$1$1$1$1(AuraNavigator auraNavigator, String str, String str2) {
        super(0);
        this.$navigator = auraNavigator;
        this.$connectorId = str;
        this.$connectorName = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new RecipientPermissionsScreenKey(this.$connectorId, this.$connectorName), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
