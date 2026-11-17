package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C2av;
import X.C2b1;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ReconnectingCoverKt$reconnectingCover$2 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ Function0<Float> $progress;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fAh4 = c2av.Ah4(8.0f) * AnonymousClass003.A04(this.$progress);
        c2av.AeM(fAh4 > 0.0f ? new C2b1(fAh4, fAh4, 0) : null);
        c2av.Ad2(AnonymousClass002.A1N((fAh4 > 0.0f ? 1 : (fAh4 == 0.0f ? 0 : -1))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReconnectingCoverKt$reconnectingCover$2(Function0<Float> function0) {
        super(1);
        this.$progress = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
