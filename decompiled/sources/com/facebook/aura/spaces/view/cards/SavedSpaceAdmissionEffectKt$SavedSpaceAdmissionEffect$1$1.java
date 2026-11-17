package com.facebook.aura.spaces.view.cards;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C6t6;
import X.C7384Etj;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import android.net.Uri;
import com.facebook.aura.spaces.preload.SavedSpaceWebSession;
import com.facebook.aura.spaces.preload.SavedSpaceWebSessionKt;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.TimeoutCancellationException;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.spaces.view.cards.SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1", f = "SavedSpaceAdmissionEffect.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $contentKey;
    public final /* synthetic */ String $shareKey;
    public final /* synthetic */ String $shortcode;
    public final /* synthetic */ String $sourceUrl;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ C6t6 $webView;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.spaces.view.cards.SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1$1", f = "SavedSpaceAdmissionEffect.kt", l = {48, 72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.cards.SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $contentKey;
        public final /* synthetic */ HtmlSpacesWebViewSession $session;
        public final /* synthetic */ String $shareKey;
        public final /* synthetic */ String $shortcode;
        public final /* synthetic */ C10543Hqv<String> $stage;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ int $viewId;
        public final /* synthetic */ C6t6 $webView;
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.spaces.view.cards.SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1$1$1", f = "SavedSpaceAdmissionEffect.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.spaces.view.cards.SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C03851 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public C03851(HtJ<? super C03851> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C03851 c03851 = new C03851(htJ);
                c03851.Z$0 = AnonymousClass001.A1X(obj);
                return c03851;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(!z);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((C03851) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objAdmittedUrl = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objAdmittedUrl);
                if (!this.$session.savedSpaceProfileReady) {
                    throw C3cG.A0Q("Check failed.");
                }
                this.$stage.element = "admission";
                SavedSpaceWebSession companion = SavedSpaceWebSession.Companion.getInstance(this.$userSession);
                String str = this.$shortcode;
                String str2 = this.$shareKey;
                C6t6 c6t6 = this.$webView;
                String strA0d = C60R.A0d(c6t6);
                this.label = 1;
                objAdmittedUrl = companion.admittedUrl(str, str2, c6t6, strA0d, this);
                if (objAdmittedUrl == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objAdmittedUrl);
                    int i2 = this.$viewId;
                    Boolean value = this.$session.showError.getValue();
                    boolean zIsAttachedToWindow = this.$webView.isAttachedToWindow();
                    StringBuilder sbA0y = C60O.A0y("view=", i2);
                    sbA0y.append(" event=load_settled showError=");
                    sbA0y.append(value);
                    C60R.A1L(" attached=", "SavedSpaceViewer", sbA0y, zIsAttachedToWindow);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objAdmittedUrl);
            }
            String str3 = (String) objAdmittedUrl;
            this.$stage.element = "load_url";
            int i3 = this.$viewId;
            boolean zIsAttachedToWindow2 = this.$webView.isAttachedToWindow();
            int width = this.$webView.getWidth();
            int height = this.$webView.getHeight();
            StringBuilder sbA0y2 = C60O.A0y("view=", i3);
            sbA0y2.append(" event=load_url attached=");
            sbA0y2.append(zIsAttachedToWindow2);
            sbA0y2.append(" width=");
            sbA0y2.append(width);
            CFK.A05("SavedSpaceViewer", C60P.A1O(" height=", sbA0y2, height));
            this.$session.sourceUrl = Uri.parse(str3).buildUpon().clearQuery().fragment(null).build().toString();
            this.$session.loadedContent = this.$contentKey;
            HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
            htmlSpacesWebViewSession.savedSpaceAdmissionPending = true;
            AnonymousClass003.A14(htmlSpacesWebViewSession.isLoading, true);
            this.$webView.loadDataWithBaseURL(SavedSpaceWebSessionKt.SAVED_SPACE_DOCUMENT_URL, SavedSpaceWebSessionKt.savedSpaceFrameDocument(str3), "text/html", "utf-8", SavedSpaceWebSessionKt.SAVED_SPACE_DOCUMENT_URL);
            this.$stage.element = "page_callback";
            BLG<Boolean> blg = this.$session.isLoading;
            C03851 c03851 = new C03851(null);
            this.L$0 = null;
            this.label = 2;
            if (AbstractC9777Gfy.A00(this, c03851, blg) == enumC10460Hji) {
                return enumC10460Hji;
            }
            int i22 = this.$viewId;
            Boolean value2 = this.$session.showError.getValue();
            boolean zIsAttachedToWindow3 = this.$webView.isAttachedToWindow();
            StringBuilder sbA0y3 = C60O.A0y("view=", i22);
            sbA0y3.append(" event=load_settled showError=");
            sbA0y3.append(value2);
            C60R.A1L(" attached=", "SavedSpaceViewer", sbA0y3, zIsAttachedToWindow3);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, C10543Hqv<String> c10543Hqv, AbstractC3358CGz abstractC3358CGz, String str, String str2, C6t6 c6t6, int i, String str3, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$session = htmlSpacesWebViewSession;
            this.$stage = c10543Hqv;
            this.$userSession = abstractC3358CGz;
            this.$shortcode = str;
            this.$shareKey = str2;
            this.$webView = c6t6;
            this.$viewId = i;
            this.$contentKey = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$session, this.$stage, this.$userSession, this.$shortcode, this.$shareKey, this.$webView, this.$viewId, this.$contentKey, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1(C6t6 c6t6, String str, String str2, AbstractC3358CGz abstractC3358CGz, String str3, String str4, HtJ<? super SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1> htJ) {
        super(2, htJ);
        this.$webView = c6t6;
        this.$contentKey = str;
        this.$sourceUrl = str2;
        this.$userSession = abstractC3358CGz;
        this.$shortcode = str3;
        this.$shareKey = str4;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1(this.$webView, this.$contentKey, this.$sourceUrl, this.$userSession, this.$shortcode, this.$shareKey, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HtmlSpacesWebViewSession htmlSpacesWebViewSessionSpacesSession;
        int iIdentityHashCode;
        C10543Hqv c10543HqvA0z;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (TimeoutCancellationException unused) {
            Object obj2 = c10543HqvA0z.element;
            boolean zIsAttachedToWindow = this.$webView.isAttachedToWindow();
            StringBuilder sbA0y = C60O.A0y("view=", iIdentityHashCode);
            sbA0y.append(" event=timeout stage=");
            sbA0y.append(obj2);
            CFK.A06("SavedSpaceViewer", C60P.A1P(" attached=", sbA0y, zIsAttachedToWindow));
            this.$webView.stopLoading();
            AnonymousClass004.A1D(true, htmlSpacesWebViewSessionSpacesSession.showError);
            AnonymousClass004.A1D(false, htmlSpacesWebViewSessionSpacesSession.isLoading);
        } catch (CancellationException e) {
            C60P.A1X(c10543HqvA0z.element, " event=cancelled stage=", "SavedSpaceViewer", C60O.A0y("view=", iIdentityHashCode));
            this.$webView.stopLoading();
            htmlSpacesWebViewSessionSpacesSession.loadedContent = null;
            throw e;
        } catch (Exception e2) {
            Object obj3 = c10543HqvA0z.element;
            String strA0Y = C3cI.A0Y(e2);
            StackTraceElement[] stackTrace = e2.getStackTrace();
            C7384Etj.A0U(stackTrace);
            StackTraceElement stackTraceElement = stackTrace.length == 0 ? null : stackTrace[0];
            StringBuilder sbA0y2 = C60O.A0y("view=", iIdentityHashCode);
            sbA0y2.append(" event=failed stage=");
            sbA0y2.append(obj3);
            sbA0y2.append(" errorType=");
            sbA0y2.append(strA0Y);
            CFK.A06("SavedSpaceViewer", AnonymousClass006.A0y(stackTraceElement, " at=", sbA0y2));
            C3cJ.A0C(htmlSpacesWebViewSessionSpacesSession.showError, true);
            AnonymousClass003.A14(htmlSpacesWebViewSessionSpacesSession.isLoading, false);
        }
        if (i == 0) {
            Hwg.A00(obj);
            htmlSpacesWebViewSessionSpacesSession = SpacesWebViewSessionKt.spacesSession(this.$webView);
            iIdentityHashCode = System.identityHashCode(this.$webView);
            boolean z = htmlSpacesWebViewSessionSpacesSession.savedSpaceProfileReady;
            boolean zAreEqual = C7384Etj.areEqual(htmlSpacesWebViewSessionSpacesSession.loadedContent, this.$contentKey);
            boolean zIsAttachedToWindow2 = this.$webView.isAttachedToWindow();
            StringBuilder sbA0y3 = C60O.A0y("view=", iIdentityHashCode);
            sbA0y3.append(" event=effect_start profileReady=");
            sbA0y3.append(z);
            sbA0y3.append(" reused=");
            sbA0y3.append(zAreEqual);
            C60R.A1L(" attached=", "SavedSpaceViewer", sbA0y3, zIsAttachedToWindow2);
            if (!C7384Etj.areEqual(htmlSpacesWebViewSessionSpacesSession.loadedContent, this.$contentKey)) {
                c10543HqvA0z = C3cG.A0z();
                c10543HqvA0z.element = "profile_check";
                HtJ htJA14 = C3cI.A14(htmlSpacesWebViewSessionSpacesSession.showError, AnonymousClass001.A0h());
                AnonymousClass003.A14(htmlSpacesWebViewSessionSpacesSession.isLoading, true);
                htmlSpacesWebViewSessionSpacesSession.beginRender(this.$sourceUrl);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htmlSpacesWebViewSessionSpacesSession, c10543HqvA0z, this.$userSession, this.$shortcode, this.$shareKey, this.$webView, iIdentityHashCode, this.$contentKey, htJA14);
                this.L$0 = htmlSpacesWebViewSessionSpacesSession;
                this.L$1 = c10543HqvA0z;
                this.I$0 = iIdentityHashCode;
                this.label = 1;
                if (GAX.A00(this, anonymousClass1, 60000L) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        iIdentityHashCode = this.I$0;
        c10543HqvA0z = (C10543Hqv) this.L$1;
        htmlSpacesWebViewSessionSpacesSession = (HtmlSpacesWebViewSession) this.L$0;
        Hwg.A00(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SavedSpaceAdmissionEffectKt$SavedSpaceAdmissionEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
