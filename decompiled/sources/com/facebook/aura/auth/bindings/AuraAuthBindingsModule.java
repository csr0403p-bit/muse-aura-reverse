package com.facebook.aura.auth.bindings;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.C8j3;
import X.CH0;
import X.EsA;
import android.content.Context;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.reactivesocket.flipper.common.FlipperLiveDataProvider;

/* loaded from: classes5.dex */
public final class AuraAuthBindingsModule {
    public static final AuraAuthBindingsModule INSTANCE = new AuraAuthBindingsModule();

    /* renamed from: com.facebook.aura.auth.bindings.AuraAuthBindingsModule$provideViewerContextFactory$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public final ViewerContext create(Context context) {
            ViewerContext viewerContext = ViewerContext.A0D;
            C7384Etj.A0V(viewerContext);
            return viewerContext;
        }
    }

    public static final FlipperLiveDataProvider provideFlipperLiveDataProvider() {
        throw C8j3.A18("FlipperLiveDataProvider not available in Aura");
    }

    public static final String provideLoggedInMcUserId() {
        AbstractC3358CGz currentSession = AuraSessionManager.INSTANCE.getCurrentSession();
        if (currentSession != null) {
            return ((CH0) currentSession).A01;
        }
        return null;
    }

    public static final String provideLoggedInUserId() {
        throw C8j3.A18("LoggedInUserId not available in Aura");
    }

    public static final AnonymousClass1 provideViewerContextFactory() {
        return AnonymousClass1.INSTANCE;
    }

    public static final EsA provideViewerContextUserIdProvider() {
        throw C8j3.A18("ViewerContextUserIdProvider not available in Aura");
    }

    public static final ViewerContext providerViewerContext() {
        ViewerContext viewerContext = ViewerContext.A0D;
        C7384Etj.A0V(viewerContext);
        return viewerContext;
    }
}
