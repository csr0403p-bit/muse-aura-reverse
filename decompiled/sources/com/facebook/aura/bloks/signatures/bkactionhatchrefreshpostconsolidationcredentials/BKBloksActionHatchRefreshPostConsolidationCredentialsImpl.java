package com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials;

import X.AbstractC7559F3s;
import X.AbstractC7691FAk;
import X.AnonymousClass003;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.F6D;
import X.FBB;
import X.FBD;
import X.Hj6;
import X.HsM;
import com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialCarrier;
import com.facebook.aura.bloks.host.AuraBloksHost;
import com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials.HatchPostConsolidationRefreshStartupGate;
import com.facebook.aura.ccv.relay.HatchCcvPresentationScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class BKBloksActionHatchRefreshPostConsolidationCredentialsImpl {
    public static final String TAG = "BKBloksActionHatchRefreshPostConsolidationCredentialsImpl";
    public static final BKBloksActionHatchRefreshPostConsolidationCredentialsImpl INSTANCE = new BKBloksActionHatchRefreshPostConsolidationCredentialsImpl();
    public static final HatchPostConsolidationRefreshStartupGate refreshStartupGate = new HatchPostConsolidationRefreshStartupGate(HatchPostConsolidationRefreshStartupGate.AnonymousClass1.INSTANCE);

    private final void reportCallbackNow(HsM hsM, F6D f6d) {
        AbstractC7691FAk.A00(f6d, Hj6.A02, hsM);
    }

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        AuraBloksHost auraBloksHost;
        HatchPostConsolidationCredentialCarrier hatchPostConsolidationCredentialCarrier;
        AnonymousClass003.A0u(hj6, f6d);
        HsM hsMA0B = C7384Etj.A0B(hj6.A01, 2);
        HsM hsMA0B2 = C7384Etj.A0B(hj6.A01, 3);
        HatchCcvPresentationScope.Presentation presentationCurrent = HatchCcvPresentationScope.INSTANCE.current();
        if (presentationCurrent == null) {
            CFK.A06(TAG, "No active CCV presentation to scope credential refresh; failing fast");
            AbstractC7691FAk.A00(f6d, Hj6.A02, hsMA0B2);
            return null;
        }
        FBB fbb = f6d.A02;
        FBD fbd = fbb != null ? fbb.A02 : null;
        if (!(fbd instanceof AuraBloksHost) || (auraBloksHost = (AuraBloksHost) fbd) == null || (hatchPostConsolidationCredentialCarrier = auraBloksHost.mPostConsolidationCredentialCarrier) == null) {
            CFK.A06(TAG, "No survivor credential carrier on the Bloks host");
            AbstractC7691FAk.A00(f6d, Hj6.A02, hsMA0B2);
            return null;
        }
        if (refreshStartupGate.start(new BKBloksActionHatchRefreshPostConsolidationCredentialsImpl$evaluate$job$1(presentationCurrent, hatchPostConsolidationCredentialCarrier, hsMA0B, hsMA0B2, f6d)) == null) {
            AbstractC7691FAk.A00(f6d, Hj6.A02, hsMA0B2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportCallbackIfActive(final HatchCcvPresentationScope.Presentation presentation, final HsM hsM, final F6D f6d) {
        C60O.A02().post(new Runnable() { // from class: com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials.BKBloksActionHatchRefreshPostConsolidationCredentialsImpl.reportCallbackIfActive.1

            /* renamed from: com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials.BKBloksActionHatchRefreshPostConsolidationCredentialsImpl$reportCallbackIfActive$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00501 extends AbstractC7559F3s implements Function0<Unit> {
                public final /* synthetic */ HsM $callback;
                public final /* synthetic */ F6D $environment;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00501(HsM hsM, F6D f6d) {
                    super(0);
                    this.$callback = hsM;
                    this.$environment = f6d;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    HsM hsM = this.$callback;
                    AbstractC7691FAk.A00(this.$environment, Hj6.A02, hsM);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                presentation.runIfActive(new C00501(hsM, f6d));
            }
        });
    }
}
