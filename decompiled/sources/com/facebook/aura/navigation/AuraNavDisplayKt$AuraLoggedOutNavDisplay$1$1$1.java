package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraNavDisplayKt$AuraLoggedOutNavDisplay$1$1$1 extends AbstractC7559F3s implements G0U<C5rn<AuraNavKey>, Unit> {
    public static final AuraNavDisplayKt$AuraLoggedOutNavDisplay$1$1$1 INSTANCE = new AuraNavDisplayKt$AuraLoggedOutNavDisplay$1$1$1();

    public AuraNavDisplayKt$AuraLoggedOutNavDisplay$1$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        int[] iArr = {0, 1, 2};
        int i = 0;
        do {
            AnonymousClass801.A0Y(iArr[i], c5rn);
            i++;
        } while (i < 3);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C5rn<AuraNavKey> c5rn) {
        invoke2(c5rn);
        return Unit.INSTANCE;
    }
}
