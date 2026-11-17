package com.facebook.rsys.crypto.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class CryptoE2eeModel {
    public static G50<CryptoE2eeModel> CONVERTER = C8926Fti.A00(44);
    public static long sMcfTypeId;
    public final int mode;
    public final ArrayList<CryptoParticipantIdentity> participantIdentities;

    public static native CryptoE2eeModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CryptoE2eeModel) {
                CryptoE2eeModel cryptoE2eeModel = (CryptoE2eeModel) obj;
                if (this.mode != cryptoE2eeModel.mode || !this.participantIdentities.equals(cryptoE2eeModel.participantIdentities)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.participantIdentities, (527 + this.mode) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CryptoE2eeModel{mode=");
        sbA0x.append(this.mode);
        sbA0x.append(",participantIdentities=");
        return BV8.A0v(this.participantIdentities, sbA0x);
    }

    public CryptoE2eeModel(int i, ArrayList<CryptoParticipantIdentity> arrayList) {
        arrayList.getClass();
        this.mode = i;
        this.participantIdentities = arrayList;
    }
}
