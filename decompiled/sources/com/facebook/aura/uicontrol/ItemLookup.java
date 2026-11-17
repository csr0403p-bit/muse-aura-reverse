package com.facebook.aura.uicontrol;

import X.C7384Etj;
import com.facebook.aura.uicontrol.UiActionExecutor;

/* loaded from: classes2.dex */
public interface ItemLookup {

    public final class Found implements ItemLookup {
        public final String canonicalId;

        public Found(String str) {
            C7384Etj.A0Y(str, 0);
            this.canonicalId = str;
        }

        public final String getCanonicalId() {
            return this.canonicalId;
        }
    }

    public final class Refused implements ItemLookup {
        public final UiActionExecutor.Result result;

        public Refused(UiActionExecutor.Result result) {
            C7384Etj.A0Y(result, 0);
            this.result = result;
        }

        public final UiActionExecutor.Result getResult() {
            return this.result;
        }
    }
}
