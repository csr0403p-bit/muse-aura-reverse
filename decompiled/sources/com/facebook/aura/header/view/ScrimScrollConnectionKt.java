package com.facebook.aura.header.view;

import X.AFs;
import X.AFz;
import X.AGE;
import X.AGN;
import X.AKH;
import X.AKO;
import X.AZ3;
import X.AbstractC1103AYp;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C1110AYw;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ScrimScrollConnectionKt {
    public static final AKH<ScrimScrollState> LocalScrimScrollState = new AGN(AGE.A00, ScrimScrollConnectionKt$LocalScrimScrollState$1.INSTANCE);
    public static final float ScrimScrollThreshold = 48.0f;

    /* renamed from: com.facebook.aura.header.view.ScrimScrollConnectionKt$BindScrimToScrollTop$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LazyListState lazyListState, int i) {
            super(2);
            this.$listState = lazyListState;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ScrimScrollConnectionKt.BindScrimToScrollTop(this.$listState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.header.view.ScrimScrollConnectionKt$BindScrimToScrollTop$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C1110AYw $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C1110AYw c1110AYw, int i) {
            super(2);
            this.$scrollState = c1110AYw;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ScrimScrollConnectionKt.BindScrimToScrollTop(this.$scrollState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void BindScrimToScrollTop(C1110AYw c1110AYw, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass4;
        C7384Etj.A0Y(c1110AYw, 0);
        bfm.AgG(1862019053);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1110AYw) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            BBI bbi = (BBI) bfm;
            ScrimScrollState scrimScrollState = (ScrimScrollState) AKO.A07(LocalScrimScrollState, bbi);
            if (scrimScrollState == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new ScrimScrollConnectionKt$BindScrimToScrollTop$scrim$2(c1110AYw, i);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            boolean zA1V = C8j3.A1V(bfm, scrimScrollState, AnonymousClass001.A1M(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new ScrimScrollConnectionKt$BindScrimToScrollTop$3$1(c1110AYw, scrimScrollState, null);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, scrimScrollState, c1110AYw);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(c1110AYw, i);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final AKH<ScrimScrollState> getLocalScrimScrollState() {
        return LocalScrimScrollState;
    }

    public static final float getScrimScrollThreshold() {
        return ScrimScrollThreshold;
    }

    public static final LazyListState rememberScrimBoundLazyListState(int i, int i2, BFM bfm, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        LazyListState lazyListStateA00 = AZ3.A00(i, C3cG.A01(i4, i2), bfm, i3 & 126, 0);
        BindScrimToScrollTop(lazyListStateA00, bfm, 0);
        return lazyListStateA00;
    }

    public static final C1110AYw rememberScrimBoundScrollState(int i, BFM bfm, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(i, bfm, i2 & 14, 0);
        BindScrimToScrollTop(c1110AYwA00, bfm, 0);
        return c1110AYwA00;
    }

    /* renamed from: rememberScrimScrollState-kHDZbjc, reason: not valid java name */
    public static final ScrimScrollState m1055rememberScrimScrollStatekHDZbjc(float f, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = ScrimScrollThreshold;
        }
        BBI bbi = (BBI) bfm;
        float fAh4 = AKO.A04(Am0.A04, bbi).Ah4(f);
        Object[] objArr = {Float.valueOf(fAh4)};
        AFs<ScrimScrollState, Float> aFsSaver = ScrimScrollState.Companion.Saver(fAh4);
        boolean zA62 = bfm.A62(fAh4);
        Object objAaT = bfm.AaT();
        if (zA62 || objAaT == C78N.A00) {
            objAaT = new ScrimScrollConnectionKt$rememberScrimScrollState$1$1(fAh4);
            BBI.A0O(bbi, objAaT);
        }
        return (ScrimScrollState) AFz.A01(bfm, aFsSaver, (Function0) objAaT, objArr);
    }

    public static final void BindScrimToScrollTop(LazyListState lazyListState, BFM bfm, int i) {
        int iA0d;
        BBb bBbAAc;
        Object anonymousClass2;
        C7384Etj.A0Y(lazyListState, 0);
        bfm.AgG(-272298094);
        if ((i & 6) == 0) {
            iA0d = AnonymousClass004.A0d(bfm, lazyListState) | i;
        } else {
            iA0d = i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            BBI bbi = (BBI) bfm;
            ScrimScrollState scrimScrollState = (ScrimScrollState) AKO.A07(LocalScrimScrollState, bbi);
            if (scrimScrollState == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new ScrimScrollConnectionKt$BindScrimToScrollTop$scrim$1(lazyListState, i);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            boolean zA1V = C8j3.A1V(bfm, scrimScrollState, AnonymousClass001.A1M(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new ScrimScrollConnectionKt$BindScrimToScrollTop$1$1(lazyListState, scrimScrollState, null);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, scrimScrollState, lazyListState);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(lazyListState, i);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }
}
