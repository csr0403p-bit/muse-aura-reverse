package com.facebook.aura.model;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes2.dex */
public final class HatchContentCache$cache$1 extends AbstractC7559F3s implements G0V<String, HatchContentViewModelData, Long> {
    public static final HatchContentCache$cache$1 INSTANCE = new HatchContentCache$cache$1();

    public HatchContentCache$cache$1() {
        super(2);
    }

    @Override // X.G0V
    public final Long invoke(String str, HatchContentViewModelData hatchContentViewModelData) {
        C7384Etj.A0Y(hatchContentViewModelData, 1);
        return Long.valueOf(HatchContentCache.INSTANCE.estimatedWeightBytes(hatchContentViewModelData));
    }
}
