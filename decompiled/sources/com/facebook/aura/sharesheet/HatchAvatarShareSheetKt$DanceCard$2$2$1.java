package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarShareSheetKt$DanceCard$2$2$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isMuted;
    public final /* synthetic */ G0U<Boolean, Unit> $onMutedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAvatarShareSheetKt$DanceCard$2$2$1(boolean z, G0U<? super Boolean, Unit> g0u) {
        super(2);
        this.$isMuted = z;
        this.$onMutedChange = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchAvatarShareSheetKt.DanceMuteButton(this.$isMuted, this.$onMutedChange, null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
    }
}
