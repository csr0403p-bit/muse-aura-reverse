package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.assist.HatchAssistantRoleManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SettingsEntryProviderKt$SettingsScreenContent$21$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsEntryProviderKt$SettingsScreenContent$21$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(HatchAssistantRoleManager.INSTANCE.isDefaultAssistant(this.$context));
    }
}
