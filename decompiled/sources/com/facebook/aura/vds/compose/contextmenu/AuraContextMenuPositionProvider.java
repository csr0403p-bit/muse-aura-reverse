package com.facebook.aura.vds.compose.contextmenu;

import X.AHD;
import X.AXN;
import X.AbstractC7559F3s;
import X.AeE;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLU;
import X.C06H;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraContextMenuPositionProvider implements AeE {
    public static final int $stable = 0;
    public final long contentOffset;
    public final AXN density;
    public final Boolean forceCenterHorizontalAlignment;
    public final G0V<BLU, BLU, Unit> onPositionCalculated;
    public final AHD<AuraContextMenuVerticalBand> verticalBands;

    /* JADX WARN: Multi-variable type inference failed */
    public AuraContextMenuPositionProvider(long j, AXN axn, Boolean bool, G0V<? super BLU, ? super BLU, Unit> g0v, AHD<AuraContextMenuVerticalBand> ahd) {
        AnonymousClass002.A1B(axn, 1, g0v);
        this.contentOffset = j;
        this.density = axn;
        this.forceCenterHorizontalAlignment = bool;
        this.onPositionCalculated = g0v;
        this.verticalBands = ahd;
    }

    /* renamed from: com.facebook.aura.vds.compose.contextmenu.AuraContextMenuPositionProvider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BLU, BLU, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BLU blu, BLU blu2) {
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BLU blu, BLU blu2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0165 A[PHI: r0 r1
  0x0165: PHI (r0v19 java.lang.Integer) = (r0v12 java.lang.Integer), (r0v20 java.lang.Integer) binds: [B:63:0x01a2, B:49:0x0163] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r1v10 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v11 java.lang.Integer) binds: [B:63:0x01a2, B:49:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198 A[SYNTHETIC] */
    @Override // X.AeE
    /* renamed from: calculatePosition-llwVHH4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo11calculatePositionllwVHH4(X.BLU r16, long r17, X.EnumC1820Arj r19, long r20) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.contextmenu.AuraContextMenuPositionProvider.mo11calculatePositionllwVHH4(X.BLU, long, X.Arj, long):long");
    }

    public /* synthetic */ AuraContextMenuPositionProvider(long j, AXN axn, Boolean bool, G0V g0v, AHD ahd, int i, C06H c06h) {
        this(j, axn, (i & 4) != 0 ? AnonymousClass001.A0h() : bool, (i & 8) != 0 ? AnonymousClass1.INSTANCE : g0v, (i & 16) != 0 ? null : ahd);
    }

    public /* synthetic */ AuraContextMenuPositionProvider(long j, AXN axn, Boolean bool, G0V g0v, AHD ahd, C06H c06h) {
        this(j, axn, bool, g0v, ahd);
    }
}
