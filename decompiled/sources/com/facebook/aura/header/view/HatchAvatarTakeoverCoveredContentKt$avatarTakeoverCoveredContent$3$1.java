package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AkZ;
import X.C1528Akh;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1535Akr;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredContent$3$1 extends AbstractC7559F3s implements G0U<AkZ, Unit> {
    public static final HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredContent$3$1 INSTANCE = new HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredContent$3$1();

    public HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredContent$3$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AkZ akZ) {
        C7384Etj.A0Y(akZ, 0);
        akZ.Ads(AnonymousClass1.INSTANCE);
    }

    /* renamed from: com.facebook.aura.header.view.HatchAvatarTakeoverCoveredContentKt$avatarTakeoverCoveredContent$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<InterfaceC1535Akr, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC1535Akr interfaceC1535Akr) {
            C7384Etj.A0Y(interfaceC1535Akr, 0);
            ((C1528Akh) interfaceC1535Akr).A00 = true;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1535Akr interfaceC1535Akr) {
            invoke2(interfaceC1535Akr);
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AkZ akZ) {
        invoke2(akZ);
        return Unit.INSTANCE;
    }
}
