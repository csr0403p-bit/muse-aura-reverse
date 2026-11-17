package com.facebook.aura.spacesharing.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceSharingComponentsKt$SharingAvatarPlaceholder$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceSharingComponentsKt$SharingAvatarPlaceholder$1(BRg bRg, float f, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$size = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        SpaceSharingComponentsKt.m2206SharingAvatarPlaceholderrAjV9yQ(this.$modifier, this.$size, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
