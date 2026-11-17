package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.BLU;
import X.C0981AMm;
import X.C0Yr;
import X.C1HY;
import X.C5303Dfm;
import X.C78g;
import X.Dg3;
import X.EnumC10573Huf;
import X.EnumC3085Bxl;
import X.G0U;
import com.facebook.aura.ui.HatchFloatingChromeGeometry;

/* loaded from: classes.dex */
public final class HatchForegroundHeaderKt$HatchForegroundHeaderSlot$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry;
    public final /* synthetic */ HatchForegroundHeaderState $host;
    public final /* synthetic */ C1HY $owner;
    public final /* synthetic */ ForegroundHeaderSlot $slot;
    public final /* synthetic */ boolean $trackBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchForegroundHeaderKt$HatchForegroundHeaderSlot$3$1(HatchForegroundHeaderState hatchForegroundHeaderState, ForegroundHeaderSlot foregroundHeaderSlot, C1HY c1hy, boolean z, HatchFloatingChromeGeometry hatchFloatingChromeGeometry) {
        super(1);
        this.$host = hatchForegroundHeaderState;
        this.$slot = foregroundHeaderSlot;
        this.$owner = c1hy;
        this.$trackBounds = z;
        this.$geometry = hatchFloatingChromeGeometry;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$host.slots.add(this.$slot);
        final ForegroundHeaderSlot foregroundHeaderSlot = this.$slot;
        final C1HY c1hy = this.$owner;
        final boolean z = this.$trackBounds;
        final HatchFloatingChromeGeometry hatchFloatingChromeGeometry = this.$geometry;
        final Dg3 dg3 = new Dg3() { // from class: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$3$1$observer$1
            @Override // X.Dg3
            public final void onStateChanged(C1HY c1hy2, EnumC3085Bxl enumC3085Bxl) {
                C0981AMm<Object, BLU> c0981AMm;
                C0981AMm<Object, BLU> c0981AMm2;
                foregroundHeaderSlot.setLifecycleState(((C5303Dfm) c1hy.getLifecycle()).A01);
                if (!z || foregroundHeaderSlot.getLifecycleState() != EnumC10573Huf.A05) {
                    HatchFloatingChromeGeometry hatchFloatingChromeGeometry2 = hatchFloatingChromeGeometry;
                    if (hatchFloatingChromeGeometry2 == null || (c0981AMm = hatchFloatingChromeGeometry2.headers) == null) {
                        return;
                    }
                    c0981AMm.remove(foregroundHeaderSlot);
                    return;
                }
                HatchFloatingChromeGeometry hatchFloatingChromeGeometry3 = hatchFloatingChromeGeometry;
                if (hatchFloatingChromeGeometry3 == null || (c0981AMm2 = hatchFloatingChromeGeometry3.headers) == null) {
                    return;
                }
                ForegroundHeaderSlot foregroundHeaderSlot2 = foregroundHeaderSlot;
                c0981AMm2.put(foregroundHeaderSlot2, foregroundHeaderSlot2.getBounds());
            }
        };
        c1hy.getLifecycle().A04(dg3);
        final C1HY c1hy2 = this.$owner;
        final HatchForegroundHeaderState hatchForegroundHeaderState = this.$host;
        final ForegroundHeaderSlot foregroundHeaderSlot2 = this.$slot;
        final HatchFloatingChromeGeometry hatchFloatingChromeGeometry2 = this.$geometry;
        return new C78g() { // from class: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                C0981AMm<Object, BLU> c0981AMm;
                c1hy2.getLifecycle().A05(dg3);
                hatchForegroundHeaderState.slots.remove(foregroundHeaderSlot2);
                HatchFloatingChromeGeometry hatchFloatingChromeGeometry3 = hatchFloatingChromeGeometry2;
                if (hatchFloatingChromeGeometry3 == null || (c0981AMm = hatchFloatingChromeGeometry3.headers) == null) {
                    return;
                }
                c0981AMm.remove(foregroundHeaderSlot2);
            }
        };
    }
}
