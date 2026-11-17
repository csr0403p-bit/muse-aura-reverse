package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.R;
import com.facebook.aura.header.api.HeaderActionIcon;
import com.facebook.aura.header.view.HeaderButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginLandingScreenKt$NativeLoginLandingHeaderButtons$1$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onOpenSettings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginLandingScreenKt$NativeLoginLandingHeaderButtons$1$1(Function0<Unit> function0) {
        super(3);
        this.$onOpenSettings = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            HeaderButtonKt.m1027HeaderIconButtonrglY58k(new HeaderActionIcon(R.drawable.settings_gear_android_wght400_outline_24, R.string._name_removed__res_0x7f1205b8, false, true), this.$onOpenSettings, "hatch-settings-button", null, null, false, false, null, bfm, 384, 248);
        } else {
            bfm.Afo();
        }
    }
}
