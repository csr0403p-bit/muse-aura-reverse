package com.facebook.aura.spacesharing.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceSharingComponentsKt$SharingAvatar$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceSharingComponentsKt$SharingAvatar$1(float f) {
        super(2);
        this.$size = f;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            SpaceSharingComponentsKt.m2206SharingAvatarPlaceholderrAjV9yQ(null, this.$size, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
