package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.BLU;
import X.C0981AMm;
import X.C2LD;
import X.C2Un;
import X.C2ae;
import X.C7384Etj;
import X.EnumC10573Huf;
import X.G0U;
import com.facebook.aura.ui.HatchFloatingChromeGeometry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchForegroundHeaderKt$HatchForegroundHeaderSlot$5$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry;
    public final /* synthetic */ HatchForegroundHeaderState $host;
    public final /* synthetic */ ForegroundHeaderSlot $slot;
    public final /* synthetic */ boolean $trackBounds;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C0981AMm<Object, BLU> c0981AMm;
        C0981AMm<Object, BLU> c0981AMm2;
        C7384Etj.A0Y(c2ld, 0);
        this.$slot.setBounds(C2Un.A01(C2ae.A01(c2ld.A01(), AnonymousClass005.A0N(this.$host.contentInsetPx$delegate.AGd())), c2ld.A02().A01()));
        if (!this.$trackBounds || this.$slot.getLifecycleState() != EnumC10573Huf.A05) {
            HatchFloatingChromeGeometry hatchFloatingChromeGeometry = this.$geometry;
            if (hatchFloatingChromeGeometry == null || (c0981AMm = hatchFloatingChromeGeometry.headers) == null) {
                return;
            }
            c0981AMm.remove(this.$slot);
            return;
        }
        HatchFloatingChromeGeometry hatchFloatingChromeGeometry2 = this.$geometry;
        if (hatchFloatingChromeGeometry2 == null || (c0981AMm2 = hatchFloatingChromeGeometry2.headers) == null) {
            return;
        }
        ForegroundHeaderSlot foregroundHeaderSlot = this.$slot;
        c0981AMm2.put(foregroundHeaderSlot, foregroundHeaderSlot.getBounds());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchForegroundHeaderKt$HatchForegroundHeaderSlot$5$1(HatchForegroundHeaderState hatchForegroundHeaderState, ForegroundHeaderSlot foregroundHeaderSlot, boolean z, HatchFloatingChromeGeometry hatchFloatingChromeGeometry) {
        super(1);
        this.$host = hatchForegroundHeaderState;
        this.$slot = foregroundHeaderSlot;
        this.$trackBounds = z;
        this.$geometry = hatchFloatingChromeGeometry;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}
