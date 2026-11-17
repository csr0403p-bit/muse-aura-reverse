package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.CiR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3977CiR implements InterfaceC3984CiY {
    public static final C3977CiR A00 = new C3977CiR();

    @Override // X.InterfaceC3984CiY
    public final Object AYX(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        InterfaceC3985Cia interfaceC3985Cia = c3979CiT.A0A;
        if (interfaceC3985Cia instanceof C3970CiI) {
            return C3cG.A0s(C60O.A0i("Byte to String conversion attempted on String input, plugin should only run when data was decompressed or decrypted into a byte array"));
        }
        C3970CiI c3970CiI = interfaceC3985Cia instanceof C3980CiU ? new C3970CiI(BV4.A0o(((C3980CiU) interfaceC3985Cia).A00)) : null;
        Context context = c3979CiT.A06;
        InterfaceC3985Cia interfaceC3985Cia2 = c3979CiT.A09;
        PushInfraMetaData pushInfraMetaData = c3979CiT.A08;
        String str = c3979CiT.A0F;
        Integer num = c3979CiT.A00;
        boolean z = c3979CiT.A03;
        boolean z2 = c3979CiT.A02;
        String str2 = c3979CiT.A0E;
        String str3 = c3979CiT.A0D;
        String str4 = c3979CiT.A0C;
        boolean z3 = c3979CiT.A01;
        int i = c3979CiT.A05;
        int i2 = c3979CiT.A04;
        C3972CiK c3972CiK = c3979CiT.A07;
        Integer num2 = c3979CiT.A0B;
        AnonymousClass005.A12(context, pushInfraMetaData, str, 0);
        C7384Etj.A0Y(c3972CiK, 14);
        return new C3979CiT(context, c3972CiK, pushInfraMetaData, c3970CiI, interfaceC3985Cia2, num, num2, str, str2, str3, str4, i, i2, z, z2, z3);
    }

    @Override // X.InterfaceC3984CiY
    public final boolean AfW(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        InterfaceC3985Cia interfaceC3985Cia = c3979CiT.A0A;
        if ((interfaceC3985Cia instanceof C3970CiI) || !(interfaceC3985Cia instanceof C3980CiU)) {
            return false;
        }
        return c3979CiT.A02 || c3979CiT.A03;
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "byte_to_string";
    }
}
