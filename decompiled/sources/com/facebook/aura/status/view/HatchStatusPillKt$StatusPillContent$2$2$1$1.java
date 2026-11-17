package com.facebook.aura.status.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$StatusPillContent$2$2$1$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ AvatarTakeover $takeover;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        AvatarFullScreen fullScreen;
        C7384Etj.A0Y(aaC, 0);
        AvatarTakeover avatarTakeover = this.$takeover;
        if (avatarTakeover == null || (fullScreen = avatarTakeover.getFullScreen()) == null || !fullScreen.getActive()) {
            this.$pillMetrics.setPillBoundsInWindow(aaC);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$StatusPillContent$2$2$1$1(AvatarTakeover avatarTakeover, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(1);
        this.$takeover = avatarTakeover;
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
