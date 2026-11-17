package com.facebook.aura.checkout.ui;

import X.AGE;
import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AbstractC1815ArZ;
import X.AbstractC2258BHp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BBP;
import X.C0981AMm;
import X.C1805ArO;
import X.C1BO;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.checkout.ui.HatchFieldValidation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchFormState {
    public static final int $stable = 0;
    public final C1BO collectedValues$delegate;
    public final MutableState sections$delegate;
    public final MutableState trailingSections$delegate;
    public final MutableState trailingSectionsRevealed$delegate;
    public final C0981AMm<String, C1805ArO> values;

    public HatchFormState(List<HatchFormField> list) {
        C7384Etj.A0Y(list, 0);
        AHI ahi = AHI.A01;
        AGE age = AGE.A00;
        this.sections$delegate = C3cG.A08(age, ahi);
        this.trailingSections$delegate = C3cG.A08(age, ahi);
        this.trailingSectionsRevealed$delegate = C3cG.A08(age, AnonymousClass001.A0i());
        this.values = new C0981AMm<>();
        seed$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(list);
        this.collectedValues$delegate = new BBP(age, new HatchFormState$collectedValues$2(this));
    }

    public final void fill$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(Map<String, String> map) {
        String strInvoke;
        Object next;
        C7384Etj.A0Y(map, 0);
        List<HatchFormField> listAllFields = HatchFormSheetKt.allFields(shownSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui());
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(listAllFields));
        for (HatchFormField hatchFormField : listAllFields) {
            linkedHashMapA15.put(hatchFormField.id, hatchFormField);
        }
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            String str = (String) entryA0l.getValue();
            HatchFormField hatchFormField2 = (HatchFormField) linkedHashMapA15.get(key);
            if (hatchFormField2 != null) {
                String strA0l = AnonymousClass002.A0l(str);
                if (strA0l.length() != 0) {
                    if (hatchFormField2.options.isEmpty()) {
                        G0W<String, String, Map<String, String>, String> g0w = hatchFormField2.format;
                        if (g0w == null || (strInvoke = g0w.invoke(strA0l, "", HatchFormSheetKt.plainValues(this.values))) == null) {
                            strInvoke = HatchFormSheetKt.formattedInput(hatchFormField2.kind, strA0l, "");
                        }
                    } else {
                        Iterator it = hatchFormField2.options.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            String str2 = ((HatchFormOption) next).value;
                            if (str2 != null && str2.equalsIgnoreCase(strA0l)) {
                                break;
                            }
                        }
                        HatchFormOption hatchFormOption = (HatchFormOption) next;
                        if (hatchFormOption == null || (strInvoke = hatchFormOption.value) == null) {
                        }
                    }
                    Map map2 = this.values;
                    int length = strInvoke.length();
                    map2.put(key, new C1805ArO(strInvoke, AbstractC1815ArZ.A00(length, length)));
                }
            }
        }
        String str3 = (String) AbstractC0878AGe.A0C(map.keySet());
        if (str3 != null) {
            reformatDependents$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(str3);
        }
    }

    public final void reformatDependents$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(String str) {
        C7384Etj.A0Y(str, 0);
        for (HatchFormField hatchFormField : HatchFormSheetKt.allFields(shownSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui())) {
            G0W<String, String, Map<String, String>, String> g0w = hatchFormField.format;
            if (g0w != null) {
                C1805ArO c1805ArO = this.values.get(hatchFormField.id);
                if (!str.equals(hatchFormField.id) && c1805ArO != null) {
                    String str2 = c1805ArO.A01.A00;
                    String strInvoke = g0w.invoke(str2, str2, HatchFormSheetKt.plainValues(this.values));
                    if (!C7384Etj.areEqual(strInvoke, str2)) {
                        this.values.put(hatchFormField.id, HatchFormSheetKt.reformattedAs(c1805ArO, strInvoke));
                    }
                }
            }
        }
    }

    public final void seed$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(List<HatchFormField> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList<HatchFormField> arrayListA0h = C3cG.A0h();
        for (HatchFormField hatchFormField : list) {
            if (!this.values.containsKey(hatchFormField.id)) {
                arrayListA0h.add(hatchFormField);
            }
        }
        for (HatchFormField hatchFormField2 : arrayListA0h) {
            String str = HatchFormSheetKt.formattedInput(hatchFormField2.kind, hatchFormField2.initialValue, "");
            C0981AMm<String, C1805ArO> c0981AMm = this.values;
            String str2 = hatchFormField2.id;
            int length = str.length();
            c0981AMm.put(str2, new C1805ArO(str, AbstractC1815ArZ.A00(length, length)));
        }
        for (HatchFormField hatchFormField3 : arrayListA0h) {
            G0W<String, String, Map<String, String>, String> g0w = hatchFormField3.format;
            if (g0w != null) {
                C0981AMm<String, C1805ArO> c0981AMm2 = this.values;
                String str3 = hatchFormField3.id;
                C7384Etj.A0Y(c0981AMm2, 0);
                String str4 = ((C1805ArO) AbstractC2258BHp.A0L(str3, c0981AMm2)).A01.A00;
                String strInvoke = g0w.invoke(str4, str4, HatchFormSheetKt.plainValues(this.values));
                if (!C7384Etj.areEqual(strInvoke, str4)) {
                    C0981AMm<String, C1805ArO> c0981AMm3 = this.values;
                    String str5 = hatchFormField3.id;
                    int length2 = strInvoke.length();
                    c0981AMm3.put(str5, new C1805ArO(strInvoke, AbstractC1815ArZ.A00(length2, length2)));
                }
            }
        }
    }

    public final void setSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(AHD<HatchFormSection> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.sections$delegate.Af8(ahd);
    }

    public final void setTrailingSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(AHD<HatchFormSection> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.trailingSections$delegate.Af8(ahd);
    }

    private final Map<String, String> getCollectedValues() {
        return (Map) this.collectedValues$delegate.getValue();
    }

    public final AHD<HatchFormSection> getSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui() {
        return (AHD) this.sections$delegate.getValue();
    }

    public final AHD<HatchFormSection> getTrailingSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui() {
        return (AHD) this.trailingSections$delegate.getValue();
    }

    public final boolean getTrailingSectionsRevealed$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui() {
        return MutableState.A0A(this.trailingSectionsRevealed$delegate);
    }

    public final C0981AMm<String, C1805ArO> getValues$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui() {
        return this.values;
    }

    public final void setTrailingSectionsRevealed$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(boolean z) {
        MutableState.A09(z, this.trailingSectionsRevealed$delegate);
    }

    public final List<HatchFormSection> shownSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui() {
        boolean zA0A = MutableState.A0A(this.trailingSectionsRevealed$delegate);
        AHD<HatchFormSection> sections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui = getSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui();
        return zA0A ? AbstractC0878AGe.A0P(getTrailingSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(), sections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui) : sections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui;
    }

    public final Map<String, String> collected() {
        return getCollectedValues();
    }

    public final boolean isSubmittable() {
        String strA0p;
        Map<String, String> collectedValues = getCollectedValues();
        List<HatchFormField> listAllFields = HatchFormSheetKt.allFields(shownSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui());
        if (!(listAllFields instanceof Collection) || !listAllFields.isEmpty()) {
            for (HatchFormField hatchFormField : listAllFields) {
                G0V<String, Map<String, String>, HatchFieldValidation> g0v = hatchFormField.validate;
                if (g0v != null) {
                    String str = collectedValues.get(hatchFormField.id);
                    if (str == null) {
                        str = "";
                    }
                    if (!C7384Etj.areEqual(g0v.invoke(str, collectedValues), HatchFieldValidation.Valid.INSTANCE)) {
                        return false;
                    }
                } else if (hatchFormField.isRequired && ((strA0p = C60O.A0p(hatchFormField.id, collectedValues)) == null || !(!C7BY.A0j(strA0p)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
