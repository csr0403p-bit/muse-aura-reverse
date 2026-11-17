package X;

import kotlin.Unit;

/* renamed from: X.60F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60F extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60F(C1322Ah9 c1322Ah9, HtJ<? super C60F> htJ) {
        super(2, htJ);
        this.$t = 1;
        this.A04 = c1322Ah9;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C60F c60f;
        switch (this.$t) {
            case 0:
                c60f = new C60F(this.A04, this.A01, htJ, 0);
                break;
            case 1:
                C60F c60f2 = new C60F((C1322Ah9) this.A04, htJ);
                c60f2.A01 = obj;
                return c60f2;
            default:
                c60f = new C60F(this.A04, this.A01, htJ, 2);
                break;
        }
        c60f.A02 = obj;
        return c60f;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C60F) create(obj, (HtJ) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x00ba
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1 A[Catch: CancellationException -> 0x00ba, TRY_ENTER, TryCatch #0 {CancellationException -> 0x00ba, blocks: (B:33:0x00af, B:43:0x00f1), top: B:52:0x00af }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:17:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ef -> B:35:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0112 -> B:35:0x00ba). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C60F(Object obj, C10543Hqv<BRI> c10543Hqv, C1322Ah9 c1322Ah9, HtJ<? super C60F> htJ) {
        super(2, c1322Ah9);
        this.$t = htJ;
        this.A01 = c10543Hqv;
        this.A04 = obj;
    }
}
