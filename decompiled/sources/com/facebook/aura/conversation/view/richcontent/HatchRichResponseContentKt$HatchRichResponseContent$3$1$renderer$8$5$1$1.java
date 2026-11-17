package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2l;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8$5$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $effectiveMimeType;
    public final /* synthetic */ MutableState<String> $fetchedTitle$delegate;
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ String $path;
    public final /* synthetic */ G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> $previewer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8$5$1$1(G2l<? super String, ? super String, ? super String, ? super G0U<? super String, Unit>, ? super BFM, ? super Integer, Unit> g2l, String str, String str2, String str3, MutableState<String> mutableState) {
        super(2);
        this.$previewer = g2l;
        this.$path = str;
        this.$fileExtension = str2;
        this.$effectiveMimeType = str3;
        this.$fetchedTitle$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            G2l<String, String, String, G0U<? super String, Unit>, BFM, Integer, Unit> g2l = this.$previewer;
            String str = this.$path;
            String str2 = this.$fileExtension;
            String str3 = this.$effectiveMimeType;
            boolean zA65 = bfm.A65(this.$fetchedTitle$delegate);
            MutableState<String> mutableState = this.$fetchedTitle$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8$5$1$1$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            g2l.invoke(str, str2, str3, objAaT, bfm, 0);
            return;
        }
        bfm.Afo();
    }
}
