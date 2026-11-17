package com.facebook.aura.confidentialvm.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3cG;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.F0C;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDataSource;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConfidentialVmOffWaitlistSheetKey;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchIntroScreenKey;
import com.facebook.aura.navigation.key.EncryptionScreenKey;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConfidentialVmDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final ConfidentialVmDeeplinkRouteProvider INSTANCE = new ConfidentialVmDeeplinkRouteProvider();

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDeeplinkRouteProvider$routeSpecs$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 1);
            ConfidentialVmDeeplinkRouteProvider confidentialVmDeeplinkRouteProvider = ConfidentialVmDeeplinkRouteProvider.INSTANCE;
            if (confidentialVmDeeplinkRouteProvider.isFullyActivated(abstractC3358CGz)) {
                return confidentialVmDeeplinkRouteProvider.switchRoute(abstractC3358CGz);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDestination.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmSwitchDestination.CVM_SUBSCRIBE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmSwitchDestination.CVM_ON_WAITLIST, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConfidentialVmSwitchDestination.CVM_LOADING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConfidentialVmSwitchDestination.CVM_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ConfidentialVmSwitchDestination.NONE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ConfidentialVmSwitchDestination.CVM_ENCRYPTION_SETTINGS, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(uri, abstractC3358CGz);
            String scheme = uri.getScheme();
            if (scheme == null || !scheme.equalsIgnoreCase("hatch")) {
                return null;
            }
            ConfidentialVmDeeplinkRouteProvider confidentialVmDeeplinkRouteProvider = ConfidentialVmDeeplinkRouteProvider.INSTANCE;
            if (confidentialVmDeeplinkRouteProvider.isFullyActivated(abstractC3358CGz)) {
                return confidentialVmDeeplinkRouteProvider.offWaitlistRoute(abstractC3358CGz);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFullyActivated(AbstractC3358CGz abstractC3358CGz) {
        AuraUserData auraUserData = (AuraUserData) C60P.A1J(AuraViewerDataProvider.Companion, abstractC3358CGz);
        return AnonymousClass002.A1Z(auraUserData != null ? auraUserData.getCurrentActivationState(false, false, false) : null, ActivationState.FULLY_ACTIVATED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute offWaitlistRoute(AbstractC3358CGz abstractC3358CGz) {
        switch (ConfidentialVmSwitchDataSource.Companion.getInstance(abstractC3358CGz).getCurrentDestination().ordinal()) {
            case 0:
            case 7:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return C60Q.A0G(ConfidentialVmOffWaitlistSheetKey.INSTANCE);
            default:
                throw C3cG.A0q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuraDeeplinkRoute switchRoute(AbstractC3358CGz abstractC3358CGz) {
        AuraNavKey confidentialVmSwitchIntroScreenKey;
        switch (ConfidentialVmSwitchDataSource.Companion.getInstance(abstractC3358CGz).getCurrentDestination().ordinal()) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                F0C<C9hr<Object>>[] f0cArr = ConfidentialVmSwitchIntroScreenKey.$childSerializers;
                confidentialVmSwitchIntroScreenKey = new ConfidentialVmSwitchIntroScreenKey(ConfidentialVmSwitchEntryPoint.DEEPLINK);
                break;
            case 7:
                confidentialVmSwitchIntroScreenKey = EncryptionScreenKey.INSTANCE;
                break;
            default:
                throw C3cG.A0q();
        }
        return C60Q.A0G(confidentialVmSwitchIntroScreenKey);
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.NOT_APPLICABLE;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope2 = AuraDeeplinkAccessScope.ALL_FAMILY;
        AuraDeeplinkRouteSpec.AnonymousClass1 anonymousClass12 = AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE;
        return Arrays.asList(new AuraDeeplinkRouteSpec("cvm_off_waitlist", "/cvm_off_waitlist", null, auraDeeplinkAccessScope2, auraDeeplinkAccessScope, true, null, anonymousClass12, anonymousClass1), new AuraDeeplinkRouteSpec(ConfidentialVmAnalytics.SWITCH_EVENT_NAME, "/cvm_switch", null, auraDeeplinkAccessScope2, AuraDeeplinkAccessScope.PUBLIC, true, null, anonymousClass12, AnonymousClass2.INSTANCE));
    }
}
