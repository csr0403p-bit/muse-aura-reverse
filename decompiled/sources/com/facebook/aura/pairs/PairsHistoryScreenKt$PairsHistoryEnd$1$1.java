package com.facebook.aura.pairs;

import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PairsHistoryScreenKt$PairsHistoryEnd$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $dividerColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long j = this.$dividerColor;
        long jA0F = AnonymousClass002.A0F();
        long j2 = jA0F << 32;
        long j3 = jA0F & 4294967295L;
        at3.A9X(null, null, at3.Ah4(1.0f), 1.0f, 0, 3, j, j2 | j3, (Float.floatToRawIntBits(AnonymousClass001.A00(at3.AKb())) << 32) | j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsHistoryScreenKt$PairsHistoryEnd$1$1(long j) {
        super(1);
        this.$dividerColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
