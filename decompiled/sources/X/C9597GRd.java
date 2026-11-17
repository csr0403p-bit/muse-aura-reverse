package X;

import android.content.Context;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.execution.gen.TaskExecutor;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;

/* renamed from: X.GRd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9597GRd implements GR9 {
    public GRD A00;
    public boolean A01;
    public final GVw A02;
    public final CallApi A03;
    public final Integer A04;
    public final String A05;
    public final CopyOnWriteArraySet<GS8> A06;
    public final G0U<Runnable, Unit> A07;
    public final boolean A08;
    public final Context A09;
    public final GSS A0A;
    public final CallContext A0B;
    public final AbstractC9635GVx A0C;
    public final G56 A0D;

    public C9597GRd(Context context, GSS gss, GVw gVw, CallContext callContext, CallApi callApi, AbstractC9635GVx abstractC9635GVx, TaskExecutor taskExecutor, G56 g56, Integer num, String str, boolean z) {
        C7384Etj.A0Y(gVw, 2);
        AnonymousClass005.A13(abstractC9635GVx, g56, callApi, 3);
        this.A05 = str;
        this.A0B = callContext;
        this.A02 = gVw;
        this.A0C = abstractC9635GVx;
        this.A0A = gss;
        this.A09 = context;
        this.A0D = g56;
        this.A03 = callApi;
        this.A08 = z;
        this.A04 = num;
        this.A06 = new CopyOnWriteArraySet<>();
        this.A07 = FZS.A02(taskExecutor, 42);
        int iIntValue = num.intValue();
        if (iIntValue != 2) {
            if (iIntValue != 0 && iIntValue != 1) {
                throw C3cG.A0q();
            }
            this.A03.setAppModelListener(new C9606GRn(this));
        }
    }

    @Override // X.GR9
    public final <API> API ACQ(G50<API> g50) {
        return CallApi.class.equals(g50.AHp()) ? (API) this.A03 : (API) this.A0D.A00.A01(g50);
    }
}
