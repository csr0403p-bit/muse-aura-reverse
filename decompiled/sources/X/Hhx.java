package X;

import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.iap.internal.mutator.IapMutator", f = "IapMutator.kt", l = {268}, m = "getPurchaseQuoteAsync", v = 2)
/* loaded from: classes6.dex */
public final class Hhx extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IapMutator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hhx(IapMutator iapMutator, HtJ<? super Hhx> htJ) {
        super(htJ);
        this.this$0 = iapMutator;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        IapMutator iapMutator = this.this$0;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        if (i2 != 0) {
            if (i2 != 1) {
                throw AnonymousClass001.A0n();
            }
            boolean z = this.Z$0;
            Hwg.A00(obj);
            Object objA01 = IapMutator.A01((F1G) obj, z);
            Hwg.A00(objA01);
            return objA01;
        }
        Hwg.A00(obj);
        C8197FYo c8197FYo = new C8197FYo(13, iapMutator, new AtomicBoolean());
        try {
            AbstractC7535F0i.A00().toString();
            throw BV4.A0a("getPlatform");
        } catch (Throwable th) {
            c8197FYo.invoke();
            throw th;
        }
    }
}
