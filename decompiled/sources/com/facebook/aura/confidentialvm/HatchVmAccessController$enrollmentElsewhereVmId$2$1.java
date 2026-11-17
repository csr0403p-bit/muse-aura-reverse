package com.facebook.aura.confidentialvm;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.store.HatchCvmChipClaim;
import com.facebook.aura.gateway.store.HatchCvmChipClaimStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.HatchVmAccessController$enrollmentElsewhereVmId$2$1", f = "HatchVmAccessController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmAccessController$enrollmentElsewhereVmId$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchCvmChipClaim>, Object> {
    public final /* synthetic */ String $it;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmAccessController$enrollmentElsewhereVmId$2$1(String str, HtJ<? super HatchVmAccessController$enrollmentElsewhereVmId$2$1> htJ) {
        super(2, htJ);
        this.$it = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVmAccessController$enrollmentElsewhereVmId$2$1(this.$it, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchCvmChipClaim> htJ) {
        return new HatchVmAccessController$enrollmentElsewhereVmId$2$1(this.$it, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return HatchCvmChipClaimStore.INSTANCE.read(this.$it);
    }
}
