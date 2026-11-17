package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0V;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0W<Function0<Unit>, BFM, Integer, Unit> $markdownContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$1(G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g0w) {
        super(2);
        this.$markdownContent = g0w;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            G0W<Function0<Unit>, BFM, Integer, Unit> g0w = this.$markdownContent;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1G(objAaT, bfm, g0w, 54);
            return;
        }
        bfm.Afo();
    }
}
