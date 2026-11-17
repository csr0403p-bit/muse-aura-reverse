package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchHeaderScrimKt$HatchHeaderScrim$3$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ boolean $fadesUnderAvatarPanel;
    public final /* synthetic */ HatchForegroundHeaderState $foregroundHeader;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Af6(-(this.$foregroundHeader != null ? r0.contentInsetPx$delegate.AGd() : 0));
        if (this.$fadesUnderAvatarPanel) {
            c2av.Acj(1.0f - this.$pillMetrics.avatarPanelProgress$delegate.AFn());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchHeaderScrimKt$HatchHeaderScrim$3$1(HatchForegroundHeaderState hatchForegroundHeaderState, boolean z, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(1);
        this.$foregroundHeader = hatchForegroundHeaderState;
        this.$fadesUnderAvatarPanel = z;
        this.$pillMetrics = hatchStatusPillMetrics;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
