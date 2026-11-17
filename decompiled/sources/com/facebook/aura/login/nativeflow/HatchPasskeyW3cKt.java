package com.facebook.aura.login.nativeflow;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFI;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9oY;
import X.C9sU;
import X.DCl;
import X.F0C;
import android.util.Base64;
import com.facebook.aura.json.HatchJsonKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public abstract class HatchPasskeyW3cKt {
    public static final long DEFAULT_TIMEOUT_MS = 60000;
    public static final long MAX_TIMEOUT_MS = 300000;
    public static final String RESPONSE_KEY = "response";
    public static final String USER_HANDLE_KEY = "userHandle";
    public static final String USER_VERIFICATION_PREFERRED = "preferred";
    public static final Set<String> USER_VERIFICATION_VALUES = BFI.A0H(new String[]{"required", USER_VERIFICATION_PREFERRED, "discouraged"});

    public static final String base64UrlPasskeyResponse(String str) {
        C7384Etj.A0Y(str, 0);
        return base64Url(C3cG.A1S(withoutBlankUserHandle(str)));
    }

    public static final String toRequestOptionsJson(HatchPasskeyRequestOptions hatchPasskeyRequestOptions) {
        C7384Etj.A0Y(hatchPasskeyRequestOptions, 0);
        C9sU c9sU = HatchJsonKt.HatchJson;
        F0C<C9hr<Object>>[] f0cArr = W3cRequestOptionsJson.$childSerializers;
        W3cRequestOptionsJson$$serializer w3cRequestOptionsJson$$serializer = W3cRequestOptionsJson$$serializer.INSTANCE;
        String strStructuredChallenge = structuredChallenge(hatchPasskeyRequestOptions.challenge);
        String str = hatchPasskeyRequestOptions.rpId;
        long jTimeoutOrDefault = timeoutOrDefault(hatchPasskeyRequestOptions.timeoutMs);
        String strUserVerificationOrDefault = userVerificationOrDefault(hatchPasskeyRequestOptions.userVerification);
        List<HatchPasskeyDescriptor> list = hatchPasskeyRequestOptions.allowCredentials;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<HatchPasskeyDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(toW3c(it.next()));
        }
        return c9sU.A02(new W3cRequestOptionsJson(strStructuredChallenge, str, jTimeoutOrDefault, strUserVerificationOrDefault, arrayListA0i), w3cRequestOptionsJson$$serializer);
    }

    public static final String base64Url(byte[] bArr) {
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C7384Etj.A0U(strEncodeToString);
        return strEncodeToString;
    }

    public static final String structuredChallenge(String str) {
        C9sU c9sU = HatchJsonKt.HatchJson;
        ChallengeStructJson$$serializer challengeStructJson$$serializer = ChallengeStructJson$$serializer.INSTANCE;
        Charset charset = DCl.A05;
        return base64Url(c9sU.A02(new ChallengeStructJson(base64Url(str.getBytes(charset))), challengeStructJson$$serializer).getBytes(charset));
    }

    public static final W3cDescriptorJson toW3c(HatchPasskeyDescriptor hatchPasskeyDescriptor) {
        String str = hatchPasskeyDescriptor.id;
        String str2 = hatchPasskeyDescriptor.type;
        List<String> list = hatchPasskeyDescriptor.transports;
        if (list.isEmpty()) {
            list = null;
        }
        return new W3cDescriptorJson(str, str2, list);
    }

    public static final String withoutBlankUserHandle(String str) {
        Object objA0s;
        JsonElement jsonElement;
        String strA04;
        try {
            objA0s = C9oY.A05(HatchJsonKt.HatchJson.A04(str));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        JsonObject jsonObject = (JsonObject) objA0s;
        JsonElement jsonElement2 = jsonObject != null ? (JsonElement) jsonObject.get(RESPONSE_KEY) : null;
        JsonObject jsonObject2 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
        if (jsonObject2 != null && (jsonElement = (JsonElement) jsonObject2.get(USER_HANDLE_KEY)) != null) {
            JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
            if (jsonPrimitive == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || strA04.length() <= 0) {
                return HatchJsonKt.HatchJson.A02(new JsonObject(AnonymousClass006.A11(RESPONSE_KEY, new JsonObject(AGH.A09(USER_HANDLE_KEY, jsonObject2)), jsonObject)), JsonObjectSerializer.A01);
            }
        }
        return str;
    }

    public static final long timeoutOrDefault(long j) {
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.longValue() <= 0) {
            return 60000L;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 300000) {
            return 300000L;
        }
        return jLongValue;
    }

    public static final String userVerificationOrDefault(String str) {
        String strA0u = AnonymousClass001.A0u(str);
        return !USER_VERIFICATION_VALUES.contains(strA0u) ? USER_VERIFICATION_PREFERRED : strA0u;
    }
}
