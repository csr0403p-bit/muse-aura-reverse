package com.facebook.aura.conversation.repo;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.F0C;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class HatchThreadsRepositoryJsonKt {
    public static final String TAG = "HatchThreadsRepository";

    public static final SessionDetails parseSessionDetailsPayload(JsonObject jsonObject, String str) {
        Object objA0s;
        List list;
        Object objA0s2;
        SessionDetails details;
        SessionItemJson sessionItemJson;
        boolean zA1a = AnonymousClass002.A1a(jsonObject, str);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = SessionDetailsPayloadJson.$childSerializers;
            objA0s = (SessionDetailsPayloadJson) c9sU.A01(SessionDetailsPayloadJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A(TAG, "GET /api/session/list/{id} response parse failed", thA00);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        SessionDetailsPayloadJson sessionDetailsPayloadJson = (SessionDetailsPayloadJson) objA0s;
        List listA0z = AbstractC0885AGm.A0z((sessionDetailsPayloadJson == null || (sessionItemJson = sessionDetailsPayloadJson.session) == null) ? null : sessionItemJson.toDetails(sessionDetailsPayloadJson.archived));
        if (sessionDetailsPayloadJson == null || (list = sessionDetailsPayloadJson.sessions) == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            SessionItemJson sessionItemJson2 = (SessionItemJson) it.next();
            if (sessionDetailsPayloadJson == null || sessionDetailsPayloadJson.archived != zA1a) {
                z = false;
            }
            arrayListA0i.add(sessionItemJson2.toDetails(z));
        }
        SessionDetails sessionDetailsFirstMatchingSessionDetails = firstMatchingSessionDetails(AbstractC0878AGe.A0P(arrayListA0i, listA0z), str);
        if (sessionDetailsFirstMatchingSessionDetails != null) {
            return sessionDetailsFirstMatchingSessionDetails;
        }
        try {
            objA0s2 = (SessionItemJson) HatchJsonKt.HatchJson.A01(SessionItemJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th2) {
            objA0s2 = C3cG.A0s(th2);
        }
        if (objA0s2 instanceof C10571Hud) {
            objA0s2 = null;
        }
        SessionItemJson sessionItemJson3 = (SessionItemJson) objA0s2;
        if (sessionItemJson3 == null || (details = sessionItemJson3.toDetails(false)) == null || !str.equals(details.session.sessionId)) {
            return null;
        }
        return details;
    }

    public static final SessionDetails firstMatchingSessionDetails(List<SessionDetails> list, String str) {
        SessionDetails next;
        Iterator<SessionDetails> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.session.sessionId, str)) {
                break;
            }
        }
        return next;
    }
}
