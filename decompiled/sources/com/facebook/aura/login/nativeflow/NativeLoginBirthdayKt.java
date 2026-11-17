package com.facebook.aura.login.nativeflow;

import X.AnonymousClass003;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

/* loaded from: classes2.dex */
public abstract class NativeLoginBirthdayKt {
    public static final int DAY_END = 4;
    public static final long INVALID_AGE_BLOCK_DURATION_MILLIS = 43200000;
    public static final String INVALID_AGE_CATEGORY = "InvalidBirthdayCountCategory";
    public static final int MAX_INVALID_AGE_ATTEMPTS = 2;
    public static final int MINIMUM_AGE_YEARS = 18;
    public static final int MONTH_END = 2;

    public static final LocalDate birthdayDigitsToLocalDate(String str) {
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        if (length == 8) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    try {
                        return LocalDate.of(Integer.parseInt(str.substring(4)), Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
                    } catch (DateTimeException unused) {
                    }
                } else {
                    if (!Character.isDigit(str.charAt(i))) {
                        break;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    public static final String toBirthdayDigits(LocalDate localDate) {
        C7384Etj.A0Y(localDate, 0);
        return FGI.A0U(C7BY.A0P(String.valueOf(localDate.getMonthValue()), 2), C7BY.A0P(String.valueOf(localDate.getDayOfMonth()), 2), C7BY.A0P(String.valueOf(localDate.getYear()), 4));
    }

    public static final boolean isInvalidAgeBlocked() {
        return AuraMetaFRLSecureTokenStore.INSTANCE.getCategoryCount(INVALID_AGE_CATEGORY) >= 2;
    }

    public static final void recordInvalidAgeAttempt() {
        AuraMetaFRLSecureTokenStore.INSTANCE.increaseCategoryCount(INVALID_AGE_CATEGORY, System.currentTimeMillis() + 43200000);
    }

    public static final NativeLoginBirthdayResult parseBirthday(String str, LocalDate localDate) {
        NativeLoginBirthdayError nativeLoginBirthdayError;
        AnonymousClass003.A0u(str, localDate);
        LocalDate localDateBirthdayDigitsToLocalDate = birthdayDigitsToLocalDate(str);
        if (localDateBirthdayDigitsToLocalDate == null || localDateBirthdayDigitsToLocalDate.isAfter(localDate)) {
            nativeLoginBirthdayError = NativeLoginBirthdayError.INVALID_DATE;
        } else {
            if (Period.between(localDateBirthdayDigitsToLocalDate, localDate).getYears() >= 18) {
                return new NativeLoginBirthdayResult(localDateBirthdayDigitsToLocalDate.toString(), null);
            }
            nativeLoginBirthdayError = NativeLoginBirthdayError.UNDERAGE;
        }
        return new NativeLoginBirthdayResult(null, nativeLoginBirthdayError);
    }
}
