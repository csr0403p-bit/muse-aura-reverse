package com.facebook.aura.settings;

import X.C60P;
import X.C7384Etj;
import android.content.Context;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillManager;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class WebDomainAutofillLayout extends FrameLayout {
    public final View composeHost;
    public String webDomain;

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        C7384Etj.A0Y(viewStructure, 0);
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        ViewStructure viewStructureNewChild = viewStructure.newChild(viewStructure.addChildCount(1));
        this.composeHost.dispatchProvideAutofillStructure(viewStructureNewChild, i);
        viewStructureNewChild.setWebDomain(this.webDomain);
    }

    @Override // android.view.View
    public void onProvideAutofillStructure(ViewStructure viewStructure, int i) {
        C7384Etj.A0Y(viewStructure, 0);
        super.onProvideAutofillStructure(viewStructure, i);
        viewStructure.setWebDomain(this.webDomain);
    }

    public final String getWebDomain() {
        return this.webDomain;
    }

    public final void setWebDomain(String str) {
        if (C7384Etj.areEqual(this.webDomain, str)) {
            return;
        }
        this.webDomain = str;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebDomainAutofillLayout(Context context, View view) {
        super(context);
        boolean zA1Y = C60P.A1Y(context, view);
        this.composeHost = view;
        setImportantForAutofill(zA1Y ? 1 : 0);
    }
}
