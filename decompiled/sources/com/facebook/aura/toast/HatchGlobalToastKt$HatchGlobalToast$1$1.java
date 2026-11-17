package com.facebook.aura.toast;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.BLG;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import android.content.Context;
import com.facebook.aura.toast.HatchGlobalToastsRegistry;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchGlobalToastKt$HatchGlobalToast$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ Object $mount;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGlobalToastKt$HatchGlobalToast$1$1(AbstractC3358CGz abstractC3358CGz, Context context, Object obj) {
        super(1);
        this.$userSession = abstractC3358CGz;
        this.$appContext = context;
        this.$mount = obj;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        List<Object> value;
        HatchGlobalToastsRegistry.Companion companion = HatchGlobalToastsRegistry.Companion;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        Context context = this.$appContext;
        C7384Etj.A0X(context);
        final BLG<List<Object>> blg = companion.getInstance(abstractC3358CGz, context).mounts;
        Object obj = this.$mount;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AbstractC0878AGe.A0Q(obj, value)));
        final Object obj2 = this.$mount;
        return new C78g() { // from class: com.facebook.aura.toast.HatchGlobalToastKt$HatchGlobalToast$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Object value2;
                BLG blg2 = blg;
                do {
                    value2 = blg2.getValue();
                } while (!blg2.A6e(value2, AbstractC0878AGe.A0b((Iterable) value2, obj2)));
            }
        };
    }
}
