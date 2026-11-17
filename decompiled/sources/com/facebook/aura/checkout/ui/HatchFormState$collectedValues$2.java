package com.facebook.aura.checkout.ui;

import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.C1805ArO;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchFormState$collectedValues$2 extends AbstractC7559F3s implements Function0<Map<String, String>> {
    public final /* synthetic */ HatchFormState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormState$collectedValues$2(HatchFormState hatchFormState) {
        super(0);
        this.this$0 = hatchFormState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        Object next;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap(HatchFormSheetKt.plainValues(this.this$0.values));
        HatchFormState hatchFormState = this.this$0;
        for (HatchFormField hatchFormField : HatchFormSheetKt.allFields(hatchFormState.shownSections$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui())) {
            if (!hatchFormField.options.isEmpty()) {
                String str2 = hatchFormField.id;
                Iterator it = hatchFormField.options.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String str3 = ((HatchFormOption) next).value;
                    C1805ArO c1805ArO = hatchFormState.values.get(hatchFormField.id);
                    if (AbstractC2159Azp.A12(str3, c1805ArO != null ? c1805ArO.A01.A00 : null, true)) {
                        break;
                    }
                }
                HatchFormOption hatchFormOption = (HatchFormOption) next;
                if (hatchFormOption == null || (str = hatchFormOption.value) == null) {
                    str = "";
                }
                linkedHashMap.put(str2, str);
            }
        }
        return linkedHashMap;
    }
}
