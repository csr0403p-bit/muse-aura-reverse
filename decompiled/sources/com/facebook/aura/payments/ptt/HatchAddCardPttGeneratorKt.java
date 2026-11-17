package com.facebook.aura.payments.ptt;

import X.C60O;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class HatchAddCardPttGeneratorKt {
    public static final long GENERATE_TIMEOUT_MS = 30000;
    public static final String KEY_EXPIRY_MONTH = "expiry_month";
    public static final String KEY_EXPIRY_YEAR = "expiry_year";
    public static final String KEY_SECURITY_CODE = "csc";
    public static final String TAG = "HatchAddCardPttGenerator";
    public static final String KEY_CREDIT_CARD = "credit_card";
    public static final Set<String> SENSITIVE_KEYS = C60O.A19(KEY_CREDIT_CARD, "csc");
}
