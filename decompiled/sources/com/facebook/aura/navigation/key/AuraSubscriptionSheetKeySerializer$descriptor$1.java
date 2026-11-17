package com.facebook.aura.navigation.key;

import X.AbstractC7559F3s;
import X.C0881AGi;
import X.C7384Etj;
import X.C9e5;
import X.C9iZ;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKeySerializer$descriptor$1 extends AbstractC7559F3s implements G0U<C9e5, Unit> {
    public static final AuraSubscriptionSheetKeySerializer$descriptor$1 INSTANCE = new AuraSubscriptionSheetKeySerializer$descriptor$1();

    public AuraSubscriptionSheetKeySerializer$descriptor$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C9e5 c9e5) {
        C7384Etj.A0Y(c9e5, 0);
        C9iZ descriptor = AuraSubscriptionSheetKeySerializer.pageSerializer.getDescriptor();
        C0881AGi c0881AGi = C0881AGi.A00;
        C9e5.A00("initialPage", c0881AGi, c9e5, descriptor, true);
        C9e5.A00("entryPoint", c0881AGi, c9e5, AuraSubscriptionSheetKeySerializer.entryPointSerializer.getDescriptor(), true);
        C9e5.A00("canonicalNmeEntryPoint", c0881AGi, c9e5, AuraSubscriptionSheetKeySerializer.canonicalEntryPointSerializer.getDescriptor(), true);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C9e5 c9e5) {
        invoke2(c9e5);
        return Unit.INSTANCE;
    }
}
