package com.facebook.aura.header.view;

import X.Akx;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C1251Afj;
import X.C7384Etj;
import X.HtJ;

/* loaded from: classes.dex */
public final class ScrimScrollConnection implements Akx {
    public static final int $stable = 0;
    public final ScrimScrollState state;

    public ScrimScrollConnection(ScrimScrollState scrimScrollState) {
        C7384Etj.A0Y(scrimScrollState, 0);
        this.state = scrimScrollState;
    }

    @Override // X.Akx
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo4onPostScrollDzOQY0M(long j, long j2, int i) {
        this.state.addDelta(-AnonymousClass004.A00(j));
        return 0L;
    }

    @Override // X.Akx
    /* renamed from: onPostFling-RZ2iAVY */
    public /* bridge */ Object mo3onPostFlingRZ2iAVY(long j, long j2, HtJ<? super C1251Afj> htJ) {
        return AnonymousClass006.A0a();
    }

    @Override // X.Akx
    /* renamed from: onPreFling-QWom1Mo */
    public /* bridge */ Object mo5onPreFlingQWom1Mo(long j, HtJ<? super C1251Afj> htJ) {
        return AnonymousClass006.A0a();
    }

    @Override // X.Akx
    /* renamed from: onPreScroll-OzD1aCk */
    public /* bridge */ long mo6onPreScrollOzD1aCk(long j, int i) {
        return 0L;
    }
}
