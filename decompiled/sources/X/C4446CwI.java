package X;

import android.content.Context;
import com.google.wear.Sdk;
import com.google.wear.services.remoteinteractions.RemoteInteractionsManager;

/* renamed from: X.CwI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4446CwI implements InterfaceC4452CwU {
    public final C4447CwJ A00;
    public final RemoteInteractionsManager A01;

    public C4446CwI(Context context) {
        C4447CwJ c4447CwJ = new C4447CwJ(context);
        this.A00 = c4447CwJ;
        this.A01 = c4447CwJ.A00() >= 4 ? (RemoteInteractionsManager) Sdk.getWearManager(context, RemoteInteractionsManager.class) : null;
    }
}
