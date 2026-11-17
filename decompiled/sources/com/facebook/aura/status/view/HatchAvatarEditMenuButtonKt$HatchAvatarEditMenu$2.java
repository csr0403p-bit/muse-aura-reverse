package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $avatar;
    public final /* synthetic */ float $avatarSize;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$2(float f, boolean z, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$avatarSize = f;
        this.$enabled = z;
        this.$modifier = bRg;
        this.$avatar = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAvatarEditMenuButtonKt.m2220HatchAvatarEditMenuAjpBEmI(this.$avatarSize, this.$enabled, this.$modifier, this.$avatar, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
