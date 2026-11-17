package X;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: X.CtQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4328CtQ {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature A06;
    public static final Feature A07;
    public static final Feature[] A08;

    static {
        Feature featureA03 = AbstractSafeParcelable.A03("auth_api_credentials_begin_sign_in", 9L);
        A00 = featureA03;
        Feature featureA032 = AbstractSafeParcelable.A03("auth_api_credentials_sign_out", 2L);
        A01 = featureA032;
        Feature featureA033 = AbstractSafeParcelable.A03("auth_api_credentials_authorize", 1L);
        A02 = featureA033;
        Feature featureA034 = AbstractSafeParcelable.A03("auth_api_credentials_revoke_access", 1L);
        A03 = featureA034;
        Feature featureA035 = AbstractSafeParcelable.A03("auth_api_credentials_save_password", 4L);
        A04 = featureA035;
        Feature featureA036 = AbstractSafeParcelable.A03("auth_api_credentials_get_sign_in_intent", 6L);
        A05 = featureA036;
        Feature featureA037 = AbstractSafeParcelable.A03("auth_api_credentials_save_account_linking_token", 3L);
        A06 = featureA037;
        Feature featureA038 = AbstractSafeParcelable.A03("auth_api_credentials_get_phone_number_hint_intent", 3L);
        A07 = featureA038;
        A08 = new Feature[]{featureA03, featureA032, featureA033, featureA034, featureA035, featureA036, featureA037, featureA038};
    }
}
