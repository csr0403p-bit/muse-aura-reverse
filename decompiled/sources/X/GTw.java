package X;

import android.content.Context;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.sdk.RsysSdkImpl;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GTw extends InitCallCallback {
    public final /* synthetic */ GTy A00;
    public final /* synthetic */ RsysSdkImpl A01;
    public final /* synthetic */ SettableFuture<AbstractC9636GWg> A02;

    @Override // com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback
    public final void onCall(Call call) {
        C7384Etj.A0Y(call, 0);
        GTy gTy = this.A00;
        CallIntent callIntent = gTy.A02;
        String str = callIntent.localCallId;
        C7384Etj.A0T(str);
        CallContext callContext = callIntent.callContext;
        C7384Etj.A0T(callContext);
        GVw gVw = gTy.A00;
        AbstractC9635GVx abstractC9635GVx = gTy.A03;
        RsysSdkImpl rsysSdkImpl = this.A01;
        GSS gss = rsysSdkImpl.A01;
        Context context = rsysSdkImpl.A00;
        TaskExecutor taskExecutor = rsysSdkImpl.A05;
        G56 g56Invoke = rsysSdkImpl.A0F.invoke(call);
        C9597GRd c9597GRd = new C9597GRd(context, gss, gVw, callContext, rsysSdkImpl.A0G.invoke(call), abstractC9635GVx, taskExecutor, g56Invoke, rsysSdkImpl.A07, str, rsysSdkImpl.A0H);
        Map<String, GR9> map = rsysSdkImpl.A08;
        C7384Etj.A0U(map);
        map.put(c9597GRd.A05, c9597GRd);
        C9605GRm c9605GRm = rsysSdkImpl.A06;
        C7384Etj.A0Y(c9605GRm, 0);
        if (c9597GRd.A06.add(c9605GRm)) {
            GRD grd = c9597GRd.A00;
            if (grd != null) {
                c9605GRm.AUC(c9597GRd, grd);
            }
            if (c9597GRd.A01) {
                c9605GRm.AS4(c9597GRd);
            }
        }
        Iterator it = rsysSdkImpl.A0A.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onInitCall");
        }
        this.A02.set(new GV8(c9597GRd));
    }

    public GTw(GTy gTy, RsysSdkImpl rsysSdkImpl, SettableFuture<AbstractC9636GWg> settableFuture) {
        this.A00 = gTy;
        this.A01 = rsysSdkImpl;
        this.A02 = settableFuture;
    }

    @Override // com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback
    public final AudioStateManagerProxy getAudioStateManagerProxy(String str) {
        return null;
    }

    @Override // com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback
    public final void onCallRemoved(Call call) {
    }
}
