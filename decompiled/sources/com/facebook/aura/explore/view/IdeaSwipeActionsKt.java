package com.facebook.aura.explore.view;

import X.AEk;
import X.AKH;
import X.AOc;
import X.AT5;
import X.AVy;
import X.AXN;
import X.AYD;
import X.AZn;
import X.AbV;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BOf;
import X.BRg;
import X.C00r;
import X.C06G;
import X.C0dx;
import X.C1003AOr;
import X.C10543Hqv;
import X.C11U;
import X.C1419Aio;
import X.C1YC;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import X.EnumC1108AYu;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1072AWd;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class IdeaSwipeActionsKt {
    public static final float ARMED_ICON_SCALE = 1.35f;
    public static final AOc<Float> ArmIconSpec;
    public static final float CardTransitionDistance = 30.0f;
    public static final float CommitVelocityThreshold = 225.0f;
    public static final AOc<Float> DisarmIconSpec;
    public static final float MORE_LIKE_THIS_COMMIT_FRACTION = 0.38f;
    public static final float MORE_LIKE_THIS_PARK_FRACTION = 0.65f;
    public static final long MoreLikeThisFill;
    public static final float NOT_INTERESTED_COMMIT_FRACTION = 0.3f;
    public static final float NOT_INTERESTED_FLING_MIN_FRACTION = 0.15f;
    public static final long NotInterestedFill;
    public static final float REJECT_BRACKET_MIN_FRACTION = 0.825f;
    public static final float SWIPE_FILL_ALPHA = 0.3f;
    public static final float SwipeIconSize = 20.0f;
    public static final AOc<Float> SwipeSettleSpec;
    public static final float SwipedCardCornerRadius = 24.0f;

    /* renamed from: com.facebook.aura.explore.view.IdeaSwipeActionsKt$IdeaRowSwipeContainer$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<IdeaFeedback, Unit> $onFeedback;
        public final /* synthetic */ G0U<Boolean, Unit> $onSwipingChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(G0U<? super Boolean, Unit> g0u, G0U<? super IdeaFeedback, Unit> g0u2, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$onSwipingChange = g0u;
            this.$onFeedback = g0u2;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            IdeaSwipeActionsKt.IdeaRowSwipeContainer(this.$onSwipingChange, this.$onFeedback, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object] */
    public static final void IdeaRowSwipeContainer(G0U<? super Boolean, Unit> g0u, G0U<? super IdeaFeedback, Unit> g0u2, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0u, 0);
        AnonymousClass002.A1B(g0u2, 1, g0w);
        bfm.AgG(-2111663489);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            C1YC<Float> c1ycA00 = AZn.A00(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass002.A0O(bfm, 0);
            }
            C00r c00r = (C00r) objAaT;
            boolean zA65 = bfm.A65(axnA0Y);
            Object objAaT2 = bfm.AaT();
            Object obj2 = objAaT2;
            if (zA65 || objAaT2 == obj) {
                C10543Hqv c10543Hqv = new C10543Hqv();
                IdeaSwipeAnchor ideaSwipeAnchor = IdeaSwipeAnchor.CLOSED;
                IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$1 ideaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$1 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$1(c00r);
                IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$2 ideaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$2 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$2(axnA0Y);
                AOc<Float> aOc = SwipeSettleSpec;
                ?? anchoredDraggableState = new AnchoredDraggableState(new IdeaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$3(c10543Hqv, c00r), ideaSwipeAnchor);
                anchoredDraggableState.A04 = ideaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$1;
                anchoredDraggableState.A02 = ideaSwipeActionsKt$IdeaRowSwipeContainer$dragState$1$2;
                anchoredDraggableState.A00 = aOc;
                anchoredDraggableState.A01 = c1ycA00;
                c10543Hqv.element = anchoredDraggableState;
                bfm.Ai0(anchoredDraggableState);
                obj2 = anchoredDraggableState;
            }
            AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) obj2;
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            MutableState mutableStateA002 = C1er.A00(bfm, g0u2);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass002.A0I(bfm, 1.0f);
            }
            AT5 at5 = (AT5) objAaT3;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass007.A0U(bfm, obj);
            boolean zA1K = AnonymousClass003.A1K(bfm, anchoredDraggableState2, mutableStateA00);
            Object objAaT4 = bfm.AaT();
            if (zA1K || objAaT4 == obj) {
                objAaT4 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$1$1(anchoredDraggableState2, mutableStateA00, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, anchoredDraggableState2);
            boolean zA1T = AnonymousClass004.A1T(bfm, c0dxA0T, at5, bfm.A65(anchoredDraggableState2));
            Object objAaT5 = bfm.AaT();
            if (zA1T || objAaT5 == obj) {
                objAaT5 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$2$1(anchoredDraggableState2, c00r, c0dxA0T, at5, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, anchoredDraggableState2);
            boolean zA1K2 = AnonymousClass003.A1K(bfm, anchoredDraggableState2, mutableStateA002);
            Object objAaT6 = bfm.AaT();
            if (zA1K2 || objAaT6 == obj) {
                objAaT6 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$3$1(interfaceC1072AWd, anchoredDraggableState2, c00r, mutableStateA002, null);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A18(bfm, objAaT6, interfaceC1072AWd);
            boolean zA1K3 = AnonymousClass003.A1K(bfm, anchoredDraggableState2, mutableStateA002);
            Object objAaT7 = bfm.AaT();
            if (zA1K3 || objAaT7 == obj) {
                objAaT7 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$4$1(anchoredDraggableState2, mutableStateA002, null);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A18(bfm, objAaT7, anchoredDraggableState2);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0K = C06G.A0K(bfm, akh);
            long j = AnonymousClass001.A0f(bfm, akh).bubble;
            float fAh4 = axnA0Y.Ah4(SwipedCardCornerRadius);
            float fAh42 = axnA0Y.Ah4(CardTransitionDistance);
            float fAh43 = axnA0Y.Ah4(SwipeIconSize);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.aura_thumbs_up, 0);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.aura_thumbs_down, 0);
            C1419Aio c1419AioA0S = AnonymousClass002.A0S(C06G.A0G(bfm, akh));
            BRg bRgA00 = C11U.A00(bRg2);
            boolean zA652 = bfm.A65(anchoredDraggableState2);
            Object objAaT8 = bfm.AaT();
            if (zA652 || objAaT8 == obj) {
                objAaT8 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$5$1(c00r, anchoredDraggableState2);
                bfm.Ai0(objAaT8);
            }
            BRg bRgThen = BIj.A00(bRgA00, (G0U) objAaT8).then(new AbV(anchoredDraggableState2, EnumC1108AYu.A02, interfaceC1072AWd, false, true));
            boolean zA1R = AnonymousClass001.A1R(bfm, c1419AioA0S, AnonymousClass005.A1Y(bfm, aVyA00, aVyA002, AnonymousClass003.A1J(bfm, anchoredDraggableState2, at5), bfm.A62(fAh43)));
            Object objAaT9 = bfm.AaT();
            if (zA1R || objAaT9 == obj) {
                objAaT9 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$6$1(anchoredDraggableState2, at5, fAh43, aVyA00, aVyA002, c1419AioA0S);
                bfm.Ai0(objAaT9);
            }
            BRg bRgA01 = AEk.A01(bRgThen, (G0U) objAaT9);
            boolean zA653 = bfm.A65(anchoredDraggableState2);
            Object objAaT10 = bfm.AaT();
            if (zA653 || objAaT10 == obj) {
                objAaT10 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$7$1(anchoredDraggableState2);
                bfm.Ai0(objAaT10);
            }
            BRg bRgA03 = AYD.A03(bRgA01, (G0U) objAaT10);
            boolean zA1T2 = AnonymousClass002.A1T(bfm, jA0K, AnonymousClass003.A1I(bfm, anchoredDraggableState2, fAh42), bfm.A62(fAh4)) | bfm.A64(j);
            Object objAaT11 = bfm.AaT();
            if (zA1T2 || objAaT11 == obj) {
                objAaT11 = new IdeaSwipeActionsKt$IdeaRowSwipeContainer$8$1(anchoredDraggableState2, fAh42, fAh4, jA0K, j);
                bfm.Ai0(objAaT11);
            }
            AnonymousClass001.A1G(AEk.A01(bRgA03, (G0U) objAaT11), bfm, g0w, (iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass9(g0u, g0u2, bRg2, g0w, i, i2);
        }
    }

    public static final float commitDistancePx(float f, boolean z) {
        return f * (z ? 0.38f : 0.3f);
    }

    public static final boolean hasRejectTravel(float f, int i) {
        return !Float.isNaN(f) && (-f) >= ((float) i) * 0.15f;
    }

    public static final boolean isArmed(float f, int i) {
        return (Float.isNaN(f) || i == 0 || Math.abs(f) < commitDistancePx((float) i, AnonymousClass002.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))))) ? false : true;
    }

    static {
        long j = B6A.A01;
        MoreLikeThisFill = 4278876962L << 32;
        NotInterestedFill = 4290780983L << 32;
        SwipeSettleSpec = new C1003AOr(null, 1.0f, 200.0f);
        ArmIconSpec = new C1003AOr(null, 0.5f, 1500.0f);
        DisarmIconSpec = new C1003AOr(null, 1.0f, 1500.0f);
    }
}
