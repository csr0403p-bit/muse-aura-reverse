package com.facebook.aura.appupdate;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7OU;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.appupdate.PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1", f = "PlayInAppUpdateEffect.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraPlayUpdateController $controller;
    public final /* synthetic */ C7OU<IntentSenderRequest, ActivityResult> $launcher;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1(AuraPlayUpdateController auraPlayUpdateController, C7OU<IntentSenderRequest, ActivityResult> c7ou, HtJ<? super PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1> htJ) {
        super(2, htJ);
        this.$controller = auraPlayUpdateController;
        this.$launcher = c7ou;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1(this.$controller, this.$launcher, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<G0U<AuraPlayFlexibleUpdateResult, Unit>> c22i = AuraPlayFlexibleUpdateRequests.requests;
            final AuraPlayUpdateController auraPlayUpdateController = this.$controller;
            final C7OU<IntentSenderRequest, ActivityResult> c7ou = this.$launcher;
            C20Z<? super G0U<AuraPlayFlexibleUpdateResult, Unit>> c20z = new C20Z() { // from class: com.facebook.aura.appupdate.PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1.1
                public final Object emit(G0U<? super AuraPlayFlexibleUpdateResult, Unit> g0u, HtJ<? super Unit> htJ) {
                    auraPlayUpdateController.requestFlexibleUpdate(c7ou, g0u);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((G0U<? super AuraPlayFlexibleUpdateResult, Unit>) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
