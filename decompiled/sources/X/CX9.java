package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CX9 implements C1J {
    public C1O dataSpec;
    public final boolean isNetwork;
    public int listenerCount;
    public final ArrayList<CXB> listeners = C60O.A11(1);

    public final void transferInitializing(C1O c1o) {
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).AWk(this, c1o, this.isNetwork);
        }
    }

    public final void bytesTransferred(int i) {
        C1O c1o = this.dataSpec;
        for (int i2 = 0; i2 < this.listenerCount; i2++) {
            this.listeners.get(i2).AS2(this, c1o, i, this.isNetwork);
        }
    }

    @Override // X.C1J
    public /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    public final void transferEnded() {
        C1O c1o = this.dataSpec;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).AWh(this, c1o, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferStarted(C1O c1o) {
        this.dataSpec = c1o;
        for (int i = 0; i < this.listenerCount; i++) {
            this.listeners.get(i).AWm(this, c1o, this.isNetwork);
        }
    }

    public CX9(boolean z) {
        this.isNetwork = z;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        cxb.getClass();
        if (this.listeners.contains(cxb)) {
            return;
        }
        this.listeners.add(cxb);
        this.listenerCount++;
    }
}
