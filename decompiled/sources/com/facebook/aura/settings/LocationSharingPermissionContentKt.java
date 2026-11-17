package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C07C;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.G0U;
import X.G0V;
import X.HtJ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.DevicePermissionManageControllerKt;
import com.facebook.aura.commands.core.NodePermissionActivity;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.gateway.store.LocationSharingModesKt;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LocationSharingPermissionContentKt {

    /* renamed from: com.facebook.aura.settings.LocationSharingPermissionContentKt$LocationSharingSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C07C $this_LocationSharingSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C07C c07c, int i) {
            super(2);
            this.$this_LocationSharingSection = c07c;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            LocationSharingPermissionContentKt.LocationSharingSection(this.$this_LocationSharingSection, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void LocationSharingSection(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        bfm.AgG(-1696460208);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, LocationSharingModesKt.deriveLocationMode(contextA0H));
            }
            MutableState mutableState = (MutableState) objAaT;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = LocationSharingPermissionContentKt$LocationSharingSection$requestForegroundLocation$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            G0U<PermissionDestination, Unit> g0uRememberDevicePermissionManageController = DevicePermissionManageControllerKt.rememberDevicePermissionManageController((Function0) objAaT2, null, bfm, 6, 2);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new LocationSharingPermissionContentKt$LocationSharingSection$1$1(contextA0H, mutableState);
                bfm.Ai0(objAaT3);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT3, 6, 2);
            AuraSectionHeaderKt.AuraSectionHeader(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120f1a), null, null, bfm, 48, 4);
            boolean zA1S = AnonymousClass004.A1S(bfm, g0uRememberDevicePermissionManageController, c3ux, bfm.A67(contextA0H));
            Object objAaT4 = bfm.AaT();
            if (zA1S || objAaT4 == obj) {
                objAaT4 = new LocationSharingPermissionContentKt$LocationSharingSection$2$1(contextA0H, g0uRememberDevicePermissionManageController, c3ux, mutableState);
                bfm.Ai0(objAaT4);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT4, bfm, iA0d & 14, 7);
            C01N.A05(bfm, BRg.A00);
            HatchSettingsDescriptionKt.HatchSettingsDescription(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120f17), null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c07c, i);
        }
    }

    public static final Object requestBackgroundLocation(Context context, HtJ<? super Boolean> htJ) {
        return NodePermissionActivity.Companion.requestPermissions(context, new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"}, context.getString(R.string._name_removed__res_0x7f120f16), context.getString(R.string._name_removed__res_0x7f120f15, HatchAppName.value), true, false, htJ);
    }

    public static final /* synthetic */ LocationSharingMode access$LocationSharingSection$lambda$1(MutableState mutableState) {
        return (LocationSharingMode) mutableState.getValue();
    }
}
