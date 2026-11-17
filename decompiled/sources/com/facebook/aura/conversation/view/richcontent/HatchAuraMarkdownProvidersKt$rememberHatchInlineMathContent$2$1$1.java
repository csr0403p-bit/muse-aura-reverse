package com.facebook.aura.conversation.view.richcontent;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B18;
import X.B1T;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1SA;
import X.G0W;
import android.graphics.Bitmap;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$2$1$1 extends AbstractC7559F3s implements G0W<String, BFM, Integer, Unit> {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ AXN $density;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$2$1$1(AXN axn, Bitmap bitmap) {
        super(3);
        this.$density = axn;
        this.$bitmap = bitmap;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, BFM bfm, Integer num) {
        invoke(str, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            float fAgy = this.$density.Agy(this.$bitmap.getWidth());
            float fAgy2 = this.$density.Agy(this.$bitmap.getHeight());
            C1SA.A01(bfm, null, C10G.A0C(BRg.A00, fAgy, fAgy2), new B1T(this.$bitmap), B18.A02, null, 24624, 232);
            return;
        }
        bfm.Afo();
    }
}
