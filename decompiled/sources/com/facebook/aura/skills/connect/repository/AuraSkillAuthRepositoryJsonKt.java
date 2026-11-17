package com.facebook.aura.skills.connect.repository;

import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C2nw;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C7qW;
import android.net.Uri;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.connect.config.SkillConnectConfigKt;
import com.facebook.aura.skills.connect.repository.SkillConnectAction;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class AuraSkillAuthRepositoryJsonKt {
    public static final Set<String> API_KEY_AUTH_RESERVED_CALLBACK_PARAM_NAMES = C60O.A19("provider", "key");
    public static final Set<String> USERNAME_PASSWORD_AUTH_RESERVED_CALLBACK_PARAM_NAMES = C60O.A1A("provider", "username", HatchConnectorQplLogger.AuthType.PASSWORD);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final SkillConnectAction toDomain(SkillConnectInfoResponseJson skillConnectInfoResponseJson) {
        SkillConnectAction skillConnectAction;
        String str;
        C7384Etj.A0Y(skillConnectInfoResponseJson, 0);
        SkillConnectActionJson skillConnectActionJson = skillConnectInfoResponseJson.action;
        String str2 = skillConnectActionJson.type;
        switch (str2.hashCode()) {
            case -1655826255:
                if (str2.equals("consent_only")) {
                    skillConnectAction = SkillConnectAction.ConsentOnly.INSTANCE;
                    break;
                }
                return null;
            case -1436108013:
                if (str2.equals("messenger")) {
                    skillConnectAction = SkillConnectAction.Messenger.INSTANCE;
                    break;
                }
                return null;
            case -800085318:
                if (str2.equals(HatchConnectorQplLogger.AuthType.API_KEY)) {
                    skillConnectAction = SkillConnectAction.ApiKey.INSTANCE;
                    break;
                }
                return null;
            case -25543473:
                if (str2.equals("foa_auth")) {
                    skillConnectAction = SkillConnectAction.FoaAuth.INSTANCE;
                    break;
                }
                return null;
            case 3387192:
                if (str2.equals("none")) {
                    skillConnectAction = SkillConnectAction.None.INSTANCE;
                    break;
                }
                return null;
            case 105516695:
                if (str2.equals("oauth") && (str = skillConnectActionJson.url) != null && !C7BY.A0j(str)) {
                    return new SkillConnectAction.OAuth(str);
                }
                return null;
            case 1934780818:
                if (str2.equals(NativeLoginAccountResolverKt.WHATSAPP_USER_ID)) {
                    skillConnectAction = SkillConnectAction.WhatsApp.INSTANCE;
                    break;
                }
                return null;
            default:
                return null;
        }
        return skillConnectAction;
    }

    public static final JsonElement usernamePasswordAuthBody(String str, String str2, String str3, String str4) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str3, 2);
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("provider", str, c2nwA1K);
        C7qW.A06("username", str2, c2nwA1K);
        C7qW.A06(HatchConnectorQplLogger.AuthType.PASSWORD, str3, c2nwA1K);
        putCallbackParams(c2nwA1K, str4 != null ? SkillConnectConfigKt.nonServiceParamsFromHatchUrl(str4, SkillConnectConfigKt.HATCH_PASSWORD_PATH) : AGH.A0E(), USERNAME_PASSWORD_AUTH_RESERVED_CALLBACK_PARAM_NAMES);
        return c2nwA1K.A00();
    }

    public static final JsonElement apiKeyAuthBody(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("provider", str, c2nwA1K);
        C7qW.A06("key", str2, c2nwA1K);
        putCallbackParams(c2nwA1K, str3 != null ? SkillConnectConfigKt.nonServiceParamsFromHatchUrl(str3, "/connect/api-key") : AGH.A0E(), API_KEY_AUTH_RESERVED_CALLBACK_PARAM_NAMES);
        return c2nwA1K.A00();
    }

    public static final String integrationKeyFromFragment(Uri uri) {
        List listA0d;
        Object next;
        String strDecode;
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment != null && (listA0d = C7BY.A0d(encodedFragment)) != null) {
            Iterator it = listA0d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = (String) next;
                if ("integration_key".equals(Uri.decode(C7BY.A0S(str, str, '=')))) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null && (strDecode = Uri.decode(C7BY.A0Q(str2, "", '='))) != null && strDecode.length() != 0) {
                return strDecode;
            }
        }
        return null;
    }

    public static final JsonObject oauthCallbackBody(Uri uri) {
        C2nw c2nwA0s = C60R.A0s(uri);
        Iterator it = Arrays.asList("state", AuraDeeplinkRouteMapper.CODE_PARAM, "iss", "error", "error_description").iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            String queryParameter = uri.getQueryParameter(strA0j);
            if (queryParameter != null) {
                C7qW.A06(strA0j, queryParameter, c2nwA0s);
            }
        }
        String strIntegrationKeyFromFragment = integrationKeyFromFragment(uri);
        if (strIntegrationKeyFromFragment != null) {
            C7qW.A06("integration_key", strIntegrationKeyFromFragment, c2nwA0s);
        }
        return C7qW.A01("auth_intent", "connect", c2nwA0s);
    }

    public static final void putCallbackParams(C2nw c2nw, Map<String, String> map, Set<String> set) {
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            String str = (String) entryA0l.getValue();
            if (!set.contains(strA0t)) {
                C7qW.A06(strA0t, str, c2nw);
            }
        }
    }
}
