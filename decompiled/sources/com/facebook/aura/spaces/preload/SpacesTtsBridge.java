package com.facebook.aura.spaces.preload;

import X.A3q;
import X.ATD;
import X.AnonymousClass005;
import X.BV6;
import X.C06H;
import X.C10571Hud;
import X.C3cG;
import X.C4JM;
import X.C60N;
import X.C60O;
import X.C6t6;
import X.C7384Etj;
import X.C7BY;
import X.C7pd;
import X.C7qW;
import X.CFK;
import X.FGI;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.speech.tts.Voice;
import android.webkit.JavascriptInterface;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class SpacesTtsBridge {
    public static final Companion Companion = new Companion();
    public static final String TAG = "SpacesTtsBridge";
    public final ConcurrentLinkedQueue<Function0<Unit>> pendingSpeaks = new ConcurrentLinkedQueue<>();
    public final SpacesTtsBridge$progressListener$1 progressListener = new UtteranceProgressListener() { // from class: com.facebook.aura.spaces.preload.SpacesTtsBridge$progressListener$1
        @Override // android.speech.tts.UtteranceProgressListener
        public void onDone(String str) {
            this.this$0.dispatch(str, "end");
        }

        @Override // android.speech.tts.UtteranceProgressListener
        @Deprecated(message = "Deprecated in Java")
        public void onError(String str) {
            this.this$0.dispatch(str, "error");
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onStart(String str) {
            this.this$0.dispatch(str, WidgetComponentsKt.START_PATH);
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onError(String str, int i) {
            this.this$0.dispatch(str, "error");
        }
    };
    public volatile boolean ready;
    public volatile C6t6 secureWebView;
    public volatile TextToSpeech tts;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean validateToken(String str) {
        try {
            C6t6 c6t6 = this.secureWebView;
            if (c6t6 == null || !c6t6.validateJsInterfaceToken(str)) {
                return false;
            }
            return SpacesWebViewSessionKt.isOnGrantedSpaceOrigin(c6t6);
        } catch (RuntimeException e) {
            CFK.A08(TAG, C60N.A00(46), e);
            return false;
        }
    }

    @JavascriptInterface
    public final void cancel(final String str) {
        C7384Etj.A0Y(str, 0);
        C6t6 c6t6 = this.secureWebView;
        if (c6t6 != null) {
            c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesTtsBridge.cancel.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (SpacesTtsBridge.this.validateToken(str)) {
                        SpacesTtsBridge.this.pendingSpeaks.clear();
                        try {
                            TextToSpeech textToSpeech = SpacesTtsBridge.this.tts;
                            if (textToSpeech != null) {
                                textToSpeech.stop();
                            }
                        } catch (Throwable th) {
                            C3cG.A0s(th);
                        }
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public final void requestVoices(final String str) {
        C7384Etj.A0Y(str, 0);
        C6t6 c6t6 = this.secureWebView;
        if (c6t6 != null) {
            c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesTtsBridge.requestVoices.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (SpacesTtsBridge.this.validateToken(str)) {
                        SpacesTtsBridge.this.ensureTts();
                        if (SpacesTtsBridge.this.ready) {
                            SpacesTtsBridge.this.pushVoices();
                        }
                    }
                }
            });
        }
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(String str, String str2) {
        if (str != null) {
            evaluate(FGI.A0c("window.__fwaSpacesTtsEvent(", SpacesWebViewFactoryKt.toJsStringLiteral(str), ",", SpacesWebViewFactoryKt.toJsStringLiteral(str2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doSpeak(String str, String str2, String str3, String str4, float f, float f2, float f3) {
        Object objA0s;
        int language;
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            if (!C7BY.A0j(str3) && ((language = textToSpeech.setLanguage(Locale.forLanguageTag(str3))) == -2 || language == -1)) {
                CFK.A06(TAG, FGI.A0A(language, "language unavailable: ", str3, " (result=", ")"));
                dispatch(str, "error");
                return;
            }
            if (!C7BY.A0j(str4)) {
                try {
                    objA0s = textToSpeech.getVoices();
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                Object obj = null;
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                Set set = (Set) objA0s;
                if (set != null) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (C7384Etj.areEqual(((Voice) next).getName(), str4)) {
                            obj = next;
                            break;
                        }
                    }
                    Voice voice = (Voice) obj;
                    if (voice != null) {
                        textToSpeech.setVoice(voice);
                    }
                }
            }
            if (f <= 0.0f) {
                f = 1.0f;
            }
            textToSpeech.setSpeechRate(f);
            if (f2 <= 0.0f) {
                f2 = 1.0f;
            }
            textToSpeech.setPitch(f2);
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putFloat("volume", ATD.A03(f3, 0.0f, 1.0f));
            textToSpeech.speak(str2, 1, bundleA0N, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureTts() {
        if (this.tts == null) {
            this.tts = new TextToSpeech(C4JM.A00(), new TextToSpeech.OnInitListener() { // from class: com.facebook.aura.spaces.preload.SpacesTtsBridge.ensureTts.1
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    if (i != 0) {
                        CFK.A06(SpacesTtsBridge.TAG, FGI.A0H("TTS init failed: status=", i));
                        return;
                    }
                    SpacesTtsBridge.this.ready = true;
                    TextToSpeech textToSpeech = SpacesTtsBridge.this.tts;
                    if (textToSpeech != null) {
                        textToSpeech.setOnUtteranceProgressListener(SpacesTtsBridge.this.progressListener);
                    }
                    SpacesTtsBridge.this.flushPending();
                    SpacesTtsBridge.this.pushVoices();
                }
            });
        }
    }

    private final void evaluate(final String str) {
        final C6t6 c6t6 = this.secureWebView;
        if (c6t6 != null) {
            c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesTtsBridge.evaluate.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        c6t6.evaluateJavascript(str, null);
                    } catch (Throwable th) {
                        C3cG.A0s(th);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flushPending() {
        while (true) {
            Function0<Unit> function0Poll = this.pendingSpeaks.poll();
            if (function0Poll == null) {
                return;
            } else {
                function0Poll.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pushVoices() {
        Object objA0s;
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            try {
                objA0s = textToSpeech.getVoices();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            Set set = (Set) objA0s;
            if (set == null) {
                set = A3q.A00;
            }
            C7pd c7pd = new C7pd();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C7qW.A0B(new SpacesTtsBridge$pushVoices$json$1$1$1((Voice) it.next()), c7pd);
            }
            evaluate(C60O.A0r("window.__fwaSpacesTtsSetVoices(", SpacesWebViewFactoryKt.toJsStringLiteral(c7pd.A05().toString())));
        }
    }

    public final void close() {
        this.pendingSpeaks.clear();
        TextToSpeech textToSpeech = this.tts;
        if (textToSpeech != null) {
            try {
                textToSpeech.stop();
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
            try {
                textToSpeech.shutdown();
            } catch (Throwable th2) {
                C3cG.A0s(th2);
            }
        }
        this.tts = null;
        this.ready = false;
        this.secureWebView = null;
    }

    public final C6t6 getSecureWebView() {
        return this.secureWebView;
    }

    public final void setSecureWebView(C6t6 c6t6) {
        this.secureWebView = c6t6;
    }

    @JavascriptInterface
    public final void speak(final String str, final String str2, final String str3, final String str4, final String str5, final float f, final float f2, final float f3) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C6t6 c6t6 = this.secureWebView;
        if (c6t6 != null) {
            c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesTtsBridge.speak.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (!SpacesTtsBridge.this.validateToken(str)) {
                        CFK.A06(SpacesTtsBridge.TAG, "speak: token validation failed");
                        return;
                    }
                    if (C7BY.A0j(str2) || C7BY.A0j(str3)) {
                        return;
                    }
                    SpacesTtsBridge.this.ensureTts();
                    SpacesTtsBridge spacesTtsBridge = SpacesTtsBridge.this;
                    SpacesTtsBridge$speak$1$action$1 spacesTtsBridge$speak$1$action$1 = new SpacesTtsBridge$speak$1$action$1(spacesTtsBridge, str2, str3, str4, str5, f, f2, f3);
                    if (spacesTtsBridge.ready) {
                        spacesTtsBridge$speak$1$action$1.invoke();
                    } else {
                        SpacesTtsBridge.this.pendingSpeaks.add(spacesTtsBridge$speak$1$action$1);
                    }
                }
            });
        }
    }
}
