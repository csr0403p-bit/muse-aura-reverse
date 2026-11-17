package X;

import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import java.util.LinkedHashMap;

/* renamed from: X.CvV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4409CvV {
    public static final LinkedHashMap<ErrorCode, Cw0> A00;

    static {
        HxE[] hxEArr = {C3cG.A0r(ErrorCode.UNKNOWN_ERR, new C4436Cvx()), C3cG.A0r(ErrorCode.ABORT_ERR, new C4411CvX()), C3cG.A0r(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new C4427Cvn()), C3cG.A0r(ErrorCode.CONSTRAINT_ERR, new C4412CvY()), C3cG.A0r(ErrorCode.DATA_ERR, new C4414Cva()), C3cG.A0r(ErrorCode.INVALID_STATE_ERR, new C4421Cvh()), C3cG.A0r(ErrorCode.ENCODING_ERR, new C4415Cvb()), C3cG.A0r(ErrorCode.NETWORK_ERR, new C4423Cvj()), C3cG.A0r(ErrorCode.NOT_ALLOWED_ERR, new C4425Cvl()), C3cG.A0r(ErrorCode.NOT_SUPPORTED_ERR, new C4428Cvo()), C3cG.A0r(ErrorCode.SECURITY_ERR, new C4432Cvt()), C3cG.A0r(ErrorCode.TIMEOUT_ERR, new C4434Cvv())};
        LinkedHashMap<ErrorCode, Cw0> linkedHashMap = new LinkedHashMap<>(AIW.A0H(12));
        AGH.A0G(linkedHashMap, hxEArr);
        A00 = linkedHashMap;
    }
}
