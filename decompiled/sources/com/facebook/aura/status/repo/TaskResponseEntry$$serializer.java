package com.facebook.aura.status.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class TaskResponseEntry$$serializer implements C9cd<TaskResponseEntry> {
    public static final TaskResponseEntry$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TaskResponseEntry deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        TaskCadenceJson taskCadenceJson = null;
        String strA0v = null;
        Long l = null;
        String strA0l = null;
        String strA0n = null;
        String strA0k = null;
        String strA0j = null;
        String strA0i = null;
        String strA8f = null;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new TaskResponseEntry(i, strA8f, strA0i, strA0j, strA0k, strA0l, zA8G2, strA0n, zA8G, l, strA0v, taskCadenceJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    zA8G2 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0v = C3cI.A0v(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                case 10:
                    taskCadenceJson = (TaskCadenceJson) c9j4A55.A8Z(TaskCadenceJson$$serializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        TaskResponseEntry$$serializer taskResponseEntry$$serializer = new TaskResponseEntry$$serializer();
        INSTANCE = taskResponseEntry$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.TaskResponseEntry", taskResponseEntry$$serializer, 11);
        C3cH.A1G("id", c9iKA1C, true);
        c9iKA1C.A08("path", true);
        C3cH.A1E("schedule_key", c9iKA1C, true);
        c9iKA1C.A08("enabled", true);
        c9iKA1C.A08("execution_target", true);
        c9iKA1C.A08("is_heartbeat", true);
        c9iKA1C.A08("next_run_at_utc", true);
        c9iKA1C.A08(FeedRepositoryKt.TIMEZONE_PARAM, true);
        c9iKA1C.A08("cadence", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c07839ix, AbstractC07749im.A00(c07779iq), c07839ix, AbstractC07749im.A00(C9j1.A00), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(TaskCadenceJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TaskResponseEntry taskResponseEntry) {
        AnonymousClass003.A0u(interfaceC07789is, taskResponseEntry);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TaskResponseEntry.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(taskResponseEntry, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
