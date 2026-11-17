package com.facebook.aura.json;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchEnvelope<T> extends C06G {
    public static final C9iZ $cachedDescriptor;
    public static final Companion Companion = new Companion();
    public final String code;
    public final HatchEnvelopeError error;
    public final boolean ok;
    public final T result;

    static {
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.json.HatchEnvelope", null, 4);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08("result", true);
        c9iKA1C.A08("error", true);
        c9iKA1C.A08(AuraDeeplinkRouteMapper.CODE_PARAM, true);
        $cachedDescriptor = c9iKA1C;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_json_json(com.facebook.aura.json.HatchEnvelope r4, X.C9j5 r5, X.C9iZ r6, X.C9hr r7) {
        /*
            r2 = 0
            boolean r3 = r5.AfR()
            r1 = 1
            if (r3 != 0) goto Lc
            boolean r0 = r4.ok
            if (r0 == r1) goto L35
        Lc:
            boolean r0 = r4.ok
            r5.AA7(r6, r2, r0)
            if (r3 == 0) goto L35
        L13:
            T r0 = r4.result
            r5.AAP(r0, r7, r6, r1)
        L18:
            r2 = 2
            if (r3 != 0) goto L1f
            com.facebook.aura.json.HatchEnvelopeError r0 = r4.error
            if (r0 == 0) goto L26
        L1f:
            com.facebook.aura.json.HatchEnvelopeError$$serializer r1 = com.facebook.aura.json.HatchEnvelopeError$$serializer.INSTANCE
            com.facebook.aura.json.HatchEnvelopeError r0 = r4.error
            r5.AAP(r0, r1, r6, r2)
        L26:
            r2 = 3
            if (r3 != 0) goto L2d
            java.lang.String r0 = r4.code
            if (r0 == 0) goto L34
        L2d:
            X.9iq r1 = X.C07779iq.A01
            java.lang.String r0 = r4.code
            r5.AAP(r0, r1, r6, r2)
        L34:
            return
        L35:
            T r0 = r4.result
            if (r0 == 0) goto L18
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.json.HatchEnvelope.write$Self$fbandroid_express_aura_java_com_facebook_aura_json_json(com.facebook.aura.json.HatchEnvelope, X.9j5, X.9iZ, X.9hr):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchEnvelope) {
                HatchEnvelope hatchEnvelope = (HatchEnvelope) obj;
                if (this.ok != hatchEnvelope.ok || !C7384Etj.areEqual(this.result, hatchEnvelope.result) || !C7384Etj.areEqual(this.error, hatchEnvelope.error) || !C7384Etj.areEqual(this.code, hatchEnvelope.code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchEnvelope copy$default(HatchEnvelope hatchEnvelope, boolean z, Object obj, HatchEnvelopeError hatchEnvelopeError, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = hatchEnvelope.ok;
        }
        if ((i & 2) != 0) {
            obj = hatchEnvelope.result;
        }
        if ((i & 4) != 0) {
            hatchEnvelopeError = hatchEnvelope.error;
        }
        if ((i & 8) != 0) {
            str = hatchEnvelope.code;
        }
        return new HatchEnvelope(z, obj, hatchEnvelopeError, str);
    }

    public final boolean component1() {
        return this.ok;
    }

    public final T component2() {
        return this.result;
    }

    public final HatchEnvelopeError component3() {
        return this.error;
    }

    public final String component4() {
        return this.code;
    }

    public final HatchEnvelope<T> copy(boolean z, T t, HatchEnvelopeError hatchEnvelopeError, String str) {
        return new HatchEnvelope<>(z, t, hatchEnvelopeError, str);
    }

    public final String getCode() {
        return this.code;
    }

    public final HatchEnvelopeError getError() {
        return this.error;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        return ((((C0KA.A02(this.ok) + AnonymousClass006.A0D(this.result)) * 31) + AnonymousClass006.A0D(this.error)) * 31) + AnonymousClass005.A0H(this.code);
    }

    public final class Companion {
        public final <T> C9hr<HatchEnvelope<T>> serializer(C9hr<T> c9hr) {
            C7384Etj.A0Y(c9hr, 0);
            return new HatchEnvelope$$serializer(c9hr);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchEnvelope(boolean z, T t, HatchEnvelopeError hatchEnvelopeError, String str) {
        this.ok = z;
        this.result = t;
        this.error = hatchEnvelopeError;
        this.code = str;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HatchEnvelope(int i, boolean z, Object obj, HatchEnvelopeError hatchEnvelopeError, String str, C2hx c2hx) {
        this.ok = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.result = null;
        } else {
            this.result = obj;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = hatchEnvelopeError;
        }
        if ((i & 8) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
    }

    public /* synthetic */ HatchEnvelope(boolean z, Object obj, HatchEnvelopeError hatchEnvelopeError, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : hatchEnvelopeError, (i & 8) != 0 ? null : str);
    }

    public HatchEnvelope() {
        this(true, null, null, null);
    }
}
