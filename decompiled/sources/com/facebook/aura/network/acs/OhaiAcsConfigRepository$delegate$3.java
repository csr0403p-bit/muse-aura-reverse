package com.facebook.aura.network.acs;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class OhaiAcsConfigRepository$delegate$3 extends AbstractC7559F3s implements G0V<String, Long, Unit> {
    public static final OhaiAcsConfigRepository$delegate$3 INSTANCE = new OhaiAcsConfigRepository$delegate$3();

    public OhaiAcsConfigRepository$delegate$3() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, Long l) {
        invoke(str, C3cG.A05(l));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, long j) {
        C7384Etj.A0Y(str, 0);
        OhaiAcsConfigRepository.store.save(str, j);
    }
}
