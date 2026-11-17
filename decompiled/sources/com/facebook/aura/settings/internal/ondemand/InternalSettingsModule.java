package com.facebook.aura.settings.internal.ondemand;

import X.AbstractC7391EuP;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7384Etj;
import X.C7463Ews;
import X.C7Gm;
import X.C7Gt;
import X.C9286GCn;
import X.CEB;
import X.CFK;
import X.EnumC3305CDe;
import com.facebook.aura.appmodules.AuraAppModules;

/* loaded from: classes3.dex */
public final class InternalSettingsModule {
    public static final int $stable = 0;
    public static final InternalSettingsModule INSTANCE = new InternalSettingsModule();
    public static final String MODULE_NAME = "internal_settings";
    public static final String TAG = "InternalSettingsModule";
    public static final BLG<InternalSettingsModuleState> mutableState;
    public static final C1BN<InternalSettingsModuleState> state;

    public static final void request$lambda$0(AbstractC7391EuP abstractC7391EuP) {
        Boolean boolValueOf;
        Integer numValueOf;
        Integer num;
        Throwable thA03;
        BLG<InternalSettingsModuleState> blg;
        InternalSettingsModuleState internalSettingsModuleState;
        C7384Etj.A0Y(abstractC7391EuP, 0);
        C7Gm c7Gm = (C7Gm) abstractC7391EuP.A04();
        if (c7Gm == null) {
            boolValueOf = null;
            numValueOf = null;
            num = null;
        } else if (c7Gm.A04) {
            blg = mutableState;
            internalSettingsModuleState = InternalSettingsModuleState.READY;
            AnonymousClass002.A1I(blg, internalSettingsModuleState);
        } else {
            numValueOf = Integer.valueOf(c7Gm.A00);
            num = c7Gm.A01;
            boolValueOf = Boolean.valueOf(c7Gm.A03);
        }
        StringBuilder sbA0f = C3cG.A0f(numValueOf, "internal_settings failed: downloadCode=");
        sbA0f.append(" splitInstallErrorCode=");
        sbA0f.append(num);
        String strA0y = AnonymousClass006.A0y(boolValueOf, " canRetry=", sbA0f);
        if (c7Gm == null || (thA03 = c7Gm.A02) == null) {
            thA03 = abstractC7391EuP.A03();
        }
        CFK.A0A(TAG, strA0y, thA03);
        blg = mutableState;
        internalSettingsModuleState = InternalSettingsModuleState.UNAVAILABLE;
        AnonymousClass002.A1I(blg, internalSettingsModuleState);
    }

    static {
        C9286GCn c9286GCnA14 = C3cG.A14(AuraAppModules.INSTANCE.isDeclared(MODULE_NAME) ? InternalSettingsModuleState.NOT_LOADED : InternalSettingsModuleState.READY);
        mutableState = c9286GCnA14;
        state = C3Pi.A00(c9286GCnA14);
    }

    public final C1BN<InternalSettingsModuleState> getState() {
        return state;
    }

    public final void request() {
        BLG<InternalSettingsModuleState> blg = mutableState;
        InternalSettingsModuleState internalSettingsModuleState = InternalSettingsModuleState.NOT_LOADED;
        InternalSettingsModuleState internalSettingsModuleState2 = InternalSettingsModuleState.LOADING;
        if (C9286GCn.A00(internalSettingsModuleState, internalSettingsModuleState2, (C9286GCn) blg) || C9286GCn.A00(InternalSettingsModuleState.UNAVAILABLE, internalSettingsModuleState2, (C9286GCn) blg)) {
            try {
                AuraAppModules.INSTANCE.getManager().A00(new C7463Ews(EnumC3305CDe.A03, MODULE_NAME)).A05(new CEB() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModule$$ExternalSyntheticLambda0
                    @Override // X.CEB
                    public final void onCompleted(AbstractC7391EuP abstractC7391EuP) {
                        InternalSettingsModule.request$lambda$0(abstractC7391EuP);
                    }
                }, C7Gt.A00);
            } catch (Exception e) {
                CFK.A0A(TAG, "internal_settings request failed", e);
                AnonymousClass002.A1I(blg, InternalSettingsModuleState.UNAVAILABLE);
            }
        }
    }
}
