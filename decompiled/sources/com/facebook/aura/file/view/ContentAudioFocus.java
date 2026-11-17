package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BV7;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ContentAudioFocus {
    public final AudioManager audioManager;
    public boolean granted;
    public Function0<Boolean> isPlaying;
    public final Handler mainHandler;
    public Function0<Unit> onPause;
    public Function0<Unit> onResume;
    public final AudioFocusRequest request;
    public boolean resumeOnGain;

    public ContentAudioFocus(Context context) {
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService("audio");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        this.mainHandler = C60O.A02();
        this.isPlaying = AnonymousClass1.INSTANCE;
        this.onPause = ContentAudioFocus$onPause$1.INSTANCE;
        this.onResume = ContentAudioFocus$onResume$1.INSTANCE;
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.facebook.aura.file.view.ContentAudioFocus$request$1
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                this.this$0.onFocusChange(i);
            }
        }).build();
        C7384Etj.A0U(audioFocusRequestBuild);
        this.request = audioFocusRequestBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange(int i) {
        Handler handler;
        Runnable runnable;
        if (i != 1) {
            boolean zA1Y = AnonymousClass003.A1Y(this.isPlaying);
            if (i == -1) {
                this.granted = false;
                this.resumeOnGain = false;
                if (!zA1Y) {
                    return;
                }
            } else if (!zA1Y) {
                return;
            } else {
                this.resumeOnGain = true;
            }
            handler = this.mainHandler;
            runnable = new Runnable() { // from class: com.facebook.aura.file.view.ContentAudioFocus.onFocusChange.2
                @Override // java.lang.Runnable
                public final void run() {
                    ContentAudioFocus.this.onPause.invoke();
                }
            };
        } else {
            if (!this.resumeOnGain) {
                return;
            }
            this.resumeOnGain = false;
            handler = this.mainHandler;
            runnable = new Runnable() { // from class: com.facebook.aura.file.view.ContentAudioFocus.onFocusChange.1
                @Override // java.lang.Runnable
                public final void run() {
                    ContentAudioFocus.this.onResume.invoke();
                }
            };
        }
        handler.post(runnable);
    }

    public final void setOnPause(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.onPause = function0;
    }

    public final void setOnResume(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.onResume = function0;
    }

    public final void setPlaying(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        this.isPlaying = function0;
    }

    /* renamed from: com.facebook.aura.file.view.ContentAudioFocus$isPlaying$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    public final void acquire() {
        if (this.granted) {
            return;
        }
        boolean zA1Q = BV7.A1Q(this.audioManager.requestAudioFocus(this.request));
        this.granted = zA1Q;
        if (zA1Q) {
            return;
        }
        CFK.A06(MediaViewerContentKt.TAG, "ContentAudioPlayer: audio focus denied, playing without it");
    }

    public final Function0<Unit> getOnPause() {
        return this.onPause;
    }

    public final Function0<Unit> getOnResume() {
        return this.onResume;
    }

    public final Function0<Boolean> isPlaying() {
        return this.isPlaying;
    }

    public final void release() {
        if (this.granted) {
            this.audioManager.abandonAudioFocusRequest(this.request);
            this.granted = false;
            this.resumeOnGain = false;
        }
    }
}
