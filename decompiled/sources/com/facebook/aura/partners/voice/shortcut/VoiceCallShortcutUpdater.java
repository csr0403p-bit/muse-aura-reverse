package com.facebook.aura.partners.voice.shortcut;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C3UX;
import X.C3cH;
import X.C7384Etj;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class VoiceCallShortcutUpdater implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutUpdater$update$1", f = "VoiceCallShortcutHook.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.shortcut.VoiceCallShortcutUpdater$update$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public int label;
        public final /* synthetic */ VoiceCallShortcutUpdater this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, VoiceCallShortcutUpdater voiceCallShortcutUpdater, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.this$0 = voiceCallShortcutUpdater;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    if (VoiceGating.INSTANCE.isCallShortcutEnabled()) {
                        VoiceCallShortcut voiceCallShortcut = VoiceCallShortcut.INSTANCE;
                        Context context = this.$context;
                        AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                        this.label = 1;
                        if (voiceCallShortcut.publish(context, abstractC3358CGz, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        VoiceCallShortcut.INSTANCE.cleanup();
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A("VoiceCallShortcut", "Could not update the call shortcut", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void update(Context context) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass001.A1J(new AnonymousClass1(context, this, null), this.scope);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final class Companion {
        public final VoiceCallShortcutUpdater getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceCallShortcutUpdater) abstractC3358CGz.A03(VoiceCallShortcutUpdater.class, new VoiceCallShortcutUpdater$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceCallShortcutUpdater(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0w();
    }

    public /* synthetic */ VoiceCallShortcutUpdater(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
