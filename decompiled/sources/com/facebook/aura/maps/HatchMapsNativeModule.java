package com.facebook.aura.maps;

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
import com.facebook.voltron.api.ActionQueryCalculator$UndefinedModuleException;

/* loaded from: classes3.dex */
public final class HatchMapsNativeModule {
    public static final int $stable = 0;
    public static final HatchMapsNativeModule INSTANCE = new HatchMapsNativeModule();
    public static final String MODULE_NAME = "maps_native";
    public static final String TAG = "HatchMapsNativeModule";
    public static final BLG<HatchMapsNativeModuleState> mutableState;
    public static final C1BN<HatchMapsNativeModuleState> state;

    static {
        C9286GCn c9286GCnA14 = C3cG.A14(AuraAppModules.INSTANCE.isDeclared(MODULE_NAME) ? HatchMapsNativeModuleState.NOT_LOADED : HatchMapsNativeModuleState.READY);
        mutableState = c9286GCnA14;
        state = C3Pi.A00(c9286GCnA14);
    }

    public final C1BN<HatchMapsNativeModuleState> getState() {
        return state;
    }

    public final boolean isInstalled() {
        return AuraAppModules.INSTANCE.isInstalled(MODULE_NAME);
    }

    public final void load() throws ActionQueryCalculator$UndefinedModuleException {
        BLG<HatchMapsNativeModuleState> blg = mutableState;
        HatchMapsNativeModuleState hatchMapsNativeModuleState = HatchMapsNativeModuleState.NOT_LOADED;
        HatchMapsNativeModuleState hatchMapsNativeModuleState2 = HatchMapsNativeModuleState.LOADING;
        if (C9286GCn.A00(hatchMapsNativeModuleState, hatchMapsNativeModuleState2, (C9286GCn) blg) || C9286GCn.A00(HatchMapsNativeModuleState.UNAVAILABLE, hatchMapsNativeModuleState2, (C9286GCn) blg)) {
            AbstractC7391EuP<C7Gm> abstractC7391EuPA00 = AuraAppModules.INSTANCE.getManager().A00(new C7463Ews(EnumC3305CDe.A03, MODULE_NAME));
            CEB ceb = new CEB() { // from class: com.facebook.aura.maps.HatchMapsNativeModule.load.1
                @Override // X.CEB
                public final void onCompleted(AbstractC7391EuP<C7Gm> abstractC7391EuP) {
                    Boolean boolValueOf;
                    Integer numValueOf;
                    Integer num;
                    Throwable thA03;
                    BLG<HatchMapsNativeModuleState> blg2;
                    HatchMapsNativeModuleState hatchMapsNativeModuleState3;
                    C7384Etj.A0Y(abstractC7391EuP, 0);
                    C7Gm c7GmA04 = abstractC7391EuP.A04();
                    if (c7GmA04 == null) {
                        boolValueOf = null;
                        numValueOf = null;
                        num = null;
                    } else if (c7GmA04.A04) {
                        blg2 = HatchMapsNativeModule.mutableState;
                        hatchMapsNativeModuleState3 = HatchMapsNativeModuleState.READY;
                        AnonymousClass002.A1I(blg2, hatchMapsNativeModuleState3);
                    } else {
                        numValueOf = Integer.valueOf(c7GmA04.A00);
                        num = c7GmA04.A01;
                        boolValueOf = Boolean.valueOf(c7GmA04.A03);
                    }
                    StringBuilder sbA0f = C3cG.A0f(numValueOf, "maps_native load failed: downloadCode=");
                    sbA0f.append(" splitInstallErrorCode=");
                    sbA0f.append(num);
                    String strA0y = AnonymousClass006.A0y(boolValueOf, " canRetry=", sbA0f);
                    if (c7GmA04 == null || (thA03 = c7GmA04.A02) == null) {
                        thA03 = abstractC7391EuP.A03();
                    }
                    CFK.A0A(HatchMapsNativeModule.TAG, strA0y, thA03);
                    blg2 = HatchMapsNativeModule.mutableState;
                    hatchMapsNativeModuleState3 = HatchMapsNativeModuleState.UNAVAILABLE;
                    AnonymousClass002.A1I(blg2, hatchMapsNativeModuleState3);
                }
            };
            C7384Etj.A0Y(ceb, 0);
            abstractC7391EuPA00.A05(ceb, C7Gt.A00);
        }
    }
}
