package X;

import java.util.List;
import kotlin.Unit;

/* renamed from: X.969, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass969 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ int $page;
    public final /* synthetic */ List<String> $pageKeys;
    public final /* synthetic */ C96F $reporter;
    public final /* synthetic */ C00r $tallestTilePx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/96F;Ljava/util/List<Ljava/lang/String;>;ILX/00r;)V */
    public AnonymousClass969(C00r c00r, C96F c96f, List list, int i) {
        super(1);
        this.$reporter = c96f;
        this.$pageKeys = list;
        this.$page = i;
        this.$tallestTilePx = c00r;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        Object objValueOf;
        long j = bl4.A00;
        C96F c96f = this.$reporter;
        List<String> list = this.$pageKeys;
        int i = this.$page;
        if (list == null || (objValueOf = AbstractC0878AGe.A0A(i, list)) == null) {
            objValueOf = Integer.valueOf(i);
        }
        int iA09 = AnonymousClass002.A09(j);
        Integer numPut = c96f.A03.put(objValueOf, Integer.valueOf(iA09));
        if (numPut == null || numPut.intValue() != iA09) {
            C96F.A00(c96f);
        }
        if (iA09 > this.$tallestTilePx.AGd()) {
            this.$tallestTilePx.AdX(iA09);
        }
        return Unit.INSTANCE;
    }
}
