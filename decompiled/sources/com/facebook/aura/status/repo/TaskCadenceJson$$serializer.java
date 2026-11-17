package com.facebook.aura.status.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class TaskCadenceJson$$serializer implements C9cd<TaskCadenceJson> {
    public static final TaskCadenceJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TaskCadenceJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TaskCadenceJson.$childSerializers;
        String strA0w = null;
        Long lA0Q = null;
        Long lA0Q2 = null;
        String strA0w2 = null;
        List list = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new TaskCadenceJson(i, strA0w, lA0Q, lA0Q2, strA0w2, list, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                lA0Q2 = C3cI.A0Q(c9iZ, c9j4A55, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 4);
                i |= 16;
            }
        }
    }

    static {
        TaskCadenceJson$$serializer taskCadenceJson$$serializer = new TaskCadenceJson$$serializer();
        INSTANCE = taskCadenceJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.status.repo.TaskCadenceJson", taskCadenceJson$$serializer, 5);
        boolean zA1X = C3cI.A1X(c9iKA1C);
        c9iKA1C.A08("run_at_utc", zA1X);
        c9iKA1C.A08("interval_seconds", zA1X);
        c9iKA1C.A08("time", zA1X);
        c9iKA1C.A08("weekdays", zA1X);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = TaskCadenceJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c9hrA00, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 4)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TaskCadenceJson taskCadenceJson) {
        AnonymousClass003.A0u(interfaceC07789is, taskCadenceJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TaskCadenceJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(taskCadenceJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
