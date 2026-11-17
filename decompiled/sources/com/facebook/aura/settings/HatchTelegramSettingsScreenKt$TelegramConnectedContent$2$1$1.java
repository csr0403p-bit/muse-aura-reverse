package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $disconnectText;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ MutableState<Boolean> $showConfirmDialog$delegate;

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $showConfirmDialog$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState) {
            super(0);
            this.$showConfirmDialog$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, HatchScreen.CHANNELS_TELEGRAM, HatchComponent.DISCONNECT_BUTTON, null, null, null);
            MutableState.A09(true, this.$showConfirmDialog$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        auraButtonGroupScope.destructiveButton(this.$disconnectText, null, !this.$isLoading, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, new AnonymousClass1(this.$showConfirmDialog$delegate), null, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$1$1(boolean z, String str, MutableState<Boolean> mutableState) {
        super(1);
        this.$isLoading = z;
        this.$disconnectText = str;
        this.$showConfirmDialog$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
