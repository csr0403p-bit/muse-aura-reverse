package com.facebook.aura.uicontrol;

import X.ADq;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BFI;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.dancingavatars.gating.MC;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.settings.MC;
import com.facebook.aura.uicontrol.ItemLookup;
import com.facebook.aura.uicontrol.UiActionExecutor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public abstract class UiControlItemNavigationKt {
    public static final String ERROR_CODE_NOT_FOUND = "not_found";
    public static final int HTTP_NOT_FOUND = 404;
    public static final int TRANSPORT_FAILURE_CODE = -1;
    public static final ADq HTTP_CLIENT_ERRORS = new ADq(400, MC.c50_accounts_center_settings.__CONFIG__);
    public static final ADq HTTP_SERVER_ERRORS = new ADq(500, MC.hatch_android_dancing_avatars.__CONFIG__);
    public static final char[] ITEM_ID_UNSAFE_CHARS = {'/', '\\', '?', '#', '%'};

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlItemNavigationKt", f = "UiControlItemNavigation.kt", l = {91}, m = "lookUpItem", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlItemNavigationKt$lookUpItem$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiControlItemNavigationKt.lookUpItem(null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlItemNavigationKt$openUiControlItem$2", f = "UiControlItemNavigation.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlItemNavigationKt$openUiControlItem$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super UiActionExecutor.Result>, Object> {
        public final /* synthetic */ G0U<String, AuraNavKey> $detailKey;
        public final /* synthetic */ G0V<String, HtJ<? super HsJ<String>>, Object> $lookUpCanonicalId;
        public final /* synthetic */ String $noun;
        public final /* synthetic */ String $requestedId;
        public final /* synthetic */ AuraTabRootNavKey $tabRoot;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, String str, String str2, G0V<? super String, ? super HtJ<? super HsJ<String>>, ? extends Object> g0v, G0U<? super String, ? extends AuraNavKey> g0u, AuraTabRootNavKey auraTabRootNavKey, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$noun = str;
            this.$requestedId = str2;
            this.$lookUpCanonicalId = g0v;
            this.$detailKey = g0u;
            this.$tabRoot = auraTabRootNavKey;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.$noun, this.$requestedId, this.$lookUpCanonicalId, this.$detailKey, this.$tabRoot, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiControlActionSink companion;
            UiControlNavigationHost uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol;
            StringBuilder sbA0x;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                companion = UiControlActionSink.Companion.getInstance(this.$userSession);
                uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol = companion.visibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol();
                if (uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol == null) {
                    sbA0x = C3cI.A0x("The app is not on screen, so the ", this.$noun);
                    str = " was not opened. Ask the user to open the app and try again.";
                    return new UiActionExecutor.Result.Unsupported(AnonymousClass001.A0v(str, sbA0x), "unavailable");
                }
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                String str2 = this.$noun;
                String str3 = this.$requestedId;
                G0V<String, HtJ<? super HsJ<String>>, Object> g0v = this.$lookUpCanonicalId;
                this.L$0 = companion;
                this.L$1 = uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol;
                this.label = 1;
                obj = UiControlItemNavigationKt.lookUpItem(abstractC3358CGz, str2, str3, g0v, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol = (UiControlNavigationHost) this.L$1;
                companion = (UiControlActionSink) this.L$0;
                Hwg.A00(obj);
            }
            ItemLookup itemLookup = (ItemLookup) obj;
            if (!(itemLookup instanceof ItemLookup.Found)) {
                if (itemLookup instanceof ItemLookup.Refused) {
                    return ((ItemLookup.Refused) itemLookup).result;
                }
                throw C3cG.A0q();
            }
            String str4 = ((ItemLookup.Found) itemLookup).canonicalId;
            if (!uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol.registered.get() || companion.visibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol() != uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol) {
                sbA0x = C3cI.A0x("The screen changed while the ", this.$noun);
                str = " was loading, so it was not opened. Try again.";
            } else {
                if (!(uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol.navigator.currentKey(true) instanceof AuraOverlayNavKey)) {
                    AuraNavKey auraNavKeyInvoke = this.$detailKey.invoke(str4);
                    uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol.navigator.navigate(this.$tabRoot, LaunchFlag.BRING_TO_FRONT);
                    uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol.navigator.popToTabRoot(this.$tabRoot);
                    uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol.navigator.navigate(auraNavKeyInvoke, false);
                    return C7384Etj.areEqual(uiControlNavigationHostVisibleNavigationHost$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol.navigator.currentKey(true), auraNavKeyInvoke) ? UiActionExecutor.Result.Performed.INSTANCE : new UiActionExecutor.Result.Unsupported(FGI.A0U("The ", this.$noun, " detail did not open."), null);
                }
                sbA0x = C3cI.A0x("Something is open in front of the app, such as the app lock, so the ", this.$noun);
                str = " was not opened.";
            }
            return new UiActionExecutor.Result.Unsupported(AnonymousClass001.A0v(str, sbA0x), "unavailable");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super UiActionExecutor.Result> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object lookUpItem(X.AbstractC3358CGz r6, java.lang.String r7, java.lang.String r8, X.G0V<? super java.lang.String, ? super X.HtJ<? super X.HsJ<java.lang.String>>, ? extends java.lang.Object> r9, X.HtJ<? super com.facebook.aura.uicontrol.ItemLookup> r10) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiControlItemNavigationKt.lookUpItem(X.CGz, java.lang.String, java.lang.String, X.G0V, X.HtJ):java.lang.Object");
    }

    public static final /* synthetic */ UiActionExecutor.Result access$unavailable(String str) {
        return new UiActionExecutor.Result.Unsupported(str, "unavailable");
    }

    public static final boolean isNotFound(Throwable th) {
        if (!(th instanceof NetworkException)) {
            return false;
        }
        NetworkException networkException = (NetworkException) th;
        int i = networkException.httpResponseCode;
        if (i != 404) {
            return 200 <= i && i < 300 && "not_found".equals(networkException.errorCode);
        }
        return true;
    }

    public static final boolean isTransportFailure(Throwable th) {
        return (th instanceof NetworkException) && ((NetworkException) th).httpResponseCode == -1;
    }

    public static final UiActionExecutor.Result notFound(String str, String str2) {
        return new UiActionExecutor.Result.Unsupported(FGI.A0d("no ", str, " with id: ", str2), null);
    }

    public static final Object openUiControlItem(AbstractC3358CGz abstractC3358CGz, String str, String str2, AuraTabRootNavKey auraTabRootNavKey, G0U<? super String, ? extends AuraNavKey> g0u, G0V<? super String, ? super HtJ<? super HsJ<String>>, ? extends Object> g0v, HtJ<? super UiActionExecutor.Result> htJ) {
        return GAo.A00(htJ, AuraDispatchers.mainImmediate, new AnonymousClass2(abstractC3358CGz, str, str2, g0v, g0u, auraTabRootNavKey, null));
    }

    public static final UiActionExecutor.Result unavailable(String str) {
        return new UiActionExecutor.Result.Unsupported(str, "unavailable");
    }

    public static final UiActionExecutor.Result unreachable(String str, String str2) {
        return new UiActionExecutor.Result.Unsupported(FGI.A0h("Could not reach the agent to load ", str, InviteCodeScratcherKt.CODE_SEPARATOR, str2, ", so it was not opened."), "unavailable");
    }

    public static final String userSafeReason(Throwable th) {
        NetworkException networkException;
        Integer numValueOf = null;
        if ((th instanceof NetworkException) && (networkException = (NetworkException) th) != null) {
            numValueOf = Integer.valueOf(networkException.httpResponseCode);
        }
        ADq aDq = HTTP_CLIENT_ERRORS;
        if (numValueOf == null || !aDq.A00(numValueOf.intValue())) {
            return (numValueOf == null || !HTTP_SERVER_ERRORS.A00(numValueOf.intValue())) ? "the request failed" : "the server had an error";
        }
        return "the request was rejected";
    }

    public static final boolean isSafeItemId(String str) {
        if (C7BY.A0j(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (BFI.A0K(ITEM_ID_UNSAFE_CHARS, str.charAt(i))) {
                return false;
            }
        }
        return (".".equals(str) || "..".equals(str)) ? false : true;
    }
}
