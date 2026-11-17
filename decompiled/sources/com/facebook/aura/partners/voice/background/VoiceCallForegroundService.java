package com.facebook.aura.partners.voice.background;

import X.AbstractC07127nr;
import X.AbstractC10402HbJ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass603;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5Q6;
import X.C60N;
import X.C7380Etd;
import X.C7384Etj;
import X.C7438Evz;
import X.C7502EyJ;
import X.C7BY;
import X.C7Je;
import X.C7m8;
import X.C7mB;
import X.CFK;
import X.EFx;
import X.EG6;
import X.EGD;
import X.EnumC10460Hji;
import X.F1F;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2l;
import X.HoC;
import X.Hqg;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.core.app.NotificationCompat$CallStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.R;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.notifications.push.AuraNotificationChannels;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VoiceCallForegroundService extends Service {
    public static final int AVATAR_TARGET_PX = 144;
    public static final int CALL_STYLE_BUTTON_FILL_COLOR = -10724255;
    public static final String EXTRA_ACCESSORY_CALL = "accessory_call";
    public static final long HIDE_AVATAR_MEDIA_RELEASE_STABLE_MS = 32;
    public static final long HIDE_AVATAR_MEDIA_RELEASE_TIMEOUT_MS = 1000;
    public static final int NOTIFICATION_ID = 9007;
    public static final String TAG = "VoiceCallForegroundService";
    public volatile boolean accessoryCall;
    public HoC activeJob;
    public volatile Bitmap avatarBitmap;
    public HoC avatarJob;
    public HoC hideAvatarJob;
    public volatile String loadedAvatarPath;
    public volatile VoiceCallStateHolder observedHolder;
    public HoC refreshJob;
    public final C3UX scope = C3cH.A0x(AnonymousClass001.A0y());
    public static final Companion Companion = new Companion();
    public static final List<String> CONNECTED_DEVICE_PERMISSIONS = Arrays.asList("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.CHANGE_NETWORK_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.CHANGE_WIFI_MULTICAST_STATE", "android.permission.NFC", "android.permission.TRANSMIT_IR", "android.permission.UWB_RANGING");

    public final class Companion {
        public final CharSequence callStyleButtonTitle$fbandroid_express_aura_java_com_facebook_aura_partners_voice_background_background(CharSequence charSequence) {
            C7384Etj.A0Y(charSequence, 0);
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new ForegroundColorSpan(VoiceCallForegroundService.CALL_STYLE_BUTTON_FILL_COLOR), 0, spannableString.length(), 17);
            return spannableString;
        }

        public final boolean endCallIfNotificationHidden(Context context, VoiceCallStateHolder voiceCallStateHolder) {
            C7384Etj.A0Y(context, 0);
            if (voiceCallStateHolder == null || !C3cH.A1P(voiceCallStateHolder) || areCallNotificationsEnabled(context)) {
                return false;
            }
            CFK.A05(VoiceCallForegroundService.TAG, "Ending the voice call: the app is off screen and the call notification is hidden");
            voiceCallStateHolder.requestEndCall(null, null, null);
            return true;
        }

        public final void start(Context context, boolean z) {
            C7384Etj.A0Y(context, 0);
            if (isSupported()) {
                if (!z && context.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    CFK.A06(VoiceCallForegroundService.TAG, "RECORD_AUDIO not granted, skipping microphone foreground service");
                    return;
                }
                try {
                    context.startService(new Intent(context, (Class<?>) VoiceCallForegroundService.class).putExtra(VoiceCallForegroundService.EXTRA_ACCESSORY_CALL, z));
                } catch (RuntimeException e) {
                    CFK.A0A(VoiceCallForegroundService.TAG, "start blocked", e);
                }
            }
        }

        public final void stop(Context context) {
            C7384Etj.A0Y(context, 0);
            if (isSupported()) {
                try {
                    context.stopService(new Intent(context, (Class<?>) VoiceCallForegroundService.class));
                } catch (RuntimeException e) {
                    CFK.A0A(VoiceCallForegroundService.TAG, "stop blocked", e);
                }
            }
        }

        public final boolean isSupported() {
            return Build.VERSION.SDK_INT >= 31;
        }

        private final boolean areCallNotificationsEnabled(Context context) {
            if (!isSupported()) {
                return false;
            }
            NotificationManager notificationManager = new C7380Etd(context).A00;
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(VoiceNotificationChannel.ID);
            return (!notificationManager.areNotificationsEnabled() || notificationChannel == null || notificationChannel.getImportance() == 0) ? false : true;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1", f = "VoiceCallForegroundService.kt", l = {91, MinidumpReader.MODULE_FULL_SIZE, 113, 113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $hideGeneration;
        public final /* synthetic */ VoiceCallStateHolder $holder;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$1", f = "VoiceCallForegroundService.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02851 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ long $hideGeneration;
            public final /* synthetic */ VoiceCallStateHolder $holder;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02851(VoiceCallStateHolder voiceCallStateHolder, long j, HtJ<? super C02851> htJ) {
                super(2, htJ);
                this.$holder = voiceCallStateHolder;
                this.$hideGeneration = j;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02851(this.$holder, this.$hideGeneration, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                /*
                    r1 = this;
                    int r0 = r1.label
                    if (r0 != 0) goto L20
                    X.Hwg.A00(r2)
                    com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r2 = r1.$holder
                    long r0 = r1.$hideGeneration
                    boolean r0 = r2.beginEmbodimentHideRequest(r0)
                    if (r0 == 0) goto L1a
                    com.facebook.aura.partners.voice.api.HatchSystemPipRuntime r0 = com.facebook.aura.partners.voice.api.HatchSystemPipRuntime.INSTANCE
                    boolean r1 = r0.requestHideAvatar()
                    r0 = 1
                    if (r1 != 0) goto L1b
                L1a:
                    r0 = 0
                L1b:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L20:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.background.VoiceCallForegroundService.AnonymousClass1.C02851.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return ((C02851) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$2", f = "VoiceCallForegroundService.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$hideAvatar$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ F1F $hidden;
            public final /* synthetic */ long $hideGeneration;
            public final /* synthetic */ VoiceCallStateHolder $holder;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(VoiceCallStateHolder voiceCallStateHolder, long j, F1F f1f, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$holder = voiceCallStateHolder;
                this.$hideGeneration = j;
                this.$hidden = f1f;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$holder, this.$hideGeneration, this.$hidden, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.$holder.finishEmbodimentHide(this.$hideGeneration, this.$hidden.element);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
        
            if (X.GAo.A00(r11, r0, r7) != r2) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.background.VoiceCallForegroundService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceCallStateHolder voiceCallStateHolder, long j, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$holder = voiceCallStateHolder;
            this.$hideGeneration = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$holder, this.$hideGeneration, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$1", f = "VoiceCallForegroundService.kt", l = {198}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$1, reason: invalid class name and case insensitive filesystem */
    public final class C130751 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceCallStateHolder $holder;
        public int label;
        public final /* synthetic */ VoiceCallForegroundService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130751(VoiceCallStateHolder voiceCallStateHolder, VoiceCallForegroundService voiceCallForegroundService, HtJ<? super C130751> htJ) {
            super(2, htJ);
            this.$holder = voiceCallStateHolder;
            this.this$0 = voiceCallForegroundService;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C130751(this.$holder, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<Boolean> c1bn = this.$holder.isCallActive;
                final VoiceCallForegroundService voiceCallForegroundService = this.this$0;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.background.VoiceCallForegroundService.observe.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (!z) {
                            voiceCallForegroundService.stop();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130751) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$2", f = "VoiceCallForegroundService.kt", l = {202}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceCallStateHolder $holder;
        public int label;
        public final /* synthetic */ VoiceCallForegroundService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceCallStateHolder voiceCallStateHolder, VoiceCallForegroundService voiceCallForegroundService, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$holder = voiceCallStateHolder;
            this.this$0 = voiceCallForegroundService;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$holder, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final VoiceCallStateHolder voiceCallStateHolder = this.$holder;
                C1BN<String> c1bn = voiceCallStateHolder.avatarPath;
                final VoiceCallForegroundService voiceCallForegroundService = this.this$0;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.background.VoiceCallForegroundService.observe.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(String str, HtJ<? super Unit> htJ) {
                        if (!C7384Etj.areEqual(str, voiceCallForegroundService.loadedAvatarPath) && C3cH.A1P(voiceCallStateHolder)) {
                            Bitmap bitmapFetchAvatar = voiceCallForegroundService.fetchAvatar(str);
                            if (voiceCallForegroundService.observedHolder == voiceCallStateHolder) {
                                voiceCallForegroundService.loadedAvatarPath = str;
                                voiceCallForegroundService.avatarBitmap = bitmapFetchAvatar;
                                voiceCallForegroundService.refreshNotification(voiceCallStateHolder);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$3", f = "VoiceCallForegroundService.kt", l = {224}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceCallStateHolder $holder;
        public int label;
        public final /* synthetic */ VoiceCallForegroundService this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$3$1", f = "VoiceCallForegroundService.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$observe$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G2l<Boolean, Boolean, String, String, Boolean, HtJ<? super Unit>, Object> {
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(6, htJ);
            }

            public final Object invoke(boolean z, boolean z2, String str, String str2, boolean z3, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }

            @Override // X.G2l
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, String str, String str2, Boolean bool3, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(VoiceCallStateHolder voiceCallStateHolder, VoiceCallForegroundService voiceCallForegroundService, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$holder = voiceCallStateHolder;
            this.this$0 = voiceCallForegroundService;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$holder, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceCallStateHolder voiceCallStateHolder = this.$holder;
                AnonymousClass603 anonymousClass603 = new AnonymousClass603(3, new AnonymousClass1(null), new C20Q[]{voiceCallStateHolder.isMuted, voiceCallStateHolder.isReconnecting, voiceCallStateHolder.botName, voiceCallStateHolder.activeThreadId, AuraAppLifecycleManager.isAppInForegroundImmediateFlow});
                final VoiceCallForegroundService voiceCallForegroundService = this.this$0;
                final VoiceCallStateHolder voiceCallStateHolder2 = this.$holder;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.background.VoiceCallForegroundService.observe.3.2
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        voiceCallForegroundService.refreshNotification(voiceCallStateHolder2);
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        voiceCallForegroundService.refreshNotification(voiceCallStateHolder2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass603.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$onStartCommand$2, reason: invalid class name and case insensitive filesystem */
    public final class C130772 extends AbstractC7559F3s implements G0U<VoiceCallStateHolder, Unit> {
        public static final C130772 INSTANCE = new C130772();

        public C130772() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoiceCallStateHolder voiceCallStateHolder) {
            invoke2(voiceCallStateHolder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoiceCallStateHolder voiceCallStateHolder) {
            C7384Etj.A0Y(voiceCallStateHolder, 0);
            voiceCallStateHolder.requestToggleMute();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$onStartCommand$3, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C130783 extends C7438Evz implements G0U<VoiceCallStateHolder, Unit> {
        public C130783(Object obj) {
            super(1, obj, VoiceCallForegroundService.class, "hideAvatar", "hideAvatar(Lcom/facebook/aura/partners/voice/intf/VoiceCallStateHolder;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoiceCallStateHolder voiceCallStateHolder) {
            ((VoiceCallForegroundService) AnonymousClass006.A0o(voiceCallStateHolder, this)).hideAvatar(voiceCallStateHolder);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoiceCallStateHolder voiceCallStateHolder) {
            invoke2(voiceCallStateHolder);
            return Unit.INSTANCE;
        }
    }

    private final synchronized void cancelHideAvatarJob() {
        HoC hoC = this.hideAvatarJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.hideAvatarJob = null;
    }

    private final boolean enterMicrophoneForegroundForAccessory(RuntimeException runtimeException) {
        this.accessoryCall = false;
        if (checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            CFK.A0A(TAG, "connectedDevice foreground service not allowed, trying microphone", runtimeException);
            return enterForeground();
        }
        CFK.A0A(TAG, "connectedDevice foreground service not allowed and no RECORD_AUDIO; the accessory call continues without a foreground service", runtimeException);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap fetchAvatar(String str) {
        String path;
        if (str != null && (path = Uri.parse(str).getPath()) != null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path);
                if (bitmapDecodeFile != null) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, AVATAR_TARGET_PX, AVATAR_TARGET_PX, true);
                    C7384Etj.A0U(bitmapCreateScaledBitmap);
                    if (bitmapCreateScaledBitmap != bitmapDecodeFile) {
                        bitmapDecodeFile.recycle();
                    }
                    return bitmapCreateScaledBitmap;
                }
            } catch (Throwable th) {
                CFK.A0A(TAG, "avatar decode failed", th);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void hideAvatar(VoiceCallStateHolder voiceCallStateHolder) {
        Long lStageEmbodimentHide;
        HoC hoC = this.hideAvatarJob;
        if ((hoC == null || !hoC.isActive()) && (lStageEmbodimentHide = voiceCallStateHolder.stageEmbodimentHide()) != null) {
            this.hideAvatarJob = AnonymousClass001.A11(new AnonymousClass1(voiceCallStateHolder, lStageEmbodimentHide.longValue(), null), this.scope);
        }
    }

    private final int stopNow() {
        stopForeground(1);
        stopSelf();
        return 2;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        G0U<? super VoiceCallStateHolder, Unit> c130783;
        if (intent != null && intent.hasExtra(EXTRA_ACCESSORY_CALL)) {
            this.accessoryCall = intent.getBooleanExtra(EXTRA_ACCESSORY_CALL, false);
        }
        if (!enterForeground()) {
            stopSelf();
            return 2;
        }
        if (intent != null && (action = intent.getAction()) != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 202362574) {
                if (iHashCode != 365518240) {
                    if (iHashCode == 2044690648 && action.equals(HatchSystemPipActionIntents.ACTION_END_CALL)) {
                        c130783 = C130761.INSTANCE;
                        return attachToActiveCall(c130783);
                    }
                } else if (action.equals(HatchSystemPipActionIntents.ACTION_HIDE_AVATAR)) {
                    c130783 = new C130783(this);
                    return attachToActiveCall(c130783);
                }
            } else if (action.equals(HatchSystemPipActionIntents.ACTION_TOGGLE_MUTE)) {
                c130783 = C130772.INSTANCE;
                return attachToActiveCall(c130783);
            }
        }
        attachToActiveCall(null);
        return 2;
    }

    private final int attachToActiveCall(G0U<? super VoiceCallStateHolder, Unit> g0u) {
        VoiceCallStateHolder voiceCallStateHolder = VoiceCallStateHolder.activeInstanceRef.get();
        if (voiceCallStateHolder == null || !C3cH.A1P(voiceCallStateHolder)) {
            stopForeground(1);
            stopSelf();
            return 2;
        }
        observe(voiceCallStateHolder);
        if (g0u == null) {
            return 2;
        }
        g0u.invoke(voiceCallStateHolder);
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int attachToActiveCall$default(VoiceCallForegroundService voiceCallForegroundService, G0U g0u, int i, Object obj) {
        if ((i & 1) != 0) {
            g0u = null;
        }
        return voiceCallForegroundService.attachToActiveCall(g0u);
    }

    private final Notification buildNotification(VoiceCallStateHolder voiceCallStateHolder) {
        boolean zA1R = C3cH.A1R(voiceCallStateHolder.isMuted);
        String value = voiceCallStateHolder.botName.getValue();
        if (value == null || C7BY.A0j(value)) {
            value = getString(R.string._name_removed__res_0x7f121146);
        }
        int i = R.drawable.microphone_wght400_outline_24;
        int i2 = R.string._name_removed__res_0x7f121144;
        if (zA1R) {
            i = R.drawable.microphoneslash_outline_24_wght400;
            i2 = R.string._name_removed__res_0x7f121147;
        }
        CharSequence string = getString(i2);
        IconCompat iconCompat = null;
        Bitmap bitmap = this.avatarBitmap;
        if (bitmap != null) {
            iconCompat = new IconCompat(1);
            iconCompat.A06 = bitmap;
        }
        EFx eFx = new EFx(iconCompat, value, null, null, false, false);
        boolean zIsAppInForeground = AuraAppLifecycleManager.INSTANCE.isAppInForeground();
        if (!zIsAppInForeground) {
            string = Companion.callStyleButtonTitle$fbandroid_express_aura_java_com_facebook_aura_partners_voice_background_background(string);
        }
        HatchSystemPipActionIntents hatchSystemPipActionIntents = HatchSystemPipActionIntents.INSTANCE;
        EGD egdA00 = new C7502EyJ(hatchSystemPipActionIntents.toggleMute(this), string, i).A00();
        long j = voiceCallStateHolder.callStartElapsedRealtimeMs;
        long jCurrentTimeMillis = j == 0 ? System.currentTimeMillis() : System.currentTimeMillis() - C3cG.A04(j);
        EG6 eg6A08 = C3cI.A08(getApplicationContext(), VoiceNotificationChannel.ID);
        eg6A08.A09 = callThreadIntent(C3cG.A0c(voiceCallStateHolder));
        eg6A08.A08(value);
        eg6A08.A07(getString(R.string._name_removed__res_0x7f121146));
        Notification notification = eg6A08.A07;
        int i3 = notification.flags | 2;
        notification.flags = i3;
        eg6A08.A0T = true;
        notification.flags = i3 | 8;
        eg6A08.A05 = 1;
        eg6A08.A0U = true;
        notification.when = jCurrentTimeMillis;
        if (zIsAppInForeground) {
            Bitmap bitmap2 = this.avatarBitmap;
            if (bitmap2 != null) {
                eg6A08.A05(bitmap2);
            }
            eg6A08.A0M.add(new C7502EyJ(hatchSystemPipActionIntents.endCall(this), getString(R.string._name_removed__res_0x7f121143), R.drawable.voice_phone_handset_down_24).A00());
        } else {
            PendingIntent pendingIntentEndCall = hatchSystemPipActionIntents.endCall(this);
            Hqg.A00(pendingIntentEndCall, "hangUpIntent is required");
            NotificationCompat$CallStyle notificationCompat$CallStyle = new NotificationCompat$CallStyle();
            if (TextUtils.isEmpty(eFx.A01)) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            notificationCompat$CallStyle.A00 = 2;
            notificationCompat$CallStyle.A04 = eFx;
            notificationCompat$CallStyle.A01 = null;
            notificationCompat$CallStyle.A02 = null;
            notificationCompat$CallStyle.A03 = pendingIntentEndCall;
            eg6A08.A06(notificationCompat$CallStyle);
        }
        if (!C3cH.A1R(voiceCallStateHolder.isReconnecting)) {
            eg6A08.A0M.add(egdA00);
        }
        Notification notificationA01 = eg6A08.A01();
        C7384Etj.A0U(notificationA01);
        return !zIsAppInForeground ? promoteToLiveUpdate(notificationA01) : notificationA01;
    }

    private final boolean connectedDeviceAllowed() {
        if (Build.VERSION.SDK_INT < 34) {
            return true;
        }
        List<String> list = CONNECTED_DEVICE_PERMISSIONS;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (checkSelfPermission(AnonymousClass005.A0j(it)) == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean enterForeground() {
        if (!this.accessoryCall || connectedDeviceAllowed()) {
            VoiceCallStateHolder voiceCallStateHolder = VoiceCallStateHolder.activeInstanceRef.get();
            try {
                startForeground(NOTIFICATION_ID, (voiceCallStateHolder == null || !C3cH.A1P(voiceCallStateHolder)) ? placeholderNotification() : buildNotification(voiceCallStateHolder), foregroundServiceType());
                return true;
            } catch (RuntimeException e) {
                e = e;
                if (!this.accessoryCall) {
                    CFK.A0A(TAG, "startForeground blocked, stopping self", e);
                    return false;
                }
            }
        } else {
            e = null;
        }
        return enterMicrophoneForegroundForAccessory(e);
    }

    private final int foregroundServiceType() {
        return this.accessoryCall ? 16 : 128;
    }

    private final void observe(VoiceCallStateHolder voiceCallStateHolder) {
        if (this.observedHolder != voiceCallStateHolder) {
            HoC hoC = this.activeJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            HoC hoC2 = this.refreshJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            HoC hoC3 = this.avatarJob;
            if (hoC3 != null) {
                hoC3.A5w(null);
            }
            cancelHideAvatarJob();
            this.activeJob = null;
            this.refreshJob = null;
            this.avatarJob = null;
            this.loadedAvatarPath = null;
            this.avatarBitmap = null;
            this.observedHolder = voiceCallStateHolder;
        }
        HoC hoC4 = this.activeJob;
        if (hoC4 == null || !hoC4.isActive()) {
            this.activeJob = AnonymousClass001.A11(new C130751(voiceCallStateHolder, this, null), this.scope);
        }
        HoC hoC5 = this.avatarJob;
        if (hoC5 == null || !hoC5.isActive()) {
            this.avatarJob = AnonymousClass001.A11(new AnonymousClass2(voiceCallStateHolder, this, null), this.scope);
        }
        HoC hoC6 = this.refreshJob;
        if (hoC6 == null || !hoC6.isActive()) {
            this.refreshJob = AnonymousClass001.A11(new AnonymousClass3(voiceCallStateHolder, this, null), this.scope);
        }
    }

    private final Notification promoteToLiveUpdate(Notification notification) {
        if (Build.VERSION.SDK_INT < 36 || !supportsPromotedOngoingMinor()) {
            return notification;
        }
        Notification notificationBuild = Notification.Builder.recoverBuilder(getApplicationContext(), notification).setRequestPromotedOngoing(true).setShortCriticalText(getString(R.string._name_removed__res_0x7f121145)).build();
        C7384Etj.A0X(notificationBuild);
        return notificationBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshNotification(VoiceCallStateHolder voiceCallStateHolder) {
        NotificationManager notificationManager;
        Object objA0s;
        if (voiceCallStateHolder == VoiceCallStateHolder.activeInstanceRef.get() && C3cH.A1P(voiceCallStateHolder) && (notificationManager = (NotificationManager) getSystemService(NotificationManager.class)) != null) {
            try {
                notificationManager.notify(NOTIFICATION_ID, buildNotification(voiceCallStateHolder));
                objA0s = Unit.INSTANCE;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            Throwable thA00 = HsJ.A00(objA0s);
            if (thA00 != null) {
                CFK.A0A(TAG, "notify failed", thA00);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stop() {
        C1BN<Boolean> c1bn;
        VoiceCallStateHolder voiceCallStateHolder = VoiceCallStateHolder.activeInstanceRef.get();
        if (voiceCallStateHolder == null || (c1bn = voiceCallStateHolder.isCallActive) == null || !C3cH.A1R(c1bn)) {
            stopNow();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        C1BN<Boolean> c1bn;
        C1BN<VoiceCallUiState> callState;
        VoiceCallUiState value;
        HatchSystemPipRuntime hatchSystemPipRuntime = HatchSystemPipRuntime.INSTANCE;
        VoiceCallManager currentManager = hatchSystemPipRuntime.getCurrentManager();
        if (currentManager != null) {
            currentManager.logSystemPipEvent(VoiceSystemPipEvent.TASK_REMOVED);
        }
        VoiceCallStateHolder voiceCallStateHolder = VoiceCallStateHolder.activeInstanceRef.get();
        if (currentManager == null || (callState = currentManager.getCallState()) == null || (value = callState.getValue()) == null ? voiceCallStateHolder == null || (c1bn = voiceCallStateHolder.isCallActive) == null || !C3cH.A1R(c1bn) : value.phase == VoiceCallPhase.ENDED) {
            hatchSystemPipRuntime.cancelPipTransition();
            stopNow();
        } else {
            if (hatchSystemPipRuntime.getShouldHideAvatarOnTaskRemoval() && voiceCallStateHolder != null) {
                voiceCallStateHolder.setEmbodimentDisplayEnabled(false, VoiceEmbodimentStateReason.TASK_REMOVED);
            }
            if (hatchSystemPipRuntime.consumePipDismissal() && currentManager != null) {
                currentManager.logSystemPipEvent(VoiceSystemPipEvent.DISMISSED);
            }
            Companion.endCallIfNotificationHidden(AnonymousClass001.A0I(this), voiceCallStateHolder);
        }
        super.onTaskRemoved(intent);
    }

    private final PendingIntent callThreadIntent(String str) {
        Intent launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.addFlags(603979776);
        if (str == null) {
            str = "main";
        }
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(FGI.A0M(C60N.A00(23), Uri.encode(str)));
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        launchIntentForPackage.setData(uriA01);
        C7m8 c7m8 = new C7m8();
        c7m8.A06(launchIntentForPackage, getApplicationContext().getClassLoader());
        c7m8.A00 = C7mB.A00("*|all_packages|*", AbstractC10402HbJ.A0o);
        c7m8.A01 = true;
        return c7m8.A01(getApplicationContext(), NOTIFICATION_ID, 201326592);
    }

    private final Notification placeholderNotification() {
        EG6 eg6A08 = C3cI.A08(getApplicationContext(), VoiceNotificationChannel.ID);
        eg6A08.A0T = true;
        Notification notificationA01 = eg6A08.A01();
        C7384Etj.A0U(notificationA01);
        return notificationA01;
    }

    private final boolean supportsPromotedOngoingMinor() {
        return C5Q6.A00() >= 3600001;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AuraNotificationChannels.INSTANCE.ensureChannelsExist(AnonymousClass001.A0I(this));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Hxb.A03(null, this.scope);
    }

    /* renamed from: com.facebook.aura.partners.voice.background.VoiceCallForegroundService$onStartCommand$1, reason: invalid class name and case insensitive filesystem */
    public final class C130761 extends AbstractC7559F3s implements G0U<VoiceCallStateHolder, Unit> {
        public static final C130761 INSTANCE = new C130761();

        public C130761() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VoiceCallStateHolder voiceCallStateHolder) {
            C7384Etj.A0Y(voiceCallStateHolder, 0);
            voiceCallStateHolder.requestEndCall(null, null, null);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoiceCallStateHolder voiceCallStateHolder) {
            invoke2(voiceCallStateHolder);
            return Unit.INSTANCE;
        }
    }
}
