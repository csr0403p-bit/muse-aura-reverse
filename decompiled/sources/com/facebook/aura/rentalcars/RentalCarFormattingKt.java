package com.facebook.aura.rentalcars;

import X.AbstractC06907md;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BBI;
import X.BFI;
import X.BFM;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.CarRentalReservationFormattingKt;
import com.facebook.aura.common.formatting.LocalizedFormattingKt;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class RentalCarFormattingKt {
    public static final String rentalCarAccess(RentalCarAccess rentalCarAccess, BFM bfm, int i) {
        int i2;
        int iA0E = AnonymousClass001.A0E(rentalCarAccess, 0);
        if (iA0E == 0) {
            i2 = R.string._name_removed__res_0x7f120575;
        } else if (iA0E == 1) {
            i2 = R.string._name_removed__res_0x7f120577;
        } else if (iA0E == 2) {
            i2 = R.string._name_removed__res_0x7f120576;
        } else {
            if (iA0E != 3) {
                throw C3cG.A0q();
            }
            i2 = R.string._name_removed__res_0x7f120574;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }

    public static final String rentalCarBags(RentalCarVehicle rentalCarVehicle, BFM bfm, int i) {
        String strA0Y;
        BBI bbiA07;
        String strA0Y2;
        C7384Etj.A0Y(rentalCarVehicle, 0);
        Integer num = rentalCarVehicle.largeBags;
        String strA01 = null;
        if (num == null) {
            bbiA07 = AnonymousClass002.A0M(bfm, 1558511205);
            strA0Y = null;
        } else {
            bfm.AgE(1558511206);
            strA0Y = AnonymousClass007.A0Y(num.intValue(), bfm, R.plurals._name_removed__res_0x7f100013);
            bbiA07 = C3cG.A07(bfm);
        }
        Integer num2 = rentalCarVehicle.smallBags;
        if (num2 == null) {
            bfm.AgE(1558619333);
            BBI.A0R(bbiA07, false);
            strA0Y2 = null;
        } else {
            bfm.AgE(1558619334);
            strA0Y2 = AnonymousClass007.A0Y(num2.intValue(), bfm, R.plurals._name_removed__res_0x7f100018);
            BBI.A0R(bbiA07, false);
        }
        List listA0v = C60Q.A0v(strA0Y, strA0Y2);
        if (listA0v.isEmpty()) {
            bfm.AgE(1558746619);
        } else {
            bfm.AgE(1158660806);
            strA01 = AbstractC06907md.A01(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), listA0v, null);
        }
        BBI.A0R(bbiA07, false);
        return strA01;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String rentalCarFuel(java.lang.String r3, X.BFM r4, int r5) {
        /*
            r2 = 0
            if (r3 == 0) goto L67
            java.lang.String r1 = X.AnonymousClass001.A0u(r3)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1587433046: goto L51;
                case -1331959846: goto L3f;
                case -1202757124: goto L2d;
                case -991657904: goto L2a;
                case -17124067: goto L18;
                default: goto Le;
            }
        Le:
            r0 = -1034744945(0xffffffffc2530b8f, float:-52.761288)
        L11:
            r4.AgE(r0)
        L14:
            X.AnonymousClass002.A19(r4)
            return r2
        L18:
            java.lang.String r0 = "electric"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = -864667544(0xffffffffcc763868, float:-6.4545184E7)
            r4.AgE(r0)
            r0 = 2131887513(0x7f120599, float:1.9409635E38)
            goto L62
        L2a:
            java.lang.String r0 = "petrol"
            goto L53
        L2d:
            java.lang.String r0 = "hybrid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = -864665082(0xffffffffcc764206, float:-6.4555032E7)
            r4.AgE(r0)
            r0 = 2131887514(0x7f12059a, float:1.9409637E38)
            goto L62
        L3f:
            java.lang.String r0 = "diesel"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = -864670010(0xffffffffcc762ec6, float:-6.453532E7)
            r4.AgE(r0)
            r0 = 2131887512(0x7f120598, float:1.9409633E38)
            goto L62
        L51:
            java.lang.String r0 = "gasoline"
        L53:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            r0 = -864672410(0xffffffffcc762566, float:-6.452572E7)
            r4.AgE(r0)
            r0 = 2131887515(0x7f12059b, float:1.940964E38)
        L62:
            java.lang.String r2 = X.AbstractC2271BQs.A01(r4, r0)
            goto L14
        L67:
            r0 = -1035083217(0xffffffffc24de22f, float:-51.470882)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.rentalcars.RentalCarFormattingKt.rentalCarFuel(java.lang.String, X.BFM, int):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r2.equals(r1) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r2.equals("miles") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        r7.AgE(1982282043);
        r1 = com.facebook.aura.R.plurals._name_removed__res_0x7f100015;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String rentalCarMileage(com.facebook.aura.rentalcars.RentalCarMileage r6, X.BFM r7, int r8) throws android.content.res.Resources.NotFoundException {
        /*
            r0 = 0
            if (r6 != 0) goto Ld
            r1 = 1320773142(0x4eb96616, float:1.55523763E9)
            r7.AgE(r1)
        L9:
            X.AnonymousClass002.A19(r7)
            return r0
        Ld:
            com.facebook.aura.rentalcars.RentalCarMileage$Unlimited r1 = com.facebook.aura.rentalcars.RentalCarMileage.Unlimited.INSTANCE
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L23
            r0 = 1982269605(0x762708a5, float:8.469618E32)
            r7.AgE(r0)
            r0 = 2131887535(0x7f1205af, float:1.940968E38)
            java.lang.String r0 = X.AbstractC2271BQs.A01(r7, r0)
            goto L9
        L23:
            boolean r1 = r6 instanceof com.facebook.aura.rentalcars.RentalCarMileage.Limited
            if (r1 == 0) goto Lab
            r1 = 1320932235(0x4ebbd38b, float:1.57560154E9)
            r7.AgE(r1)
            com.facebook.aura.rentalcars.RentalCarMileage$Limited r6 = (com.facebook.aura.rentalcars.RentalCarMileage.Limited) r6
            long r4 = r6.limit
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L3b:
            int r3 = (int) r4
            java.util.Locale r1 = java.util.Locale.getDefault()
            android.icu.text.NumberFormat r4 = android.icu.text.NumberFormat.getIntegerInstance(r1)
            long r1 = r6.limit
            java.lang.String r4 = r4.format(r1)
            java.lang.String r1 = r6.unit
            if (r1 == 0) goto L59
            java.lang.String r2 = X.AnonymousClass001.A0u(r1)
            int r1 = r2.hashCode()
            switch(r1) {
                case -1464834872: goto L8a;
                case -1464834482: goto L87;
                case 3426: goto L84;
                case 3484: goto L69;
                case 3351573: goto L66;
                case 103898878: goto L72;
                case 1834759339: goto L63;
                case 1834771429: goto L60;
                default: goto L59;
            }
        L59:
            r1 = 1321510198(0x4ec4a536, float:1.6495808E9)
            X.AnonymousClass003.A0l(r7, r1)
            goto L9
        L60:
            java.lang.String r1 = "kilometres"
            goto L8c
        L63:
            java.lang.String r1 = "kilometers"
            goto L8c
        L66:
            java.lang.String r1 = "mile"
            goto L6b
        L69:
            java.lang.String r1 = "mi"
        L6b:
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L7a
            goto L59
        L72:
            java.lang.String r1 = "miles"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L59
        L7a:
            r0 = 1982282043(0x7627393b, float:8.479242E32)
            r7.AgE(r0)
            r1 = 2131755029(0x7f100015, float:1.9140926E38)
            goto L9b
        L84:
            java.lang.String r1 = "km"
            goto L8c
        L87:
            java.lang.String r1 = "kilometre"
            goto L8c
        L8a:
            java.lang.String r1 = "kilometer"
        L8c:
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L59
            r0 = 1982288795(0x7627539b, float:8.484466E32)
            r7.AgE(r0)
            r1 = 2131755028(0x7f100014, float:1.9140924E38)
        L9b:
            X.C7384Etj.A0X(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r0 = X.AbstractC2271BQs.A00(r1, r0, r7, r3)
            X.AnonymousClass001.A1D(r7)
            goto L9
        Lab:
            r0 = 1982268041(0x76270289, float:8.468408E32)
            kotlin.NoWhenBranchMatchedException r0 = X.AnonymousClass005.A0k(r7, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.rentalcars.RentalCarFormattingKt.rentalCarMileage(com.facebook.aura.rentalcars.RentalCarMileage, X.BFM, int):java.lang.String");
    }

    public static final String rentalCarPriceLine(RentalCarRate rentalCarRate, BFM bfm, int i) {
        C7384Etj.A0Y(rentalCarRate, 0);
        String strA0t = AnonymousClass001.A0t(bfm, formatted(rentalCarRate.total, C60Q.A0w(), true), R.string._name_removed__res_0x7f1205aa);
        if (rentalCarRate.paymentType == RentalCarPaymentType.POSTPAID) {
            bfm.AgE(-692277070);
            strA0t = C3cH.A0e(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), C60O.A16(strA0t, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12059f)));
        } else {
            bfm.AgE(-692147645);
        }
        AnonymousClass001.A1D(bfm);
        return strA0t;
    }

    public static final String rentalCarSpecsLine(RentalCarRate rentalCarRate, BFM bfm, int i) {
        C7384Etj.A0Y(rentalCarRate, 0);
        List listA0v = C60Q.A0v(CarRentalReservationFormattingKt.carRentalTransmission(rentalCarRate.car.transmission, bfm, 0), rentalCarMileage(rentalCarRate.mileage, bfm, 0));
        String strA01 = null;
        if (listA0v.isEmpty()) {
            bfm.AgE(-1925707936);
        } else {
            bfm.AgE(-200666943);
            strA01 = AbstractC06907md.A01(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), listA0v, null);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final String rentalCarSummaryLine(RentalCarRate rentalCarRate, BFM bfm, int i) {
        String strA0e;
        C7384Etj.A0Y(rentalCarRate, 0);
        String strCarRentalClass = CarRentalReservationFormattingKt.carRentalClass(rentalCarRate.car.category, bfm, 0);
        String strCarRentalTransmission = CarRentalReservationFormattingKt.carRentalTransmission(rentalCarRate.car.transmission, bfm, 0);
        if (rentalCarRate.paymentType == RentalCarPaymentType.POSTPAID) {
            bfm.AgE(1970471592);
            strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f12059f);
        } else {
            AnonymousClass003.A0l(bfm, 955143952);
            strA0e = null;
        }
        return C3cH.A0e(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), BFI.A0F(new String[]{strCarRentalClass, strCarRentalTransmission, strA0e}));
    }

    public static final String rentalCarSupplierLine(RentalCarRate rentalCarRate, BFM bfm, int i) {
        C7384Etj.A0Y(rentalCarRate, 0);
        return C3cH.A0e(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), C60Q.A0v(rentalCarRate.supplier.name, CarRentalReservationFormattingKt.carRentalClass(rentalCarRate.car.category, bfm, 0)));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RentalCarAccess.values().length];
            try {
                AnonymousClass002.A13(RentalCarAccess.IN_TERMINAL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RentalCarAccess.SHUTTLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(RentalCarAccess.MEET_AND_GREET, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(RentalCarAccess.CALL_FOR_PICKUP, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ String formatRentalDateRange$default(LocalDate localDate, LocalDate localDate2, Locale locale, LocalDate localDate3, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 4);
        if ((i & 8) != 0) {
            localDate3 = LocalDate.now();
            C7384Etj.A0U(localDate3);
        }
        return formatRentalDateRange(localDate, localDate2, localeA13, localDate3);
    }

    public static /* synthetic */ String formatRentalPeriod$default(RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2, Locale locale, LocalDate localDate, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 4);
        if ((i & 8) != 0) {
            localDate = LocalDate.now();
            C7384Etj.A0U(localDate);
        }
        return formatRentalPeriod(rentalCarStop, rentalCarStop2, localeA13, localDate);
    }

    public static /* synthetic */ String formatted$default(RentalCarMoney rentalCarMoney, Locale locale, boolean z, int i, Object obj) {
        Locale localeA13 = C3cI.A13(locale, i & 1);
        if ((i & 2) != 0) {
            z = true;
        }
        return formatted(rentalCarMoney, localeA13, z);
    }

    public static final long utcMillis(LocalDate localDate) {
        return C60Q.A06(localDate.atStartOfDay(ZoneOffset.UTC));
    }

    public static final String formatRentalDate(LocalDate localDate, Locale locale) {
        AnonymousClass003.A0u(localDate, locale);
        String str = utcFormat("EEE MMM d y", locale).format(new Date(utcMillis(localDate)));
        C7384Etj.A0U(str);
        return str;
    }

    public static final String formatRentalDateRange(LocalDate localDate, LocalDate localDate2, Locale locale, LocalDate localDate3) {
        AnonymousClass005.A14(localDate, localDate2, locale, localDate3);
        return LocalizedFormattingKt.formatDateRange(localDate, localDate2, locale, localDate3);
    }

    public static final String formatRentalPeriod(RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2, Locale locale, LocalDate localDate) {
        AnonymousClass005.A14(rentalCarStop, rentalCarStop2, locale, localDate);
        return CarRentalReservationFormattingKt.formatCarRentalPeriod(rentalCarStop.date, rentalCarStop.time, rentalCarStop2.date, rentalCarStop2.time, locale, localDate);
    }

    public static final String formatRentalTime(LocalTime localTime, Locale locale) {
        boolean zA1Y = C60P.A1Y(localTime, locale);
        DateFormat dateFormatUtcFormat = utcFormat("jmm", locale);
        LocalDateTime localDateTimeAtTime = LocalDate.of(1970, zA1Y ? 1 : 0, zA1Y ? 1 : 0).atTime(localTime);
        C7384Etj.A0U(localDateTimeAtTime);
        String str = dateFormatUtcFormat.format(new Date(utcMillis(localDateTimeAtTime)));
        C7384Etj.A0U(str);
        return str;
    }

    public static final String formatted(RentalCarMoney rentalCarMoney, Locale locale, boolean z) {
        return LocalizedFormattingKt.formatCurrency(rentalCarMoney.amount, rentalCarMoney.currency, locale, z, AnonymousClass004.A1b(rentalCarMoney, locale));
    }

    public static final DateFormat utcFormat(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
        return instanceForSkeleton;
    }

    public static final long utcMillis(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }
}
