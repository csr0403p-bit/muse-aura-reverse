package com.facebook.aura.partners.voice.shortcut;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C3UX;
import X.C7mU;
import X.EnumC10460Hji;
import X.F31;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.facebook.aura.partners.voice.intf.BackgroundCallAvailability;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class VoiceCallShortcutActivity extends ComponentActivity {
    public static final Companion Companion = new Companion();
    public static final String EXTRA_SHORTCUT_ID = "shortcut_id";

    @DebugMetadata(c = "com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity$onCreate$1", f = "VoiceCallShortcutActivity.kt", l = {42}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity$onCreate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceCallShortcutActivity.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    VoiceCallShortcutActivity voiceCallShortcutActivity = VoiceCallShortcutActivity.this;
                    this.label = 1;
                    if (voiceCallShortcutActivity.startCallWhenSignedIn(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                VoiceCallShortcutActivity.this.finish();
                return Unit.INSTANCE;
            } catch (Throwable th) {
                VoiceCallShortcutActivity.this.finish();
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceCallShortcutActivity.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity", f = "VoiceCallShortcutActivity.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures, 72, 80, 82}, m = "startCallWhenSignedIn", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity$startCallWhenSignedIn$1, reason: invalid class name and case insensitive filesystem */
    public final class C133251 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C133251(HtJ<? super C133251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallShortcutActivity.this.startCallWhenSignedIn(this);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackgroundCallAvailability.values().length];
            try {
                AnonymousClass002.A13(BackgroundCallAvailability.AVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BackgroundCallAvailability.MIC_PERMISSION_REQUIRED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BackgroundCallAvailability.SETUP_REQUIRED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BackgroundCallAvailability.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(BackgroundCallAvailability.BUSY, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(BackgroundCallAvailability.UNSUPPORTED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer feedback(com.facebook.aura.partners.voice.intf.BackgroundCallAvailability r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L14
            int r0 = r1.ordinal()
            switch(r0) {
                case -1: goto L14;
                case 0: goto L12;
                case 1: goto L14;
                case 2: goto Le;
                case 3: goto L18;
                case 4: goto L18;
                case 5: goto L18;
                default: goto L9;
            }
        L9:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Le:
            r0 = 2131890389(0x7f1210d5, float:1.9415468E38)
            goto L1b
        L12:
            r0 = 0
            return r0
        L14:
            r0 = 2131890392(0x7f1210d8, float:1.9415475E38)
            goto L1b
        L18:
            r0 = 2131890390(0x7f1210d6, float:1.941547E38)
        L1b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity.feedback(com.facebook.aura.partners.voice.intf.BackgroundCallAvailability):java.lang.Integer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startCallWhenSignedIn(X.HtJ<? super kotlin.Unit> r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutActivity.startCallWhenSignedIn(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (bundle != null || launchIntentForPackage == null) {
            finish();
            return;
        }
        C7mU.A00().A01().A05(this, launchIntentForPackage.addFlags(268435456));
        AnonymousClass001.A1J(new AnonymousClass1(null), F31.A00(this));
    }
}
