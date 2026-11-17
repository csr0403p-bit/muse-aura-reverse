package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginPrimaryButton$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $loading;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $text;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        auraButtonGroupScope.primaryButton(this.$text, (Drawable) null, this.$enabled, this.$loading, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, this.$onClick, (String) null, Integer.MAX_VALUE, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$NativeLoginPrimaryButton$1$1(String str, boolean z, boolean z2, Function0<Unit> function0) {
        super(1);
        this.$text = str;
        this.$enabled = z;
        this.$loading = z2;
        this.$onClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
