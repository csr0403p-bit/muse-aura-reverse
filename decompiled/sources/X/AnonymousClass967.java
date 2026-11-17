package X;

import androidx.compose.foundation.pager.PagerState;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.967, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass967 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ G0W<Item, BFM, Integer, String> $accessibilityLabel;
    public final /* synthetic */ G2j<C8ni, Item, BFM, Integer, Unit> $content;
    public final /* synthetic */ G0U<Item, Boolean> $isItemEnabled;
    public final /* synthetic */ List<Item> $items;
    public final /* synthetic */ G0U<Integer, Unit> $onTileClick;
    public final /* synthetic */ List<String> $pageKeys;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ C96F $reporter;
    public final /* synthetic */ int $selectedIndex;
    public final /* synthetic */ AnonymousClass962 $style;
    public final /* synthetic */ C00r $tallestTilePx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/962;Ljava/util/List<+TItem;>;Ljava/util/List<Ljava/lang/String;>;Landroidx/compose/foundation/pager/PagerState;ILX/G0U<-TItem;Ljava/lang/Boolean;>;LX/G0W<-TItem;-LX/BFM;-Ljava/lang/Integer;Ljava/lang/String;>;LX/96F;LX/00r;LX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G2j<-LX/8ni;-TItem;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;)V */
    public AnonymousClass967(PagerState pagerState, C00r c00r, C96F c96f, AnonymousClass962 anonymousClass962, List list, List list2, G0U g0u, G0U g0u2, G0W g0w, G2j g2j, int i) {
        super(3);
        this.$style = anonymousClass962;
        this.$items = list;
        this.$pageKeys = list2;
        this.$pagerState = pagerState;
        this.$selectedIndex = i;
        this.$isItemEnabled = g0u;
        this.$accessibilityLabel = g0w;
        this.$reporter = c96f;
        this.$tallestTilePx = c00r;
        this.$onTileClick = g0u2;
        this.$content = g2j;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        C0Ig c0Ig2 = c0Ig;
        BFM bfm2 = bfm;
        int iA0F = AnonymousClass001.A0F(num);
        C7384Etj.A0Y(c0Ig2, 0);
        if ((iA0F & 6) == 0) {
            iA0F |= AnonymousClass004.A0d(bfm2, c0Ig2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 19, 18), bfm2, iA0F)) {
            float fAHT = c0Ig2.AHT();
            AnonymousClass962 anonymousClass962 = this.$style;
            float f = anonymousClass962.A01;
            float f2 = C1DG.A08(f, Float.NaN) ? 0.0f : f;
            float f3 = anonymousClass962.A0E;
            if (C1DG.A08(f3, Float.NaN)) {
                f3 = C1DG.A04(C8j3.A0k((fAHT - f2) - anonymousClass962.A0F), 0.0f).A00;
            }
            int iA00 = C60O.A00(this.$items);
            C1DG c1dgA0k = C8j3.A0k(C8j3.A00(fAHT, f3));
            C1DG c1dgA0k2 = C8j3.A0k(0.0f);
            if (c1dgA0k.compareTo(c1dgA0k2) >= 0) {
                c1dgA0k2 = c1dgA0k;
            }
            float f4 = c1dgA0k2.A00;
            AnonymousClass962 anonymousClass9622 = this.$style;
            float f5 = anonymousClass9622.A01;
            float f6 = f4;
            if (!C1DG.A08(f5, Float.NaN)) {
                f6 = f5;
            }
            float f7 = f4 - f6;
            G0U g0u = null;
            C1Pk c1Pk = new C1Pk(f3);
            float f8 = anonymousClass9622.A09;
            C1DP c1dp = new C1DP(f4, 0.0f, f4, 0.0f);
            List<String> list = this.$pageKeys;
            if (list == null) {
                AnonymousClass003.A0l(bfm2, 736201658);
            } else {
                boolean zA1Z = AnonymousClass001.A1Z(list, bfm2, 736201659);
                Object objAaT = bfm2.AaT();
                if (zA1Z || objAaT == C78N.A00) {
                    objAaT = new C2326BUa(list, 18);
                    bfm2.Ai0(objAaT);
                }
                g0u = (G0U) objAaT;
                AnonymousClass001.A1D(bfm2);
            }
            C1062ATq c1062ATq = C10G.A02;
            PagerState pagerState = this.$pagerState;
            List<Item> list2 = this.$items;
            int i = this.$selectedIndex;
            G0U<Item, Boolean> g0u2 = this.$isItemEnabled;
            G0U g0u3 = g0u;
            AbstractC05081Yo.A00(null, null, null, c1dp, c1Pk, pagerState, bfm2, null, c1062ATq, null, g0u3, B1V.A00(bfm2, new AnonymousClass968(pagerState, this.$tallestTilePx, this.$reporter, this.$style, list2, this.$pageKeys, g0u2, this.$onTileClick, this.$accessibilityLabel, this.$content, f7, iA00, i), 68410825), f8, 2, 24624, RuntimeInternals.IOPRIO_BACKGROUND, 15296, false, false);
        } else {
            bfm2.Afo();
        }
        return Unit.INSTANCE;
    }
}
