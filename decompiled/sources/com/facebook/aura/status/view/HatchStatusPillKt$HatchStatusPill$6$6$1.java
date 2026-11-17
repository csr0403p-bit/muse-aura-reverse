package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$6$6$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ C1BO<Float> $avatarAlpha$delegate;
    public final /* synthetic */ boolean $hasAvatarArea;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(this.$hasAvatarArea ? C1BO.A01(this.$avatarAlpha$delegate) : 0.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$6$6$1(boolean z, C1BO<Float> c1bo) {
        super(1);
        this.$hasAvatarArea = z;
        this.$avatarAlpha$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
