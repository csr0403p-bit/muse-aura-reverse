package com.facebook.aura.activation.view;

import X.AT3;
import X.AbstractC7559F3s;
import X.C00r;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class InviteCodeScratchDebrisKt$InviteCodeScratchDebris$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ C00r $frameTick$delegate;
    public final /* synthetic */ InviteCodeScratchDebrisState $state;
    public final /* synthetic */ long $tint;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        this.$frameTick$delegate.AGd();
        this.$state.m146draw4WTKRHQ(at3, this.$tint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratchDebrisKt$InviteCodeScratchDebris$2$1(InviteCodeScratchDebrisState inviteCodeScratchDebrisState, long j, C00r c00r) {
        super(1);
        this.$state = inviteCodeScratchDebrisState;
        this.$tint = j;
        this.$frameTick$delegate = c00r;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
