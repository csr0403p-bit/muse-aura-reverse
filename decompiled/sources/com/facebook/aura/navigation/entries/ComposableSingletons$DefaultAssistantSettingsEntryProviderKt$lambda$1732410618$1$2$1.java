package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C7mU;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.assist.HatchAssistantRoleManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$DefaultAssistantSettingsEntryProviderKt$lambda$-1732410618$1$2$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$DefaultAssistantSettingsEntryProviderKt$lambda$1732410618$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$DefaultAssistantSettingsEntryProviderKt$lambda$1732410618$1$2$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchAssistantRoleManager hatchAssistantRoleManager = HatchAssistantRoleManager.INSTANCE;
        Intent intentCreateVoiceInputSettingsIntent = hatchAssistantRoleManager.createVoiceInputSettingsIntent(this.$context);
        if (intentCreateVoiceInputSettingsIntent == null && (intentCreateVoiceInputSettingsIntent = hatchAssistantRoleManager.createManageDefaultAppsIntent(this.$context)) == null) {
            intentCreateVoiceInputSettingsIntent = new Intent("android.settings.SETTINGS");
        }
        C7mU.A00().A03().A05(this.$context, intentCreateVoiceInputSettingsIntent);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
