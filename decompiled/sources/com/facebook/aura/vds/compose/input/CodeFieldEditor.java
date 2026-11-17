package com.facebook.aura.vds.compose.input;

import X.AbstractC1815ArZ;
import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.Au3;
import X.C1805ArO;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class CodeFieldEditor {
    public final MutableState lastEdit$delegate = AnonymousClass002.A0P(new C1805ArO("", Au3.A01));

    public final String record(C1805ArO c1805ArO) {
        C7384Etj.A0Y(c1805ArO, 0);
        setLastEdit(c1805ArO);
        return c1805ArO.A01.A00;
    }

    public final C1805ArO valueFor(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (!AbstractC2159Azp.A12(getLastEdit().A01.A00, str, z)) {
            int length = str.length();
            return new C1805ArO(str, AbstractC1815ArZ.A00(length, length));
        }
        C1805ArO lastEdit = getLastEdit();
        int length2 = str.length();
        return new C1805ArO(lastEdit.A01, lastEdit.A02, AbstractC1815ArZ.A00(length2, length2));
    }

    private final C1805ArO getLastEdit() {
        return (C1805ArO) this.lastEdit$delegate.getValue();
    }

    private final void setLastEdit(C1805ArO c1805ArO) {
        this.lastEdit$delegate.Af8(c1805ArO);
    }
}
