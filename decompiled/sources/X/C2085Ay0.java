package X;

import android.text.SegmentFinder;

/* renamed from: X.Ay0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2085Ay0 extends SegmentFinder {
    public final /* synthetic */ InterfaceC2106AyW A00;

    public C2085Ay0(InterfaceC2106AyW interfaceC2106AyW) {
        this.A00 = interfaceC2106AyW;
    }

    @Override // android.text.SegmentFinder
    public final int nextEndBoundary(int i) {
        return this.A00.ARI(i);
    }

    @Override // android.text.SegmentFinder
    public final int nextStartBoundary(int i) {
        return this.A00.ARJ(i);
    }

    @Override // android.text.SegmentFinder
    public final int previousEndBoundary(int i) {
        return this.A00.AYU(i);
    }

    @Override // android.text.SegmentFinder
    public final int previousStartBoundary(int i) {
        return this.A00.AYW(i);
    }
}
