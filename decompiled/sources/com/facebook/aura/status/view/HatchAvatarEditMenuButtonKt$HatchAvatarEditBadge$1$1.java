package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.B6A;
import X.C0er;
import X.C1D8;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import X.HDi;
import X.HxS;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarEditMenuButtonKt$HatchAvatarEditBadge$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ Function0<Float> $alpha;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fA00 = AnonymousClass003.A00(AnonymousClass003.A04(this.$alpha));
        c2av.Acj(fA00);
        c2av.Aef(c2av.Ah4(HatchAvatarEditMenuButtonKt.AvatarEditBadgeElevation));
        c2av.Aeg(C1D8.A00);
        c2av.Ad2(true);
        long j = C0er.A00;
        c2av.Acl(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), fA00));
        c2av.Aej(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), fA00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarEditMenuButtonKt$HatchAvatarEditBadge$1$1(Function0<Float> function0) {
        super(1);
        this.$alpha = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
