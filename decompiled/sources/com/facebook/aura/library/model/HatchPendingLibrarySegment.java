package com.facebook.aura.library.model;

import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;

/* loaded from: classes.dex */
public final class HatchPendingLibrarySegment {
    public static final int $stable = 0;
    public static final HatchPendingLibrarySegment INSTANCE = new HatchPendingLibrarySegment();
    public static final BLG<LibrarySegment> _segment;
    public static final C1BN<LibrarySegment> segment;

    public final void request(LibrarySegment librarySegment) {
        C7384Etj.A0Y(librarySegment, 0);
        AnonymousClass002.A1I(_segment, librarySegment);
    }

    static {
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        _segment = c9286GCn;
        segment = new C3Pi(null, c9286GCn);
    }

    public final void consume() {
        _segment.Af8(null);
    }

    public final C1BN<LibrarySegment> getSegment() {
        return segment;
    }
}
