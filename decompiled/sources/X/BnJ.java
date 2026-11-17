package X;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BnJ {
    public static void A00(InterfaceC2861BnK interfaceC2861BnK, C2963BqE c2963BqE) {
        int i;
        Integer numAFm = interfaceC2861BnK.AFm();
        if (numAFm != C79.A00) {
            int iIntValue = numAFm.intValue();
            if (iIntValue == 2) {
                i = 0;
            } else if (iIntValue == 1) {
                i = 32;
            } else if (iIntValue != 3) {
                AbstractC2875Bni.A03("ExifData", FGI.A0M("Unknown flash state: ", "UNKNOWN"));
                return;
            } else {
                i = 1;
                c2963BqE.A04("LightSource", String.valueOf(4));
            }
            c2963BqE.A04("Flash", String.valueOf(i));
        }
    }
}
