package com.facebook.aura.confidentialvm.view;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmLoginScreenKt$PinCaptionText$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ boolean $announceLive;
    public final /* synthetic */ String $liveAnnouncement;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        if (this.$liveAnnouncement != null) {
            AbstractC1564Ale.A04(interfaceC0857A6e);
            AbstractC1564Ale.A08(interfaceC0857A6e, this.$liveAnnouncement);
        } else if (this.$announceLive) {
            AbstractC1564Ale.A04(interfaceC0857A6e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmLoginScreenKt$PinCaptionText$1$1(String str, boolean z) {
        super(1);
        this.$liveAnnouncement = str;
        this.$announceLive = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
