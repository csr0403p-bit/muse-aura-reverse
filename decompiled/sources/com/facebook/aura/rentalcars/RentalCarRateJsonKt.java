package com.facebook.aura.rentalcars;

import X.AGI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.HsJ;
import android.icu.util.Currency;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.GenericListPresentation;
import com.facebook.aura.model.GenericListRow;
import java.net.URI;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class RentalCarRateJsonKt {
    public static final String CAR_RENTAL_DATA_KEY = "car_rental_data";
    public static final RentalCarLocation EMPTY_LOCATION = new RentalCarLocation(null, null, null);
    public static final int MAX_URL_LENGTH = 2048;
    public static final String TAG = "RentalCarRateJson";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final RentalCarAccess accessFromWire(String str) {
        String strA0l;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            String strA0u = AnonymousClass001.A0u(strA0l);
            switch (strA0u.hashCode()) {
                case -1884008279:
                    if (strA0u.equals("meet_and_greet")) {
                        return RentalCarAccess.MEET_AND_GREET;
                    }
                    break;
                case -1145795789:
                    if (strA0u.equals("call_for_pickup")) {
                        return RentalCarAccess.CALL_FOR_PICKUP;
                    }
                    break;
                case -933711786:
                    if (strA0u.equals("in_terminal")) {
                        return RentalCarAccess.IN_TERMINAL;
                    }
                    break;
                case 2072762553:
                    if (strA0u.equals("shuttle")) {
                        return RentalCarAccess.SHUTTLE;
                    }
                    break;
            }
        }
        return null;
    }

    public static final boolean hasRentalCarRows(GenericListPresentation genericListPresentation) {
        C7384Etj.A0Y(genericListPresentation, 0);
        if (genericListPresentation.items.isEmpty()) {
            return false;
        }
        List<GenericListRow> list = genericListPresentation.items;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<GenericListRow> it = list.iterator();
            while (it.hasNext()) {
                JsonObject jsonObject = it.next().extraData;
                if (!((jsonObject != null ? jsonObject.get(CAR_RENTAL_DATA_KEY) : null) instanceof JsonObject)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final RentalCarRate rentalCarRate(GenericListRow genericListRow) {
        Object objA0s;
        C7384Etj.A0Y(genericListRow, 0);
        JsonObject jsonObject = genericListRow.extraData;
        RentalCarRate domain = null;
        JsonElement jsonElementA1F = jsonObject != null ? C60O.A1F(CAR_RENTAL_DATA_KEY, jsonObject) : null;
        if ((jsonElementA1F instanceof JsonObject) && jsonElementA1F != null) {
            try {
                objA0s = (RentalCarRateJson) HatchJsonKt.HatchJson.A01(RentalCarRateJson$$serializer.INSTANCE, jsonElementA1F);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            Throwable thA00 = HsJ.A00(objA0s);
            if (thA00 != null) {
                C3cG.A1G("Skipping malformed car_rental_data: ", thA00.getMessage(), TAG);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            RentalCarRateJson rentalCarRateJson = (RentalCarRateJson) objA0s;
            if (rentalCarRateJson != null && (domain = rentalCarRateJson.toDomain()) == null) {
                CFK.A06(TAG, "Skipping invalid car_rental_data");
            }
        }
        return domain;
    }

    public static final RentalCarResults rentalCarResults(GenericListPresentation genericListPresentation) {
        C7384Etj.A0Y(genericListPresentation, 0);
        List<GenericListRow> list = genericListPresentation.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<GenericListRow> it = list.iterator();
        while (it.hasNext()) {
            RentalCarRate rentalCarRate = rentalCarRate(it.next());
            if (rentalCarRate != null) {
                arrayListA0h.add(rentalCarRate);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return new RentalCarResults(genericListPresentation.title, genericListPresentation.subtitle, AGI.A07(arrayListA0h));
    }

    public static final RentalCarPaymentType paymentTypeFromWire(String str) {
        String strA0l;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null) {
            String strA0u = AnonymousClass001.A0u(strA0l);
            int iHashCode = strA0u.hashCode();
            if (iHashCode != -318370833) {
                if (iHashCode != -188629368) {
                    if (iHashCode == 757836652 && strA0u.equals("postpaid")) {
                        return RentalCarPaymentType.POSTPAID;
                    }
                } else if (strA0u.equals("guarantee")) {
                    return RentalCarPaymentType.GUARANTEE;
                }
            } else if (strA0u.equals("prepaid")) {
                return RentalCarPaymentType.PREPAID;
            }
        }
        return RentalCarPaymentType.UNKNOWN;
    }

    public static final String httpsUrlOrNull(String str) {
        Object objA0s;
        String strA0l = AnonymousClass002.A0l(str);
        if (C60O.A1X(strA0l, "https://") && strA0l.length() <= 2048) {
            try {
                objA0s = new URI(strA0l).getHost();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            CharSequence charSequence = (CharSequence) objA0s;
            if (charSequence != null && charSequence.length() != 0) {
                return strA0l;
            }
        }
        return null;
    }

    public static final boolean isIsoCurrency(String str) {
        Object objA0s;
        if (str.length() == 3) {
            try {
                objA0s = Currency.getInstance(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (!(objA0s instanceof C10571Hud)) {
                return true;
            }
        }
        return false;
    }

    public static final String nonBlank(String str) {
        return C60O.A0q(AnonymousClass002.A0l(str));
    }

    public static final LocalDate toLocalDateOrNull(String str) {
        Object objA0s;
        try {
            objA0s = LocalDate.parse(AnonymousClass002.A0l(str));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (LocalDate) objA0s;
    }

    public static final LocalTime toLocalTimeOrNull(String str) {
        Object objA0s;
        try {
            objA0s = LocalTime.parse(AnonymousClass002.A0l(str));
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (LocalTime) objA0s;
    }
}
