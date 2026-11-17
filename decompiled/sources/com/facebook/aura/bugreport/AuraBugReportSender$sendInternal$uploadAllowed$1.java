package com.facebook.aura.bugreport;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import com.facebook.aura.auth.AuraSessionManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraBugReportSender$sendInternal$uploadAllowed$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ Function0<Boolean> $mayUpload;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportSender$sendInternal$uploadAllowed$1(Function0<Boolean> function0, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$mayUpload = function0;
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AbstractC3358CGz abstractC3358CGz;
        return Boolean.valueOf(AnonymousClass003.A1Y(this.$mayUpload) && ((abstractC3358CGz = this.$userSession) == null || AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz)));
    }
}
