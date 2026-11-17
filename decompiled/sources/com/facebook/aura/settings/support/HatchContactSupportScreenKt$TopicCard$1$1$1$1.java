package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.settings.support.HatchSupportTopicLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$TopicCard$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<String, Unit> $onTopicSelected;
    public final /* synthetic */ String $selectedTopic;
    public final /* synthetic */ HatchSupportTopicOption $topic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportScreenKt$TopicCard$1$1$1$1(HatchSupportTopicOption hatchSupportTopicOption, String str, boolean z, G0U<? super String, Unit> g0u) {
        super(3);
        this.$topic = hatchSupportTopicOption;
        this.$selectedTopic = str;
        this.$enabled = z;
        this.$onTopicSelected = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        String strA0e;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchSupportTopicLabel hatchSupportTopicLabel = this.$topic.label;
            if (hatchSupportTopicLabel instanceof HatchSupportTopicLabel.Resource) {
                bfm.AgE(-286832963);
                strA0e = AnonymousClass003.A0e(bfm, ((HatchSupportTopicLabel.Resource) hatchSupportTopicLabel).value);
            } else if (hatchSupportTopicLabel instanceof HatchSupportTopicLabel.Text) {
                AnonymousClass003.A0l(bfm, -286830109);
                strA0e = ((HatchSupportTopicLabel.Text) hatchSupportTopicLabel).value;
            } else {
                throw AnonymousClass005.A0k(bfm, -286835640);
            }
            boolean zAreEqual = C7384Etj.areEqual(this.$topic.slug, this.$selectedTopic);
            boolean z = this.$enabled;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$topic, bfm.A65(this.$onTopicSelected));
            G0U<String, Unit> g0u = this.$onTopicSelected;
            HatchSupportTopicOption hatchSupportTopicOption = this.$topic;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchContactSupportScreenKt$TopicCard$1$1$1$1$1$1(g0u, hatchSupportTopicOption);
                bfm.Ai0(objAaT);
            }
            HatchContactSupportScreenKt.TopicRow(strA0e, zAreEqual, z, (Function0) objAaT, null, bfm, 0, 16);
            return;
        }
        bfm.Afo();
    }
}
