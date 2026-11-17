package com.facebook.aura.ui.pulltorefresh;

import X.Akx;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C1251Afj;
import X.G0U;
import X.G0V;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection implements Akx {
    public final boolean enabled;
    public final G0U<Float, Float> onPull;
    public final G0V<Float, HtJ<? super Unit>, Object> onRelease;

    @Override // X.Akx
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo4onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.enabled || i != 1) {
            return 0L;
        }
        float fA01 = AnonymousClass001.A01(j2, 4294967295L);
        if (fA01 <= 0.0f) {
            return 0L;
        }
        float fA02 = AnonymousClass001.A02(this.onPull.invoke(Float.valueOf(fA01)));
        return (4294967295L & Float.floatToRawIntBits(fA02)) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    @Override // X.Akx
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5onPreFlingQWom1Mo(long r7, X.HtJ<? super X.C1251Afj> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.ui.pulltorefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L3e
            r5 = r9
            com.facebook.aura.ui.pulltorefresh.PullRefreshNestedScrollConnection$onPreFling$1 r5 = (com.facebook.aura.ui.pulltorefresh.PullRefreshNestedScrollConnection$onPreFling$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L44
            X.Hwg.A00(r1)
        L20:
            X.Afj r4 = X.AnonymousClass006.A0a()
            return r4
        L25:
            X.Hwg.A00(r1)
            X.G0V<java.lang.Float, X.HtJ<? super kotlin.Unit>, java.lang.Object> r2 = r6.onRelease
            float r1 = X.AnonymousClass004.A00(r7)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r5.J$0 = r7
            r5.label = r3
            java.lang.Object r0 = r2.invoke(r0, r5)
            if (r0 != r4) goto L20
            return r4
        L3e:
            com.facebook.aura.ui.pulltorefresh.PullRefreshNestedScrollConnection$onPreFling$1 r5 = new com.facebook.aura.ui.pulltorefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r5.<init>(r6, r9)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.pulltorefresh.PullRefreshNestedScrollConnection.mo5onPreFlingQWom1Mo(long, X.HtJ):java.lang.Object");
    }

    @Override // X.Akx
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo6onPreScrollOzD1aCk(long j, int i) {
        if (!this.enabled || i != 1) {
            return 0L;
        }
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        if (fA01 >= 0.0f) {
            return 0L;
        }
        float fA02 = AnonymousClass001.A02(this.onPull.invoke(Float.valueOf(fA01)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(fA02));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(G0U<? super Float, Float> g0u, G0V<? super Float, ? super HtJ<? super Unit>, ? extends Object> g0v, boolean z) {
        AnonymousClass003.A0u(g0u, g0v);
        this.onPull = g0u;
        this.onRelease = g0v;
        this.enabled = z;
    }

    @Override // X.Akx
    /* renamed from: onPostFling-RZ2iAVY */
    public /* bridge */ Object mo3onPostFlingRZ2iAVY(long j, long j2, HtJ<? super C1251Afj> htJ) {
        return AnonymousClass006.A0a();
    }
}
