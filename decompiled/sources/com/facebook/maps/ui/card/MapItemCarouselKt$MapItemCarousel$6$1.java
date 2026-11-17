package com.facebook.maps.ui.card;

import X.AbstractC07127nr;
import X.C3UX;
import X.C8j3;
import X.G0V;
import X.HtJ;
import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.maps.ui.card.MapItemCarouselKt$MapItemCarousel$6$1", f = "MapItemCarousel.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class MapItemCarouselKt$MapItemCarousel$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ List<String> $itemKeys;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ String $selectedItemIdentifier;
    public int I$0;
    public int I$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;Landroidx/compose/foundation/pager/PagerState;LX/HtJ<-Lcom/facebook/maps/ui/card/MapItemCarouselKt$MapItemCarousel$6$1;>;)V */
    public MapItemCarouselKt$MapItemCarousel$6$1(PagerState pagerState, String str, List list, HtJ htJ) {
        super(2, htJ);
        this.$itemKeys = list;
        this.$selectedItemIdentifier = str;
        this.$pagerState = pagerState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        List<String> list = this.$itemKeys;
        return new MapItemCarouselKt$MapItemCarousel$6$1(this.$pagerState, this.$selectedItemIdentifier, list, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto Lf
            if (r0 != r4) goto L4a
            X.Hwg.A00(r6)
        Lc:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        Lf:
            X.Hwg.A00(r6)
            java.util.List<java.lang.String> r2 = r5.$itemKeys
            java.lang.String r1 = r5.$selectedItemIdentifier
            r0 = 0
            X.C7384Etj.A0Y(r2, r0)
            int r2 = r2.indexOf(r1)
            androidx.compose.foundation.pager.PagerState r0 = r5.$pagerState
            int r0 = r0.A07()
            if (r0 != r2) goto L36
            androidx.compose.foundation.pager.PagerState r0 = r5.$pagerState
            X.Abq r0 = r0.A0L
            X.00q r0 = r0.A04
            float r1 = r0.AFn()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L37
        L36:
            r1 = 0
        L37:
            if (r2 < 0) goto Lc
            if (r1 != 0) goto Lc
            androidx.compose.foundation.pager.PagerState r0 = r5.$pagerState
            r5.I$0 = r2
            r5.I$1 = r1
            r5.label = r4
            java.lang.Object r0 = androidx.compose.foundation.pager.PagerState.A03(r0, r5, r2)
            if (r0 != r3) goto Lc
            return r3
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.maps.ui.card.MapItemCarouselKt$MapItemCarousel$6$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MapItemCarouselKt$MapItemCarousel$6$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
