package com.facebook.aura.vds.compose.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1390AiL;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$2$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ boolean $isRtl;
    public final /* synthetic */ AuraSwipeableMenuState $swipeableMenuState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        boolean z = this.$isRtl;
        AuraSwipeableMenuState auraSwipeableMenuState = this.$swipeableMenuState;
        c2av.Af5((z ? ((-1.0f) * auraSwipeableMenuState.getOffset()) - AnonymousClass001.A00(((C1390AiL) c2av).A0D) : auraSwipeableMenuState.getOffset() + AnonymousClass001.A00(((C1390AiL) c2av).A0D)) / 2.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToastSwipeToDismissBackgroundProvider$SwipeToRevealBackground$2$1$1(boolean z, AuraSwipeableMenuState auraSwipeableMenuState) {
        super(1);
        this.$isRtl = z;
        this.$swipeableMenuState = auraSwipeableMenuState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
