package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.common.formatting.LocalizedFormattingKt;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class CarRentalReservationFormattingKt {
    public static final String carRentalTransmission(String str, BFM bfm, int i) {
        int i2;
        int i3;
        String strA01 = null;
        if (str != null) {
            String strA0u = AnonymousClass001.A0u(str);
            if (strA0u.equals("automatic")) {
                bfm.AgE(1004598204);
                i3 = R.string._name_removed__res_0x7f1205ac;
            } else {
                i2 = 1077934980;
                if (strA0u.equals("manual")) {
                    bfm.AgE(1004600953);
                    i3 = R.string._name_removed__res_0x7f1205ad;
                }
            }
            strA01 = AbstractC2271BQs.A01(bfm, i3);
            AnonymousClass002.A19(bfm);
            return strA01;
        }
        i2 = 1077745508;
        bfm.AgE(i2);
        AnonymousClass002.A19(bfm);
        return strA01;
    }

    public static /* synthetic */ String formatCarRentalPeriod$default(LocalDate localDate, LocalTime localTime, LocalDate localDate2, LocalTime localTime2, Locale locale, LocalDate localDate3, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 16);
        if ((i & 32) != 0) {
            localDate3 = LocalDate.now();
            C7384Etj.A0U(localDate3);
        }
        return formatCarRentalPeriod(localDate, localTime, localDate2, localTime2, localeA13, localDate3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String carRentalClass(String str, BFM bfm, int i) {
        String strA0l;
        int i2;
        bfm.AgE(1611445273);
        String strA01 = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            String strA0u = AnonymousClass001.A0u(strA0l);
            switch (strA0u.hashCode()) {
                case -2008465223:
                    if (strA0u.equals("special")) {
                        i2 = R.string._name_removed__res_0x7f120591;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -1911224770:
                    if (strA0u.equals("economy")) {
                        i2 = R.string._name_removed__res_0x7f120584;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -1656310127:
                    if (strA0u.equals("standard_elite")) {
                        i2 = R.string._name_removed__res_0x7f120593;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -1530924892:
                    if (strA0u.equals("fullsize_elite")) {
                        i2 = R.string._name_removed__res_0x7f120587;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -1091276019:
                    if (strA0u.equals("luxury")) {
                        i2 = R.string._name_removed__res_0x7f12058a;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -950453934:
                    if (strA0u.equals("economy_elite")) {
                        i2 = R.string._name_removed__res_0x7f120585;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -859717383:
                    if (strA0u.equals("intermediate")) {
                        i2 = R.string._name_removed__res_0x7f120588;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -798711637:
                    if (strA0u.equals("mini_elite")) {
                        i2 = R.string._name_removed__res_0x7f12058d;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -764973449:
                    if (strA0u.equals("compact_elite")) {
                        i2 = R.string._name_removed__res_0x7f120583;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -318452137:
                    if (strA0u.equals("premium")) {
                        i2 = R.string._name_removed__res_0x7f12058f;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case -3224917:
                    if (strA0u.equals("premium_elite")) {
                        i2 = R.string._name_removed__res_0x7f120590;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case 3351639:
                    if (strA0u.equals("mini")) {
                        i2 = R.string._name_removed__res_0x7f12058c;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case 530027221:
                    if (strA0u.equals("oversize")) {
                        i2 = R.string._name_removed__res_0x7f12058e;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case 950483747:
                    if (strA0u.equals("compact")) {
                        i2 = R.string._name_removed__res_0x7f120582;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case 1077918669:
                    if (strA0u.equals("intermediate_elite")) {
                        i2 = R.string._name_removed__res_0x7f120589;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case 1312628413:
                    if (strA0u.equals(ConfidentialVmMigrationDoneRepository.MODE_STANDARD)) {
                        i2 = R.string._name_removed__res_0x7f120592;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case 1331962640:
                    if (strA0u.equals("fullsize")) {
                        i2 = R.string._name_removed__res_0x7f120586;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
                case 2082574049:
                    if (strA0u.equals("luxury_elite")) {
                        i2 = R.string._name_removed__res_0x7f12058b;
                        strA01 = AbstractC2271BQs.A01(bfm, i2);
                        break;
                    }
                    break;
            }
        }
        AnonymousClass002.A19(bfm);
        return strA01;
    }

    public static final String carRentalSeparator(BFM bfm, int i) {
        return AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7);
    }

    public static final String formatCarRentalPeriod(HatchAgentPermissionsRepository.CarRentalReservationStop carRentalReservationStop, HatchAgentPermissionsRepository.CarRentalReservationStop carRentalReservationStop2) {
        AnonymousClass003.A0u(carRentalReservationStop, carRentalReservationStop2);
        return formatCarRentalPeriod$default(carRentalReservationStop.date, carRentalReservationStop.time, carRentalReservationStop2.date, carRentalReservationStop2.time, null, null, 48, null);
    }

    public static final String formattedTotal(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval, Locale locale) {
        boolean zA1b = AnonymousClass004.A1b(carRentalReservationApproval, locale);
        BigDecimal bigDecimal = carRentalReservationApproval.amount;
        String currencyCode = carRentalReservationApproval.currency.getCurrencyCode();
        C7384Etj.A0U(currencyCode);
        return LocalizedFormattingKt.formatCurrency(bigDecimal, currencyCode, locale, zA1b, zA1b);
    }

    public static final String formatCarRentalPeriod(LocalDate localDate, LocalTime localTime, LocalDate localDate2, LocalTime localTime2, Locale locale, LocalDate localDate3) {
        String str;
        AnonymousClass003.A0v(localDate, localDate2);
        AnonymousClass003.A0y(locale, localDate3);
        if (localTime != null && localTime2 != null) {
            if (localDate.getYear() == localDate3.getYear() && localDate2.getYear() == localDate3.getYear()) {
                str = "MMMdjmm";
            } else {
                str = "yMMMdjmm";
            }
            LocalDateTime localDateTimeAtTime = localDate.atTime(localTime);
            C7384Etj.A0U(localDateTimeAtTime);
            LocalDateTime localDateTimeAtTime2 = localDate2.atTime(localTime2);
            C7384Etj.A0U(localDateTimeAtTime2);
            return LocalizedFormattingKt.formatDateRange(localDateTimeAtTime, localDateTimeAtTime2, str, locale);
        }
        return LocalizedFormattingKt.formatDateRange(localDate, localDate2, locale, localDate3);
    }
}
