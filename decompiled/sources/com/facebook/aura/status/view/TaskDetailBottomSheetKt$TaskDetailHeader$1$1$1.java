package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class TaskDetailBottomSheetKt$TaskDetailHeader$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $editPrompt;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ String $section;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDetailBottomSheetKt$TaskDetailHeader$1$1$1(String str, Function0<Unit> function0, AuraNavigator auraNavigator, String str2) {
        super(0);
        this.$section = str;
        this.$onDismiss = function0;
        this.$navigator = auraNavigator;
        this.$editPrompt = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.EDIT_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.SECTION.getValue(), this.$section), null);
        this.$onDismiss.invoke();
        this.$navigator.back();
        HatchStatusScreenKt.prefillPromptInComposer(this.$editPrompt, this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
