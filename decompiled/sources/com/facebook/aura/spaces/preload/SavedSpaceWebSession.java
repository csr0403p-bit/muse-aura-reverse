package com.facebook.aura.spaces.preload;

import X.AbstractC05846xo;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C05686pL;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C6li;
import X.C6oa;
import X.C6pD;
import X.C6t6;
import X.C6xE;
import X.C6xU;
import X.C6xj;
import X.C7384Etj;
import X.C7510EyX;
import X.CFK;
import X.CH0;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.network.AuraAuthHeaders;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* loaded from: classes3.dex */
public final class SavedSpaceWebSession implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public volatile boolean closed;
    public C6pD profile;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.preload.SavedSpaceWebSession$admittedUrl$2", f = "SavedSpaceWebSession.kt", l = {110, 176, 128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.preload.SavedSpaceWebSession$admittedUrl$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $shareKey;
        public final /* synthetic */ String $shortcode;
        public final /* synthetic */ String $userAgent;
        public final /* synthetic */ C6t6 $webView;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public final /* synthetic */ SavedSpaceWebSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6t6 c6t6, SavedSpaceWebSession savedSpaceWebSession, String str, String str2, String str3, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$webView = c6t6;
            this.this$0 = savedSpaceWebSession;
            this.$shortcode = str;
            this.$userAgent = str2;
            this.$shareKey = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$webView, this.this$0, this.$shortcode, this.$userAgent, this.$shareKey, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01ce A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 502
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SavedSpaceWebSession.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.closed = true;
        C60O.A02().post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SavedSpaceWebSession.clearUserData.1
            @Override // java.lang.Runnable
            public final void run() {
                C6pD c6pD = SavedSpaceWebSession.this.profile;
                if (c6pD != null) {
                    C6oa c6oa = (C6oa) c6pD;
                    C6li c6li = C6xU.A0h;
                    if (!c6li.A01()) {
                        throw C60Q.A0q();
                    }
                    c6oa.A00.getCookieManager().removeAllCookies(null);
                    C6oa c6oa2 = (C6oa) c6pD;
                    if (!c6li.A01()) {
                        throw C60Q.A0q();
                    }
                    C6xE.A00(c6oa2.A00.getWebStorage(), new Runnable() { // from class: com.facebook.aura.spaces.preload.SavedSpaceWebSession$clearUserData$1$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                        }
                    });
                }
                SavedSpaceWebSession.this.profile = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAccount() {
        if (this.closed || !C7384Etj.areEqual(AuraAuthHeaders.INSTANCE.currentUserIdForCache(), ((CH0) this.userSession).A01)) {
            throw C3cG.A0Q("Check failed.");
        }
    }

    public final Object admittedUrl(String str, String str2, C6t6 c6t6, String str3, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new AnonymousClass2(c6t6, this, str, str3, str2, null));
    }

    public final boolean configure(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        int iIdentityHashCode = System.identityHashCode(c6t6);
        try {
            checkAccount();
            boolean zA00 = C6xU.A00("MULTI_PROFILE");
            boolean zA002 = C6xU.A00("DELETE_BROWSING_DATA");
            StringBuilder sbA0y = C60O.A0y("view=", iIdentityHashCode);
            sbA0y.append(" event=profile_support multiProfile=");
            sbA0y.append(zA00);
            C60R.A1L(" deleteData=", "SavedSpaceViewer", sbA0y, zA002);
            if (zA00 && zA002) {
                C6pD c6oa = this.profile;
                if (c6oa == null) {
                    C6li c6li = C6xU.A0h;
                    if (!c6li.A01()) {
                        throw C60Q.A0q();
                    }
                    C05686pL c05686pL = C05686pL.A01;
                    if (c05686pL == null) {
                        c05686pL = new C05686pL(AbstractC05846xo.A00.AJB());
                        C05686pL.A01 = c05686pL;
                    }
                    String strA0a = AnonymousClass007.A0a("muse_saved_space_", UUID.randomUUID());
                    if (!c6li.A01()) {
                        throw C60Q.A0q();
                    }
                    c6oa = new C6oa((ProfileBoundaryInterface) C7510EyX.A00(ProfileBoundaryInterface.class, c05686pL.A00.getOrCreateProfile(strA0a)));
                    this.profile = c6oa;
                }
                String name = c6oa.getName();
                if (!C6xU.A0h.A01()) {
                    throw C60Q.A0q();
                }
                C6xj.A02(c6t6).A00.setProfile(name);
                c6t6.setSaveEnabled(false);
                C60O.A1O("view=", iIdentityHashCode, " event=profile_ready", "SavedSpaceViewer");
                return true;
            }
            throw C3cG.A0Q("Check failed.");
        } catch (Exception e) {
            String strA0Y = C3cI.A0Y(e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            C7384Etj.A0U(stackTrace);
            StackTraceElement stackTraceElement = stackTrace.length == 0 ? null : stackTrace[0];
            StringBuilder sbA0y2 = C60O.A0y("view=", iIdentityHashCode);
            sbA0y2.append(" event=profile_failed stage=");
            sbA0y2.append("account_check");
            sbA0y2.append(" errorType=");
            sbA0y2.append(strA0Y);
            CFK.A06("SavedSpaceViewer", AnonymousClass006.A0y(stackTraceElement, " at=", sbA0y2));
            return false;
        }
    }

    public final class Companion {
        public final SavedSpaceWebSession getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (SavedSpaceWebSession) abstractC3358CGz.A03(SavedSpaceWebSession.class, new SavedSpaceWebSession$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SavedSpaceWebSession(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public /* synthetic */ SavedSpaceWebSession(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
