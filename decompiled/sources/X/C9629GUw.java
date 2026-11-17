package X;

import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.execution.gen.Task;
import com.facebook.rsys.sdk.RsysSdkImpl;
import java.util.Iterator;

/* renamed from: X.GUw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9629GUw extends Task {
    public final /* synthetic */ CallIntent A00;
    public final /* synthetic */ RsysSdkImpl A01;

    public C9629GUw(CallIntent callIntent, RsysSdkImpl rsysSdkImpl) {
        this.A01 = rsysSdkImpl;
        this.A00 = callIntent;
    }

    @Override // com.facebook.rsys.execution.gen.Task
    public final void run() {
        Iterator it = this.A01.A0A.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onIncomingCallIntent");
        }
    }
}
