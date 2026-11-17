package com.facebook.aura.settings;

import X.AT3;
import X.AbstractC7559F3s;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraChannelsSettingsScreenKt$ChannelCard$2$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long j = this.$color;
        at3.A9N(null, C16a.A00, at3.Ah4(4.0f), 1.0f, 3, j, at3.ADU());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraChannelsSettingsScreenKt$ChannelCard$2$1$1(long j) {
        super(1);
        this.$color = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
