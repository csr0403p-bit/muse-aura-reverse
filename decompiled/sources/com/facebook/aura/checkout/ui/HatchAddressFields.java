package com.facebook.aura.checkout.ui;

import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0V;
import com.facebook.aura.checkout.ui.HatchFieldValidation;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchAddressFields {
    public static final int $stable = 0;
    public final String idPrefix;

    /* renamed from: com.facebook.aura.checkout.ui.HatchAddressFields$withError$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<String, Map<String, ? extends String>, HatchFieldValidation> {
        public final /* synthetic */ String $message;
        public final /* synthetic */ String $originalValue;
        public final /* synthetic */ HatchFormField $this_withError;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final HatchFieldValidation invoke2(String str, Map<String, String> map) {
            C7384Etj.A0Y(str, 0);
            if (!str.equals(this.$originalValue)) {
                return (this.$this_withError.isRequired && C7BY.A0j(str)) ? HatchFieldValidation.Pending.INSTANCE : HatchFieldValidation.Valid.INSTANCE;
            }
            String str2 = this.$message;
            C7384Etj.A0Y(str2, 0);
            return new HatchFieldValidation.Invalid(str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HatchFormField hatchFormField) {
            super(2);
            this.$originalValue = str;
            this.$message = str2;
            this.$this_withError = hatchFormField;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ HatchFieldValidation invoke(String str, Map<String, ? extends String> map) {
            return invoke2(str, (Map<String, String>) map);
        }
    }

    public HatchAddressFields(String str) {
        C7384Etj.A0Y(str, 0);
        this.idPrefix = str;
    }

    public final HatchAddressValue value(Map<String, String> map) {
        C7384Etj.A0Y(map, 0);
        String strA0p = C60O.A0p(getLine1Id(), map);
        if (strA0p == null) {
            strA0p = "";
        }
        String strA0p2 = C60O.A0p(getLine2Id(), map);
        if (strA0p2 == null) {
            strA0p2 = "";
        }
        String strA0p3 = C60O.A0p(getCityId(), map);
        if (strA0p3 == null) {
            strA0p3 = "";
        }
        String strA0p4 = C60O.A0p(getStateId(), map);
        if (strA0p4 == null) {
            strA0p4 = "";
        }
        String strA0p5 = C60O.A0p(getZipId(), map);
        if (strA0p5 == null) {
            strA0p5 = "";
        }
        return new HatchAddressValue(strA0p, strA0p2, strA0p3, strA0p4, strA0p5);
    }

    private final HatchFormField withError(HatchFormField hatchFormField, String str) {
        Object next;
        String strA0l;
        if (str == null) {
            return hatchFormField;
        }
        if (hatchFormField.options.isEmpty()) {
            strA0l = AnonymousClass002.A0l(hatchFormField.initialValue);
        } else {
            Iterator it = hatchFormField.options.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            } while (!AbstractC2159Azp.A12(((HatchFormOption) next).value, hatchFormField.initialValue, true));
            HatchFormOption hatchFormOption = (HatchFormOption) next;
            if (hatchFormOption == null || (strA0l = hatchFormOption.value) == null) {
                strA0l = "";
            }
        }
        return HatchFormField.copy$default(hatchFormField, null, null, null, null, false, null, null, new AnonymousClass1(strA0l, str, hatchFormField), null, null, null, 1919, null);
    }

    public final String getCityId() {
        return FGI.A0M(this.idPrefix, "-city");
    }

    public final String getLine1Id() {
        return FGI.A0M(this.idPrefix, "-address-line-1");
    }

    public final String getLine2Id() {
        return FGI.A0M(this.idPrefix, "-address-line-2");
    }

    public final String getStateId() {
        return FGI.A0M(this.idPrefix, "-state");
    }

    public final String getZipId() {
        return FGI.A0M(this.idPrefix, "-zip");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.checkout.ui.HatchFormSection section(java.lang.String r32, java.lang.String r33, com.facebook.aura.checkout.ui.HatchAddressValue r34, X.AHD<com.facebook.aura.checkout.ui.HatchFormOption> r35, X.BO6<java.lang.String, java.lang.String> r36, com.facebook.aura.checkout.ui.HatchAddressTypeahead r37, X.BFM r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkout.ui.HatchAddressFields.section(java.lang.String, java.lang.String, com.facebook.aura.checkout.ui.HatchAddressValue, X.AHD, X.BO6, com.facebook.aura.checkout.ui.HatchAddressTypeahead, X.BFM, int, int):com.facebook.aura.checkout.ui.HatchFormSection");
    }
}
