package com.facebook.aura.identity.datr;

import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C31u;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.FGI;
import X.HxE;
import X.InterfaceC7359EnW;
import android.webkit.CookieManager;
import com.facebook.aura.identity.datr.MC;
import com.facebook.aura.login.credentials.AuraSavedCredentialsStore;
import com.facebook.aura.login.nativeflow.HatchCheckpointUrlPolicy;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraDatrDeviceIdentityBridge {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraDatrDeviceIdentityBridge.class, "datrDeviceIdentityBridgeEnabled", "getDatrDeviceIdentityBridgeEnabled()Z");
    public static final AuraDatrDeviceIdentityBridge INSTANCE = new AuraDatrDeviceIdentityBridge();
    public static final List<BridgedCookie> BRIDGED_COOKIES = Collections.singletonList(new BridgedCookie("datr", Arrays.asList(HatchCheckpointUrlPolicy.AUTH_HOST, "accountscenter.meta.com", "meta.com", AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX)));
    public static final C31u datrDeviceIdentityBridgeEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_datr_bridge_sessionless_android.enable_datr_device_identity_bridge);

    private final boolean carriesOnlyMachineId(String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        List listA0e = C7BY.A0e(str, ";");
        ArrayList arrayListA0m = AnonymousClass002.A0m(listA0e);
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(C7BY.A0b(it));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : arrayListA0m) {
            if (AnonymousClass005.A1a((String) obj, FGI.A0M(str2, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR))) {
                arrayListA0h.add(obj);
            }
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h);
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it2);
            arrayListA0m2.add(C7BY.A0Q(strA0j, strA0j, '='));
        }
        if (!arrayListA0m2.isEmpty()) {
            if (!(arrayListA0m2 instanceof Collection) || !arrayListA0m2.isEmpty()) {
                Iterator it3 = arrayListA0m2.iterator();
                while (it3.hasNext()) {
                    if (!C7384Etj.areEqual(it3.next(), str3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final String cookieHeader(BridgedCookie bridgedCookie, String str, String str2) {
        return FGI.A0j(bridgedCookie.name, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str2, "; Domain=", str, "; Path=/; Secure; HttpOnly; SameSite=Lax; Max-Age=31536000");
    }

    private final String cookieUrl(String str) {
        return FGI.A0U("https://", str, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
    }

    private final boolean getDatrDeviceIdentityBridgeEnabled() {
        return C31u.A01(this, datrDeviceIdentityBridgeEnabled$delegate, $$delegatedProperties, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void prepare() {
        String str = AuraSavedCredentialsStore.INSTANCE.getSavedAYMHInfo().idForAYMH;
        if (str == null || str.length() == 0 || !isValidCookieValue(str)) {
            return;
        }
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            List<BridgedCookie> list = BRIDGED_COOKIES;
            ArrayList arrayListA0h = C3cG.A0h();
            for (BridgedCookie bridgedCookie : list) {
                List<String> list2 = bridgedCookie.domains;
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (String str2 : list2) {
                    if (!INSTANCE.carriesOnlyMachineId(cookieManager.getCookie(FGI.A0U("https://", str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH)), bridgedCookie.name, str)) {
                        arrayListA0h2.add(str2);
                    }
                }
                ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
                Iterator it = arrayListA0h2.iterator();
                while (it.hasNext()) {
                    AnonymousClass002.A1J(bridgedCookie, AnonymousClass005.A0j(it), arrayListA0i);
                }
                AbstractC0882AGj.A0r(arrayListA0i, arrayListA0h);
            }
            if (arrayListA0h.isEmpty() || !getDatrDeviceIdentityBridgeEnabled()) {
                return;
            }
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                HxE hxEA10 = C60Q.A10(it2);
                BridgedCookie bridgedCookie2 = (BridgedCookie) hxEA10.first;
                String str3 = (String) hxEA10.second;
                cookieManager.setCookie(FGI.A0U("https://", str3, CustomConnectorRegisterRepositoryKt.ROOT_PATH), INSTANCE.cookieHeader(bridgedCookie2, str3, str));
            }
            cookieManager.flush();
        } catch (Exception e) {
            CFK.A08(AuraDatrDeviceIdentityBridgeKt.TAG, "Failed to prepare device-identity cookies", e);
        }
    }

    private final boolean isValidCookieValue(String str) {
        int length = str.length();
        if (length > 0) {
            int i = 0;
            do {
                char cCharAt = str.charAt(i);
                if ('!' <= cCharAt && cCharAt < '\u007f' && !BFI.A0H(new Character[]{',', ';', '\"', '\\'}).contains(Character.valueOf(cCharAt))) {
                    i++;
                }
            } while (i < length);
            return true;
        }
        return false;
    }
}
