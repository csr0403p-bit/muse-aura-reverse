package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.payments.dcp.xapp.controller.IapController;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.meta.health.core.ObserverBuffer;
import kotlin.Unit;

/* renamed from: X.FtB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8894FtB extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8894FtB(ObserverBuffer observerBuffer, HtJ<? super C8894FtB> htJ) {
        super(2, htJ);
        this.$t = 5;
        this.A05 = observerBuffer;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        switch (this.$t) {
            case 0:
                C8894FtB c8894FtB = new C8894FtB((InterfaceC9037FxJ) this.A02, (C9042FxO) this.A01, htJ);
                c8894FtB.A03 = obj;
                return c8894FtB;
            case 1:
                obj2 = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                obj6 = this.A04;
                i = 1;
                break;
            case 2:
                Object obj7 = this.A01;
                return new C8894FtB(this.A02, this.A05, this.A03, obj7, htJ, 2);
            case 3:
                obj2 = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                obj6 = this.A04;
                i = 3;
                break;
            case 4:
                C8894FtB c8894FtB2 = new C8894FtB((MetaAiRsysSdkRealTimeSession) this.A05, htJ, (G0U) this.A01);
                c8894FtB2.A02 = obj;
                return c8894FtB2;
            case 5:
                return new C8894FtB((ObserverBuffer) this.A05, htJ);
            default:
                Object obj8 = this.A03;
                Object obj9 = this.A01;
                C8894FtB c8894FtB3 = new C8894FtB(this.A02, this.A05, obj8, obj9, htJ, 6);
                c8894FtB3.A04 = obj;
                return c8894FtB3;
        }
        return new C8894FtB(obj3, obj4, obj6, obj2, obj5, htJ, i);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C8894FtB c8894FtB;
        if (5 - this.$t != 0) {
            c8894FtB = (C8894FtB) C8j3.A1E(obj2, obj, this);
        } else {
            c8894FtB = new C8894FtB((ObserverBuffer) this.A05, (HtJ) obj2);
        }
        return c8894FtB.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r6.A03 == null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.BLa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00df -> B:24:0x008b). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8894FtB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FxO<TT;>;LX/FxJ;LX/HtJ<-LX/FtB;>;)V */
    public C8894FtB(InterfaceC9037FxJ interfaceC9037FxJ, C9042FxO c9042FxO, HtJ htJ) {
        super(2, htJ);
        this.$t = 0;
        this.A01 = c9042FxO;
        this.A02 = interfaceC9037FxJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession;LX/HtJ<-LX/FtB;>;)V */
    public C8894FtB(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, HtJ htJ, G0U g0u) {
        super(2, htJ);
        this.$t = 4;
        this.A01 = g0u;
        this.A05 = metaAiRsysSdkRealTimeSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8894FtB(Object obj, HsR hsR, Activity activity, HyV hyV, F6D f6d, Hon hon, HtJ<? super C8894FtB> htJ) {
        super(2, hon);
        this.$t = htJ;
        this.A05 = hyV;
        this.A01 = obj;
        this.A03 = hsR;
        this.A02 = f6d;
        this.A04 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8894FtB(Object obj, G0U<? super HyP, Unit> g0u, IapController iapController, Context context, Hnw hnw, HtJ<? super C8894FtB> htJ) {
        super(2, hnw);
        this.$t = htJ;
        this.A01 = context;
        this.A05 = g0u;
        this.A02 = obj;
        this.A03 = iapController;
    }
}
