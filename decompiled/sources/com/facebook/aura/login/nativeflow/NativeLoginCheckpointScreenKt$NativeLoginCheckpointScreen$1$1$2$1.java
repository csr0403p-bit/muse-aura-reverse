package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCheckpointScreenKt$NativeLoginCheckpointScreen$1$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ String $logOutText;
    public final /* synthetic */ Function0<Unit> $onLogOut;
    public final /* synthetic */ Function0<Unit> $onPrimaryClick;
    public final /* synthetic */ String $primaryText;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$primaryText;
        boolean z = this.$isLoading;
        Function0<Unit> function0 = this.$onPrimaryClick;
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(str, (Drawable) null, true, z, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, function0, (String) null, Integer.MAX_VALUE, (BRg) bs0);
        auraButtonGroupScope.secondaryButton(this.$logOutText, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, this.$onLogOut, null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointScreenKt$NativeLoginCheckpointScreen$1$1$2$1(String str, boolean z, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        super(1);
        this.$primaryText = str;
        this.$isLoading = z;
        this.$onPrimaryClick = function0;
        this.$logOutText = str2;
        this.$onLogOut = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
