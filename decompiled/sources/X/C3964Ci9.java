package X;

import org.json.JSONObject;

/* renamed from: X.Ci9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3964Ci9 implements InterfaceC3965CiA {
    public final F18<InterfaceC3965CiA> A00;

    @Override // X.InterfaceC3965CiA
    public final void onPushReceived(String str, JSONObject jSONObject) {
        C7384Etj.A0Y(str, 0);
        this.A00.AMN().onPushReceived(str, jSONObject);
    }

    public C3964Ci9(F18<InterfaceC3965CiA> f18) {
        this.A00 = f18;
    }
}
