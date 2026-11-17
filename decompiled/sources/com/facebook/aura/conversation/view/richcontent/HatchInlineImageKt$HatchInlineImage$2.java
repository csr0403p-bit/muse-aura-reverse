package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImage$2 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineImage$2(G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(3);
        this.$content = g0v;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
        invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AnonymousClass006.A1Q(bfm, this.$content);
        } else {
            bfm.Afo();
        }
    }
}
