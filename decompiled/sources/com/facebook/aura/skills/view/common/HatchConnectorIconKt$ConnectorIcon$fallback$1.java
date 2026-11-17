package com.facebook.aura.skills.view.common;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorIconKt$ConnectorIcon$fallback$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $fallbackIconRes;
    public final /* synthetic */ float $fallbackIconSize;
    public final /* synthetic */ long $resolvedFallbackTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorIconKt$ConnectorIcon$fallback$1(int i, float f, long j) {
        super(2);
        this.$fallbackIconRes = i;
        this.$fallbackIconSize = f;
        this.$resolvedFallbackTint = j;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchConnectorIconKt.m2168ConnectorFallbackIconPZHvWI(this.$fallbackIconRes, this.$fallbackIconSize, this.$resolvedFallbackTint, null, bfm, 0, 8);
        } else {
            bfm.Afo();
        }
    }
}
