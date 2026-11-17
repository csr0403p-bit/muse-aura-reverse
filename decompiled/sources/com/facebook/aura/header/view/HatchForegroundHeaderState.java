package com.facebook.aura.header.view;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BBP;
import X.C00r;
import X.C1BO;
import X.C1HY;
import X.C5303Dfm;
import X.C7384Etj;
import X.EnumC10573Huf;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchForegroundHeaderState {
    public static final int $stable = 0;
    public final Function0<Boolean> available;
    public final C00r contentInsetPx$delegate;
    public final C1BO elevated$delegate;
    public final C1BO foregroundOwner$delegate;
    public final SnapshotStateList<ForegroundHeaderSlot> slots;

    public final boolean isAvailableFor(C1HY c1hy) {
        C7384Etj.A0Y(c1hy, 0);
        return AnonymousClass003.A1Y(this.available) && ((C5303Dfm) c1hy.getLifecycle()).A01 == EnumC10573Huf.A05 && c1hy == getForegroundOwner();
    }

    public final boolean isElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view(ForegroundHeaderSlot foregroundHeaderSlot) {
        C7384Etj.A0Y(foregroundHeaderSlot, 0);
        return C1BO.A0F(this.elevated$delegate) && foregroundHeaderSlot.owner == getForegroundOwner();
    }

    private final C1HY getForegroundOwner() {
        return (C1HY) this.foregroundOwner$delegate.getValue();
    }

    public final int getContentInsetPx$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.contentInsetPx$delegate.AGd();
    }

    public final boolean getElevated$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return C1BO.A0F(this.elevated$delegate);
    }

    public final SnapshotStateList<ForegroundHeaderSlot> getSlots$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.slots;
    }

    public final void setContentInsetPx$fbandroid_express_aura_java_com_facebook_aura_header_view_view(int i) {
        this.contentInsetPx$delegate.AdX(i);
    }

    public HatchForegroundHeaderState(HatchStatusPillMetrics hatchStatusPillMetrics, Function0<Boolean> function0) {
        boolean zA1b = AnonymousClass004.A1b(hatchStatusPillMetrics, function0);
        this.available = function0;
        this.slots = new SnapshotStateList();
        this.contentInsetPx$delegate = new ParcelableSnapshotMutableIntState(zA1b ? 1 : 0);
        this.elevated$delegate = new BBP(null, new HatchForegroundHeaderState$elevated$2(this, hatchStatusPillMetrics));
        this.foregroundOwner$delegate = new BBP(null, new HatchForegroundHeaderState$foregroundOwner$2(this));
    }
}
