package com.facebook.aura.navigation;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BRL;
import X.C1Vj;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class BottomSheetScene$content$1$rememberedSheetState$1$1 extends AbstractC7559F3s implements G0U<C1Vj, Boolean> {
    public final /* synthetic */ BottomSheetScene<T> this$0;

    @Override // X.G0U
    public final Boolean invoke(C1Vj c1Vj) {
        C7384Etj.A0Y(c1Vj, 0);
        Object obj = ((BRL) AbstractC0878AGe.A0H(this.this$0.getSceneState().sheetEntries)).A02.get(BottomSheetSceneStrategy.DISMISSIBLE_KEY);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return Boolean.valueOf((AnonymousClass002.A1b(obj, false) && c1Vj == C1Vj.Hidden) ? false : true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScene$content$1$rememberedSheetState$1$1(BottomSheetScene<T> bottomSheetScene) {
        super(1);
        this.this$0 = bottomSheetScene;
    }
}
