package com.facebook.aura.user.provider;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class AuraViewerDataProvider$updateUserData$editor$1 extends AbstractC7559F3s implements G0U<AgeCheckMethod, CharSequence> {
    public static final AuraViewerDataProvider$updateUserData$editor$1 INSTANCE = new AuraViewerDataProvider$updateUserData$editor$1();

    public AuraViewerDataProvider$updateUserData$editor$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(AgeCheckMethod ageCheckMethod) {
        AgeCheckMethod ageCheckMethod2 = ageCheckMethod;
        C7384Etj.A0Y(ageCheckMethod2, 0);
        return ageCheckMethod2.name();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(AgeCheckMethod ageCheckMethod) {
        C7384Etj.A0Y(ageCheckMethod, 0);
        return ageCheckMethod.name();
    }
}
