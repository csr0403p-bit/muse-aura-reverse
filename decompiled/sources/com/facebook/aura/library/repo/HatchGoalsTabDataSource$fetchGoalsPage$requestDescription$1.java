package com.facebook.aura.library.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.HxE;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$fetchGoalsPage$requestDescription$1 extends AbstractC7559F3s implements G0U<HxE<? extends String, ? extends String>, CharSequence> {
    public static final HatchGoalsTabDataSource$fetchGoalsPage$requestDescription$1 INSTANCE = new HatchGoalsTabDataSource$fetchGoalsPage$requestDescription$1();

    public HatchGoalsTabDataSource$fetchGoalsPage$requestDescription$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(HxE<String, String> hxE) {
        C7384Etj.A0Y(hxE, 0);
        return FGI.A0U(hxE.first, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, hxE.second);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(HxE<? extends String, ? extends String> hxE) {
        return invoke2((HxE<String, String>) hxE);
    }
}
