package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class PairingLauncherPresentationJsonKt {
    public static final String ACTION_ACCEPT = "accept";
    public static final String ACTION_CONFIRM = "confirm";
    public static final String ACTION_INVITE = "invite";
    public static final String HATCH_SCHEME = "hatch";
    public static final String PAIRING_LAUNCHER_ACCEPT_PREFIX = "hatch://peer/accept#";

    public static final TextWithButtonPresentation parsePairingLauncherPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (PairingLauncherPresentationJson) HatchJsonKt.HatchJson.A01(PairingLauncherPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        PairingLauncherPresentationJson pairingLauncherPresentationJson = (PairingLauncherPresentationJson) objA0s;
        if (pairingLauncherPresentationJson != null) {
            return pairingLauncherPresentationJson.toDomain();
        }
        return null;
    }
}
