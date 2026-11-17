package com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C06H;
import X.C31u;
import X.C7384Etj;
import X.InterfaceC7359EnW;
import com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchPostConsolidationRefreshStartupGate {
    public static final Companion Companion = new Companion();
    public static final C31u<Object, Boolean> isKilledByMobileConfig$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.disable_post_consolidation_refresh);
    public final Function0<Boolean> isKilled;

    /* renamed from: com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials.HatchPostConsolidationRefreshStartupGate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchPostConsolidationRefreshStartupGate.Companion.isKilledByMobileConfig());
        }
    }

    public final class Companion {
        public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(Companion.class, "isKilledByMobileConfig", "isKilledByMobileConfig()Z");

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isKilledByMobileConfig() {
            return C31u.A01(this, HatchPostConsolidationRefreshStartupGate.isKilledByMobileConfig$delegate, $$delegatedProperties, 0);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchPostConsolidationRefreshStartupGate(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        this.isKilled = function0;
    }

    public final <T> T start(Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 0);
        if (AnonymousClass003.A1Y(this.isKilled)) {
            return null;
        }
        return function0.invoke();
    }

    public /* synthetic */ HatchPostConsolidationRefreshStartupGate(Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    public HatchPostConsolidationRefreshStartupGate() {
        this(AnonymousClass1.INSTANCE);
    }
}
