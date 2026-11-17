package com.facebook.aura.vds.compose.accessibility;

import X.ARZ;
import X.AbstractC1439Aj8;
import X.AnonymousClass003;
import X.C06H;
import X.C1247Afe;
import X.C1299Agk;
import X.C1Z2;
import X.C2Uv;
import X.EnumC1080AXj;
import X.InterfaceC1348AhZ;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchHapticNode extends AbstractC1439Aj8 implements InterfaceC1348AhZ, C1Z2 {
    public int cachedConstant;
    public boolean enabled;
    public boolean pointerDown;
    public int type;

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public void onViewConfigurationChange() {
        this.pointerDown = false;
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public /* bridge */ void onViewConfigurationChange() {
        this.pointerDown = false;
    }

    @Override // X.InterfaceC1348AhZ
    public /* bridge */ void onViewConfigurationChange() {
        this.pointerDown = false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public /* bridge */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    /* renamed from: getType-5zf0vsI, reason: not valid java name */
    public final int m2399getType5zf0vsI() {
        return this.type;
    }

    @Override // X.InterfaceC1348AhZ
    public /* bridge */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    public /* bridge */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    /* renamed from: updateType-CdsT49E, reason: not valid java name */
    public final void m2401updateTypeCdsT49E(int i) {
        this.type = i;
        this.cachedConstant = AuraHapticsKt.m2394mapToViewConstantCdsT49E(i);
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        AnonymousClass003.A0u(c1247Afe, enumC1080AXj);
        if (enumC1080AXj == EnumC1080AXj.A03) {
            List<C1299Agk> list = c1247Afe.A05;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C1299Agk> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().A0F) {
                        z = true;
                        break;
                    }
                }
            }
            if (this.enabled && z && !this.pointerDown) {
                ((View) ARZ.A01(AndroidCompositionLocals_androidKt.A05, this)).performHapticFeedback(this.cachedConstant);
            }
            this.pointerDown = z;
        }
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    /* renamed from: setType-CdsT49E, reason: not valid java name */
    public final void m2400setTypeCdsT49E(int i) {
        this.type = i;
    }

    public /* synthetic */ HatchHapticNode(int i, boolean z, C06H c06h) {
        this(i, z);
    }

    public HatchHapticNode(int i, boolean z) {
        this.type = i;
        this.enabled = z;
        this.cachedConstant = AuraHapticsKt.m2394mapToViewConstantCdsT49E(i);
    }
}
