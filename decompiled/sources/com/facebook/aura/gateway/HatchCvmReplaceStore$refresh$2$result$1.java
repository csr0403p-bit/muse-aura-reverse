package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmReplaceStore$refresh$2$result$1", f = "HatchCvmReplaceStore.kt", l = {89}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCvmReplaceStore$refresh$2$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HatchCvmReplacement>, Object> {
    public final /* synthetic */ HatchCvmReplaceSource $source;
    public final /* synthetic */ String $vmId;
    public Object L$0;
    public int label;
    public final /* synthetic */ HatchCvmReplaceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCvmReplaceStore$refresh$2$result$1(HatchCvmReplaceStore hatchCvmReplaceStore, String str, HatchCvmReplaceSource hatchCvmReplaceSource, HtJ<? super HatchCvmReplaceStore$refresh$2$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchCvmReplaceStore;
        this.$vmId = str;
        this.$source = hatchCvmReplaceSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchCvmReplaceStore$refresh$2$result$1(this.this$0, this.$vmId, this.$source, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchGatewayPrefsStore companion;
        HatchCvmReplacement value;
        HatchCvmReplacement hatchCvmReplacement;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            companion = HatchGatewayPrefsStore.Companion.getInstance(this.this$0.userSession);
            if (C7384Etj.areEqual(C3cG.A0a(companion), this.$vmId)) {
                if (this.$source == HatchCvmReplaceSource.PUSH) {
                    HatchCvmReplaceReadPolicy.Companion.getInstance(this.this$0.userSession).rearm(this.$vmId);
                }
                HatchCvmReplaceStateRepository hatchCvmReplaceStateRepository = HatchCvmReplaceStateRepository.INSTANCE;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                String str = this.$vmId;
                this.L$0 = companion;
                this.label = 1;
                obj = hatchCvmReplaceStateRepository.read(abstractC3358CGz, str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return null;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        companion = (HatchGatewayPrefsStore) this.L$0;
        Hwg.A00(obj);
        HatchCvmReplacement hatchCvmReplacement2 = (HatchCvmReplacement) obj;
        if (hatchCvmReplacement2 != null && C7384Etj.areEqual(C3cG.A0a(companion), this.$vmId)) {
            if ((hatchCvmReplacement2 instanceof HatchCvmReplacement.None) || (hatchCvmReplacement2 instanceof HatchCvmReplacement.Active)) {
                BLG<HatchCvmReplacement> blg = this.this$0._replacement;
                do {
                    value = blg.getValue();
                    hatchCvmReplacement = value;
                } while (!blg.A6e(value, hatchCvmReplacement2));
                this.this$0.logObserved(hatchCvmReplacement, hatchCvmReplacement2, this.$source);
            }
            return hatchCvmReplacement2;
        }
        return null;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super HatchCvmReplacement> htJ) {
        return ((HatchCvmReplaceStore$refresh$2$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
