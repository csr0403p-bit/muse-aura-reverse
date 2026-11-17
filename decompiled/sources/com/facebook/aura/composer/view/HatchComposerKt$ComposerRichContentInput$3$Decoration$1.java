package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.composer.view.HatchComposerKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerRichContentInput$3$Decoration$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $innerTextField;
    public final /* synthetic */ HatchComposerKt.C111873 $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$ComposerRichContentInput$3$Decoration$1(HatchComposerKt.C111873 c111873, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
        super(2);
        this.$tmp0_rcvr = c111873;
        this.$innerTextField = g0v;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.Decoration(this.$innerTextField, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
