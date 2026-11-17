package com.facebook.aura.payments.cardvalidation;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.payments.cardvalidation.HatchCardFieldState;
import java.time.YearMonth;

/* loaded from: classes3.dex */
public final class HatchCardValidator {
    public static final HatchCardValidator INSTANCE = new HatchCardValidator();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.payments.cardvalidation.HatchCardFieldState expiration(java.lang.String r6, java.time.YearMonth r7) {
        /*
            r5 = this;
            r2 = 0
            boolean r5 = X.AnonymousClass002.A1a(r6, r7)
            java.lang.String r4 = com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt.digitsOnly(r6)
            int r0 = r4.length()
            r3 = 4
            if (r0 >= r3) goto L15
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Pending r1 = com.facebook.aura.payments.cardvalidation.HatchCardFieldState.Pending.INSTANCE
        L12:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState r1 = (com.facebook.aura.payments.cardvalidation.HatchCardFieldState) r1
            return r1
        L15:
            if (r0 > r3) goto L51
            r1 = 2
            java.lang.String r0 = r4.substring(r2, r1)
            java.lang.Integer r0 = X.C9tI.A0r(r0)
            if (r0 == 0) goto L51
            int r2 = r0.intValue()
            java.lang.String r0 = r4.substring(r1, r3)
            java.lang.Integer r0 = X.C9tI.A0r(r0)
            if (r0 == 0) goto L51
            int r1 = r0.intValue()
            if (r5 > r2) goto L4e
            r0 = 13
            if (r2 >= r0) goto L4e
            int r0 = r1 + 2000
            java.time.YearMonth r0 = java.time.YearMonth.of(r0, r2)
            int r0 = r0.compareTo(r7)
            if (r0 >= 0) goto L54
            com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure r0 = com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure.EXPIRATION_PAST
        L48:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Invalid r1 = new com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Invalid
            r1.<init>(r0)
            return r1
        L4e:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure r0 = com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure.EXPIRATION_MONTH_INVALID
            goto L48
        L51:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure r0 = com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure.EXPIRATION_MALFORMED
            goto L48
        L54:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Valid r1 = com.facebook.aura.payments.cardvalidation.HatchCardFieldState.Valid.INSTANCE
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.payments.cardvalidation.HatchCardValidator.expiration(java.lang.String, java.time.YearMonth):com.facebook.aura.payments.cardvalidation.HatchCardFieldState");
    }

    public final HatchCardFieldState usPostalCode(String str) {
        HatchCardFieldState hatchCardFieldState;
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() == 0) {
            hatchCardFieldState = HatchCardFieldState.Pending.INSTANCE;
        } else {
            if (!HatchCardValidatorKt.US_POSTAL_CODE.A08(strA0l)) {
                return new HatchCardFieldState.Invalid(HatchCardFieldFailure.POSTAL_CODE_INVALID);
            }
            hatchCardFieldState = HatchCardFieldState.Valid.INSTANCE;
        }
        return hatchCardFieldState;
    }

    public static /* synthetic */ HatchCardFieldState expiration$default(HatchCardValidator hatchCardValidator, String str, YearMonth yearMonth, int i, Object obj) {
        if ((i & 2) != 0) {
            yearMonth = YearMonth.now();
            C7384Etj.A0U(yearMonth);
        }
        return hatchCardValidator.expiration(str, yearMonth);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.payments.cardvalidation.HatchCardFieldState cardNumber(java.lang.String r3, java.util.List<java.lang.String> r4) {
        /*
            r2 = this;
            X.AnonymousClass003.A0u(r3, r4)
            java.lang.String r3 = com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt.digitsOnly(r3)
            int r2 = r3.length()
            if (r2 == 0) goto L3c
            com.facebook.aura.payments.cardvalidation.HatchCardNetwork$Companion r1 = com.facebook.aura.payments.cardvalidation.HatchCardNetwork.Companion
            boolean r0 = r1.accepts(r3, r4)
            if (r0 != 0) goto L1d
            com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure r0 = com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure.NUMBER_NETWORK_NOT_ACCEPTED
        L17:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Invalid r1 = new com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Invalid
            r1.<init>(r0)
            return r1
        L1d:
            com.facebook.aura.payments.cardvalidation.HatchCardNetwork r1 = r1.forDigits(r3)
            int r0 = r1.getMaxPanLength()
            if (r2 <= r0) goto L2a
            com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure r0 = com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure.NUMBER_TOO_LONG
            goto L17
        L2a:
            boolean r0 = r1.acceptsPanLength(r2)
            if (r0 == 0) goto L3c
            boolean r0 = X.C7kj.A02(r3)
            if (r0 == 0) goto L39
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Valid r1 = com.facebook.aura.payments.cardvalidation.HatchCardFieldState.Valid.INSTANCE
            goto L3e
        L39:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure r0 = com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure.NUMBER_LUHN_FAILED
            goto L17
        L3c:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState$Pending r1 = com.facebook.aura.payments.cardvalidation.HatchCardFieldState.Pending.INSTANCE
        L3e:
            com.facebook.aura.payments.cardvalidation.HatchCardFieldState r1 = (com.facebook.aura.payments.cardvalidation.HatchCardFieldState) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.payments.cardvalidation.HatchCardValidator.cardNumber(java.lang.String, java.util.List):com.facebook.aura.payments.cardvalidation.HatchCardFieldState");
    }

    public final HatchCardFieldState securityCode(String str, String str2) {
        HatchCardFieldState hatchCardFieldState;
        int securityCodeLength;
        AnonymousClass003.A0u(str, str2);
        int length = HatchCardNetworkKt.digitsOnly(str).length();
        if (length == 0 || length < (securityCodeLength = HatchCardNetwork.Companion.forDigits(HatchCardNetworkKt.digitsOnly(str2)).getSecurityCodeLength())) {
            hatchCardFieldState = HatchCardFieldState.Pending.INSTANCE;
        } else {
            if (length != securityCodeLength) {
                return new HatchCardFieldState.Invalid(HatchCardFieldFailure.SECURITY_CODE_WRONG_LENGTH);
            }
            hatchCardFieldState = HatchCardFieldState.Valid.INSTANCE;
        }
        return hatchCardFieldState;
    }
}
