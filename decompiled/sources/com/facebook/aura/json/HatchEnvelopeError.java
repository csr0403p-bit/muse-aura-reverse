package com.facebook.aura.json;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchEnvelopeError extends C06G {
    public static final Companion Companion = new Companion();
    public final String code;
    public final String message;
    public final Boolean retryable;

    public final class Companion {
        public final C9hr<HatchEnvelopeError> serializer() {
            return HatchEnvelopeError$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_json_json(HatchEnvelopeError hatchEnvelopeError, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchEnvelopeError.code != null) {
            c9j5.AAP(hatchEnvelopeError.code, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchEnvelopeError.message != null) {
            c9j5.AAP(hatchEnvelopeError.message, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchEnvelopeError.retryable != null) {
            c9j5.AAP(hatchEnvelopeError.retryable, C07839ix.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchEnvelopeError) {
                HatchEnvelopeError hatchEnvelopeError = (HatchEnvelopeError) obj;
                if (!C7384Etj.areEqual(this.code, hatchEnvelopeError.code) || !C7384Etj.areEqual(this.message, hatchEnvelopeError.message) || !C7384Etj.areEqual(this.retryable, hatchEnvelopeError.retryable)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchEnvelopeError copy$default(HatchEnvelopeError hatchEnvelopeError, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchEnvelopeError.code;
        }
        if ((i & 2) != 0) {
            str2 = hatchEnvelopeError.message;
        }
        if ((i & 4) != 0) {
            bool = hatchEnvelopeError.retryable;
        }
        return new HatchEnvelopeError(str, str2, bool);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Boolean component3() {
        return this.retryable;
    }

    public final HatchEnvelopeError copy(String str, String str2, Boolean bool) {
        return new HatchEnvelopeError(str, str2, bool);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getRetryable() {
        return this.retryable;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.code) * 31) + AnonymousClass006.A0G(this.message)) * 31) + C3cH.A02(this.retryable);
    }

    public HatchEnvelopeError(String str, String str2, Boolean bool) {
        this.code = str;
        this.message = str2;
        this.retryable = bool;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchEnvelopeError(int i, String str, String str2, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i & 4) == 0) {
            this.retryable = null;
        } else {
            this.retryable = bool;
        }
    }

    public /* synthetic */ HatchEnvelopeError(String str, String str2, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }

    public HatchEnvelopeError() {
        this(null, null, null);
    }
}
