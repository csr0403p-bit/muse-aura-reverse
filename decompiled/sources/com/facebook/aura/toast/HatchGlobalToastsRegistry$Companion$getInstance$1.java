package com.facebook.aura.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGlobalToastsRegistry$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchGlobalToastsRegistry> {
    public final /* synthetic */ Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGlobalToastsRegistry$Companion$getInstance$1(Context context) {
        super(0);
        this.$appContext = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchGlobalToastsRegistry invoke() {
        return new HatchGlobalToastsRegistry(AnonymousClass001.A0I(this.$appContext));
    }
}
