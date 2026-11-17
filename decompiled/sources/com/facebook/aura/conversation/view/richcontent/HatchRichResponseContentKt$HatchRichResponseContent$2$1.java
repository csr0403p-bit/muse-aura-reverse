package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0981AMm;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$2$1 extends AbstractC7559F3s implements G0U<Integer, Boolean> {
    public final /* synthetic */ boolean $disableVisibilityAnimation;
    public final /* synthetic */ C0981AMm<Integer, Boolean> $renderingCompletedIndices;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRichResponseContentKt$HatchRichResponseContent$2$1(boolean z, C0981AMm<Integer, Boolean> c0981AMm) {
        super(1);
        this.$disableVisibilityAnimation = z;
        this.$renderingCompletedIndices = c0981AMm;
    }

    public final Boolean invoke(int i) {
        boolean z = true;
        if (!this.$disableVisibilityAnimation && i != 0 && !C7384Etj.areEqual(this.$renderingCompletedIndices.get(Integer.valueOf(i - 1)), true)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(AnonymousClass001.A0F(num));
    }
}
