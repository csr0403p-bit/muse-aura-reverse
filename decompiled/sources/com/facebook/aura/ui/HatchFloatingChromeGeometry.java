package com.facebook.aura.ui;

import X.AGE;
import X.AGF;
import X.AnonymousClass001;
import X.BBP;
import X.BLU;
import X.C0981AMm;
import X.C1BO;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchFloatingChromeGeometry {
    public static final int $stable = 0;
    public final MutableState floatingOccluder$delegate;
    public final MutableState floatingOccluderDocked$delegate;
    public final C1BO hasFloatingOccluder$delegate;
    public final C0981AMm<Object, BLU> headers = new C0981AMm<>();
    public final C0981AMm<Object, BLU> bottomBars = new C0981AMm<>();

    public final boolean isOnlyHeaderAboveFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui(Object obj) {
        BLU floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui;
        C7384Etj.A0Y(obj, 0);
        BLU blu = this.headers.get(obj);
        if (blu != null && (floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui()) != null && MutableState.A0A(this.floatingOccluderDocked$delegate) && HatchFloatingChromeGeometryKt.isAbove(blu, floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui)) {
            C0981AMm<Object, BLU> c0981AMm = this.headers;
            if (c0981AMm.isEmpty()) {
                return true;
            }
            for (Map.Entry<Object, BLU> entry : c0981AMm.entrySet()) {
                Object key = entry.getKey();
                BLU value = entry.getValue();
                if (key == obj || value.A00 <= blu.A03 || !HatchFloatingChromeGeometryKt.isAbove(value, floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui)) {
                }
            }
            return true;
        }
        return false;
    }

    public final Boolean isUnderFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui(Object obj) {
        boolean z = false;
        C7384Etj.A0Y(obj, 0);
        BLU blu = this.headers.get(obj);
        if (blu == null) {
            return null;
        }
        BLU floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui = getFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui();
        if (floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui != null && blu.A02 > floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui.A01 && floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui.A02 > blu.A01 && blu.A00 > floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui.A03 && floatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui.A00 > blu.A03) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final C0981AMm<Object, BLU> getBottomBars() {
        return this.bottomBars;
    }

    public final BLU getFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return (BLU) this.floatingOccluder$delegate.getValue();
    }

    public final boolean getFloatingOccluderDocked$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return MutableState.A0A(this.floatingOccluderDocked$delegate);
    }

    public final boolean getHasFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return C1BO.A0F(this.hasFloatingOccluder$delegate);
    }

    public final C0981AMm<Object, BLU> getHeaders() {
        return this.headers;
    }

    public final void setFloatingOccluder$fbandroid_express_aura_java_com_facebook_aura_ui_ui(BLU blu) {
        this.floatingOccluder$delegate.Af8(blu);
    }

    public final void setFloatingOccluderDocked$fbandroid_express_aura_java_com_facebook_aura_ui_ui(boolean z) {
        MutableState.A09(z, this.floatingOccluderDocked$delegate);
    }

    public HatchFloatingChromeGeometry() {
        AGE ageA01 = AGF.A01();
        this.floatingOccluder$delegate = new ParcelableSnapshotMutableState(ageA01, null);
        this.floatingOccluderDocked$delegate = new ParcelableSnapshotMutableState(ageA01, AnonymousClass001.A0h());
        this.hasFloatingOccluder$delegate = new BBP(null, new HatchFloatingChromeGeometry$hasFloatingOccluder$2(this));
    }
}
