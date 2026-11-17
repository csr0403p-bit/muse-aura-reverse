package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C07C;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.gateway.store.LocationSharingMode;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ LocationSharingMode $mode;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $requestForegroundLocation;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ MutableState<LocationSharingMode> $selectedMode$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationSharingMode.values().length];
            try {
                AnonymousClass002.A13(LocationSharingMode.NEVER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocationSharingMode.WHEN_CHATTING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocationSharingMode.ALWAYS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1(LocationSharingMode locationSharingMode, Context context, G0U<? super PermissionDestination, Unit> g0u, C3UX c3ux, MutableState<LocationSharingMode> mutableState) {
        super(3);
        this.$mode = locationSharingMode;
        this.$context = context;
        this.$requestForegroundLocation = g0u;
        this.$scope = c3ux;
        this.$selectedMode$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        int i2;
        C7384Etj.A0Y(c07c, 0);
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            int iOrdinal = this.$mode.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        bfm.AgE(172005868);
                        i2 = R.string._name_removed__res_0x7f120f14;
                    } else {
                        throw AnonymousClass005.A0k(bfm, 171997078);
                    }
                } else {
                    bfm.AgE(172002515);
                    i2 = R.string._name_removed__res_0x7f120f1b;
                }
            } else {
                bfm.AgE(171998603);
                i2 = R.string._name_removed__res_0x7f120f18;
            }
            String strA0e = AnonymousClass003.A0e(bfm, i2);
            AuraCardType.Radio radio = AuraCardType.Radio.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(strA0e, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            LocationSharingMode value = this.$selectedMode$delegate.getValue();
            LocationSharingMode locationSharingMode = this.$mode;
            if (value != locationSharingMode) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$scope, AnonymousClass001.A1R(bfm, this.$requestForegroundLocation, AnonymousClass001.A1T(bfm, this.$context, AnonymousClass002.A1U(bfm, locationSharingMode))));
            LocationSharingMode locationSharingMode2 = this.$mode;
            Context context = this.$context;
            G0U<PermissionDestination, Unit> g0u = this.$requestForegroundLocation;
            C3UX c3ux = this.$scope;
            MutableState<LocationSharingMode> mutableState = this.$selectedMode$delegate;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new LocationSharingPermissionContentKt$LocationSharingSection$2$1$1$1$1$1(locationSharingMode2, context, g0u, c3ux, mutableState);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, radio, null, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 261744);
            return;
        }
        bfm.Afo();
    }
}
