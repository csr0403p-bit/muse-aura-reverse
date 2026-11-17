package com.facebook.aura.network.hatchauth;

import X.AnonymousClass003;
import X.C06H;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.NetworkException;

/* loaded from: classes2.dex */
public final class HatchAuthException extends NetworkException {
    public final HatchAuthError error;
    public final HatchProblemJson problem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthException(HatchAuthError hatchAuthError, String str, int i, HatchProblemJson hatchProblemJson, Throwable th) {
        super(str, i, null, th, null, null, null);
        AnonymousClass003.A0u(hatchAuthError, str);
        this.error = hatchAuthError;
        this.problem = hatchProblemJson;
    }

    public final HatchAuthError getError() {
        return this.error;
    }

    public final HatchProblemJson getProblem() {
        return this.problem;
    }

    public /* synthetic */ HatchAuthException(HatchAuthError hatchAuthError, String str, int i, HatchProblemJson hatchProblemJson, Throwable th, int i2, C06H c06h) {
        this(hatchAuthError, str, i, (i2 & 8) != 0 ? null : hatchProblemJson, (i2 & 16) != 0 ? null : th);
    }
}
