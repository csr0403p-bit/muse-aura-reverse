package com.facebook.aura.devices.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C60Q;
import X.C7384Etj;
import X.C7438Evz;
import X.C7BY;
import X.C9hr;
import X.F0C;
import X.G0U;
import X.G0V;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkAccessScope;
import com.facebook.aura.deeplink.AuraDeeplinkActivation;
import com.facebook.aura.deeplink.AuraDeeplinkRoute;
import com.facebook.aura.deeplink.AuraDeeplinkRouteProvider;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConnectedDevicesScreenKey;
import com.facebook.aura.navigation.key.DeviceDetailsScreenKey;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import com.facebook.aura.utils.HatchUtil;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class DevicesDeeplinkRouteProvider implements AuraDeeplinkRouteProvider {
    public static final int $stable = 0;
    public static final String DEVICES_REPAIR_ROUTE = "devices/repair";
    public static final String DEVICE_SETUP_PATH = "/mhl";
    public static final String DEVICE_SETUP_ROUTE = "mhl";
    public static final DevicesDeeplinkRouteProvider INSTANCE = new DevicesDeeplinkRouteProvider();
    public static final String NAME_PARAM = "name";
    public static final String NODE_ID_PARAM = "nodeId";
    public static final String SETTINGS_DEVICES_PATH = "/settings/devices";
    public static final String SETTINGS_DEVICES_ROUTE = "settings/devices";
    public static final String SETUP_LINK_TYPE = "setup_link";
    public static final String TYPE_PARAM = "type";

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isHatchLinksSettingsEnabled());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isHatchLinksSettingsEnabled());
        }
    }

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isHatchLinksSettingsEnabled());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isHatchLinksSettingsEnabled());
        }
    }

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            return C60Q.A0G(new ConnectedDevicesScreenKey(DevicesDeeplinkRouteProvider.SETUP_LINK_TYPE.equals(uri.getQueryParameter("type"))));
        }
    }

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(uri, 0);
            String queryParameter = uri.getQueryParameter(DevicesDeeplinkRouteProvider.NODE_ID_PARAM);
            if (queryParameter == null || C7BY.A0j(queryParameter)) {
                return null;
            }
            String queryParameter2 = uri.getQueryParameter("name");
            if (queryParameter2 == null || C7BY.A0j(queryParameter2)) {
                queryParameter2 = queryParameter;
            }
            return new AuraDeeplinkRoute(new DeviceDetailsScreenKey(queryParameter, queryParameter2), LaunchFlag.NAVIGATE, null);
        }
    }

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$6, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass6 extends C7438Evz implements G0U<Uri, Boolean> {
        public AnonymousClass6(Object obj) {
            super(1, obj, HatchLinkOrderDeeplink.class, "isWebSettingsPane", "isWebSettingsPane(Landroid/net/Uri;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(Uri uri) {
            return Boolean.valueOf(((HatchLinkOrderDeeplink) AnonymousClass006.A0o(uri, this)).isWebSettingsPane(uri));
        }
    }

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0U<Uri, Boolean> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isLinkDeviceOrderingEnabled());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Uri uri) {
            return Boolean.valueOf(HatchUtil.INSTANCE.isLinkDeviceOrderingEnabled());
        }
    }

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(2);
        }

        @Override // X.G0V
        public final AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(uri, abstractC3358CGz);
            if (AuraDeeplinkActivation.INSTANCE.isMidOnboarding(abstractC3358CGz)) {
                return null;
            }
            F0C<C9hr<Object>>[] f0cArr = HatchLinkOrderSheetKey.$childSerializers;
            return C60Q.A0G(new HatchLinkOrderSheetKey(HatchLinkOrderDeeplink.INSTANCE.entryPoint(uri)));
        }
    }

    @Override // com.facebook.aura.deeplink.AuraDeeplinkRouteProvider
    public List<AuraDeeplinkRouteSpec> routeSpecs() {
        AuraDeeplinkRouteSpec auraDeeplinkRouteSpec = new AuraDeeplinkRouteSpec(DEVICE_SETUP_ROUTE, DEVICE_SETUP_PATH, null, AuraDeeplinkAccessScope.NOT_APPLICABLE, AuraDeeplinkAccessScope.PUBLIC, false, null, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
        AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
        AuraDeeplinkAccessScope auraDeeplinkAccessScope = AuraDeeplinkAccessScope.ALL_FAMILY;
        return Arrays.asList(auraDeeplinkRouteSpec, new AuraDeeplinkRouteSpec(SETTINGS_DEVICES_ROUTE, SETTINGS_DEVICES_PATH, null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, anonymousClass3, anonymousClass4), new AuraDeeplinkRouteSpec(DEVICES_REPAIR_ROUTE, "/devices/repair", null, auraDeeplinkAccessScope, auraDeeplinkAccessScope, false, null, AuraDeeplinkRouteSpec.AnonymousClass1.INSTANCE, AnonymousClass5.INSTANCE), new AuraDeeplinkRouteSpec(HatchLinkOrderDeeplink.ROUTE_NAME, HatchLinkOrderDeeplink.ROUTE_PATH, null, auraDeeplinkAccessScope, AuraDeeplinkAccessScope.PUBLIC, false, new AnonymousClass6(HatchLinkOrderDeeplink.INSTANCE), AnonymousClass7.INSTANCE, AnonymousClass8.INSTANCE));
    }

    /* renamed from: com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider$routeSpecs$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Uri, AbstractC3358CGz, AuraDeeplinkRoute> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final AuraDeeplinkRoute invoke2(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            return C60Q.A0G(new ConnectedDevicesScreenKey(true));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AuraDeeplinkRoute invoke(Uri uri, AbstractC3358CGz abstractC3358CGz) {
            return C60Q.A0G(new ConnectedDevicesScreenKey(true));
        }
    }
}
