package com.facebook.aura.common.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C78N;
import X.G0V;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class KeepScreenOnKt {
    public static final WeakHashMap<View, Integer> keepScreenOnHolders = new WeakHashMap<>();

    /* renamed from: com.facebook.aura.common.ui.KeepScreenOnKt$KeepScreenOn$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, int i) {
            super(2);
            this.$enabled = z;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            KeepScreenOnKt.KeepScreenOn(this.$enabled, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void acquireKeepScreenOn(View view) {
        WeakHashMap<View, Integer> weakHashMap = keepScreenOnHolders;
        Integer num = weakHashMap.get(view);
        weakHashMap.put(view, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        view.setKeepScreenOn(true);
    }

    public static final void releaseKeepScreenOn(View view) {
        int iIntValue;
        WeakHashMap<View, Integer> weakHashMap = keepScreenOnHolders;
        Integer num = weakHashMap.get(view);
        if (num != null && (iIntValue = num.intValue() - 1) > 0) {
            weakHashMap.put(view, Integer.valueOf(iIntValue));
        } else {
            weakHashMap.remove(view);
            view.setKeepScreenOn(false);
        }
    }

    public static final void KeepScreenOn(boolean z, BFM bfm, int i) {
        bfm.AgG(1031932863);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 3, 2), bfm, iA0n)) {
            View viewA0J = AnonymousClass001.A0J(bfm);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA67 = bfm.A67(viewA0J) | AnonymousClass001.A1M(iA0n);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new KeepScreenOnKt$KeepScreenOn$1$1(z, viewA0J);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, viewA0J, boolValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, i);
        }
    }
}
