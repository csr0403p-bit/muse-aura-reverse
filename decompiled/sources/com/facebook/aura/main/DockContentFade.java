package com.facebook.aura.main;

import X.AGE;
import X.AGF;
import X.AOW;
import X.AT5;
import X.AT8;
import X.C06H;
import X.C1DG;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class DockContentFade {
    public final AT5<Float, AOW> alphaAnimatable;
    public final MutableState fromWidth$delegate;
    public final MutableState width$delegate;

    /* renamed from: setFromWidth-0680j_4, reason: not valid java name */
    private final void m1331setFromWidth0680j_4(float f) {
        C1DG.A06(f, this.fromWidth$delegate);
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    private final void m1332setWidth0680j_4(float f) {
        C1DG.A06(f, this.width$delegate);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* renamed from: fadeThrough-D5KLDUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1333fadeThroughD5KLDUw(float r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.main.DockContentFade$fadeThrough$1
            if (r0 == 0) goto L6f
            r5 = r10
            com.facebook.aura.main.DockContentFade$fadeThrough$1 r5 = (com.facebook.aura.main.DockContentFade$fadeThrough$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L2b
            if (r0 == r7) goto L53
            if (r0 != r6) goto L75
            float r9 = r5.F$0
            X.Hwg.A00(r1)
        L25:
            r8.m1331setFromWidth0680j_4(r9)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2b:
            X.Hwg.A00(r1)
            float r0 = r8.m1335getWidthD9Ej5fM()
            boolean r0 = X.C1DG.A08(r0, r9)
            if (r0 != 0) goto L5b
            float r0 = r8.m1335getWidthD9Ej5fM()
            r8.m1331setFromWidth0680j_4(r0)
            X.AT5<java.lang.Float, X.AOW> r3 = r8.alphaAnimatable
            java.lang.Float r2 = X.AnonymousClass001.A0l()
            X.ASj<java.lang.Float> r1 = com.facebook.aura.main.HatchSidePanelDockStateKt.DockContentFadeOut
            r5.F$0 = r9
            r5.label = r7
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r1, r2, r5, r0)
            if (r0 != r4) goto L58
            return r4
        L53:
            float r9 = r5.F$0
            X.Hwg.A00(r1)
        L58:
            r8.m1332setWidth0680j_4(r9)
        L5b:
            X.AT5<java.lang.Float, X.AOW> r3 = r8.alphaAnimatable
            java.lang.Float r2 = X.AnonymousClass001.A0m()
            X.ASj<java.lang.Float> r1 = com.facebook.aura.main.HatchSidePanelDockStateKt.DockContentFadeIn
            r5.F$0 = r9
            r5.label = r6
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r1, r2, r5, r0)
            if (r0 != r4) goto L25
            return r4
        L6f:
            com.facebook.aura.main.DockContentFade$fadeThrough$1 r5 = new com.facebook.aura.main.DockContentFade$fadeThrough$1
            r5.<init>(r8, r10)
            goto L12
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.DockContentFade.m1333fadeThroughD5KLDUw(float, X.HtJ):java.lang.Object");
    }

    public final float getAlpha() {
        return MutableState.A00(this.alphaAnimatable);
    }

    /* renamed from: getFromWidth-D9Ej5fM, reason: not valid java name */
    public final float m1334getFromWidthD9Ej5fM() {
        return ((C1DG) this.fromWidth$delegate.getValue()).A00;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1335getWidthD9Ej5fM() {
        return ((C1DG) this.width$delegate.getValue()).A00;
    }

    public /* synthetic */ DockContentFade(float f, C06H c06h) {
        this(f);
    }

    public DockContentFade(float f) {
        C1DG c1dg = new C1DG(f);
        AGE ageA01 = AGF.A01();
        this.fromWidth$delegate = new ParcelableSnapshotMutableState(ageA01, c1dg);
        this.width$delegate = new ParcelableSnapshotMutableState(ageA01, new C1DG(f));
        this.alphaAnimatable = AT8.A00(1.0f);
    }
}
