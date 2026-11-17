package com.facebook.aura.settings.support;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$TopicCard$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<String, Unit> $onTopicSelected;
    public final /* synthetic */ String $selectedTopic;
    public final /* synthetic */ AHD<HatchSupportTopicOption> $topics;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<HatchSupportTopicOption> ahd = this.$topics;
        String str = this.$selectedTopic;
        boolean z = this.$enabled;
        G0U<String, Unit> g0u = this.$onTopicSelected;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new HatchContactSupportScreenKt$TopicCard$1$1$1$1((HatchSupportTopicOption) it.next(), str, z, g0u), -1215939586);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportScreenKt$TopicCard$1$1(AHD<HatchSupportTopicOption> ahd, String str, boolean z, G0U<? super String, Unit> g0u) {
        super(1);
        this.$topics = ahd;
        this.$selectedTopic = str;
        this.$enabled = z;
        this.$onTopicSelected = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
