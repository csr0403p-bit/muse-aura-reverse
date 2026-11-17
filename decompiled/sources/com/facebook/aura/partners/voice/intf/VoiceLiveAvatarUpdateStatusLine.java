package com.facebook.aura.partners.voice.intf;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7Bq;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VoiceLiveAvatarUpdateStatusLine {
    public static final int $stable = 8;
    public final BLG<VoiceLiveAvatarUpdateStatus> _status;
    public HoC closingJob;
    public final C3UX scope;
    public final C1BN<VoiceLiveAvatarUpdateStatus> status;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.intf.VoiceLiveAvatarUpdateStatusLine$close$1", f = "VoiceLiveAvatarUpdateStatus.kt", l = {75}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceLiveAvatarUpdateStatusLine$close$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceLiveAvatarUpdateStatus $closingStatus;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$closingStatus = voiceLiveAvatarUpdateStatus;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceLiveAvatarUpdateStatusLine.this.new AnonymousClass1(this.$closingStatus, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(3000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (VoiceLiveAvatarUpdateStatusLine.this._status.A6e(this.$closingStatus, null)) {
                CFK.A03(VoiceLiveAvatarUpdateStatusKt.liveAvatarStatusKind(this.$closingStatus), VoiceLiveAvatarUpdateStatusKt.TAG, "live_avatar.status_line.hidden kind=%s why=closing_expired");
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public VoiceLiveAvatarUpdateStatusLine(C3UX c3ux) {
        C7384Etj.A0Y(c3ux, 0);
        this.scope = c3ux;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._status = c9286GCnA13;
        this.status = C3cG.A11(c9286GCnA13);
    }

    public final synchronized void close(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus) {
        C7384Etj.A0Y(voiceLiveAvatarUpdateStatus, 0);
        HoC hoC = this.closingJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        setStatus(voiceLiveAvatarUpdateStatus, "close");
        this.closingJob = AnonymousClass001.A11(new AnonymousClass1(voiceLiveAvatarUpdateStatus, null), this.scope);
    }

    public final synchronized void hide() {
        HoC hoC = this.closingJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.closingJob = null;
        setStatus(null, "hide");
    }

    public final synchronized void showUpdating() {
        HoC hoC = this.closingJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        setStatus(VoiceLiveAvatarUpdateStatus.UPDATING, "show");
    }

    private final void setStatus(VoiceLiveAvatarUpdateStatus voiceLiveAvatarUpdateStatus, String str) {
        String str2;
        VoiceLiveAvatarUpdateStatus value = this._status.getValue();
        this._status.Af8(voiceLiveAvatarUpdateStatus);
        if (value == null) {
            if (voiceLiveAvatarUpdateStatus == null) {
                return;
            } else {
                str2 = "shown";
            }
        } else if (voiceLiveAvatarUpdateStatus == null) {
            str2 = "hidden";
            voiceLiveAvatarUpdateStatus = value;
        } else {
            str2 = value == voiceLiveAvatarUpdateStatus ? "kept" : "replaced";
        }
        CFK.A01(str2, VoiceLiveAvatarUpdateStatusKt.liveAvatarStatusKind(voiceLiveAvatarUpdateStatus), str, VoiceLiveAvatarUpdateStatusKt.TAG, "live_avatar.status_line.%s kind=%s why=%s");
    }

    public final C1BN<VoiceLiveAvatarUpdateStatus> getStatus() {
        return this.status;
    }
}
