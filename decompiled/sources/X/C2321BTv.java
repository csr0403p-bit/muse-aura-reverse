package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import kotlin.Unit;

/* renamed from: X.BTv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2321BTv extends AbstractC07117nq implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2321BTv(Object obj, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, HtJ<? super C2321BTv> htJ) {
        super(2, androidEdgeEffectOverscrollEffect);
        this.$t = htJ;
        this.A02 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        int i;
        Object obj3;
        int i2;
        switch (this.$t) {
            case 0:
                obj2 = this.A02;
                i = 0;
                break;
            case 1:
                obj3 = this.A01;
                i2 = 1;
                C2321BTv c2321BTv = new C2321BTv(obj3, htJ, i2, 42);
                c2321BTv.A02 = obj;
                return c2321BTv;
            case 2:
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                obj3 = this.A01;
                i2 = 3;
                C2321BTv c2321BTv2 = new C2321BTv(obj3, htJ, i2, 42);
                c2321BTv2.A02 = obj;
                return c2321BTv2;
            default:
                obj3 = this.A01;
                i2 = 4;
                C2321BTv c2321BTv22 = new C2321BTv(obj3, htJ, i2, 42);
                c2321BTv22.A02 = obj;
                return c2321BTv22;
        }
        C2321BTv c2321BTv3 = new C2321BTv(obj2, htJ, i);
        c2321BTv3.A01 = obj;
        return c2321BTv3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:38:0x00a9, B:40:0x00b1], limit reached: 92 */
    /* JADX WARN: Path cross not found for [B:40:0x00b1, B:38:0x00a9], limit reached: 92 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f8 -> B:24:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x016b -> B:69:0x0150). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01a1 -> B:80:0x0188). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2321BTv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C2321BTv) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2321BTv(Object obj, HtJ htJ, int i, int i2) {
        super(2, htJ);
        this.$t = i;
        this.A01 = obj;
    }
}
