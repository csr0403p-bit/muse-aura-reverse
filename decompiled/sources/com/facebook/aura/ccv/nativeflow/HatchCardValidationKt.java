package com.facebook.aura.ccv.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06827l3;
import X.C0881AGi;
import X.C10571Hud;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.G0U;
import X.HxE;
import com.facebook.aura.payments.cardvalidation.HatchCardFieldFailure;
import com.facebook.aura.payments.cardvalidation.HatchCardFieldState;
import com.facebook.aura.payments.cardvalidation.HatchCardNetwork;
import com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt;
import com.facebook.aura.payments.cardvalidation.HatchCardValidator;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class HatchCardValidationKt {

    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCardValidationKt$validateExpiry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchCardFieldFailure, HatchCardFieldError> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCardValidationKt$validateExpiry$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchCardFieldFailure.values().length];
                try {
                    AnonymousClass002.A13(HatchCardFieldFailure.EXPIRATION_MONTH_INVALID, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchCardFieldFailure.EXPIRATION_PAST, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // X.G0U
        public final HatchCardFieldError invoke(HatchCardFieldFailure hatchCardFieldFailure) {
            int iA0L = AnonymousClass003.A0L(hatchCardFieldFailure);
            return iA0L != 4 ? iA0L != 5 ? HatchCardFieldError.EXPIRY_MALFORMED : HatchCardFieldError.EXPIRY_PAST : HatchCardFieldError.EXPIRY_MONTH_INVALID;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCardValidationKt$validatePan$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchCardFieldFailure, HatchCardFieldError> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final HatchCardFieldError invoke2(HatchCardFieldFailure hatchCardFieldFailure) {
            return HatchCardFieldError.PAN_INVALID;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ HatchCardFieldError invoke(HatchCardFieldFailure hatchCardFieldFailure) {
            return HatchCardFieldError.PAN_INVALID;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.HatchCardValidationKt$validateSecurityCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C110171 extends AbstractC7559F3s implements G0U<HatchCardFieldFailure, HatchCardFieldError> {
        public static final C110171 INSTANCE = new C110171();

        public C110171() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final HatchCardFieldError invoke2(HatchCardFieldFailure hatchCardFieldFailure) {
            return HatchCardFieldError.CSC_WRONG_LENGTH;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ HatchCardFieldError invoke(HatchCardFieldFailure hatchCardFieldFailure) {
            return HatchCardFieldError.CSC_WRONG_LENGTH;
        }
    }

    public static final HatchPostalValidationRule failedPostalRule(String str, List<HatchPostalValidationRule> list) {
        HatchPostalValidationRule next;
        Integer numA0r;
        Integer numA0r2;
        Integer numA0r3;
        Object objA0s;
        boolean zA1a = AnonymousClass002.A1a(str, list);
        String strA0l = AnonymousClass002.A0l(str);
        Iterator<HatchPostalValidationRule> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            int iOrdinal = next.type.ordinal();
            if (iOrdinal == 0) {
                String str2 = next.value;
                if (str2 != null) {
                    try {
                        objA0s = Boolean.valueOf(C06827l3.A02(str2).A08(strA0l));
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    Boolean bool = (Boolean) (objA0s instanceof C10571Hud ? null : objA0s);
                    if (bool != null && !bool.booleanValue()) {
                        break;
                    }
                } else {
                    continue;
                }
            } else if (iOrdinal == zA1a) {
                String str3 = next.value;
                if (str3 != null && (numA0r3 = C9tI.A0r(str3)) != null) {
                    if (strA0l.length() != numA0r3.intValue()) {
                        break;
                    }
                }
            } else if (iOrdinal == 2) {
                String str4 = next.value;
                if (str4 != null && (numA0r2 = C9tI.A0r(str4)) != null) {
                    if (strA0l.length() < numA0r2.intValue()) {
                        break;
                    }
                }
            } else {
                if (iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                String str5 = next.value;
                if (str5 != null && (numA0r = C9tI.A0r(str5)) != null) {
                    if (strA0l.length() > numA0r.intValue()) {
                        break;
                    }
                }
            }
        }
        return next;
    }

    public static final boolean isCardFormComplete(String str, String str2, String str3, String str4, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, List<String> list) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(str2, str3, str4, 1);
        C7384Etj.A0Y(list, 5);
        return validatePan(str, list) == null && validateExpiry(str2) == null && validateSecurityCode(str3, str) == null && isPostalComplete(str4, hatchCcvPostalFieldConfig);
    }

    public static final boolean isPostalComplete(String str, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig) {
        C7384Etj.A0Y(str, 0);
        if (hatchCcvPostalFieldConfig != null) {
            return AnonymousClass002.A0l(str).length() == 0 ? hatchCcvPostalFieldConfig.isOptional : failedPostalRule(str, hatchCcvPostalFieldConfig.validationRules) == null;
        }
        return true;
    }

    public static final HatchCardFieldError validateExpiry(String str) {
        C7384Etj.A0Y(str, 0);
        HatchCardValidator hatchCardValidator = HatchCardValidator.INSTANCE;
        YearMonth yearMonthNow = YearMonth.now();
        C7384Etj.A0U(yearMonthNow);
        return toFieldError(hatchCardValidator.expiration(str, yearMonthNow), AnonymousClass002.A1M(HatchCardNetworkKt.digitsOnly(str).length()), HatchCardFieldError.EXPIRY_EMPTY, HatchCardFieldError.EXPIRY_MALFORMED, AnonymousClass1.INSTANCE);
    }

    public static final HxE<HatchCardFieldError, HatchPostalValidationRule> validatePostalField(String str, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig) {
        C7384Etj.A0Y(str, 0);
        if (hatchCcvPostalFieldConfig != null) {
            if (AnonymousClass002.A0l(str).length() != 0) {
                return C3cG.A0r(null, failedPostalRule(str, hatchCcvPostalFieldConfig.validationRules));
            }
            if (!hatchCcvPostalFieldConfig.isOptional) {
                return C3cG.A0r(HatchCardFieldError.ZIP_EMPTY, null);
            }
        }
        return new HxE<>(null, null);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchPostalRuleType.values().length];
            try {
                AnonymousClass002.A13(HatchPostalRuleType.REGEX, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchPostalRuleType.EXACT_LENGTH, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchPostalRuleType.MIN_LENGTH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchPostalRuleType.MAX_LENGTH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ boolean isCardFormComplete$default(String str, String str2, String str3, String str4, HatchCcvPostalFieldConfig hatchCcvPostalFieldConfig, List list, int i, Object obj) {
        if ((i & 32) != 0) {
            list = C0881AGi.A00;
        }
        return isCardFormComplete(str, str2, str3, str4, hatchCcvPostalFieldConfig, list);
    }

    public static final HatchCardFieldError toFieldError(HatchCardFieldState hatchCardFieldState, boolean z, HatchCardFieldError hatchCardFieldError, HatchCardFieldError hatchCardFieldError2, G0U<? super HatchCardFieldFailure, ? extends HatchCardFieldError> g0u) {
        if (C7384Etj.areEqual(hatchCardFieldState, HatchCardFieldState.Valid.INSTANCE)) {
            return null;
        }
        if (C7384Etj.areEqual(hatchCardFieldState, HatchCardFieldState.Pending.INSTANCE)) {
            return z ? hatchCardFieldError : hatchCardFieldError2;
        }
        if (hatchCardFieldState instanceof HatchCardFieldState.Invalid) {
            return g0u.invoke(((HatchCardFieldState.Invalid) hatchCardFieldState).failure);
        }
        throw C3cG.A0q();
    }

    public static final List<HatchPostalValidationRule> toPostalRules(List<HatchCcvValidationRuleJson> list) {
        String str;
        ArrayList arrayListA0y = C3cI.A0y(list);
        for (HatchCcvValidationRuleJson hatchCcvValidationRuleJson : list) {
            HatchPostalRuleType hatchPostalRuleTypeFromWire = HatchPostalRuleType.Companion.fromWire(hatchCcvValidationRuleJson.type);
            if (hatchPostalRuleTypeFromWire != null && (str = hatchCcvValidationRuleJson.error_message) != null && !C7BY.A0j(str)) {
                arrayListA0y.add(new HatchPostalValidationRule(hatchPostalRuleTypeFromWire, hatchCcvValidationRuleJson.value, str));
            }
        }
        return arrayListA0y;
    }

    public static final HatchCardFieldError unsupportedBrandError(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        if (HatchCardNetwork.Companion.accepts(str, list)) {
            return null;
        }
        return HatchCardFieldError.PAN_UNSUPPORTED_BRAND;
    }

    public static final HatchCardFieldError validatePan(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        String strDigitsOnly = HatchCardNetworkKt.digitsOnly(str);
        HatchCardFieldError hatchCardFieldErrorUnsupportedBrandError = unsupportedBrandError(strDigitsOnly, list);
        return hatchCardFieldErrorUnsupportedBrandError == null ? toFieldError(HatchCardValidator.INSTANCE.cardNumber(str, C0881AGi.A00), AnonymousClass002.A1M(strDigitsOnly.length()), HatchCardFieldError.PAN_EMPTY, HatchCardFieldError.PAN_INCOMPLETE, AnonymousClass2.INSTANCE) : hatchCardFieldErrorUnsupportedBrandError;
    }

    public static final HatchCardFieldError validateSecurityCode(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return toFieldError(HatchCardValidator.INSTANCE.securityCode(str, str2), AnonymousClass002.A1M(HatchCardNetworkKt.digitsOnly(str).length()), HatchCardFieldError.CSC_EMPTY, HatchCardFieldError.CSC_WRONG_LENGTH, C110171.INSTANCE);
    }
}
