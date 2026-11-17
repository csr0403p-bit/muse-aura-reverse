package com.facebook.aura.watchhandoff;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class WatchAppPromoNudgeKt$WatchAppPromoAvatar$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $avatarSize;
    public final /* synthetic */ float $badgeSize;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchAppPromoNudgeKt$WatchAppPromoAvatar$2(float f, float f2, BRg bRg, int i, int i2) {
        super(2);
        this.$avatarSize = f;
        this.$badgeSize = f2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        WatchAppPromoNudgeKt.m3149WatchAppPromoAvatarif577FI(this.$avatarSize, this.$badgeSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
