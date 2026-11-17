package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraNavDisplayKt$AuraNavDisplay$1$1 extends AbstractC7559F3s implements G0U<C5rn<AuraNavKey>, Unit> {
    public static final AuraNavDisplayKt$AuraNavDisplay$1$1 INSTANCE = new AuraNavDisplayKt$AuraNavDisplay$1$1();

    public AuraNavDisplayKt$AuraNavDisplay$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        int[] iArrA0n = AnonymousClass801.A0n();
        int i = 0;
        do {
            AnonymousClass801.A0Z(iArrA0n[i], c5rn);
            i++;
        } while (i < 127);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C5rn<AuraNavKey> c5rn) {
        invoke2(c5rn);
        return Unit.INSTANCE;
    }
}
