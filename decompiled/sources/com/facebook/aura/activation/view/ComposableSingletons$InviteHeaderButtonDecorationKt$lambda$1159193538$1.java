package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G0W;
import X.G2k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.activation.view.ComposableSingletons$InviteHeaderButtonDecorationKt$lambda$-1159193538$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$InviteHeaderButtonDecorationKt$lambda$1159193538$1 extends AbstractC7559F3s implements G2k<Boolean, BRg, G0W<? super Function0<? extends Unit>, ? super BFM, ? super Integer, ? extends Unit>, BFM, Integer, Unit> {
    public static final ComposableSingletons$InviteHeaderButtonDecorationKt$lambda$1159193538$1 INSTANCE = new ComposableSingletons$InviteHeaderButtonDecorationKt$lambda$1159193538$1();

    public ComposableSingletons$InviteHeaderButtonDecorationKt$lambda$1159193538$1() {
        super(5);
    }

    public final void invoke(boolean z, BRg bRg, G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i) {
        AnonymousClass003.A0x(bRg, g0w);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0n), bfm, iA0n)) {
            HatchInviteButtonTooltipKt.HatchInviteButtonTooltip(z, bRg, g0w, bfm, iA0n & 1022, 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BRg bRg, G0W<? super Function0<? extends Unit>, ? super BFM, ? super Integer, ? extends Unit> g0w, BFM bfm, Integer num) {
        invoke(AnonymousClass001.A1X(bool), bRg, (G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit>) g0w, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
