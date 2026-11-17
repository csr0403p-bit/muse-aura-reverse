package com.facebook.aura.ui.gestures;

import X.ARZ;
import X.AbstractC1078AXh;
import X.AbstractC1439Aj8;
import X.AnonymousClass003;
import X.C1247Afe;
import X.C1299Agk;
import X.C1Z2;
import X.C2Uv;
import X.C7384Etj;
import X.EnumC1080AXj;
import X.InterfaceC1348AhZ;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class LongPressMediaTargetNode extends AbstractC1439Aj8 implements InterfaceC1348AhZ, C1Z2 {
    public String key;

    public LongPressMediaTargetNode(String str) {
        C7384Etj.A0Y(str, 0);
        this.key = str;
    }

    public final void setKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public /* bridge */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public /* bridge */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public void onViewConfigurationChange() {
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public /* bridge */ void onViewConfigurationChange() {
    }

    @Override // X.InterfaceC1348AhZ
    public /* bridge */ void onViewConfigurationChange() {
    }

    @Override // X.InterfaceC1348AhZ
    public /* bridge */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        AnonymousClass003.A0u(c1247Afe, enumC1080AXj);
        if (enumC1080AXj == EnumC1080AXj.A03) {
            List<C1299Agk> list = c1247Afe.A05;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator<C1299Agk> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC1078AXh.A01(it.next())) {
                    ChildPressTracker childPressTracker = (ChildPressTracker) ARZ.A01(ChildPressTrackerKt.LocalChildPressTracker, this);
                    if (childPressTracker != null) {
                        childPressTracker.pressedMediaKey = this.key;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
