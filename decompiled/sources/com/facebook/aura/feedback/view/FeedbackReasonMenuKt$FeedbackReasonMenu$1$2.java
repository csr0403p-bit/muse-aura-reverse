package com.facebook.aura.feedback.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.BS0;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class FeedbackReasonMenuKt$FeedbackReasonMenu$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
    public static final FeedbackReasonMenuKt$FeedbackReasonMenu$1$2 INSTANCE = new FeedbackReasonMenuKt$FeedbackReasonMenu$1$2();

    public FeedbackReasonMenuKt$FeedbackReasonMenu$1$2() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }

    public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
        bfm.AgE(-289889697);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12029c);
        BS0 bs0 = BRg.A00;
        AHH ahhA0C = AGI.A0C(Arrays.asList(new AuraContextMenuItem(0, strA01, null, null, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(1, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12029d), null, null, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12029e), null, null, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(3, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12029a), null, null, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(4, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12029b), null, null, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(5, "", null, null, null, null, false, true, false, true, false, bs0, 1, 1), new AuraContextMenuItem(6, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12029f), null, null, null, null, false, false, false, true, false, bs0, 1, 1)));
        AnonymousClass001.A1D(bfm);
        return ahhA0C;
    }
}
