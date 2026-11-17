package com.facebook.aura.nodes;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import com.facebook.aura.localbrowser.LocalBrowserEndpointNodeInvocationProvider;
import com.facebook.aura.localbrowser.LocalBrowserNodeInvocationProvider;
import com.facebook.aura.nodes.api.HatchNodeInvocationHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchNodeInvocationDispatcher$handlers$2 extends AbstractC7559F3s implements Function0<List<? extends HatchNodeInvocationHandler>> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends HatchNodeInvocationHandler> invoke() {
        HatchNodeInvocationHandler hatchNodeInvocationHandlerHandler;
        int[] iArr = {0, 1};
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 == 0) {
                hatchNodeInvocationHandlerHandler = LocalBrowserEndpointNodeInvocationProvider.INSTANCE.handler(abstractC3358CGz);
            } else {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                hatchNodeInvocationHandlerHandler = LocalBrowserNodeInvocationProvider.INSTANCE.handler(abstractC3358CGz);
            }
            arrayList.add(hatchNodeInvocationHandlerHandler);
            i++;
        } while (i < 2);
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeInvocationDispatcher$handlers$2(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }
}
