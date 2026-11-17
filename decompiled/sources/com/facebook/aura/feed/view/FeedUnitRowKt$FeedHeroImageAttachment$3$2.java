package com.facebook.aura.feed.view;

import X.ARL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B18;
import X.BFM;
import X.BIj;
import X.BL4;
import X.BRg;
import X.C1062ATq;
import X.C10G;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedHeroImageAttachment$3$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $imageFailed$delegate;
    public final /* synthetic */ String $imageLabel;
    public final /* synthetic */ MutableState<BL4> $mediaSizePx$delegate;
    public final /* synthetic */ String $resolvedUrl;
    public final /* synthetic */ boolean $showFailedPlaceholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedHeroImageAttachment$3$2(String str, boolean z, String str2, MutableState<Boolean> mutableState, MutableState<BL4> mutableState2) {
        super(2);
        this.$resolvedUrl = str;
        this.$showFailedPlaceholder = z;
        this.$imageLabel = str2;
        this.$imageFailed$delegate = mutableState;
        this.$mediaSizePx$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            String str = this.$resolvedUrl;
            ARL arl = B18.A00;
            G0V<BFM, Integer, Unit> g0v = null;
            C1062ATq c1062ATq = C10G.A01;
            MutableState<BL4> mutableState = this.$mediaSizePx$delegate;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new FeedUnitRowKt$FeedHeroImageAttachment$3$2$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = BIj.A00(c1062ATq, (G0U) objAaT);
            if (this.$showFailedPlaceholder) {
                g0v = ComposableSingletons$FeedUnitRowKt.f56lambda$1813406079;
            }
            String str2 = this.$imageLabel;
            boolean zA65 = bfm.A65(this.$imageFailed$delegate);
            MutableState<Boolean> mutableState2 = this.$imageFailed$delegate;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new FeedUnitRowKt$FeedHeroImageAttachment$3$2$2$1(mutableState2);
                bfm.Ai0(objAaT2);
            }
            AuraImageKt.m2573AuraImageXRP3Ue8(str, bRgA00, arl, str2, null, false, null, 0L, true, false, false, g0v, null, (Function0) objAaT2, null, bfm, 100663728, 0, 22256);
            return;
        }
        bfm.Afo();
    }
}
