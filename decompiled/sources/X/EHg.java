package X;

import com.facebook.aura.common.identifiers.fdid.AuraFdidStorage;

/* loaded from: classes5.dex */
public final class EHg {
    public final AuraFdidStorage A00;

    public EHg(AuraFdidStorage auraFdidStorage) {
        C7384Etj.A0Y(auraFdidStorage, 0);
        this.A00 = auraFdidStorage;
    }

    public final synchronized C6572EHo A00() {
        C6572EHo c6572EHo;
        AuraFdidStorage auraFdidStorage = this.A00;
        String phoneId = auraFdidStorage.getPhoneId();
        c6572EHo = null;
        if (phoneId != null && phoneId.length() != 0) {
            c6572EHo = new C6572EHo(phoneId, auraFdidStorage.getPhoneIdTimestamp(), auraFdidStorage.getPhoneIdOrigin());
        }
        return c6572EHo;
    }

    public final synchronized void A01(C6572EHo c6572EHo) {
        if (c6572EHo == C6572EHo.A03) {
            this.A00.setPhoneId(BV5.A0j(), System.currentTimeMillis(), null);
        } else {
            AuraFdidStorage auraFdidStorage = this.A00;
            String str = c6572EHo.A01;
            C7384Etj.A0T(str);
            auraFdidStorage.setPhoneId(str, c6572EHo.A00, c6572EHo.A02);
        }
    }
}
