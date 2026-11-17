package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00r;
import X.C3pU;
import X.C6v3;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.os.SystemClock;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class WidgetHeightState {
    public final C00r contentHeightPx;
    public final int growthHeadroomPx;
    public long lastChangeAtMs;
    public final C00r webViewHeightPx = new ParcelableSnapshotMutableIntState(0);

    /* renamed from: com.facebook.aura.conversation.view.richcontent.WidgetHeightState$settleWebViewHeight$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<HxE<? extends Integer, ? extends Integer>> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HxE<? extends Integer, ? extends Integer> invoke() {
            return AnonymousClass002.A0p(Integer.valueOf(WidgetHeightState.this.contentHeightPx.AGd()), WidgetHeightState.this.webViewHeightPx.AGd());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.WidgetHeightState$settleWebViewHeight$3", f = "HatchWidgetWebView.kt", l = {811}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.WidgetHeightState$settleWebViewHeight$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<HxE<? extends Integer, ? extends Integer>, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = WidgetHeightState.this.new AnonymousClass3(htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HxE<? extends Integer, ? extends Integer> hxE, HtJ<? super Unit> htJ) {
            return invoke2((HxE<Integer, Integer>) hxE, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HxE hxE = (HxE) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                int iA0F = AnonymousClass001.A0F(hxE.first);
                int iA0F2 = AnonymousClass001.A0F(hxE.second);
                if (iA0F2 > iA0F) {
                    this.L$0 = null;
                    this.I$0 = iA0F;
                    this.I$1 = iA0F2;
                    this.label = 1;
                    if (C7Bq.A01(500L, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            WidgetHeightState.this.webViewHeightPx.AdX(0);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HxE<Integer, Integer> hxE, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C00r getContentHeightPx() {
        return this.contentHeightPx;
    }

    public final C00r getWebViewHeightPx() {
        return this.webViewHeightPx;
    }

    public final Object settleWebViewHeight(HtJ<? super Unit> htJ) {
        Object objA00 = C3pU.A00(htJ, new AnonymousClass3(null), C6v3.A01(new AnonymousClass2()));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final boolean update(int i) {
        int iAGd = this.contentHeightPx.AGd();
        if (!HatchWidgetWebViewKt.shouldUpdateHeight(iAGd, i)) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (iAGd > 0 && jUptimeMillis - this.lastChangeAtMs < 500) {
            int iMax = Math.max(iAGd, this.webViewHeightPx.AGd());
            C00r c00r = this.webViewHeightPx;
            if (i > iMax) {
                iMax = this.growthHeadroomPx + i;
            }
            c00r.AdX(iMax);
        }
        this.lastChangeAtMs = jUptimeMillis;
        this.contentHeightPx.AdX(i);
        return true;
    }

    public WidgetHeightState(int i, int i2) {
        this.growthHeadroomPx = i2;
        this.contentHeightPx = new ParcelableSnapshotMutableIntState(i);
    }
}
