package com.facebook.aura.nodes.registry;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchNodeCommandRegistry$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchNodeCommandRegistry> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeCommandRegistry$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz, Context context) {
        super(0);
        this.$userSession = abstractC3358CGz;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchNodeCommandRegistry invoke() {
        return new HatchNodeCommandRegistry(this.$userSession, AnonymousClass001.A0I(this.$context));
    }
}
