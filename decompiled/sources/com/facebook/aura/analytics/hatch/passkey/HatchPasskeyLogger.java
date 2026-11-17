package com.facebook.aura.analytics.hatch.passkey;

import X.AnonymousClass006;
import X.C3cH;
import X.C7384Etj;
import X.Eu1;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;

/* loaded from: classes2.dex */
public final class HatchPasskeyLogger {
    public static final HatchPasskeyLogger INSTANCE = new HatchPasskeyLogger();

    public final void log(HatchPasskeyEvent hatchPasskeyEvent, String str) {
        C7384Etj.A0Y(hatchPasskeyEvent, 0);
        try {
            Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("fx_meta_passkey_events");
            if (eu1AcquireEvent.isSampled()) {
                eu1AcquireEvent.A3y("passkey_event_name", hatchPasskeyEvent.getValue());
                eu1AcquireEvent.A3y("event_flow", hatchPasskeyEvent.getFlow());
                eu1AcquireEvent.A3y("event_category", HatchPasskeyLoggerKt.EVENT_CATEGORY);
                eu1AcquireEvent.A3y("entry_point", "hatch_native_login");
                eu1AcquireEvent.A3g("extra_client_data", AnonymousClass006.A10(PhotosSearchHandlerKt.PARAM_SOURCE, HatchPasskeyLoggerKt.SOURCE));
                eu1AcquireEvent.A3y("error_type", str);
                eu1AcquireEvent.APu();
            }
        } catch (Exception e) {
            C3cH.A1B("failed to log ", hatchPasskeyEvent.getValue(), HatchPasskeyLoggerKt.TAG, e);
        }
    }
}
