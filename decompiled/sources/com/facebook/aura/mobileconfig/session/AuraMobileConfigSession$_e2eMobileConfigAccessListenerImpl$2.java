package com.facebook.aura.mobileconfig.session;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9u;
import X.CGP;
import X.G0U;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraMobileConfigSession$_e2eMobileConfigAccessListenerImpl$2 extends AbstractC7559F3s implements Function0<CGP> {
    public static final AuraMobileConfigSession$_e2eMobileConfigAccessListenerImpl$2 INSTANCE = new AuraMobileConfigSession$_e2eMobileConfigAccessListenerImpl$2();

    /* renamed from: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession$_e2eMobileConfigAccessListenerImpl$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Integer invoke(Long l) {
            return Integer.valueOf((int) l.longValue());
        }

        public final Integer invoke(long j) {
            return Integer.valueOf((int) j);
        }
    }

    public AuraMobileConfigSession$_e2eMobileConfigAccessListenerImpl$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CGP invoke() {
        return new CGP(C3cG.A06(), C9u.A00, AnonymousClass1.INSTANCE);
    }
}
