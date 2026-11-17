package com.facebook.aura.confidentialvm.repository;

import X.AGI;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C7BY;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ConfidentialVmValuePropsJsonKt {
    public static final ConfidentialVmDisclosure toDisclosure(ConfidentialVmValuePropsJson confidentialVmValuePropsJson) {
        C7384Etj.A0Y(confidentialVmValuePropsJson, 0);
        if (C7BY.A0j(confidentialVmValuePropsJson.disclosure_text)) {
            return null;
        }
        String str = confidentialVmValuePropsJson.disclosure_text;
        List<ConfidentialVmValuePropEntityJson> list = confidentialVmValuePropsJson.disclosure_entities;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (ConfidentialVmValuePropEntityJson confidentialVmValuePropEntityJson : list) {
            arrayListA0i.add(new ConfidentialVmValuePropLink(confidentialVmValuePropEntityJson.offset, confidentialVmValuePropEntityJson.length, confidentialVmValuePropEntityJson.url));
        }
        return new ConfidentialVmDisclosure(str, AGI.A07(arrayListA0i));
    }
}
