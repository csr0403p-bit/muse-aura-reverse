package com.facebook.aura.confidentialvm.model;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import androidx.activity.ComponentActivity;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchStep;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSwitchViewModelKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDestination.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmSwitchDestination.CVM_SUBSCRIBE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmSwitchDestination.NONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConfidentialVmSwitchDestination.CVM_ON_WAITLIST, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConfidentialVmSwitchDestination.CVM_LOADING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConfidentialVmSwitchDestination.CVM_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConfidentialVmSwitchDestination.CVM_ENCRYPTION_SETTINGS, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel(BFM bfm, int i) {
        ConfidentialVmSwitchViewModel.Factory factory = new ConfidentialVmSwitchViewModel.Factory(AnonymousClass002.A0h(bfm));
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (ConfidentialVmSwitchViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), "confidential_vm_switch", new C0861A6i(ConfidentialVmSwitchViewModel.class));
    }

    public static final ConfidentialVmSwitchStep stepAfterIntro(ConfidentialVmSwitchDestination confidentialVmSwitchDestination) {
        ConfidentialVmSwitchStep confidentialVmSwitchStep;
        switch (AnonymousClass003.A0L(confidentialVmSwitchDestination)) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 1:
                confidentialVmSwitchStep = ConfidentialVmSwitchStep.Subscribe.INSTANCE;
                break;
            case 2:
                confidentialVmSwitchStep = ConfidentialVmSwitchStep.DataChoice.INSTANCE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return confidentialVmSwitchStep;
    }
}
