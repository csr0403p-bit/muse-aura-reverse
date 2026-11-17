package com.facebook.aura.conversation.view;

import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1161Act;
import X.C1741Ape;
import X.C1743Apg;
import X.C1er;
import X.C78N;
import X.G0V;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchWidgetEditingKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ Function0<Float> $viewportTopInWindow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LazyListState lazyListState, Function0<Float> function0, int i) {
            super(2);
            this.$listState = lazyListState;
            this.$viewportTopInWindow = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWidgetEditingKt.RevealFocusedWidgetFieldEffect(this.$listState, this.$viewportTopInWindow, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void RevealFocusedWidgetFieldEffect(LazyListState lazyListState, Function0<Float> function0, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(lazyListState, function0);
        bfm.AgG(-1111162446);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            View viewA0J = AnonymousClass001.A0J(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, rememberIsEditingWidgetField(bfm, zA1b ? 1 : 0));
            MutableState mutableStateA002 = C1er.A00(bfm, function0);
            boolean zA1O = AnonymousClass003.A1O(bfm, viewA0J, mutableStateA002, bfm.A65(mutableStateA00) | AnonymousClass001.A1L(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchWidgetEditingKt$RevealFocusedWidgetFieldEffect$1$1(lazyListState, mutableStateA00, viewA0J, mutableStateA002, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, lazyListState, viewA0J);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(lazyListState, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C3MW rememberWidgetEditingBringIntoViewSpec(final kotlin.jvm.functions.Function0<java.lang.Boolean> r5, X.BFM r6, int r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            X.AKH<X.3MW> r0 = X.AbstractC1280AgQ.A01
            java.lang.Object r4 = r6.A6v(r0)
            X.3MW r4 = (X.C3MW) r4
            boolean r3 = r6.A65(r4)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L1d
            boolean r0 = r6.A65(r5)
            if (r0 != 0) goto L22
        L1d:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L23
        L22:
            r0 = 1
        L23:
            r0 = r0 | r3
            java.lang.Object r1 = r6.AaT()
            if (r0 != 0) goto L2e
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L36
        L2e:
            com.facebook.aura.conversation.view.HatchWidgetEditingKt$rememberWidgetEditingBringIntoViewSpec$1$1 r1 = new com.facebook.aura.conversation.view.HatchWidgetEditingKt$rememberWidgetEditingBringIntoViewSpec$1$1
            r1.<init>()
            r6.Ai0(r1)
        L36:
            com.facebook.aura.conversation.view.HatchWidgetEditingKt$rememberWidgetEditingBringIntoViewSpec$1$1 r1 = (com.facebook.aura.conversation.view.HatchWidgetEditingKt$rememberWidgetEditingBringIntoViewSpec$1$1) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchWidgetEditingKt.rememberWidgetEditingBringIntoViewSpec(kotlin.jvm.functions.Function0, X.BFM, int):X.3MW");
    }

    public static final Function0<Boolean> rememberIsEditingWidgetField(BFM bfm, int i) {
        View viewA0J = AnonymousClass001.A0J(bfm);
        C1741Ape c1741Ape = C1743Apg.A01(bfm).A02;
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        boolean zA1R = AnonymousClass005.A1R(bfm, viewA0J, c1741Ape, axnA0Y);
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = new HatchWidgetEditingKt$rememberIsEditingWidgetField$1$1(c1741Ape, axnA0Y, viewA0J);
            bfm.Ai0(objAaT);
        }
        return (Function0) objAaT;
    }

    public static final void revealAboveComposer(LazyListState lazyListState, float f, float f2, float f3) {
        float fA09 = AnonymousClass002.A09(r2.AMh()) + f3;
        C1161Act c1161Act = (C1161Act) lazyListState.A04();
        float f4 = f2 - (fA09 - c1161Act.A02);
        if (f4 >= 1.0f) {
            lazyListState.A98(Math.min(f4, (f - f3) - (-c1161Act.A07)));
        }
    }
}
