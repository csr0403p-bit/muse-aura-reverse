package X;

import com.hatch.browser.core.Hatch_browser_core_uniffiKt;
import com.hatch.browser.core.UniffiForeignFutureDroppedCallbackStruct;
import com.hatch.browser.core.uniffiForeignFutureDroppedCallbackImpl;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class GAo {
    public static void A03(UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct, G0V g0v, C3UX c3ux) {
        uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(new UniffiForeignFutureDroppedCallbackStruct(Hatch_browser_core_uniffiKt.uniffiForeignFutureHandleMap.insert(A02(C79.A00, C6ys.A00, g0v, c3ux)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/78T;LX/G0V<-LX/3UX;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    public static final Object A00(HtJ htJ, C78T c78t, G0V g0v) {
        C78T context = htJ.getContext();
        C78T c78tA00 = GAr.A00(context, c78t);
        HzS.A05(c78tA00);
        if (c78tA00 == context) {
            GAk gAk = new GAk(htJ, c78tA00);
            return GAj.A00(gAk, g0v, gAk, true);
        }
        Hx7 hx7 = InterfaceC10590Hxd.A00;
        if (C7384Etj.areEqual(c78tA00.get(hx7), context.get(hx7))) {
            GAp gAp = new GAp(htJ, c78tA00);
            C78T c78t2 = ((GAq) gAp).A00;
            Object objA00 = GCA.A00(null, c78t2);
            try {
                return GAj.A00(gAp, g0v, gAp, true);
            } finally {
                GCA.A02(objA00, c78t2);
            }
        }
        GAs gAs = new GAs(htJ, c78tA00);
        GAl.A00(gAs, gAs, g0v);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = GAs.A00;
        do {
            int i = atomicIntegerFieldUpdater.get(gAs);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objA002 = AbstractC9251GBe.A00(GBM.A01.get(gAs));
                if (objA002 instanceof C10474Hkl) {
                    throw ((C10474Hkl) objA002).A00;
                }
                return objA002;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(gAs, 0, 1));
        return EnumC10460Hji.A02;
    }

    public static final C10550Hrx A01(Integer num, C78T c78t, G0V g0v, C3UX c3ux) {
        C78T c78tA02 = GAr.A02(c78t, c3ux);
        C10550Hrx gAm = num == C79.A01 ? new GAm(c78tA02, g0v) : new C10550Hrx(c78tA02, true);
        gAm.A0U(num, gAm, g0v);
        return gAm;
    }

    public static final C10533Hqc A02(Integer num, C78T c78t, G0V g0v, C3UX c3ux) {
        C78T c78tA02 = GAr.A02(c78t, c3ux);
        C10533Hqc gAn = num == C79.A01 ? new GAn(c78tA02, g0v) : new C10533Hqc(c78tA02, true);
        gAn.A0U(num, gAn, g0v);
        return gAn;
    }
}
