package com.facebook.aura.status.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$StatusPillAvatarInteractionTarget$3$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $actionLabel;
    public final /* synthetic */ boolean $isTakeoverAvatar;
    public final /* synthetic */ String $openStatusLabel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$isTakeoverAvatar ? this.$actionLabel : this.$openStatusLabel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$StatusPillAvatarInteractionTarget$3$1(boolean z, String str, String str2) {
        super(1);
        this.$isTakeoverAvatar = z;
        this.$actionLabel = str;
        this.$openStatusLabel = str2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
