package com.facebook.aura.spaces.preload;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C6t6;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import android.content.Context;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpacesWebViewFactoryKt$getSpacesWebViewPool$1$1 extends AbstractC7559F3s implements G0V<Context, String, C6t6> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.spaces.preload.SpacesWebViewFactoryKt$getSpacesWebViewPool$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C6t6, Unit> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6t6 c6t6) {
            C7384Etj.A0Y(c6t6, 0);
            if (AnonymousClass005.A1a(this.$key, SavedSpaceWebSessionKt.SAVED_SPACE_VIEWER_CACHE_PREFIX)) {
                Object tag = c6t6.getTag();
                C7384Etj.A0Z(tag, "null cannot be cast to non-null type com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession");
                HtmlSpacesWebViewSession htmlSpacesWebViewSession = (HtmlSpacesWebViewSession) tag;
                htmlSpacesWebViewSession.isSavedSpace = true;
                htmlSpacesWebViewSession.savedSpaceProfileReady = SavedSpaceWebSession.Companion.getInstance(this.$userSession).configure(c6t6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AbstractC3358CGz abstractC3358CGz) {
            super(1);
            this.$key = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6t6 c6t6) {
            invoke2(c6t6);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewFactoryKt$getSpacesWebViewPool$1$1(AbstractC3358CGz abstractC3358CGz) {
        super(2);
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0V
    public final C6t6 invoke(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        return SpacesWebViewFactoryKt.createPooledSpacesWebView(context, new AnonymousClass1(str, this.$userSession));
    }
}
