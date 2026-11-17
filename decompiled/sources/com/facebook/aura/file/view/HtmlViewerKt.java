package com.facebook.aura.file.view;

import X.ADq;
import X.AHD;
import X.AHI;
import X.AKQ;
import X.ATD;
import X.AbstractC05081Yo;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC1754Apr;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AbstractC9245GAx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BNt;
import X.BO6;
import X.BRg;
import X.C00x;
import X.C01r;
import X.C0v5;
import X.C0z7;
import X.C10571Hud;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C3UX;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6ys;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7LE;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.F60;
import X.FGI;
import X.FKC;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.invite.InviteUpsellHandlerKt;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.file.view.FileContentType;
import com.facebook.aura.file.view.FileLoadingState;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.webview.HatchWebViewKt;
import com.facebook.aura.webview.WebContent;
import com.facebook.aura.webview.WebViewKeyboardKt;
import com.facebook.aura.webview.WebViewState;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import com.facebook.common.dextricks.RuntimeInternals;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes3.dex */
public abstract class HtmlViewerKt {
    public static final String CONSOLE_TAG = "HtmlViewerConsole";
    public static final String HATCH_HTML_ASSET_SCHEME = "hatch-asset";
    public static final long HTML_ASSET_FETCH_TIMEOUT_MS = 10000;
    public static final long HTML_ASSET_FETCH_TIMEOUT_SECONDS = 10;
    public static final String TAG = "HtmlViewer";
    public static final long WINDOW_OPEN_RELEASE_TIMEOUT_MS = 10000;
    public static final Set<String> HTML_ASSET_ATTR_NAMES = C60O.A1A(InviteUpsellHandlerKt.SRC_PARAM, "poster", "href");
    public static final Set<String> HTML_RAW_TEXT_TAGS = C60O.A19("script", "style");

    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$HtmlPagerContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $baseUrl;
        public final /* synthetic */ BO6<Integer, String> $htmlCache;
        public final /* synthetic */ boolean $isFirstPageLoading;
        public final /* synthetic */ boolean $isSlideMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onTopColorDetected;
        public final /* synthetic */ AHD<String> $pageSourcePaths;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ String $sourcePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BO6<Integer, String> bo6, PagerState pagerState, boolean z, BRg bRg, boolean z2, String str, String str2, AHD<String> ahd, G0U<? super Integer, Unit> g0u, int i, int i2) {
            super(2);
            this.$htmlCache = bo6;
            this.$pagerState = pagerState;
            this.$isFirstPageLoading = z;
            this.$modifier = bRg;
            this.$isSlideMode = z2;
            this.$baseUrl = str;
            this.$sourcePath = str2;
            this.$pageSourcePaths = ahd;
            this.$onTopColorDetected = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlViewerKt.HtmlPagerContent(this.$htmlCache, this.$pagerState, this.$isFirstPageLoading, this.$modifier, this.$isSlideMode, this.$baseUrl, this.$sourcePath, this.$pageSourcePaths, this.$onTopColorDetected, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$HtmlPagerContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $baseUrl;
        public final /* synthetic */ BO6<Integer, String> $htmlCache;
        public final /* synthetic */ boolean $isFirstPageLoading;
        public final /* synthetic */ boolean $isSlideMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onTopColorDetected;
        public final /* synthetic */ AHD<String> $pageSourcePaths;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ String $sourcePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BO6<Integer, String> bo6, PagerState pagerState, boolean z, BRg bRg, boolean z2, String str, String str2, AHD<String> ahd, G0U<? super Integer, Unit> g0u, int i, int i2) {
            super(2);
            this.$htmlCache = bo6;
            this.$pagerState = pagerState;
            this.$isFirstPageLoading = z;
            this.$modifier = bRg;
            this.$isSlideMode = z2;
            this.$baseUrl = str;
            this.$sourcePath = str2;
            this.$pageSourcePaths = ahd;
            this.$onTopColorDetected = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlViewerKt.HtmlPagerContent(this.$htmlCache, this.$pagerState, this.$isFirstPageLoading, this.$modifier, this.$isSlideMode, this.$baseUrl, this.$sourcePath, this.$pageSourcePaths, this.$onTopColorDetected, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$HtmlPagerContent$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C01r, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ BO6<Integer, String> $htmlCache;
        public final /* synthetic */ boolean $isSlideMode;
        public final /* synthetic */ AHD<String> $pageSourcePaths;
        public final /* synthetic */ String $sourcePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BO6<Integer, String> bo6, boolean z, AHD<String> ahd, String str) {
            super(4);
            this.$htmlCache = bo6;
            this.$isSlideMode = z;
            this.$pageSourcePaths = ahd;
            this.$sourcePath = str;
        }

        public final void invoke(C01r c01r, int i, BFM bfm, int i2) {
            int iA0E = (i2 & 48) == 0 ? AnonymousClass004.A0E(bfm, i) | i2 : i2;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
                bfm.Afo();
                return;
            }
            BO6<Integer, String> bo6 = this.$htmlCache;
            Object objValueOf = Integer.valueOf(i);
            String str = bo6.get(objValueOf);
            if (str != null) {
                bfm.AgE(2114563411);
                bfm.Ag8(206759297, bfm.APR(objValueOf, str));
                C1062ATq c1062ATq = C10G.A01;
                boolean z = this.$isSlideMode;
                String str2 = (String) AbstractC0878AGe.A0A(i, this.$pageSourcePaths);
                if (str2 == null) {
                    str2 = this.$sourcePath;
                }
                HtmlViewerKt.HtmlWebView(str, c1062ATq, z, null, str2, null, bfm, 48, 40);
                AnonymousClass002.A19(bfm);
            } else {
                bfm.AgE(2114814356);
                HtmlViewerKt.HtmlSpinner(C10G.A01, bfm, 6, 0);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C01r c01r, Integer num, BFM bfm, Integer num2) {
            invoke(c01r, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$HtmlPagerContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $baseUrl;
        public final /* synthetic */ BO6<Integer, String> $htmlCache;
        public final /* synthetic */ boolean $isFirstPageLoading;
        public final /* synthetic */ boolean $isSlideMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onTopColorDetected;
        public final /* synthetic */ AHD<String> $pageSourcePaths;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ String $sourcePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(BO6<Integer, String> bo6, PagerState pagerState, boolean z, BRg bRg, boolean z2, String str, String str2, AHD<String> ahd, G0U<? super Integer, Unit> g0u, int i, int i2) {
            super(2);
            this.$htmlCache = bo6;
            this.$pagerState = pagerState;
            this.$isFirstPageLoading = z;
            this.$modifier = bRg;
            this.$isSlideMode = z2;
            this.$baseUrl = str;
            this.$sourcePath = str2;
            this.$pageSourcePaths = ahd;
            this.$onTopColorDetected = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlViewerKt.HtmlPagerContent(this.$htmlCache, this.$pagerState, this.$isFirstPageLoading, this.$modifier, this.$isSlideMode, this.$baseUrl, this.$sourcePath, this.$pageSourcePaths, this.$onTopColorDetected, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$HtmlSlidePreviewWebView$2, reason: invalid class name and case insensitive filesystem */
    public final class C119682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $html;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119682(String str, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$html = str;
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlViewerKt.HtmlSlidePreviewWebView(this.$html, this.$modifier, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$HtmlSpinner$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C119692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119692(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlViewerKt.HtmlSpinner(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$HtmlWebView$3, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C119703 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $baseUrl;
        public final /* synthetic */ String $html;
        public final /* synthetic */ boolean $isSlideMode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onTopColorDetected;
        public final /* synthetic */ String $sourcePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119703(String str, BRg bRg, boolean z, String str2, String str3, G0U<? super Integer, Unit> g0u, int i, int i2) {
            super(2);
            this.$html = str;
            this.$modifier = bRg;
            this.$isSlideMode = z;
            this.$baseUrl = str2;
            this.$sourcePath = str3;
            this.$onTopColorDetected = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HtmlViewerKt.HtmlWebView(this.$html, this.$modifier, this.$isSlideMode, this.$baseUrl, this.$sourcePath, this.$onTopColorDetected, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlViewerKt$loadFirstHtmlSlide$2", f = "HtmlViewer.kt", l = {974, 979}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$loadFirstHtmlSlide$2, reason: invalid class name and case insensitive filesystem */
    public final class C119712 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $slideDeckPath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119712(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super C119712> htJ) {
            super(2, htJ);
            this.$slideDeckPath = str;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C119712(this.$slideDeckPath, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    List<String> listMakePathCandidates = HtmlViewerKt.makePathCandidates(FGI.A0M(C7BY.A0Z(this.$slideDeckPath, '/'), "/slides.json"));
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    this.L$0 = null;
                    this.label = 1;
                    obj = HtmlViewerKt.readFirstAvailable(listMakePathCandidates, abstractC3358CGz, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        return (String) obj;
                    }
                    Hwg.A00(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    C9sU c9sU = HatchJsonKt.HatchJson;
                    F0C<C9hr<Object>>[] f0cArr = SlidesManifestJson.$childSerializers;
                    SlideManifestEntryJson slideManifestEntryJson = (SlideManifestEntryJson) AbstractC0878AGe.A0G(((SlidesManifestJson) c9sU.A00(str, SlidesManifestJson$$serializer.INSTANCE)).slides);
                    if (slideManifestEntryJson != null) {
                        List<String> listMakePathCandidates2 = HtmlViewerKt.makePathCandidates(slideManifestEntryJson.absolute_path);
                        AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 2;
                        obj = HtmlViewerKt.readFirstAvailable(listMakePathCandidates2, abstractC3358CGz2, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                        return (String) obj;
                    }
                }
                return null;
            } catch (Exception e) {
                CFK.A06(HtmlViewerKt.TAG, FGI.A0M("Failed to load first slide preview: ", e.getMessage()));
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C119712) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlViewerKt$loadHtmlSlideDeckManifest$2", f = "HtmlViewer.kt", l = {904}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$loadHtmlSlideDeckManifest$2, reason: invalid class name and case insensitive filesystem */
    public final class C119722 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super FileLoadingState>, Object> {
        public final /* synthetic */ String $fallbackTitle;
        public final /* synthetic */ String $slideDeckPath;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119722(String str, AbstractC3358CGz abstractC3358CGz, String str2, HtJ<? super C119722> htJ) {
            super(2, htJ);
            this.$slideDeckPath = str;
            this.$userSession = abstractC3358CGz;
            this.$fallbackTitle = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C119722(this.$slideDeckPath, this.$userSession, this.$fallbackTitle, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA0M;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            int i2 = 0;
            if (i == 0) {
                Hwg.A00(obj);
                strA0M = FGI.A0M(C7BY.A0Z(this.$slideDeckPath, '/'), "/slides.json");
                List<String> listMakePathCandidates = HtmlViewerKt.makePathCandidates(strA0M);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = strA0M;
                this.label = 1;
                obj = HtmlViewerKt.readFirstAvailable(listMakePathCandidates, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                strA0M = C3cG.A0d(this.L$0, obj);
            }
            String str = (String) obj;
            if (str == null) {
                C3cG.A1G("Failed to load slides.json from path candidates for: ", strA0M, HtmlViewerKt.TAG);
                HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.WORKSPACE_SLIDES, HatchHtmlErrorCode.MANIFEST_MISSING, strA0M, null, null, null);
                return new FileLoadingState.Error("Failed to load presentation");
            }
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                F0C<C9hr<Object>>[] f0cArr = SlidesManifestJson.$childSerializers;
                SlidesManifestJson slidesManifestJson = (SlidesManifestJson) c9sU.A00(str, SlidesManifestJson$$serializer.INSTANCE);
                String str2 = slidesManifestJson.main_title;
                String str3 = this.$fallbackTitle;
                if (str2.length() == 0) {
                    str2 = str3;
                }
                List<SlideManifestEntryJson> list = slidesManifestJson.slides;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (SlideManifestEntryJson slideManifestEntryJson : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    SlideManifestEntryJson slideManifestEntryJson2 = slideManifestEntryJson;
                    String strA0H = slideManifestEntryJson2.id;
                    if (strA0H.length() == 0) {
                        strA0H = FGI.A0H("slide_", i2);
                    }
                    arrayListA0i.add(new SlideInfo(strA0H, slideManifestEntryJson2.page_title, slideManifestEntryJson2.absolute_path));
                    i2 = i3;
                }
                if (!arrayListA0i.isEmpty()) {
                    arrayListA0i.size();
                    return new FileLoadingState.Success(new FileContentType.Slides(str2, arrayListA0i, true));
                }
                CFK.A06(HtmlViewerKt.TAG, "slides.json parsed but contains no slides");
                HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.WORKSPACE_SLIDES, HatchHtmlErrorCode.CONTENT_EMPTY, strA0M, null, null, null);
                return new FileLoadingState.Error("Presentation has no slides");
            } catch (Exception e) {
                C3cH.A1B("Failed to parse slides.json: ", e.getMessage(), HtmlViewerKt.TAG, e);
                HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.WORKSPACE_SLIDES, HatchHtmlErrorCode.MANIFEST_PARSE_FAILED, strA0M, e, null, null);
                return new FileLoadingState.Error("Failed to load presentation");
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super FileLoadingState> htJ) {
            return ((C119722) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlViewerKt", f = "HtmlViewer.kt", l = {964}, m = "readFirstAvailable", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlViewerKt$readFirstAvailable$1, reason: invalid class name and case insensitive filesystem */
    public final class C119731 extends HzP {
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
            return HtmlViewerKt.readFirstAvailable(null, null, this);
        }

        public C119731(HtJ<? super C119731> htJ) {
            super(htJ);
        }
    }

    public static final void configureHtmlSlideWebView(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setInitialScale(0);
        webView.setBackgroundColor(0);
    }

    public static final int findHtmlDoctypeEnd(String str) {
        int iFindHtmlTagEnd;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!C7LE.A01(str, i)) {
                if (i == -1 || !str.regionMatches(true, i, "<!doctype", 0, 9) || (iFindHtmlTagEnd = findHtmlTagEnd(str, i)) == -1) {
                    return -1;
                }
                return iFindHtmlTagEnd + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int findHtmlStartTagEnd(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
        L1:
            int r4 = r5.length()
            r3 = -1
            if (r0 >= r4) goto L59
            r1 = 60
            r2 = 0
            int r1 = X.C7BY.A08(r5, r1, r0)
            if (r1 == r3) goto L59
            java.lang.String r0 = "<!--"
            boolean r0 = r5.startsWith(r0, r1)
            if (r0 == 0) goto L27
            int r1 = r1 + 4
            java.lang.String r0 = "-->"
            int r1 = X.C7BY.A0B(r5, r0, r1, r2)
            int r0 = r1 + 3
            if (r1 != r3) goto L1
            r0 = r4
            goto L1
        L27:
            boolean r0 = isHtmlStartTag(r5, r1)
            if (r0 != 0) goto L30
            int r0 = r1 + 1
            goto L1
        L30:
            int r2 = findHtmlTagEnd(r5, r1)
            if (r2 == r3) goto L59
            int r0 = r1 + 1
            java.lang.String r1 = htmlTagName(r5, r0)
            boolean r0 = X.C7384Etj.areEqual(r1, r6)
            if (r0 == 0) goto L45
            int r3 = r2 + 1
            return r3
        L45:
            java.util.Set<java.lang.String> r0 = com.facebook.aura.file.view.HtmlViewerKt.HTML_RAW_TEXT_TAGS
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
            int r0 = r2 + 1
            int r0 = findRawTextElementEnd(r5, r0, r1)
            if (r0 != r3) goto L1
            return r3
        L56:
            int r0 = r2 + 1
            goto L1
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HtmlViewerKt.findHtmlStartTagEnd(java.lang.String, java.lang.String):int");
    }

    public static final String hatchHtmlAssetPath(Uri uri) {
        String encodedPath;
        String strA0K;
        C7384Etj.A0Y(uri, 0);
        if (!HATCH_HTML_ASSET_SCHEME.equals(uri.getScheme()) || (encodedPath = uri.getEncodedPath()) == null || (strA0K = C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, encodedPath)) == null) {
            return null;
        }
        return WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(strA0K, null);
    }

    public static final String htmlTagName(String str, int i) {
        int i2 = i;
        while (i2 < str.length() && isHtmlTagNameChar(str.charAt(i2))) {
            i2++;
        }
        return AnonymousClass001.A0u(str.substring(i, i2));
    }

    public static final List<String> makePathCandidates(String str) {
        C7384Etj.A0Y(str, 0);
        List listA0i = C7BY.A0i(C7BY.A0Z(C7BY.A0a(str, '/'), '/'), new String[]{CustomConnectorRegisterRepositoryKt.ROOT_PATH}, 0);
        ADq aDqA0C = ATD.A0C(0, listA0i.size());
        ArrayList arrayListA0i = AnonymousClass003.A0i(aDqA0C);
        Iterator<Integer> it = aDqA0C.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(AbstractC06907md.A01(CustomConnectorRegisterRepositoryKt.ROOT_PATH, listA0i.subList(((BNt) it).A00(), listA0i.size()), null));
        }
        return C3cG.A0m(arrayListA0i);
    }

    public static final String rewriteHtmlAssetPaths(String str, String str2) {
        int i;
        C7384Etj.A0Y(str, 0);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int iFindRawTextElementEnd = 0;
        while (true) {
            if (iFindRawTextElementEnd >= length) {
                break;
            }
            int iA08 = C7BY.A08(str, '<', iFindRawTextElementEnd);
            if (iA08 == -1) {
                sb.append((CharSequence) str, iFindRawTextElementEnd, length);
                break;
            }
            sb.append((CharSequence) str, iFindRawTextElementEnd, iA08);
            if (str.startsWith("<!--", iA08)) {
                int iA0B = C7BY.A0B(str, "-->", iA08 + 4, false);
                i = iA0B + 3;
                if (iA0B == -1) {
                    i = length;
                }
                sb.append((CharSequence) str, iA08, i);
            } else if (isHtmlStartTag(str, iA08)) {
                int iFindHtmlTagEnd = findHtmlTagEnd(str, iA08);
                if (iFindHtmlTagEnd == -1) {
                    sb.append((CharSequence) str, iA08, length);
                    break;
                }
                String strHtmlTagName = htmlTagName(str, iA08 + 1);
                i = iFindHtmlTagEnd + 1;
                sb.append(rewriteHtmlStartTagAssetPaths(str.substring(iA08, i), str2));
                if (HTML_RAW_TEXT_TAGS.contains(strHtmlTagName)) {
                    iFindRawTextElementEnd = findRawTextElementEnd(str, i, strHtmlTagName);
                    if (iFindRawTextElementEnd == -1) {
                        sb.append((CharSequence) str, i, length);
                        break;
                    }
                    sb.append((CharSequence) str, i, iFindRawTextElementEnd);
                }
            } else {
                sb.append('<');
                iFindRawTextElementEnd = iA08 + 1;
            }
            iFindRawTextElementEnd = i;
        }
        return sb.toString();
    }

    public static final void HtmlPagerContent(BO6<Integer, String> bo6, PagerState pagerState, boolean z, BRg bRg, boolean z2, String str, String str2, AHD<String> ahd, G0U<? super Integer, Unit> g0u, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        BRg bRg2 = bRg;
        String str3 = str;
        String str4 = str2;
        G0U<? super Integer, Unit> g0u2 = g0u;
        boolean zA1Q = z2;
        AHD<String> ahd2 = ahd;
        C7384Etj.A0Y(bo6, 0);
        bfm.AgG(975223537);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bo6) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, pagerState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1Q);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str3);
            iA0d |= iA0i;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str4);
            iA0d |= iA0j;
        }
        int i7 = i2 & 128;
        int iA0k = 12582912;
        if (i7 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            i7 = 0;
            iA0k = AnonymousClass004.A0k(bfm, ahd2);
            iA0d |= iA0k;
        }
        int i8 = i2 & 256;
        int iA0b = 100663296;
        if (i8 != 0) {
            iA0d |= iA0b;
        } else if ((i & 100663296) == 0) {
            i8 = 0;
            iA0b = AnonymousClass004.A0b(bfm, g0u2);
            iA0d |= iA0b;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 38347923, 38347922), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                str4 = null;
            }
            if (i7 != 0) {
                ahd2 = AHI.A01;
            }
            if (i8 != 0) {
                g0u2 = null;
            }
            float fA00 = C60Q.A00(bfm);
            if (pagerState == null || (z && bo6.isEmpty())) {
                bfm.AgE(1726094455);
                HtmlSpinner(C10G.A04(AnonymousClass001.A0R(bRg2), fA00), bfm, 0, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass4 = new AnonymousClass1(bo6, pagerState, z, bRg2, zA1Q, str3, str4, ahd2, g0u2, i, i2);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 1726180945);
                if (zA1Q) {
                    bfm.AgE(1726704721);
                    BBI.A0R(bbiA0M, false);
                    AbstractC05081Yo.A00(null, null, null, null, null, pagerState, bfm, null, C10G.A04(AnonymousClass001.A0R(bRg2), fA00), null, null, B1V.A00(bfm, new AnonymousClass3(bo6, zA1Q, ahd2, str4), 978985010), 0.0f, 1, ((iA0d >> 3) & 14) | RuntimeInternals.IOPRIO_BACKGROUND, RuntimeInternals.IOPRIO_BACKGROUND, 16364, false, false);
                } else {
                    bfm.AgE(1726218455);
                    String strA0p = C60O.A0p(0, bo6);
                    if (strA0p != null) {
                        bfm.AgE(1726412887);
                        int i9 = iA0d >> 6;
                        HtmlWebView(strA0p, WebViewKeyboardKt.m3153retainKeyboardAnimationSizeziNgDLE(AbstractC1754Apr.A00(AnonymousClass001.A0R(bRg2)), 0.0f, bfm, 48), false, str3, str4, g0u2, bfm, AnonymousClass001.A08(iA0d >> 9, (i9 & 57344) | (i9 & 7168) | 384), 0);
                        BBI.A0R(bbiA0M, false);
                    } else {
                        bfm.AgE(1726689841);
                        BBI.A0R(bbiA0M, false);
                    }
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass4 = new AnonymousClass2(bo6, pagerState, z, bRg2, zA1Q, str3, str4, ahd2, g0u2, i, i2);
                    }
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(bo6, pagerState, z, bRg2, zA1Q, str3, str4, ahd2, g0u2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final void HtmlSlidePreviewWebView(String str, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(1826884595);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C11U.A01(BJe.A00(AnonymousClass001.A0R(bRg2), 1.5f, false), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (str != null) {
                bfm.AgE(-860271397);
                boolean zA1B = AnonymousClass003.A1B(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1B || objAaT == C78N.A00) {
                    objAaT = new WebViewState(new WebContent.Data(str, null, "utf-8", "text/html", null));
                    bfm.Ai0(objAaT);
                }
                WebViewState webViewState = (WebViewState) objAaT;
                C1062ATq c1062ATq = C10G.A01;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = HtmlViewerKt$HtmlSlidePreviewWebView$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                HatchWebViewKt.WebView(webViewState, c1062ATq, false, true, false, null, (G0U) ((InterfaceC7353EnQ) objAaT2), null, false, null, null, null, bfm, 1575984, 0, 4020);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-859943634);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                BBI.A0R(bbi, false);
            }
            C3Ue.A04(C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass005.A0d(bfm), c0z7.AQJ(BRg.A00), null, null, function0, true), bfm, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119682(str, bRg2, function0, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HtmlWebView(java.lang.String r34, X.BRg r35, boolean r36, java.lang.String r37, java.lang.String r38, X.G0U<? super java.lang.Integer, kotlin.Unit> r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HtmlViewerKt.HtmlWebView(java.lang.String, X.BRg, boolean, java.lang.String, java.lang.String, X.G0U, X.BFM, int, int):void");
    }

    public static final void appendRewrittenHtmlAssetValue(StringBuilder sb, String str, String str2, String str3) {
        String strNormalizeWorkspacePath;
        if (HTML_ASSET_ATTR_NAMES.contains(AnonymousClass001.A0u(str)) && (strNormalizeWorkspacePath = WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(str2, str3)) != null) {
            str2 = FGI.A0M("hatch-asset:///", AbstractC06907md.A01(CustomConnectorRegisterRepositoryKt.ROOT_PATH, C7BY.A0e(strNormalizeWorkspacePath, CustomConnectorRegisterRepositoryKt.ROOT_PATH), HtmlViewerKt$appendRewrittenHtmlAssetValue$encodedPath$1.INSTANCE));
        }
        sb.append(str2);
    }

    public static final WebResourceResponse fetchHtmlAsset(String str, AbstractC3358CGz abstractC3358CGz, HatchHtmlRenderTrace hatchHtmlRenderTrace) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        try {
            InputStream inputStream = (InputStream) AbstractC9245GAx.A00(C6ys.A00, new HtmlViewerKt$fetchHtmlAsset$body$1(str, abstractC3358CGz, null));
            if (inputStream != null) {
                return new WebResourceResponse(HatchMimeResolver.INSTANCE.mimeForName(str), null, inputStream);
            }
            if (hatchHtmlRenderTrace != null) {
                hatchHtmlRenderTrace.resourceError(HatchHtmlErrorCode.ASSET_FETCH_FAILED, str, null, null);
            }
            return null;
        } catch (TimeoutCancellationException e) {
            C3cG.A1G("Timed out loading HTML asset ", str, TAG);
            if (hatchHtmlRenderTrace != null) {
                hatchHtmlRenderTrace.resourceError(HatchHtmlErrorCode.ASSET_FETCH_TIMEOUT, str, e, null);
            }
            return null;
        } catch (Exception e2) {
            CFK.A0A(TAG, C60P.A1L("Failed to load HTML asset ", str, e2.getMessage()), e2);
            if (hatchHtmlRenderTrace != null) {
                hatchHtmlRenderTrace.resourceError(HatchHtmlErrorCode.ASSET_FETCH_FAILED, str, e2, null);
                return null;
            }
            return null;
        }
    }

    public static /* synthetic */ WebResourceResponse fetchHtmlAsset$default(String str, AbstractC3358CGz abstractC3358CGz, HatchHtmlRenderTrace hatchHtmlRenderTrace, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchHtmlRenderTrace = null;
        }
        return fetchHtmlAsset(str, abstractC3358CGz, hatchHtmlRenderTrace);
    }

    public static final int findHtmlTagEnd(String str, int i) {
        Character chValueOf = null;
        for (int i2 = i + 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (chValueOf != null) {
                if (cCharAt == chValueOf.charValue()) {
                    chValueOf = null;
                }
            } else if (cCharAt == '\"' || cCharAt == '\'') {
                chValueOf = Character.valueOf(cCharAt);
            } else if (cCharAt == '>') {
                return i2;
            }
        }
        return -1;
    }

    public static final int findRawTextElementEnd(String str, int i, String str2) {
        int iA08;
        int iA0B = C7BY.A0B(str, FGI.A0M("</", str2), i, true);
        if (iA0B == -1 || (iA08 = C7BY.A08(str, '>', iA0B)) == -1) {
            return -1;
        }
        return iA08 + 1;
    }

    public static final String guessHtmlAssetMimeType(String str) {
        return HatchMimeResolver.INSTANCE.mimeForName(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[PHI: r3
  0x003c: PHI (r3v2 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v3 java.lang.Integer) binds: [B:6:0x001a, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String injectHatchHtmlHostBridgeScript(java.lang.String r5) {
        /*
            java.lang.String r2 = "(function() {\n  if (window.__hatchHostBridgeInstalled) return;\n  window.__hatchHostBridgeInstalled = true;\n\n  var pendingEvents = [];\n  var maxPendingEvents = 32;\n\n  function rootNativeBridge() {\n    return window.NativeBridge;\n  }\n\n  function bridgeToken() {\n    return typeof window.__fbAndroidBridgeAuthToken === 'string'\n      ? window.__fbAndroidBridgeAuthToken\n      : '';\n  }\n\n  function plainObject(value) {\n    if (value == null) return {};\n    if (!value || typeof value !== 'object' || Array.isArray(value)) return {};\n    try {\n      var copy = JSON.parse(JSON.stringify(value));\n      return copy && typeof copy === 'object' && !Array.isArray(copy) ? copy : {};\n    } catch (e) {\n      return {};\n    }\n  }\n\n  function postNow(event) {\n    var bridge = rootNativeBridge();\n    var token = bridgeToken();\n    if (!bridge || !bridge.postHatchUrlEvent || !token) return false;\n    try {\n      bridge.postHatchUrlEvent(token, JSON.stringify(event));\n      return true;\n    } catch (e) {\n      return false;\n    }\n  }\n\n  function flushPendingEvents() {\n    if (!pendingEvents.length) return;\n    var events = pendingEvents;\n    pendingEvents = [];\n    for (var i = 0; i < events.length; i++) {\n      if (!postNow(events[i])) {\n        enqueuePendingEvent(events[i]);\n      }\n    }\n  }\n\n  function enqueuePendingEvent(event) {\n    if (pendingEvents.length >= maxPendingEvents) {\n      pendingEvents.shift();\n    }\n    pendingEvents.push(event);\n  }\n\n  function post(event) {\n    if (postNow(event)) return;\n    enqueuePendingEvent(event);\n  }\n\n  function emitCall(action, payload) {\n    var trimmed = typeof action === 'string' ? action.trim() : '';\n    if (!trimmed) return;\n    post({ type: 'hatch:call', action: trimmed, payload: plainObject(payload) });\n  }\n\n  function emitNavigate(target, params) {\n    var trimmed = typeof target === 'string' ? target.trim() : '';\n    if (!trimmed) return;\n    post({ type: 'hatch:navigate', target: trimmed, params: plainObject(params) });\n  }\n\n  function readCallRequest(callEl) {\n    if (!callEl) return null;\n    var action = callEl.getAttribute('data-hatch-call-action');\n    var trimmed = typeof action === 'string' ? action.trim() : '';\n    if (!trimmed) return null;\n    var payload = {};\n    var rawPayload =\n        callEl.getAttribute('data-hatch-call-payload') || callEl.getAttribute('data-payload');\n    if (rawPayload && rawPayload.trim()) {\n      try {\n        payload = plainObject(JSON.parse(rawPayload));\n      } catch (e) {\n        return null;\n      }\n    }\n    return { action: trimmed, payload: payload };\n  }\n\n  function readNavigateRequest(navigateEl) {\n    if (!navigateEl) return null;\n    var target = navigateEl.getAttribute('data-hatch-navigate-target');\n    var trimmed = typeof target === 'string' ? target.trim() : '';\n    if (!trimmed) return null;\n    var params = {};\n    var rawParams = navigateEl.getAttribute('data-hatch-navigate-params');\n    if (rawParams && rawParams.trim()) {\n      try {\n        params = plainObject(JSON.parse(rawParams));\n      } catch (e) {\n        return null;\n      }\n    }\n    return { target: trimmed, params: params };\n  }\n\n  window.hatch = window.hatch || {};\n  window.hatch.call = emitCall;\n  window.hatch.navigate = emitNavigate;\n\n  document.addEventListener('click', function(event) {\n    var target = event.target;\n    if (!target || typeof target.closest !== 'function') return;\n\n    var callEl = target.closest('[data-hatch-call-action]');\n    var navigateEl = target.closest('[data-hatch-navigate-target]');\n    if (!callEl && !navigateEl) return;\n\n    if ((callEl && (callEl.getAttribute('aria-disabled') === 'true' || callEl.hasAttribute('disabled')))\n      || (navigateEl && (navigateEl.getAttribute('aria-disabled') === 'true' || navigateEl.hasAttribute('disabled')))) {\n      event.preventDefault();\n      event.stopPropagation();\n      return;\n    }\n\n    var callRequest = readCallRequest(callEl);\n    var navigateRequest = readNavigateRequest(navigateEl);\n    if (callRequest || navigateRequest) {\n      event.preventDefault();\n      event.stopPropagation();\n    }\n\n    if (callRequest) {\n      emitCall(callRequest.action, callRequest.payload);\n    }\n\n    if (navigateRequest) {\n      emitNavigate(navigateRequest.target, navigateRequest.params);\n    }\n  }, true);\n\n  window.addEventListener('__fbAndroidBridgeAuthTokenInjected', flushPendingEvents);\n  flushPendingEvents();\n})();"
            java.lang.String r1 = "<script data-hatch-host-bridge=\"true\">\n"
            java.lang.String r0 = "\n</script>\n"
            java.lang.String r4 = X.FGI.A0U(r1, r2, r0)
            java.lang.String r0 = "head"
            int r1 = findHtmlStartTagEnd(r5, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0 = 0
            r2 = -1
            if (r1 != r2) goto L19
            r3 = r0
        L19:
            r1 = 0
            if (r3 != 0) goto L3c
            java.lang.String r0 = "html"
            int r0 = findHtmlStartTagEnd(r5, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r0 != r2) goto L3c
            int r0 = findHtmlDoctypeEnd(r5)
            if (r0 != r2) goto L2f
            r0 = 0
        L2f:
            java.lang.String r1 = r5.substring(r1, r0)
            java.lang.String r0 = r5.substring(r0)
            java.lang.String r0 = X.FGI.A0U(r1, r4, r0)
            return r0
        L3c:
            int r0 = r3.intValue()
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HtmlViewerKt.injectHatchHtmlHostBridgeScript(java.lang.String):java.lang.String");
    }

    public static final boolean isHtmlStartTag(String str, int i) {
        int i2 = i + 1;
        return i2 < str.length() && str.charAt(i) == '<' && Character.isLetter(str.charAt(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFirstAvailable(java.util.List<java.lang.String> r7, X.AbstractC3358CGz r8, X.HtJ<? super java.lang.String> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.file.view.HtmlViewerKt.C119731
            if (r0 == 0) goto L57
            r6 = r9
            com.facebook.aura.file.view.HtmlViewerKt$readFirstAvailable$1 r6 = (com.facebook.aura.file.view.HtmlViewerKt.C119731) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L4f
            if (r0 != r4) goto L5f
            java.lang.Object r3 = r6.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r0 = r6.L$1
            X.CGz r8 = X.C60O.A0D(r0, r1)
        L27:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L31
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L5e
        L31:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.String r2 = X.AnonymousClass005.A0j(r3)
            com.facebook.aura.gateway.HatchFileOperations r1 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r8
            r6.L$2 = r3
            r6.L$3 = r0
            r6.label = r4
            java.lang.Object r1 = r1.readFile(r2, r8, r6)
            if (r1 != r5) goto L27
            return r5
        L4f:
            X.Hwg.A00(r1)
            java.util.Iterator r3 = r7.iterator()
            goto L31
        L57:
            com.facebook.aura.file.view.HtmlViewerKt$readFirstAvailable$1 r6 = new com.facebook.aura.file.view.HtmlViewerKt$readFirstAvailable$1
            r6.<init>(r9)
            goto L12
        L5d:
            r1 = 0
        L5e:
            return r1
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HtmlViewerKt.readFirstAvailable(java.util.List, X.CGz, X.HtJ):java.lang.Object");
    }

    public static final void HtmlSpinner(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1574094925);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119692(bRg, i, i2);
        }
    }

    public static final /* synthetic */ WebView access$HtmlWebView$lambda$5(MutableState mutableState) {
        return (WebView) mutableState.getValue();
    }

    public static final String buildArtifactBaseUrl(String str) {
        return FGI.A0U("https://", FKC.A00(C60R.A03(str)), ".localhost/");
    }

    public static final void configureHtmlContentWebView(WebView webView) {
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setSupportZoom(true);
        webView.setVerticalScrollBarEnabled(true);
        webView.setHorizontalScrollBarEnabled(true);
        webView.setBackgroundColor(0);
        webView.setLayerType(2, null);
    }

    public static final boolean isHtmlAttributeNameChar(char c) {
        return Character.isLetterOrDigit(c) || c == '-' || c == ':' || c == '_';
    }

    public static final boolean isHtmlTagNameChar(char c) {
        return Character.isLetterOrDigit(c) || c == '-' || c == ':';
    }

    public static final boolean isSameOrigin(String str, String str2) {
        Object objA0s;
        Object objA0s2;
        try {
            objA0s = Uri.parse(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Uri uri = (Uri) objA0s;
        if (uri == null) {
            return false;
        }
        try {
            objA0s2 = Uri.parse(str2);
        } catch (Throwable th2) {
            objA0s2 = C3cG.A0s(th2);
        }
        Uri uri2 = (Uri) (objA0s2 instanceof C10571Hud ? null : objA0s2);
        return uri2 != null && AbstractC2159Azp.A12(uri.getScheme(), uri2.getScheme(), true) && AbstractC2159Azp.A12(uri.getHost(), uri2.getHost(), true) && uri.getPort() == uri2.getPort();
    }

    public static final Object loadFirstHtmlSlide(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C119712(str, abstractC3358CGz, null));
    }

    public static final Object loadHtmlSlideDeckManifest(String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super FileLoadingState> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C119722(str, abstractC3358CGz, str2, null));
    }

    public static final String rewriteHtmlStartTagAssetPaths(String str, String str2) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            if (C7LE.A01(str, i)) {
                int i2 = i;
                while (i2 < length && C7LE.A01(str, i2)) {
                    i2++;
                }
                sb.append((CharSequence) str, i, i2);
                if (i2 < length && str.charAt(i2) != '>') {
                    i = i2;
                    if (str.charAt(i2) != '/') {
                        while (i < length && isHtmlAttributeNameChar(str.charAt(i))) {
                            i++;
                        }
                        if (i2 != i) {
                            String strSubstring = str.substring(i2, i);
                            sb.append((CharSequence) str, i2, i);
                            i2 = i;
                            while (i2 < length && C7LE.A01(str, i2)) {
                                i2++;
                            }
                            sb.append((CharSequence) str, i, i2);
                            if (i2 < length && str.charAt(i2) == '=') {
                                sb.append('=');
                                int i3 = i2 + 1;
                                i = i3;
                                while (i < length && C7LE.A01(str, i)) {
                                    i++;
                                }
                                sb.append((CharSequence) str, i3, i);
                                if (i < length) {
                                    char cCharAt = str.charAt(i);
                                    if (cCharAt == '\"' || cCharAt == '\'') {
                                        sb.append(cCharAt);
                                        int i4 = i + 1;
                                        i2 = i4;
                                        while (i2 < length && str.charAt(i2) != cCharAt) {
                                            i2++;
                                        }
                                        appendRewrittenHtmlAssetValue(sb, strSubstring, str.substring(i4, i2), str2);
                                        if (i2 < length) {
                                            sb.append(str.charAt(i2));
                                            i = i2 + 1;
                                        }
                                    } else {
                                        i2 = i;
                                        while (i2 < length && !C7LE.A01(str, i2) && str.charAt(i2) != '>') {
                                            i2++;
                                        }
                                        appendRewrittenHtmlAssetValue(sb, strSubstring, str.substring(i, i2), str2);
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
            }
            sb.append(str.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
