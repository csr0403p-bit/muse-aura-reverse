package X;

import android.database.Cursor;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import libraries.accessv2.src.model.FXAccessException;

/* loaded from: classes5.dex */
public final class EO1 implements EO7 {
    public final EP0 A00;

    @Override // X.EO7
    public final ENw AhJ(Cursor cursor, EP1 ep1) throws FXAccessException {
        C7384Etj.A0Y(cursor, 0);
        String strA00 = EO2.A00(cursor, ErrorReportingConstants.USER_ID_KEY);
        String strA002 = EO2.A00(cursor, NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM);
        if (ep1 != null) {
            return new ENw(null, strA00, strA002, this.A00, ep1, null, null);
        }
        throw new FXAccessException("credentialSource is required for FRL transformers", ENz.A09);
    }

    public EO1(EP0 ep0) {
        this.A00 = ep0;
    }
}
