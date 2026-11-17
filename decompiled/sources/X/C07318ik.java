package X;

import android.content.Context;
import androidx.glance.session.Session;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8ik, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07318ik extends AbstractC07127nr implements G0V {
    public final int $t = 0;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FHD;Lkotlin/jvm/functions/Function0<+TT;>;LX/HtJ<-LX/8ik;>;)V */
    public C07318ik(FHD fhd, HtJ htJ, Function0 function0) {
        super(2, htJ);
        this.A06 = fhd;
        this.A05 = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t != 0) {
            return new C07318ik((Context) this.A06, (BMy) this.A05, (BBH) this.A01, (Session) this.A02, (C77Q) this.A03, htJ);
        }
        C07318ik c07318ik = new C07318ik((FHD) this.A06, htJ, (Function0) this.A05);
        c07318ik.A01 = obj;
        return c07318ik;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:36:0x00f0, B:37:0x00f3, B:33:0x00df, B:39:0x0101, B:32:0x00dc, B:29:0x00c3), top: B:60:0x0087 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ed -> B:37:0x00f3). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07318ik.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07318ik) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BMy;Landroidx/glance/session/Session;Landroid/content/Context;LX/BBH;LX/77Q;LX/HtJ<-LX/8ik;>;)V */
    public C07318ik(Context context, BMy bMy, BBH bbh, Session session, C77Q c77q, HtJ htJ) {
        super(2, htJ);
        this.A05 = bMy;
        this.A02 = session;
        this.A06 = context;
        this.A01 = bbh;
        this.A03 = c77q;
    }
}
