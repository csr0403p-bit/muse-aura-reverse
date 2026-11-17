package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplyAffordance$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ Function0<Float> $translation;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA04 = AnonymousClass003.A04(this.$progress);
        float f = (0.39999998f * fA04) + 0.6f;
        c2av.Acj(fA04);
        c2av.AeX(f);
        c2av.AeY(f);
        c2av.Af5(AnonymousClass003.A04(this.$translation));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplyAffordance$1$1(Function0<Float> function0, Function0<Float> function02) {
        super(1);
        this.$progress = function0;
        this.$translation = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
