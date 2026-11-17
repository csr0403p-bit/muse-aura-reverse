package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class InviteCodeScratcherKt$ScratchFoil$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ Function0<Float> $alpha;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA04 = AnonymousClass003.A04(this.$alpha);
        c2av.Acj(fA04);
        c2av.Af6((1.0f - fA04) * c2av.Ah4(InviteCodeScratcherKt.RevealDrop));
        c2av.Ad7(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratcherKt$ScratchFoil$1$1(Function0<Float> function0) {
        super(1);
        this.$alpha = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
