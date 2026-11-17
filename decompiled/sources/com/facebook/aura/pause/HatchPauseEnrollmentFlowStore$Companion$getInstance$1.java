package com.facebook.aura.pause;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3cG;
import android.content.Context;
import com.facebook.aura.common.appcontext.AuraAppContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchPauseEnrollmentFlowStore$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchPauseEnrollmentFlowStore> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseEnrollmentFlowStore$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchPauseEnrollmentFlowStore invoke() {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null) {
            throw C3cG.A0Q("Application context not available");
        }
        int i = HatchPauseEnrollmentFlowStore.$stable;
        return new HatchPauseEnrollmentFlowStore(this.$userSession, HatchPauseEnrollmentFlowStoreKt.getPauseHatchFlowDataStore(context));
    }
}
