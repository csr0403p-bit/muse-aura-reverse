package com.facebook.aura.ui.sharedelement;

import X.AOB;
import X.AOe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.EnumC04711Bv;
import X.G0W;

/* loaded from: classes4.dex */
public final class HatchSharedElementKt$rememberSharedElementClipParticipant$progress$1 extends AbstractC7559F3s implements G0W<AOB<EnumC04711Bv>, BFM, Integer, AOe<Float>> {
    public final /* synthetic */ SharedElementClipRegistry $registry;
    public final /* synthetic */ String $sharedKey;
    public final /* synthetic */ Integer $transitionDurationMillis;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedElementKt$rememberSharedElementClipParticipant$progress$1(SharedElementClipRegistry sharedElementClipRegistry, String str, Integer num) {
        super(3);
        this.$registry = sharedElementClipRegistry;
        this.$sharedKey = str;
        this.$transitionDurationMillis = num;
    }

    public final AOe<Float> invoke(AOB<EnumC04711Bv> aob, BFM bfm, int i) {
        bfm.AgE(783328444);
        AOe<Float> aOeHatchSharedElementAnimationSpec = HatchSharedElementKt.hatchSharedElementAnimationSpec(this.$registry.activeTransformFor(this.$sharedKey), this.$transitionDurationMillis);
        AnonymousClass002.A19(bfm);
        return aOeHatchSharedElementAnimationSpec;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ AOe<Float> invoke(AOB<EnumC04711Bv> aob, BFM bfm, Integer num) {
        return invoke(aob, bfm, AnonymousClass001.A0F(num));
    }
}
