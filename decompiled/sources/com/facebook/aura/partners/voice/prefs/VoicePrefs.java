package com.facebook.aura.partners.voice.prefs;

import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BzK;
import X.C0881AGi;
import X.C20Q;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.C8fm;
import X.CH0;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HyO;
import X.InterfaceC3137BzH;
import android.view.accessibility.CaptioningManager;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoicePrefs {
    public static final float DEFAULT_FOCUS_Y = 0.5f;
    public static final int GREETING_DELAY_MAX_MS = 5000;
    public static final int GREETING_DELAY_MIN_MS = 0;
    public static final int GREETING_DELAY_STEP_MS = 250;
    public static final VoicePrefs INSTANCE = new VoicePrefs();
    public static final String KEY_ACCESSORY_IDLE_FOCUS_Y = "accessory_idle_focus_y";
    public static final String KEY_ACCESSORY_IDLE_PATH = "accessory_idle_path";
    public static final String KEY_AVATAR_EXPANDED_VIEW = "avatar_expanded_view";
    public static final String KEY_BACKGROUNDING_ENABLED = "backgrounding_enabled";
    public static final String KEY_CALL_PORTRAIT_AVATAR = "call_portrait_avatar";
    public static final String KEY_CALL_PORTRAIT_CROP_BOTTOM = "call_portrait_crop_bottom";
    public static final String KEY_CALL_PORTRAIT_CROP_TOP = "call_portrait_crop_top";
    public static final String KEY_CAPTIONS_ENABLED = "captions_enabled";
    public static final String KEY_GREETING_DELAY_MS = "greeting_delay_ms";
    public static final String KEY_LIVE_AVATAR_ENABLED = "live_avatar_enabled";
    public static final String KEY_LIVE_AVATAR_UNAVAILABLE_NOTICED = "live_avatar_unavailable_noticed";
    public static final String KEY_SELECTED_VOICE_DESCRIPTION = "selected_voice_description";
    public static final String KEY_SELECTED_VOICE_ID = "selected_voice_id";
    public static final String KEY_SELECTED_VOICE_NAME = "selected_voice_name";
    public static final String KEY_VOICE_ANNOUNCEMENT_CONTROL_EXPOSED = "voice_announcement_control_exposed";
    public static final String KEY_VOICE_ANNOUNCEMENT_SEEN = "voice_announcement_seen";
    public static final String KEY_VOICE_ANNOUNCEMENT_SYNCED_TO_ACCOUNT = "voice_announcement_synced_to_account";
    public static final String KEY_VOICE_NUX_SEEN = "voice_nux_seen";
    public static final String KEY_VOICE_NUX_SYNCED_TO_ACCOUNT = "voice_nux_synced_to_account";
    public static final int LIVE_AVATAR_UNAVAILABLE_NOTICED_MAX = 50;

    /* renamed from: com.facebook.aura.partners.voice.prefs.VoicePrefs$observeAvatarExpandedView$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<VoiceAvatarExpandedView> {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz) {
            super(0);
            this.$userSession = abstractC3358CGz;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final VoiceAvatarExpandedView invoke() {
            return VoicePrefs.INSTANCE.getAvatarExpandedView(this.$userSession);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.prefs.VoicePrefs$observeBackgroundingEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C131471 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131471(AbstractC3358CGz abstractC3358CGz) {
            super(0);
            this.$userSession = abstractC3358CGz;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(VoicePrefs.INSTANCE.getBackgroundingEnabled(this.$userSession));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.prefs.VoicePrefs$observeLiveAvatarEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C131481 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ boolean $default;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131481(AbstractC3358CGz abstractC3358CGz, boolean z) {
            super(0);
            this.$userSession = abstractC3358CGz;
            this.$default = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(VoicePrefs.INSTANCE.getLiveAvatarEnabled(this.$userSession, this.$default));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @DebugMetadata(c = "com.facebook.aura.partners.voice.prefs.VoicePrefs$observePreference$1", f = "VoicePrefs.kt", l = {232}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.prefs.VoicePrefs$observePreference$1, reason: invalid class name and case insensitive filesystem */
    public final class C131491<T> extends AbstractC07127nr implements G0V<HyO<? super T>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $preferenceKey;
        public final /* synthetic */ Function0<T> $read;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.prefs.VoicePrefs$observePreference$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02941 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ InterfaceC3137BzH $listener;
            public final /* synthetic */ C4oT $preferences;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02941(C4oT c4oT, InterfaceC3137BzH interfaceC3137BzH) {
                super(0);
                this.$preferences = c4oT;
                this.$listener = interfaceC3137BzH;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$preferences.Ahk(this.$listener);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131491(AbstractC3358CGz abstractC3358CGz, Function0<? extends T> function0, String str, HtJ<? super C131491> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$read = function0;
            this.$preferenceKey = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C131491 c131491 = new C131491(this.$userSession, this.$read, this.$preferenceKey, htJ);
            c131491.L$0 = obj;
            return c131491;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            final HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C4oT c4oTPrefs = VoicePrefs.INSTANCE.prefs(this.$userSession);
                final String str = this.$preferenceKey;
                final Function0<T> function0 = this.$read;
                InterfaceC3137BzH interfaceC3137BzH = new InterfaceC3137BzH() { // from class: com.facebook.aura.partners.voice.prefs.VoicePrefs$observePreference$1$listener$1
                    @Override // X.InterfaceC3137BzH
                    public final void onSharedPreferenceChanged(C4oT c4oT, String str2) {
                        if (C7384Etj.areEqual(str2, str)) {
                            hyO.AhZ(function0.invoke());
                        }
                    }
                };
                c4oTPrefs.Aa2(interfaceC3137BzH);
                hyO.AhZ(this.$read.invoke());
                C02941 c02941 = new C02941(c4oTPrefs, interfaceC3137BzH);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (C8fm.A00(this, c02941, hyO) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super T> hyO, HtJ<? super Unit> htJ) {
            return ((C131491) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final <T> C20Q<T> observePreference(AbstractC3358CGz abstractC3358CGz, String str, Function0<? extends T> function0) {
        return GDB.A01(AbstractC05643uj.A00(new C131491(abstractC3358CGz, function0, str, null)));
    }

    public final void clearSelectedVoice(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        BzK bzKA9q = selectedVoicePrefs(abstractC3358CGz).A9q();
        bzKA9q.Aae(KEY_SELECTED_VOICE_ID);
        bzKA9q.Aae(KEY_SELECTED_VOICE_NAME);
        bzKA9q.Aae(KEY_SELECTED_VOICE_DESCRIPTION);
        bzKA9q.apply();
    }

    public final void clearVoiceAnnouncementSeen(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.Aae(KEY_VOICE_ANNOUNCEMENT_SEEN);
        bzKA9q.Aae(KEY_VOICE_ANNOUNCEMENT_SYNCED_TO_ACCOUNT);
        bzKA9q.Aae(KEY_VOICE_ANNOUNCEMENT_CONTROL_EXPOSED);
        bzKA9q.apply();
    }

    public final void clearVoiceNuxSeen(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.Aae(KEY_VOICE_NUX_SEEN);
        bzKA9q.Aae(KEY_VOICE_NUX_SYNCED_TO_ACCOUNT);
        bzKA9q.apply();
    }

    public final String currentVmId(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return C3cH.A0a(HatchGatewayPrefsStore.Companion, abstractC3358CGz);
    }

    public final VoiceAvatarExpandedView getAvatarExpandedView(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C4oT c4oTPrefs = prefs(abstractC3358CGz);
        VoiceAvatarExpandedView voiceAvatarExpandedView = null;
        String string = c4oTPrefs.getString(KEY_AVATAR_EXPANDED_VIEW, null);
        Iterator<VoiceAvatarExpandedView> it = VoiceAvatarExpandedView.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VoiceAvatarExpandedView next = it.next();
            if (next.name().equals(string)) {
                voiceAvatarExpandedView = next;
                break;
            }
        }
        VoiceAvatarExpandedView voiceAvatarExpandedView2 = voiceAvatarExpandedView;
        return voiceAvatarExpandedView2 == null ? VoiceAvatarExpandedView.HALF_SCREEN : voiceAvatarExpandedView2;
    }

    public final boolean getBackgroundingEnabled(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getBoolean(KEY_BACKGROUNDING_ENABLED, true);
    }

    public final boolean getCaptionsEnabled(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        Boolean boolACw = prefs(abstractC3358CGz).ACw(KEY_CAPTIONS_ENABLED);
        return boolACw != null ? boolACw.booleanValue() : systemCaptionsEnabled();
    }

    public final int getGreetingDelayMs(AbstractC3358CGz abstractC3358CGz, int i) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        int i2 = prefs(abstractC3358CGz).getInt("greeting_delay_ms", i);
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 5000) {
            return 5000;
        }
        return i2;
    }

    public final boolean getLiveAvatarEnabled(AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getBoolean(KEY_LIVE_AVATAR_ENABLED, z);
    }

    public final boolean hasSeenVoiceAnnouncement(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getBoolean(KEY_VOICE_ANNOUNCEMENT_SEEN, false);
    }

    public final boolean hasSeenVoiceNux(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getBoolean(KEY_VOICE_NUX_SEEN, false);
    }

    public final boolean hasVoiceAnnouncementControlExposure(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getBoolean(KEY_VOICE_ANNOUNCEMENT_CONTROL_EXPOSED, false);
    }

    public final boolean isVoiceAnnouncementSyncedToAccount(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getBoolean(KEY_VOICE_ANNOUNCEMENT_SYNCED_TO_ACCOUNT, false);
    }

    public final boolean isVoiceNuxSyncedToAccount(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getBoolean(KEY_VOICE_NUX_SYNCED_TO_ACCOUNT, false);
    }

    public final float lastAccessoryIdleFocusY(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return prefs(abstractC3358CGz).getFloat(KEY_ACCESSORY_IDLE_FOCUS_Y, 0.5f);
    }

    public final String lastAccessoryIdlePath(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return C4oT.A00(prefs(abstractC3358CGz), KEY_ACCESSORY_IDLE_PATH);
    }

    public final List<String> liveAvatarUnavailableNoticedAvatars(AbstractC3358CGz abstractC3358CGz) {
        List listA0g;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        String strA00 = C4oT.A00(prefs(abstractC3358CGz), KEY_LIVE_AVATAR_UNAVAILABLE_NOTICED);
        if (strA00 == null || (listA0g = C7BY.A0g(strA00, new char[]{'\n'})) == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0g.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return arrayListA0h;
    }

    public final C20Q<VoiceAvatarExpandedView> observeAvatarExpandedView(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return observePreference(abstractC3358CGz, KEY_AVATAR_EXPANDED_VIEW, new AnonymousClass1(abstractC3358CGz));
    }

    public final C20Q<Boolean> observeBackgroundingEnabled(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return observePreference(abstractC3358CGz, KEY_BACKGROUNDING_ENABLED, new C131471(abstractC3358CGz));
    }

    public final C20Q<Boolean> observeLiveAvatarEnabled(AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return observePreference(abstractC3358CGz, KEY_LIVE_AVATAR_ENABLED, new C131481(abstractC3358CGz, z));
    }

    public final void resetVoiceOnboarding(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        clearSelectedVoice(abstractC3358CGz);
        clearVoiceNuxSeen(abstractC3358CGz);
    }

    public final String selectedVoiceDescription(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return C4oT.A00(selectedVoicePrefs(abstractC3358CGz), KEY_SELECTED_VOICE_DESCRIPTION);
    }

    public final String selectedVoiceId(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return C4oT.A00(selectedVoicePrefs(abstractC3358CGz), KEY_SELECTED_VOICE_ID);
    }

    public final String selectedVoiceName(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return C4oT.A00(selectedVoicePrefs(abstractC3358CGz), KEY_SELECTED_VOICE_NAME);
    }

    public final void setBackgroundingEnabled(AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        setBackgroundingEnabled(((CH0) abstractC3358CGz).A01, z);
    }

    public final void setCaptionsEnabled(AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.A0A(KEY_CAPTIONS_ENABLED, z);
        bzKA9q.apply();
    }

    public final void setGreetingDelayMs(AbstractC3358CGz abstractC3358CGz, int i) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        if (i < 0) {
            i = 0;
        } else if (i > 5000) {
            i = 5000;
        }
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.AYo("greeting_delay_ms", i);
        bzKA9q.apply();
    }

    public final void setLiveAvatarEnabled(AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.A0A(KEY_LIVE_AVATAR_ENABLED, z);
        bzKA9q.apply();
    }

    public final void setVoiceAnnouncementControlExposed(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C3cI.A1H(prefs(abstractC3358CGz).A9q(), KEY_VOICE_ANNOUNCEMENT_CONTROL_EXPOSED);
    }

    public final void setVoiceAnnouncementSeen(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C3cI.A1H(prefs(abstractC3358CGz).A9q(), KEY_VOICE_ANNOUNCEMENT_SEEN);
    }

    public final void setVoiceAnnouncementSyncedToAccount(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C3cI.A1H(prefs(abstractC3358CGz).A9q(), KEY_VOICE_ANNOUNCEMENT_SYNCED_TO_ACCOUNT);
    }

    public final void setVoiceNuxSeen(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C3cI.A1H(prefs(abstractC3358CGz).A9q(), KEY_VOICE_NUX_SEEN);
    }

    public final void setVoiceNuxSyncedToAccount(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C3cI.A1H(prefs(abstractC3358CGz).A9q(), KEY_VOICE_NUX_SYNCED_TO_ACCOUNT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4oT prefs(AbstractC3358CGz abstractC3358CGz) {
        return AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, VoiceUserPrefStore.INSTANCE);
    }

    private final C4oT selectedVoicePrefs(AbstractC3358CGz abstractC3358CGz) {
        return AuraVMPrefs.INSTANCE.get(currentVmId(abstractC3358CGz), VoiceVMPrefStore.INSTANCE);
    }

    private final boolean systemCaptionsEnabled() {
        CaptioningManager captioningManager = (CaptioningManager) C3cG.A06().getSystemService(CaptioningManager.class);
        return captioningManager != null && captioningManager.isEnabled();
    }

    public final <T> T callPortraitCrop(AbstractC3358CGz abstractC3358CGz, String str, G0V<? super Integer, ? super Integer, ? extends T> g0v) {
        AnonymousClass005.A0x(abstractC3358CGz, str, g0v);
        C4oT c4oTPrefs = prefs(abstractC3358CGz);
        if (!str.equals(c4oTPrefs.getString(KEY_CALL_PORTRAIT_AVATAR, null))) {
            return null;
        }
        int i = c4oTPrefs.getInt(KEY_CALL_PORTRAIT_CROP_TOP, -1);
        int i2 = c4oTPrefs.getInt(KEY_CALL_PORTRAIT_CROP_BOTTOM, -1);
        if (i < 0 || i2 < 0) {
            return null;
        }
        return g0v.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final void markLiveAvatarUnavailableNoticed(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        List<String> listLiveAvatarUnavailableNoticedAvatars = liveAvatarUnavailableNoticedAvatars(abstractC3358CGz);
        if (listLiveAvatarUnavailableNoticedAvatars.contains(str)) {
            return;
        }
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.AYr(KEY_LIVE_AVATAR_UNAVAILABLE_NOTICED, C3cH.A0e(PairsDiscretionDocument.TERMINATOR, AbstractC0878AGe.A0e(AbstractC0878AGe.A0Q(str, listLiveAvatarUnavailableNoticedAvatars), 50)));
        bzKA9q.apply();
    }

    public final void setAvatarExpandedView(AbstractC3358CGz abstractC3358CGz, VoiceAvatarExpandedView voiceAvatarExpandedView) {
        AnonymousClass003.A0u(abstractC3358CGz, voiceAvatarExpandedView);
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.AYr(KEY_AVATAR_EXPANDED_VIEW, voiceAvatarExpandedView.name());
        bzKA9q.apply();
    }

    public final void setCallPortraitCrop(AbstractC3358CGz abstractC3358CGz, String str, int i, int i2) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.AYr(KEY_CALL_PORTRAIT_AVATAR, str);
        bzKA9q.AYo(KEY_CALL_PORTRAIT_CROP_TOP, i);
        bzKA9q.AYo(KEY_CALL_PORTRAIT_CROP_BOTTOM, i2);
        bzKA9q.apply();
    }

    public final void setLastAccessoryIdle(AbstractC3358CGz abstractC3358CGz, String str, float f) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        BzK bzKA9q = prefs(abstractC3358CGz).A9q();
        bzKA9q.AYr(KEY_ACCESSORY_IDLE_PATH, str);
        BzK.A05(bzKA9q);
        bzKA9q.A00.put(KEY_ACCESSORY_IDLE_FOCUS_Y, Float.valueOf(f));
        bzKA9q.apply();
    }

    public final void setSelectedVoice(AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3) {
        AnonymousClass005.A14(abstractC3358CGz, str, str2, str3);
        BzK bzKA9q = selectedVoicePrefs(abstractC3358CGz).A9q();
        bzKA9q.AYr(KEY_SELECTED_VOICE_ID, str);
        bzKA9q.AYr(KEY_SELECTED_VOICE_NAME, str2);
        bzKA9q.AYr(KEY_SELECTED_VOICE_DESCRIPTION, str3);
        bzKA9q.apply();
    }

    private final C4oT prefs(String str) {
        return AuraUserPrefs.INSTANCE.get(str, VoiceUserPrefStore.INSTANCE);
    }

    public final void setBackgroundingEnabled(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA9q = AuraUserPrefs.INSTANCE.get(str, VoiceUserPrefStore.INSTANCE).A9q();
        bzKA9q.A0A(KEY_BACKGROUNDING_ENABLED, z);
        bzKA9q.apply();
    }
}
