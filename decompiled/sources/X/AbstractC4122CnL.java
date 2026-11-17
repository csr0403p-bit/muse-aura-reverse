package X;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: X.CnL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4122CnL {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature[] A06;

    static {
        Feature featureA03 = AbstractSafeParcelable.A03("sms_code_autofill", 2L);
        A00 = featureA03;
        Feature featureA032 = AbstractSafeParcelable.A03("sms_code_browser", 2L);
        A01 = featureA032;
        Feature featureA033 = AbstractSafeParcelable.A03("sms_retrieve", 1L);
        A02 = featureA033;
        Feature featureA034 = AbstractSafeParcelable.A03("user_consent", 3L);
        A03 = featureA034;
        Feature featureA035 = AbstractSafeParcelable.A03("missed_call_retriever", 2L);
        A04 = featureA035;
        Feature featureA036 = AbstractSafeParcelable.A03("missed_call_retriever_user_consent", 1L);
        A05 = featureA036;
        A06 = new Feature[]{featureA03, featureA032, featureA033, featureA034, featureA035, featureA036};
    }
}
