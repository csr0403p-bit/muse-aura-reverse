package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.aura.bloks.asynccomponent.AuraComponentQueryStoreFetcher;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FBN {
    public static final Handler A0B = C60O.A02();
    public C7708FBg A00;
    public final Handler A01;
    public final FC4 A02;
    public final FBQ A03;
    public final FBt A04;
    public final C7709FBh<C7687FAg> A05;
    public final Object A06;
    public final Object A07;
    public final Runnable A08;
    public final List<C7719FBv> A09;
    public final Executor A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:7:0x0018, B:8:0x001a, B:10:0x003e, B:11:0x0045, B:13:0x004b, B:15:0x004f, B:17:0x005f, B:20:0x0092, B:21:0x009a, B:23:0x00a2, B:26:0x00b6, B:28:0x00ba, B:30:0x00c0, B:32:0x00c8, B:34:0x00fb, B:37:0x0109, B:47:0x013d, B:48:0x0140, B:40:0x012f, B:36:0x0102), top: B:54:0x0018, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7665F9i A00(X.FBN r18, X.FBX r19, X.C7708FBg r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FBN.A00(X.FBN, X.FBX, X.FBg, boolean):X.F9i");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FBX;ZLX/G0U<-LX/HoL;Lkotlin/Unit;>;)LX/FAi; */
    public final AbstractC7689FAi A02(FBX fbx, G0U g0u, boolean z) throws NoSuchAlgorithmException {
        AbstractC7689FAi abstractC7689FAiA00;
        String strA01 = new C7403Euh(((AbstractC7712FBk) fbx).A02, fbx.A04).A01();
        synchronized (this.A06) {
            abstractC7689FAiA00 = A00(this, fbx, null, z);
            if (abstractC7689FAiA00 == null) {
                C7719FBv c7719FBv = new C7719FBv(strA01, g0u, new FYR(strA01, this, 2));
                this.A09.add(c7719FBv);
                abstractC7689FAiA00 = new C7664F9h(new RunnableC7721FBx(c7719FBv));
            }
        }
        return abstractC7689FAiA00;
    }

    public FBN(AuraComponentQueryStoreFetcher auraComponentQueryStoreFetcher, HsW hsW, FBt fBt) {
        C7708FBg c7708FBg;
        RunnableC7717FBs runnableC7717FBs;
        Handler handler = new Handler(((HandlerThread) GVS.A00.getValue()).getLooper());
        FBQ fbq = new FBQ(auraComponentQueryStoreFetcher, hsW, fBt);
        HqC hqC = new HqC(handler);
        this.A01 = handler;
        this.A03 = fbq;
        this.A04 = fBt;
        this.A0A = hqC;
        Object objA0T = C3cG.A0T();
        this.A07 = objA0T;
        this.A05 = new C7709FBh<>();
        synchronized (objA0T) {
            C8937Ftt c8937Ftt = new C8937Ftt(this, 0);
            synchronized (fBt.A03) {
                FBJ<C7705FBd> fbjA01 = fBt.A01.A01(new C8936Fts(fBt, c8937Ftt, 0));
                FBJ<C7705FBd> fbjA012 = fBt.A02.A01(new C8936Fts(fBt, c8937Ftt, 1));
                c7708FBg = new C7708FBg(fbjA01.A00, fbjA012.A00);
                fBt.A00 = c7708FBg;
                runnableC7717FBs = new RunnableC7717FBs(fbjA01, fbjA012);
            }
            this.A00 = c7708FBg;
            this.A08 = runnableC7717FBs;
        }
        this.A06 = C3cG.A0T();
        this.A09 = C3cG.A0h();
        this.A02 = new FC4(this);
    }

    public static final void A01(FBN fbn, HoL hoL) {
        ArrayList arrayListA0h = C3cG.A0h();
        synchronized (fbn.A06) {
            Iterator<C7719FBv> it = fbn.A09.iterator();
            while (it.hasNext()) {
                C7719FBv next = it.next();
                G0U<HoL, Unit> g0u = next.A01;
                if (next.A00.equals(hoL instanceof FAY ? ((FAY) hoL).A01 : hoL.A01)) {
                    arrayListA0h.add(g0u);
                    if (hoL.A00()) {
                        it.remove();
                    }
                }
            }
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            ((G0U) it2.next()).invoke(hoL);
        }
    }
}
