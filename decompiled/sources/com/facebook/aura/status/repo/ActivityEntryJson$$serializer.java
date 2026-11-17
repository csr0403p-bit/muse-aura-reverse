package com.facebook.aura.status.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivityEntryJson$$serializer implements C9cd<ActivityEntryJson> {
    public static final ActivityEntryJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivityEntryJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        JsonObject jsonObject = null;
        String str4 = null;
        String str5 = null;
        ActivityNoteJson activityNoteJson = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ActivityEntryJson(i, str, str9, str8, str7, str5, str6, str4, jsonObject, str3, activityNoteJson, str2, l, (C2hx) null);
                case 0:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    str9 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    str8 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    str7 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    jsonObject = (JsonObject) c9j4A55.A8Z(JsonObjectSerializer.A01, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    activityNoteJson = (ActivityNoteJson) c9j4A55.A8Z(ActivityNoteJson$$serializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ActivityEntryJson$$serializer activityEntryJson$$serializer = new ActivityEntryJson$$serializer();
        INSTANCE = activityEntryJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.ActivityEntryJson", activityEntryJson$$serializer, 12);
        C3cH.A1F("timestamp", c9iKA1C, true);
        C3cH.A1G("turn_id", c9iKA1C, true);
        C3cH.A1H("subtitle", c9iKA1C, true);
        c9iKA1C.A08("task_label", true);
        c9iKA1C.A08("details", true);
        c9iKA1C.A08("hash", true);
        c9iKA1C.A08("note", true);
        c9iKA1C.A08("subject", true);
        c9iKA1C.A08("ts_ms", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonObjectSerializer.A01), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(ActivityNoteJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C9j1.A00)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivityEntryJson activityEntryJson) {
        AnonymousClass003.A0u(interfaceC07789is, activityEntryJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivityEntryJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(activityEntryJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
