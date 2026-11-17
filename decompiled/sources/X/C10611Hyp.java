package X;

import com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Hyp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10611Hyp implements Hvy {
    public final /* synthetic */ ArrayList<String> A00;
    public final /* synthetic */ Hm1<Map<String, ? extends Object>> A01;

    @Override // X.Hvy
    public final void onResponseWithError(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map, Hzd hzd) {
        AnonymousClass005.A11(interfaceC10512HoG, map, hzd, 0);
        Map mapA02 = IapBloksBridge.A02(hzd, interfaceC10512HoG, map, AbstractC0878AGe.A0g(this.A00));
        Hm1<Map<String, ? extends Object>> hm1 = this.A01;
        if (hm1.isActive()) {
            hm1.resumeWith(mapA02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10611Hyp(ArrayList<String> arrayList, Hm1<? super Map<String, ? extends Object>> hm1) {
        this.A00 = arrayList;
        this.A01 = hm1;
    }

    @Override // X.Hvy
    public final void onResponse(InterfaceC10512HoG interfaceC10512HoG, EnumC9704GeI enumC9704GeI, Map<String, C10606Hye> map) {
        AnonymousClass003.A0v(interfaceC10512HoG, map);
        Map mapA02 = IapBloksBridge.A02(null, interfaceC10512HoG, map, AbstractC0878AGe.A0g(this.A00));
        Hm1<Map<String, ? extends Object>> hm1 = this.A01;
        if (hm1.isActive()) {
            hm1.resumeWith(mapA02);
        }
    }
}
