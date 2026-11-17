package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.AppearancePaths;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchStatusVideoCache$store$cached$1 extends AbstractC7559F3s implements G0U<AppearancePaths, List<? extends String>> {
    public static final HatchStatusVideoCache$store$cached$1 INSTANCE = new HatchStatusVideoCache$store$cached$1();

    public HatchStatusVideoCache$store$cached$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ List<? extends String> invoke(AppearancePaths appearancePaths) {
        AppearancePaths appearancePaths2 = appearancePaths;
        C7384Etj.A0Y(appearancePaths2, 0);
        return appearancePaths2.light;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<String> invoke2(AppearancePaths appearancePaths) {
        C7384Etj.A0Y(appearancePaths, 0);
        return appearancePaths.light;
    }
}
