package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import com.facebook.aura.email.keys.EmailSendersKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailSettingsScreenKt$EmailSettingsScreen$2$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSettingsScreenKt$EmailSettingsScreen$2$3$1$1(AuraNavigator auraNavigator, String str) {
        super(0);
        this.$navigator = auraNavigator;
        this.$environmentId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new EmailSendersKey(this.$environmentId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
