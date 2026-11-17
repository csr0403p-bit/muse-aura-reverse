package com.facebook.aura.assist.recognition;

import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV6;
import X.C06H;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionListener;
import android.speech.RecognitionService;
import android.speech.RecognitionSupport;
import android.speech.RecognitionSupportCallback;
import android.speech.SpeechRecognizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public class ForwardingRecognitionService extends RecognitionService {

    @Deprecated
    public static final String TAG = "ForwardingRecognition";
    public SpeechRecognizer checker;
    public SpeechRecognizer download;
    public SpeechRecognizer session;
    public static final Companion Companion = new Companion();
    public static final boolean canDestroyDuringSupportCheck = AnonymousClass002.A1P(Build.VERSION.SDK_INT, 33);

    public final class Companion {
        public final boolean getCanDestroyDuringSupportCheck() {
            return ForwardingRecognitionService.canDestroyDuringSupportCheck;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Relay implements RecognitionListener {
        public final RecognitionService.Callback caller;

        public Relay(RecognitionService.Callback callback) {
            C7384Etj.A0Y(callback, 0);
            this.caller = callback;
        }

        @Override // android.speech.RecognitionListener
        public void onLanguageDetection(Bundle bundle) {
            C7384Etj.A0Y(bundle, 0);
            try {
                this.caller.languageDetection(bundle);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onSegmentResults(Bundle bundle) throws RemoteException {
            C7384Etj.A0Y(bundle, 0);
            try {
                this.caller.segmentResults(bundle);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() throws RemoteException {
            try {
                this.caller.beginningOfSpeech();
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) throws RemoteException {
            try {
                this.caller.bufferReceived(bArr);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSegmentedSession() throws RemoteException {
            try {
                this.caller.endOfSegmentedSession();
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() throws RemoteException {
            try {
                this.caller.endOfSpeech();
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onError(int i) throws RemoteException {
            try {
                this.caller.error(i);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) throws RemoteException {
            try {
                this.caller.partialResults(bundle);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) throws RemoteException {
            try {
                this.caller.readyForSpeech(bundle);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) throws RemoteException {
            try {
                this.caller.results(bundle);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f) throws RemoteException {
            try {
                this.caller.rmsChanged(f);
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        private final void relay(Function0<Unit> function0) {
            try {
                function0.invoke();
            } catch (RemoteException e) {
                BV6.A1P(e);
            }
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i, Bundle bundle) {
        }
    }

    @Override // android.speech.RecognitionService
    public void onTriggerModelDownload(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        SpeechRecognizer speechRecognizerOtherEngine = otherEngine();
        if (speechRecognizerOtherEngine != null) {
            SpeechRecognizer speechRecognizer = this.download;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
            this.download = speechRecognizerOtherEngine;
            speechRecognizerOtherEngine.triggerModelDownload(intent);
        }
    }

    @Override // android.speech.RecognitionService
    public void onCancel(RecognitionService.Callback callback) {
        SpeechRecognizer speechRecognizer = this.session;
        if (speechRecognizer != null) {
            speechRecognizer.cancel();
        }
    }

    @Override // android.speech.RecognitionService, android.app.Service
    public void onDestroy() {
        SpeechRecognizer speechRecognizer = this.session;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        SpeechRecognizer speechRecognizer2 = this.download;
        if (speechRecognizer2 != null) {
            speechRecognizer2.destroy();
        }
        SpeechRecognizer speechRecognizer3 = this.checker;
        if (speechRecognizer3 != null) {
            speechRecognizer3.destroy();
        }
        super.onDestroy();
    }

    @Override // android.speech.RecognitionService
    public void onStopListening(RecognitionService.Callback callback) {
        SpeechRecognizer speechRecognizer = this.session;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
    }

    private final SpeechRecognizer otherEngine() {
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(C60P.A03("android.speech.RecognitionService"), 0);
        C7384Etj.A0U(listQueryIntentServices);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listQueryIntentServices);
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().serviceInfo);
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : arrayListA0i) {
            if (!getPackageName().equals(((PackageItemInfo) obj).packageName)) {
                arrayListA0h.add(obj);
            }
        }
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.assist.recognition.ForwardingRecognitionService$otherEngine$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((ComponentInfo) t2).applicationInfo.flags & 1).compareTo(Integer.valueOf(((ComponentInfo) t).applicationInfo.flags & 1));
            }
        };
        PackageItemInfo packageItemInfo = (PackageItemInfo) AbstractC0878AGe.A0G(AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.assist.recognition.ForwardingRecognitionService$otherEngine$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00(((PackageItemInfo) t).packageName, ((PackageItemInfo) t2).packageName) : iCompare;
            }
        }));
        if (packageItemInfo != null) {
            return SpeechRecognizer.createSpeechRecognizer(this, new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseChecker(SpeechRecognizer speechRecognizer) {
        speechRecognizer.destroy();
        if (this.checker == speechRecognizer) {
            this.checker = null;
        }
    }

    @Override // android.speech.RecognitionService
    public void onCheckRecognitionSupport(Intent intent, final RecognitionService.SupportCallback supportCallback) {
        AnonymousClass003.A0u(intent, supportCallback);
        SpeechRecognizer speechRecognizer = this.checker;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        final SpeechRecognizer speechRecognizerOtherEngine = otherEngine();
        if (canDestroyDuringSupportCheck) {
            this.checker = speechRecognizerOtherEngine;
        }
        if (speechRecognizerOtherEngine == null) {
            supportCallback.onError(14);
        } else {
            speechRecognizerOtherEngine.checkRecognitionSupport(intent, getMainExecutor(), new RecognitionSupportCallback() { // from class: com.facebook.aura.assist.recognition.ForwardingRecognitionService.onCheckRecognitionSupport.1
                @Override // android.speech.RecognitionSupportCallback
                public void onSupportResult(RecognitionSupport recognitionSupport) {
                    C7384Etj.A0Y(recognitionSupport, 0);
                    ForwardingRecognitionService.this.releaseChecker(speechRecognizerOtherEngine);
                    supportCallback.onSupportResult(recognitionSupport);
                }

                @Override // android.speech.RecognitionSupportCallback
                public void onError(int i) {
                    ForwardingRecognitionService.this.releaseChecker(speechRecognizerOtherEngine);
                    supportCallback.onError(i);
                }
            });
        }
    }

    @Override // android.speech.RecognitionService
    public void onStartListening(Intent intent, RecognitionService.Callback callback) throws RemoteException {
        AnonymousClass003.A0u(intent, callback);
        SpeechRecognizer speechRecognizer = this.session;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        SpeechRecognizer speechRecognizerOtherEngine = otherEngine();
        this.session = speechRecognizerOtherEngine;
        if (speechRecognizerOtherEngine == null) {
            callback.error(5);
        } else {
            speechRecognizerOtherEngine.setRecognitionListener(new Relay(callback));
            speechRecognizerOtherEngine.startListening(intent);
        }
    }
}
