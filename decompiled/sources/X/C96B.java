package X;

import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.96B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C96B extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ G0W<Item, BFM, Integer, String> $accessibilityLabel;
    public final /* synthetic */ G2j<C8ni, Item, BFM, Integer, Unit> $content;
    public final /* synthetic */ G0U<Item, Boolean> $isItemEnabled;
    public final /* synthetic */ List<Item> $items;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<C1DG, Unit> $onContentHeightChanged;
    public final /* synthetic */ G0U<Integer, Unit> $onTileClick;
    public final /* synthetic */ List<String> $pageKeys;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ int $selectedIndex;
    public final /* synthetic */ AnonymousClass962 $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+TItem;>;Ljava/util/List<Ljava/lang/String;>;LX/962;Landroidx/compose/foundation/pager/PagerState;ILX/G0U<-TItem;Ljava/lang/Boolean;>;LX/G0W<-TItem;-LX/BFM;-Ljava/lang/Integer;Ljava/lang/String;>;LX/G0U<-LX/1DG;Lkotlin/Unit;>;LX/BRg;LX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G2j<-LX/8ni;-TItem;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    public C96B(PagerState pagerState, BRg bRg, AnonymousClass962 anonymousClass962, List list, List list2, G0U g0u, G0U g0u2, G0U g0u3, G0W g0w, G2j g2j, int i, int i2, int i3) {
        super(2);
        this.$items = list;
        this.$pageKeys = list2;
        this.$style = anonymousClass962;
        this.$pagerState = pagerState;
        this.$selectedIndex = i;
        this.$isItemEnabled = g0u;
        this.$accessibilityLabel = g0w;
        this.$onContentHeightChanged = g0u2;
        this.$modifier = bRg;
        this.$onTileClick = g0u3;
        this.$content = g2j;
        this.$$changed = i2;
        this.$$changed1 = i3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        List<Item> list = this.$items;
        List<String> list2 = this.$pageKeys;
        AnonymousClass962 anonymousClass962 = this.$style;
        PagerState pagerState = this.$pagerState;
        int i = this.$selectedIndex;
        G0U<Item, Boolean> g0u = this.$isItemEnabled;
        G0W<Item, BFM, Integer, String> g0w = this.$accessibilityLabel;
        C96C.A00(pagerState, bfmA0P, this.$modifier, anonymousClass962, list, list2, g0u, this.$onContentHeightChanged, this.$onTileClick, g0w, this.$content, i, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        return Unit.INSTANCE;
    }
}
