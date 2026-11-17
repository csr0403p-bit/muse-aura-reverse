package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.file.view.InlineFilesCardKt;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class InlineFilesCardKt$InlineSwipeableEntryRow$1$SwipeToRevealBackground$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ BRg $$unused$var$;
    public final /* synthetic */ AuraSwipeableMenuState $$unused$var$$1;
    public final /* synthetic */ InlineFilesCardKt.AnonymousClass1 $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineFilesCardKt$InlineSwipeableEntryRow$1$SwipeToRevealBackground$1(InlineFilesCardKt.AnonymousClass1 anonymousClass1, BRg bRg, AuraSwipeableMenuState auraSwipeableMenuState, int i) {
        super(2);
        this.$tmp0_rcvr = anonymousClass1;
        this.$$unused$var$ = bRg;
        this.$$unused$var$$1 = auraSwipeableMenuState;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.SwipeToRevealBackground(this.$$unused$var$, this.$$unused$var$$1, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
