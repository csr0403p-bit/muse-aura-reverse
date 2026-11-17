package com.facebook.content;

import X.C5246DeB;
import X.F60;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class ContentModule {

    public class ContentModuleSelendroidInjector {
        public final Context A00;

        public ContentModuleSelendroidInjector(Context context) {
            this.A00 = context;
        }

        public SecureContextHelper getSecureContextHelper() {
            return (SecureContextHelper) C5246DeB.A00(32778);
        }
    }

    public ContentModule() {
        throw F60.createAndThrow();
    }
}
