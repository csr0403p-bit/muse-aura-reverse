package com.facebook.aura.ageverification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60Q;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.AgeVerificationClient$uploadAndSubmit$oversized$1", f = "AgeVerificationClient.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class AgeVerificationClient$uploadAndSubmit$oversized$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ List<HxE<AgeVerificationUpload, File>> $captured;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgeVerificationClient$uploadAndSubmit$oversized$1(List<? extends HxE<AgeVerificationUpload, ? extends File>> list, HtJ<? super AgeVerificationClient$uploadAndSubmit$oversized$1> htJ) {
        super(2, htJ);
        this.$captured = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgeVerificationClient$uploadAndSubmit$oversized$1(this.$captured, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new AgeVerificationClient$uploadAndSubmit$oversized$1(this.$captured, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        List<HxE<AgeVerificationUpload, File>> list = this.$captured;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<HxE<AgeVerificationUpload, File>> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HxE hxEA10 = C60Q.A10(it);
                AgeVerificationUpload ageVerificationUpload = (AgeVerificationUpload) hxEA10.first;
                long length = ((File) hxEA10.second).length();
                Long l = ageVerificationUpload.maxBytes;
                if (length > (l != null ? l.longValue() : LinkEncryptedPairingKt.LINK_COUNTER_MAX)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
