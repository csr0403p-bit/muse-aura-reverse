package com.facebook.aura.webview.session;

import X.AbstractC07127nr;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06827l3;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.Hm1;
import X.HtJ;
import X.HwV;
import X.Hwg;
import X.HzP;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.network.AuraAuthHeaders;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class SharedSpaceWebSession {
    public final int exchangeId;
    public final AbstractC3358CGz session;
    public String stage;
    public final int viewId;

    @DebugMetadata(c = "com.facebook.aura.webview.session.SharedSpaceWebSession", f = "SharedSpaceWebSession.kt", l = {230, 271}, m = "exchange", v = 2)
    /* renamed from: com.facebook.aura.webview.session.SharedSpaceWebSession$exchange$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSpaceWebSession.this.exchange(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.webview.session.SharedSpaceWebSession$load$2", f = "SharedSpaceWebSession.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 399}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.webview.session.SharedSpaceWebSession$load$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ CookieManager $cookieManager;
        public final /* synthetic */ String $destination;
        public final /* synthetic */ Map<String, String> $extraHeaders;
        public final /* synthetic */ String $userAgent;
        public final /* synthetic */ WebView $webView;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, CookieManager cookieManager, WebView webView, Map<String, String> map, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$destination = str;
            this.$userAgent = str2;
            this.$cookieManager = cookieManager;
            this.$webView = webView;
            this.$extraHeaders = map;
        }

        public static final void invokeSuspend$lambda$0$fail(SharedSpaceWebSession sharedSpaceWebSession, Hm1<? super Unit> hm1, String str) {
            sharedSpaceWebSession.event("web_navigation_failed", FGI.A0M("reason=", str));
            if (hm1.isActive()) {
                hm1.resumeWith(C3cG.A0s(C3cG.A0Q(str)));
            }
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedSpaceWebSession.this.new AnonymousClass2(this.$destination, this.$userAgent, this.$cookieManager, this.$webView, this.$extraHeaders, htJ);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r10 = r18
                X.Hji r9 = X.EnumC10460Hji.A02
                r5 = r17
                int r0 = r5.label
                java.lang.String r3 = "completed="
                java.lang.String r2 = "web_client_restored"
                r8 = 2
                r11 = 1
                if (r0 == 0) goto L25
                if (r0 == r11) goto L39
                if (r0 != r8) goto L20
                java.lang.Object r4 = r5.L$2
                X.F1F r4 = (X.F1F) r4
                java.lang.Object r1 = r5.L$1
                android.webkit.WebViewClient r1 = (android.webkit.WebViewClient) r1
                X.Hwg.A00(r10)     // Catch: java.lang.Throwable -> Lad
                goto L91
            L20:
                java.lang.IllegalStateException r6 = X.AnonymousClass001.A0n()
                throw r6
            L25:
                X.Hwg.A00(r10)
                com.facebook.aura.webview.session.SharedSpaceWebSession r6 = com.facebook.aura.webview.session.SharedSpaceWebSession.this
                java.lang.String r4 = r5.$destination
                java.lang.String r1 = r5.$userAgent
                android.webkit.CookieManager r0 = r5.$cookieManager
                r5.label = r11
                java.lang.Object r10 = r6.provision(r4, r1, r0, r5)
                if (r10 != r9) goto L3c
                return r9
            L39:
                X.Hwg.A00(r10)
            L3c:
                java.lang.String r10 = (java.lang.String) r10
                android.webkit.WebView r0 = r5.$webView
                android.webkit.WebViewClient r1 = r0.getWebViewClient()
                X.C7384Etj.A0U(r1)
                X.F1F r4 = new X.F1F
                r4.<init>()
                android.webkit.WebView r7 = r5.$webView     // Catch: java.lang.Throwable -> Lad
                com.facebook.aura.webview.session.SharedSpaceWebSession r12 = com.facebook.aura.webview.session.SharedSpaceWebSession.this     // Catch: java.lang.Throwable -> Lad
                java.util.Map<java.lang.String, java.lang.String> r6 = r5.$extraHeaders     // Catch: java.lang.Throwable -> Lad
                java.lang.String r13 = r5.$destination     // Catch: java.lang.Throwable -> Lad
                android.webkit.CookieManager r15 = r5.$cookieManager     // Catch: java.lang.Throwable -> Lad
                r5.L$0 = r10     // Catch: java.lang.Throwable -> Lad
                r5.L$1 = r1     // Catch: java.lang.Throwable -> Lad
                r5.L$2 = r4     // Catch: java.lang.Throwable -> Lad
                r5.L$3 = r7     // Catch: java.lang.Throwable -> Lad
                r5.L$4 = r12     // Catch: java.lang.Throwable -> Lad
                r5.L$5 = r6     // Catch: java.lang.Throwable -> Lad
                r5.L$6 = r13     // Catch: java.lang.Throwable -> Lad
                r5.L$7 = r15     // Catch: java.lang.Throwable -> Lad
                r5.label = r8     // Catch: java.lang.Throwable -> Lad
                X.GBL r14 = X.C7Bm.A04(r5)     // Catch: java.lang.Throwable -> Lad
                X.F1F r0 = new X.F1F     // Catch: java.lang.Throwable -> Lad
                r0.<init>()     // Catch: java.lang.Throwable -> Lad
                r0.element = r11     // Catch: java.lang.Throwable -> Lad
                com.facebook.aura.webview.session.SharedSpaceWebSession$load$2$1$1 r11 = new com.facebook.aura.webview.session.SharedSpaceWebSession$load$2$1$1     // Catch: java.lang.Throwable -> Lad
                r18 = r6
                r17 = r4
                r16 = r0
                r11.<init>()     // Catch: java.lang.Throwable -> Lad
                r7.setWebViewClient(r11)     // Catch: java.lang.Throwable -> Lad
                java.lang.String r11 = "web_callback_load"
                r0 = 0
                com.facebook.aura.webview.session.SharedSpaceWebSession.event$default(r12, r11, r0, r8, r0)     // Catch: java.lang.Throwable -> Lad
                r7.loadUrl(r10, r6)     // Catch: java.lang.Throwable -> Lad
                java.lang.Object r0 = r14.A0F()     // Catch: java.lang.Throwable -> Lad
                if (r0 != r9) goto L91
                return r9
            L91:
                boolean r0 = r4.element
                if (r0 != 0) goto L9a
                android.webkit.WebView r0 = r5.$webView
                r0.stopLoading()
            L9a:
                android.webkit.WebView r0 = r5.$webView
                r0.setWebViewClient(r1)
                com.facebook.aura.webview.session.SharedSpaceWebSession r1 = com.facebook.aura.webview.session.SharedSpaceWebSession.this
                boolean r0 = r4.element
                java.lang.String r0 = X.FGI.A0r(r3, r0)
                com.facebook.aura.webview.session.SharedSpaceWebSession.access$event(r1, r2, r0)
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            Lad:
                r6 = move-exception
                boolean r0 = r4.element
                if (r0 != 0) goto Lb7
                android.webkit.WebView r0 = r5.$webView
                r0.stopLoading()
            Lb7:
                android.webkit.WebView r0 = r5.$webView
                r0.setWebViewClient(r1)
                com.facebook.aura.webview.session.SharedSpaceWebSession r1 = com.facebook.aura.webview.session.SharedSpaceWebSession.this
                boolean r0 = r4.element
                java.lang.String r0 = X.FGI.A0r(r3, r0)
                com.facebook.aura.webview.session.SharedSpaceWebSession.access$event(r1, r2, r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.session.SharedSpaceWebSession.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.webview.session.SharedSpaceWebSession", f = "SharedSpaceWebSession.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS, 400}, m = "provision", v = 2)
    /* renamed from: com.facebook.aura.webview.session.SharedSpaceWebSession$provision$1, reason: invalid class name and case insensitive filesystem */
    public final class C143651 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C143651(HtJ<? super C143651> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSpaceWebSession.this.provision(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.webview.session.SharedSpaceWebSession$provision$2", f = "SharedSpaceWebSession.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.webview.session.SharedSpaceWebSession$provision$2, reason: invalid class name and case insensitive filesystem */
    public final class C143662 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HwV<? extends String, ? extends String, ? extends List<? extends HttpCookie>>>, Object> {
        public final /* synthetic */ String $destination;
        public final /* synthetic */ String $userAgent;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.webview.session.SharedSpaceWebSession$provision$2$1", f = "SharedSpaceWebSession.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.webview.session.SharedSpaceWebSession$provision$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HwV<? extends String, ? extends String, ? extends List<? extends HttpCookie>>>, Object> {
            public final /* synthetic */ String $destination;
            public final /* synthetic */ String $userAgent;
            public int label;
            public final /* synthetic */ SharedSpaceWebSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SharedSpaceWebSession sharedSpaceWebSession, String str, String str2, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = sharedSpaceWebSession;
                this.$destination = str;
                this.$userAgent = str2;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$destination, this.$userAgent, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    SharedSpaceWebSession sharedSpaceWebSession = this.this$0;
                    String str = this.$destination;
                    String str2 = this.$userAgent;
                    this.label = 1;
                    obj = sharedSpaceWebSession.exchange(str, str2, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                return obj;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HtJ<? super HwV<String, String, ? extends List<HttpCookie>>> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HwV<? extends String, ? extends String, ? extends List<? extends HttpCookie>>> htJ) {
                return invoke2((HtJ<? super HwV<String, String, ? extends List<HttpCookie>>>) htJ);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143662(String str, String str2, HtJ<? super C143662> htJ) {
            super(2, htJ);
            this.$destination = str;
            this.$userAgent = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedSpaceWebSession.this.new C143662(this.$destination, this.$userAgent, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SharedSpaceWebSession sharedSpaceWebSession = SharedSpaceWebSession.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(sharedSpaceWebSession, this.$destination, this.$userAgent, null);
                this.label = 1;
                obj = sharedSpaceWebSession.traced(anonymousClass1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HwV<String, String, ? extends List<HttpCookie>>> htJ) {
            return ((C143662) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HwV<? extends String, ? extends String, ? extends List<? extends HttpCookie>>> htJ) {
            return invoke2(c3ux, (HtJ<? super HwV<String, String, ? extends List<HttpCookie>>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.webview.session.SharedSpaceWebSession", f = "SharedSpaceWebSession.kt", l = {331}, m = "send", v = 2)
    /* renamed from: com.facebook.aura.webview.session.SharedSpaceWebSession$send$1, reason: invalid class name and case insensitive filesystem */
    public final class C143671 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C143671(HtJ<? super C143671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSpaceWebSession.this.send(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.webview.session.SharedSpaceWebSession", f = "SharedSpaceWebSession.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "traced", v = 2)
    /* renamed from: com.facebook.aura.webview.session.SharedSpaceWebSession$traced$1, reason: invalid class name and case insensitive filesystem */
    public final class C143681<T> extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C143681(HtJ<? super C143681> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSpaceWebSession.this.traced(null, this);
        }
    }

    public SharedSpaceWebSession(AbstractC3358CGz abstractC3358CGz, int i) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.session = abstractC3358CGz;
        this.viewId = i;
        this.exchangeId = System.identityHashCode(this);
        this.stage = "created";
    }

    private final List<HttpCookie> cookies(HatchHttpResponse hatchHttpResponse) {
        String strHeader = hatchHttpResponse.header("Set-Cookie");
        if (strHeader == null) {
            strHeader = "";
        }
        List listA05 = C06827l3.A02(",(?=\\s*[^;,=\\s]+=)|\\n").A05(strHeader);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA05) {
            AnonymousClass006.A1F((String) obj, obj, arrayListA0h);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            List<HttpCookie> list = HttpCookie.parse(AnonymousClass005.A0j(it));
            C7384Etj.A0U(list);
            AbstractC0882AGj.A0r(list, arrayListA0h2);
        }
        return arrayListA0h2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void event(String str, String str2) {
        this.stage = str;
        int i = this.viewId;
        int i2 = this.exchangeId;
        StringBuilder sbA0y = C60O.A0y("view=", i);
        sbA0y.append(" exchange=");
        sbA0y.append(i2);
        sbA0y.append(" stage=");
        sbA0y.append(str);
        CFK.A05("SavedSpaceViewer", C60P.A1M(InviteCodeScratcherKt.CODE_SEPARATOR, str2, sbA0y));
    }

    public static /* synthetic */ void event$default(SharedSpaceWebSession sharedSpaceWebSession, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        sharedSpaceWebSession.event(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0296 A[LOOP:1: B:69:0x0290->B:71:0x0296, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object exchange(java.lang.String r38, java.lang.String r39, X.HtJ<? super X.HwV<java.lang.String, java.lang.String, ? extends java.util.List<java.net.HttpCookie>>> r40) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.session.SharedSpaceWebSession.exchange(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(java.lang.String r26, java.lang.String r27, java.lang.String r28, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r29) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.session.SharedSpaceWebSession.send(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0066: ARITH (r2 I:long) = (r2v2 ?? I:long) - (r4 I:long) (LINE:102), block:B:25:0x0056 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object traced(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r12, X.HtJ<? super T> r13) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.webview.session.SharedSpaceWebSession.C143681
            if (r0 == 0) goto L20
            r6 = r13
            com.facebook.aura.webview.session.SharedSpaceWebSession$traced$1 r6 = (com.facebook.aura.webview.session.SharedSpaceWebSession.C143681) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r3 = r6.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L2a
            long r4 = r6.J$0
            goto L26
        L20:
            com.facebook.aura.webview.session.SharedSpaceWebSession$traced$1 r6 = new com.facebook.aura.webview.session.SharedSpaceWebSession$traced$1
            r6.<init>(r13)
            goto L12
        L26:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L45
            return r3
        L2a:
            java.lang.IllegalStateException r10 = X.AnonymousClass001.A0n()
            throw r10
        L2f:
            X.Hwg.A00(r3)
            long r4 = java.lang.System.nanoTime()
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Exception -> L45
            r6.J$0 = r4     // Catch: java.lang.Exception -> L45
            r6.label = r1     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r12.invoke(r6)     // Catch: java.lang.Exception -> L45
            if (r3 != r2) goto L44
            return r2
        L44:
            return r3
        L45:
            r10 = move-exception
            java.lang.StackTraceElement[] r3 = r10.getStackTrace()
            X.C7384Etj.A0U(r3)
            r2 = 6
            r1 = 0
            int r0 = r3.length
            if (r2 < r0) goto Laa
            java.util.List r0 = X.BFI.A0G(r3)
        L56:
            java.lang.String r1 = " <- "
            java.lang.String r6 = X.C3cH.A0e(r1, r0)
            int r9 = r11.viewId
            int r8 = r11.exchangeId
            java.lang.String r7 = r11.stage
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r0
            java.lang.String r5 = X.C3cI.A0Y(r10)
            java.lang.Throwable r0 = r10.getCause()
            if (r0 == 0) goto La8
            java.lang.String r4 = X.C3cI.A0Y(r0)
        L79:
            java.lang.String r0 = "view="
            java.lang.StringBuilder r1 = X.C60O.A0y(r0, r9)
            java.lang.String r0 = " exchange="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " event=exchange_failed stage="
            X.C60R.A1K(r0, r7, r1, r2)
            java.lang.String r0 = " errorType="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " causeType="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " frames="
            java.lang.String r1 = X.C60P.A1M(r0, r6, r1)
            java.lang.String r0 = "SavedSpaceViewer"
            X.CFK.A06(r0, r1)
            throw r10
        La8:
            r4 = 0
            goto L79
        Laa:
            java.lang.Object[] r0 = X.AbstractC0903AHf.A08(r3, r1, r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.session.SharedSpaceWebSession.traced(X.G0U, X.HtJ):java.lang.Object");
    }

    public final void checkAccount() {
        if (C7384Etj.areEqual(AuraAuthHeaders.INSTANCE.currentUserIdForCache(), ((CH0) this.session).A01)) {
            return;
        }
        event("account_mismatch", "");
        throw C3cG.A0Q("Check failed.");
    }

    public final Object load(WebView webView, CookieManager cookieManager, String str, String str2, Map<String, String> map, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AuraDispatchers.mainImmediate, new AnonymousClass2(str, str2, cookieManager, webView, map, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e0 -> B:12:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object provision(java.lang.String r15, java.lang.String r16, android.webkit.CookieManager r17, X.HtJ<? super java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.session.SharedSpaceWebSession.provision(java.lang.String, java.lang.String, android.webkit.CookieManager, X.HtJ):java.lang.Object");
    }

    public /* synthetic */ SharedSpaceWebSession(AbstractC3358CGz abstractC3358CGz, int i, int i2, C06H c06h) {
        this(abstractC3358CGz, C3cG.A01(i2, i));
    }
}
